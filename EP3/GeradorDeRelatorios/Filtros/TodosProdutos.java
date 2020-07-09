package GeradorDeRelatorios.Filtros;
import GeradorDeRelatorios.*;
import java.io.PrintWriter;

public class TodosProdutos implements Filtro{
    
    @Override
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags){

        int count = 0;

        for(int i = 0; i < produtos.length; i++){

            Produto p = produtos[i];
            
            out.print("<li>");

            if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO) > 0){
                //Lembrar de concatenar para reduzir os ifs de fechamento ===========================================================================
                out.print("<span style=\"font-style:italic\"> " + p.formataParaImpressao() + " </span>");
            } else if((format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

                out.print("<span style=\"font-weight:bold\"> " + p.formataParaImpressao() + " </span>");
            } else {
                
                out.print(p.formataParaImpressao());
            }
        

            // if((format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

            //     out.print("</span>");
            // } 

            // if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO) > 0){

            //     out.print("</span>");
            // }

            out.println("</li>");
            count++;

        }

        return count;

    }

}