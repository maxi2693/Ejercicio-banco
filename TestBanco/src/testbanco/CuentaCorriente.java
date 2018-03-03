
package testbanco;


public class CuentaCorriente {
    private Cliente titular;
    private int nroCuenta;
    private double saldo;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular,int nroCuenta,double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular, int nroCuenta) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
    }
    
    public void depositar (double monto){
     double total = this.saldo + monto;
    }
    
    public void extraer (double monto){
        double total = this.saldo - monto;
    }

    public String imprimiendo() {
    
    return titular.getNombre()+titular.getApellido()+titular.getEdad();
            
    }
            
}
