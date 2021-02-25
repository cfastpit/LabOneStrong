package BusinessLayer;
import DataAccess.CustomerDataManager;

public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    //add
   public void add(){
       CustomerDataManager.add(this);
   }
   //find
   public static Customer find(int id){
        return CustomerDataManager.find(id);
    }
    //return the data
    public static Customer get(int i) {
        return CustomerDataManager.get(i);
    }
    //create
    public static void initialize(){
        CustomerDataManager.initialize();
    }

public static int getNumberOfCustomers() {
        return CustomerDataManager.getNumberOfCustomers();
    }
//get and sets

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID = " + customerID + ", firstName = " + firstName + ", lastName = " + lastName + ", phoneNumber = " + phoneNumber + '}';
    }



}
