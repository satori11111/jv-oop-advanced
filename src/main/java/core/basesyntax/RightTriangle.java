package core.basesyntax;

public class RightTriangle extends Figure {
    public RightTriangle( double firstLeg, double secondLeg) {
        super();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }



    private double firstLeg;
    private double secondLeg;

    public double getArea(){
        return 0.5*firstLeg*secondLeg;
    }
    @Override
    public String toString() {
        return "rightTriangle, area: " + getArea()+" sq.units,"+ " firstLeg: "+firstLeg +" units,"+" secondLeg: "+secondLeg +" units,"+ "color:"+ colorSupplier.getRandomColor();
    }
}
