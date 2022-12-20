/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mão.na.roda;

/**
 *
 * @author Aluno_Manha
 */
public class Agendamento {

    private Usuario cliente;
    private String atendente, horario, dias, mes, ano;

    public Agendamento(String atendente, String horario, String dias, String mes, String ano) {
        this.cliente = Tela.cliente;
        this.atendente = atendente;
        this.horario = horario;
        this.dias = dias;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Usuario getCliente() {
        return cliente;
    }

    public String getAtendente() {
        return atendente;
    }

    public String getHorario() {
        return horario;
    }

    public String getDias() {
        return dias;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }
}
