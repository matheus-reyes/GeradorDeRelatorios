package GeradorDeRelatorios.Filtros;

import java.io.PrintWriter;

import GeradorDeRelatorios.*;
import GeradorDeRelatorios.Formatacao.*;

public interface Filtro {

    /**
        Método padrao, utilizado igualmente por todas as classes que implementam a 
        interface Filtro, que filtra os produtos.
		@param out PrintWriter que escreverá no arquivo de saída.
		@param argFiltro argumento que será utilizado para o filtro.
		@param produtos array de produtos.
		@param format_flags tipos de formatação (negrito, itálico ou nenhum).
    */
    
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags);
    
    /**
        Método padrao, que define a formatacao que sera feita.
		@param out PrintWriter que escreverá no arquivo de saída.
		@param format_flags tipos de formatação (negrito, itálico ou nenhum).
		@param p produto.
    */

    default void defineFormatacao(PrintWriter out, int format_flags, Produto p){
        out.print("<li>");

        if((format_flags & GeradorDeRelatorios.FORMATO_ITALICO) > 0){
            
            Produto italico = new FormatacaoItalico(p);
            out.print(italico.formataParaImpressao());

        } else if((format_flags & GeradorDeRelatorios.FORMATO_NEGRITO) > 0){

            Produto negrito = new FormatacaoNegrito(p);
            out.print(negrito.formataParaImpressao());
        
        } else {

            out.print(p.formataParaImpressao());

        }

        out.println("</li>");
    }

}