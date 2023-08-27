package fulgre.jose.iphone.internet;

public class Navegador implements Internet{
    @Override
    public void exibirPagina() {
        System.out.println("Acessando página da" +
                " internet à partir de URL");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página da internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador");
    }

    @SuppressWarnings("unused")
    public void fechar(){
        System.out.println("Encerrando navegador de internet");
    }
}
