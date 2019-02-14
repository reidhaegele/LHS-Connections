package com.example.helloworld.controllers;

import com.example.helloworld.model.User;
import com.example.helloworld.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping(value = "")
public class HomePageController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        //upperclassmen
        UserData.add(new User("jadejade", "password", "12", "19jadewiley@lindberghschools.ws", "jade", "is cool", new ArrayList<String>(Arrays.asList("Programming", "Biology"))));
        UserData.add(new User("benrieth19", "password", "12", "19benriethmeier@lindberghschools.ws", "Ben", "Riethmeier", new ArrayList<String>(Arrays.asList("Physics", "Programming", "Language", "Literature", "General English"))));
        UserData.add(new User("REID_HAEGELE", "password", "11", "20reidhaegele@lindberghschools.ws", "Reid", "", new ArrayList<String>(Arrays.asList("Algebra", "Government"))));
        UserData.add(new User("peterkorenak", "password", "12", "19peterkorenak@lindberghschools.ws", "", "", new ArrayList<String>(Arrays.asList("Programming", "German", "Physics", "Calculus"))));
        UserData.add(new User("jCourson", "password", "12", "19joncourson@lindberghschools.ws", "jon", "courson", new ArrayList<String>(Arrays.asList("Biology"))));
        UserData.add(new User("ronbot", "password", "12", "19ronaldhosang@lindberghschools.ws", "Ron", "Hosang", new ArrayList<String>(Arrays.asList("Networking", "Web Design", "Programming"))));
        UserData.add(new User("netguysam", "password", "12", "19samuelweik@lindberghschools.ws", "sam", "", new ArrayList<String>(Arrays.asList("Networking", "Web Design", "Digital Electronics"))));
        UserData.add(new User("JoshDavis", "password", "12", "19joshuadavis@lindberghschools.ws", "Joshua", "D.", new ArrayList<String>(Arrays.asList(""))));
        UserData.add(new User("misshyde", "password", "12", "19mariahyde@lindberghschools.ws", "Maria", "Hyde", new ArrayList<String>(Arrays.asList("Literature", "Language", "General English"))));
        UserData.add(new User("av5h", "password", "12", "19augusthummert@lindberghschools.ws", "auggie", "", new ArrayList<String>(Arrays.asList("Programming"))));
        //underclassmen
        UserData.add(new User("suzyQ", "password", "9", "22susangeyer@lindberghschools.ws", "Susan", "Geyer", new ArrayList<String>(Arrays.asList(""))));
        UserData.add(new User("lilMary", "if you think about it 'password' is french for 'not a sword' and that's pretty deep", "9", "22mariannelittles@lindberghschools.ws", "mary", "", new ArrayList<String>(Arrays.asList(""))));
        UserData.add(new User("i_hate_math", "password", "9", "22jasonwolfard@lindberghschools.ws", "Jason", "Wolfard", new ArrayList<String>(Arrays.asList(""))));
        UserData.add(new User("xJones", "password", "10", "21xavierjones@lindberghschools.ws", "X", "", new ArrayList<String>(Arrays.asList("Spanish"))));
        UserData.add(new User("AnchorsAweigh", "password", "10", "21jackkorenak@lindberghschools.ws", "Jack", "K.", new ArrayList<String>(Arrays.asList(""))));

        model.addAttribute("title", "Users");
        model.addAttribute("Users", UserData.getAll());
        return "redirect:login";
    }
}