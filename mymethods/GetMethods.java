
package mymethods;

//Author: M. Klaassen
//Oct. 30, 2014
//ICS3UC GCVI

//external methods pertaining to input from input (console)
//using Scanner class

import java.util.Scanner;

public class GetMethods {

    // member variables - accessible to this class only (private)

    private static Scanner input = new Scanner(System.in);
    /**
     * A method which returns a word trimmed.
     * @return 
     */
    public static String getWord(){
        String user;
        user = input.next().trim();
        input.nextLine();

        return user;
    }
    /**
     * A method which returns a word trimmed.
     * @return 
     */
    public static String getWord(String prompt)    {
        System.out.print(prompt);
        return getWord();
    }

    /**
     * returns an integer while displaying an prompt
     * @param prompt
     * @return 
     */
    public static int getInt(String prompt)
    {
        int num =0;
        System.out.print(prompt);

        while(!input.hasNextInt())
        {
            input.nextLine();   // clear input
            System.out.println("\tNot a valid integer - please try again. ");
            System.out.print(prompt);
        }

        // loop terminates when valid integer is entered
        num=input.nextInt();  // we know the input is valid so get it
        input.nextLine(); // flush the input stream
        return(num);
    }

    public static int getInt(int lowRange,int highRange){
        return getInt("",lowRange,highRange);
    }

    // get a valid integer between low and high range
    public static int getInt(String prompt,int lowRange,int highRange)
    {
        int intNum = getInt(prompt);

        while (!(intNum >= lowRange && intNum <= highRange))
        {
            System.out.println("Entry is out of range");
            System.out.println("Range is from " + lowRange + " to " + highRange);
            intNum = getInt(prompt);

        }
        return intNum;
    }


    //get a valid integer >= low
    public static int getIntL(String prompt,int lowRange)
    {
        int intNum = getInt(prompt);
        while (!(intNum >= lowRange))
        {
            System.out.println("Entry is out of range");
            System.out.println("Must be greater than or equal to " + lowRange);

            intNum = getInt(prompt);
        }
        return intNum;
    }
    public static int getIntH(String prompt, int highRange)
    {

        int intNum = getInt(prompt);

        while (!(intNum <= highRange))
        {
            System.out.println("Entry is out of range");
            System.out.println("Must be lesser than or equal to " + highRange);

            intNum = getInt(prompt);

        }

        return intNum;
    }

    //******************************************************************************
    // METHODs to accept DOUBLE from the user
    //***********************************************************


    // get a valid real number from the console
    public static double getDbl(String prompt)
    {
        double dblNum=0;
        System.out.print(prompt);

        while(input.hasNextDouble() == false)
        {
            input.nextLine();   // clear input
            System.out.println("not a real number - please try again ");
            System.out.println(prompt);
        }

        // loop terminates when valid double is entered
        dblNum=input.nextDouble();  // we know the input is valid so get it
        input.nextLine(); // flush the input stream
        return(dblNum);
    }

    /**
     * A method which returns the line from the user,trimmed.
     * @param prompt the string which prompts the user.
     * @return
     */
    public static String getLine(String prompt){
            System.out.print(prompt);
            return input.nextLine().trim();
        }

    /**
     * A method which returns the line from the user in uppercase or lowercase,trimmed.
     * @param prompt the string which prompts the user.
     * @param choice the choice between upper case(u) and lower case(l). Invalid choices will return a string saying Invalid choice.
     * @return
     */
    public static String getLineUpperLower(String prompt, char choice){

        if(choice=='u')return getLine(prompt).toUpperCase();
        else if(choice=='l')return getLine(prompt).toLowerCase();
        else return "Invaild input";
    }
    // get a valid real number between low and high range
    public static double getDbl(String prompt,double lowRange,double highRange)
    {
        double dblNum = getDbl(prompt);

        while (!(dblNum >= lowRange && dblNum <= highRange))
        {
                System.out.println("Entry is out of range");
                System.out.println("Range is from " + lowRange + " to " + highRange);

                dblNum = getDbl(prompt);

        }

        return dblNum;
    }


    //get a valid real number >= low
    public static double getDbl(String prompt,double lowRange)
    {
        double dblNum = getDbl(prompt);
        while (!(dblNum >= lowRange))
        {
            System.out.println("Entry is out of range");
            System.out.println("Must be greater than or equal to " + lowRange);

            dblNum = getDbl(prompt);
        }
        return dblNum;
    }

    //get a valid real number >= low
    //and a specific number of decimal places
    public static double getDbl(String prompt,double lowRange,int numDecPlaces)
    {
        double dblNum = getDbl(prompt);

        while (!((dblNum >= lowRange)&&NumberMethods.round(dblNum,numDecPlaces)==dblNum))
        {
                System.out.println("Entry must be greater than or equal to "+
                        lowRange + " and " + numDecPlaces + " decimal places");


                dblNum = getDbl(prompt);

        }

        return dblNum;
    }

    //get a valid real number
    //and a specific number of decimal places
    public static double getDbl(String prompt,int numDecPlaces)
    {
        double dblNum = getDbl(prompt);

        while (! (NumberMethods.round(dblNum,numDecPlaces)==dblNum) )
        {
                System.out.println("Entry must be "
                         + numDecPlaces + " decimal places");


                dblNum = getDbl(prompt);

        }

        return dblNum;
    }
}

