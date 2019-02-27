import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CarrinhoDeComprasTest {

    @Test
    void retornaPrecoTest() {

        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("mussarela");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("tomates");
        p2.adicionaIngrediente("manjericão");
        p2.adicionaIngrediente("mussarela");

        Pizza p3 = new Pizza();

        CarrinhoDeCompras.addPizza(p1);
        CarrinhoDeCompras.addPizza(p2);
        CarrinhoDeCompras.addPizza(p3);

        assertEquals(2, CarrinhoDeCompras.numeroPizzas);
        assertEquals(35, CarrinhoDeCompras.retornaPreco());

    }

    @Test
    @BeforeAll
    void limpaListaTest() {
        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("aliche");
        p1.adicionaIngrediente("mussarela");
        p1.adicionaIngrediente("tomate");

        p1.zeraListaIngredientes(p1.listaIngredientes);
        assertEquals(0, p1.listaIngredientes.size());
    }
}