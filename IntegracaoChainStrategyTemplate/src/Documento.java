/**
 * Requisição da cadeia: agora carrega o Aluno solicitante.
 */
public class Documento {

    private TipoDocumento tipo;
    private Aluno solicitante;

    public Documento(TipoDocumento tipo, Aluno solicitante) {
        this.tipo = tipo;
        this.solicitante = solicitante;
    }

    public TipoDocumento getTipo() { return tipo; }
    public Aluno getSolicitante() { return solicitante; }

    @Override
    public String toString() {
        return tipo.getNome() + " de " + solicitante.getNome();
    }
}
