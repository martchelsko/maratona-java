package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;
        if (isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }
    }

}
