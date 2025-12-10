public class TransferenciaBancaria extends MetodoPago {
    public TransferenciaBancaria(double saldoDisponible) {
        super(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto) {
        double totalPagar = monto + 5;
        if (saldoDisponible >= totalPagar) {
            saldoDisponible -= totalPagar;
            System.out.println(
                    "\nMonto debitado => " + totalPagar +
                            "\nSaldo disponible => " + saldoDisponible
            );
        } else {
            System.out.println("Error, no fue posible procesar la transferencia!! :(");
        }
    }
}
