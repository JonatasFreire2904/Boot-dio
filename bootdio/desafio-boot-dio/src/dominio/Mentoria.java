
import java.time.LocalDate;

public class Mentoria {
    
    private String titulo;
    private String decricao;
    private LocalDate data;

    

    public Mentoria(LocalDate data, String decricao, String titulo) {
        this.data = data;
        this.decricao = decricao;
        this.titulo = titulo;
    }

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", decricao=" + decricao + ", data=" + data + "]";
    }

    

}
