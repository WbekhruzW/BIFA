package Logicc;

import Front.Color;
import Front.Util;

import java.util.concurrent.TimeUnit;

public class Fpress {
    public static void main(String[] args) {
        Util.printStr("\n\n                             \uD835\uDE3D\uD835\uDE40\uD835\uDE46\uD835\uDE43\uD835\uDE4D\uD835\uDE50\uD835\uDE55", Color.BLUE);
        try {
            TimeUnit.MILLISECONDS.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Util.printStr("                             Ｓｏｐｒｔｓ",Color.YELLOW);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("                             To the Game!");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CreateAcc.main(args);
    }
}
