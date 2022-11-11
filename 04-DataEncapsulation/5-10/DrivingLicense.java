public class DrivingLicense{
    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String city;
    private String drivingNum;
    private String year;
    private String category;

    //Methods

    //First Name 
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        String a = firstName.toLowerCase();
        this.firstName = a.substring(0,1).toUpperCase();
    }

    //Last Name

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    }

    //Address

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //Postal Code

    public String getPostalCode(){
        return postalCode;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    //City

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    //Driving Number

    public String getDrivingNum(){
        return drivingNum;
    }
    public void setDrivingNum(String drivingNum){
        this.drivingNum = drivingNum;
    }

    //Year

    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }

    //Category

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public String toString(){
        //DrivingLicense d1 = new DrivingLicense();
        //d1.firstName = getFirstName();
        //d1.lastName = getLastName();
        return "First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", Address: " + getAddress() + ", Postal Code: " + getPostalCode() + ", City: " + getCity() + ", Driver Number: " + getDrivingNum() + ", Year: " + getYear() + ", Category: " + getCategory();
    }

    public static void main(String[] args){
        
    }

}