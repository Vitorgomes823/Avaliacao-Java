package Elevador;
import java.util.*;

public class Programa {
    public static void main(String[] args)
    {
        //informações: 
        Elevador elevador = new Elevador(1 , 0 , 15);
        int andar = 0;
        int andar_atual = 0;
        int entrar = 0;
        int presentes = 0;
        int continuação = 1;

        //input:
        Scanner sc = new Scanner(System.in);

        //Inicio:
        while ( continuação == 1 )
        {
            System.out.println("Olá, para qual andar deseja ir ?");
            andar = sc.nextInt();

            while((andar > 15) || (andar < 1))
            {
                System.out.print("Esse andar não existe, por favor insira um andar válido\n");
                andar = sc.nextInt();
            }

            System.out.println("Quantas pessoas estão subindo?");
            entrar =  sc.nextInt();
            presentes = presentes + entrar;
            
            while (presentes > elevador.Limite)
            {
                System.out.println("O número de pessoas que querem entrar no elevador é maior que  o número permitido.\nQuantos irá sair?");
                int Sair = sc.nextInt();
                presentes = presentes - Sair;
            }

            System.out.println("Em que andar vc está?");
            andar_atual = sc.nextInt();

            if (andar_atual != elevador.Andar_atual)
            {
                elevador.chamar();
            }

            System.out.println("O elevador estava localizado no andar " + elevador.Andar_atual + ", te buscou no andar " + andar_atual + " e te levou para o andar " + andar);
            elevador.Andar_atual = andar;

            System.out.println("Deseja continuar?\n1.)Sim\n2.)Não");
            continuação = sc.nextInt();


        }

        if (continuação == 2 )
        {
            System.out.println("Desligando elevador...");
        }

        sc.close();
    }
}
