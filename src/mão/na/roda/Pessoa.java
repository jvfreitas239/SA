package mão.na.roda;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private String email;
    private int idade;
    private int dd;
    private String celular;

    public Pessoa(String _nome, String _email, int _idade, int _dd, String _celular) {
        this.nome = _nome;
        this.email = _email;
        this.idade = _idade;
        this.dd = _dd;
        this.celular = _celular;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public int getDd() {
        return dd;
    }

    public String getCelular() {
        return celular;
    }

    public void verificaIdade(int _idadeUsuario) {
        if (_idadeUsuario >= 18) {
            JOptionPane.showMessageDialog(
                    null,
                    "Acesso permitido! Clique no ok para acessar o sistema",
                    "Acesso permitido",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Acesso negado, você ainda não atingiu sua maioridade",
                    "Acesso negado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}