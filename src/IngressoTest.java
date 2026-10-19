import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class IngressoTest {
    
    @Test
    public void testCalcularValorIngressoComDoisAdicionais(){
        Regular ingresso = new Regular("Batman", LocalDateTime.now());
        EAdicional a1 = EAdicional.PIPOCA;
        EAdicional a2 = EAdicional.BALDE_ESPECIAL;

        ingresso.incluir(a1);
        ingresso.incluir(a2);

        double valorIngresso = ingresso.valorIngresso();
        
        assertEquals(61, valorIngresso, 0.01);
    }

}
