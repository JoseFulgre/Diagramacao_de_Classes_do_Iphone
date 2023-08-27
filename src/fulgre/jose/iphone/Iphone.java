package fulgre.jose.iphone;

import fulgre.jose.iphone.internet.Navegador;
import fulgre.jose.iphone.musica.ReprodutorMusica;
import fulgre.jose.iphone.telefone.AparelhoTelefonico;

import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {


        ligar();

        escolherAplicativo();
    }

    private static void escolherAplicativo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Usuário escolhe aplicativo");
        String selecao = entrada.nextLine();

        if(selecao.equals("Musica")){
            new ReprodutorMusica();
        } else if(selecao.equals("Telefone")){
            new AparelhoTelefonico();
        } else if(selecao.equals("Internet")){
            new Navegador();
        }
    }

    public String getSenhaAcesso(){
        return new Usuario().getSENHA();
    }

    private static void ligar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Senha: ");
        String senha = entrada.nextLine();

        if(senha.equalsIgnoreCase(new Iphone().getSenhaAcesso())){
            System.out.println("Aparelho ligando");
        } else {
            System.out.println("Senha errada, tente novamente!");
            ligar();
        }
        entrada.close();
    }

}
