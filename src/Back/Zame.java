package Back;

import Logicc.Menyuuu;

import java.util.ArrayList;
import java.util.Scanner;

import static Logicc.CreateAcc.calculate;

public class Zame {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(" _____________________" +
                "\n|" + chizgin(Oyinchi.getZame()) + "|" +
                "\n|                     |" +
                "\n|                     |" +
                "\n|                     |" +
                "\n|_____________________|\n1.Sastavdga zamendilani qoshish \n2.Birinchi 11talikni ozgartish\n3.chiqib ketsh");
        int ok = scanner.nextInt();
        switch (ok){
            case 1->{
                System.out.println("Oyinchilani ozgartirish un ularning sonlarini kiriting\n13.orqaga");
                int a  = scanner.nextInt();
                if (a == 13){
                    Menyuuu.main(args);
                }
                int b  = scanner.nextInt();
                ozg(a,b);
            }
            case 2->Saszame.main(args);
            case 3-> Menyuuu.main(args);
            default -> {
                System.out.println("Programm error! try again");
                Zame.main(args);
            }
        }
    }
    private static String chizgin(ArrayList<User>arr){
        String res ="";
        for (int i = 0; i < arr.size(); i++) {
            User user = arr.get(i);
            res+=i+1+"."+user.getIsmi() + "  ";
        }
        return res;
    }
    public static void  ozg(int a,int b){
        String[] args = new String[0];
        User ney = Oyinchi.getSastav().get(a-1);
        User ran = Oyinchi.getZame().get(b-1);
        Oyinchi.getSastav().remove(a-1);
        Oyinchi.getSastav().add(a-1,ran);
        Oyinchi.getZame().add(ney);
        Oyinchi.getZame().remove(b-1);
        System.out.println("Tayyor👍");
        Oyinchi oyinchi = new Oyinchi(Oyinchi.getIsm(), Oyinchi.getJamo(), Oyinchi.getSastav(), calculate(Oyinchi.getSastav()), Oyinchi.getZame());
        System.out.println("Oyinchilani ozgartirish un ularning sonlarini kiriting\n13.orqaga");
        main(args);

    }
}
