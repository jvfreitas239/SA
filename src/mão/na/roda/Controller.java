/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mão.na.roda;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

class AgendamentoController {

    private static ArrayList<Agendamento> agedamentos = new ArrayList<>();

    public ArrayList<Agendamento> getList() {
        return agedamentos;
    }

    public void addAgendamento(Agendamento a) {
        try {
            if (agedamentos.add(a)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Atendimento agendado com sucesso!",
                        "Agendar atendimento",
                        JOptionPane.INFORMATION_MESSAGE);  
            }
            return;
        } catch (Exception e) {
        }
    }

    public boolean removeAgendamento(int cod) {
        if (cod >= 0 && cod < agedamentos.size()) {
            agedamentos.remove(cod);
            return true;
        }
        return false;
    }

    public void exibirAgedamentos(JTable table) {
        String[] Colunas = {"Cod.", "Cliente", "Telefone", "Atendente", "Data"};
        Object[][] cInfo = new Object[agedamentos.size()][Colunas.length];

        int POS = 0;

        for (Agendamento a : agedamentos) {

            Usuario cliente = a.getCliente();

            cInfo[POS][0] = POS;
            cInfo[POS][1] = cliente.getNome();
            cInfo[POS][2] = "(" + cliente.getDd() + ") " + cliente.getCelular();
            cInfo[POS][3] = a.getAtendente();
            cInfo[POS][4] = a.getDias() + "/" + a.getMes() + "/" + a.getAno();

            POS++;

        }

        table.setModel(new javax.swing.table.DefaultTableModel(cInfo, Colunas));
    }

}

class CarroController {

    private static ArrayList<Veiculo> estCarro = new ArrayList<>();

    public void addCarro(Veiculo c) {
        estCarro.add(c);
    }

    public boolean removeCarro(String index) {

        int x = 0;

        for (Veiculo c : estCarro) {
            if (c.getPlaca().equals(index)) {
                estCarro.remove(x);
                return true;
            }
            x++;
        }

        return false;
    }

    public Veiculo getCarro(String tipo, String index) {

        switch (tipo) {
            case "placa": {

                int POS = 0;

                for (Veiculo v : estCarro) {
                    if (v.getPlaca().equals(index)) {
                        break;
                    }
                    POS++;
                }

                return estCarro.get(POS);
            }

            case "cod": {

                int INDEX = Integer.valueOf(index);

                if (INDEX > 0 && INDEX < estCarro.size()) {
                    return estCarro.get(INDEX);
                }

            }
        }
        return null;
    }

    public ArrayList<Veiculo> getList() {
        return estCarro;
    }

    public void exibirVeiculos(JTable table) {
        String[] Colunas = {"Nome", "Marca", "Ano", "Placa", "Cor", "Categoria"};
        Object[][] cInfo = new Object[estCarro.size()][Colunas.length];

        int POS = 0;

        for (Veiculo c : estCarro) {

            cInfo[POS][0] = c.getNome();
            cInfo[POS][1] = c.getMarca();
            cInfo[POS][2] = c.getAno();
            cInfo[POS][3] = c.getPlaca();
            cInfo[POS][4] = c.getCor();
            cInfo[POS][5] = c.getCategoria();
            POS++;

        }

        table.setModel(new javax.swing.table.DefaultTableModel(cInfo, Colunas));
    }
}

class AluguelController {

    private ArrayList<Aluguel> alugueis = new ArrayList<>();

    //Functions
    public void addAluguel(Aluguel a) {
        alugueis.add(a);
    }

    public void exibirVeiculosAluguel(JTable table) {
        String[] Colunas = {"Nome", "Marca", "Ano", "Placa", "Cor", "Categoria", "Grupo"};
        Object[][] cInfo = new Object[alugueis.size()][Colunas.length];

        int POS = 0;

        for (Aluguel a : alugueis) {
            cInfo[POS][0] = a.getNome();
            cInfo[POS][1] = a.getMarca();
            cInfo[POS][2] = a.getAno();
            cInfo[POS][3] = a.getPlaca();
            cInfo[POS][4] = a.getCor();
            cInfo[POS][5] = a.getCategoria();
            cInfo[POS][6] = a.getGrupo();
            POS++;
        }

        table.setModel(new javax.swing.table.DefaultTableModel(cInfo, Colunas));
    }

    public ArrayList<Aluguel> getList() {
        return alugueis;
    }

    public double simularValor(String placa, int dias) {

        for (Aluguel a : alugueis) {
            if (a.getPlaca().equals(placa)) {
                try {
                    int TIPO = 0;
                    String[] TIPOS = {"Básico", "Intermediário", "Executivo"};
                    double[] VALORES = {35, 55, 200};

                    for (TIPO = 0; TIPO < TIPOS.length; TIPO++) {
                        if (TIPOS[TIPO] == a.getGrupo()) {
                            break;
                        }
                    }

                    return VALORES[TIPO] * dias;

                } catch (Exception e) {
                    return 0;
                }
            }
        }
        return -1;
    }

    //
}

class VendaController {

    private ArrayList<Venda> vendas = new ArrayList<>();

    //Functions
    public void addVenda(Venda v) {
        vendas.add(v);
    }

    public void getVenda(int index) {
        try {
            Venda v = vendas.get(index);
            System.out.println(v.getValorVenda());
        } catch (Exception e) {
        }
    }

    public void exibirVeiculosVenda(JTable table) {
        String[] Colunas = {"Nome", "Marca", "Ano", "Placa", "Cor", "Valor"};
        Object[][] cInfo = new Object[vendas.size()][Colunas.length];

        int POS = 0;

        for (Venda v : vendas) {
            cInfo[POS][0] = v.getNome();
            cInfo[POS][1] = v.getMarca();
            cInfo[POS][2] = v.getAno();
            cInfo[POS][3] = v.getPlaca();
            cInfo[POS][4] = v.getCor();
            cInfo[POS][5] = v.getValorVenda();

            POS++;
        }

        table.setModel(new javax.swing.table.DefaultTableModel(cInfo, Colunas));
    }

    public ArrayList<Venda> getList() {
        return vendas;
    }
}