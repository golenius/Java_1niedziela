public class Sample2 {
    public static void main(String[] args) {
        int[][][] arry = {{{1},{1,2,3}},{{1,2},{2}}};
        //arry[0] = {{1},{1,2,3}};
        //arry [0][0] = {1};
        //arry [0][1] = {1,2,3};
        //arry[1] = {{1,2},{2}};
        //arry [1][0] = {1,2};
        //arry


        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                for (int k = 0; k < arry[i][j].length; k++) {
                    System.out.print("[" + i + "]");
                    System.out.print("[" + j + "]");
                    System.out.print("[" + k + "]");
                    System.out.println(arry[i][j][k]);
                }
            }
        }
    }
}
