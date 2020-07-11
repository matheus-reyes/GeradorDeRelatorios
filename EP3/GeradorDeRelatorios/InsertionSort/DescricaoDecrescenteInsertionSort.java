package GeradorDeRelatorios.InsertionSort;
import GeradorDeRelatorios.*;

public class DescricaoDecrescenteInsertionSort implements CriterioOrdenacaoInsertionSort{
    
    @Override
    public void ordena(Produto[] produtos, int ini, int fim){

        //Percorre o array de produtos nas posições ini e fim
        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= ini){

                //Compara a descrição do produto, desconsiderando diferenças entre maiúsculas e minúsculas, e as posiciona de forma crescente
                if( x.getDescricao().compareToIgnoreCase(produtos[j].getDescricao()) > 0 ){
    
                    produtos[j + 1] = produtos[j];
                    j--;
                }
                else break;
            
            }

            produtos[j + 1] = x;
		}
    }

}