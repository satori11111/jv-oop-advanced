package core.basesyntax;




public class Circle extends Figure {
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle, area: " + getArea()+" sq.units,"+ " radius: "+radius +" units, color:"+ colorSupplier.getRandomColor();
    }

    private double radius;

    public double getArea(){
        return 3.14* radius;
    }

}
