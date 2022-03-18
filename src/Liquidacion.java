public abstract class Liquidacion {
    private String tipo;
    private int total;
    private boolean certificadoElectoral;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public boolean isCertificadoElectoral() {
        return certificadoElectoral;
    }

    public void setCertificadoElectoral(boolean certificadoElectoral) {
        this.certificadoElectoral = certificadoElectoral;
    }

}
