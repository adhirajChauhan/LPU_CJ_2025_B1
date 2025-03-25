
class A extends Thread{
    public void run(){

        System.out.println("Thread is running : " + Thread.currentThread().getName());
        for(int i = 1; i <= 50; i++){

            System.out.println("55");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class B extends Thread{
    public void run(){
        System.out.println("Thread is running : " + Thread.currentThread().getName());

        for(int i = 1; i <= 50; i++){

            System.out.println("111");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class threads_1 {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());

        obj2.setPriority(Thread.MIN_PRIORITY);

        obj1.start();
        obj2.start();

    }
}



// Create a BankAccount class with methods deposite() and withdraw()
// use multiple threads to perform transactions concurrently