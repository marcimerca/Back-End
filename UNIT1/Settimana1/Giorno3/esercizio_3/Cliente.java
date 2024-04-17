package esercizio_3;

import java.util.Date;

public class Cliente {
    private String codiceCli;
    private String nome;
    private String cognome;
    private String email;
    private Date dataIscriz;

    public Cliente(String codiceCli, String nome, String cognome, String email, Date dataIscriz) {
        this.codiceCli = codiceCli;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscriz = dataIscriz;
    }

    public String getCodiceCli() {
        return codiceCli;
    }

    public void setCodiceCli(String codiceCli) {
        this.codiceCli = codiceCli;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataIscriz() {
        return dataIscriz;
    }

    public void setDataIscriz(Date dataIscriz) {
        this.dataIscriz = dataIscriz;
    }
}
