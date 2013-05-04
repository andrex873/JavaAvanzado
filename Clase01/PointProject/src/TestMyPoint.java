/**
 *
 * @author Andrés méndez Juanias
 */
public class TestMyPoint {

    public static void main(String args[]){
        MyPoint start = new MyPoint();
        MyPoint end = new MyPoint();        

        start.x = 10;
        start.y = 10;

        end.x = 20;
        end.y = 30;

        System.out.println("start point is : " + start);
        System.out.println("end point is : " + end);

        MyPoint stray = end;

        System.out.println("*******************************");
        System.out.println("stray point is : " + stray);
        System.out.println("end point is : " + end);

        stray.x = 47;
        stray.y = 50;

        System.out.println("*******************************");
        System.out.println("start point is : " + start);
        System.out.println("end point is : " + end);
        System.out.println("stray point is : " + stray);
        
    }

}
