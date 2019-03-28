package Clinica;

public class Clinica {
    public static void main(String args[]){
    Paciente paciente = new Paciente();
    paciente.nome = "Fulano";
    paciente.endereco = "Jurunas";
    paciente.numerocartao = 232321;

    Medico medico = new Medico();
    medico.nome = " Mateus ";
    medico.endereco = " Umarizal";
    medico.crm = 123324;
    medico.especialiade = "cardioogista";

    AtendimentoMedico atendimento = new AtendimentoMedico();
    atendimento.dataConsulta = " 20/04/2019";
    atendimento.paciente = paciente;
    atendimento.medico = medico;
    }
}
