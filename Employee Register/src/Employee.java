public class Employee {
    
    private String firstname;
    private String lastname;
    private String mobileNo;
    private String email;

    public Employee(String firstname, String lastname, String mobileNo, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        String objDetails;
        
        objDetails = String.format("%-15s %-15s %-15s %-30s",firstname,lastname,mobileNo,email);
        return objDetails;
    }

    

    
}
