public class TestadorPacientes {

    public static void main(String[] args) {


        Pacientes paciente01 = new Pacientes();
        Pacientes paciente02 = new Pacientes();
        Pacientes paciente03 = new Pacientes();
        Pacientes paciente04 = new Pacientes();

        paciente01.setNomePaciente("André de Paula");
        paciente02.setNomePaciente("Maria Joaquina");
        paciente03.setNomePaciente("Antonio Jose");
        paciente04.setNomePaciente("Gabriel Kulion");

        paciente01.setIDPaciente("25000151");
        paciente02.setIDPaciente("78976746");
        paciente03.setIDPaciente("12245633");
        paciente04.setIDPaciente("00112211");

        paciente01.setNumeroPaciente(1);
        paciente02.setNumeroPaciente(2);
        paciente03.setNumeroPaciente(3);
        paciente04.setNumeroPaciente(4);

        paciente01.setPlanoPaciente("UNIMED");
        paciente02.setPlanoPaciente("BRADESCO");
        paciente03.setPlanoPaciente("UNIMED");
        paciente04.setPlanoPaciente("SULAMERICA");

        System.out.println(paciente01.getNumeroPaciente() +" "+ paciente01.getNomePaciente() +" " + paciente01.getIDPaciente() +" "+ paciente01.getPlanoPaciente());
        System.out.println(paciente02.getNumeroPaciente()+" "+paciente02.getNomePaciente()+" "+paciente02.getIDPaciente()+ " "+paciente02.getPlanoPaciente());
        System.out.println(paciente03.getNumeroPaciente()+" "+paciente03.getNomePaciente()+" "+paciente03.getIDPaciente()+" "+paciente03.getPlanoPaciente());
        System.out.println(paciente04.getNumeroPaciente()+" "+paciente04.getNomePaciente()+" "+paciente04.getIDPaciente()+" "+paciente04.getPlanoPaciente());
    }
}
