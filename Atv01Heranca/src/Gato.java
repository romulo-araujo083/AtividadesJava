public class Gato extends Animal implements Som {
    public Gato(String nome, TipoAnimal tipo){
        super(nome,tipo);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " gato: "+" Mia");
    }
}