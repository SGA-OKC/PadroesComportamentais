package Observer;

public class Usuario implements Assinantes {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}

