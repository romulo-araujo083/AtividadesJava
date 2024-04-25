public final class Roupa extends Produtos{
    public Roupa(String nome,double preço,TipoProduto tipo){
        super(nome,preço, tipo);
    }

    public void Roupas(){
        System.out.println("Roupa: "+nome + " custa " +"," + preço +" reias.");
    }
}