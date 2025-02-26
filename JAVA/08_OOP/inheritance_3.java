//Types of inheritance

//-----------------------------------
//1. Single inheritance -> A single child class extends a single parent class
// class Parent{
//     void show(){
//         System.out.println("From parent");
//     }
// }

// class Child extends Parent{
//     void display(){
//         System.out.println("From Child");
//     }
// }

//-----------------------------------
//2. Multilevel inheritance -> A class is derieved from another derieved class
// class A{
//     void ShowA(){
//         System.out.println("From A");
//     }
// }

// class B extends A{
//     void ShowB(){
//         System.out.println("From B");
//     }
// }

// class C extends B{
//     void ShowC(){
//         System.out.println("From C");
//     }
// }

//-----------------------------------
//3.Hierarchical inheritance - A single parent class is inherited by multiple child classes

// class Parent{
//     void ShowParent(){
//         System.out.println("From Parent");
//     }
// }

// class Child1 extends Parent{
//     void ShowChild1(){
//         System.out.println("From Child1");
//     }
// }

// class Child2 extends Parent{
//     void ShowChild2(){
//         System.out.println("From Child2");
//     }
// }


//-----------------------------------
//4. Multiple inheritance -> not supported in JAVA to avoid ambiguity problems, it can be achieved using interfaces

// interface A{

// }

// interface B{

// }

// class C implements A, B{

// }
// public class inheritance_3 {
//     public static void main(String[] args) {


//     }
// }



// Create a base class Vehicle with properties speed and fuelCapacity.
// Create subclasses Car and Bike that inherit Vehicle and have their own methods.