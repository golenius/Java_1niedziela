public class Lab33 {

    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < DayCounter.countDays(i, 2018)+1; j++) {
                System.out.print(j + "/" + i + "/" + "2018" + "\n");
            }
        }
    }
}
