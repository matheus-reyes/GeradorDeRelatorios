package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;

public class PrecoDecrescenteInsertionSort implements CriterioOrdenacaoInsertionSort{
    
    @Override
    public void ordena(Produto[] produtos, int ini, int fim){

        //Percorre o array de produtos nas posições ini e fim
        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= ini){

                //Ordena os produtos levando em consideração o preço em ordem decrescente
                if(x.getPreco() > produtos[j].getPreco()){
    
                    produtos[j + 1] = produtos[j];
                    j--;
                }

                else break;
            }

            produtos[j + 1] = x;
        }

    }

}