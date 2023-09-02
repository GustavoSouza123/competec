public class Frutas {
    private int numFrutas;

    public Frutas(int n) {
        this.numFrutas = n;
    }

    public int getNumFrutas() {
        return numFrutas;
    }

    public void setNumFrutas(int n) {
        this.numFrutas = n;
    }

    public double converterFrutas(String moeda) {
        moeda = moeda.toLowerCase();
        if(moeda.equals("real")) {
            return this.numFrutas * 0.47;
        } else if(moeda.equals("dolar")) {
            return this.numFrutas * 0.091;
        } else if(moeda.equals("euro")) {
            return this.numFrutas * 0.077;
        } else if(moeda.equals("iene")) {
            return this.numFrutas * 10;
        } else {
            return 0;
        }
    }
}