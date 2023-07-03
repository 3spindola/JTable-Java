package atividade3Uc9.classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private String cliente;
    private String consRealizada;
    private String receita;

    protected static final List<Paciente> pacientes = new ArrayList<>();

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String telefone, String data, String cliente, String consRealizada, String receita) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.cliente = cliente;
        this.consRealizada = consRealizada;
        this.receita = receita;

        pacientes.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getConsRealizada() {
        return consRealizada;
    }

    public void setConsRealizada(String consRealizada) {
        this.consRealizada = consRealizada;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public static List<Paciente> getPacientes() {
        return pacientes;
    }

    public void addPaciente() {
        pacientes.add(this);
    }

    public void RemoverPaciente(Paciente p) {
        if (!pacientes.isEmpty()) {
            pacientes.remove(p);
        } else {
            JOptionPane.showMessageDialog(null, "Não há Registro de" + p + " em arquivo");
        }
    }
    
    public void atualizarPaciente(String nome, String cpf, String telefone, String data, String cliente, String consRealizada, String receita){
       
        for(Paciente p : pacientes){
            if(p.getCpf().equals(cpf)){
                p.setNome(nome);
                p.setCpf(cpf);
                p.setTelefone(telefone);
                p.setData(data);
                p.setCliente(cliente);
                p.setConsRealizada(consRealizada);
                p.setReceita(receita);
                break;
            }
        }
            
    }

}
