public class Caneta {
    private String cor;

    public double getPonta() {
        return ponta;
    }

    public Caneta(String cor, double ponta, boolean tampada){
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;

    }
    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    private double ponta;
    private boolean tampada;

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void escrever(){
        System.out.println("Escrever");
    }

    public void status(){
        System.out.println(this.tampada);
        System.out.println(this.cor);
        System.out.println(this.ponta);
    }
}
