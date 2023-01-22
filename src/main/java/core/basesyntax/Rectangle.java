package core.basesyntax;

public class Rectangle extends Figure{
    public Rectangle(double firstSide, double secondSide) {
        super();
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    private double firstSide;
    private double secondSide;
    public double getArea(){
        return firstSide*secondSide;
    }

    @Override
    public String toString() {
        return "rectangle, area: " + getArea()+" sq.units,"+ " firstSide: "+firstSide +" units,"+" secondSide: "+secondSide +" units," +"color:" + colorSupplier.getRandomColor();
    }
}
