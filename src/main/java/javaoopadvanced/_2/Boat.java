package javaoopadvanced._2;

public class Boat implements Movable {
    @Override
    public void moveForward() {
        System.out.println("La barca va avanti");
    }

    @Override
    public void moveBackward() {
        System.out.println("La barca va indietro");

    }
}
