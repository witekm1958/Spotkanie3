public class HalfDollar {
    public static void main(String[] args) {
        int[] denver = {1_700_00, 4_600_00, 2_100_00};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 1_800_000;

        total[0] = denver[0] + philadelphia[0];
        total[0] = denver[1] + philadelphia[1];
        total[0] = denver[2] + philadelphia[2];

        average = (total[0] + total[1] + total[2]) / 3;

        System.out.print("Produkcja w 2012: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("Produkcja w 2013: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("Produkcja w 2014: ");
        System.out.format("%,d%n", total[2]);

    }
}
