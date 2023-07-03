package atividade3Uc9.classes;

import atividade3Uc9.telas.Agendamento;

public class Principal {

    public static void main(String[] args) {

        Agendamento a = new Agendamento();
        a.setTitle("Agendamentos");
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

}
