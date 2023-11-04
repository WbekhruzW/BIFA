package Logicc;

import Back.BBVA_Teams;
import Back.Oyinchi;
import Back.User;
import Front.Color;
import Front.Util;

import java.util.ArrayList;
import java.util.Scanner;

import static Back.PlRe.player;

public class CreateAcc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nHi!\nOtingiz nma?");
        String usism = scanner.next();
        System.out.println("Hello! " + Color.BLUE + usism + Color.RESET + Color.YELLOW + " Fifa.Bekhruz Edition " + Color.RESET + "ga xush kelbsz!\nBu yerda sz Mezza qb FottbalTeam Menagment bn shug'ilanolisiz.   ");
        BBVA_Teams[] values = BBVA_Teams.values();
        for (int i = 0; i < values.length; i++) {
            System.out.print(Color.YELLOW + (i + 1) + "." + Color.RESET);
            System.out.print(Color.BLUE + values[i].nomi + Color.RESET);
            System.out.println(" Klubni budjeti: " + Color.GREEN + values[i].budj + Color.RESET);
        }
        int chtem = scanner.nextInt();
        switch (chtem) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> caselar(args, values[chtem - 1], usism);
            default -> {
                System.out.println("Programm error, try again");
                CreateAcc.main(args);
            }
        }

    }
   public static void caselar(String[] args, BBVA_Teams kam, String ism) {
        TeamBBVA.BBva_team_menag(kam.nomi);
        ArrayList<User> users = new ArrayList<>();
       for (User user : player) {
           if (user.team == kam)
               users.add(user);
       }
        Oyinchi oyinchi = new Oyinchi(ism, kam, users, calculate(users));
        Menyuuu.main(args);
    }

    public static long calculate(ArrayList<User> arr) {
        long count = 0;
        for (int i = 0; i < arr.size(); i++) {
            User user = arr.get(i);
            count += user.rate;
        }
        return count/11;
    }
}
