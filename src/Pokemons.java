abstract class Pokemons {
    protected String name;
    private String type;

    public Pokemons(String name,String type){
        this.name = name;
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public void attack(){
        System.out.println(this.name+" Attacks");
    }

}
