
public class ConditionalStatements {
    public static void main(String[] args) {
        // if(condition){
        //     code
        // }

        //Example 1
        // int age = 10;
        // if(age >= 18){
        //     System.out.println("You can vote");
        // }
        // else{
        //     System.out.println("You can not vote");
        // }

        // System.out.println("Last line");

        // Example 2

        // int num = 11;

        // if(num % 2 == 0){
        //     System.out.println(num + " is even");
        // }
        // else{
        //     System.out.println(num + " is odd");
        // }


        //------------------------

        // if(condition1){
        //     code1
        // }
        // else if(condition2){
        //     code2
        // }
        // else if(condition3){
        //     code3
        // }
        // else{
        //     code4
        // }

        //Example 3
        // int marks = 75;

        // if(marks >= 90){
        //     System.out.println("Grade is A");
        // }
        // else if(marks >= 80){
        //     System.out.println("Grade is B");
        // }
        // else if(marks >= 70){
        //     System.out.println("Grade is C");
        // }
        // else if(marks >=60){
        //     System.out.println("Grade is D");
        // }
        // else{
        //     System.out.println("Grade is E");
        // }

        // System.out.println("Last line");

        //------------------------

        //Example 4

        int age = 20;
        boolean isCitizen = false;

        if(age >= 18){
            if(isCitizen){
                System.out.println("You can vote");
            }
            else{
                System.out.println("You must be a citizen to vote");
            }
        }
        else{
            System.out.println("You cannot vote");
        }



    }
}

//Write a program to find the largest among three numbers