import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {
        Point location = new Point(4,13);
        PointSetter.show(location,"Polozenie poczatkowe");
        PointSetter.changePoint(location,7,6,"Przejscie do (7,6)");
        PointSetter.show(location,"Polozenie koncowe"); //pointsetter nei musi byc napisane

    }
    //metoda narzedziowa, statyczna klasowa
    static void show(Point point){
        System.out.println("X rowne " + point.x);
        System.out.println("Y rowne " + point.y);

    }
    static void show(Point point, String description){
        System.out.println("X rowne " + point.x);
        System.out.println("Y rowne " + point.y);

    }
    static void changePoint(Point point,int x, int y,String desc){
        System.out.println(desc);
        point.x = x;
        point.y = y;
     }
}
