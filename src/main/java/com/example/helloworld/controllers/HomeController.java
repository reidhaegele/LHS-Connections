package com.example.helloworld.controllers;

import com.example.helloworld.model.Item;
import com.example.helloworld.model.ItemData;
import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


//Math(Algebra, Geometry, Statistics, Trigonometry, Precalculus, Calculus)
//Science(Physics, Chemistry, Biology, Environmental Science, Physical Science)
//Social Studies(World History, U.S. History, Government, Human Geography, Global Politics, Psychology, Sociology)
//Language Arts(General English, Literature, Language)
//Foreign Language(Spanish, French, German)
//Engineering(Principles, Architecture, Digital Electronics, Networking, Web Design, Programming)

@Controller
@RequestMapping(value = "home")
public class HomeController {
    private static String UPLOADED_FOLDER = "C:\\Windows\\temp";
    private MultipartFile file = null;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Items");
        model.addAttribute("Items", ItemData.getAll());
        return "homeofficial";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String index(@RequestParam("sortBy") String sortBy, Model model) {
        Tree users = new Tree(ItemData.getAll().getFirst(), Integer.parseInt(sortBy));
        LinkedList<Item> crud = ItemData.getAll();
        crud.removeFirst();
        for (Item user : crud)
        {
            users.add(user);
        }
        ItemData.items = users.print();
        return "redirect:";
    }


    @PostMapping("/download")
    public String downButton() {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(new File("C:/users/" + System.getProperty("user.name") + "/downloads/dataOut.csv"), true));
            for (Item item : ItemData.getAll()) {
                bw.newLine();
                for (String param : item.getAll()) {
                    bw.write(param + ", ");
                }
            }
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Wrong file path" + e);
        } catch (IOException e) {
            System.out.println("Wrong file format" + e);
        } catch (Exception e) {
            System.out.println(e + " Misc Error");
        }
        return "redirect:";
    }

    @PostMapping("/upload") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:/home/uploadStatus";
        }

        try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            System.out.println(file.getOriginalFilename());
            Path path = Paths.get(UPLOADED_FOLDER + "\\" + file.getOriginalFilename());
            boolean isRegularFile = Files.isRegularFile(path);
            boolean isHidden = Files.isReadable(path);
            boolean isReadable = Files.isReadable(path);
            boolean isExecutable = Files.isExecutable(path);
            boolean isSymbolicLink = Files.isSymbolicLink(path);
            Files.write(path, bytes);
            System.out.println(isRegularFile + " " + isHidden + " " + isReadable + " " + isExecutable + " " + isSymbolicLink);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
            try {
                String line;
                BufferedReader br = new BufferedReader(new FileReader(UPLOADED_FOLDER + "\\" + file.getOriginalFilename()));

                while ((line = br.readLine()) != null) {
                    String[] val = line.split(",");
                    ItemData.add(new Item(val[0], val[1], val[2], val[3], val[4], val[5], val[6], val[7], val[8], val[9], val[10], val[11], val[12]));
                }
                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("Wrong file path" + e);
            } catch (IOException e) {
                System.out.println("Wrong file format" + e);
            } catch (Exception e) {
                System.out.println(e + " Misc Error");
                e.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/home/uploadStatus";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

    @PostMapping("/uploadStatus")
    public String leaveThisPage() {
        return "redirect:";
    }

}