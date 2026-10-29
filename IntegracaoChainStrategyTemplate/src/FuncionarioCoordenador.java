public class FuncionarioCoordenador extends Funcionario {

    public FuncionarioCoordenador() {
        super("Coordenador");
        adicionarTipo(TipoDocumentoMatricula.getInstance());
    }
}
