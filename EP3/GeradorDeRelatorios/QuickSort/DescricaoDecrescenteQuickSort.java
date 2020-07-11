package GeradorDeRelatorios.QuickSort;
import GeradorDeRelatorios.*;

public class DescricaoDecrescenteQuickSort implements CriterioOrdenacaoQuickSort{

 	//Metodo que ordena o vetor de produtos em ordem crescente de acordo com a descricao dos mesmos
   	@Override
    public int ordena(Produto[] produtos, int ini, int fim){

        Produto x = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while(true){

			do{ 
				j--;

			} while(produtos[j].getDescricao().compareToIgnoreCase(x.getDescricao()) < 0);
		
			do{
				i++;

			} while(produtos[i].getDescricao().compareToIgnoreCase(x.getDescricao()) > 0);
				
			if(i < j){
				Produto temp = produtos[i];
				produtos[i] = produtos[j]; 				
				produtos[j] = temp;
			}
			else return j;
		}
    }
    
}