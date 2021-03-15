package capitulo3.modelos;

public class Invoice {

        private String numero;
        private String descricao;
        private int quantidade;
        private double preco;

        public Invoice(String numero, String descricao, int quantidade, double preco) {
                this.numero = numero;
                this.descricao = descricao;
                if (quantidade > 0) {
                        this.quantidade = quantidade;
                } else {
                        this.quantidade = 0;
                }
                if (preco > 0) {
                        this.preco = preco;
                } else {
                        this.preco = 0;
                }
        }


        public String getNumero() {
                return numero;
        }

        public void setNumero(String numero) {
                this.numero = numero;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public int getQuantidade() {
                return quantidade;
        }

        public void setQuantidade(int quantidade) {
                this.quantidade = quantidade;
        }

        public double getPreco() {
                return preco;
        }

        public void setPreco(double preco) {
                this.preco = preco;
        }

        public double getInvoiceAmount () {
                return this.quantidade * this.preco;
        }
}
