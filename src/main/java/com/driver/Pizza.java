package com.driver;

public class Pizza {

    private int billPrice;



    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int paperbagprice;
    private boolean isCheeseAded;
    private boolean isToppingAded;
    private boolean isPaperBagAded;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.billPrice=300;
            this.toppingsPrice=120;
        }
        else {
            this.billPrice=400;
            this.toppingsPrice=120;
        }
        this.cheesePrice=80;
        this.paperbagprice=20;
        this.bill= "Base Price Of The Pizza: "+this.billPrice+"\n";

    }

   // public int getPrice(){
   //     return this.billPrice;
    //}

    public int getBillPrice() {
        return this.billPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAded==false){
            billPrice+=cheesePrice;
            isCheeseAded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isToppingAded==false){
            billPrice+=toppingsPrice;
            isToppingAded=true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAded==false){
            billPrice+=paperbagprice;
            isPaperBagAded=true;
        }
    }

    public String getBill(){
        // your code goes here
if (isBillGenerated==false){
    if (isCheeseAded){
       bill+="Extra Cheese Added: "+this.cheesePrice+"\n";
    }
    if (isToppingAded)bill+="Extra Toppings Added: "+this.toppingsPrice+"\n";
    if (isPaperBagAded)bill+="Paperbag Added: "+this.paperbagprice+"\n";
    bill+="Total Price: "+billPrice+"\n";
    isBillGenerated=true;

}
        return this.bill;
    }
}
