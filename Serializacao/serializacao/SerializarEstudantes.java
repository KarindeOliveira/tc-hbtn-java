import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudantes> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        List<Estudante> lista = new ArrayList<>();

        try {
           FileOutputStream arquivo = new FileOutputStream("c:\\" + this.nomeArquivo + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(arquivo);
            oos.writeObject(estudantes);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Nao foi possivel serializar");


        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel serializar");
        }

    }

    @SuppressWarnings({"unchecked"})
    public List<Estudante> desserializar() {

        List<Estudante> estudante = new ArrayList<>();
        try {

        FileInputStream fis = new FileInputStream("c:\\" + this.nomeArquivo + ".ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        estudante = (List<Estudante>) ois.readObject();
        ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");

        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
       return estudante;
    }


}
