public class Pessoa implements Comparable<Pessoa>{

    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private int salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, int salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }

    @Override
    public String toString() {
        return "[" + this.codigo + "]" + " " + this.nome  + " " + this.cargo +" "+ this.idade+ " " + "R$" + " " + this.salario;
    }
}
