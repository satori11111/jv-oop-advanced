package core.basesyntax;

import lombok.AllArgsConstructor;


public class Square extends Figure{
    public Square(double side) {
        super();
        this.side = side;

    }

    private double side;
    public double getArea(){
        return side*side;
    }
    @Override
    public String toString() {
        return "square, area: " + getArea()+" sq.units,"+ " side: "+side +" units, color:"+ colorSupplier.getRandomColor();
    }
}
