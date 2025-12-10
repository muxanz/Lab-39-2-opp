public class TarjetaCredito extends MetodoPago{

    public TarjetaCredito(double saldoDisponible) {
        super(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto) {
        if (saldoDisponible >= monto) {
            saldoDisponible -= monto;
            System.out.println(
                    "\nMonto debitado => " + monto +
                            "\nSaldo disponible => " + saldoDisponible
            );
        } else {
            System.out.println("Error, saldo insuficiente!! :(");
        }
    }
}

