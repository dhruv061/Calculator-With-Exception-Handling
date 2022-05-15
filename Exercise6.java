/*
 You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
 */

import java.util.Scanner;

//Custom Exception

//for addition
class InvalidInputExcepion extends Exception{

    @Override
    public String toString(){
        return "Pleas Enter Valid Input";
    }
}

//for Substraction
class CannotDivideByZeroException extends Exception{

    @Override
    public String toString(){
        return "We can't Divide valur by ZERO";
    }
}

//for all operation
class MaxInputException extends Exception{

    @Override
    public String toString(){
        return "Maximum Input is 100000 ...So, pleas enter within Limit";
    }
}

//for Multiplication Reached Exception
class MultiplicationReachedException extends Exception{

    @Override
    public String toString(){
        return "You Reached the limit..! ...Maximum Multiplication allowed is 7000 ..pleas enterd within the limit";
    }
}

public class Exercise6 {

    static int choise;

    //for addition
    public static void Addition() throws InvalidInputExcepion, MaxInputException {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter 2 Number For Addition : ");
        int a = sc1.nextInt();
        int b = sc1.nextInt();


        /* not working properly
        if (sc1.hasNextInt()){
            throw new InvalidInputExcepion();
        }
         */

        //for MaxInputException exception and result
        if( a>100000 || b>100000){
            throw new MaxInputException();

        }
        else{
            int result = a+b;
            System.out.println("Your Addition Is : " + result);
        }

    }

    //for Substraction
    public static void  Subtraction() throws MaxInputException {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter 2 Number For  Subtraction : ");
        int a =sc1.nextInt();
        int b =sc1.nextInt();

        int result = a-b;

        //for maximum input Exception
        if( a>100000 || b>100000){
            throw new MaxInputException();

        }

        System.out.println("Your Subtraction Is : " + result);
    }

    //for Multiplication
    public static void  Multiplication() throws MultiplicationReachedException {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter 2 Number For  Multiplication : ");
        int a =sc1.nextInt();
        int b =sc1.nextInt();

        int result = a * b;

        //for maximum input Exception
        if(a>7000 || b>7000){
            throw new MultiplicationReachedException();
        }

        System.out.println("Your Multiplication Is : " + result);
    }

    //for Division
    public static void  Division() throws CannotDivideByZeroException , MaxInputException {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter 2 Number For Division: ");
        int a =sc1.nextInt();
        int b =sc1.nextInt();

        //for divide by ZERO Exception
        if(b==0){
            throw new CannotDivideByZeroException();
        }

        //for maximum input Exception
        if( a>100000 || b>100000){
            throw new MaxInputException();

        }

        int result = a / b;
        System.out.println("Your Division Is : " + result);
    }

    //for taking user Input.....
    public static void USERINPUT(){
        System.out.println("Enter Your Choise");
        System.out.println("1.Addition \t 2.Substraction \t 3.Multiplication \t 4.Division \t 5.Exit");
        Scanner sc2 = new Scanner(System.in);
        choise = sc2.nextInt();
    }

    //for stop the loop
    public static void stoploop(){
        System.out.println(" Thanks!...For Using This Calculater ");
    }

    public static void main(String[] args) {

        //for Get the user input
        USERINPUT();

        while(true){
            switch (choise){

                case 1 : try{
                             //for calling addition method
                             Addition();
                             //for calling User Input Method
                             System.out.println("----------------------------------------------------------------------------");
                             USERINPUT();
                         }
                        catch(InvalidInputExcepion | MaxInputException e){
                            System.out.println(e);

                            //for calling User Input Method
                            System.out.println("----------------------------------------------------------------------------");
                            USERINPUT();
                        }
                        break;

                case 2 : try{
                            //for calling addition method
                            Subtraction();
                            //for calling User Input Method
                            System.out.println("----------------------------------------------------------------------------");
                            USERINPUT();
                         }
                        catch(MaxInputException e){
                            System.out.println(e);

                            //for calling User Input Method
                            System.out.println("----------------------------------------------------------------------------");
                            USERINPUT();
                        }
                        break;

                case 3 : try{
                            //for calling addition method
                                    Multiplication();
                            //for calling User Input Method
                            System.out.println("----------------------------------------------------------------------------");
                            USERINPUT();
                          }
                        catch(MultiplicationReachedException e){
                            System.out.println(e);

                            //for calling User Input Method
                            System.out.println("----------------------------------------------------------------------------");
                            USERINPUT();
                        }
                        break;

                case 4 : try{
                            //for calling addition method
                            Division();
                            //for calling User Input Method
                             System.out.println("----------------------------------------------------------------------------");
                            USERINPUT();
                        }
                        catch(CannotDivideByZeroException | MaxInputException e){
                            System.out.println(e);

                            //for calling User Input Method
                            System.out.println("----------------------------------------------------------------------------");
                            USERINPUT();
                        }
                    break;

                case 5 : break;

                default:
                    System.out.println("Pleas Enter Valid Input");

                    //for calling User Input Method
                    System.out.println("----------------------------------------------------------------------------");
                    USERINPUT();
            }

            //for stoping this loop
            if(choise ==5){
                stoploop();
                break;
            }
        }

    }
}
