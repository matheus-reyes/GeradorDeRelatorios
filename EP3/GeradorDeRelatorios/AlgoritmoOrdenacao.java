package GeradorDeRelatorios;
public interface AlgoritmoOrdenacao {
    
    /**
    * Metodo que ordena o vetor de produtos segundo um criterio de ordenacao especifico
    * @param criterio criterio de ordenacao dos produtos
    * @param produtos array de produtos
    * @param ini primeira posicao do vetor (ou sub-vetor) a ser ordenado
    * @param fim ultima posicao do vetor (ou sub-vetor) a ser ordenado
    */

    public void ordena(int criterio, Produto[] produtos, int ini, int fim);

}