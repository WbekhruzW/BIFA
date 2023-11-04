package Logicc;

import Back.BBVA_Teams;
import Front.Color;

import java.util.Scanner;

public class TeamBBVA {
    private static String[] args;

    public static void BBva_team_menag(String nomi){
        Scanner scanner = new Scanner(System.in);
        BBVA_Teams[] values = BBVA_Teams.values();
        for (int i = 0; i <values.length; i++) {
            if (nomi.equals(values[i].nomi)){
                System.out.println("Klubingizni nomi: " +Color.BLUE +  values[i].nomi + Color.RESET);
                System.out.println("Klubingizni budjeti: " + Color.GREEN +  values[i].budj + Color.RESET + "\n1.Menagmentni boshlash.");
                int choooose = scanner.nextInt();
                switch (choooose){
                    case 1->{}
                    default -> {
                        System.out.println("Programm error, try again");
                        CreateAcc.main(args);
                    }
                }
            }
        }
    }
}
