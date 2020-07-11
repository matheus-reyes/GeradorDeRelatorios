package GeradorDeRelatorios.Filtros;

import java.io.PrintWriter;
import GeradorDeRelatorios.*;
import GeradorDeRelatorios.Formatacao.*;

public interface Filtro {

    /**
        Método padrao, utilizado igualmente por todas as classes que implementam a 
    interface Filtro, que define a formatacao que sera feita.
		@param out arquivo de saída.
		@param argFiltro argumento que será utilizado para o filtro.
		@param produtos array de produtos.
		@param format_flags tipos de formatação (negrito, itálico ou nenhum).
	*/
       
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags);

    default void defineFormatacao(PrintWriter out, int format_flags, Produto p){
        out.print("<li>");

        if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO ) > 0 && (format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

            Formatacao italicoNegrito = new FormatacaoItalicoNegrito(p);
            out.print(italicoNegrito.formataParaImpressao());

        } else if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO) > 0){
            
            Formatacao italico = new FormatacaoItalico(p);
            out.print(italico.formataParaImpressao());

        } else if((format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

            Formatacao negrito = new FormatacaoNegrito(p);
            out.print(negrito.formataParaImpressao());
        
        } else {

            Formatacao padrao = new FormatacaoPadrao(p);
            out.print(padrao.formataParaImpressao());

        }

        out.println("</li>");
    }

}