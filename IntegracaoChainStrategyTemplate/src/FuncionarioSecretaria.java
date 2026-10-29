public class FuncionarioSecretaria extends Funcionario {

    public FuncionarioSecretaria() {
        super("Secretaria");
        adicionarTipo(TipoDocumentoHistorico.getInstance());
    }
}
