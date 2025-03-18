interface Camera{
    void takePhoto();
}

interface Music{
    void playMusic();
}

class Smartphone implements Camera, Music{
    public void takePhoto(){
        System.out.println("Taking a photo");
    }

    public void playMusic(){
        System.out.println("Playing music");
    }
}
public class interface_6 {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();

        obj.takePhoto();
        obj.playMusic();
    }
}
