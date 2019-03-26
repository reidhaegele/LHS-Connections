package com.example.helloworld.model;

public class Item
{
    private String serNum;
    private String modelNum;
    private String cost;
    private String price;
    private String dollarVar;
    private String invSoldOn;
    private String soldTo;
    private String shippedTo;
    private String warrantyStart;
    private String spiff;
    private String spiffTo;
    private String freightIn;
    private String freightOut;

    public Item(String serNum)
    {
        this.serNum = serNum;
    }

    public Item(String serNum, String modelNum, String cost, String price, String dollarVar, String invSoldOn, String soldTo, String shippedTo, String warrantyStart, String spiff, String spiffTo, String freightIn, String freightOut) {
        this.serNum = serNum;
        this.modelNum = modelNum;
        this.cost = cost;
        this.price = price;
        this.dollarVar = dollarVar;
        this.invSoldOn = invSoldOn;
        this.soldTo = soldTo;
        this.shippedTo = shippedTo;
        this.warrantyStart = warrantyStart;
        this.spiff = spiff;
        this.spiffTo = spiffTo;
        this.freightIn = freightIn;
        this.freightOut = freightOut;
    }

    public String getModelNum() { return modelNum; }

    public void setModelNum(String modelNum)
    {
        this.modelNum = modelNum;
    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public String getCost()
    {
        return cost;
    }

    public void setCost(String cost)
    {
        this.cost = cost;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getDollarVar()
    {
        return dollarVar;
    }

    public void setDollarVar(String dollarVar)
    {
        this.dollarVar = dollarVar;
    }

    public String getInvSoldOn()
    {
        return invSoldOn;
    }

    public void setInvSoldOn(String invSoldOn)
    {
        this.invSoldOn = invSoldOn;
    }

    public String getSoldTo()
    {
        return soldTo;
    }

    public void setSoldTo(String soldTo)
    {
        this.soldTo = soldTo;
    }

    public String getShippedTo()
    {
        return shippedTo;
    }

    public void setShippedTo(String shippedTo)
    {
        this.shippedTo = shippedTo;
    }

    public String getWarrantyStart()
    {
        return warrantyStart;
    }

    public void setWarrantyStart(String warrantyStart)
    {
        this.warrantyStart = warrantyStart;
    }

    public String getSpiff()
    {
        return spiff;
    }

    public void setSpiff(String spiff)
    {
        this.spiff = spiff;
    }

    public String getSpiffTo()
    {
        return spiffTo;
    }

    public void setSpiffTo(String spiffTo)
    {
        this.spiffTo = spiffTo;
    }

    public String getFreightIn()
    {
        return freightIn;
    }

    public void setFreightIn(String freightIn)
    {
        this.freightIn = freightIn;
    }

    public String getFreightOut()
    {
        return freightOut;
    }

    public void setFreightOut(String freightOut)
    {
        this.freightOut = freightOut;
    }

    public String[] getAll()
    {
        String[] out = {serNum, modelNum,  cost,  price,  dollarVar,  invSoldOn,  soldTo,  shippedTo,  warrantyStart,  spiff,  spiffTo,  freightIn,  freightOut};
        return out;
    }
}
