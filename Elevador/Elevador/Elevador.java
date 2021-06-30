package Elevador;

class Elevador
{
    int Andar_atual;
    int Pessoas_presentes;
    int Limite;

    public Elevador(int Andar_atual, int Pessoas_presentes, int Limite)
    {
        this.Andar_atual = Andar_atual;
        this.Pessoas_presentes = Pessoas_presentes;
        this.Limite = Limite;
    }

    void chamar() {
        System.out.println("O elevador irá chegar em seu andar.");
    }
}