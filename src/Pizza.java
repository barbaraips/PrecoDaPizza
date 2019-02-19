import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Pizza {

    // hashmap to store the frequency of element
    public Map<String, Integer> hm = new HashMap<String, Integer>();
    public ArrayList<String> listaIngredientes = new ArrayList<String>();

    void adicionaIngrediente(String ingrediente){
        listaIngredientes.add(ingrediente);
        //contabilizaIngrediente(listaIngredientes);
    }


    public int getPreco(){

        int precoPizza = 0;

        if(listaIngredientes.size() == 0) {
            System.out.println("Quantidade de tipoIngred invalida");

        }
        else if(0 < listaIngredientes.size()  && listaIngredientes.size()  <= 2) {precoPizza = 15;}
        else if(3 <=listaIngredientes.size()  && listaIngredientes.size()  <= 5){precoPizza = 20;}
        else if(listaIngredientes.size()  > 5){precoPizza = 23;}

        return precoPizza;

    }
}
