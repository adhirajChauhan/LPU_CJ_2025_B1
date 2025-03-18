
interface Drawable{
    void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Draw a circle");
    }
}

class Triangle implements Drawable{
    public void draw(){
        System.out.println("Draw a triangle");
    }
}


public class interface_2 {
    public static void main(String[] args) {
        Drawable obj1 = new Circle();
        Drawable obj2 = new Triangle();

        obj1.draw();
        obj2.draw();
    }
}
