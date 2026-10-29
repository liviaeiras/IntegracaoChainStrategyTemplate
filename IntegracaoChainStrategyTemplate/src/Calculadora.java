/**
 * CONTEXTO - usa a estratégia atual sem saber qual operação concreta é.
 */
public class Calculadora {

    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double calcular(double... valores) {
        if (operacao == null) {
            throw new IllegalStateException("Nenhuma operação definida");
        }
        if (valores.length == 0) {
            throw new IllegalArgumentException("Informe ao menos um valor");
        }
        return operacao.calcular(valores);
    }

    public String getNomeOperacao() {
        return operacao == null ? "-" : operacao.getNome();
    }
}
