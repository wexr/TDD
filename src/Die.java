import java.util.Random;

public class Die {
    private final int minValue = 1;
    private final int maxValue = 6;
    private int faceValue = minValue;

    public void roll() {
        int sideCount = (getMaxValue()-getMinValue()+1);
        faceValue = ((int)(mathRandom()*sideCount))+getMinValue();

    }

    protected double mathRandom() {
        return Math.random();
    }

    public int getFaceValue(){
        return faceValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
