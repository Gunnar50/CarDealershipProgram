package CarProgram;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


/**
 * Write a description of class CarCompany here.
 *
 * @author Gustavo Passarella
 * @version 1.0
 */
public class CarCompany implements ActionListener
{
    // Frame
    private JFrame frame;
    private int dimensionX = 300;
    private int dimensionY = 380;

    // Labels
    private JLabel price;
    private JLabel year;
    private JLabel mileage;
    private JLabel description;
    private JLabel adminFee;
    private JLabel dailyRate;
    private JLabel customerName;
    private JLabel rentalDate;
    private JLabel returnDate;
    private JLabel nDays;
    private JLabel carNumber;
    private JLabel systemLabel;
    private JLabel returnOrBuyLabel;
    private JLabel rentingLabel;

    //Text Fields
    private JTextField priceBox;
    private JTextField yearBox;
    private JTextField mileageBox;
    private JTextField descriptionBox;
    private JTextField adminFeeBox;
    private JTextField dailyRateBox;
    private JTextField customerNameBox;
    private JTextField rentalDateBox;
    private JTextField returnDateBox;
    private JTextField nDaysBox;
    private JTextField carNumberBox;


    // Buttons
    private JButton addCarBuyB;
    private JButton addCarRentB;
    private JButton buyCarB;
    private JButton rentCarB;
    private JButton returnCarB;
    private JButton displayAllB;
    private JButton clearB;

    ArrayList<Car> carsList = new ArrayList<Car>();

    /**
     * Constructor for objects of class CarCompany
     */
    public CarCompany()
    {
        makeFrame();
    }

