package GeradorDeRelatorios.QuickSort;
import GeradorDeRelatorios.*;

public class QuickSort implements AlgoritmoOrdenacao{

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