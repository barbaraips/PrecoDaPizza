import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Pizza {

    static Map<String, Integer> hm = new HashMap<String, Integer>();
    ArrayList<String> listaIngredientes = new ArrayList<String>();

    /* Todo: consertar o método, os ingredientes não estão sendo contados corretamente
     *  */
    private static void contabilizaIngrediente(ArrayList<String> list) {
        for (String ingrediente : list) {
            if (hm.containsKey(ingrediente)) {
                hm.replace(ingrediente, (hm.get(ingrediente) + 1));
            } else {
                hm.put(ingrediente, 1);
            }
        }
    }

    void adicionaIngrediente(String ingrediente){
        listaIngredientes.add(ingrediente);
        contabilizaIngrediente(listaIngredientes);
    }

    int getPreco() {

        int precoPizza = 0;

        if (0 < listaIngredientes.size() && listaIngredientes.size() <= 2) {
            precoPizza = 15;
        }
        else if(3 <=listaIngredientes.size()  && listaIngredientes.size()  <= 5){precoPizza = 20;}
        else if(listaIngredientes.size()  > 5){precoPizza = 23;}

        return precoPizza;

    }
}
