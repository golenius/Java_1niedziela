public class Sample1 {
    public static void main(String[] args) {

        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło byc lepiej");
                break;
            default:
                System.out.println("Rozwaz oczukiwanie");
        }


        int a = 2;
        System.out.println(a>5 ? "wieksze" : "mniejsze");

        boolean isOK= false;

        do {
            System.out.println("JestOK");
        } while (isOK);
        System.out.println("Nie jest dobrze");

        int[] arr = {2,3,4,67,45};

        for (int i : arr){
            if (i == 3){
                break;
                //System.out.println("ZAtrzymane" + i);
            }
            System.out.println(i);
        }




    }
}

