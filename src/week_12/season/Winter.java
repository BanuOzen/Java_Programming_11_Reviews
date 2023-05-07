package week_12.season;

public class Winter extends Season{
    public Winter(double highAvgTemp, double lowAvgTemp) {
        super("Winter", highAvgTemp, lowAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use FirePlace" + getClass().getSimpleName());
    }

}
