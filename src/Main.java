import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        int cost = 6500; // стоимость билета
        int divider = 20; // рублей для одной бонусной мили

        System.out.println("Стоимость билета:" + cost + " рублей");
        System.out.println("Начислено бонусных миль:" + cost / divider);
    }

}
