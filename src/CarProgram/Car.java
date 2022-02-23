/**
 * The Superclass Car has information about the Description and Customer.
 *
 * @author Gustavo Passarella
 * @version 1.3
 */
package CarProgram;
public class Car
{
    // instance variables for description and customerName

    private String description;

    private String customerName;

    /**
     * Constructor for objects of class Car
     * Description is assigned according to the parameter and Customer to an empty string.
     */
    public Car(String newDescription)
    {
        description = newDescription;
        customerName = "";
    }

    /**
     * Two methods to return data type string
     * with different variables (Description and Customer)
     */
    public String getDescription()
    {
        return description;
    }

    public void getCustomerName()
    {
        if(customerName == ""){
            System.out.println("Error, no customer name is set.");
        } else {
            System.out.println("Customer name is: " + customerName);
        }
    }

    /**
     * This method takes the newName parameter and
     * stores into the variable CustomerName
     */
    public void newCustomerName(String newName)
    {
        customerName = newName;
    }

    /**
     * This method prints one or two statements depending on what is stored in the variables.
     */
    public void displayDetails()
    {
        //System.out.println("------------------------------");
        System.out.println("Description: " + description);
        if(customerName != ""){
            System.out.println("Customer Name: " + customerName);
        }
    }
}
