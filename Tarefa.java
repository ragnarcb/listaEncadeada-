public class Tarefa {
    private String descricao;
    private int codigo;
    private Tarefa proxima;

    public Tarefa(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.proxima = null;
    }

    public String getNome() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public Tarefa getProxima() {
        return proxima;
    }

    public void setProxima(Tarefa proxima) {
        this.proxima = proxima;
    }
}
