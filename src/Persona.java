/**
 * La classe Persona aiuta la sviluppatore a gestire dati di tipo Persona
 * 
 * @author Marco La Porta
 * @version 1.0
 * @since 22/01/2025
 */
public class Persona {
    
    String nome;
    String cognome;
    String codice;

    /**
     * Costruisce un oggetto dato il nome, il cognome e il codice fiscale (trasformato in automatico in maiuscolo). Se CF non e' valido, viene lanciata un'eccezione.
     *
     *
     * CONTROLLO sul CODICE FISCALE::
     * <ul>
     *   <li>Il codice deve contenere 16 caratteri alfanumerici.</li>
     *   <li>It must not contain spaces.</li>
     *   <li>I primi 6 caratteri devono essere delle consonanti.</li>
     *   <li>Settimo e ottavo carattere devono essere numeri.</li>
     * </ul>
     * Consulta la Documentazione ufficiale String
     * Il testo è automaticamente convertito in MAIUSCOLO
     * 
     * Parametri:
     * @param nome - stringa qualsiasi da assegnare come nome di un nuovo oggetto Persona
     * @param cognome - stringa qualsiasi da assegnare come cognome di un nuovo oggetto Persona
     * @param codice - stringa che rappresenta il nuovo codice fiscale dell'oggetto Persona
     * @throws IllegalArgumentException if the tax code is invalid
     */
    public Persona(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = controlloCF(this.codice);
    }

    /**
     * Controllo del codice fiscale.
     * 
     * @param codice stringa che rappresenta il nuovo CF da controllare
     * @return la stringa del CF in convertita in maiuscolo
     * @throws IllegalArgumentException Se il codice fiscale fornito non e' valido
     */
    public String controlloCF(String codice){
        if (codice == null || !codice.matches("[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}")) {
            throw new IllegalArgumentException("Codice fiscale errato");
        }
        return codice.toUpperCase();
    }

     /**
     * restituisce una Stringa contenente il nome della persona
.
     *
     * @return il nome di un oggetto Persona
     */
    public String getNome() {
        return nome;
    }

     /**
     * assegna una Stringa come nome di una persona.
     *
     * @param nome Stringa da assegnare come nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * restituisce una Stringa contenente il cognome della persona.
     *
     * @return il cognome di un oggetto Persona
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * assegna una Stringa come cognome di una persona.
     *
     * @param cognome nuova stringa da assegnare come cognome a un oggetto Persona gia esistente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * Il metodo stabilisce se due persone sono omonime; 
     * Restituisce un booleano: VERO se le due persone hanno lo stesso nome (senza distinzione di maiuscole e minuscole) altrimenti FALSO
     *
     * @param p oggetto Persona
     * @return Vero se le due persone confrontate hanno lo stesso nome, altrimenti falso
     */
    public boolean isOmonimo(Persona p) {
        return this.nome.equalsIgnoreCase(p.nome);
    }

    /**
     *  Restituisce una rappresentazione testuale di un oggetto Persona, nel seguente formato "NOME:xx COGNOME:xx CF:xx"
     *
     * @return La rappresentazione testuale di un oggetto Persona
     */
    public String toString(){
        return "NOME: " + nome + " COGNOME: " + cognome + " CF: " + codice;
    }

    

}

