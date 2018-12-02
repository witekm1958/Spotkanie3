public class CalcInstancje {
    public static void main(String[] args) {
        new Twor();
        new Twor();
        new Twor();
        new Twor();
        new Twor();
        new Twor();
        new Twor();
        System.out.println("Ilość Instancji : " + Twor.counter);
    }
}

class Twor{
    static int counter;

    public Twor(){
        counter++;
    }

}
