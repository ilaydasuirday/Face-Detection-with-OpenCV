package EmployeeManagement;

import java.util.*;
import java.io.*;


public class MyHashTable {

    // ATTRIBUTES
    // buckets is an array of ArrayList.  Each item in an ArrayList is a StudentInfo
    // object holding a reference value pointing to a student.

    public ArrayList<EmployeeInfo>[] buckets;
    public int numBuckets;

    // CONSTRUCTOR

    public MyHashTable(int howManyBuckets)
    {
        // Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

        // Instantiate buckets as an array to have an ArrayList as each element of the array.
        numBuckets = howManyBuckets;

        buckets = new ArrayList[howManyBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++)
        {
            buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
        }
    }

    public int getNumBuckets(){
        return(numBuckets);
    }


    // METHODS
    public int calcBucket(int studentNumber)
    {
        return(studentNumber % buckets.length);
    }


    public void addEmployee(EmployeeInfo employee)
    {
        int bucketNum = calcBucket(employee.getEmployeeNumber());
        buckets[bucketNum].add(employee);
    }


    public EmployeeInfo removeEmployee(int employeeNumber)
    {
        int bucketNum = calcBucket(employeeNumber);

        for (int c = 0; c < buckets[bucketNum].size(); c++)
        {
            EmployeeInfo student = buckets[bucketNum].get(c);

            if (student.getEmployeeNumber() == employeeNumber)
            {
                System.out.println("Employee Number was found!");
                buckets[bucketNum].remove(c);
                System.out.println("Employee Number was removed!");
                return(student);
            }
        }
        System.out.println("Employee was not found in the Table!");
        return(null);
    }


    public EmployeeInfo findEmployee(int employeeNumber)
    {
        int bucketNum = calcBucket(employeeNumber);

        for (int c = 0; c < buckets[bucketNum].size(); c++)
        {
            EmployeeInfo student = buckets[bucketNum].get(c);

            if (student.getEmployeeNumber() == employeeNumber)
            {
                System.out.println("Employee Number was found!");
                return(student);
            }
        }
        System.out.println("Employee was not found in the Table!");
        return(null);
    }


    public boolean isInTable(int employeeNumber)
    {
        int bucketNum = calcBucket(employeeNumber);

        for (int c = 0; c < buckets[bucketNum].size(); c++)
        {
            EmployeeInfo student = buckets[bucketNum].get(c);

            if (student.getEmployeeNumber() == employeeNumber)
            {
                System.out.println("Employee Number was found!");
                return(true);
            }
        }
        System.out.println("Employee was not found in the Table!");
        return(false);
    }

    public void displayBucket(int bucketnumber)
    {
        for (int c = 0; c < buckets[bucketnumber].size(); c++)
        {
            System.out.println("The employee is: " + buckets[bucketnumber].get(c).getEmployeeNumber() + " Who is "
                    + buckets[bucketnumber].get(c).getFirstName()
                    + " " + buckets[bucketnumber].get(c).getLastName()
            );
        }

        System.out.println("\n");
    }


    public void displayTable()
    {
        System.out.println("There are " + buckets.length + " buckets");

        for (int i = 0; i < buckets.length; i++)
        {
            displayBucket(i);

        }
    }

