package core.basesyntax;

public class Figure implements  Drawable {
    ColorSupplier colorSupplier =new ColorSupplier();
    private  String color=colorSupplier.getRandomColor();

    @Override
    public void draw() {
        System.out.println(color);
    }
}
