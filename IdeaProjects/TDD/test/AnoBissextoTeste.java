import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnoBissextoTeste {

    @Test
    public void deveRetornarAnoBissexto() {
        AnoBissexto anoBissexto = new AnoBissexto();

        assertEquals(true, anoBissexto.getAnoBissexto(2016));
        assertEquals(true, anoBissexto.getAnoBissexto(2012));
    }

    @Test
    public void naoDeveRetornarAnoBissexto() {
        AnoBissexto anoBissexto = new AnoBissexto();

        assertEquals(false, anoBissexto.getAnoBissexto(2015));
        assertEquals(false, anoBissexto.getAnoBissexto(2011));
    }

    private class AnoBissexto {
        public boolean getAnoBissexto(int ano) {
            if (((ano % 4) == 0) && ((ano % 100) != 0)) return true;
            else if ((ano % 400) == 0) return true;
            else return false;
        }


    }
}
