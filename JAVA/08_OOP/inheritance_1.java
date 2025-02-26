public class inheritance_1 {
    public static void main(String[] args) {
        
    }
}



/*
player -> to kill zombies
 * zombies -> fastZombie, healthZombie, flyZombie
 * 
 * 
 * player -> class -> walk/run/shoot/heal
 * fastZombie -> walk, run, shoot
 * healthZombie -> walk, heal, shoot
 * flyZombie -> walk, fly, shoot
 * 
 */
class mainZombie{
    private int walkSpeed;

    void walk(){
        System.out.println("Walking");
    }

    void shoot(){
        System.out.println("shooting");
    }
}

 class fastZombie extends mainZombie{
    
    private int runSpeed;

    void run(){
        System.out.println("Running");
    }


 }

 class healtZombie extends mainZombie{

 }

 class flyZombie extends mainZombie{
    void fly(){
        
    }
 }

 //DRY