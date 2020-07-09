package GeradorDeRelatorios;
import GeradorDeRelatorios.InsertionSort.*;
import GeradorDeRelatorios.QuickSort.*;
import GeradorDeRelatorios.Filtros.*;
import java.io.PrintWriter;
import java.io.IOException;

/**
	A classe GeradorDeRelatorios é a classe principal do sistema. Seu papel é processar
	um array de Produtos e gerar uma listagem de produtos, seguindo certos critérios de ordenação
	e filtragem.
*/

public class GeradorDeRelatorios {

	//constantes estáticas que representam os identificadores dos algoritmos de ordenação InsertionSort e QuickSort 
	public static final int ALG_INSERTIONSORT = 0;
	public static final int ALG_QUICKSORT = 1;

	//constantes estáticas que representam os identificadores dos critérios (descrição, preço e estoque) em ordem crescente
	public static final int CRIT_DESC_CRESC = 0;
	public static final int CRIT_PRECO_CRESC = 1;
	public static final int CRIT_ESTOQUE_CRESC = 2;
	
	//constantes estáticas que representam os identificadores dos filtros (todos, estoque e categoria)
	public static final int FILTRO_TODOS = 0;
	public static final int FILTRO_ESTOQUE_MENOR_OU_IQUAL_A = 1;
	public static final int FILTRO_CATEGORIA_IGUAL_A = 2;

	//constantes estáticas que representam os identificadores dos formatos (padrão, negrito e itálico)
	public static final int FORMATO_PADRAO  = 0b0000;
	public static final int FORMATO_NEGRITO = 0b0001;
	public static final int FORMATO_ITALICO = 0b0010;
	
	/**
		Construtor da classe GeradorDeRelatorios. 
		@param produtos array de produtos.
		@param algoritmo algoritmo de ordenação.
		@param criterio critério de ordenação.
		@param format_flags tipos de formatação (negrito, itálico ou nenhum).
		@param filtro critério de filtragem.
		@param argFiltro argumento que será utilizado para o filtro.
	*/

	private Produto [] produtos;
	private int algoritmo;
	private int criterio;
	private int format_flags;
	private int filtro;
	private Object argFiltro;

	public GeradorDeRelatorios(Produto [] produtos, int algoritmo, int criterio, int format_flags, int filtro, Object argFiltro){

		this.produtos = produtos;
		this.algoritmo = algoritmo;
		this.criterio = criterio;
		this.format_flags = format_flags;
		this.filtro = filtro;
		this.argFiltro = argFiltro;
	}

	/**
		Método chamado para exportar o conteúdo HTML para um arquivo de saída. 
		@param arquivoSaida nome do arquivo de saida.
	*/
	
