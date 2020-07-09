package GeradorDeRelatorios.Filtros;
import GeradorDeRelatorios.*;
import java.io.PrintWriter;

public class ProdutosEstoque implements Filtro{
	
	@Override
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags){

        int count = 0;

		for(int i = 0; i < produtos.length; i++){

			Produto p = produtos[i];

			if(p.getQtdEstoque() <= (Integer) argFiltro){

				out.print("<li>");

				if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO) > 0){
					
					out.print("<span style=\"font-style:italic\"> " + p.formataParaImpressao() + " </span>");
				
				} else if((format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

					out.print("<span style=\"font-weight:bold\"> " + p.formataParaImpressao() + " </span>");
				
				} else{
					
					out.print(p.formataParaImpressao());
				}
			

				// if((format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

				// 	out.print("</span>");
				// } 

				// if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO) > 0){

				// 	out.print("</span>");
				// }

				out.println("</li>");
				count++;
			}
        }
        
        return count;
    }

}