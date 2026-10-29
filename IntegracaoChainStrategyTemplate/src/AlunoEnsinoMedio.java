public class AlunoEnsinoMedio extends Aluno {

    public AlunoEnsinoMedio(String nome, Operacao formaDeCalculo, double... notas) {
        super(nome, formaDeCalculo, notas);
    }

    @Override
    public double getNotaCorte() {
        return 5.0;
    }
}
