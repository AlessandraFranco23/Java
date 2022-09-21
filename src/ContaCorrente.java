public class ContaCorrente {
    public String numeroConta;
    public String agencia;
    public double saldo;
    public String nomeTitular;

    public ContaCorrente(String numeroConta, String agencia, double saldo, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular; 
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo -= valor;
    }
    
    @Override
    public String toString() {
        return "{" +
                " numeroConta='"+this.numeroConta+"'" +
                ", agencia='"+this.agencia+"'" +
                ", saldo='"+this.saldo+"'" +
                ", nomeTitular='"+this.nomeTitular+"'" +
                "}";
    }
}
