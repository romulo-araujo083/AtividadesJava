
public class Passaro extends Animal implements Voar {
    public Passaro(String nome, TipoAnimal tipo) {

        super(nome, tipo);
    }

    @Override
    public void Voar() {
        System.out.println(nome + " passaro: " + " Vaondo");
    }
}
