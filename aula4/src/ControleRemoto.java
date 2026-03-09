public class ControleRemoto implements Controlador{

    @Override
    public void ligar() {
        System.out.println("Ligando controle remoto");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando controle remoto");
    }

    @Override
    public void diminuirvolume() {
        System.out.println("Diminuindo controle remoto");
    }
}
