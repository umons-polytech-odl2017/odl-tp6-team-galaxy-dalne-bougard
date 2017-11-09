
import java.util.*;

public class Pizza {

    private String variety;
    private Collection <Ingredient> ingredientCollection = new ArrayList<>();







    public float ComputeSum(Collection<Ingredient> ingredientCollection){

        float somme=0;

        /*for (Ingredient ingredient : ingredientCollection) {
            somme += ingredient.getPrice();


        }*/
        /*Iterator<Ingredient> it = ingredientCollection.iterator();
        while (it.hasNext()) {
            Ingredient ingredient = it.next();
            somme+=ingredient.getPrice();
        }*/

        return  (float) ingredientCollection.stream().mapToDouble(Ingredient::getPrice).sum();
    }

}
