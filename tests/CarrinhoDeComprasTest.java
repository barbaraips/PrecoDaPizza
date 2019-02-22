import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoDeComprasTest {

    @Test
    void addPizza() {
        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("mussarela");

        Pizza p2 = new Pizza();

        CarrinhoDeCompras c = new CarrinhoDeCompras();

        CarrinhoDeCompras.addPizza(p1);

    }

    //Todo: criar método que limpa a lista de ingredientes e chamar em algum lugar
    @Test
    void retornaPreco() {

        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("mussarela");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("tomates");
        p2.adicionaIngrediente("manjericão");
        p2.adicionaIngrediente("mussarela");

        Pizza p3 = new Pizza();

        CarrinhoDeCompras c = new CarrinhoDeCompras();

        CarrinhoDeCompras.addPizza(p1);
        CarrinhoDeCompras.addPizza(p2);
        CarrinhoDeCompras.addPizza(p3);

        assertEquals(35, CarrinhoDeCompras.retornaPreco());

    }
}