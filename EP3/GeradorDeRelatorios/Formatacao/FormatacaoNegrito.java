package GeradorDeRelatorios.Formatacao;
import GeradorDeRelatorios.*;

public class FormatacaoNegrito implements Formatacao{
    
    private Produto produto;

    public FormatacaoNegrito(Produto produto){
        this.produto = produto;
    }

    @Override
    public String formataParaImpressao(){

        String formatoPadrao = produto.formataParaImpressao();

        return "<span style=\"font-weight:bold\"> " + formatoPadrao + " </span>";
        
    }

}