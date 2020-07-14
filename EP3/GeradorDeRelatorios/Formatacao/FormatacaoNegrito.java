package GeradorDeRelatorios.Formatacao;
import GeradorDeRelatorios.*;

public class FormatacaoNegrito implements Produto{
    
    private Produto produto;

    public FormatacaoNegrito(Produto produto){
        this.produto = produto;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.produto.setQtdEstoque(qtdEstoque);
    }

	public void setPreco(double preco){
        this.produto.setPreco(preco);
    }
	
	public int getId(){
        return this.produto.getId();
    }

	public String getDescricao(){
        return this.produto.getDescricao();
    }

	public String getCategoria(){
        return this.produto.getCategoria();
    }

	public int getQtdEstoque(){
        return this.produto.getQtdEstoque();
    }

	public double getPreco(){
        return this.produto.getPreco();
    }
    
    @Override
    public String formataParaImpressao(){

        String formatoPadrao = produto.formataParaImpressao();

        return "<span style=\"font-weight:bold\"> " + formatoPadrao + " </span>";
        
    }

}