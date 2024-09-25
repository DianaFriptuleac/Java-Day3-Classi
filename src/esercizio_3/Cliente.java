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
}
