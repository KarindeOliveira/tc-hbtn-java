import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog(){
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem){
        posts.add(postagem);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<String>();
        Collections.sort(posts);
        for (Post autor: this.posts) {
            autores.add(autor.getAutor());
        }
        return autores;
    }
    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> category = new TreeMap<String, Integer>();
        Collections.sort(this.posts, new PostByCategory());
        for (Post post:this.posts) {
            if(category.containsKey(post.getCategoria())){
                category.put(post.getCategoria(), category.get(post.getCategoria())+1);
            }else{
                category.put(post.getCategoria(), 1);
            }
        }
        return category;
    }


    class PostByCategory implements Comparator<Post>{

        @Override

        public int compare(Post p1, Post p2) {

            return p1.getCategoria().compareTo(p2.getCategoria());

        }

    }

}

