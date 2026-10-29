/**
 * Tipo concreto - Singleton (auto-associação de multiplicidade 1 no diagrama).
 */
public class TipoDocumentoMatricula implements TipoDocumento {

    private static TipoDocumentoMatricula instancia;

    private TipoDocumentoMatricula() { }

    public static TipoDocumentoMatricula getInstance() {
        if (instancia == null) {
            instancia = new TipoDocumentoMatricula();
        }
        return instancia;
    }

    @Override
    public boolean exigeAprovacao() {
        return false;
    }

    @Override
    public String getNome() {
        return "Declaração de Matrícula";
    }
}
