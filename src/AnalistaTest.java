import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnalistaTest {

@Test 
public void calculaValorDaHoraExtra(){
    //arrange
    Analista analistaCleiton = new Analista("cleiton", "12345678910");

    //act
    double valor = analistaCleiton.addHorasExtras(13);

    //assert
    assertEquals(13, valor, 0.01);
    }

@Test 
public void registraPagamento(){
    //arrange
    Analista analistaJorge = new Analista("jorge", "10987654321");

    //act
    double pagamento = analistaJorge.registrarPagamento();

    //assert
    assertEquals(4836, pagamento, 0.01);
}
}
