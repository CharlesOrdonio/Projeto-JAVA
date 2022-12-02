import java.util.Scanner;

public class His{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean chave = false;
        
        System.out.print("Você é um garoto de 16 anos chamado Jean, ");
        System.out.print("um dia você estava do lado de fora de sua casa e decide andar pela floresta perto de sua casa, ");
        System.out.print("nesse passeio na floresta você encontra uma caverna, e por algum motivo, alguma coisa te faz querer entra na caverna, ");
        System.out.print("você vai entrar na caverna? ");
        while (chave == false ){
            System.out.print("Digite 'entrar' ou 'ficar': ");
            String x = input.nextLine();

            if ( x.equalsIgnoreCase("entrar")){
                System.out.print("Você decide entrar na caverna, ela é bem escura e umida, porém a sua curiosidade te faz entrar mais e mais, ");
                System.out.print("derepente uma luz acende no fundo da caverna e começa a iluminar a caverna, ");
                System.out.print("mas algo te faz pensar em parar de continuar e voltar correndo devolta para a entrada, ");
                System.out.println("você vai voltar para a entrada? ");
                while (chave == false){
                    System.out.print("Digite 'voltar' ou 'continuar': ");
                    String y = input.nextLine();

                    if ( y.equalsIgnoreCase("voltar")){
                        System.out.print("Você começa a correr, mas correr muito, pois você começa a sentir um calor na costas, ");
                        System.out.print("e então foi aí que você lembrou, que nessa caverna havia um dragão, ");
                        System.out.print("ao qual o seu pai disse que ele não gosta muito de humanos, ");
                        System.out.print("você começa a correr com toda a sua velocidade, entretanto a chama está cada vez mais proxima de você, ");
                        System.out.print("mas graças a Deus você conseguiu sair da caverna a tempo, ");
                        System.out.println("então você vai para casa pra pegar uma placa que diz 'Cuidado, dragão bravo' e coloca ela na entrada da caverna.");
                        chave = true;
                }
                    else if ( y.equalsIgnoreCase("continuar")){
                        System.out.print("Você continua andando, porem nota que a luz do fundo da caverna está aumentando, na verdade, mais próxima, ");
                        System.out.print("então você lembra que seu pai falou de um dragão em uma caverna próxima da sua casa, ");
                        System.out.print("você tenta correr, porem já é tarde de mais, você é coberto pelas chama e morre queimado, ");
                        System.out.println("assim se tornando um carvão tamanho família.");
                        chave = true;
                }
                    else
                    System.out.println("Resposta invalida, tente novamente");
                }
            }
            else if ( x.equalsIgnoreCase("ficar")){
                System.out.println("Você não entrou na caverna e voltou pra casa para ficar cuidando de suas 7 irmãzinhas.");
                chave = true;
            }
            else {
                System.out.println("Resposta errada, tente novamente");
            }
        }
        System.out.println("FIM!!");
        input.close();

}}