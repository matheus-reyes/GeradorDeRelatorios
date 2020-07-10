package GeradorDeRelatorios.Formatacao;
import GeradorDeRelatorios.*;

public class FormatacaoPadrao implements Formatacao{
    
    private Produto produto;

    public FormatacaoPadrao(Produto produto){
        this.produto = produto;
    }
    
    @Override
    public String formataParaImpressao(){

        return produto.formataParaImpressao();
    
    }

}