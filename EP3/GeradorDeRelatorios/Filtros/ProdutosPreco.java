package GeradorDeRelatorios.Filtros;
import GeradorDeRelatorios.*;
import java.io.PrintWriter;

public class ProdutosPreco implements Filtro{
    
    @Override
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags){
        String filtro = (String) argFiltro;
        String[] precos = filtro.split(",");

        int count = 0;

		for(int i = 0; i < produtos.length; i++){

			Produto p = produtos[i];

			if(p.getPreco() >= Double.parseDouble(precos[0]) && p.getPreco() <= Double.parseDouble(precos[1])){

				defineFormatacao(out, format_flags, p);

				count++;
			}
        }
        
        return count;
    }
    
}