package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;


public class QuantidadeEstoqueCrescenteInsertionSort implements CriterioOrdenacao{
    
    public void ordena(Produto[] produtos, int ini, int fim){

        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= ini){

                if(x.getQtdEstoque() < produtos[j].getQtdEstoque()){
    
                    produtos[j + 1] = produtos[j];
                    j--;
                }
                
                else break;
        
            }

            produtos[j + 1] = x;
        }

    }

}