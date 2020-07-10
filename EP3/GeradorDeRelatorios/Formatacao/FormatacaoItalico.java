package GeradorDeRelatorios.Formatacao;
import GeradorDeRelatorios.*;

public class FormatacaoItalico implements Formatacao{

    private Produto produto;

    public FormatacaoItalico(Produto produto){
        this.produto = produto;
    }
    
    @Override
    public String formataParaImpressao(){

        String formatoPadrao = produto.formataParaImpressao();
		
        return "<span style=\"font-style:italic\"> " + formatoPadrao + " </span>";

    }

}