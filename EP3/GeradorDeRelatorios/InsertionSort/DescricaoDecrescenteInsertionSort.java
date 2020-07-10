package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;

public class DescricaoDecrescenteInsertionSort implements CriterioOrdenacaoInsertionSort{
    
    //Método do Decricao Crescente
    public void ordena(Produto[] produtos, int ini, int fim){

        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= ini){

                if( x.getDescricao().compareToIgnoreCase(produtos[j].getDescricao()) < 0 ){
    
                    produtos[j + 1] = produtos[j];
                    j--;
                }
                else break;
            
            }

            produtos[j + 1] = x;
		}
    }

}