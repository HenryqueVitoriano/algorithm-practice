package resources;

public class Taxis {
    double taxaFixa;
    double valorPorKM;

    public Taxis(double taxaFixa, double valorPorKM){
        this.taxaFixa = taxaFixa;
        this.valorPorKM = valorPorKM;
    }

    public double getTaxaFixa() {
        return taxaFixa;
    }

    public void setTaxaFixa(double taxaFixa) {
        this.taxaFixa = taxaFixa;
    }

    public double getValorPorKM() {
        return valorPorKM;
    }

    public void setValorPorKM(double valorPorKM) {
        this.valorPorKM = valorPorKM;
    }
}
