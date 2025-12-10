public class PayPal extends MetodoPago{
    public PayPal(double saldoDisponible) {
        super(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto) {
        double comision = 0.02 * monto;
        double totalPayPal = monto + comision;
        if (saldoDisponible >= totalPayPal) {
            saldoDisponible -= totalPayPal;
            System.out.println(
                    "\nMonto debitado => " + totalPayPal +
                            "\nSaldo disponible => " + saldoDisponible
            );
        } else {
            System.out.println("Error, no fue posible procesar la transaccion!! :(");
        }
    }
}

