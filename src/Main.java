//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TarjetaCredito tc = new TarjetaCredito(1000);
        PayPal paypal = new PayPal(2000);
        TransferenciaBancaria bc = new TransferenciaBancaria(3500);

        tc.realizarPago(1550);
        paypal.realizarPago(1500);
        bc.realizarPago(3000);
    }
}