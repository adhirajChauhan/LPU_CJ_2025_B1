class Car extends Object{
    String model;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Car [model=" + model + ", price=" + price + "]";
    }



    // public String toString(){
    //     return model + " : " + price;
    // }

    // public boolean equals(Car obj){
    //     if(this.model.equals(obj.model)){
    //         return true;
    //     }
    //     else return false;
    // }

    

}

public class objectClass {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.model = "2020";
        obj1.price = 100;

        Car obj2 = new Car();
        // obj2.model = "2021";
        obj2.price = 100;

        // System.out.println(obj1);
        // System.out.println(obj2);


        System.out.println(obj1.equals(obj2));
    }   
}
