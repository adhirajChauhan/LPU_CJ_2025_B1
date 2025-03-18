//Annotations are metadata added to the source code that do not affect the program execution directly. They provide information to the compiler. Annotations are not executed as a part of the program but can influence how the code is complied.

class Parent{
    void show(){
        System.out.println("From parent");
    }

    void thisMethodNameIsVeryLengthyJustForTestingPurposes(){

    }

    @Deprecated
    void oldMethod(){
        System.out.println("Something");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("From child");
    }

    @Override
    void thisMethodNameIsVeryLengthyJustForTestingPurposes(){

    }
}

public class annotation_1 {
    public static void main(String[] args) {
        Parent p = new Parent();

    }
}
