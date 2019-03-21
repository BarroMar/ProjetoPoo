package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Mateus";
        proprietario.Bairro = "Castanheira";
        proprietario.Cep = "66645325";
        proprietario.Cidade = "Belém";
        proprietario.cpf = "1231422445325";
        proprietario.datadeNascimento = "27/07/1998";
        proprietario.Estado = "Pará";
        proprietario.rg = " 32345423 ";
        proprietario.Complemento = " casa ";


        Carro carro = new Carro();
        carro.numerodePortas = 5;
        carro.Proprietario = proprietario;
        carro.marchaAtual = 10;
        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        carro.freia();
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.marchaAtual);
        carro.trocaMarcha(3);
        System.out.println(carro.marchaAtual);

    }
}
