public class TestadorBanco {

    public static void main(String[] args) {

        Banco conta1 = new Banco();
        Banco conta2 = new Banco();

        conta1.setSenha("manga");
        conta2.setSenha("goiaba");

        System.out.println(conta1.getSenha());
        System.out.println(conta2.getSenha());


    }


}
