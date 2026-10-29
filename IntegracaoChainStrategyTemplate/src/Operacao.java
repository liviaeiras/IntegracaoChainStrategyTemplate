/**
 * STRATEGY - interface comum a todas as operações.
 */
public interface Operacao {
    String getNome();
    double calcular(double... valores);
}
