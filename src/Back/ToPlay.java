package Back;

import Front.Color;
import Front.Util;
import Logicc.Menyuuu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ToPlay {

    public static BBVA_Teams rando() {
        BBVA_Teams[] values = BBVA_Teams.values();
        Random b = new Random();
        int ran = b.nextInt(0, 20);
        BBVA_Teams value = values[ran];
        while (value == Oyinchi.getJamo()){
             value = values[b.nextInt(0, 20)];
        }
        return value;


    }


    public static void main(String[] args) {
        oyinchilarr();
        Scanner scanner = new Scanner(System.in);
        System.out.println(rando().nomi +"|VS|" +  Oyinchi.getJamo().nomi + "\n1.Oynash\n2.Chiqib ketish");
        int s = scanner.nextInt();
        switch (s){
            case 1 -> {
                ReyPlus.rey(Oyinchi.getSure());
                main(args);
            }
            case 2->{
                Menyuuu.main(args);
            }
            default -> {
                Util.printStr("Programm Error try again", Color.BLUE);
                main(args);
            }
        }
    }
    public static void olmol(int a,int b){
        System.out.println(rando() + " " + a + " : " +b +" "+ Oyinchi.getJamo().nomi );
        for (int i = 0; i < a; i++) {
            Random d = new Random();
            int c = d.nextInt(0, 7);
            User user = playres.get(c);
            System.out.println(user.getIsmi());
        }
        for (int i = 0; i < b; i++) {
            Random d = new Random();
            int c = d.nextInt(0, 10);
            User user = Oyinchi.getSastav().get(c);
            System.out.println("                    " + user.getIsmi());
        }
    }
    private static ArrayList<User> playres = new ArrayList<>();
    public static void oyinchilarr(){
        for (User user : PlRe.player) {
            if (user.team == rando()) {
                playres.add(user);
            }
        }
    }
}
