abstract class MetodoPago {
    protected double saldoDisponible;

    public MetodoPago(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void reembolsarPago(double monto) {
        saldoDisponible += monto;
        System.out.println(
                "Monto reembolsado => " + monto +
                        "Saldo disponible => " + saldoDisponible
        );
    }

    public void realizarPago(double monto) {}
}
