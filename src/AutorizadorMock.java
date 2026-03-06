public class AutorizadorMock implements AutorizadorReembolso {

    private boolean autorizado;

    public AutorizadorMock(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public boolean autorizar() {
        return autorizado;
    }

}