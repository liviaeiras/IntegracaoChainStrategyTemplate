/**
 * Tipo concreto - Singleton (auto-associação de multiplicidade 1 no diagrama).
 */
public class TipoDocumentoCertificado implements TipoDocumento {

    private static TipoDocumentoCertificado instancia;

    private TipoDocumentoCertificado() { }

    public static TipoDocumentoCertificado getInstance() {
        if (instancia == null) {
            instancia = new TipoDocumentoCertificado();
        }
        return instancia;
    }

    @Override
    public boolean exigeAprovacao() {
        return true;
    }

    @Override
    public String getNome() {
        return "Certificado";
    }
}
