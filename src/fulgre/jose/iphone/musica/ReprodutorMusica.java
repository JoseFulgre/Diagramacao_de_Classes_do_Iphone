package fulgre.jose.iphone.musica;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusica implements Musica{


    private String musica;
    private boolean selecionado = false;
    private int posicao;
    List<ReprodutorMusica> selecao;
    public ReprodutorMusica() {
        selecao = new ArrayList<>();
    }

    public ReprodutorMusica(String musica, int posicao) {
        this.musica = musica;
        this.posicao = posicao;
    }

    @SuppressWarnings("unused")
    public String getMusica() {
        return musica;
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    @Override
    public void tocar() {
        if(selecao.get(posicao).isSelecionado()){
            System.out.println("Tocando música selecinada");
        } else {
            System.out.println("Sem música selecionada");
        }
    }

    @Override
    public void pausar() {
        if(selecao.get(posicao).isSelecionado()){
            System.out.println("Musica Pausada");
        }
    }

    @Override
    public void selecionarMusica() {
        this.selecionado = !this.selecionado;
        System.out.println("Música selecionada");
    }

    @SuppressWarnings("unused")
    public void fechar(){
        System.out.println("Fechando repodutor de música");
    }
}
