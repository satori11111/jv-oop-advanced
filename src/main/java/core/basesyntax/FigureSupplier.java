package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure(){
        double rand=Math.random()*10;
        if(rand<2)
        return new Rectangle(Math.random()*10,Math.random()*10);
        else if (rand>=2 && rand<4)
            return new RightTriangle(Math.random()*10,(Math.random()*10));
        else if (rand>=4 && rand<6)
            return  new IsoscelesTrapezoid(Math.random()*10,Math.random()*10,Math.random()*10);
        else if(rand>=6 && rand<8)
            return new Circle(Math.random()*10);
        else{
            return new Square(Math.random()*10);
        }
    }
    public  Figure getDefaultFigure(){
        return new Square(5);
    }
}
