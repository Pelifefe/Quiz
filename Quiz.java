import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println(
                "\u001B[31m                                BEM-VINDO AO QUIZ JOGADOR(A)                  \u001B[0m");
        System.out.println(
                "\u001B[33m                      ANTES DE COMEÇARMOS LEIA A DESCRIÇÃO A SEGUIR!            \u001B[0m");
        System.out.println("                As perguntas serão geradas de modo totalmente aleatório                  ");
        System.out.println(
                "         Entre elas, as perguntas serão de níveis: Fácil (10), Médio(20) e Difícil(30)      ");
        System.out.println(
                "    Será disponibilizado um bonus para pular as perguntas, dependendo da sua quantidade de pontos obtido");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.print("\u001B[34m                                  DIGITE SEU NICKNAME: \u001B[0m");
        String nome = scanner.next();

        int pulaFacil = 20;
        int pulaMedio = 40;
        int pulaDificil = 60;
        int cont = 0;

        int numero;
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<Integer> numerosList = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            numerosList.add(i);
        }
        Collections.shuffle(numerosList);

        for (int i = 0; i < numerosList.size(); i++) {
            numeros[i] = numerosList.get(i);
        }

        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("\u001B[33m                                    ATENÇÃO PLAYER " + nome + "\u001B[0m");
        System.out.println("                       VOCÊ DEVE ESCOLHER UM DOS QUIZ A SEGUIR PARA COMEÇARMOS");
        System.out.println("\u001B[34m                                       1) TECNOLOGIA \u001B[0m");
        System.out.println("\u001B[32m                                       2) FUTEBOL    \u001B[0m");
        System.out.print("                              DIGITE O NUMERO DA OPÇÃO DESEJADA: ");
        int opcao = scanner.nextInt();
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");

        if (opcao != 1 && opcao != 2) {
            System.out.println("--------------------------");
            System.out.println("RESPOSTA INVALIDA! ESCOLHA UMA DAS OPÇÕES A SEGUIR:");
            System.out.println("Digite 1 para Tecnologia");
            System.out.println("Digite 2 para Futebol");
            System.out.print("Digite uma opção a seguir para proseguir: ");
            opcao = scanner.nextInt();

        }

        if (opcao == 1) {

            for (int i = 0; i < 5; i++) {
                numero = numeros[i];

                switch (numero) {
                    case 1:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Quem é o CEO da SpaceX que atualmente comprou o Twitter? (FACIL)");
                        System.out.println("A) Jeff Bezos");
                        System.out.println("B) Harry Potter");
                        System.out.println("C) Steve Jobs");
                        System.out.println("D) Elon Musk");

                        if (cont >= pulaFacil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String twitter = scanner.next();

                            scanner.nextLine();

                            if (twitter.equalsIgnoreCase("P")) {
                                cont -= 5;
                                break;

                            } else if (twitter.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Jeff Bezos é sim um homem 'grande', mas é CEO de outra empresa a Amazon");

                            } else if (twitter.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Pelas barbas de Merlin! Potter não era dono nem do seu próprio quarto");

                            } else if (twitter.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Steve Jobs era somente fundador da Apple e eventualmente de outras frutas");

                            } else if (twitter.equalsIgnoreCase("D")) {
                                cont += 10;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println("Na mosca, Musk comprou recentemente a rede social");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String twitter = scanner.nextLine();

                            if (twitter.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Jeff Bezos é sim um homem 'grande', mas é CEO de outra empresa a Amazon");

                            } else if (twitter.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Pelas barbas de Merlin! Potter não era dono nem do seu próprio quarto");

                            } else if (twitter.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Steve Jobs era somente fundador da Apple e eventualmente de outras frutas");

                            } else if (twitter.equalsIgnoreCase("D")) {
                                cont += 10;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println("Na mosca, Musk comprou recentemente a rede social");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        }
                    case 2:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out.println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println(
                                "Qual sistema operacional que é mais utilizado pelo mundo inteiro (DICA: Se chama janela em inglês)? (FACIL)");
                        System.out.println("A) Android");
                        System.out.println("B) Linux");
                        System.out.println("C) Mac OS/ IOS");
                        System.out.println("D) Windows");

                        if (cont >= pulaFacil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String windows = scanner.next();

                            scanner.nextLine();

                            if (windows.equalsIgnoreCase("P")) {
                                cont -= 5;
                                break;

                            } else if (windows.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Android (robo) é sim muito usado, entretanto existe um sistema ainda mais antigo e utilizado por todos os usuários");

                            } else if (windows.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Linux (pinguim), é um sistema muito versátil muitas empresas utilizam justamente pelo desempenho e liberdade que fornece, mas está longe de ser mais utilizado por questões de sua fama de ser complicado de aprender e etc");

                            } else if (windows.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "O sistema da Apple é conhecida, mas não é mais utilizado por diversos ambitos. Seus produtos tem um custo alto em certas partes do mundo, mas a plataforma e seus produtos tem uma qualidade e versatilidade única");

                            } else if (windows.equalsIgnoreCase("D")) {
                                cont += 10;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Pra quem sabe inglês matou na hora, mas vamos ser sinceros essa era bem fácil. O windows fornece layouts e interatividades que já estamos acostumados assim se criou também uma ótima compra pra quem está começando aprender");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String windows = scanner.next();

                            if (windows.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Android (robo) é sim muito usado, entretanto existe um sistema ainda mais antigo e utilizado por todos os usuários");

                            } else if (windows.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Linux (pinguim), é um sistema muito versátil muitas empresas utilizam justamente pelo desempenho e liberdade que fornece, mas está longe de ser mais utilizado por questões de sua fama de ser complicado de aprender e etc");

                            } else if (windows.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "O sistema da Apple é conhecida, mas não é mais utilizado por diversos ambitos. Seus produtos tem um custo alto em certas partes do mundo, mas a plataforma e seus produtos tem uma qualidade e versatilidade única");

                            } else if (windows.equalsIgnoreCase("D")) {
                                cont += 10;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Pra quem sabe inglês matou na hora, mas vamos ser sinceros essa era bem fácil. O windows fornece layouts e interatividades que já estamos acostumados assim se criou também uma ótima compra pra quem está começando aprender");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        }
                    case 3:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out.println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println(
                                "Qual inteligência artificial com serviços de assistência virtual fornecendo dados em texto, se tornou famoso entre todos os públicos? (FACIL)");
                        System.out.println("A) Whatsapp");
                        System.out.println("B) ChatGPT");
                        System.out.println("C) Discord");
                        System.out.println("D) Bing");

                        if (cont >= pulaFacil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String chatGPT = scanner.next();

                            scanner.nextLine();

                            if (chatGPT.equalsIgnoreCase("P")) {
                                cont -= 5;
                                break;

                            } else if (chatGPT.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Whatsapp é somente um aplicativo multiplataforma de mensagens instantaneas e chamadas de voz para smartphones (Essa voce ramelou ein)");

                            } else if (chatGPT.equalsIgnoreCase("B")) {
                                cont += 10;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Exato, tivemos aqui no Brasil o primeiro contato com o ChatGPT da OpenAI e por ter dado muito certo essa ferramenta para o publico se desenvolveram outras, com serviços diferentes");

                            } else if (chatGPT.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Discord é um aplicativo de voz sobre IP proprietario e gratuito, projetado inicialmente para comunidades de jogos. Hospeda algumas ferramentas IA's como o MidJourney, mas não atende a pergunta");

                            } else if (chatGPT.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Até faz sentido o Bing, justamente por atender todos os objetivos como IA fornecendo os dados devidos, mas não foi essa que tivemos o primeiro contato (além de ter sido recente seu lançamento)");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String chatGPT = scanner.next();

                            if (chatGPT.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Whatsapp é somente um aplicativo multiplataforma de mensagens instantaneas e chamadas de voz para smartphones (Essa voce ramelou ein)");

                            } else if (chatGPT.equalsIgnoreCase("B")) {
                                cont += 10;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Exato, tivemos aqui no Brasil o primeiro contato com o ChatGPT da OpenAI e por ter dado muito certo essa ferramenta para o publico se desenvolveram outras, com serviços diferentes");

                            } else if (chatGPT.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Discord é um aplicativo de voz sobre IP proprietario e gratuito, projetado inicialmente para comunidades de jogos. Hospeda algumas ferramentas IA's como o MidJourney, mas não atende a pergunta");

                            } else if (chatGPT.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Até faz sentido o Bing, justamente por atender todos os objetivos como IA fornecendo os dados devidos, mas não foi essa que tivemos o primeiro contato (além de ter sido recente seu lançamento)");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }
                    case 4:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Quais linguagens de programação é possível para realizar um site? (MEDIO)");
                        System.out.println("A) MySQL e Rust");
                        System.out.println("B) Html, javacript e CSS");
                        System.out.println("C) Java e PASCAL");
                        System.out.println("D) C++ e C");

                        if (cont >= pulaMedio) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String site = scanner.next();

                            scanner.nextLine();

                            if (site.equalsIgnoreCase("P")) {
                                cont -= 10;
                                break;

                            } else if (site.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "O MySQL é um sistema de gerenciamento de banco de dados e Rust é utilizada para o desenvolvimento de diferentes tipos de aplicações, como ferramentas de linha de comando, web services, ferramentas para DevOps e jogos, mas não atende a pergunta");

                            } else if (site.equalsIgnoreCase("B")) {
                                cont += 20;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Boa! Todas essas linguagens se complementam, embora HTML não é considerada uma linguagem, todas elas tornam o seu site automotizado (javascript), com as informações e titulos necessários (html) e óbvio o não menos importante, bonito (css)");

                            } else if (site.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Pascal e Java são ambas linguagens orientadas a objetos, mas com objetivos fora da pergunta. Elas trabalham com Abstração e estruturas diferentes tambem (linguagem da velha guarda kkkkk)");

                            } else if (site.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "O C e C++ é uma linguagem de programação no qual normalmente utiliza para desenvolvimento de jogos, bibliotecas gráficas e sistemas operacionais (parecem que são pai e filho)");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String site = scanner.next();

                            if (site.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "O MySQL é um sistema de gerenciamento de banco de dados e Rust é utilizada para o desenvolvimento de diferentes tipos de aplicações, como ferramentas de linha de comando, web services, ferramentas para DevOps e jogos, mas não atende a pergunta");

                            } else if (site.equalsIgnoreCase("B")) {
                                cont += 20;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Boa! Todas essas linguagens se complementam, embora HTML não é considerada uma linguagem, todas elas tornam o seu site automotizado (javascript), com as informações e titulos necessários (html) e óbvio o não menos importante, bonito (css)");

                            } else if (site.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Pascal e Java são ambas linguagens orientadas a objetos, mas com objetivos fora da pergunta. Elas trabalham com Abstração e estruturas diferentes tambem (linguagem da velha guarda kkkkk)");

                            } else if (site.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "O C e C++ é uma linguagem de programação no qual normalmente utiliza para desenvolvimento de jogos, bibliotecas gráficas e sistemas operacionais (parecem que são pai e filho)");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }
                    case 5:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out.println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println(
                                "Qual hardware dentro da GPU é responsavel por acelerar e executar instruções do sistema? -DICA: é o cérebro do computador-.  (MEDIO)");
                        System.out.println("A) Memória Ram");
                        System.out.println("B) Mouse");
                        System.out.println("C) Processador");
                        System.out.println("D) Placa-mãe");

                        if (cont >= pulaMedio) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String processador = scanner.next();

                            scanner.nextLine();

                            if (processador.equalsIgnoreCase("P")) {
                                cont -= 10;
                                break;

                            } else if (processador.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Ela tem a responsabilidade de armazenar dados, mas por tempo estimado, ou seja, memória volatil, tipo as besteiras que você pensa");

                            } else if (processador.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Mouse é somente um periférico que auxilia no processo de entrada de dados. Lembrando! Rato não, mouse mesmo");

                            } else if (processador.equalsIgnoreCase("C")) {
                                cont += 20;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Temos também um cerebro funcionando além do processador! O processador é essencial para funcionamento correto da sua máquina");

                            } else if (processador.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Nem placa-mãe nem placa pai, lebrando que a placa mãe une todas as partes do sistema numa só rede de fios, porque dispõe de caminhos que permitem a troca de informação entre processadores, memórias, placas e etc ");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");

                            String processador = scanner.next();

                            if (processador.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Ela tem a responsabilidade de armazenar dados, mas por tempo estimado, ou seja, memória volatil, tipo as besteiras que você pensa");

                            } else if (processador.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Mouse é somente um periférico que auxilia no processo de entrada de dados. Lembrando! Rato não, mouse mesmo");

                            } else if (processador.equalsIgnoreCase("C")) {
                                cont += 20;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Temos também um cerebro funcionando além do processador! O processador é essencial para funcionamento correto da sua máquina");

                            } else if (processador.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Nem placa-mãe nem placa pai, lebrando que a placa mãe une todas as partes do sistema numa só rede de fios, porque dispõe de caminhos que permitem a troca de informação entre processadores, memórias, placas e etc ");

                            }
                            break;
                        }
                    case 6:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out.println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println(
                                "Uma tecnologia que permite aos usuários interagir com objetos virtuais em um ambiente imersivo? (MEDIO)");
                        System.out.println("A) Um tipo de linguagem de programação");
                        System.out.println("B) VR");
                        System.out.println("C) Metaverso");
                        System.out.println("D) Um tipo de software de edição de texto");

                        if (cont >= pulaMedio) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String virtual = scanner.next();

                            scanner.nextLine();

                            if (virtual.equalsIgnoreCase("P")) {
                                cont -= 10;
                                break;
                            } else if (virtual.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Tá de sacamagem que voce marcou essa alternativa, fingimos que não vemos isso");

                            } else if (virtual.equalsIgnoreCase("B")) {
                                cont += 20;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Muito bem! O vr ou melhor óculos de realizade virtual permite ao usuário visualizar um ambiente totalmente virtual e interagir com elementos simulados, como se existissem no mundo real");

                            } else if (virtual.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Não fez nem sentido essa alternativa quem dirá voce marca como a certa, faça me o favor");

                            } else if (virtual.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Exatamente, assim como chiclete é o complemento do macarrão");

                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String virtual = scanner.next();

                            if (virtual.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Tá de sacamagem que voce marcou essa alternativa, fingimos que não vemos isso");

                            } else if (virtual.equalsIgnoreCase("B")) {
                                cont += 20;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Muito bem! O vr ou melhor óculos de realizade virtual permite ao usuário visualizar um ambiente totalmente virtual e interagir com elementos simulados, como se existissem no mundo real");

                            } else if (virtual.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Não fez nem sentido essa alternativa quem dirá voce marca como a certa, faça me o favor");

                            } else if (virtual.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Exatamente, assim como chiclete é o complemento do macarrão");

                            }
                            break;
                        }

                    case 7:
                        System.out.println("\u001B[31m\n---------------------|\u001B[0m");
                        System.out.println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m |\u001B[0m");
                        System.out.println("\u001B[31m---------------------|\u001B[0m");
                        System.out.println("O que é aprendizado de máquina (machine learning)? (DIFICIL)");
                        System.out.println(
                                "A) Um conjunto de técnicas que permite que os computadores aprendam com dados sem serem explicitamente programados");
                        System.out.println(
                                "B) Um software que permite aos computadores aprender com um conjunto de regras definidas");
                        System.out.println("C) Um tipo de programação de baixo nível");
                        System.out.println("D) Um conjunto de algoritmos que processam dados em tempo real");

                        if (cont >= pulaDificil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String mLearning = scanner.next();

                            scanner.nextLine();

                            if (mLearning.equalsIgnoreCase("P")) {
                                cont -= 15;
                                break;

                            } else if (mLearning.equalsIgnoreCase("A")) {
                                cont += 30;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Certeiro como um pistoleiro! Meus parabéns receba as suas pontuações que lhe devo");

                            } else if (mLearning.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "É um conceito próximo de linguagem de máquina, mas por não se tratar de um software está errado, paciência meu caro(a)");

                            } else if (mLearning.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Não se trata de linguagem de programação, poderia desistir do Quiz. Brincadeira kkkkkkk");

                            } else if (mLearning.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Vejamos que pela resposta selecionada tu não faz ideia, tente outro momento");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String mLearning = scanner.next();

                            if (mLearning.equalsIgnoreCase("A")) {
                                cont += 30;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Certeiro como um pistoleiro! Meus parabéns receba as suas pontuações que lhe devo");

                            } else if (mLearning.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "É um conceito próximo de linguagem de máquina, mas por não se tratar de um software está errado, paciência meu caro(a)");

                            } else if (mLearning.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Não se trata de linguagem de programação, poderia desistir do Quiz. Brincadeira kkkkkkk");

                            } else if (mLearning.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Vejamos que pela resposta selecionada tu não faz ideia, tente outro momento");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }

                    case 8:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out.println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Qual jogo foi desenvolvido em JAVA? (DIFICIL)");
                        System.out.println("A) Minecraft");
                        System.out.println("B) The last of us");
                        System.out.println("C) Eden ring");
                        System.out.println("D) GTA");

                        if (cont > pulaDificil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String minecraft = scanner.next();

                            scanner.nextLine();

                            if (minecraft.equalsIgnoreCase("P")) {
                                cont -= 15;
                                break;

                            } else if (minecraft.equalsIgnoreCase("A")) {
                                cont += 20;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Receba um bolo quadrado, como forma de agradecimento pelo seu acerto");

                            } else if (minecraft.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("O ultimo de nós que respondeu dessa forma não foi muito longe");

                            } else if (minecraft.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Nada a declarar, você errou");

                            } else if (minecraft.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Mission Failed");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String minecraft = scanner.next();

                            if (minecraft.equalsIgnoreCase("A")) {
                                cont += 30;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println(
                                        "Receba um bolo quadrado, como forma de agradecimento pelo seu acerto");

                            } else if (minecraft.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("O ultimo de nós que respondeu dessa forma não foi muito longe");

                            } else if (minecraft.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Nada a declarar, você errou");

                            } else if (minecraft.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Mission Failed");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }

                    case 9:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out.println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println(
                                "Qual é o circuito eletrônico capaz de amplificar ou barrar correntes eletricas, onde estão presentes nos circuitos integrados que compõem portas lógicas? (DIFICIL)");
                        System.out.println("A) Fonte");
                        System.out.println("B) Cabo VGA");
                        System.out.println("C) Baterias");
                        System.out.println("D) Transistores");

                        if (cont >= pulaDificil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String transistores = scanner.next();

                            scanner.nextLine();

                            if (transistores.equalsIgnoreCase("S")) {
                                cont -= 15;
                                break;

                            } else if (transistores.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Não amigo, a fonte desempenha um papel importante na conversão de energia, não diretamete aos circuitos");

                            } else if (transistores.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Ela só serve para conectar nos monitores dos computadores");

                            } else if (transistores.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Baterias não se enquadra diretamete ao que a pergunta pede, interpretou de outra forma chará");

                            } else if (transistores.equalsIgnoreCase("D")) {
                                cont += 30;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println("Mission Completed! Em cheio, parabéns");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String transistores = scanner.next();

                            if (transistores.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Não amigo, a fonte desempenha um papel importante na conversão de energia, não diretamete aos circuitos");

                            } else if (transistores.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println("Ela só serve para conectar nos monitores dos computadores");

                            } else if (transistores.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Baterias não se enquadra diretamete ao que a pergunta pede, interpretou de outra forma chará");

                            } else if (transistores.equalsIgnoreCase("D")) {
                                cont += 30;
                                System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                System.out.println("Mission Completed! Em cheio, parabéns");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }
                }
            }

            System.out.println("\u001B[32mVOCÊ DESEJA PASSAR PARA O PROXIMO QUIZ? [S/N]\u001B[0m");
            String next = scanner.next();

            if (next.equalsIgnoreCase("S")) {

                System.out.println("____________________________________________________________________________");
                System.out.println("||BEM-VINDO AO QUIZ SOBRE FUTEBOL, O QUIZ SERÁ EM NIVEL INTERNACIONAL||");
                System.out.println("----------------------------------------------------------------------------");

                for (int i = 0; i < 5; i++) {
                    numero = numeros[i];

                    switch (numero) {
                        case 1:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Quantas copas a Inglaterra tem? (12/06/23). (FACIL)");
                            System.out.println("A) 1");
                            System.out.println("B) 2");
                            System.out.println("C) 3");
                            System.out.println("D) 4");

                            if (cont >= pulaFacil + pulaFacil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String copaI = scanner.next();

                                scanner.nextLine();

                                if (copaI.equalsIgnoreCase("P")) {
                                    cont -= 5;
                                    break;

                                } else if (copaI.equalsIgnoreCase("A")) {
                                    cont += 10;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Ganhou a copa em 1966, contra a Alemanha");

                                } else if (copaI.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Em 1990, a Inglaterra chegou até a semiFInal, porém a alemanha ganhou na partida de penaltis");

                                } else if (copaI.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Essa você passou longe, quase não conseguiu um titulo, imagina 3.");

                                } else if (copaI.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Se 3 estava longe, quem dira 4.");
                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {

                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String copaI = scanner.next();

                                if (copaI.equalsIgnoreCase("A")) {
                                    cont += 10;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Ganhou a copa em 1966, contra a Alemanha");

                                } else if (copaI.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Em 1990, a Inglaterra chegou até a semiFInal, porém a alemanha ganhou na partida de penaltis");

                                } else if (copaI.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Essa você passou longe, quase não conseguiu um titulo, imagina 3.");

                                } else if (copaI.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Se 3 estava longe, quem dira 4.");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }

                        case 2:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Quantas Champions o PSG tem?  (FACIL)");
                            System.out.println("A) 10");
                            System.out.println("B) 5");
                            System.out.println("C) 2");
                            System.out.println("D) 0");

                            if (cont >= pulaFacil + pulaFacil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String psg = scanner.next();

                                scanner.nextLine();

                                if (psg.equalsIgnoreCase("P")) {
                                    cont -= 5;
                                    break;

                                } else if (psg.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Atualmente, só o Real Madrid conseguiu ganhar esse marco");

                                } else if (psg.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("PSG não está conseguindo nem ganhar 1, quem dira 5.");

                                } else if (psg.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("PSG chegou no maximo 2 vezes de ganhar a champions");

                                } else if (psg.equalsIgnoreCase("D")) {
                                    cont += 10;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("No momento, a maior obsessão do time é esse titulo");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String psg = scanner.next();

                                if (psg.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Atualmente, só o Real Madrid conseguiu ganhar esse marco");

                                } else if (psg.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("PSG não está conseguindo nem ganhar 1, quem dira 5.");

                                } else if (psg.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("PSG chegou no maximo 2 vezes de ganhar a champions");

                                } else if (psg.equalsIgnoreCase("D")) {
                                    cont += 10;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("No momento, a maior obsessão do time é esse titulo");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                                }
                                break;
                            }

                        case 3:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Qual o nome da posição de jogador que fica na defensiva? (Não é goleiro) (FACIL)");
                            System.out.println("A) Defensor");
                            System.out.println("B) Zagueiro");
                            System.out.println("C) Atacante");
                            System.out.println("D) Meio de campo");

                            if (cont >= pulaFacil + pulaFacil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String zag = scanner.next();

                                scanner.nextLine();

                                if (zag.equalsIgnoreCase("S")) {
                                    cont -= 5;
                                    break;

                                } else if (zag.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Tenho quase 100% de certeza que não utilizamos esse termo no futebol");

                                } else if (zag.equalsIgnoreCase("B")) {
                                    cont += 10;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Os zagueiros ficam proximo ao Gol");

                                } else if (zag.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Essa posição ai é do Neymar, não do Thiago Silva");

                                } else if (zag.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Essa posição é do nosso Querido Case, autor do gol entre brasil e suiça, na copa de 2022");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");

                                String zag = scanner.next();

                                if (zag.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Tenho quase 100% de certeza que não utilizamos esse termo no futebol");

                                } else if (zag.equalsIgnoreCase("B")) {
                                    cont += 10;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Os zagueiros ficam proximo ao Gol");

                                } else if (zag.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Essa posição ai é do Neymar, não do Thiago Silva");

                                } else if (zag.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Essa posição é do nosso Querido Case, autor do gol entre brasil e suiça, na copa de 2022");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                                }
                                break;
                            }

                        case 4:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Qual foi o ultimo brasileiro a ganhar a bola de Ouro? (MEDIO)");
                            System.out.println("A) Kaká");
                            System.out.println("B) Ronaldinho");
                            System.out.println("C) Neymar");
                            System.out.println("D) Ronaldo");

                            if (cont >= pulaMedio + pulaMedio) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String ka = scanner.next();

                                scanner.nextLine();

                                if (ka.equalsIgnoreCase("P")) {
                                    cont -= 10;
                                    break;

                                } else if (ka.equalsIgnoreCase("A")) {
                                    cont += 20;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Kaka Ganhou sua bola de ouro em 2007");

                                } else if (ka.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Ronaldinho ganhou sua bola de ouro em 2005, ficando atrás do Kaka que ganhou a sua em 2007");

                                } else if (ka.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Neymar nunca ganhou a bola de ouro");

                                } else if (ka.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Ronaldo ganhou duas bolas de ouro, em 1997 e 2002. Entretanto o mais recente a ganhar esse marco foi o Kaka em 2007");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String ka = scanner.next();
                                if (ka.equalsIgnoreCase("A")) {
                                    cont += 20;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Kaka Ganhou sua bola de ouro em 2007");

                                } else if (ka.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Ronaldinho ganhou sua bola de ouro em 2005, ficando atrás do Kaka que ganhou a sua em 2007");

                                } else if (ka.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Neymar nunca ganhou a bola de ouro");

                                } else if (ka.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Ronaldo ganhou duas bolas de ouro, em 1997 e 2002. Entretanto o mais recente a ganhar esse marco foi o Kaka em 2007");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }

                        case 5:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Quem Ganhou mais Titulos?  (MEDIO)");
                            System.out.println("A) Pelé");
                            System.out.println("B) Messi");
                            System.out.println("C) Cristiano");
                            System.out.println("D) Daniel Alves");

                            if (cont >= pulaMedio + pulaMedio) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String dan = scanner.next();

                                scanner.nextLine();

                                if (dan.equalsIgnoreCase("P")) {
                                    cont -= 10;
                                    break;

                                } else if (dan.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Pelé possui 37 titulos, ficando atrás apenas de Messi e Daniel Alves");

                                } else if (dan.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Messi possui 38 titulos, ficando atrás apenas de Daniel Alves");

                                } else if (dan.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Cristiano Ronaldo possui 34 titulos");

                                } else if (dan.equalsIgnoreCase("D")) {
                                    cont += 20;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Atualmente o jogador com mais titulos é o Daniel ALves, possui 42 titulos em sua carreira");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String dan = scanner.next();

                                if (dan.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Pelé possui 37 titulos, ficando atrás apenas de Messi e Daniel Alves");

                                } else if (dan.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Messi possui 38 titulos, ficando atrás apenas de Daniel Alves");

                                } else if (dan.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Cristiano Ronaldo possui 34 titulos");

                                } else if (dan.equalsIgnoreCase("D")) {
                                    cont += 20;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Atualmente o jogador com mais titulos é o Daniel ALves, possui 42 titulos em sua carreira");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }
                        case 6:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Poque o Pelé não ganhou a taça de ouro quando jogava? (MEDIO)");
                            System.out.println("A) Porque ele não jogava na Europa");
                            System.out.println("B) Ele não era o melhor");
                            System.out.println("C) Ele jogava bem, porem não a ponto de ganhar");
                            System.out.println("D) Ele não jogava bem");

                            if (cont >= pulaMedio + pulaMedio) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String pele = scanner.next();

                                scanner.nextLine();

                                if (pele.equalsIgnoreCase("P")) {
                                    cont -= 10;
                                    break;

                                } else if (pele.equalsIgnoreCase("A")) {
                                    cont += 20;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Após se aposentar, ele ganhou sua taça em 2007");

                                } else if (pele.equalsIgnoreCase("B")) {
                                    System.out.println("\nRespota incorreta");
                                    System.out.println(
                                            "Pelé é o melhor jogador do mundo, nem o Maradona chegava aos pés dele");

                                } else if (pele.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out
                                            .println(
                                                    "Se ele não jogava bem a ponto de ganhar, quem será que sabe???");

                                } else if (pele.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Se ele não jogava bem, quem sabe??");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                                }
                                break;
                            } else {

                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");

                                String pele = scanner.next();

                                if (pele.equalsIgnoreCase("A")) {
                                    cont += 20;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Após se aposentar, ele ganhou sua taça em 2007");

                                } else if (pele.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Pelé é o melhor jogador do mundo, nem o Maradona chegava aos pés dele");

                                } else if (pele.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out
                                            .println("Se ele não jogava bem a ponto de ganhar, quem será que sabe???");

                                } else if (pele.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Se ele não jogava bem, quem sabe??");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                                }
                                break;
                            }

                        case 7:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Quem ganhou a copa de 1950? (DIFICIL)");
                            System.out.println("A) Brasil");
                            System.out.println("B) Uruguai");
                            System.out.println("C) Italia");
                            System.out.println("D) França");

                            if (cont >= pulaDificil + pulaDificil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String uru = scanner.next();

                                scanner.nextLine();

                                if (uru.equalsIgnoreCase("P")) {
                                    cont -= 15;
                                    break;

                                } else if (uru.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Brasil perdeu de virada para o Uruguai");

                                } else if (uru.equalsIgnoreCase("B")) {
                                    cont += 30;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Ganhou de virada contra o Brasil, conquistando seu titulo");

                                } else if (uru.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Italia não conseguiu passar nem da primeira fase");

                                } else if (uru.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("França não disputou a copa em 1950");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String uru = scanner.next();

                                if (uru.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Brasil perdeu de virada para o Uruguai");

                                } else if (uru.equalsIgnoreCase("B")) {
                                    cont += 30;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Ganhou de virada contra o Brasil, conquistando seu titulo");

                                } else if (uru.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Italia não conseguiu passar nem da primeira fase");

                                } else if (uru.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("França não disputou a copa em 1950");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }

                        case 8:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Qual time brasileiro tem a maior marca de gols na historia do Esporte? (DIFICIL)");
                            System.out.println("A) São Paulo");
                            System.out.println("B) Gremio");
                            System.out.println("C) Flamengo");
                            System.out.println("D) Santos");

                            if (cont > pulaDificil + pulaDificil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String santos = scanner.next();

                                scanner.nextLine();

                                if (santos.equalsIgnoreCase("P")) {
                                    cont -= 15;
                                    break;

                                } else if (santos.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("São paulo possui um saldo de Gol's de 10.376");

                                } else if (santos.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Gremio possui o saldo de Gol's de 2.888");

                                } else if (santos.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Flamengo possui o saldo de Gol's de 12.000");

                                } else if (santos.equalsIgnoreCase("D")) {
                                    cont += 30;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Santos possui o saldo de Gol's de 12.747");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String santos = scanner.next();

                                if (santos.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("São paulo possui um saldo de Gol's de 10.376");

                                } else if (santos.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Gremio possui o saldo de Gol's de 2.888");

                                } else if (santos.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Flamengo possui o saldo de Gol's de 12.000");

                                } else if (santos.equalsIgnoreCase("D")) {
                                    cont += 30;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println("Santos possui o saldo de Gol's de 12.747");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }

                        case 9:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Qual foi o maior campeão do nivel Nacional? (DIFICIL)");
                            System.out.println("A) Palmeiras");
                            System.out.println("B) Bahia");
                            System.out.println("C) Santos");
                            System.out.println("D) Atletico MG");

                            if (cont >= pulaDificil + pulaDificil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String palm = scanner.next();

                                scanner.nextLine();

                                if (palm.equalsIgnoreCase("P")) {
                                    cont -= 15;
                                    break;

                                } else if (palm.equalsIgnoreCase("A")) {
                                    cont += 30;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Palmeiras atualmente é o maior campeão, com o total de 16 Titulos");

                                } else if (palm.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Bahia possui 2 titulos");

                                } else if (palm.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Santos possui 9 titulos");

                                } else if (palm.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Atletico-MG possui 7 titulos");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                                }
                                break;
                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String palm = scanner.next();

                                if (palm.equalsIgnoreCase("A")) {
                                    cont += 30;
                                    System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Palmeiras atualmente é o maior campeão, com o total de 16 Titulos");

                                } else if (palm.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Bahia possui 2 titulos");

                                } else if (palm.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Santos possui 9 titulos");

                                } else if (palm.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println("Atletico-MG possui 7 titulos");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                                }
                                break;
                            }
                    }
                }
            }
        }
        if (opcao == 2) {

            for (int j = 0; j < 5; j++) {
                numero = numeros[j];

                switch (numero) {
                    case 1:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Quantas copas a Inglaterra tem? (12/06/23). (FACIL)");
                        System.out.println("A) 1");
                        System.out.println("B) 2");
                        System.out.println("C) 3");
                        System.out.println("D) 4");

                        if (cont >= pulaFacil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String copaI = scanner.next();

                            scanner.nextLine();

                            if (copaI.equalsIgnoreCase("P")) {
                                cont -= 5;
                                break;

                            } else if (copaI.equalsIgnoreCase("A")) {
                                cont += 10;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Ganhou a copa em 1966, contra a Alemanha");

                            } else if (copaI.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Em 1990, a Inglaterra chegou até a semiFInal, porém a alemanha ganhou na partida de penaltis");

                            } else if (copaI.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Essa você passou longe, quase não conseguiu um titulo, imagina 3.");

                            } else if (copaI.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Se 3 estava longe, quem dira 4.");
                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {

                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String copaI = scanner.next();

                            if (copaI.equalsIgnoreCase("A")) {
                                cont += 10;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Ganhou a copa em 1966, contra a Alemanha");

                            } else if (copaI.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Em 1990, a Inglaterra chegou até a semiFInal, porém a alemanha ganhou na partida de penaltis");

                            } else if (copaI.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Essa você passou longe, quase não conseguiu um titulo, imagina 3.");

                            } else if (copaI.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Se 3 estava longe, quem dira 4.");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }

                    case 2:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Quantas Champions o PSG tem?  (FACIL)");
                        System.out.println("A) 10");
                        System.out.println("B) 5");
                        System.out.println("C) 2");
                        System.out.println("D) 0");

                        if (cont >= pulaFacil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String psg = scanner.next();

                            scanner.nextLine();

                            if (psg.equalsIgnoreCase("P")) {
                                cont -= 5;
                                break;

                            } else if (psg.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Atualmente, só o Real Madrid conseguiu ganhar esse marco");

                            } else if (psg.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("PSG não está conseguindo nem ganhar 1, quem dira 5.");

                            } else if (psg.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("PSG chegou no maximo 2 vezes de ganhar a champions");

                            } else if (psg.equalsIgnoreCase("D")) {
                                cont += 10;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("No momento, a maior obsessão do time é esse titulo");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String psg = scanner.next();

                            if (psg.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Atualmente, só o Real Madrid conseguiu ganhar esse marco");

                            } else if (psg.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("PSG não está conseguindo nem ganhar 1, quem dira 5.");

                            } else if (psg.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("PSG chegou no maximo 2 vezes de ganhar a champions");

                            } else if (psg.equalsIgnoreCase("D")) {
                                cont += 10;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("No momento, a maior obsessão do time é esse titulo");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }

                    case 3:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println(
                                "Qual o nome da posição de jogador que fica na defensiva? (Não é goleiro) (FACIL)");
                        System.out.println("A) Defensor");
                        System.out.println("B) Zagueiro");
                        System.out.println("C) Atacante");
                        System.out.println("D) Meio de campo");

                        if (cont >= pulaFacil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String zag = scanner.next();

                            scanner.nextLine();

                            if (zag.equalsIgnoreCase("S")) {
                                cont -= 5;
                                break;

                            } else if (zag.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Tenho quase 100% de certeza que não utilizamos esse termo no futebol");

                            } else if (zag.equalsIgnoreCase("B")) {
                                cont += 10;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Os zagueiros ficam proximo ao Gol");

                            } else if (zag.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Essa posição ai é do Neymar, não do Thiago Silva");

                            } else if (zag.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Essa posição é do nosso Querido Case, autor do gol entre brasil e suiça, na copa de 2022");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");

                            String zag = scanner.next();

                            if (zag.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Tenho quase 100% de certeza que não utilizamos esse termo no futebol");

                            } else if (zag.equalsIgnoreCase("B")) {
                                cont += 10;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Os zagueiros ficam proximo ao Gol");

                            } else if (zag.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Essa posição ai é do Neymar, não do Thiago Silva");

                            } else if (zag.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Essa posição é do nosso Querido Case, autor do gol entre brasil e suiça, na copa de 2022");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                            }
                            break;
                        }

                    case 4:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Qual foi o ultimo brasileiro a ganhar a bola de Ouro? (MEDIO)");
                        System.out.println("A) Kaká");
                        System.out.println("B) Ronaldinho");
                        System.out.println("C) Neymar");
                        System.out.println("D) Ronaldo");

                        if (cont >= pulaMedio) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String ka = scanner.next();

                            scanner.nextLine();

                            if (ka.equalsIgnoreCase("P")) {
                                cont -= 10;
                                break;

                            } else if (ka.equalsIgnoreCase("A")) {
                                cont += 20;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Kaka Ganhou sua bola de ouro em 2007");

                            } else if (ka.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Ronaldinho ganhou sua bola de ouro em 2005, ficando atrás do Kaka que ganhou a sua em 2007");

                            } else if (ka.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Neymar nunca ganhou a bola de ouro");

                            } else if (ka.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Ronaldo ganhou duas bolas de ouro, em 1997 e 2002. Entretanto o mais recente a ganhar esse marco foi o Kaka em 2007");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String ka = scanner.next();
                            if (ka.equalsIgnoreCase("A")) {
                                cont += 20;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Kaka Ganhou sua bola de ouro em 2007");

                            } else if (ka.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Ronaldinho ganhou sua bola de ouro em 2005, ficando atrás do Kaka que ganhou a sua em 2007");

                            } else if (ka.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Neymar nunca ganhou a bola de ouro");

                            } else if (ka.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Ronaldo ganhou duas bolas de ouro, em 1997 e 2002. Entretanto o mais recente a ganhar esse marco foi o Kaka em 2007");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }

                    case 5:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Quem Ganhou mais Titulos?  (MEDIO)");
                        System.out.println("A) Pelé");
                        System.out.println("B) Messi");
                        System.out.println("C) Cristiano");
                        System.out.println("D) Daniel Alves");

                        if (cont >= pulaMedio) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String dan = scanner.next();

                            scanner.nextLine();

                            if (dan.equalsIgnoreCase("P")) {
                                cont -= 10;
                                break;

                            } else if (dan.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Pelé possui 37 titulos, ficando atrás apenas de Messi e Daniel Alves");

                            } else if (dan.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Messi possui 38 titulos, ficando atrás apenas de Daniel Alves");

                            } else if (dan.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Cristiano Ronaldo possui 34 titulos");

                            } else if (dan.equalsIgnoreCase("D")) {
                                cont += 20;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println(
                                        "Atualmente o jogador com mais titulos é o Daniel ALves, possui 42 titulos em sua carreira");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;

                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String dan = scanner.next();

                            if (dan.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Pelé possui 37 titulos, ficando atrás apenas de Messi e Daniel Alves");

                            } else if (dan.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Messi possui 38 titulos, ficando atrás apenas de Daniel Alves");

                            } else if (dan.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Cristiano Ronaldo possui 34 titulos");

                            } else if (dan.equalsIgnoreCase("D")) {
                                cont += 20;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println(
                                        "Atualmente o jogador com mais titulos é o Daniel ALves, possui 42 titulos em sua carreira");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }
                    case 6:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Poque o Pelé não ganhou a taça de ouro quando jogava? (MEDIO)");
                        System.out.println("A) Porque ele não jogava na Europa");
                        System.out.println("B) Ele não era o melhor");
                        System.out.println("C) Ele jogava bem, porem não a ponto de ganhar");
                        System.out.println("D) Ele não jogava bem");

                        if (cont >= pulaMedio) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String pele = scanner.next();

                            scanner.nextLine();

                            if (pele.equalsIgnoreCase("P")) {
                                cont -= 10;
                                break;

                            } else if (pele.equalsIgnoreCase("A")) {
                                cont += 20;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Após se aposentar, ele ganhou sua taça em 2007");

                            } else if (pele.equalsIgnoreCase("B")) {
                                System.out.println("\nRespota incorreta");
                                System.out.println(
                                        "Pelé é o melhor jogador do mundo, nem o Maradona chegava aos pés dele");

                            } else if (pele.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out
                                        .println(
                                                "Se ele não jogava bem a ponto de ganhar, quem será que sabe???");

                            } else if (pele.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Se ele não jogava bem, quem sabe??");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                            }
                            break;
                        } else {

                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");

                            String pele = scanner.next();

                            if (pele.equalsIgnoreCase("A")) {
                                cont += 20;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Após se aposentar, ele ganhou sua taça em 2007");

                            } else if (pele.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println(
                                        "Pelé é o melhor jogador do mundo, nem o Maradona chegava aos pés dele");

                            } else if (pele.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out
                                        .println("Se ele não jogava bem a ponto de ganhar, quem será que sabe???");

                            } else if (pele.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Se ele não jogava bem, quem sabe??");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                            }
                            break;
                        }

                    case 7:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Quem ganhou a copa de 1950? (DIFICIL)");
                        System.out.println("A) Brasil");
                        System.out.println("B) Uruguai");
                        System.out.println("C) Italia");
                        System.out.println("D) França");

                        if (cont >= pulaDificil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String uru = scanner.next();

                            scanner.nextLine();

                            if (uru.equalsIgnoreCase("P")) {
                                cont -= 15;
                                break;

                            } else if (uru.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Brasil perdeu de virada para o Uruguai");

                            } else if (uru.equalsIgnoreCase("B")) {
                                cont += 30;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Ganhou de virada contra o Brasil, conquistando seu titulo");

                            } else if (uru.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Italia não conseguiu passar nem da primeira fase");

                            } else if (uru.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("França não disputou a copa em 1950");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String uru = scanner.next();

                            if (uru.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Brasil perdeu de virada para o Uruguai");

                            } else if (uru.equalsIgnoreCase("B")) {
                                cont += 30;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Ganhou de virada contra o Brasil, conquistando seu titulo");

                            } else if (uru.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Italia não conseguiu passar nem da primeira fase");

                            } else if (uru.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("França não disputou a copa em 1950");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }

                    case 8:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println(
                                "Qual time brasileiro tem a maior marca de gols na historia do Esporte? (DIFICIL)");
                        System.out.println("A) São Paulo");
                        System.out.println("B) Gremio");
                        System.out.println("C) Flamengo");
                        System.out.println("D) Santos");

                        if (cont > pulaDificil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String santos = scanner.next();

                            scanner.nextLine();

                            if (santos.equalsIgnoreCase("P")) {
                                cont -= 15;
                                break;

                            } else if (santos.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("São paulo possui um saldo de Gol's de 10.376");

                            } else if (santos.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Gremio possui o saldo de Gol's de 2.888");

                            } else if (santos.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Flamengo possui o saldo de Gol's de 12.000");

                            } else if (santos.equalsIgnoreCase("D")) {
                                cont += 30;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Santos possui o saldo de Gol's de 12.747");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String santos = scanner.next();

                            if (santos.equalsIgnoreCase("A")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("São paulo possui um saldo de Gol's de 10.376");

                            } else if (santos.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Gremio possui o saldo de Gol's de 2.888");

                            } else if (santos.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Flamengo possui o saldo de Gol's de 12.000");

                            } else if (santos.equalsIgnoreCase("D")) {
                                cont += 30;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println("Santos possui o saldo de Gol's de 12.747");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                            }
                            break;
                        }

                    case 9:
                        System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                        System.out
                                .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                        System.out.println("\u001B[31m-----------------------|\u001B[0m");
                        System.out.println("Qual foi o maior campeão do nivel Nacional? (DIFICIL)");
                        System.out.println("A) Palmeiras");
                        System.out.println("B) Bahia");
                        System.out.println("C) Santos");
                        System.out.println("D) Atletico MG");

                        if (cont >= pulaDificil) {
                            System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                            System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String palm = scanner.next();

                            scanner.nextLine();

                            if (palm.equalsIgnoreCase("P")) {
                                cont -= 15;
                                break;

                            } else if (palm.equalsIgnoreCase("A")) {
                                cont += 30;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println(
                                        "Palmeiras atualmente é o maior campeão, com o total de 16 Titulos");

                            } else if (palm.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Bahia possui 2 titulos");

                            } else if (palm.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Santos possui 9 titulos");

                            } else if (palm.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Atletico-MG possui 7 titulos");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                            }
                            break;
                        } else {
                            System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                            String palm = scanner.next();

                            if (palm.equalsIgnoreCase("A")) {
                                cont += 30;
                                System.out.println("\u001B[32m\nResposta correta!\u001B[0m");
                                System.out.println(
                                        "Palmeiras atualmente é o maior campeão, com o total de 16 Titulos");

                            } else if (palm.equalsIgnoreCase("B")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Bahia possui 2 titulos");

                            } else if (palm.equalsIgnoreCase("C")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Santos possui 9 titulos");

                            } else if (palm.equalsIgnoreCase("D")) {
                                System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                System.out.println("Atletico-MG possui 7 titulos");

                            } else {
                                System.out.println("\u001B[31m\nRespota indevida\u001B[0m");

                            }
                            break;
                        }
                }
            }

            System.out.println("\u001B[32mVOCÊ DESEJA PASSAR PARA O PROXIMO QUIZ? [S/N]\u001B[0m");
            String net = scanner.next();

            if (net.equalsIgnoreCase("S")) {

                System.out.println("____________________________________________________________________________");
                System.out.println("||BEM-VINDO AO QUIZ SOBRE TECNOLOGIA, USE SEU CONHECIMENTO ADQUIRIDO EM AULA||");
                System.out.println("----------------------------------------------------------------------------");

                for (int j = 0; j < 5; j++) {
                    numero = numeros[j];

                    switch (numero) {
                        case 1:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Quem é o CEO da SpaceX que atualmente comprou o Twitter? (FACIL)");
                            System.out.println("A) Jeff Bezos");
                            System.out.println("B) Harry Potter");
                            System.out.println("C) Steve Jobs");
                            System.out.println("D) Elon Musk");

                            if (cont >= pulaFacil + pulaFacil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String twitter = scanner.next();

                                scanner.nextLine();

                                if (twitter.equalsIgnoreCase("P")) {
                                    cont -= 5;
                                    break;

                                } else if (twitter.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Jeff Bezos é sim um homem 'grande', mas é CEO de outra empresa a Amazon");

                                } else if (twitter.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Pelas barbas de Merlin! Potter não era dono nem do seu próprio quarto");

                                } else if (twitter.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31m\nRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Steve Jobs era somente fundador da Apple e eventualmente de outras frutas");

                                } else if (twitter.equalsIgnoreCase("D")) {
                                    cont += 10;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println("Na mosca, Musk comprou recentemente a rede social");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String twitter = scanner.nextLine();

                                if (twitter.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Jeff Bezos é sim um homem 'grande', mas é CEO de outra empresa a Amazon");

                                } else if (twitter.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Pelas barbas de Merlin! Potter não era dono nem do seu próprio quarto");

                                } else if (twitter.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Steve Jobs era somente fundador da Apple e eventualmente de outras frutas");

                                } else if (twitter.equalsIgnoreCase("D")) {
                                    cont += 10;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println("Na mosca, Musk comprou recentemente a rede social");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            }
                        case 2:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Qual sistema operacional que é mais utilizado pelo mundo inteiro (DICA: Se chama janela em inglês)? (FACIL)");
                            System.out.println("A) Android");
                            System.out.println("B) Linux");
                            System.out.println("C) Mac OS/ IOS");
                            System.out.println("D) Windows");

                            if (cont >= pulaFacil + pulaFacil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String windows = scanner.next();

                                scanner.nextLine();

                                if (windows.equalsIgnoreCase("P")) {
                                    cont -= 5;
                                    break;

                                } else if (windows.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Android (robo) é sim muito usado, entretanto existe um sistema ainda mais antigo e utilizado por todos os usuários");

                                } else if (windows.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Linux (pinguim), é um sistema muito versátil muitas empresas utilizam justamente pelo desempenho e liberdade que fornece, mas está longe de ser mais utilizado por questões de sua fama de ser complicado de aprender e etc");

                                } else if (windows.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "O sistema da Apple é conhecida, mas não é mais utilizado por diversos ambitos. Seus produtos tem um custo alto em certas partes do mundo, mas a plataforma e seus produtos tem uma qualidade e versatilidade única");

                                } else if (windows.equalsIgnoreCase("D")) {
                                    cont += 10;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Pra quem sabe inglês matou na hora, mas vamos ser sinceros essa era bem fácil. O windows fornece layouts e interatividades que já estamos acostumados assim se criou também uma ótima compra pra quem está começando aprender");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String windows = scanner.next();

                                if (windows.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Android (robo) é sim muito usado, entretanto existe um sistema ainda mais antigo e utilizado por todos os usuários");

                                } else if (windows.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Linux (pinguim), é um sistema muito versátil muitas empresas utilizam justamente pelo desempenho e liberdade que fornece, mas está longe de ser mais utilizado por questões de sua fama de ser complicado de aprender e etc");

                                } else if (windows.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "O sistema da Apple é conhecida, mas não é mais utilizado por diversos ambitos. Seus produtos tem um custo alto em certas partes do mundo, mas a plataforma e seus produtos tem uma qualidade e versatilidade única");

                                } else if (windows.equalsIgnoreCase("D")) {
                                    cont += 10;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Pra quem sabe inglês matou na hora, mas vamos ser sinceros essa era bem fácil. O windows fornece layouts e interatividades que já estamos acostumados assim se criou também uma ótima compra pra quem está começando aprender");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            }
                        case 3:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Qual inteligência artificial com serviços de assistência virtual fornecendo dados em texto, se tornou famoso entre todos os públicos? (FACIL)");
                            System.out.println("A) Whatsapp");
                            System.out.println("B) ChatGPT");
                            System.out.println("C) Discord");
                            System.out.println("D) Bing");

                            if (cont >= pulaFacil + pulaFacil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String chatGPT = scanner.next();

                                scanner.nextLine();

                                if (chatGPT.equalsIgnoreCase("P")) {
                                    cont -= 5;
                                    break;

                                } else if (chatGPT.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Whatsapp é somente um aplicativo multiplataforma de mensagens instantaneas e chamadas de voz para smartphones (Essa voce ramelou ein)");

                                } else if (chatGPT.equalsIgnoreCase("B")) {
                                    cont += 10;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Exato, tivemos aqui no Brasil o primeiro contato com o ChatGPT da OpenAI e por ter dado muito certo essa ferramenta para o publico se desenvolveram outras, com serviços diferentes");

                                } else if (chatGPT.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Discord é um aplicativo de voz sobre IP proprietario e gratuito, projetado inicialmente para comunidades de jogos. Hospeda algumas ferramentas IA's como o MidJourney, mas não atende a pergunta");

                                } else if (chatGPT.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Até faz sentido o Bing, justamente por atender todos os objetivos como IA fornecendo os dados devidos, mas não foi essa que tivemos o primeiro contato (além de ter sido recente seu lançamento)");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String chatGPT = scanner.next();

                                if (chatGPT.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Whatsapp é somente um aplicativo multiplataforma de mensagens instantaneas e chamadas de voz para smartphones (Essa voce ramelou ein)");

                                } else if (chatGPT.equalsIgnoreCase("B")) {
                                    cont += 10;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Exato, tivemos aqui no Brasil o primeiro contato com o ChatGPT da OpenAI e por ter dado muito certo essa ferramenta para o publico se desenvolveram outras, com serviços diferentes");

                                } else if (chatGPT.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Discord é um aplicativo de voz sobre IP proprietario e gratuito, projetado inicialmente para comunidades de jogos. Hospeda algumas ferramentas IA's como o MidJourney, mas não atende a pergunta");

                                } else if (chatGPT.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Até faz sentido o Bing, justamente por atender todos os objetivos como IA fornecendo os dados devidos, mas não foi essa que tivemos o primeiro contato (além de ter sido recente seu lançamento)");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }
                        case 4:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Quais linguagens de programação é possível para realizar um site? (MEDIO)");
                            System.out.println("A) MySQL e Rust");
                            System.out.println("B) Html, javacript e CSS");
                            System.out.println("C) Java e PASCAL");
                            System.out.println("D) C++ e C");

                            if (cont >= pulaMedio) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String site = scanner.next();

                                scanner.nextLine();

                                if (site.equalsIgnoreCase("P")) {
                                    cont -= 10;
                                    break;

                                } else if (site.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "O MySQL é um sistema de gerenciamento de banco de dados e Rust é utilizada para o desenvolvimento de diferentes tipos de aplicações, como ferramentas de linha de comando, web services, ferramentas para DevOps e jogos, mas não atende a pergunta");

                                } else if (site.equalsIgnoreCase("B")) {
                                    cont += 20;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Boa! Todas essas linguagens se complementam, embora HTML não é considerada uma linguagem, todas elas tornam o seu site automotizado (javascript), com as informações e titulos necessários (html) e óbvio o não menos importante, bonito (css)");

                                } else if (site.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Pascal e Java são ambas linguagens orientadas a objetos, mas com objetivos fora da pergunta. Elas trabalham com Abstração e estruturas diferentes tambem (linguagem da velha guarda kkkkk)");

                                } else if (site.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "O C e C++ é uma linguagem de programação no qual normalmente utiliza para desenvolvimento de jogos, bibliotecas gráficas e sistemas operacionais (parecem que são pai e filho)");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String site = scanner.next();

                                if (site.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "O MySQL é um sistema de gerenciamento de banco de dados e Rust é utilizada para o desenvolvimento de diferentes tipos de aplicações, como ferramentas de linha de comando, web services, ferramentas para DevOps e jogos, mas não atende a pergunta");

                                } else if (site.equalsIgnoreCase("B")) {
                                    cont += 20;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Boa! Todas essas linguagens se complementam, embora HTML não é considerada uma linguagem, todas elas tornam o seu site automotizado (javascript), com as informações e titulos necessários (html) e óbvio o não menos importante, bonito (css)");

                                } else if (site.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Pascal e Java são ambas linguagens orientadas a objetos, mas com objetivos fora da pergunta. Elas trabalham com Abstração e estruturas diferentes tambem (linguagem da velha guarda kkkkk)");

                                } else if (site.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "O C e C++ é uma linguagem de programação no qual normalmente utiliza para desenvolvimento de jogos, bibliotecas gráficas e sistemas operacionais (parecem que são pai e filho)");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }
                        case 5:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Qual hardware dentro da GPU é responsavel por acelerar e executar instruções do sistema? -DICA: é o cérebro do computador-.  (MEDIO)");
                            System.out.println("A) Memória Ram");
                            System.out.println("B) Mouse");
                            System.out.println("C) Processador");
                            System.out.println("D) Placa-mãe");

                            if (cont >= pulaMedio + pulaMedio) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String processador = scanner.next();

                                scanner.nextLine();

                                if (processador.equalsIgnoreCase("P")) {
                                    cont -= 10;
                                    break;

                                } else if (processador.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Ela tem a responsabilidade de armazenar dados, mas por tempo estimado, ou seja, memória volatil, tipo as besteiras que você pensa");

                                } else if (processador.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Mouse é somente um periférico que auxilia no processo de entrada de dados. Lembrando! Rato não, mouse mesmo");

                                } else if (processador.equalsIgnoreCase("C")) {
                                    cont += 20;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Temos também um cerebro funcionando além do processador! O processador é essencial para funcionamento correto da sua máquina");

                                } else if (processador.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Nem placa-mãe nem placa pai, lebrando que a placa mãe une todas as partes do sistema numa só rede de fios, porque dispõe de caminhos que permitem a troca de informação entre processadores, memórias, placas e etc ");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");

                                String processador = scanner.next();

                                if (processador.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Ela tem a responsabilidade de armazenar dados, mas por tempo estimado, ou seja, memória volatil, tipo as besteiras que você pensa");

                                } else if (processador.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Mouse é somente um periférico que auxilia no processo de entrada de dados. Lembrando! Rato não, mouse mesmo");

                                } else if (processador.equalsIgnoreCase("C")) {
                                    cont += 20;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Temos também um cerebro funcionando além do processador! O processador é essencial para funcionamento correto da sua máquina");

                                } else if (processador.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Nem placa-mãe nem placa pai, lebrando que a placa mãe une todas as partes do sistema numa só rede de fios, porque dispõe de caminhos que permitem a troca de informação entre processadores, memórias, placas e etc ");

                                }
                                break;
                            }
                        case 6:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Uma tecnologia que permite aos usuários interagir com objetos virtuais em um ambiente imersivo? (MEDIO)");
                            System.out.println("A) Um tipo de linguagem de programação");
                            System.out.println("B) VR");
                            System.out.println("C) Metaverso");
                            System.out.println("D) Um tipo de software de edição de texto");

                            if (cont >= pulaMedio + pulaMedio) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String virtual = scanner.next();

                                scanner.nextLine();

                                if (virtual.equalsIgnoreCase("P")) {
                                    cont -= 10;
                                    break;
                                } else if (virtual.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Tá de sacamagem que voce marcou essa alternativa, fingimos que não vemos isso");

                                } else if (virtual.equalsIgnoreCase("B")) {
                                    cont += 20;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Muito bem! O vr ou melhor óculos de realizade virtual permite ao usuário visualizar um ambiente totalmente virtual e interagir com elementos simulados, como se existissem no mundo real");

                                } else if (virtual.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Não fez nem sentido essa alternativa quem dirá voce marca como a certa, faça me o favor");

                                } else if (virtual.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Exatamente, assim como chiclete é o complemento do macarrão");

                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String virtual = scanner.next();

                                if (virtual.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Tá de sacamagem que voce marcou essa alternativa, fingimos que não vemos isso");

                                } else if (virtual.equalsIgnoreCase("B")) {
                                    cont += 20;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Muito bem! O vr ou melhor óculos de realizade virtual permite ao usuário visualizar um ambiente totalmente virtual e interagir com elementos simulados, como se existissem no mundo real");

                                } else if (virtual.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Não fez nem sentido essa alternativa quem dirá voce marca como a certa, faça me o favor");

                                } else if (virtual.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Exatamente, assim como chiclete é o complemento do macarrão");

                                }
                                break;
                            }

                        case 7:
                            System.out.println("\u001B[31m\n---------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m |\u001B[0m");
                            System.out.println("\u001B[31m---------------------|\u001B[0m");
                            System.out.println("O que é aprendizado de máquina (machine learning)? (DIFICIL)");
                            System.out.println(
                                    "A) Um conjunto de técnicas que permite que os computadores aprendam com dados sem serem explicitamente programados");
                            System.out.println(
                                    "B) Um software que permite aos computadores aprender com um conjunto de regras definidas");
                            System.out.println("C) Um tipo de programação de baixo nível");
                            System.out.println("D) Um conjunto de algoritmos que processam dados em tempo real");

                            if (cont >= pulaDificil + pulaDificil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String mLearning = scanner.next();

                                scanner.nextLine();

                                if (mLearning.equalsIgnoreCase("P")) {
                                    cont -= 15;
                                    break;

                                } else if (mLearning.equalsIgnoreCase("A")) {
                                    cont += 30;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Certeiro como um pistoleiro! Meus parabéns receba as suas pontuações que lhe devo");

                                } else if (mLearning.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "É um conceito próximo de linguagem de máquina, mas por não se tratar de um software está errado, paciência meu caro(a)");

                                } else if (mLearning.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Não se trata de linguagem de programação, poderia desistir do Quiz. Brincadeira kkkkkkk");

                                } else if (mLearning.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Vejamos que pela resposta selecionada tu não faz ideia, tente outro momento");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String mLearning = scanner.next();

                                if (mLearning.equalsIgnoreCase("A")) {
                                    cont += 30;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Certeiro como um pistoleiro! Meus parabéns receba as suas pontuações que lhe devo");

                                } else if (mLearning.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "É um conceito próximo de linguagem de máquina, mas por não se tratar de um software está errado, paciência meu caro(a)");

                                } else if (mLearning.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Não se trata de linguagem de programação, poderia desistir do Quiz. Brincadeira kkkkkkk");

                                } else if (mLearning.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Vejamos que pela resposta selecionada tu não faz ideia, tente outro momento");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }

                        case 8:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println("Qual jogo foi desenvolvido em JAVA? (DIFICIL)");
                            System.out.println("A) Minecraft");
                            System.out.println("B) The last of us");
                            System.out.println("C) Eden ring");
                            System.out.println("D) GTA");

                            if (cont > pulaDificil + pulaDificil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String minecraft = scanner.next();

                                scanner.nextLine();

                                if (minecraft.equalsIgnoreCase("P")) {
                                    cont -= 15;
                                    break;

                                } else if (minecraft.equalsIgnoreCase("A")) {
                                    cont += 20;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Receba um bolo quadrado, como forma de agradecimento pelo seu acerto");

                                } else if (minecraft.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("O ultimo de nós que respondeu dessa forma não foi muito longe");

                                } else if (minecraft.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Nada a declarar, você errou");

                                } else if (minecraft.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Mission Failed");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;

                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String minecraft = scanner.next();

                                if (minecraft.equalsIgnoreCase("A")) {
                                    cont += 30;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println(
                                            "Receba um bolo quadrado, como forma de agradecimento pelo seu acerto");

                                } else if (minecraft.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("O ultimo de nós que respondeu dessa forma não foi muito longe");

                                } else if (minecraft.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Nada a declarar, você errou");

                                } else if (minecraft.equalsIgnoreCase("D")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Mission Failed");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }

                        case 9:
                            System.out.println("\u001B[31m\n-----------------------|\u001B[0m");
                            System.out
                                    .println("\u001B[33mPAINEL DE PONTOS: \u001B[0m" + cont + "\u001B[31m  |\u001B[0m");
                            System.out.println("\u001B[31m-----------------------|\u001B[0m");
                            System.out.println(
                                    "Qual é o circuito eletrônico capaz de amplificar ou barrar correntes eletricas, onde estão presentes nos circuitos integrados que compõem portas lógicas? (DIFICIL)");
                            System.out.println("A) Fonte");
                            System.out.println("B) Cabo VGA");
                            System.out.println("C) Baterias");
                            System.out.println("D) Transistores");

                            if (cont >= pulaDificil + pulaDificil) {
                                System.out.println("\u001B[35m\nVocê obteve o poder de pular pergunta!\u001B[1m");
                                System.out.println("Digite (P) caso queira, se não somente digite a letra da resposta");
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String transistores = scanner.next();

                                scanner.nextLine();

                                if (transistores.equalsIgnoreCase("S")) {
                                    cont -= 15;
                                    break;

                                } else if (transistores.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Não amigo, a fonte desempenha um papel importante na conversão de energia, não diretamete aos circuitos");

                                } else if (transistores.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Ela só serve para conectar nos monitores dos computadores");

                                } else if (transistores.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Baterias não se enquadra diretamete ao que a pergunta pede, interpretou de outra forma chará");

                                } else if (transistores.equalsIgnoreCase("D")) {
                                    cont += 30;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println("Mission Completed! Em cheio, parabéns");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            } else {
                                System.out.print("\u001B[37m\nDigite a letra da Opção a seguir: \u001B[0m");
                                String transistores = scanner.next();

                                if (transistores.equalsIgnoreCase("A")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Não amigo, a fonte desempenha um papel importante na conversão de energia, não diretamete aos circuitos");

                                } else if (transistores.equalsIgnoreCase("B")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println("Ela só serve para conectar nos monitores dos computadores");

                                } else if (transistores.equalsIgnoreCase("C")) {
                                    System.out.println("\u001B[31mRespota incorreta\u001B[0m");
                                    System.out.println(
                                            "Baterias não se enquadra diretamete ao que a pergunta pede, interpretou de outra forma chará");

                                } else if (transistores.equalsIgnoreCase("D")) {
                                    cont += 30;
                                    System.out.println("\u001B[32mResposta correta!\u001B[0m");
                                    System.out.println("Mission Completed! Em cheio, parabéns");

                                } else {
                                    System.out.println("\u001B[31m\nRespota indevida\u001B[0m");
                                }
                                break;
                            }
                    }
                }
            }
        }

        System.out.println("\n\u001B[34m     VOCÊ CHEGOU AO FINAL DO QUIZ PLAYER: " + nome + "\u001B[0m");

        if (cont >= 100) {
            System.out.println("    O SEU DESEMPENHO FOI \u001B[32mOTIMO!\u001B[0m ");
            System.out.println("             SALDO DE PONTOS: " + cont);

        } else if (cont > 40 && cont < 100) {
            System.out.println("    O SEU DESEMPENHO MEDIANO, MAS PODE \u001B[33mMELHORAR!\u001B[0m");
            System.out.println("             SALDO DE PONTOS: " + cont);

        } else {
            System.out.println("    O SEU DESEMPENHO \u001B[31mPÉSSIMO, JOGUE NOVAMENTE!\u001B[0m ");
            System.out.println("             SALDO DE PONTOS: " + cont);

        }
    }
}
