
interface Shape{
    void draw();
}

interface Color extends Shape{
    void fillColor();
}

class Circle implements  Color{

    public void draw(){
        System.out.println("Draw Circle");
    }
    public void fillColor(){
        System.out.println("Filling Color");
    }
}

public class interface_3 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.draw();
        obj.fillColor();
    }
}
