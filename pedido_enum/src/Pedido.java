import jdk.jshell.Snippet;

public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status;


    public Pedido() {
    }

    public Pedido(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }


    public void avancarStatus(Pedido pedido) {
        IO.println("Status do pedido: ");
        if (pedido.getStatus() == StatusPedido.AGUARDANDO_PAGAMENTO) {
            pedido.setStatus(StatusPedido.PROCESSANDO);
        } else if (pedido.getStatus() == StatusPedido.PROCESSANDO) {
            pedido.setStatus(StatusPedido.ENVIADO);
        } else if (pedido.getStatus() == StatusPedido.ENVIADO) {
            pedido.setStatus(StatusPedido.ENTREGUE);
        } else {
            IO.println("O status não pode ser alterado.");
        }


    }

    public void cancelarPedido() {
        if (status != StatusPedido.ENTREGUE) {
            IO.println("Pedido cancelado com sucesso!");

        } else {
            IO.println("O pedido foi não é possível cancelar");
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                '}';
    }
}