    // Frame
    private void makeFrame()
    {
        frame = new JFrame("Car Dealership Company");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        frame.setPreferredSize(new Dimension(700, 420));
        frame.setLocation(200, 200);


        // Text Fields
        priceBox = new JTextField();
        priceBox.setPreferredSize(new Dimension(120, 30));
        yearBox = new JTextField();
        yearBox.setPreferredSize(new Dimension(120, 30));
        mileageBox = new JTextField();
        mileageBox.setPreferredSize(new Dimension(120, 30));
        descriptionBox = new JTextField();
        descriptionBox.setPreferredSize(new Dimension(250, 30));
        adminFeeBox = new JTextField();
        adminFeeBox.setPreferredSize(new Dimension(120, 30));
        dailyRateBox = new JTextField();
        dailyRateBox.setPreferredSize(new Dimension(120, 30));
        customerNameBox = new JTextField();
        customerNameBox.setPreferredSize(new Dimension(180, 30));
        rentalDateBox = new JTextField();
        rentalDateBox.setPreferredSize(new Dimension(92, 30));
        returnDateBox = new JTextField();
        returnDateBox.setPreferredSize(new Dimension(92, 30));
        nDaysBox = new JTextField();
        nDaysBox.setPreferredSize(new Dimension(92, 30));
        carNumberBox = new JTextField();
        carNumberBox.setPreferredSize(new Dimension(180, 30));

        // Labels
        JLabel price = new JLabel("Price:");
        JLabel year = new JLabel("Year:");
        JLabel mileage = new JLabel("Mileage:");
        JLabel description = new JLabel("Description:");
        JLabel adminFee = new JLabel("Admin Fee:");
        JLabel dailyRate = new JLabel("Daily Rate:");
        JLabel customerName = new JLabel("Customer Name:");
        JLabel rentalDate = new JLabel("Rental Date:");
        JLabel returnDate = new JLabel("Return Date:");
        JLabel nDays = new JLabel("Number Of Days:");
        JLabel carNumber = new JLabel("Car Number:");
        JLabel systemLabel = new JLabel("ADD TO THE SYSTEM");
        systemLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        JLabel returnOrBuyLabel = new JLabel("RETURN OR BUY");
        returnOrBuyLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        JLabel rentingLabel = new JLabel("RENT A CAR");
        rentingLabel.setFont(new Font("Calibri", Font.BOLD, 25));

        // Buttons
        addCarBuyB = new JButton("Add Car to Buy");
        addCarBuyB.addActionListener(this);
        addCarRentB = new JButton("Add Car to Rent");
        addCarRentB.addActionListener(this);
        buyCarB = new JButton("Buy Car");
        buyCarB.addActionListener(this);
        rentCarB = new JButton("Rent Car");
        rentCarB.addActionListener(this);
        returnCarB = new JButton("Return Car");
        returnCarB.addActionListener(this);
        displayAllB = new JButton("Display All");
        displayAllB.addActionListener(this);
        clearB = new JButton("Clear");
        clearB.addActionListener(this);



        // Panels
        // First Panel / Frame One
        JPanel frameOne = new JPanel(new FlowLayout()); // FlowLayout for frame one
        JPanel topPanel = new JPanel(new GridLayout(2, 2));
        JPanel MPanel  = new JPanel(new GridLayout(1, 2));
        JPanel MPanel_left = new JPanel(new FlowLayout());
        JPanel MPanel_right = new JPanel(new FlowLayout());
        JPanel MPanel_bottom = new JPanel(new GridLayout(2,2,5,5));
        frameOne.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, Color.BLACK)); // set the vertical line between the two columns
        frameOne.setPreferredSize(new Dimension(dimensionX, dimensionY));
        MPanel.setPreferredSize(new Dimension(260, 170));
        MPanel_bottom.setPreferredSize(new Dimension(260, 60));

        // Top Panel
        frameOne.add(systemLabel); // Add to System Label
        topPanel.add(description); // Description label
        topPanel.add(descriptionBox); // description text field

        //Middle Panel left
        MPanel_left.add(price); // price label
        MPanel_left.add(priceBox); // price text field
        MPanel_left.add(year); // year label
        MPanel_left.add(yearBox); // year text field
        MPanel_left.add(mileage); //mileage label
        MPanel_left.add(mileageBox); // mileage text field

        // Middle panel right
        MPanel_right.add(adminFee); // admin fee label
        MPanel_right.add(adminFeeBox); // admin fee text field
        MPanel_right.add(dailyRate); // daily rate label
        MPanel_right.add(dailyRateBox); // daily rate text field

        // Middle panel bottom
        MPanel_bottom.add(addCarBuyB); // add car to buy button
        MPanel_bottom.add(addCarRentB); // add car to rent button
        MPanel_bottom.add(displayAllB);
        MPanel_bottom.add(clearB);


        // Main left panel / Frame One
        frameOne.add(topPanel);
        frameOne.add(MPanel);
        frameOne.add(MPanel_bottom);
        MPanel.add(MPanel_left);
        MPanel.add(MPanel_right);


        // Second Panel / Frame Two
        JPanel frameTwo = new JPanel(new FlowLayout());
        frameTwo.setPreferredSize(new Dimension(dimensionX, dimensionY));
        frameTwo.add(returnOrBuyLabel);

        // Frame Two Panels
        JPanel frameTwoTop = new JPanel(new FlowLayout()); // layout for each panels
        JPanel frameTwoButtons = new JPanel(new GridLayout(1,2,5,5));
        JPanel frameTwoTop_left = new JPanel(new GridLayout(2,1));
        JPanel frameTwoTop_right = new JPanel(new GridLayout(2,1,0,5));
        JPanel frameTwoBottomLabels = new JPanel(new GridLayout(1,1));
        JPanel frameTwoBottomText = new JPanel(new FlowLayout());
        JPanel frameTwoBottomButtons = new JPanel(new GridLayout(2,2));
        frameTwoTop.setPreferredSize(new Dimension(300, 81)); // dimension for the panels
        frameTwoTop_left.setPreferredSize(new Dimension(100, 65));
        frameTwoTop_right.setPreferredSize(new Dimension(180, 65));
        frameTwoButtons.setPreferredSize(new Dimension(250, 60));
        frameTwoBottomButtons.setPreferredSize(new Dimension(125,60));
        frameTwoTop.setBorder(BorderFactory.createEmptyBorder(10,0,5,0)); // create empty border for spaces
        frameTwoButtons.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0)); // create empty border for spaces
        frameTwoBottomLabels.setBorder(BorderFactory.createEmptyBorder(-1, 0, -1, 0)); // create empty border for spaces
        frameTwoBottomText.setBorder(BorderFactory.createEmptyBorder(-5, 0, 0, 0)); // create empty border for spaces

        frameTwoTop_left.add(carNumber); // car number label
        frameTwoTop_right.add(carNumberBox); // car number text field
        frameTwoTop_left.add(customerName); // customer name label
        frameTwoTop_right.add(customerNameBox); // customer name text field

        frameTwoButtons.add(returnCarB); // return car button
        //frameTwoButtons.add(empty); // add an empty space between the buttons
        frameTwoButtons.add(buyCarB); // buy car button

        frameTwoBottomLabels.add(rentalDate); // rental date label
        frameTwoBottomLabels.add(returnDate); // return date label
        frameTwoBottomLabels.add(nDays); // number of days label
        frameTwoBottomText.add(rentalDateBox); // rental date text field
        frameTwoBottomText.add(returnDateBox); // return date text field
        frameTwoBottomText.add(nDaysBox); // number of days text field
        frameTwoBottomButtons.add(rentCarB); // rent car button


        // Main right panel / Frame Two
        frameTwo.add(frameTwoTop);
        frameTwoTop.add(frameTwoTop_left);
        frameTwoTop.add(frameTwoTop_right);
        frameTwo.add(frameTwoButtons);
        frameTwo.add(rentingLabel);
        frameTwo.add(frameTwoBottomLabels);
        frameTwo.add(frameTwoBottomText);
        frameTwo.add(frameTwoBottomButtons);


        // Add to main frame
        frame.add(frameOne);
        frame.add(frameTwo);
        frame.pack();
        frame.setVisible(true); // set frame to be visible
        frame.setResizable(false); // can not resize frame
    }

     // Getting the text from the text field
    public String getDescription()
    {
        String aDescription = descriptionBox.getText();
        return aDescription;
    }

    public String getCustomerName()
    {
        String aCustomerName = customerNameBox.getText();
        return aCustomerName;
    }

    public Integer getPrice()
    {
        try {
            Integer aPrice = Integer.parseInt(priceBox.getText());
            return aPrice;
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getYear()
    {
        try {
            Integer aYear = Integer.parseInt(yearBox.getText());
            return aYear;
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getMileage()
    {
        try {
            Integer aMileage = Integer.parseInt(mileageBox.getText());
            return aMileage;
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getAdminFee()
    {
        try {
            Integer aAdmin = Integer.parseInt(adminFeeBox.getText());
            return aAdmin;
        } catch (Exception e) {
            return null;
        }


    }

    public Integer getDailyRate()
    {
        try {
            Integer aRate = Integer.parseInt(dailyRateBox.getText());
            return aRate;
        } catch (Exception e) {
            return null;
        }

    }

    public String getRentalDate()
    {
        String aRentalDate = rentalDateBox.getText();
        return aRentalDate;
    }

    public String getReturnDate()
    {
        String aReturnDate = returnDateBox.getText();
        return aReturnDate;
    }

    public Integer getNoDays()
    {
        try {
            Integer aNoDays = Integer.parseInt(nDaysBox.getText());
            return aNoDays;
        } catch (Exception e) {
            return null;
        }

    }

    public Integer getCarNumber()
    {
        try {
            Integer aCarNumber = Integer.parseInt(carNumberBox.getText());
            return aCarNumber;
        } catch (Exception e) {
            return null;
        }

    }

    // Button actions
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        if(command.equals("Add Car to Buy")) {addCarBuy();}
        if(command.equals("Add Car to Rent")) {addCarRent();}
        if(command.equals("Buy Car")) {buyCarButton();}
        if(command.equals("Rent Car")) {rentCarButton();}
        if(command.equals("Return Car")) {returnCarButton();}
        if(command.equals("Display All")) {displayAll();}
        if(command.equals("Clear")) {clear();}
    }


    // Buttons actions
    public void addCarBuy()
    {
        if(getDescription().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                    "The Description field cannot be empty.","Error",
                    JOptionPane.ERROR_MESSAGE);
            descriptionBox.setText("");
        } else if(getPrice() == null){
            JOptionPane.showMessageDialog(frame,
                    "The Price field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            priceBox.setText("");
        } else if(getYear() == null){
            JOptionPane.showMessageDialog(frame,
                    "The Year field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            yearBox.setText("");
        } else if(getMileage() == null){
            JOptionPane.showMessageDialog(frame,
                    "The Mileage field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            mileageBox.setText("");
        } else {
            CarToBuy newCarToBuy = new CarToBuy(getDescription(), getPrice(), getYear(), getMileage());
            carsList.add(newCarToBuy);
            JOptionPane.showMessageDialog(frame, " A new Car to buy was added to the system.");
            descriptionBox.setText("");
            priceBox.setText("");
            yearBox.setText("");
            mileageBox.setText("");
        }
    }

    public void addCarRent()
    {
        if(getDescription().isEmpty()){
            JOptionPane.showMessageDialog(frame,
                    "The Description field cannot be empty.","Error",
                    JOptionPane.ERROR_MESSAGE);
            descriptionBox.setText("");
        } else if(getAdminFee() == null) {
            JOptionPane.showMessageDialog(frame,
                    "The Admin Fee field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            adminFeeBox.setText("");
        } else if(getDailyRate() == null) {
            JOptionPane.showMessageDialog(frame,
                    "The Daily Rate field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            dailyRateBox.setText("");
        } else {
            CarToRent newCarToRent = new CarToRent(getDescription(), getAdminFee(), getDailyRate());
            carsList.add(newCarToRent);
            JOptionPane.showMessageDialog(frame, " A new Car to rent was added to the system.");
            descriptionBox.setText("");
            adminFeeBox.setText("");
            dailyRateBox.setText("");
        }
    }

    public void buyCarButton()
    {
        if (getCarNumber() == null) {
            JOptionPane.showMessageDialog(frame,
                    "The Car Number field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            carNumberBox.setText("");
        } else if(getCarNumber() < 0) {
            JOptionPane.showMessageDialog(frame,
                    "Please enter a valid Car Number","Message",
                    JOptionPane.WARNING_MESSAGE);
            carNumberBox.setText("");
        } else if (getCustomerName().isEmpty()) {
            JOptionPane.showMessageDialog(frame,
                    "The Customer Name field cannot be empty.","Error",
                    JOptionPane.ERROR_MESSAGE);
            customerNameBox.setText("");
        } else {
            try {
                CarToBuy buy_Car = (CarToBuy) carsList.get(getCarNumber());
                buy_Car.buyCar(getCustomerName());
                JOptionPane.showMessageDialog(frame,
                        "Congratulations, " + getCustomerName() + " bought a car!","Message",
                        JOptionPane.INFORMATION_MESSAGE);
                carNumberBox.setText("");
                customerNameBox.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame,
                        "The Car Number does not exist.","Error",
                        JOptionPane.ERROR_MESSAGE);
                carNumberBox.setText("");
            }

        }
    }

    public void rentCarButton()
    {
        if (getCarNumber() == null) {
            JOptionPane.showMessageDialog(frame,
                    "The Car Number field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            carNumberBox.setText("");
        } else if(getCarNumber() < 0) {
            JOptionPane.showMessageDialog(frame,
                    "Please enter a valid Car Number","Message",
                    JOptionPane.WARNING_MESSAGE);
            carNumberBox.setText("");
        } else if (getCustomerName().isEmpty()) {
            JOptionPane.showMessageDialog(frame,
                    "The Customer Name field cannot be empty.","Error",
                    JOptionPane.ERROR_MESSAGE);
            customerNameBox.setText("");
        } else if (getRentalDate().isEmpty()) {
            JOptionPane.showMessageDialog(frame,
                    "The Rental Date field cannot be empty.","Error",
                    JOptionPane.ERROR_MESSAGE);
            rentalDateBox.setText("");
        } else if (getReturnDate().isEmpty()) {
            JOptionPane.showMessageDialog(frame,
                    "The Return Date field cannot be empty.","Error",
                    JOptionPane.ERROR_MESSAGE);
            returnDateBox.setText("");
        } else if (getNoDays() == null) {
            JOptionPane.showMessageDialog(frame,
                    "The Number of Days field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            nDaysBox.setText("");
        } else {
            try {
                CarToRent rent_Car = (CarToRent) carsList.get(getCarNumber());
                rent_Car.rentCar(getCustomerName(), getRentalDate(), getReturnDate(), getNoDays());
                JOptionPane.showMessageDialog(frame,
                        getCustomerName() + " rented a car!","Message",
                        JOptionPane.INFORMATION_MESSAGE);
                carNumberBox.setText("");
                customerNameBox.setText("");
                returnDateBox.setText("");
                rentalDateBox.setText("");
                nDaysBox.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame,
                        "The Car Number does not exist.","Error",
                        JOptionPane.ERROR_MESSAGE);
                carNumberBox.setText("");
            }

        }
    }

    public void returnCarButton()
    {
        if (getCarNumber() == null) {
            JOptionPane.showMessageDialog(frame,
                    "The Car Number field cannot be empty or contain any letters.","Error",
                    JOptionPane.ERROR_MESSAGE);
            carNumberBox.setText("");
        } else if(getCarNumber() < 0) {
            JOptionPane.showMessageDialog(frame,
                    "Please enter a valid Car Number","Message",
                    JOptionPane.WARNING_MESSAGE);
            carNumberBox.setText("");
        } else {
            try {
                CarToRent return_car = (CarToRent) carsList.get(getCarNumber());
                return_car.returnCar();
                carNumberBox.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame,
                        "The Car Number does not exist.","Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public void displayAll()
    {
        System.out.print('\u000C');
        int car_num = 0;
        for(Car car : carsList) {
            System.out.println("---------------------------------");
            System.out.println("Car Number: " + car_num);
            car_num++;
            car.displayDetails();
        }
    }

    public void clear()
    {
        priceBox.setText("");
        yearBox.setText("");
        mileageBox.setText("");
        descriptionBox.setText("");
        adminFeeBox.setText("");
        dailyRateBox.setText("");
        customerNameBox.setText("");
        rentalDateBox.setText("");
        returnDateBox.setText("");
        nDaysBox.setText("");
        carNumberBox.setText("");
    }

}