	public void geraRelatorio(String arquivoSaida) throws IOException {

		if(algoritmo == ALG_INSERTIONSORT){

			AlgoritmoOrdenacao insertionSort = new InsertionSort();
			insertionSort.ordena(criterio, produtos, 0, produtos.length - 1);

		} else if (algoritmo == ALG_QUICKSORT) {
			
			AlgoritmoOrdenacao quickSort = new QuickSort();
			quickSort.ordena(criterio, produtos, 0, produtos.length - 1);

		}

		PrintWriter out = new PrintWriter(arquivoSaida);

		out.println("<!DOCTYPE html><html>");
		out.println("<head><title>Relatorio de produtos</title></head>");
		out.println("<body>");
		out.println("Relatorio de Produtos:");
		out.println("<ul>");

		int count = 0;

		if(filtro == FILTRO_TODOS){

			Filtro todos = new TodosProdutos();
			count = todos.filtrar(out, argFiltro, produtos, format_flags);

		}else if(filtro == FILTRO_ESTOQUE_MENOR_OU_IQUAL_A){

			Filtro estoque = new ProdutosEstoque();
			count = estoque.filtrar(out, argFiltro, produtos, format_flags);

		}else if(filtro == FILTRO_CATEGORIA_IGUAL_A){

			Filtro categoria = new ProdutosCategoria();
			count = categoria.filtrar(out, argFiltro, produtos, format_flags);

		}

		out.println("</ul>");
		out.println(count + " produtos listados, de um total de " + produtos.length + ".");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

	/**
		Método que retorna o array de produtos carregado. 
	*/

	public static Produto [] carregaProdutos(){

		return new Produto [] { 

			new ProdutoPadrao( 1, "O Hobbit", "Livros", 2, 34.90),
			new ProdutoPadrao( 2, "Notebook Core i7", "Informatica", 5, 1999.90),
			new ProdutoPadrao( 3, "Resident Evil 4", "Games", 7, 79.90),
			new ProdutoPadrao( 4, "iPhone", "Telefonia", 8, 4999.90),
			new ProdutoPadrao( 5, "Calculo I", "Livros", 20, 55.00),
			new ProdutoPadrao( 6, "Power Glove", "Games", 3, 499.90),
			new ProdutoPadrao( 7, "Microsoft HoloLens", "Informatica", 1, 19900.00),
			new ProdutoPadrao( 8, "OpenGL Programming Guide", "Livros", 4, 89.90),
			new ProdutoPadrao( 9, "Vectrex", "Games", 1, 799.90),
			new ProdutoPadrao(10, "Carregador iPhone", "Telefonia", 15, 499.90),
			new ProdutoPadrao(11, "Introduction to Algorithms", "Livros", 7, 315.00),
			new ProdutoPadrao(12, "Daytona USA (Arcade)", "Games", 1, 12000.00),
			new ProdutoPadrao(13, "Neuromancer", "Livros", 5, 45.00),
			new ProdutoPadrao(14, "Nokia 3100", "Telefonia", 4, 249.99),
			new ProdutoPadrao(15, "Oculus Rift", "Games", 1, 3600.00),
			new ProdutoPadrao(16, "Trackball Logitech", "Informatica", 1, 250.00),
			new ProdutoPadrao(17, "After Burner II (Arcade)", "Games", 2, 8900.0),
			new ProdutoPadrao(18, "Assembly for Dummies", "Livros", 30, 129.90),
			new ProdutoPadrao(19, "iPhone (usado)", "Telefonia", 3, 3999.90),
			new ProdutoPadrao(20, "Game Programming Patterns", "Livros", 1, 299.90),
			new ProdutoPadrao(21, "Playstation 2", "Games", 10, 499.90),
			new ProdutoPadrao(22, "Carregador Nokia", "Telefonia", 14, 89.00),
			new ProdutoPadrao(23, "Placa Aceleradora Voodoo 2", "Informatica", 4, 189.00),
			new ProdutoPadrao(24, "Stunts", "Games", 3, 19.90),
			new ProdutoPadrao(25, "Carregador Generico", "Telefonia", 9, 30.00),
			new ProdutoPadrao(26, "Monitor VGA 14 polegadas", "Informatica", 2, 199.90),
			new ProdutoPadrao(27, "Nokia N-Gage", "Telefonia", 9, 699.00),
			new ProdutoPadrao(28, "Disquetes Maxell 5.25 polegadas (caixa com 10 unidades)", "Informatica", 23, 49.00),
			new ProdutoPadrao(29, "Alone in The Dark", "Games", 11, 59.00),
			new ProdutoPadrao(30, "The Art of Computer Programming Vol. 1", "Livros", 3, 240.00),
			new ProdutoPadrao(31, "The Art of Computer Programming Vol. 2", "Livros", 2, 200.00),
			new ProdutoPadrao(32, "The Art of Computer Programming Vol. 3", "Livros", 4, 270.00)
		};
	} 

	public static void main(String [] args) {
	
		Produto [] produtos = carregaProdutos();

		GeradorDeRelatorios gdr;

		// public static final int FORMATO_PADRAO  = 0b0000;
		// public static final int FORMATO_NEGRITO = 0b0001;
		// public static final int FORMATO_ITALICO = 0b0010;

		// public static final int FILTRO_TODOS = 0;
		// public static final int FILTRO_ESTOQUE_MENOR_OU_IQUAL_A = 1;
		// public static final int FILTRO_CATEGORIA_IGUAL_A = 2;

		gdr = new GeradorDeRelatorios(	produtos, ALG_QUICKSORT, CRIT_ESTOQUE_CRESC, 
						FORMATO_ITALICO, 
						//FILTRO_ESTOQUE_MENOR_OU_IQUAL_A, 100);
						FILTRO_ESTOQUE_MENOR_OU_IQUAL_A, 15);
		
		try{
			gdr.geraRelatorio("saida.html");
		}
		catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
