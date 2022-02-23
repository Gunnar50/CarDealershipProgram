/**
 * CarToBuy is a subclass of the superclass Car
 * which inherit some of its methods (CustomerName)
 *
 * @author Gustavo Passarella
 * @version 2.0
 */
package CarProgram;
public class CarToBuy extends Car
{
    // instance variables
    private int price;

    private int registrationYear;

    private int mileage;

    private boolean sold;

    /**
     * Constructor for objects of class CarToBuy defines
     * four parameters, 1 by a superclass and the other 3
     * by parameters
     * Sold is set to false.
     */
    public CarToBuy(String description, int thePrice, int theRegistrationYear, int theMileage)
    {
        super(description);
        price = thePrice;
        registrationYear = theRegistrationYear;
        mileage = theMileage;
        sold = false;
    }

    /**
     * Four different accessor methods to return what
     * is stored in their variables.
     * Different data type
     */
    public int getPrice()
    {
        return price;
    }

    public int getRegistrationYear()
    {
        return registrationYear;
    }

    public int getMileage()
    {
        return mileage;
    }

    public boolean getStatus()
    {
        return sold;
    }


    /**
     * A method to change a car's price, with a condition
     * to check if the car has been sold.
     * Print the new price if car was not sold yet.
     */
    public void changePrice(int newPrice)
    {
        if(sold){
            System.out.println("The " + getDescription() + " car has already been sold, the price can not be changed");
        } else {
            price = newPrice;
            System.out.println("The " + getDescription() + " car has changed its price to Â£" + price + ".");
        }
    }

    /**
     * A method to buy a car
     * which check if the car has been sold and print the corresponding
     * message.
     * If the car is available, it will change the customer name for the new customer
     * and set sold to true
     */
    public void buyCar(String Customer_Name)
    {
        if(sold){
            System.out.println("The " + getDescription() + " car is not for sale.");
        } else {
            newCustomerName(Customer_Name);
            sold = true;
            System.out.println(Customer_Name + " has bought the car.");
        }
    }

    /**
     * A method which calls the method from superclass
     * Check if sold is true or false and display the details.
     */
    public void displayDetails()
    {
        super.displayDetails();
        if(!sold){
            System.out.println("For sale!");
            System.out.println("Price: Â£" + price);
            System.out.println("Registration Year: " + registrationYear);
            System.out.println("Mileage: " + mileage + " miles");
        } else {
            System.out.println("The " + getDescription() + " car is not for sale.");
        }
        //System.out.println("------------------------------");
    }

}
