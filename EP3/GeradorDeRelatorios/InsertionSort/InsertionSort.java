package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;


public class InsertionSort implements AlgoritmoOrdenacao{

    public void ordena(int criterio, Produto[] produtos, int ini, int fim){
		
		if(criterio == GeradorDeRelatorios.CRIT_DESC_CRESC){

			CriterioOrdenacao descricaoCrescente = new DescricaoCrescenteInsertionSort();
			descricaoCrescente.ordena(produtos, ini, fim);
		
		}else if(criterio == GeradorDeRelatorios.CRIT_PRECO_CRESC){

			CriterioOrdenacao precoCrescente = new PrecoCrescenteInsertionSort();
			precoCrescente.ordena(produtos, ini, fim);
			
		}else if(criterio == GeradorDeRelatorios.CRIT_ESTOQUE_CRESC){

			CriterioOrdenacao estoqueCrescente = new QuantidadeEstoqueCrescenteInsertionSort();
			estoqueCrescente.ordena(produtos, ini, fim);
			
		}else{

			throw new RuntimeException("Criterio invalido!");
		}

    }
}