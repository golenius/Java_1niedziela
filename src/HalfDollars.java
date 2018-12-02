public class HalfDollars {
    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        //int average;
        int sum = 0;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 1_800_000;

        for (int i = 0; i < 3; i++) {
            total[i] = denver[i] + philadelphia[i];
        }

        //average = (total[0] + total[1] + total[2]) / 3;

        for (int i = 0; i < 3; i++) {

            System.out.print("Produkcja w " + (2012 + i) + "roku:");
            System.out.format("%,d%n", total[i]);
            sum += total[i];
        }
        /*System.out.print("Produkcja w 2012: ");
        System.out.format("%,d%n",total[0]);
        System.out.print("Produkcja w 2013: ");
        System.out.format("%,d%n",total[1]);
        System.out.print("Produkcja w 2014: ");
        System.out.format("%,d%n",total[2]);
        */
        System.out.print("ś".toUpperCase() + "rednia produkcji: ");
        System.out.format("%,d%n", sum /3);


        int[][][] arr3D = new int[4][3][1];
        arr3D[0] = new int[10][];


    }
}
