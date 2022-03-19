public class LiquidacionUNAULA extends Liquidacion implements LiquidacionServicio {

    public int matriculaNeta;

    public LiquidacionUNAULA(boolean certificadoElectoral) {
        this.matriculaNeta = 80;
        super.setCertificadoElectoral(certificadoElectoral);
    }

    @Override
    public int valorMatricula() {
        if(super.isCertificadoElectoral()){
            return matriculaNeta - 10;
        } else {
            return matriculaNeta;
        }
    }

    @Override
    public int valorInscripcion() {
        return 40;
    }

    @Override
    public int valorDerechosGrado() {
        return matriculaNeta * 20 / 100;
    }
}
