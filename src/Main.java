import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pikachu pika1 = new Pikachu("Plutten");
        Pikachu pika2 = new Pikachu("Plexus");
        Bulbasour bulba1 = new Bulbasour("Burre");
        Bulbasour bulba2 = new Bulbasour("Blake");

        ArrayList<Pokemons> pokedex = new ArrayList<>();
        pokedex.add(pika1);
        pokedex.add(pika2);
        pokedex.add(bulba1);
        pokedex.add(bulba2);


        for(Pokemons p:pokedex){
            //System.out.println("Name: "+p.getName());
            p.attack();
        }
        bulba2.talk();

        
    }


}