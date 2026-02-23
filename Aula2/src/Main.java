//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Caneta c1 = new Caneta();
        Caneta c1 = new Caneta("Vermelha",2.0,true);

        c1.setCor("Azul");
        //c1.cor = "Azul";
        c1.setPonta(1.5);
        //c1.setTampada(true);

        c1.escrever();
        c1.status();
    }
}