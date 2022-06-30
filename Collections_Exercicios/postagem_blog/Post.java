public class Post implements Comparable<Post>{

    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Post{" +
                "titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Post post) {
        return this.getAutor().compareTo(post.getAutor());
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }


}
