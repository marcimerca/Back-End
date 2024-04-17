package esercizio_3;

import java.util.Date;

public class Cliente {
    private String codiceCli;
    private String nomeECognome;
    private String email;
    private Date dataIscriz;

    public Cliente(String codiceCli, String nomeECognome, String email, Date dataIscriz ){
        this.codiceCli = codiceCli;
        this.nomeECognome = nomeECognome;
        this.email = email;
        this.dataIscriz = dataIscriz;
    }

    public String getCodiceCli() {
        return codiceCli;
    }

    public void setCodiceCli(String codiceCli) {
        this.codiceCli = codiceCli;
    }

    public String getNomeECognome() {
        return nomeECognome;
    }

    public void setNomeECognome(String nomeECognome) {
        this.nomeECognome = nomeECognome;
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

    public void setDataIscriz(Date  dataIscriz) {
        this.dataIscriz = dataIscriz;
    }
}
