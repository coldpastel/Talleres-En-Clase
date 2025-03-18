public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositarDinero(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirarDinero(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("No se puede retirar el monto especificado.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
