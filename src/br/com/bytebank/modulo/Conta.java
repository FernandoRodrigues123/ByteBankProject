package br.com.bytebank.modulo;

import java.io.Serializable;

/**
 * classe q reprensenta uma conta
 * @author fernando
 *
 */

public abstract class Conta implements Serializable{
		
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
    private static int total = 0;
    /**
     * Construtor para inicializar um objeto com parametos
     * 
     * @param agencia
     * @param numero 
     */
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
 
    	this.agencia = agencia;
    	this.numero = numero;
    	//this.saldo = 100;
    	System.out.println("estou criando uma conta, numero >>> " + this.numero);
    	
    }
	
	 public Cliente getTitular() {
			return titular;
		}




		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
    
    
    
    
		public static int getTotal() {
		return total;
	}

		public double getSaldo() {
		return saldo;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}



		public abstract void deposita(double valor);
		/**
		 * valor tem que ser menor que o saldo
		 * @param valor
		 * @throws SaldoInsuificienteException
		 */
		
		public void saque(double valor) throws SaldoInsuificienteException {
			if(this.saldo < valor) {
				throw new SaldoInsuificienteException("seu saldo e " + this.saldo + ". O valor e maior que saldo " + valor);
		
			}
			{
			this.saldo = this.saldo - valor;
			}
		}
			
		public void transfere(double valor, Conta destino) throws SaldoInsuificienteException{
		this.saque(valor);
		destino.deposita(valor);
		
		}
		
		
		public boolean equals(Conta ref) {
			if(this.numero != ref.numero) {
				return false;
			}
			if(this.agencia != ref.agencia) {
				return false;
			}
			return true;
		}
		@Override
		public String toString() {
		
			return "Numero " + this.numero + ", " + " agencia " + this.agencia;
		}
		
				
		
	}


