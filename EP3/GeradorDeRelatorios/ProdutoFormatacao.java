package GeradorDeRelatorios;

public class ProdutoFormatacao {
    
    private ProdutoPadrao produto;
    
    public String formataParaImpressao(int format_flags){

        String formatoPadrao = produto.formataParaImpressao();

        if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO) > 0){
					
            return "<span style=\"font-style:italic\"> " + formatoPadrao + " </span>";

        } else if((format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

            return "<span style=\"font-weight:bold\"> " + formatoPadrao + " </span>";
        
        } else {

            return formatoPadrao;

        }

    
    }

}