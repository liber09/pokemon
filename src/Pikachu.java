// Pikachu ärver från pokemon(pikachu är en pokemon)
public class Pikachu extends Pokemons {
    public Pikachu(String name){
        super(name,"electric");
    }
    @Override
    public void attack(){
        System.out.println("Woooow Pikka! "+ this.name +" attack");
    }
}
