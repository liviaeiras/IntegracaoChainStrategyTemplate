import java.util.ArrayList;
import java.util.List;

/**
 * HANDLER da cadeia. Cada funcionário conhece o próximo (auto-associação)
 * e a lista de tipos de documento que pode emitir (0..*).
 */
public abstract class Funcionario {

    protected String cargo;
    private Funcionario proximo;
    private List<TipoDocumento> tiposPermitidos = new ArrayList<>();

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario setProximo(Funcionario proximo) {
        this.proximo = proximo;
        return proximo;          // permite encadear: a.setProximo(b).setProximo(c)
    }

    protected void adicionarTipo(TipoDocumento tipo) {
        tiposPermitidos.add(tipo);
    }

    public boolean podeEmitir(Documento documento) {
        return tiposPermitidos.contains(documento.getTipo());
    }

    public void emitir(Documento documento) {
        if (podeEmitir(documento)) {
            // Integração: antes de emitir, usa o Template Method do aluno
            if (documento.getTipo().exigeAprovacao()
                    && !documento.getSolicitante().verificarAprovacao()) {
                System.out.println("  " + cargo + " NEGOU: " + documento + " (aluno reprovado)");
                return;
            }
            System.out.println("  " + cargo + " EMITIU: " + documento);
        } else if (proximo != null) {
            System.out.println("  " + cargo + " não pode emitir -> repassa");
            proximo.emitir(documento);
        } else {
            System.out.println("  " + cargo + " não pode emitir -> fim da cadeia: "
                    + documento.getTipo().getNome() + " não foi emitido.");
        }
    }
}
