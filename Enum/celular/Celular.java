import java.util.*;

public class Celular {


    private ArrayList<Contato> cel = new ArrayList<Contato>();


    public int obterPosicaoContato(String nome) {
        for (int i = 0; i < this.cel.size(); i++) {
            if (cel.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }


    public void adicionarContato(Contato nome){
        if(obterPosicaoContato(nome.getNome()) == -1){
            cel.add(nome);
        }else{
           throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }


    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if(obterPosicaoContato(contatoAntigo.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if((obterPosicaoContato(novoContato.getNome()) != -1) && (obterPosicaoContato(novoContato.getNome())!=obterPosicaoContato(contatoAntigo.getNome()))){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        cel.set(obterPosicaoContato(contatoAntigo.getNome()),novoContato);
    }




    public void removerContato(Contato nome) {
        if(obterPosicaoContato(nome.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else{
            cel.remove(obterPosicaoContato(nome.getNome()));
        }
    }


    public void listarContatos(){
        for(int i = 0; i < cel.size(); i++){
            System.out.println(cel.get(i).getNome()+" -> "+cel.get(i).getNumTel()+" "+"("+cel.get(i).getTipoNumero()+")");
        }
    }
}