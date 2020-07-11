package GeradorDeRelatorios.QuickSort;
import GeradorDeRelatorios.*;

public interface CriterioOrdenacaoQuickSort {

    /**
    * Metodo que ordena o vetor de produtos segundo um criterio de ordenacao especifico
    * @param produtos eh o vetor de produtos recebido
    * @param ini primeira posicao do vetor (ou sub-vetor) a ser ordenado
    * @param fim ultima posicao do vetor (ou sub-vetor) a ser ordenado
    */

    public int ordena(Produto[] produtos, int ini, int fim);

}