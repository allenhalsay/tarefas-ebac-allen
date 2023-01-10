package br.com.allen;
/**
 * 
 * @author Allen
 *
 */

public class Objeto1 {

	public static void main(String[] args) {
		Produto1 produto1 = new Produto1();
		Produto2 produto2 = new Produto2();
		
		//Product 1
		produto1.setCodigo(980);
		produto1.setDescricao("Notebook");
		produto1.setPreco(999.99);
		produto1.setQuantidade(10);
		produto1.setEnderecoFornecedor("Rua 1");
		produto1.imprimirProduto();
		System.out.println("-----------------------------------");
		
		//Product 2
		produto2.setCodigo(981);
		produto2.setDescricao("Mouse");
		produto2.setPreco(39.05);
		produto2.setQuantidade(3);
		produto2.setEnderecoFornecedor("Rua 2");
		produto2.imprimirProduto();
	}
}
