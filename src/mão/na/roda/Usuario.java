package mão.na.roda;

public class Usuario extends Pessoa {
    
    private String cnh;
    
    public Usuario(String _nome, String _email, int _idade, int _dd, String _celular, String _cnh) {
        super(_nome, _email, _idade, _dd, _celular);
        this.cnh = _cnh;
    }

    public String getCnh() {
        return cnh;
    }
}