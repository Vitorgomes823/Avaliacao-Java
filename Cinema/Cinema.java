import java.util.Scanner;

public class Cinema{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        //Assentos das Salas:
        int assAlpha = 23;
        int assAlphad = 12;
        int assBeta = 24;
        int assBetad = 6;
        int def = 0;


        //Introdução:
        System.out.println("Seja muito bem vindo ao Cinema do Jailson");
        
        //Nome do usuario:
        System.out.println("Qual é seu nome ?");
        String nome = sc.nextLine();
        
        //Sala:
        System.out.println("Olá "+nome+", temos duas salas disponíveis:\nA sala Alpha esta passando 'As Branquelas'.\nA sala beta está passando 'A chegada'.");
        System.out.println("Em qual sala você deseja se alocar ?\n1.)Alpha\n2.)Beta");
        int opcao = sc.nextInt();
        while((opcao != 1) && (opcao != 2)){
            System.out.println("Informaçao invalida, por favor insira o dado correto\n1.)Alpha\n2.)Beta");
            opcao = sc.nextInt();
        }
        
        //Escolha da fileira:
        if (opcao == 1) {
                System.out.println("Quantos assentos ?");
                int assentos = sc.nextInt();
                while (assentos > 23){
                    System.out.println("Informação incorreta, por favor insira os assentos da fileira.\nQuantos assentos ?");
                    assentos = sc.nextInt();
                }
                if (assentos < 23) {
                    System.out.println("alguém é portador de alguma deficiencia ? [1 = sim / 2 = não]");
                    int r = sc.nextInt();
                    switch (r) {
                        case 1:
                        if (assentos < 12){
                        System.out.println("Quantos ?");
                        def = sc.nextInt();
                        int restante = def - assAlphad;
                        System.out.println("O(s) portador(es/as) será direcionado para a fileira com assentos para pessoas com deficiencia sobrando "+restante+" assentos restantes.");
                        }
                       
                        if(assentos > def){
                            r = 2;
                        }

                       case 2:
                        System.out.println("selecione uma das fileiras para você(s):\n1.)A\n2.)B\n3.)C\n4.)D\n5.)E\n6.)F");
                        int fileiras = sc.nextInt();
                        while(fileiras > 6){
                            System.out.println("Informação incorreta, por favor insira o dado correto\nselecione uma das fileiras:\n1.)A\n2.)B\n3.)C\n4.)D\n5.)E\n6.)F");
                            fileiras = sc.nextInt();
                        }
                        switch (fileiras) {
                            case 1:
                            int restante = assentos - assAlpha - def;
                            int total =  assentos - 140;
                            System.out.println("Ainda há "+total+" Assentos no total, sendo "+restante+" assentos restantes na fileira A e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 2:
                            int total2 = assentos - 140;
                            int restante2 = assentos - assAlpha - def;
                            System.out.println("Ainda há "+total2+" Assentos no total, sendo "+restante2+" assentos restantes na fileira B e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 3:
                            int restante3 = assentos - assAlpha - def;
                            int total3 = assentos - 140;
                            System.out.println("Ainda há "+total3+" Assentos no total, sendo "+restante3+" assentos restantes na fileira C e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 4:
                            int restante4 = assentos - assAlpha - def;
                            int total4 = assentos - assAlpha;
                            System.out.println("Ainda há "+total4+" Assentos no total, sendo "+restante4+" assentos restantes na fileira D e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 5:
                            int restante5 = assentos - assAlpha - def;
                            int total5 = assentos - 140;
                            System.out.println("Ainda há "+total5+" Assentos no total, sendo "+restante5+" assentos restantes na fileira E e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 6:
                            int restante6= assentos - assAlpha - def;
                            int total6 = assentos - 140;
                            System.out.println("Ainda há "+total6+" Assentos no total, sendo "+restante6+" assentos restantes na fileira F e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                        }   
                    }
                }
        }
        if (opcao == 2 ){
            System.out.println("Quantos assentos ?");
                int assentos = sc.nextInt();
                while(assentos > 24 ){
                    System.out.println("Informaçao Incorreta, porfavor insira o assento da fileira.\nQuantos assentos?");
                    assentos = sc.nextInt();
                }
                if (assentos < 120) {
                    System.out.println("é portador de alguma deficiencia ? [1 = sim / 2 = não]");
                    int r = sc.nextInt();
                    switch (r) {
                        case 1:
                        if (assentos < 6){
                        System.out.println("Quantos ?");
                        def = sc.nextInt();
                        int restante = def - assBetad;
                        System.out.println("O(s) portador(es/as) será direcionado para a fileira com assentos para pessoas com deficiencia sobrando "+restante+" assentos restantes.");
                        }
                        else {
                            System.out.println("há pessoas demais para essa fileira :(");
                        }
    
                        if (assentos > def){
                            r = 2;
                        }
                        case 2:
                        System.out.println("selecione uma das fileiras para você(s):\n1.)A\n2.)B\n3.)C\n4.)D\n5.)E\n6.)F");
                        int fileiras = sc.nextInt();
                        while(fileiras > 6){
                            System.out.println("Informação incorreta, por favor insira o dado correto\nselecione uma das fileiras:\n1.)A\n2.)B\n3.)C\n4.)D\n5.)E\n6.)F");
                            fileiras = sc.nextInt();
                        }
                        switch (fileiras) {
                            case 1:
                            int restante = assentos - assBeta - def;
                            int total =  assentos - 140 - def;
                            System.out.println("Ainda há "+total+" Assentos no total, sendo "+restante+" assentos restantes na fileira A e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 2:
                            int total2 = assentos - 140 - def;
                            int restante2 = assentos - assBeta;
                            System.out.println("Ainda há "+total2+" Assentos no total, sendo "+restante2+" assentos restantes na fileira B e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 3:
                            int restante3 = assentos - assBeta;
                            int total3 = assentos - 140 - def;
                            System.out.println("Ainda há "+total3+" Assentos no total, sendo "+restante3+" assentos restantes na fileira C e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 4:
                            int restante4 = assentos - assBeta - def;
                            int total4 = assentos - 140 - def;
                            System.out.println("Ainda há "+total4+" Assentos no total, sendo "+restante4+" assentos restantes na fileira D e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 5:
                            int restante5 = assentos - assBeta - def;
                            int total5 = assentos - 140 - def;
                            System.out.println("Ainda há "+total5+" Assentos no total, sendo "+restante5+" assentos restantes na fileira E e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                            case 6:
                            int restante6= assentos - assBeta - def;
                            int total6 = assentos - 140 - def;
                            System.out.println("Ainda há "+total6+" Assentos no total, sendo "+restante6+" assentos restantes na fileira F e 23 nas outras fileiras");
                            System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                            break;
                        }

                        }
                    }
                }
                sc.close();
        }
    }

