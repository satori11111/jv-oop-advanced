package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
  public IsoscelesTrapezoid(double parallelSide, double topSide,double bottomSide) {
    super();
    this.parallelSide = parallelSide;
    this.topSide = topSide;
    this.bottomSide = bottomSide;
  }

  private double parallelSide;
  private double topSide;
  private double bottomSide;

  public double getArea(){
    return 0.5* Math.sqrt((parallelSide*parallelSide -topSide*topSide)/4);
  }
  @Override
  public String toString() {
    return "isoscelesTrapezoid, area: " + getArea()+" sq.units,"+ " parallelSide: "+parallelSide +" units,"+" topSide: "+topSide +" bottomSide: "+bottomSide +" units," +" units,"  +"color:"+ colorSupplier.getRandomColor();
  }
}
