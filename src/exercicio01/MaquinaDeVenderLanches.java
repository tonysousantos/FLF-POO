package exercicio01;

public class MaquinaDeVenderLanches {
	private Lanche lanche;
	private double valorTotal;
	public Lanche getLanche() {
		return lanche;
	}
	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void venderLanche(double valor) {
		double venda;
		double totalVenda;
		if(valor >= this.getLanche().getPreco()) {
			if(valor > this.getLanche().getPreco()) {
				double troco = valor -  this.getLanche().getPreco();
				System.out.println("\n");
				System.out.println("Venda concluida com sucesso!");
				System.out.println("O troco do cliente é: "+ troco);
				venda = (valor - troco);
				setValorTotal(getValorTotal() + venda);
				//totalVenda = getValorTotal();
			}else {
				System.out.println("\n");
				System.out.println("Venda concluida com sucesso!");
				this.setValorTotal(getValorTotal() + valor);
			}
			
		}else {
			System.out.println("Não foi possivel realizar a venda, valor inferior ao valor do lanche!");
		}
		
		System.out.println("Valor Total vendido: "+ getValorTotal());
	}
}
