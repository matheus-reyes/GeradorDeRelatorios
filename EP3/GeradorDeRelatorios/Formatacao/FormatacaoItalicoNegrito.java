package GeradorDeRelatorios.Formatacao;
import GeradorDeRelatorios.*;

public class FormatacaoItalicoNegrito implements Formatacao{

    private Produto produto;

    public FormatacaoItalicoNegrito(Produto produto){
        this.produto = produto;
    }
    
    @Override
    public String formataParaImpressao(){

        String formatoPadrao = produto.formataParaImpressao();
		
        return "<span style=\"font-style:italic\"> <span style=\"font-weight:bold\">" + formatoPadrao + " </span> </span>";

    }

}