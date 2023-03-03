public class Testadora {

    public static void main(String[] args) {

        ContaLogin cl1 = new ContaLogin();
        ContaLogin cl2 = new ContaLogin();

        cl1.setNome("Marianne");
        cl2.setNome("Gustavo");

        System.out.println(cl1.getNome());
        System.out.println(cl2.getNome());



    }
}
