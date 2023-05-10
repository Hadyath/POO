package trabalho;

public class Ingresso {
	private boolean eVip;
	private String formaDePagamento;
	private String nomeCliente;
	
	public Ingresso(boolean eVip, String formaDePagamento, String nomeCliente) {
		this.eVip = eVip;
		this.formaDePagamento = formaDePagamento;
		this.nomeCliente = nomeCliente;
	}
	
	public Ingresso() {
		
	}

	public boolean iseVip() {
		if(eVip == true) {
			System.out.println("O cliente é vip");
		return eVip;
		}else {
			System.out.println("O cliente não é vip");
		return eVip;
		}
		}
	

	public void seteVip(boolean eVip) {
		this.eVip = eVip;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	

}
