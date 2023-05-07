package week_12.season;

public class Spring extends Season{
    public Spring(double highAvgTemp, double lowAvgTemp) {
        super("Spring", highAvgTemp, lowAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside in Spring");
    }




}
