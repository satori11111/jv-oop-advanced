package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier=new FigureSupplier();
     Figure[] figures=new Figure[]{figureSupplier.getRandomFigure(),figureSupplier.getRandomFigure(),figureSupplier.getRandomFigure()
     ,figureSupplier.getDefaultFigure(),figureSupplier.getDefaultFigure(),figureSupplier.getDefaultFigure()};

        Arrays.stream(figures).forEach(System.out::println);


    }
}
