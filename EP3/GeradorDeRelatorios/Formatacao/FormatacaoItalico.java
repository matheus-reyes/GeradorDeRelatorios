package GeradorDeRelatorios.Formatacao;
import GeradorDeRelatorios.*;

public class FormatacaoItalico implements Produto{

    /**
		Construtor da classe FormatacaoItalico. 
		@param produto produto.
	*/

    private Produto produto;

    public FormatacaoItalico(Produto produto){       
        this.produto = produto;    
    }

    //setters
    
    public void setQtdEstoque(int qtdEstoque){
        this.produto.setQtdEstoque(qtdEstoque);
    }

	public void setPreco(double preco){
        this.produto.setPreco(preco);
    }
    
    // getters

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

    //reescrevendo o método formataParaImpressao para aplicar itálico ao texto do produto
    
    @Override
    public String formataParaImpressao(){

        String formatoPadrao = produto.formataParaImpressao();
		
        return "<span style=\"font-style:italic\"> " + formatoPadrao + " </span>";

    }

}