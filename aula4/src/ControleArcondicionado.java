public class ControleArcondicionado implements Controlador{
    public void ligar(){
        System.out.println("Ligando ar condicionado");
    }
    public void desligar(){
        System.out.println("Desligando ar condicionado");
    }

    @Override
    public void diminuirvolume() {
        System.out.println("Diminuir temperatura ar");
    }
}
