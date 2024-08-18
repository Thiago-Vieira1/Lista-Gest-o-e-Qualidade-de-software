public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNumPatas(4);       
        cachorro.come(); 
        cachorro.late();
        
        Gato gato = new Gato();
        gato.setNumPatas(4);
        gato.come();
        gato.mia();
        
        Ovelha ovelha = new Ovelha();
        ovelha.setNumPatas(4);
        ovelha.come();
        ovelha.baah();
    }
}
