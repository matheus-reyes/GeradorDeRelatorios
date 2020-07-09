package GeradorDeRelatorios.QuickSort;
import GeradorDeRelatorios.*;

public class PrecoCrescenteQuickSort implements CriterioOrdenacaoQuickSort{
	
	@Override
    public int ordena(Produto[] produtos, int ini, int fim){

        Produto x = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while(true){

			do{ 
				j--;

			} while(produtos[j].getPreco() > x.getPreco());
		
			do{
				i++;

			} while(produtos[i].getPreco() < x.getPreco());
		
			if(i < j){
				Produto temp = produtos[i];
				produtos[i] = produtos[j]; 				
				produtos[j] = temp;
			}
			else return j;
		}

    }

}