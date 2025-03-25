
// class A implements Runnable{
//     public void run(){

//         System.out.println("Thread is running : " + Thread.currentThread().getName());
//         for(int i = 1; i <= 5; i++){

//             System.out.println("55");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }


// class B implements Runnable{
//     public void run(){
//         System.out.println("Thread is running : " + Thread.currentThread().getName());

//         for(int i = 1; i <= 5; i++){

//             System.out.println("111");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class threas_2 {
    public static void main(String[] args) {
        Runnable obj1 = () ->{

                System.out.println("Thread is running : " + Thread.currentThread().getName());
                for(int i = 1; i <= 5; i++){
        
                    System.out.println("55");
        
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };


        Runnable obj2 = () -> {
                System.out.println("Thread is running : " + Thread.currentThread().getName());
        
                for(int i = 1; i <= 5; i++){
        
                    System.out.println("111");
        
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }    
}
