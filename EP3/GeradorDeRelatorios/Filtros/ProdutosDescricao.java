package GeradorDeRelatorios.Filtros;
import GeradorDeRelatorios.*;
import java.io.PrintWriter;

public class ProdutosDescricao implements Filtro{
    
    @Override
    public int filtrar(PrintWriter out, Object argFiltro, Produto[] produtos, int format_flags){
        int count = 0;

		for(int i = 0; i < produtos.length; i++){

			Produto p = produtos[i];

			//Filtra os produtos que contém a descrição especificada
			if(p.getDescricao().toLowerCase().contains((String)argFiltro)){

				defineFormatacao(out, format_flags, p);

				count++;
			}
        }
        
        return count;
    }

}