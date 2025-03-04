package GeradorDeRelatorios.Formatacao;
import GeradorDeRelatorios.*;

public class FormatacaoCor implements Produto{
    
    /**
		Construtor da classe FormatacaoCor. 
		@param produto produto.
		@param cor cor que será aplicada ao texto do produto.
	*/

    private Produto produto;
    private String cor;

    public FormatacaoCor(Produto produto, String cor){
        this.produto = produto;
        this.cor = cor;
    }

    //setters

    public void setQtdEstoque(int qtdEstoque){
        this.produto.setQtdEstoque(qtdEstoque);
    }

	public void setPreco(double preco){
        this.produto.setPreco(preco);
    }

    //getters
	
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

    //reescrevendo o método formataParaImpressao para aplicar cor ao texto do produto
    
    @Override
    public String formataParaImpressao(){

        String formatoPadrao = produto.formataParaImpressao();

        return "<span style=\"color:"+this.cor+"\"> " + formatoPadrao + " </span>";
        
    }

}