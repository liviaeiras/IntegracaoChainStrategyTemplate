/**
 * Tipo concreto - Singleton (auto-associação de multiplicidade 1 no diagrama).
 */
public class TipoDocumentoHistorico implements TipoDocumento {

    private static TipoDocumentoHistorico instancia;

    private TipoDocumentoHistorico() { }

    public static TipoDocumentoHistorico getInstance() {
        if (instancia == null) {
            instancia = new TipoDocumentoHistorico();
        }
        return instancia;
    }

    @Override
    public boolean exigeAprovacao() {
        return false;
    }

    @Override
    public String getNome() {
        return "Histórico Escolar";
    }
}
