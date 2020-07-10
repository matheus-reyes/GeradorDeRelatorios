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

				defineFormatacao(out, format_flags, p);

				count++;
			}
        }
        
        return count;
    }

}