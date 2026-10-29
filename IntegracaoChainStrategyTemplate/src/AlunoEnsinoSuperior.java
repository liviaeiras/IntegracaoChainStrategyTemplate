public class AlunoEnsinoSuperior extends Aluno {

    public AlunoEnsinoSuperior(String nome, Operacao formaDeCalculo, double... notas) {
        super(nome, formaDeCalculo, notas);
    }

    @Override
    public double getNotaCorte() {
        return 6.0;
    }
}
