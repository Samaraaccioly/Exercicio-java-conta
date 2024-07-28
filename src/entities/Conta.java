package entities;

public class Conta {
    private String numConta;
    private String titular;
    private double saldo;

    public Conta(String numConta, String titular, double depositoInicial) {
        this.numConta = numConta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public Conta(String numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo = saldo - (valor + 5);
    }

    @Override
    public String toString() {
        return "Conta" +
                "numConta='" + numConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo= R$" + String.format("%.2f", saldo);
    }
}

