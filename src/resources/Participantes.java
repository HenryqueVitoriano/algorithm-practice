package resources;

public class Participantes {
    String nome;
    boolean isAssinante;
    int totalDeHorasAssistidas;
    double chancesSorteio;

    public Participantes(String nome, boolean isAssinante, int totalDeHorasAssistidas) {
        this.nome = nome;
        this.isAssinante = isAssinante;
        this.totalDeHorasAssistidas = totalDeHorasAssistidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAssinante() {
        return isAssinante;
    }

    public void setAssinante(boolean assinante) {
        isAssinante = assinante;
    }

    public int getTotalDeHorasAssistidas() {
        return totalDeHorasAssistidas;
    }

    public void setTotalDeHorasAssistidas(int totalDeHorasAssistidas) {
        this.totalDeHorasAssistidas = totalDeHorasAssistidas;
    }

    public double getChancesSorteio() {
        return chancesSorteio;
    }

    public void setChancesSorteio(double chancesSorteio) {
        this.chancesSorteio = chancesSorteio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
