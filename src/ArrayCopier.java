public class ArrayCopier {
    public static void main(String[] args) {
  /*      int[] arrSource = {7, 4, 8, 1, 4, 1, 4};
        double[] arrTarget = new double[arrSource.length];

        int count = 0;
        System.out.print("array source: [");
        while (count < arrSource.length) {
            arrTarget[count] = arrSource[count];
            System.out.print(arrTarget[count++]);
        }*/
        int[] arr = {2, 3, 4, 5, 65, 2, 5};
     /*   for (int i : arr) {
            System.out.println(i);
        }*/

/*        for (int i : arr){
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }*/

        for (int i : arr){
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }


    }

}