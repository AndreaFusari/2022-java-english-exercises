package javaoopadvanced._2;

public class Circle extends Shape {
    public Circle(double diameter) {
        super(diameter, diameter); // passiamo solo un valore come parametro
        // che sarà assegnato a height e width
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);

    }
}
