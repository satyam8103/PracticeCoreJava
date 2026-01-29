package Pizza_Bill_Generator;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice =100;
    private int extraToppingsAdded =150;
    private int backPack =20;
    public Pizza(Boolean veg){
        this.veg =veg;
        if(this.veg){
            this.price =300;
        }
        else {
            this.price =400;
        }
    }
    public void getPizzaPrice(){
        System.out.println(this.price);
    }
    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }
    public void setExtraToppingsAdded(){
        System.out.println("Extra toppings added");
        this.price+=extraToppingsAdded;
    }
    }

