package EmployeeManagement;

public class EmployeeInfo {
    // Attributes
    protected int employeeNumber;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected int gender;
    protected int workLocation;
    protected double deductionRate;

    // Constructors

    public EmployeeInfo()
    {
        employeeNumber = 0;
        firstName = "";
        lastName = "";
        gender = 0;
        workLocation = 0;
        deductionRate = 0;
    }

    public EmployeeInfo(int eN, String fN, String lN, int gndr, int wL, double dR)
    {
        employeeNumber = eN;
        firstName = fN;
        lastName = lN;
        gender = gndr;
        workLocation = wL;
        deductionRate = dR;
    }


// Methods

    //Setters
    public void setEmployeeNumber(int eN) {
        if (eN < 0) {
            employeeNumber = -1;
        }
        else {
            employeeNumber = eN;
        }
    }

    public void setFirstName(String fN) {
        firstName = fN;
    }

    public void setLastName(String lN) {
        lastName = lN;
    }

    public void setGender(int gndr)
    {
        gender = gndr;
    }

    public void setWorkLocation(int wL)
    {
        workLocation = wL;
    }

    public void setDeductionRate(double dR)
    {
        deductionRate = dR;
    }

    // Getters
    public int getEmployeeNumber()
    {
        return(employeeNumber);
    }

    public String getFirstName()
    {
        return(firstName);
    }

    public String getLastName()
    {
        return(lastName);
    }

    public int getGender()
    {
        return(gender);
    }

    public int getWorkLocation()
    {
        return(workLocation);
    }

    public double getDeductionRate()
    {
        return(deductionRate);
    }


}
