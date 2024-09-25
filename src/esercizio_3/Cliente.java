package esercizio_3;

public class Cliente {
    private long codiceCliente;
    private String fullName;
    private String email;
    private String dataIscrizione;

    //Costruttore

    public Cliente(long codiceCliente, String fullName, String email, String dataIscrizione){
        this.codiceCliente = codiceCliente;
        this.fullName = fullName;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    //Getter per leggere i dati cliente

    public long getCodiceCliente(){
        return codiceCliente;
    }

    public String getFullName(){
        return fullName;
    }

    public String getEmail(){
        return email;
    }

    public String getDataIscrizione(){
        return dataIscrizione;
    }
    //Stampo il cliente
    @Override
    public String toString(){
        return "Cliente: " + fullName + "Codice cliente: " + codiceCliente + ". Email cliente: "+ email +" Data di iscrizione " + dataIscrizione;
    }
}
