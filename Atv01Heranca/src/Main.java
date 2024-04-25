public class Main {
    public static void main(String[] args){
        Gato gato = new Gato("Francisco", TipoAnimal.MAMIFERO);
        Cachorro cachorro = new Cachorro("Toin",TipoAnimal.MAMIFERO);
        Passaro passaro = new Passaro("Pica pau",TipoAnimal.AVE);
        Polimorfismo p  = new Polimorfismo();


        gato.emitirSom();
        cachorro.emitirSom();
        p.Voo(passaro);

    }
}