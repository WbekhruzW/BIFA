package Back;

import java.util.ArrayList;

public class Oyinchi {
    private static String ism;
    private static BBVA_Teams jamo;
    private static ArrayList<User> sastav;
    private static long sure;
    private static int budj;
    private static ArrayList<User> Zame =new ArrayList<>();

    public  Oyinchi(String ism, BBVA_Teams jamo, ArrayList<User> sastav,long sumre) {
        this.ism = ism;
        this.jamo = jamo;
        this.sastav = sastav;
        this.sure = sumre;
    }

    public  Oyinchi(String ism, BBVA_Teams jamo, ArrayList<User> sastav,long sumre,ArrayList<User> ZAme) {
        this.ism = ism;
        this.jamo = jamo;
        this.sastav = sastav;
        this.sure = sumre;
        this.Zame = ZAme;
    }

    public  static String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public static BBVA_Teams getJamo() {
        return jamo;
    }

    public  static void setJamo(BBVA_Teams jamo) {
        Oyinchi.jamo = jamo;
    }

    public static ArrayList<User> getSastav() {
        return sastav;
    }

    public void setSastav(ArrayList<User> sastav) {
        this.sastav = sastav;
    }

    public static long getSure() {
        return sure;
    }

    public static void setSure(int sure) {
        Oyinchi.sure = sure;
    }

    public static ArrayList<User> getZame() {
        return Zame;
    }

    public static void setZame(ArrayList<User> zame) {
        Zame = zame;
    }
}
