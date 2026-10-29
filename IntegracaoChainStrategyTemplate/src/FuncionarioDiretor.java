public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor() {
        super("Diretor");
        adicionarTipo(TipoDocumentoCertificado.getInstance());
    }
}
