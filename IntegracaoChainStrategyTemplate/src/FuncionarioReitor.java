public class FuncionarioReitor extends Funcionario {

    public FuncionarioReitor() {
        super("Reitor");
        adicionarTipo(TipoDocumentoDiploma.getInstance());
    }
}
