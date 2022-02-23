package CarProgram;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * CarToRent is a subclass of the superclass Car
 * which inherit some of its features.
 *
 * @author Gustavo Passarella
 * @version 2.0
 */
public class CarToRent extends Car
{
    // instance variables
    private JFrame frame;
    private String rentalDate;
    private String returnDate;
    private int adminFee;
    private int numberOfDays;
    private int dailyRate;
    private int total;
    private boolean onLoan;
    private int amountPay;
    private ArrayList<Car> Cars;

    /**
     * Constructor for objects of class CarToRent defines variables from the parameters
     * and within the contructor.
     */
    public CarToRent(String description, int theAdminFee, int theDailyRate)
    {
        super(description);
        adminFee = theAdminFee;
        dailyRate = theDailyRate;
        rentalDate = "";
        returnDate = "";
        numberOfDays = 0;
        total = 0;
        onLoan = false;
        Cars = new ArrayList<Car>();
    }

    /**
     * Many different accessors methods perform the same funciton
     * return data in different data types.
     */
    public int getAdminFee()
    {
        return adminFee;
    }

    public int getDailyRate()
    {
        return dailyRate;
    }

    public String getRentalDate()
    {
        return rentalDate;
    }

    public String getReturnDate()
    {
        return returnDate;
    }

    public int getNumberOfDays()
    {
        return numberOfDays;
    }

    public int getTotal()
    {
        return total;
    }

    public boolean getStatus()
    {
        return onLoan;
    }


    /**
     * A method  check the newDailyRate parameter
     * to see if it is higher than zero
     * and assign to the dailyRate.
     */
    public void setDailyRate(int newDailyRate)
    {
        if(newDailyRate > 0){
            dailyRate = newDailyRate;
        } else {
            System.out.println("Daily rate should be higher than 0.");
        }
    }

    /**
     * A method  check the newAdminFee parameter
     * to see if it is higher than zero
     * and assign to the adminFee.
     */
    public void setAdminFee(int newAdminFee)
    {
        if(newAdminFee > 0){
            adminFee = newAdminFee;
        } else {
            System.out.println("Admin Fee should be more than 0.");
        }
    }


    /**
     * Method to rent a car which check if the car is already on loan.
     * A print statement will tell the customer when the car will be returned.
     *
     * Otherwise all parameters are updated.
     * A new variable amountPay is introduced to calculate the amount the customer needs to pay
     * and the total is calculated.
     */
    public void rentCar(String customer_Name, String newRentalDate, String newReturnDate, int newNumberOfDays)
    {
        if(onLoan == true){
            System.out.println("The " + getDescription() + " car is not available for loan.");
            System.out.println("Car should be returned on " + returnDate + ".");
        } else {
            rentalDate = newRentalDate;
            returnDate = newReturnDate;
            numberOfDays = newNumberOfDays;
            newCustomerName(customer_Name);
            onLoan = true;

            amountPay = (dailyRate * numberOfDays) + adminFee;
            total = total + amountPay;

            System.out.println(customer_Name + " rented a car for " + numberOfDays + " day(s).");
            System.out.println("Total amount to pay is Â£" + amountPay + ".");
            System.out.println("The car should be returned on the " + returnDate + ".");
            Car car = new Car(getDescription());
            Cars.add(car);
        }
    }

    public void printList()
    {
        for(Car car : Cars) {
            car.displayDetails();
        }
    }

    /**
     * A method to return a rented car
     * if loan is true it will reset all parameters to original state.
     * Otherwise a message is printed.
     */
    public void returnCar()
    {
        if(onLoan == true){
            JOptionPane.showMessageDialog(frame,
                    "Thank you for returning the " + getDescription() + " car.","Message",
                    JOptionPane.INFORMATION_MESSAGE);
            //System.out.println("Thank you for returning the " + getDescription() + " car.");
            newCustomerName("");
            numberOfDays = 0;
            rentalDate = "";
            returnDate = "";
            onLoan = false;
        } else {
            JOptionPane.showMessageDialog(frame,
                    "The " + getDescription() + " car is avalable to rent.","Message",
                    JOptionPane.INFORMATION_MESSAGE);
            //System.out.println("The " + getDescription() + " car is avalable to rent.");
        }
    }


    /**
     * A method to print the total price accumulated so far
     */
    public void printTotalPrice()
    {
        System.out.println("Description: " + getDescription() + ".");
        System.out.println("Total accumulated: " + total + ".");
    }


    /**
     * Method calls a method from the superclass Car
     * check if the car is on loan and print its details
     */
    public void displayDetails()
    {
        super.displayDetails();
        if(onLoan == true){
            System.out.println("The car is on loan.");
            System.out.println("Rental date: " + rentalDate + ".");
            System.out.println("Return date: " + returnDate + ".");
            System.out.println("The car should be returned in " + numberOfDays + " day(s).");
        } else {
            System.out.println("The car is available for rent.");
            System.out.println("Daily Rate: " + dailyRate + ".");
            System.out.println("Admin Fee " + adminFee + ".");
        }
        //System.out.println("------------------------------");
    }




}
