package br.com.allen;
/**
 * 
 * @author Allen
 *
 */

public class Produto1 {
	
	//Create variables.
	
	private int codigo;
	private String descricao;
	private double preco;
	private int quantidade;
	private String enderecoFornecedor;
	private String imprimirProduto;
	
	//Create Get and Setters.
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getEnderecoFornecedor() {
		return enderecoFornecedor;
	}
	public void setEnderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}
	public String getImprimirProduto() {
		return imprimirProduto;
	}
	public void setImprimirProduto(String imprimirProduto) {
		this.imprimirProduto = imprimirProduto;
	}
	
	//Create Methods
	/**
	 * Serve para identificar o produto.
	 * @param codigo
	 */
	public void Codigo(int codigo) {
		this.codigo = codigo;
	}
	public void Descricao (String descricao) {
		this.descricao = descricao;
	}
	public void Preco (double preco) {
		this.preco = preco;
	}
	public void Quantidade (int quantidade) {
		this.quantidade = quantidade;
	}
	public void EnderecoFornecedor (String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}
	public void imprimirProduto(){
		System.out.println(this.codigo);
		System.out.println(this.descricao);
		System.out.println(this.preco);
		System.out.println(this.quantidade);
		System.out.println(this.enderecoFornecedor);
	}
}
