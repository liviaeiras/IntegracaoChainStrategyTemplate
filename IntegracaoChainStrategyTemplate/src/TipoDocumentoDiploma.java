/**
 * Tipo concreto - Singleton (auto-associação de multiplicidade 1 no diagrama).
 */
public class TipoDocumentoDiploma implements TipoDocumento {

    private static TipoDocumentoDiploma instancia;

    private TipoDocumentoDiploma() { }

    public static TipoDocumentoDiploma getInstance() {
        if (instancia == null) {
            instancia = new TipoDocumentoDiploma();
        }
        return instancia;
    }

    @Override
    public boolean exigeAprovacao() {
        return true;
    }

    @Override
    public String getNome() {
        return "Diploma";
    }
}
