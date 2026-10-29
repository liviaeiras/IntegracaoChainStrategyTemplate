/**
 * TEMPLATE METHOD: verificarAprovacao() define o algoritmo fixo.
 * STRATEGY: a nota final é calculada pela Calculadora com a Operacao escolhida.
 */
public abstract class Aluno {

    protected String nome;
    protected double[] notas;
    private Calculadora calculadora = new Calculadora();
    private Operacao formaDeCalculo;

    public Aluno(String nome, Operacao formaDeCalculo, double... notas) {
        this.nome = nome;
        this.formaDeCalculo = formaDeCalculo;
        this.notas = notas;
    }

    // Strategy em ação
    public double getNotaFinal() {
        calculadora.setOperacao(formaDeCalculo);
        return calculadora.calcular(notas);
    }

    // Método template
    public final boolean verificarAprovacao() {
        double notaFinal = getNotaFinal();
        double corte = getNotaCorte();
        boolean aprovado = notaFinal >= corte;
        System.out.printf("  %s | %s = %.2f | corte %.1f -> %s%n",
                nome, calculadora.getNomeOperacao(), notaFinal, corte,
                aprovado ? "APROVADO" : "REPROVADO");
        return aprovado;
    }

    public abstract double getNotaCorte();

    public String getNome() { return nome; }
}
