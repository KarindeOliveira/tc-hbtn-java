import javax.naming.spi.StateFactory;

public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita){
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Tarefa(String descricao, int identificador){
        modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao){
        if(descricao.equals(null) || descricao.equals("")){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }else{
            setDescricao(descricao);
        }
    }
}