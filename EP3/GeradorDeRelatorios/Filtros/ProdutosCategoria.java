package GeradorDeRelatorios.Filtros;
import GeradorDeRelatorios.*;
import java.io.PrintWriter;

public class ProdutosCategoria implements Filtro{

    /**
        Método que filtra por Categoria
		@param out arquivo de saída.
		@param argFiltro argumento que será utilizado para o filtro.
		@param produtos array de produtos.
		@param format_flags tipos de formatação (negrito, itálico ou nenhum).
	*/

    @Override
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags){

        int count = 0;

		for(int i = 0; i < produtos.length; i++){

			Produto p = produtos[i];

			if(p.getCategoria().equalsIgnoreCase((String)argFiltro)){

				defineFormatacao(out, format_flags, p);

				count++;
			}
        }
        
        return count;
    }
}