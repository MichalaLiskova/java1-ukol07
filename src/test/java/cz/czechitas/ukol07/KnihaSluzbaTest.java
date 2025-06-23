package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {


    @Test
    void nactiSeznamVsechKnih() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> seznamKnih = knihaSluzba.nactiSeznamVsechKnih();
        assertNotNull(seznamKnih);
        assertEquals(14, seznamKnih.size() );
        assertTrue(seznamKnih.get(0) instanceof Kniha);
    }

    @Test
    void nactiAutora() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> seznamAutora = knihaSluzba.nactiAutora("Karel Čapek");
        assertNotNull(seznamAutora);
        assertEquals(5, seznamAutora.size() );
        assertTrue(seznamAutora.get(0) instanceof Kniha);
        seznamAutora = knihaSluzba.nactiAutora("Stephen King");
        assertNotNull(seznamAutora);
        assertEquals(0, seznamAutora.size() );
    }

    @Test
    void knihyVydaneVRoce() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihyVRoce = knihaSluzba.knihyVydaneVRoce(1856);
        assertNotNull(knihyVRoce);
        assertEquals(2, knihyVRoce.size() );
        assertTrue(knihyVRoce.get(0) instanceof Kniha);
        knihyVRoce = knihaSluzba.knihyVydaneVRoce(1974);
        assertNotNull(knihyVRoce);
        assertEquals(0, knihyVRoce.size() );
    }
}