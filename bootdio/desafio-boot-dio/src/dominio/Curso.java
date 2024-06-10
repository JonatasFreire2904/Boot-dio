public class Curso {

    private String titulo;
    private String decricao;
    private double cargaHoraria;

    public Curso() {
    }

    public Curso(double cargaHoraria, String decricao, String titulo) {
        this.cargaHoraria = cargaHoraria;
        this.decricao = decricao;
        this.titulo = titulo;
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

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", decricao=" + decricao + ", cargaHoraria=" + cargaHoraria + "]";
    }

    

}
