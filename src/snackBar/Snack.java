package snackBar;

public class Snack {
    
    // variables
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    //constructor
    public Snack(String name, int quantity, double cost, int vendingId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    //methods
    //set, get id
    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    //set, get name
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //set, get cost
    public void setCost(double cost)
    {
        this.cost= cost;
    }

    public double getCost()
    {
        return cost;
    }

    //set, get vending id
    public void setVendingId(int vendingId)
    {
        this.vendingId = vendingId;
    }

    public int getVendingId()
    {
        return vendingId;
    }

    //get quanttity
    public int getQuantity()
    {
        return quantity;
    }

    //add quantity
    public void addQuantity(int additionalQuantity)
    {
        quantity += additionalQuantity;
    }

    //buy snack
    public void buySnack (int numberBuying)
    {
        quantity -= numberBuying;
    }

    //get total cost
    public double getTotalCost(int buyingQuantity)
    {
        return cost * buyingQuantity;
    }

    //STRETCH
    @Override
    public String toString()
    {
        String vending = "";
        if( vendingId == 1)
        {
            vending = "Food";
        }
        if( vendingId == 2)
        {
            vending = "Drink";
        }
        if( vendingId == 3)
        {
            vending = "Office";
        }

        return "\n" + name + "\n" + "Vending Machine: "  + vending + "\n" + "Quantity: " + quantity + "\n" + "Total Cost of Stock: " + this.getTotalCost(quantity);
    }

}