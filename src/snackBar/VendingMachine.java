package snackBar;

public class VendingMachine {
    
    // variables
    private static int maxId = 0;
    private int id;
    private String name;

    //constructor
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
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

}