package Back;

import java.util.ArrayList;
import java.util.List;

public enum BBVA_Teams {
    BARCELONA("FC Barcelona",250_000_000),
    REAL_MADRID("Real Madrid",350_000_000),
    ATLETICO("Atletico Madrid",200_000_000),
    SEVILIYA("Seviliya",150_000_000),
    JIRONA("Jirona",70_000_00),
    BILBAO("Atletik",60_000_000),
    VALENCIYA("Valenciya",90_000_000),
    KADIS("Kadis",50_000_000),
    HETAFE("Hetafe",40_000_000),
    REAL_BETIS("Real Betis",110_000_000),
    REAL_SOSEDAD("Real sosedad",110_000_000),
    OSASUNA("Osasuna",140_000_000),
    VILLIAREAL("Villiareal",130_000_000),
    ALAVES("Alaves",90_000_000),
    MALORKA("MAlroka",60_000_000),
    SELTA("Selta",40_000_000),
    GRANDA("Granda",50_000_000),
    ALMERIYA("Almeriya",80_000_000),
    LAS_PALMAS("Las palmas",60_000_000),
    RAYO_VALEYKANO("Rayo Valeykano",90_000_000);

    public String nomi;
    public int budj;


    BBVA_Teams(String s, int i) {
        this.budj = i;
        this.nomi = s;
    }

}
