package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;

public class PrecoDecrescenteInsertionSort implements CriterioOrdenacaoInsertionSort{
    
    //Método Preço Crescente
    public void ordena(Produto[] produtos, int ini, int fim){

        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= ini){

                if(x.getPreco() < produtos[j].getPreco()){
    
                    produtos[j + 1] = produtos[j];
                    j--;
                }

                else break;
            }

            produtos[j + 1] = x;
        }

    }

}