package mão.na.roda;

public class Aluguel extends Veiculo {

    CarroController cCarro = Tela.cCarro;

    private double valorAluguel = 0;
    private String grupo = "";

    public Aluguel(String _nome, int _ano, String _marca, String _cor, String _placa, String _categoria, String _grupo, double _valorAluguel) {
        super(_nome, _ano, _marca, _cor, _placa, _categoria);
        this.grupo = _grupo;
        this.valorAluguel = _valorAluguel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public String getGrupo() {
        return grupo;
    }

}
