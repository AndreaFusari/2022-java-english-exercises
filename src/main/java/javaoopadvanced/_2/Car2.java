package javaoopadvanced._2;

public class Car2 implements Movable  {
    @Override
    public void moveForward() {
        System.out.println("L'auto va avanti");

    }

    @Override
    public void moveBackward() {
        System.out.println("L'auto va indietro");

    }
}
