public class Principal {

    public static void main(String[] args){

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();

        p1.adicionaIngrediente("calabresa");
        p1.adicionaIngrediente("tomate");

        p2.adicionaIngrediente("cebola");
        p2.adicionaIngrediente("presunto");
        p2.adicionaIngrediente("mussarela");

        p1.adicionaIngrediente("oregano");
        p1.adicionaIngrediente("azeitona");

        CarrinhoDeCompras.addPizza(p1);
        CarrinhoDeCompras.addPizza(p2);
        CarrinhoDeCompras.addPizza(p3);

        System.out.println("O total da compra foi de " + CarrinhoDeCompras.precoTotal + " reais.");


    }
}
