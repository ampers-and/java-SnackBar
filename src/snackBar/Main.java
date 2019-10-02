package snackBar;

public class Main
{
    public static void main(String[] args)
    {
        //Customers
        Customer custJane = new Customer("Jane", 45.25);
        Customer custBob = new Customer("Bob", 33.14);

        //Vending Machines
        VendingMachine vmfood = new VendingMachine("Food");
        VendingMachine vmdrink = new VendingMachine("Drink");
        VendingMachine vmoffice = new VendingMachine("Office");

        //Snacks
        Snack snackChips = new Snack("Chips", 36, 1.75, vmfood.getId());
        Snack snackChocolate = new Snack("Chocolate Bar", 36, 1.00, vmfood.getId());
        Snack snackPretzels = new Snack("Pretzels", 30, 2.00, vmfood.getId());

        Snack snackSoda = new Snack("Soda", 24, 2.50, vmdrink.getId());
        Snack snackWater = new Snack("Water", 20, 2.75, vmdrink.getId());

        //Processing
        
        //id check
        System.out.println("**** Id Check ****");
        System.out.println(custJane.getName() + " " + custJane.id);
        System.out.println(custBob.getName() + " " + custBob.id);
        System.out.println(vmfood.getName() + " " + vmfood.getId());
        System.out.println(vmdrink.getName() + " " + vmdrink.getId());
        System.out.println(vmoffice.getName() + " " + vmoffice.getId());
        System.out.println(snackChips.getName() + " " + snackChips.getId());
        System.out.println(snackChocolate.getName() + " " + snackChocolate.getId());
        System.out.println(snackPretzels.getName() + " " + snackPretzels.getId());
        System.out.println(snackSoda.getName() + " " + snackSoda.getId());
        System.out.println(snackWater.getName() + " " + snackWater.getId());

        //1 Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        System.out.println();
        System.out.println("** Processing 1 **");
        System.out.println("Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.");
        
        double cost = snackSoda.getTotalCost(3);
        custJane.buyGivenTotalCost(cost);
        snackSoda.buySnack(3);
        
        System.err.println("Jane Cash On Hand: " + custJane.getCashOnHand());
        System.out.println("Soda Quantity:" + snackSoda.getQuantity());

        //2 Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        System.out.println();
        System.out.println("** Processing 2 **");
        System.out.println("Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.");
        
        double cost2 = snackPretzels.getTotalCost(1);
        custJane.buyGivenTotalCost(cost2);
        snackPretzels.buySnack(1);
        
        System.err.println("Jane Cash On Hand: " + custJane.getCashOnHand());
        System.out.println("Pretzels Quantity:" + snackPretzels.getQuantity());

        //3 Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        System.out.println();
        System.out.println("** Processing 3 **");
        System.out.println("Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.");
        
        double cost3 = snackSoda.getTotalCost(2);
        custBob.buyGivenTotalCost(cost3);
        snackSoda.buySnack(2);
        
        System.err.println("Bob Cash On Hand: " + custBob.getCashOnHand());
        System.out.println("Soda Quantity:" + snackSoda.getQuantity());

        //4 Customer 1 finds $10. Print Customer 1 Cash on Hand.
        System.out.println();
        System.out.println("** Processing 4 **");
        System.out.println("Customer 1 finds $10. Print Customer 1 Cash on Hand.");

        custJane.addCash(10.00);
        System.out.println("Jane Cash On Hand: " + custJane.getCashOnHand());

        //5 Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        System.out.println();
        System.out.println("** Processing 5 **");
        System.out.println("Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.");
        
        double cost5 = snackChocolate.getTotalCost(1);
        custJane.buyGivenTotalCost(cost5);
        snackChocolate.buySnack(1);
        
        System.err.println("Jane Cash On Hand: " + custJane.getCashOnHand());
        System.out.println("Chocolate Bar Quantity:" + snackChocolate.getQuantity());

        //6 Add 12 more items to snack 3. Print quantity of snack 3.
        System.out.println();
        System.out.println("** Processing 6 **");
        System.out.println("Add 12 more items to snack 3. Print quantity of snack 3.");

        snackPretzels.addQuantity(12);
        System.out.println("Pretzels Quantity:" + snackPretzels.getQuantity());

        //7 Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        System.out.println();
        System.out.println("** Processing 7 **");
        System.out.println("Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.");
        
        double cost7 = snackPretzels.getTotalCost(3);
        custBob.buyGivenTotalCost(cost7);
        snackPretzels.buySnack(3);
        
        System.err.println("Bob Cash On Hand: " + custBob.getCashOnHand());
        System.out.println("Pretzels Quantity:" + snackPretzels.getQuantity());

        //Stretch
        System.err.println();
        System.out.println("**** Snacks ****");

        System.out.println(snackChips.toString());
        System.out.println(snackChocolate.toString());
        System.out.println(snackPretzels.toString());
        System.out.println(snackSoda.toString());
        System.out.println(snackWater.toString());





    }
}