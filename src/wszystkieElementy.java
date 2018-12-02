public class wszystkieElementy {
    public static void main(String[] args) {

        int[][][] array = {{{1},{1,2,3}},{{1,2},{2}}};

        for (int i = 0; i <= array.length; i++ ) {
            for (int j = 0; j <= array[i].length; j++) {
                for (int k = 0; k <= array[i][j].length; k++) {
                    System.out.println("[" + i + "]");
                    System.out.println("[" + j + "]");
                    System.out.println("[" + k + "]");
                    System.out.println(array[i][j][k]);
                }
            }
        }

    }
}
