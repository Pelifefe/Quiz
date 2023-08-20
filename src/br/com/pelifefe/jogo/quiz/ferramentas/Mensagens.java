package br.com.pelifefe.jogo.quiz.ferramentas;
import java.util.Scanner;

public class Mensagens extends Valores{
    Scanner scanner = new Scanner(System.in);
    private static String nome;
    private int opcao;
    public static String getNome() {
        return nome;
    }
    public int getOpcao() {
        return opcao;
    }


    public void exibeApresentacao(){
        String apresentacao = """
            --------------------------------------------------------------------------------------------------------------
            \u001B[31m                                BEM-VINDO AO QUIZ JOGADOR(A)                  \u001B[0m
            \u001B[33m                      ANTES DE COMEÇARMOS LEIA A DESCRIÇÃO A SEGUIR!            \u001B[0m
                             As perguntas serão geradas de modo totalmente aleatório                \s
                                       
                      Entre elas, as perguntas serão de níveis: Fácil (10), Médio(20) e Difícil(30)     \s
       
                 Será disponibilizado um bônus para pular as perguntas, dependendo da sua quantidade de pontos obtido
            --------------------------------------------------------------------------------------------------------------
            \u001B[34m                                 DIGITE SEU NICKNAME: \u001B[0m""";
        System.out.print(apresentacao);
        nome = scanner.next();
    }

    public void exibeOpcao(){
        String mensagemOpcao = """
                --------------------------------------------------------------------------------------------------------------
                    
                    \u001B[33m                            ATENÇÃO PLAYER\u001B[0m \u001B[35m%s \u001B[1m             
                                VOCÊ DEVE ESCOLHER UM DOS QUIZ A SEGUIR PARA COMEÇARMOS
                \u001B[34m                                1) TECNOLOGIA \u001B[0m  
                \u001B[32m                                2) FUTEBOL    \u001B[0m
                                          DIGITE O NUMERO DA OPÇÃO DESEJADA:                                    
                """.formatted(getNome());
        System.out.print(mensagemOpcao);
        opcao = scanner.nextInt();
    }

    public void exibeOpcaoInvalida(){
        String mensagemOpcaoInvalida = """
            --------------------------------------------------------------------------------------------------------------
            \u001B[31m            RESPOSTA INVALIDA! \u001B[0m
                        ESCOLHA UMA DAS OPÇÕES A SEGUIR:
                        Digite 1 para Tecnologia
                        Digite 2 para Futebol
                        Digite uma opção a seguir para proseguir: 
            """;
        System.out.print(mensagemOpcaoInvalida);
        opcao = scanner.nextInt();
    }


    public void exibePainelDePontos(){
        String mensagemPainelDePontos = """
        
            \u001B[31m_______________________________\u001B[0m
            \u001B[33mPAINEL DE PONTOS:\u001B[0m\u001B[0m %d \u001B[31m  
            \u001B[31m_______________________________\u001B[0m
            """.formatted(getMeusPontos());

        System.out.println(mensagemPainelDePontos);
    }

    public void exibePulaPergunta(){
        String pularPergunta = """
            \u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m
            Digite (P) caso queira, se não somente digite a letra da resposta
            \u001B[37mDigite a letra da Opção a seguir:\u001B[0m\u001B[33m \u001B[0m 
            """;
        System.out.println(pularPergunta);
    }

    public void exibeOpcaoSeguir(){
        System.out.print("\u001B[37m\nDigite a letra da Opção a seguir:\u001B[0m\u001B[33m \u001B[0m ");
    }

    public void acertou(){
        System.out.println("\u001B[32mResposta correta!\u001B[0m");
    }

    public void errou(){
        System.out.println("\u001B[31mRespota incorreta...\u001B[0m");
    }

    public void indevida(){
        System.out.println("\u001B[31m\nRespota indevida.\u001B[0m");
    }

    public void proximoQuiz(){
        System.out.println("VOCÊ DESEJA PASSAR PARA O PROXIMO QUIZ?[\u001B[32mDigite S ou Sim para continuar,\u001B[0m \u001B[31mse não, digite qualquer coisa\u001B[0m]");
    }

    public void parouOQuiz(){
        System.out.println("Que pena, pensei que gostaria de continuar :(");
    }

    public static void finalQuiz(){
        System.out.println("\n\u001B[34m     VOCÊ CHEGOU AO FINAL DO QUIZ PLAYER: " + getNome() + "\u001B[0m");
        if(getMeusPontos() >= 100){
            System.out.println("    O SEU DESEMPENHO FOI \u001B[32mOTIMO!\u001B[0m ");
            System.out.println("           SALDO DE PONTOS: " + getMeusPontos());
        }else if(getMeusPontos() > 40 && getMeusPontos() < 100){
            System.out.println("    O SEU DESEMPENHO FOI MEDIANO, MAS PODE \u001B[33mMELHORAR!\u001B[0m");
            System.out.println("           SALDO DE PONTOS: " + getMeusPontos());
        }else{
            System.out.println("    O SEU DESEMPENHO FOI\u001B[31mPÉSSIMO, JOGUE NOVAMENTE!\u001B[0m ");
            System.out.println("           SALDO DE PONTOS: " + getMeusPontos());
        }
    }
}
