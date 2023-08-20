package br.com.pelifefe.jogo.quiz.principal;

import br.com.pelifefe.jogo.quiz.ferramentas.Mensagens;
import br.com.pelifefe.jogo.quiz.ferramentas.Valores;
import br.com.pelifefe.jogo.quiz.questoes.Futebol;
import br.com.pelifefe.jogo.quiz.questoes.Tecnologia;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Valores valores = new Valores();
        Mensagens mensagens = new Mensagens();
        Tecnologia tecnologia = new Tecnologia();
        Futebol futebol = new Futebol();

        //Gerador de números aleatórios
        int numero;
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> numerosList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numerosList.add(i);
        }
        Collections.shuffle(numerosList);

        for (int i = 0; i < numerosList.size(); i++) {
            numeros[i] = numerosList.get(i);
        }
        //Declaração da base de pontuações para danamismo do jogo:
        valores.setFacil(20);
        valores.setMetadeFacil(valores.getFacil() / 2);
        valores.setMedio(40);
        valores.setMetadeMedio(valores.getMedio() / 2);
        valores.setDificil(60);
        valores.setMetadeDificil(valores.getDificil() / 2);

        //Primeiras campos de interação com o usuário:
        mensagens.exibeApresentacao();
        mensagens.exibeOpcao();

        //Verificação, se caso o usuário tentou outro tipo de número das opções fornecidas:
        while (mensagens.getOpcao() != 1 && mensagens.getOpcao() != 2) {
            mensagens.exibeOpcaoInvalida();
        }

        //Se inicia o Quiz apartir daqui:
        if (mensagens.getOpcao() == 1) {  //Quiz de inicio em tecnologia//
            for (int i = 0; i < 7; i++) {

                numero = numeros[i];

                switch (numero) {
                    case 1 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.twiiter();
                        String twitter;
                        if (valores.getMeusPontos() >= valores.getFacil()) {
                            mensagens.exibePulaPergunta();
                            twitter = scanner.next();
                            if (twitter.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                            } else if (twitter.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (twitter.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (twitter.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (twitter.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            twitter = scanner.next();

                            if (twitter.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (twitter.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (twitter.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (twitter.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 2 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.windows();
                        String windows;
                        if (valores.getMeusPontos() >= valores.getFacil()) {
                            mensagens.exibePulaPergunta();
                            windows = scanner.next();
                            if (windows.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                            } else if (windows.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (windows.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (windows.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (windows.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            windows = scanner.next();

                            if (windows.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (windows.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (windows.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (windows.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 3 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.chatGPT();
                        String chatGPT;
                        if (valores.getMeusPontos() >= valores.getFacil()) {
                            mensagens.exibePulaPergunta();
                            chatGPT = scanner.next();
                            if (chatGPT.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                            } else if (chatGPT.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (chatGPT.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (chatGPT.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (chatGPT.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            chatGPT = scanner.next();

                            if (chatGPT.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (chatGPT.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (chatGPT.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (chatGPT.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 4 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.site();
                        String site;
                        if (valores.getMeusPontos() >= valores.getMedio()) {
                            mensagens.exibePulaPergunta();
                            site = scanner.next();

                            if (site.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                            } else if (site.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (site.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (site.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (site.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            site = scanner.next();

                            if (site.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (site.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (site.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (site.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 5 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.processador();
                        String processador;
                        if (valores.getMeusPontos() >= valores.getMedio()) {
                            mensagens.exibePulaPergunta();
                            processador = scanner.next();

                            if (processador.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                            } else if (processador.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (processador.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (processador.equalsIgnoreCase("C")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (processador.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            processador = scanner.next();
                            if (processador.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (processador.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (processador.equalsIgnoreCase("C")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (processador.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 6 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.virtual();
                        String virtual;
                        if (valores.getMeusPontos() >= valores.getMedio()) {
                            mensagens.exibePulaPergunta();
                            virtual = scanner.next();

                            if (virtual.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                            } else if (virtual.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (virtual.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (virtual.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (virtual.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            virtual = scanner.next();

                            if (virtual.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (virtual.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (virtual.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (virtual.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 7 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.mLearning();
                        String mLearning;
                        if (valores.getMeusPontos() >= valores.getDificil()) {
                            mensagens.exibePulaPergunta();
                            mLearning = scanner.next();

                            if (mLearning.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                            } else if (mLearning.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (mLearning.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (mLearning.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (mLearning.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            mLearning = scanner.next();

                            if (mLearning.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (mLearning.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (mLearning.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (mLearning.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 8 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.minecraft();
                        String minecraft;
                        if (valores.getMeusPontos() >= valores.getDificil()) {
                            mensagens.exibePulaPergunta();
                            minecraft = scanner.next();

                            if (minecraft.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                            } else if (minecraft.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (minecraft.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (minecraft.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (minecraft.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            minecraft = scanner.next();

                            if (minecraft.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (minecraft.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (minecraft.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (minecraft.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 9 -> {
                        mensagens.exibePainelDePontos();
                        tecnologia.transistores();
                        String transistores;
                        if (valores.getMeusPontos() >= valores.getDificil()) {
                            mensagens.exibePulaPergunta();
                            transistores = scanner.next();

                            if (transistores.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                            } else if (transistores.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (transistores.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (transistores.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (transistores.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            transistores = scanner.next();

                            if (transistores.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (transistores.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (transistores.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (transistores.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                }
            }
            mensagens.proximoQuiz();
            String next = scanner.next();

            if (next.equalsIgnoreCase("S") || next.equalsIgnoreCase("Sim")) {
                futebol.bemVindo();
                valores.setFacil(valores.getFacil() * 2);
                valores.setMetadeFacil(valores.getFacil() / 2);
                valores.setMedio(valores.getMedio() * 2);
                valores.setMetadeMedio(valores.getMedio() / 2);
                valores.setDificil(valores.getDificil() * 2);
                valores.setMetadeDificil(valores.getMetadeDificil() / 2);
                for (int j = 0; j < 7; j++) {

                    numero = numeros[j];

                    switch (numero) {
                        case 1 -> {
                            mensagens.exibePainelDePontos();
                            futebol.copaI();
                            String copaI;
                            if (valores.getMeusPontos() >= valores.getFacil()) {
                                mensagens.exibePulaPergunta();
                                copaI = scanner.next();

                                if (copaI.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                                } else if (copaI.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (copaI.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (copaI.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (copaI.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                copaI = scanner.next();

                                if (copaI.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (copaI.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (copaI.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (copaI.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 2 -> {
                            mensagens.exibePainelDePontos();
                            futebol.psg();
                            String psg;
                            if (valores.getMeusPontos() >= valores.getFacil()) {
                                mensagens.exibePulaPergunta();
                                psg = scanner.next();

                                if (psg.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                                } else if (psg.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (psg.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (psg.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (psg.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                psg = scanner.next();

                                if (psg.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (psg.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (psg.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (psg.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 3 -> {
                            mensagens.exibePainelDePontos();
                            futebol.zagueiro();
                            String zagueiro;
                            if (valores.getMeusPontos() >= valores.getFacil()) {
                                mensagens.exibePulaPergunta();
                                zagueiro = scanner.next();

                                if (zagueiro.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                                } else if (zagueiro.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (zagueiro.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (zagueiro.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (zagueiro.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                zagueiro = scanner.next();

                                if (zagueiro.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (zagueiro.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (zagueiro.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (zagueiro.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 4 -> {
                            mensagens.exibePainelDePontos();
                            futebol.kaka();
                            String kaka;
                            if (valores.getMeusPontos() >= valores.getMedio()) {
                                mensagens.exibePulaPergunta();
                                kaka = scanner.next();

                                if (kaka.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                                } else if (kaka.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (kaka.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (kaka.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (kaka.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                kaka = scanner.next();

                                if (kaka.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (kaka.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (kaka.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (kaka.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 5 -> {
                            mensagens.exibePainelDePontos();
                            futebol.daniel();
                            String daniel;
                            if (valores.getMeusPontos() >= valores.getMedio()) {
                                mensagens.exibePulaPergunta();
                                daniel = scanner.next();

                                if (daniel.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                                } else if (daniel.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (daniel.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (daniel.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (daniel.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                daniel = scanner.next();

                                if (daniel.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (daniel.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (daniel.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (daniel.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 6 -> {
                            mensagens.exibePainelDePontos();
                            futebol.pele();
                            String pele;
                            if (valores.getMeusPontos() >= valores.getMedio()) {
                                mensagens.exibePulaPergunta();
                                pele = scanner.next();

                                if (pele.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                                } else if (pele.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (pele.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (pele.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (pele.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                pele = scanner.next();

                                if (pele.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (pele.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (pele.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (pele.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 7 -> {
                            mensagens.exibePainelDePontos();
                            futebol.uruguai();
                            String uruguai;
                            if (valores.getMeusPontos() >= valores.getDificil()) {
                                mensagens.exibePulaPergunta();
                                uruguai = scanner.next();

                                if (uruguai.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                                } else if (uruguai.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (uruguai.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (uruguai.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (uruguai.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                uruguai = scanner.next();

                                if (uruguai.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (uruguai.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (uruguai.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (uruguai.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 8 -> {
                            mensagens.exibePainelDePontos();
                            futebol.santos();
                            String santos;
                            if (valores.getMeusPontos() >= valores.getDificil()) {
                                mensagens.exibePulaPergunta();
                                santos = scanner.next();

                                if (santos.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                                } else if (santos.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (santos.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                    ;
                                } else if (santos.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (santos.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                santos = scanner.next();

                                if (santos.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (santos.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (santos.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (santos.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 9 -> {
                            mensagens.exibePainelDePontos();
                            futebol.palmeiras();
                            String palmeiras;
                            if (valores.getMeusPontos() >= valores.getDificil()) {
                                mensagens.exibePulaPergunta();
                                palmeiras = scanner.next();

                                if (palmeiras.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                                } else if (palmeiras.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (palmeiras.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                    ;
                                } else if (palmeiras.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (palmeiras.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                palmeiras = scanner.next();

                                if (palmeiras.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (palmeiras.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (palmeiras.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (palmeiras.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (mensagens.getOpcao() == 2) {  //Quiz de inicio em futebol//
            for (int i = 0; i < 7; i++) {

                numero = numeros[i];

                switch (numero) {

                    case 1 -> {
                        mensagens.exibePainelDePontos();
                        futebol.copaI();
                        String copaI;
                        if (valores.getMeusPontos() >= valores.getFacil()) {
                            mensagens.exibePulaPergunta();
                            copaI = scanner.next();

                            if (copaI.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                            } else if (copaI.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (copaI.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (copaI.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (copaI.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            copaI = scanner.next();

                            if (copaI.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (copaI.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (copaI.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (copaI.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 2 -> {
                        mensagens.exibePainelDePontos();
                        futebol.psg();
                        String psg;
                        if (valores.getMeusPontos() >= valores.getFacil()) {
                            mensagens.exibePulaPergunta();
                            psg = scanner.next();

                            if (psg.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                            } else if (psg.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (psg.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (psg.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (psg.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            psg = scanner.next();

                            if (psg.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (psg.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (psg.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (psg.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 3 -> {
                        mensagens.exibePainelDePontos();
                        futebol.zagueiro();
                        String zagueiro;
                        if (valores.getMeusPontos() >= valores.getFacil()) {
                            mensagens.exibePulaPergunta();
                            zagueiro = scanner.next();

                            if (zagueiro.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                            } else if (zagueiro.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (zagueiro.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (zagueiro.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (zagueiro.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            zagueiro = scanner.next();

                            if (zagueiro.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (zagueiro.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (zagueiro.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (zagueiro.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 4 -> {
                        mensagens.exibePainelDePontos();
                        futebol.kaka();
                        String kaka;
                        if (valores.getMeusPontos() >= valores.getMedio()) {
                            mensagens.exibePulaPergunta();
                            kaka = scanner.next();

                            if (kaka.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                            } else if (kaka.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeFacil());
                            } else if (kaka.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (kaka.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (kaka.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            kaka = scanner.next();

                            if (kaka.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (kaka.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (kaka.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (kaka.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 5 -> {
                        mensagens.exibePainelDePontos();
                        futebol.daniel();
                        String daniel;
                        if (valores.getMeusPontos() >= valores.getMedio()) {
                            mensagens.exibePulaPergunta();
                            daniel = scanner.next();

                            if (daniel.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                            } else if (daniel.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (daniel.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (daniel.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (daniel.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            daniel = scanner.next();

                            if (daniel.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (daniel.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (daniel.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (daniel.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 6 -> {
                        mensagens.exibePainelDePontos();
                        futebol.pele();
                        String pele;
                        if (valores.getMeusPontos() >= valores.getMedio()) {
                            mensagens.exibePulaPergunta();
                            pele = scanner.next();

                            if (pele.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                            } else if (pele.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (pele.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (pele.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (pele.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            pele = scanner.next();

                            if (pele.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeMedio());
                            } else if (pele.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (pele.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (pele.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 7 -> {
                        mensagens.exibePainelDePontos();
                        futebol.uruguai();
                        String uruguai;
                        if (valores.getMeusPontos() >= valores.getDificil()) {
                            mensagens.exibePulaPergunta();
                            uruguai = scanner.next();

                            if (uruguai.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                            } else if (uruguai.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (uruguai.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (uruguai.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (uruguai.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            uruguai = scanner.next();

                            if (uruguai.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (uruguai.equalsIgnoreCase("B")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (uruguai.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (uruguai.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 8 -> {
                        mensagens.exibePainelDePontos();
                        futebol.santos();
                        String santos;
                        if (valores.getMeusPontos() >= valores.getDificil()) {
                            mensagens.exibePulaPergunta();
                            santos = scanner.next();

                            if (santos.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                            } else if (santos.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (santos.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (santos.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (santos.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            santos = scanner.next();

                            if (santos.equalsIgnoreCase("A")) {
                                mensagens.errou();
                            } else if (santos.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (santos.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (santos.equalsIgnoreCase("D")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                    case 9 -> {
                        mensagens.exibePainelDePontos();
                        futebol.palmeiras();
                        String palmeiras;
                        if (valores.getMeusPontos() >= valores.getDificil()) {
                            mensagens.exibePulaPergunta();
                            palmeiras = scanner.next();

                            if (palmeiras.equalsIgnoreCase("P")) {
                                valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                            } else if (palmeiras.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (palmeiras.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (palmeiras.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (palmeiras.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        } else {
                            mensagens.exibeOpcaoSeguir();
                            palmeiras = scanner.next();

                            if (palmeiras.equalsIgnoreCase("A")) {
                                mensagens.acertou();
                                valores.adcionaMeusPontos(valores.getMetadeDificil());
                            } else if (palmeiras.equalsIgnoreCase("B")) {
                                mensagens.errou();
                            } else if (palmeiras.equalsIgnoreCase("C")) {
                                mensagens.errou();
                            } else if (palmeiras.equalsIgnoreCase("D")) {
                                mensagens.errou();
                            } else {
                                mensagens.indevida();
                            }
                        }
                    }
                }
            }
            mensagens.proximoQuiz();
            String next = scanner.next();

            if (next.equalsIgnoreCase("S") || next.equalsIgnoreCase("Sim")) {
                tecnologia.bemVindo();
                valores.setFacil(valores.getFacil() * 2);
                valores.setMetadeFacil(valores.getFacil() / 2);
                valores.setMedio(valores.getMedio() * 2);
                valores.setMetadeMedio(valores.getMedio() / 2);
                valores.setDificil(valores.getDificil() * 2);
                valores.setMetadeDificil(valores.getMetadeDificil() / 2);

                for (int j = 0; j < 7; j++) {

                    numero = numeros[j];

                    switch (numero) {
                        case 1 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.twiiter();
                            String twitter;
                            if (valores.getMeusPontos() >= valores.getFacil()) {
                                mensagens.exibePulaPergunta();
                                twitter = scanner.next();
                                if (twitter.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                                } else if (twitter.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (twitter.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (twitter.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (twitter.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                twitter = scanner.next();

                                if (twitter.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (twitter.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (twitter.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (twitter.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 2 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.windows();
                            String windows;
                            if (valores.getMeusPontos() >= valores.getFacil()) {
                                mensagens.exibePulaPergunta();
                                windows = scanner.next();
                                if (windows.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                                } else if (windows.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (windows.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (windows.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (windows.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                windows = scanner.next();

                                if (windows.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (windows.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (windows.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (windows.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 3 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.chatGPT();
                            String chatGPT;
                            if (valores.getMeusPontos() >= valores.getFacil()) {
                                mensagens.exibePulaPergunta();
                                chatGPT = scanner.next();
                                if (chatGPT.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeFacil() / 2);
                                } else if (chatGPT.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (chatGPT.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (chatGPT.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (chatGPT.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                chatGPT = scanner.next();

                                if (chatGPT.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (chatGPT.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeFacil());
                                } else if (chatGPT.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (chatGPT.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 4 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.site();
                            String site;
                            if (valores.getMeusPontos() >= valores.getMedio()) {
                                mensagens.exibePulaPergunta();
                                site = scanner.next();

                                if (site.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                                } else if (site.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (site.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (site.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (site.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                site = scanner.next();

                                if (site.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (site.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (site.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (site.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 5 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.processador();
                            String processador;
                            if (valores.getMeusPontos() >= valores.getMedio()) {
                                mensagens.exibePulaPergunta();
                                processador = scanner.next();

                                if (processador.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                                } else if (processador.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (processador.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (processador.equalsIgnoreCase("C")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (processador.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                processador = scanner.next();
                                if (processador.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (processador.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (processador.equalsIgnoreCase("C")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (processador.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 6 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.virtual();
                            String virtual;
                            if (valores.getMeusPontos() >= valores.getMedio()) {
                                mensagens.exibePulaPergunta();
                                virtual = scanner.next();

                                if (virtual.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeMedio() / 2);
                                } else if (virtual.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (virtual.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (virtual.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (virtual.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                virtual = scanner.next();

                                if (virtual.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (virtual.equalsIgnoreCase("B")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeMedio());
                                } else if (virtual.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (virtual.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 7 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.mLearning();
                            String mLearning;
                            if (valores.getMeusPontos() >= valores.getDificil()) {
                                mensagens.exibePulaPergunta();
                                mLearning = scanner.next();

                                if (mLearning.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                                } else if (mLearning.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (mLearning.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (mLearning.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (mLearning.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                mLearning = scanner.next();

                                if (mLearning.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (mLearning.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (mLearning.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (mLearning.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 8 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.minecraft();
                            String minecraft;
                            if (valores.getMeusPontos() >= valores.getDificil()) {
                                mensagens.exibePulaPergunta();
                                minecraft = scanner.next();

                                if (minecraft.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                                } else if (minecraft.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (minecraft.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (minecraft.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (minecraft.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                minecraft = scanner.next();

                                if (minecraft.equalsIgnoreCase("A")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else if (minecraft.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (minecraft.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (minecraft.equalsIgnoreCase("D")) {
                                    mensagens.errou();
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                        case 9 -> {
                            mensagens.exibePainelDePontos();
                            tecnologia.transistores();
                            String transistores;
                            if (valores.getMeusPontos() >= valores.getDificil()) {
                                mensagens.exibePulaPergunta();
                                transistores = scanner.next();

                                if (transistores.equalsIgnoreCase("P")) {
                                    valores.retiraMeusPontos(valores.getMetadeDificil() / 2);
                                } else if (transistores.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (transistores.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (transistores.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (transistores.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else {
                                    mensagens.indevida();
                                }
                            } else {
                                mensagens.exibeOpcaoSeguir();
                                transistores = scanner.next();

                                if (transistores.equalsIgnoreCase("A")) {
                                    mensagens.errou();
                                } else if (transistores.equalsIgnoreCase("B")) {
                                    mensagens.errou();
                                } else if (transistores.equalsIgnoreCase("C")) {
                                    mensagens.errou();
                                } else if (transistores.equalsIgnoreCase("D")) {
                                    mensagens.acertou();
                                    valores.adcionaMeusPontos(valores.getMetadeDificil());
                                } else {
                                    mensagens.indevida();
                                }
                            }
                        }
                    }
                }
            }
        }
        mensagens.finalQuiz();
    }
}
