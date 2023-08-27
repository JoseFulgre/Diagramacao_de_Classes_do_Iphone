package fulgre.jose.iphone;

public final class Usuario {
    String NOME ="Nome_usuario";
    String SENHA ="Senha_usuario";
    String  EMAIL ="email_usuario";

    public String getNOME() {
        return NOME;
    }

    public String getSENHA() {
        return SENHA;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    @Override
    public String toString() {
        return "Usuario[]";
    }
}
