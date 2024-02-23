public class Utente {
    public static Utente instance;
    private String nome;
    private int eta;

    private Utente() {}
    public static Utente getIntance() {
        if (instance == null) {
            instance = new Utente();
            instance.setNome("Mario");
            instance.setEta(22);
        }
        return instance;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

}
