package Back;

import Logicc.Menyuuu;

import java.util.Scanner;

import static Logicc.CreateAcc.calculate;

public class Saszame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Oyinchilani ozgartirish un ularning sonlarini kiriting\n13.orqaga");
        int a = scanner.nextInt();
        if (a == 13) {
            Menyuuu.main(args);
        }
        int b = scanner.nextInt();
        ozg(a, b);

    }

    public static void ozg(int a, int b) {
        String[] args = new String[0];
        User ney = Oyinchi.getSastav().get(a - 1);
        User ran = Oyinchi.getSastav().get(b - 1);
        Oyinchi.getSastav().set(b - 1, ney);
        Oyinchi.getSastav().set(a - 1, ran);
        System.out.println("Tayyor👍");
        Oyinchi oyinchi = new Oyinchi(Oyinchi.getIsm(), Oyinchi.getJamo(), Oyinchi.getSastav(), calculate(Oyinchi.getSastav()), Oyinchi.getZame());
        System.out.println("Oyinchilani ozgartirish un ularning sonlarini kiriting\n13.orqaga");
        main(args);

    }
}
