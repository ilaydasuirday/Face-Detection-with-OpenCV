package EmployeeManagement;

public class PartTimeEmployee extends EmployeeInfo
{

    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;


    public PartTimeEmployee()
    {
        employeeNumber = 0;
        firstName = "";
        lastName = "";
        gender = 0;
        age = 0;
        workLocation = 0;
        deductionRate = 0;
        hourlyWage = 0;
        hoursPerWeek = 0;
        weeksPerYear = 0;
    }



    public PartTimeEmployee(int eN, String fN, String lN, int gender, int wL, double dR)
    {
        super();
        hourlyWage = 0;
        hoursPerWeek = 0;
        weeksPerYear = 0;
    }

    public PartTimeEmployee(int eN, String fN, String lN, int gender, int wL, double dR, double hW, double hPW, double wPY)
    {
        super(eN, fN, lN, gender, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
    }

    //int eN, String fN, String lN, int gndr, int wL, double dR, int hW, int hPW, int wPY

    //setters
    public void setHourlyWage(double hW)
    {
        hourlyWage = hW;
    }

    public void setHoursPerWeek(double hPW)
    {
        hoursPerWeek = hPW;
    }

    public void setWeeksPerYear(double wPY)
    {
        weeksPerYear = wPY;

    }


    //getters
    public double getHourlyWage()
    {
        return(hourlyWage);
    }

    public double getHoursPerWeek()
    {
        return(hoursPerWeek);
    }

    public double getWeeksPerYear()
    {
        return(weeksPerYear);
    }


}