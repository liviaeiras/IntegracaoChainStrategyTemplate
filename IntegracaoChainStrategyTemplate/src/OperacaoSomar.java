public class OperacaoSomar implements Operacao {

    @Override
    public String getNome() {
        return "Soma";
    }

    @Override
    public double calcular(double... valores) {
        double r = 0; for (double v : valores) r += v; return r;
    }
}
