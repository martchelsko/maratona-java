package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome> morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivossExercicio {
    public static void main(String[] args) {
        String nome = "Kiritoo";
        String endereco = "Av Joao das galileias";
        double salario = 5431.12;
        String dataRecebimento = "20/12/2021";
        String relatorio = "Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de "
                + salario + " na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
