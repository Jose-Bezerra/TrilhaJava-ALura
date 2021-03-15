package capitulo3.testes;

import capitulo3.modelos.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice fatura = new Invoice("0002342", "Camisas", -10, 1.0);
        double totalFatura = fatura.getInvoiceAmount();
        System.out.println(totalFatura);
    }
}
