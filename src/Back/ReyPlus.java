package Back;

import Front.Color;
import Front.Util;
import Logicc.CreateAcc;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static Logicc.CreateAcc.calculate;

public class ReyPlus {
    public static int kub;
    public static int oyin;
    public static int yutq;
    public static String tutle;
    public static Oyinchi rey(long a){
        Random b = new Random();
        int ran = b.nextInt( 0, 100);
        if (kub==5){
            tutle = tutle + Kub.delrey;
            int i = Oyinchi.getJamo().budj + 5000000;
            System.out.println(Color.RED + "TABTIKLAYMAN SIZ COPA DEL REY YUTIB OLDINGIZ!\nSiz uje 300 oyin yuttingiz! 500000$ budjetga qoshildi" + Color.RESET);
            System.out.println(Kub.delrey);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if (kub == 10){
            tutle = tutle +Kub.supercup;
            int i = Oyinchi.getJamo().budj + 10_000_000;
            System.out.println(Color.RED + "TABTIKLAYMAN SIZ COPA SUPER CUP YUTIB OLDINGIZ!\nSiz uje 600 oyin yuttingiz! 100000$ budjetga qoshildi" + Color.RESET);
            System.out.println(Kub.supercup);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if (kub == 15){
            tutle = tutle + Kub.champions;
            int i = Oyinchi.getJamo().budj + 100_000_000;
            System.out.println(Color.RED + "TABTIKLAYMAN SIZ COPA CHAMPIONS LEAGUE YUTIB OLDINGIZ!\nSiz uje 1000 oyin yuttingiz! 10000000$ budjetga qoshildi" + Color.RESET);
            System.out.println(Kub.champions);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (a < ran){
            oyin++;
            yutq++;
            Random random = new Random();
            int yutqzdn = random.nextInt(0,5);
            int yutqzdn1 = random.nextInt(0,5);
            while (yutqzdn1 <= yutqzdn){
                yutqzdn = random.nextInt(0,5);
                yutqzdn1 = random.nextInt(0,5);
            }

            Util.printStr("Yutqizdin", Color.RED);
            int i = Oyinchi.getJamo().budj - 5000000;
            ToPlay.olmol(yutqzdn1,yutqzdn);
            Util.printStr(   "Budjutdan 500000$ yechildi!\nBudjetdi pul: \n\n" + Oyinchi.getJamo().budj,Color.RED);
            Oyinchi.getJamo().budj = i;
        }
        else{Random random = new Random();
            int yutn = random.nextInt(0,5);
            int yutn1 = random.nextInt(0,5);
            while (yutn1 <= yutn){
                 yutn = random.nextInt(0,5);
                 yutn1 = random.nextInt(0,5);
            }
            oyin++;
            kub++;
            Util.printStr("Yutin",Color.BLUE);
            int i = Oyinchi.getJamo().budj + 2500000;
            ToPlay.olmol(yutn,yutn1);
            Util.printStr( "Budjutga 250000$ qoshildi!\nBudjetdi pul: \n\n" + Oyinchi.getJamo().budj,Color.GREEN);
            Oyinchi.getJamo().budj = i;
            Oyinchi oyinchi = new Oyinchi(Oyinchi.getIsm(), Oyinchi.getJamo(), Oyinchi.getSastav(), calculate(Oyinchi.getSastav()), Oyinchi.getZame());
        }

        return null;
    }
}
