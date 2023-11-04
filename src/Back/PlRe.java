package Back;

import java.util.ArrayList;
import java.util.List;

public class PlRe {
    public static ArrayList<User> Zame = new ArrayList<>();
    public static ArrayList<User> player = new ArrayList<>();

    static {
        //Barca

        player.add(new User("Suarez",92,BBVA_Teams.BARCELONA, "ST",120_000_000));
        player.add(new User("Neymar",93,BBVA_Teams.BARCELONA, "ST",180_000_000));
        player.add(new User("Messi",95,BBVA_Teams.BARCELONA, "ST",180_000_000));
        player.add(new User("S.Busquets",86,BBVA_Teams.BARCELONA, "CM",6000000));
        player.add(new User("Iniesta",89,BBVA_Teams.BARCELONA, "CM",65000000));
        player.add(new User("Rakitic'",87,BBVA_Teams.BARCELONA, "CM",75000000));
        player.add(new User("Umtiti",85,BBVA_Teams.BARCELONA, "CB",100000000));
        player.add(new User("Pique",86,BBVA_Teams.BARCELONA, "CB",35000000));
        player.add(new User("S.Roberto",81,BBVA_Teams.BARCELONA, "CB",55000000));
        player.add(new User("Jordi Alba",87,BBVA_Teams.BARCELONA, "CB",65000000));
        player.add(new User("Ter-Stegen",85,BBVA_Teams.BARCELONA, "GK",80000000));
        //Real-Madrid
        player.add(new User("C.Ronaldo",94,BBVA_Teams.REAL_MADRID, "ST",180000000));
        player.add(new User("Benzema",82,BBVA_Teams.REAL_MADRID, "ST",80000000));
        player.add(new User("Bale",90,BBVA_Teams.REAL_MADRID, "ST",120_000_000));
        player.add(new User("Kross'",90,BBVA_Teams.REAL_MADRID, "CM",90_000_000));
        player.add(new User("Modric'",90,BBVA_Teams.REAL_MADRID, "CM",86_000_000));
        player.add(new User("Rodriguez",87,BBVA_Teams.REAL_MADRID, "CM",85_000_000));
        player.add(new User("Sergio RAmos",88,BBVA_Teams.REAL_MADRID, "CB",45000000));
        player.add(new User("Varane",83,BBVA_Teams.REAL_MADRID, "CB",5500000));
        player.add(new User("Carvajal",87,BBVA_Teams.REAL_MADRID, "CB",35_000_000));
        player.add(new User("Marcelo",89,BBVA_Teams.REAL_MADRID, "CB",40000000));
        player.add(new User("Navas",87,BBVA_Teams.REAL_MADRID, "GK",100000000));
//        Atletico
        player.add(new User("Grizman",89,BBVA_Teams.ATLETICO, "ST",100000_000));
        player.add(new User("Gameiro",88,BBVA_Teams.ATLETICO, "ST",100000000));
        player.add(new User("Carrasco",84,BBVA_Teams.ATLETICO, "ST",100000000));
        player.add(new User("Koke",86,BBVA_Teams.ATLETICO, "CM",100000000));
        player.add(new User("Gabi",85,BBVA_Teams.ATLETICO, "CM",100000000));
        player.add(new User("Saul",86,BBVA_Teams.ATLETICO, "CM",100000000));
        player.add(new User("Fellipe Luis",78,BBVA_Teams.ATLETICO, "CB",100000000));
        player.add(new User("Juanfran",79,BBVA_Teams.ATLETICO, "CB",100000000));
        player.add(new User("Savic'",80,BBVA_Teams.ATLETICO, "CB",100000000));
        player.add(new User("Godin",82,BBVA_Teams.ATLETICO, "CB",100000000));
        player.add(new User("Oblak",89,BBVA_Teams.ATLETICO, "GK",100000000));
        //Seviliya
        player.add(new User("Evgeniy",79,BBVA_Teams.SEVILIYA, "ST",1_000_000));
        player.add(new User("Hoakin",73,BBVA_Teams.SEVILIYA, "ST",1_000_000));
        player.add(new User("Lusianno",72,BBVA_Teams.SEVILIYA, "ST",1_000_000));
        player.add(new User("Iborra",86,BBVA_Teams.SEVILIYA, "CM",1_000_000));
        player.add(new User("Steve",76,BBVA_Teams.SEVILIYA, "CM",1_000_000));
        player.add(new User("Matias",75,BBVA_Teams.SEVILIYA, "CM",1_000_000));
        player.add(new User("Eskudero",85,BBVA_Teams.SEVILIYA, "CB",1_000_000));
        player.add(new User("Lenglet",78,BBVA_Teams.SEVILIYA, "CB",1_000_000));
        player.add(new User("MAriano'",80,BBVA_Teams.SEVILIYA, "CB",1_000_000));
        player.add(new User("Timote",82,BBVA_Teams.SEVILIYA, "CB",1_000_000));
        player.add(new User("Segio Roki",79,BBVA_Teams.SEVILIYA, "GK",1_000_000));
        //Jirona
        player.add(new User("Mikle",79,BBVA_Teams.JIRONA, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.JIRONA, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.JIRONA, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.JIRONA, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.JIRONA, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.JIRONA, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.JIRONA, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.JIRONA, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.JIRONA, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.JIRONA, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.JIRONA, "GK",1_000_000));
        //Bilbao
        player.add(new User("Iker",79,BBVA_Teams.BILBAO, "ST",1_000_000));
        player.add(new User("Markel",73,BBVA_Teams.BILBAO, "ST",1_000_000));
        player.add(new User("Mikel Sanxose",72,BBVA_Teams.BILBAO, "ST",1_000_000));
        player.add(new User("Xavi Erroso",86,BBVA_Teams.BILBAO, "CM",1_000_000));
        player.add(new User("Gorka",76,BBVA_Teams.BILBAO, "CM",1_000_000));
        player.add(new User("OSkar",75,BBVA_Teams.BILBAO, "CM",1_000_000));
        player.add(new User("Xabi",85,BBVA_Teams.BILBAO, "CB",1_000_000));
        player.add(new User("Inigo",78,BBVA_Teams.BILBAO, "CB",1_000_000));
        player.add(new User("Emerik",80,BBVA_Teams.BILBAO, "CB",1_000_000));
        player.add(new User("Eneko",82,BBVA_Teams.BILBAO, "CB",1_000_000));
        player.add(new User("Alex",79,BBVA_Teams.BILBAO, "GK",1_000_000));
        //Valenciya
        player.add(new User("Gansalu",79,BBVA_Teams.VALENCIYA, "ST",1_000_000));
        player.add(new User("Lusiano",73,BBVA_Teams.VALENCIYA, "ST",1_000_000));
        player.add(new User("Simon",72,BBVA_Teams.VALENCIYA, "ST",1_000_000));
        player.add(new User("Nacho",86,BBVA_Teams.VALENCIYA, "CM",1_000_000));
        player.add(new User("Andreas",76,BBVA_Teams.VALENCIYA, "CM",1_000_000));
        player.add(new User("MArtin",75,BBVA_Teams.VALENCIYA, "CM",1_000_000));
        player.add(new User("Tony",85,BBVA_Teams.VALENCIYA, "CB",1_000_000));
        player.add(new User("Xose",78,BBVA_Teams.VALENCIYA, "CB",1_000_000));
        player.add(new User("Jackson",80,BBVA_Teams.VALENCIYA, "CB",1_000_000));
        player.add(new User("Ruben",82,BBVA_Teams.VALENCIYA, "CB",1_000_000));
        player.add(new User("Neto",79,BBVA_Teams.VALENCIYA, "GK",1_000_000));
        //Kadis
        player.add(new User("Mikle",79,BBVA_Teams.KADIS, "ST",1_000_000));
        player.add(new User("Frankli",73,BBVA_Teams.KADIS, "ST",1_000_000));
        player.add(new User("Artur",72,BBVA_Teams.KADIS, "ST",1_000_000));
        player.add(new User("John",86,BBVA_Teams.KADIS, "CM",1_000_000));
        player.add(new User("Jack",76,BBVA_Teams.KADIS, "CM",1_000_000));
        player.add(new User("Rick",75,BBVA_Teams.KADIS, "CM",1_000_000));
        player.add(new User("Bro",85,BBVA_Teams.KADIS, "CB",1_000_000));
        player.add(new User("Riko",78,BBVA_Teams.KADIS, "CB",1_000_000));
        player.add(new User("Jinanji",80,BBVA_Teams.KADIS, "CB",1_000_000));
        player.add(new User("hjolaand",82,BBVA_Teams.KADIS, "CB",1_000_000));
        player.add(new User("De broooyne",79,BBVA_Teams.KADIS, "GK",1_000_000));
        //Hetafe
        player.add(new User("Mikle",79,BBVA_Teams.HETAFE, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.HETAFE, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.HETAFE, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.HETAFE, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.HETAFE, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.HETAFE, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.HETAFE, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.HETAFE, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.HETAFE, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.HETAFE, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.HETAFE, "GK",1_000_000));
        //Betis
        player.add(new User("Mikle",79,BBVA_Teams.REAL_BETIS, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.REAL_BETIS, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.REAL_BETIS, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.REAL_BETIS, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.REAL_BETIS, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.REAL_BETIS, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.REAL_BETIS, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.REAL_BETIS, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.REAL_BETIS, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.REAL_BETIS, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.REAL_BETIS, "GK",1_000_000));
        //REalSosedad
        player.add(new User("Mikle",79,BBVA_Teams.REAL_SOSEDAD, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.REAL_SOSEDAD, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.REAL_SOSEDAD, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.REAL_SOSEDAD, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.REAL_SOSEDAD, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.REAL_SOSEDAD, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.REAL_SOSEDAD, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.REAL_SOSEDAD, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.REAL_SOSEDAD, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.REAL_SOSEDAD, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.REAL_SOSEDAD, "GK",1_000_000));
        //Osasuna
        player.add(new User("Mikle",79,BBVA_Teams.OSASUNA, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.OSASUNA, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.OSASUNA, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.OSASUNA, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.OSASUNA, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.OSASUNA, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.OSASUNA, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.OSASUNA, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.OSASUNA, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.OSASUNA, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.OSASUNA, "GK",1_000_000));
        //Villiareal
        player.add(new User("Mikle",79,BBVA_Teams.VILLIAREAL, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.VILLIAREAL, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.VILLIAREAL, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.VILLIAREAL, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.VILLIAREAL, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.VILLIAREAL, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.VILLIAREAL, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.VILLIAREAL, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.VILLIAREAL, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.VILLIAREAL, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.VILLIAREAL, "GK",1_000_000));
        //Alaves
        player.add(new User("Mikle",79,BBVA_Teams.ALAVES, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.ALAVES, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.ALAVES, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.ALAVES, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.ALAVES, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.ALAVES, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.ALAVES, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.ALAVES, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.ALAVES, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.ALAVES, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.ALAVES, "GK",1_000_000));
        //Molorka
        player.add(new User("Mikle",79,BBVA_Teams.MALORKA, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.MALORKA, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.MALORKA, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.MALORKA, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.MALORKA, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.MALORKA, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.MALORKA, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.MALORKA, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.MALORKA, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.MALORKA, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.MALORKA, "GK",1_000_000));
        //Selta
        player.add(new User("Mikle",79,BBVA_Teams.SELTA, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.SELTA, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.SELTA, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.SELTA, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.SELTA, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.SELTA, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.SELTA, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.SELTA, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.SELTA, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.SELTA, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.SELTA, "GK",1_000_000));
        //Granda
        player.add(new User("Mikle",79,BBVA_Teams.GRANDA, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.GRANDA, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.GRANDA, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.GRANDA, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.GRANDA, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.GRANDA, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.GRANDA, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.GRANDA, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.GRANDA, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.GRANDA, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.GRANDA, "GK",1_000_000));
        //Almeriya
        player.add(new User("Mikle",79,BBVA_Teams.ALMERIYA, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.ALMERIYA, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.ALMERIYA, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.ALMERIYA, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.ALMERIYA, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.ALMERIYA, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.ALMERIYA, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.ALMERIYA, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.ALMERIYA, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.ALMERIYA, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.ALMERIYA, "GK",1_000_000));
        //Laspalmas
        player.add(new User("Mikle",79,BBVA_Teams.LAS_PALMAS, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.LAS_PALMAS, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.LAS_PALMAS, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.LAS_PALMAS, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.LAS_PALMAS, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.LAS_PALMAS, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.LAS_PALMAS, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.LAS_PALMAS, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.LAS_PALMAS, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.LAS_PALMAS, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.LAS_PALMAS, "GK",1_000_000));
        //Rayo
        player.add(new User("Mikle",79,BBVA_Teams.RAYO_VALEYKANO, "ST",1_000_000));
        player.add(new User("Portu",73,BBVA_Teams.RAYO_VALEYKANO, "ST",1_000_000));
        player.add(new User("Xristian",72,BBVA_Teams.RAYO_VALEYKANO, "ST",1_000_000));
        player.add(new User("David",86,BBVA_Teams.RAYO_VALEYKANO, "CM",1_000_000));
        player.add(new User("Pere Pons",76,BBVA_Teams.RAYO_VALEYKANO, "CM",1_000_000));
        player.add(new User("Alex",75,BBVA_Teams.RAYO_VALEYKANO, "CM",1_000_000));
        player.add(new User("Pedro",85,BBVA_Teams.RAYO_VALEYKANO, "CB",1_000_000));
        player.add(new User("Xonas",78,BBVA_Teams.RAYO_VALEYKANO, "CB",1_000_000));
        player.add(new User("Huanpe",80,BBVA_Teams.RAYO_VALEYKANO, "CB",1_000_000));
        player.add(new User("Bernardo",82,BBVA_Teams.RAYO_VALEYKANO, "CB",1_000_000));
        player.add(new User("Gorka",79,BBVA_Teams.RAYO_VALEYKANO, "GK",1_000_000));
    }
}
