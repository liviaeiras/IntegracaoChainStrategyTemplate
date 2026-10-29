public interface TipoDocumento {
    String getNome();
    boolean exigeAprovacao();   // diploma/certificado só para aprovados
}
