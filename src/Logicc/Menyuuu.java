package Logicc;

import Back.*;
import Front.Color;
import Front.Util;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static Back.ReyPlus.tutle;

public class Menyuuu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "   " + Color.BLUE + Oyinchi.getIsm()+ Color.RESET + "                 " +  Color.RED + Oyinchi.getJamo()+ Color.RESET +  "    "+
                 "\n|---------------------------|------------------|    KUBOKLAR: " + Color.YELLOW + "Del rey" + Color.RESET + ":300 yutsa|" + Color.RED +"DE ESPANA : " + Color.RESET + "600 yutsa|" + Color.BLUE + "Champions league:" + Color.RESET + "1000" +
                 "\n|Keyingi oyinga otish un    |Magazinga kirish  |    Yutilgan: " + Color.BLUE + ReyPlus.kub +Color.RESET +
                 "\n|'D'knopkasini bosing       |un 'M'knopkasini  |    Yutqizilgan: "+ Color.BLUE + ReyPlus.yutq +Color.RESET +
                 "\n|                           |bosin             |    Oynalga: " + Color.BLUE + ReyPlus.oyin +Color.RESET +
                 "\n|                           |                  |"+
                 "\n|---------------------------|------------------|"+
                 "\n|" +  Oyinchi.getSastav() +"|"+
                 "\n|" + Oyinchi.getSure() + "|"+
                 "\n|Sastavni ozgartirish un 'S' ni bos            |"+ Color.GREEN + "Hamma yutligan kuboklarti korish un 'T' ni bosing" + Color.RESET+
                 "\n|----------------------------------------------|" +
                    Color.GREEN + "Transfer un pullar " + Color.RESET + Oyinchi.getJamo().budj;
        System.out.println(a);
        String md = scanner.next();
        if (Objects.equals(md, "m")){
            Magazm.main(args);
        } else if (Objects.equals(md, "d")) {
            ToPlay.main(args);
        }
          else if (Objects.equals(md,"s")) {
            Sastav.main(args);
            Zame.main(args);
        }
        else if (Objects.equals(md,"t")) {
            System.out.println(tutle);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            main(args);
        }
         else {
            Util.printStr("Programm error try again",Color.BLUE);
            Menyuuu.main(args);
        }
    }


}
