package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;

public interface CriterioOrdenacaoInsertionSort {

    /**
		Método chamado para ordenar um array de Produtos. 
        @param produtos array de produtos.
        @param ini posição inicial a ser ordenada.
        @param fim posição final a ser ordenada.
    */
    
    public void ordena(Produto[] produtos, int ini, int fim);

}