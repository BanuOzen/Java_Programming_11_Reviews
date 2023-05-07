package week_12.season;

public class Fall extends Season{
    public Fall(double highAvgTemp, double lowAvgTemp) {
        super("Fall", highAvgTemp, lowAvgTemp);
    }
/*

if you do not override it compiler is creating that one for us and it is calling parent class method
@Override
    public void activity() {
        super.activity();
    }


 */
@Override
public void activity() {
    System.out.println("Read A Book in Fall");
}


}
