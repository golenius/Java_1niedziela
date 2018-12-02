public class konwersja {
    public static void main(String[] args) {

        System.out.println((long)(conv(args[0])));

        for (int i = 0; i < 32_000_000; i++) {

            long[][][][] tab = new long[i][i][i][i];
        }
    }

    static int conv(String liczbaSlownie) {
        int liczbaLong = -1;
        switch (liczbaSlownie) {
            case "jeden":
                liczbaLong = 1;
                break;
            case "dwa":
                liczbaLong = 2;
                break;
            case "trzy":
                liczbaLong = 3;
                break;
            case "cztery":
                liczbaLong = 4;
                break;
            case "piec":
                liczbaLong = 5;
                break;
            case "szczesc":
                liczbaLong = 6;
                break;
            case "siedem":
                liczbaLong = 7;
                break;
            case "osiem":
                liczbaLong = 8;
                break;
            case "dziewiec":
                liczbaLong = 9;
                break;
            default:
                System.out.println("Rozwaz oczukiwanie");
        }
        return liczbaLong;
    }
}
