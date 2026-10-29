public class OperacaoMedia implements Operacao {

    @Override
    public String getNome() {
        return "Média";
    }

    @Override
    public double calcular(double... valores) {
        double soma = 0; for (double v : valores) soma += v; return soma / valores.length;
    }
}
