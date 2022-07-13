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
        FileOutputStream arquivo = null;
        try {
            arquivo = new FileOutputStream("c:\\" + this.nomeArquivo + ".ser");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Nao foi possivel serializar");
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(arquivo);
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel serializar");
        }
        try {
            oos.writeObject(estudantes);
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel serializar");
        }
        try {
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel serializar");
        }

    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> estudante = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("c:\\" + this.nomeArquivo + ".ser");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Nao foi possivel desserializar");
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel desserializar");
        }
        try {
            estudante = (List<Estudante>) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Nao foi possivel desserializar");
        }
        try {
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel desserializar");
        }
        return estudante;
    }


}
