package Logicc;

import Front.Color;
import Front.Util;
import Logicc.Fpress;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        
        Scanner a= new Scanner(System.in);
        Util.printStr("To lunch the game just press <F + Enter>", Color.BLUE);
        String launch = a.next();
        switch (launch){
            case "f"->{
                Fpress.main(args);
            }
            case "F"->{
                Fpress.main(args);
            }
            default -> {
                Util.printStr("Error",Color.RED);
                Util.printStr("TO LAUNCH THE GAME JUST PRESS <F + ENTER>.",Color.YELLOW);
                main(args);
            }
        }
    }
}