    public void loadFromFile()
    {
        FileReader fr = null;
        BufferedReader reader = null;


        try{
            fr = new FileReader("my_file.txt");

        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }

        try{
            reader = new BufferedReader(fr);

            String line;
            while((line = reader.readLine()) != null){
                //format for reading from file.

                String[] lineArray = line.split(" ", 0);

                if (lineArray[0].equals("FullTimeEmployee")){
                    //its a full time employee
                    // Format is
                    /*
                        type                                        0
                        Annual Salary                               1
                        Employee Number                             2
                        First name, Last Name                       3, 4
                        Gender                                      5
                        Work Location                               6
                        Deduction rate                              7
                    */


                    FullTimeEmployee employee = new FullTimeEmployee( Integer.valueOf(lineArray[2]), (lineArray[3]), (lineArray[4]), Integer.valueOf(lineArray[5]), Integer.valueOf(lineArray[6]), Double.valueOf(lineArray[7]), Double.valueOf(lineArray[1]));

                    int bucketNum = calcBucket(employee.getEmployeeNumber());
                    buckets[bucketNum].add(employee);
                }

                else if(lineArray[0].equals("PartTimeEmployee")){
                    /*
                    type                    0
                    HourlyWage              1
                    HoursPerWeek            2
                    WeeksPerYear            3
                    EmployeeNumber          4
                    FirstName               5
                    LastName                6
                    Gender                  7
                    WorkLocation            8
                    DeductionRate           9
                    */

                    FullTimeEmployee employee = new FullTimeEmployee(Integer.valueOf(lineArray[4]), (lineArray[5]), (lineArray[6]), Integer.valueOf(lineArray[7]), Integer.valueOf(lineArray[8]), Double.valueOf(lineArray[9]), Double.valueOf(lineArray[1]), Double.valueOf(lineArray[2]), Double.valueOf(lineArray[3]));

                    int bucketNum = calcBucket(employee.getEmployeeNumber());
                    buckets[bucketNum].add(employee);
                }

            }
        }
        catch(Exception e){
            System.out.println("Something went wrong when reading from file!");
        }
        finally{
            try{
                if(reader != null)
                {
                    reader.close();
                }
            }
            catch(Exception E)
            {
                System.out.println("Could not close buffered reader :0");
            }
        }

    }

    public void saveToFile()
    {
        BufferedWriter bw = null;
        try {


            File starting = new File(System.getProperty("user.dir"));
            File textfile = new File(starting,"my_file.txt");

            if (!textfile.exists()) {
                textfile.createNewFile();
            }

            FileWriter fw = new FileWriter(textfile);
            bw = new BufferedWriter(fw);


            for (int i = 0; i < buckets.length; i++)
            {
                for (int x = 0; x < buckets[i].size(); x++)
                {
                    EmployeeInfo employee = buckets[i].get(x);

                    if (employee instanceof FullTimeEmployee)
                    {
                        //Full Time Employee, write full time Employee stuff

                             /*
                            type                                        0
                            Annual Salary                               1
                            Employee Number                             2
                            First name, Last Name                       3, 4
                            Gender                                      5
                            Work Location                               6
                            Deduction rate                              7
                            */


                        FullTimeEmployee emp = (FullTimeEmployee) buckets[i].get(x);

                        bw.write("FullTimeEmployee ");
                        bw.write(Double.toString(emp.getAnnualSalary()));
                    }

                    else if (employee instanceof FullTimeEmployee)
                    {
                            /*
                            type                    0
                            HourlyWage              1
                            HoursPerWeek            2
                            WeeksPerYear            3
                            EmployeeNumber          4
                            FirstName               5
                            LastName                6
                            Gender                  7
                            WorkLocation            8
                            DeductionRate           9
                            */

                        FullTimeEmployee emp = (FullTimeEmployee) buckets[i].get(x);

                        bw.write("PartTimeEmployee");
                        bw.write(" " + Double.toString(emp.getHourlyWage()));
                        bw.write(" " + Double.toString(emp.getHoursPerWeek()));
                        bw.write(" " + Double.toString(emp.getWeeksPerYear()));

                    }

                    bw.write(" " + Integer.toString(employee.getEmployeeNumber()));
                    bw.write(" " + employee.getFirstName() + " " + employee.getLastName());
                    bw.write(" " + Integer.toString(employee.getGender()));
                    bw.write(" " + Integer.toString(employee.getWorkLocation()));
                    bw.write(" " + Double.toString(employee.getDeductionRate()));
                    bw.newLine();

                }
            }

        }

        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
