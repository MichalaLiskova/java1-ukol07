package cz.czechitas.ukol07;

import java.io.IOException;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) throws IOException {

        KnihaSluzba knihaSluzba = new KnihaSluzba();
        System.out.println("Počet knih v databázi je:  " + knihaSluzba.nactiSeznamVsechKnih().size());
        System.out.println("Karel Čapek napsal tyto knihy: " + knihaSluzba.nactiAutora("Karel Čapek").stream().map(Kniha::getNazev).reduce((a, b) -> a + ", " + b).orElse(""));
        System.out.println("Knihy vydané v roe 1845: " + knihaSluzba.knihyVydaneVRoce(1845).stream().map(kniha -> kniha.getAutor()+": " + kniha.getNazev()).reduce((a, b) -> a + ", " + b).orElse(""));
    }

}

