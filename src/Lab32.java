import java.util.StringTokenizer;

public class Lab32 {
    public static void main(String[] args) {
        String dataUrudzin = "20/03/1930";

        StringTokenizer st1; //deklaracja zmiennych
        st1 = new StringTokenizer(dataUrudzin, "/");

        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());

        Pudlo p1 = new Pudlo();
        p1.depth = 20;
        p1.height = 30;
        p1.weight = 50;
        show(p1);
        Pudlo p2 = new Pudlo();
        p2.depth = 209;
        p2.height = 309;
        p2.weight = 509;
        show(p2);
    }

    static void show(Pudlo pudlo) {
        System.out.println(pudlo.height);
        //System.out.print(" ");
        System.out.println(pudlo.weight);
        System.out.println(pudlo.depth);
        System.out.println("Liczba instancji: " + pudlo.counter);
    }
}
class Pudlo{

    static int counter;
    public Pudlo(){
      counter++;
   }
     int height, weight, depth;
}