package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor(){
        int rand=(int)Math.random()*10;
        if(rand<3){
            return "blue";
        } else if (rand>=3 && rand<=6) {
            return "red";
        }
        else {
            return "green";
        }
    }
}
