//polymorphism -> poly = many, morph = forms;
//it means one entity can take multipple forms

//Types ->

//1. Compile time polymorphism (Method overloading) -> happens at compile time
//Method overloading allows multiple methods in the same class with same name but different parameters.

class Calculate{
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}

public class polymorphism_1 {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        System.out.println(c1.add(2.5, 4.4));
    }
}
