package mão.na.roda;

import javax.swing.JOptionPane;

public class Administrador extends Pessoa {

    private String user = "admin";
    private String senha = "admin";

    public Administrador(String _nome, String _email, int _idade, int _dd, String _celular) {
        super(_nome, _email, _idade, _dd, _celular);
    }

    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

    public boolean verificaAdministrador(String _userAdm, String _senhaAdm) {
        if (_userAdm.equals(user) && _senhaAdm.equals(senha)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Acesso permitido! Clique no ok para acessar o sistema",
                    "Acesso permitido",
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Acesso negado! Usuário e(ou) senha inválidos",
                    "Acesso negado",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}