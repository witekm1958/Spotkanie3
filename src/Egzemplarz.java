public class Egzemplarz {
    public static void main(String[] args) {
        PodajDane pd = new PodajDane();
        System.out.println("Wysokość = " + pd.height);
        System.out.println("Ciężar = " + pd.weight);
        System.out.println("Wysokość = " + pd.depth);
    }
}

class PodajDane{
      int height = 25;
      int weight = 45;
      int depth = 23;
     }