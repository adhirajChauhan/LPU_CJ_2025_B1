public class operators_1 {
    public static void main(String[] args) {
        
        //Types of operators
        //1. Arithmetic operators -> + - * / %

        int num1 = 10;
        int num2 = 20;

        // int ans = num1 + num2;
        // System.out.println(num1 + num2);
        // System.out.println(num1 - num2);
        // System.out.println(num1 * num2);
        // System.out.println(num1 / num2);
        // System.out.println(num1 % num2);

        // System.out.println(num1++); //post increment
        // System.out.println(++num1); //pre increment

        // System.out.println(num1++ + ++num1);

        //--------------------------------------

        //2. Relational operators -> == != > >= < <=

        // System.out.println(num1 > num2);

        //--------------------------------------
        //3. Assignment operators -> = += -= *= /= %=

        // num1 += 15;

        // System.out.println(num1);

        //--------------------------------------

        //4. Logical operators -> && || !
        
        // cond1    cond2    &&    ||
        //     T       T     T     T
        //     T       F     F     T
        //     F       T     F     T
        //     F       F     F     F 

        // System.out.println((num1 > 11) && (num2 < 50));
        // System.out.println((num1 > 11) || (num2 < 50));

        //--------------------------------------

        //5. bitwise

        // a      b      &      |    ^
        // 0      0      0      0    0
        // 0      1      0      1    1
        // 1      0      0      1    1
        // 1      1      1      1    0

        // int a = 5, b = 3;

        // System.out.println(a&b);
        // System.out.println(a^b);




    }
}



//Accept two numbers from the user and use logical operator to check wheather both numbers are positive
