package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;


public class InsertionSort implements AlgoritmoOrdenacao{

	@Override
    public void ordena(int criterio, Produto[] produtos, int ini, int fim){
		
		if(criterio == GeradorDeRelatorios.CRIT_DESC_CRESC){

			CriterioOrdenacaoInsertionSort descricaoCrescente = new DescricaoCrescenteInsertionSort();
			descricaoCrescente.ordena(produtos, ini, fim);
		
		}else if(criterio == GeradorDeRelatorios.CRIT_PRECO_CRESC){

			CriterioOrdenacaoInsertionSort precoCrescente = new PrecoCrescenteInsertionSort();
			precoCrescente.ordena(produtos, ini, fim);
			
		}else if(criterio == GeradorDeRelatorios.CRIT_ESTOQUE_CRESC){

			CriterioOrdenacaoInsertionSort estoqueCrescente = new QuantidadeEstoqueCrescenteInsertionSort();
			estoqueCrescente.ordena(produtos, ini, fim);
			
		}else if(criterio == GeradorDeRelatorios.CRIT_DESC_DECRESC){

			CriterioOrdenacaoInsertionSort descricaoDecrescente = new DescricaoDecrescenteInsertionSort();
			descricaoDecrescente.ordena(produtos, ini, fim);

		}else if(criterio == GeradorDeRelatorios.CRIT_PRECO_DECRESC){

			CriterioOrdenacaoInsertionSort precoDecrescente = new PrecoDecrescenteInsertionSort();
			precoDecrescente.ordena(produtos, ini, fim);
			
		}else if(criterio == GeradorDeRelatorios.CRIT_ESTOQUE_DECRESC){
			
			CriterioOrdenacaoInsertionSort estoqueDecrescente = new QuantidadeEstoqueDecrescenteInsertionSort();
			estoqueDecrescente.ordena(produtos, ini, fim);

		}else{

			throw new RuntimeException("Criterio invalido!");
		}

    }
}