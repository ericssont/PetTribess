package m1s02;

public class Pet {
    private String nome;
    private String raca;
    private String tipo;
    private Tutor tutor;

    public Pet(String nome, String raca, String tipo) {
        this.nome = nome;
        this.raca = raca;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void adotar(Tutor tutor) {
        setTutor(tutor);
    }

    @Override
    public String toString() {
        return "Pet nome" + nome + ", raça=" + raca + ", tipo=" + tipo + ", tutor" + tutor ;
    }
}