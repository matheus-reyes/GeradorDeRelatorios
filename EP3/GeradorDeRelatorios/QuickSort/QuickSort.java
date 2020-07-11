package GeradorDeRelatorios.QuickSort;
import GeradorDeRelatorios.*;

/**
 * Classe que controla a execucao do algoritmo de ordenacao do
 *  QuickSort, dependendo do criterio de ordenacao escolhido
 */

public class QuickSort implements AlgoritmoOrdenacao{

	//Metodo que, de acordo com o criterio de ordenacao escolhido, chama o metodo que ordena os produtos
	private int particiona(int criterio, Produto[] produtos, int ini, int fim){

		if(criterio == GeradorDeRelatorios.CRIT_DESC_CRESC){

			CriterioOrdenacaoQuickSort descricaoCrescente = new DescricaoCrescenteQuickSort();
			return descricaoCrescente.ordena(produtos, ini, fim);
		
		}else if(criterio == GeradorDeRelatorios.CRIT_PRECO_CRESC){

			CriterioOrdenacaoQuickSort precoCrescente = new PrecoCrescenteQuickSort();
			return precoCrescente.ordena(produtos, ini, fim);
			
		}else if(criterio == GeradorDeRelatorios.CRIT_ESTOQUE_CRESC){

			CriterioOrdenacaoQuickSort estoqueCrescente = new QuantidadeEstoqueCrescenteQuickSort();
			return estoqueCrescente.ordena(produtos, ini, fim);
			
		}else if(criterio == GeradorDeRelatorios.CRIT_DESC_DECRESC){

			CriterioOrdenacaoQuickSort descricaoDecrescente = new DescricaoDecrescenteQuickSort();
			return descricaoDecrescente.ordena(produtos, ini, fim);
		
		}else if(criterio == GeradorDeRelatorios.CRIT_PRECO_DECRESC){
		
			CriterioOrdenacaoQuickSort precoDecrescente = new PrecoDecrescenteQuickSort();
			return precoDecrescente.ordena(produtos, ini, fim);

		}else if(criterio == GeradorDeRelatorios.CRIT_ESTOQUE_DECRESC){

			CriterioOrdenacaoQuickSort estoqueDecrescente = new QuantidadeEstoqueDecrescenteQuickSort();
			return estoqueDecrescente.ordena(produtos, ini, fim);

		}else{
			
			throw new RuntimeException("Criterio invalido!");
		}
	}
	
	
	public void ordena(int criterio, Produto[] produtos, int ini, int fim){
		if(ini < fim) {

			int q = particiona(criterio, produtos, ini, fim);
			
			ordena(criterio, produtos, ini, q);
			ordena(criterio, produtos, q + 1, fim);
		}
	}

}