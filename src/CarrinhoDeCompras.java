class CarrinhoDeCompras {

    private static int precoTotal = 0;

    static void  addPizza(Pizza p){

        if (p.listaIngredientes.size() != 0)
            precoTotal += p.getPreco();
    }

    static int retornaPreco() {
        return precoTotal;
    }

}


