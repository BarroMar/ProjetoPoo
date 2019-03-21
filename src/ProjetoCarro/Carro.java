package ProjetoCarro;

public class Carro {
    String modelo;
    String cor;
    String marca;
    String chassi;
    double velocidadeMaxima;
    double velocidadeAtual;
    double volumeDeCombustivel;
    int numerodePortas;
    int numerodeMarchas;
    int marchaAtual;
    int ano;
    boolean temTetoSolar;
    boolean temCambioAutomatico;
    Proprietario Proprietario;

    //metodo--

    void acelera(){
        velocidadeAtual = velocidadeAtual + 1;
    }
    void  freia(){
        velocidadeAtual = 0;
    }
    void trocaMarcha(int marchaDesejada){
        marchaAtual = marchaDesejada;
    }
    void reduzMarcha(){
        marchaAtual = marchaAtual - 1;

    }
}
