/**
 * Estratégia extra: média ponderada P1 (peso 4) e P2 (peso 6).
 */
public class OperacaoMediaPonderada implements Operacao {

    @Override
    public String getNome() {
        return "Média ponderada (P1x4 + P2x6)";
    }

    @Override
    public double calcular(double... valores) {
        if (valores.length != 2) {
            throw new IllegalArgumentException("Informe exatamente P1 e P2");
        }
        return (valores[0] * 4 + valores[1] * 6) / 10;
    }
}
