package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;


public class QuantidadeEstoqueCrescenteInsertionSort implements CriterioOrdenacaoInsertionSort{
    
    @Override
    public void ordena(Produto[] produtos, int ini, int fim){

        //Percorre o Array de produtos nas posições ini e fim
        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= ini){

                //Ordena o array de produtos levando em consideração a quantidade em estoque de forma crescente
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