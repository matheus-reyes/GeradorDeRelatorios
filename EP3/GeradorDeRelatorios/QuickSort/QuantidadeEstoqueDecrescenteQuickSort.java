package GeradorDeRelatorios.QuickSort;
import GeradorDeRelatorios.*;

public class QuantidadeEstoqueDecrescenteQuickSort implements CriterioOrdenacaoQuickSort{

	//Metodo que ordena o vetor de produtos em ordem decrescente de acordo com a quantidade em estoque dos mesmos

    @Override
    public int ordena(Produto[] produtos, int ini, int fim){

        Produto x = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while(true){

			do{ 
				j--;

			} while(produtos[j].getQtdEstoque() < x.getQtdEstoque());
		
			do{
				i++;

			} while(produtos[i].getQtdEstoque() > x.getQtdEstoque());

			if(i < j){
				Produto temp = produtos[i];
				produtos[i] = produtos[j]; 				
				produtos[j] = temp;
			}
			else return j;
		}

    }

}