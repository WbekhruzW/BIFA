package Back;

import Front.Color;
import Front.Util;
import Logicc.CreateAcc;
import Logicc.Menyuuu;

import java.util.ArrayList;
import java.util.Scanner;

public class Magazm {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BBVA_Teams[] values = BBVA_Teams.values();
        System.out.println(
                "Oyinchi qidirish un jamoni tanlang"
        );
        for (int i = 0; i < values.length; i++) {
            System.out.print(Color.YELLOW + (i + 1) + "." + Color.RESET);
            System.out.println(Color.BLUE + values[i].nomi + Color.RESET);
        }
        System.out.println("0.Chiqib ketsh");
        int ch = scanner.nextInt();
        casech(ch);

    }

    private static void chpl(User user) {
        String[] args = new String[0];
        System.out.println("|_________________________|\n" +
                "|        **********       |\n" +
                "|      **************     |\n" +
                "|      **************     |\n" +
                "|       ************      |\n" +
                "|         ********        |\n" +
                "|     *****      *****    |\n" +
                "|   ********************  |\n" +
                "|-------------------------|\n" +
                "|" + user.ismi + "|" + user.rate + "      |\n" +
                "|-------------------------|\n" +
                "|" + user.narxi + "     |\n" +
                "|-------------------------|");
        System.out.println("1.Sotib olish\n2.Orqaga");
        int aa = scanner.nextInt();
        switch (aa) {
            case 1 -> {
                if (Oyinchi.getJamo().budj >= user.narxi) {
                    int i = Oyinchi.getJamo().budj - user.narxi;
                    Oyinchi.getZame().add(user);
                    long calculate = CreateAcc.calculate(Oyinchi.getSastav());
                    Oyinchi.getJamo().budj = i;
                    Oyinchi oyinchi = new Oyinchi(Oyinchi.getIsm(), Oyinchi.getJamo(), Oyinchi.getSastav(), calculate, Oyinchi.getZame());
                    Menyuuu.main(args);
                }  else {
                    Util.printStr("Bu oyinchini sotib olish un pulingiz yetarli emas",Color.RED);
                    Magazm.main(args);
                }
            }
            case 2 -> main(args);
            default -> {
                System.out.println("Programm error! try again");
                Zame.main(args);
            }
        }
    }

    public static void casech(int ch) {
        String[] args = new String[0];
        BBVA_Teams[] values = BBVA_Teams.values();
        if (ch > 0 && ch < 21) {

            BBVA_Teams value = values[ch - 1];
            ArrayList<User> playres = new ArrayList<>();
            int i = 1;
            for (User user : PlRe.player) {
                if (user.team == value) {
                    playres.add(user);
                    System.out.println((i) + ". " + user.ismi);
                    i++;
                }
            }

            System.out.println("Choose ");
            int chose = scanner.nextInt();
            User user = playres.get(chose - 1);
            chpl(user);
            return;
        } else if (ch ==0) {
            Menyuuu.main(args);
        }
        System.out.println("error input");
        main(args);
    }
}


