public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal();
        cachorro.nome = "Bunny";
        cachorro.idade = 8;
        cachorro.som = "Au au";

        Animal passaro = new Animal();
        passaro.nome = "Cirus";
        passaro.idade = 3;
        passaro.som = "Piu piu";

        Animal gato = new Animal();
        gato.nome = "Gatito";
        gato.idade = 5;
        gato.som = "Miau";


        System.out.print("O cachorro " + cachorro.nome + " faz ");
        cachorro.emitirSom(cachorro.som);

        System.out.print("O gato " + gato.nome + " faz ");
        gato.emitirSom(gato.som);

        System.out.print("O pássaro " + passaro.nome + " faz ");
        passaro.emitirSom(passaro.som);


    }
}