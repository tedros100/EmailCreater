import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String company = "xyz.com";

    //constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        // Call a method asking for the department return the department
        this.department = setDepartment();
        System.out.println("Department " + this.department);
        // call password generator
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password " + this.password);
        // generate fname.lastname@department.componey.com
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
        System.out.println("Your Email is : " + email);
    }
    // Ask for the Department
    public String setDepartment() {
        System.out.println("Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:  ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {
            return "sales";
        } else if(depChoice == 2) {
            return "Dev";
        } else if (depChoice == 3){
            return "Accounting";
        } else {
            return "";
        }
    }
    //Generate a random Password
    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //SEt the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    // Set the alternative email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    // Changing the password
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }
    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY " + mailboxCapacity + "mb";
    }

}
