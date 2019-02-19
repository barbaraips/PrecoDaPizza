class CarrinhoDeCompras {

    static int precoTotal = 0;

    static void  addPizza(Pizza p){

        if(p.listaIngredientes.size() == 0)
            System.out.println("Pizza sem ingredientes");
        else
        precoTotal += p.getPreco();
    }

}


