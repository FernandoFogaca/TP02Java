public class AuditoriaSpy implements Auditoria {

    public boolean foiChamado = false;

    public void registrarConsulta() {
        foiChamado = true;
    }

}