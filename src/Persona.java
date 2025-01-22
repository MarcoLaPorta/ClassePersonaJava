public class Persona {
    
    String nome;
    String cognome;
    String codice;


    public Persona(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = controlloCF(this.codice);
    }


    public String controlloCF(String codice){
        if (codice == null || !codice.matches("[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}")) {
            throw new IllegalArgumentException("Codice fiscale errato");
        }
        return codice.toUpperCase();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    

    public boolean isOmonimo(Persona p) {
        return this.nome.equalsIgnoreCase(p.nome);
    }

    public String toString(){
        return "NOME: " + nome + " COGNOME: " + cognome + " CF: " + codice;
    }

    

}
