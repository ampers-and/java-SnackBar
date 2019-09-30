package snackBar;

public class Customer {
    
    // variables
    private static int maxId = 0;
    public int id;
    private String name;
    private double cashOnHand;

    //constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //methods
    //add cash
    public void addCash(double additionalCash)
    {
        cashOnHand += additionalCash;
    }

    //buy given total cash used in purchase
    public void buyGivenTotalCost(double totalCost)
    {
        cashOnHand -= totalCost;
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

    //get cash on hand
    public double getCashOnHand()
    {
        return cashOnHand;
    }
}