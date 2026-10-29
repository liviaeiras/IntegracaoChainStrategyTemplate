/**
 * Integração: Chain of Responsibility + Strategy + Template Method
 *
 * - Strategy: cada aluno usa uma forma de cálculo da nota final (Calculadora + Operacao).
 * - Template Method: Aluno.verificarAprovacao() compara a nota final com o corte
 *   definido pela subclasse (Ensino Médio / Ensino Superior).
 * - Chain of Responsibility: o pedido de documento percorre
 *   Secretaria -> Coordenador -> Diretor -> Reitor; quem pode emitir verifica
 *   a aprovação (Template) quando o documento exige.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Integração: Chain + Strategy + Template Method ===");

        Funcionario cadeia = new FuncionarioSecretaria();
        cadeia.setProximo(new FuncionarioCoordenador())
              .setProximo(new FuncionarioDiretor())
              .setProximo(new FuncionarioReitor());

        Aluno livia = new AlunoEnsinoSuperior("Lívia", new OperacaoMediaPonderada(), 6.0, 8.0);
        Aluno bruno = new AlunoEnsinoSuperior("Bruno", new OperacaoMedia(), 5.0, 6.0);
        Aluno ana   = new AlunoEnsinoMedio("Ana", new OperacaoMedia(), 5.0, 6.0);

        Documento[] pedidos = {
            new Documento(TipoDocumentoHistorico.getInstance(), bruno),
            new Documento(TipoDocumentoDiploma.getInstance(), livia),
            new Documento(TipoDocumentoDiploma.getInstance(), bruno),
            new Documento(TipoDocumentoCertificado.getInstance(), ana),
            new Documento(TipoDocumentoMatricula.getInstance(), ana)
        };

        for (Documento d : pedidos) {
            System.out.println("\nPedido: " + d);
            cadeia.emitir(d);
        }
    }
}
