public class GenerarLiquidacion {
    public static void main(String args[]){
        Liquidacion liquidacionInscripcionEAFIT = new Inscripcion(new LiquidacionEAFIT(true));
        System.out.println("El valor de su liquidación de " + liquidacionInscripcionEAFIT.getTipo() + " en EAFIT es $ " + liquidacionInscripcionEAFIT.getTotal());

        Liquidacion liquidacionMatriculaUNAULA = new Matricula(new LiquidacionUNAULA(true));
        System.out.println("El valor de su liquidación de " + liquidacionMatriculaUNAULA.getTipo() + " en UNAULA es $ " + liquidacionMatriculaUNAULA.getTotal());

        Liquidacion liquidacionDerechoGradoLIBERTADORES = new DerechoGrado(new LiquidacionLIBERTADORES());
        System.out.println("El valor de su liquidación de " + liquidacionDerechoGradoLIBERTADORES.getTipo() + " en LIBERTADORES es $ " + liquidacionDerechoGradoLIBERTADORES.getTotal());

        Liquidacion liquidacionDerechoGradoUNAULA = new DerechoGrado(new LiquidacionUNAULA(true));
        System.out.println("El valor de su liquidación de " + liquidacionDerechoGradoUNAULA.getTipo() + " en UNAULA es $ " + liquidacionDerechoGradoUNAULA.getTotal());

        Liquidacion liquidacionInscripcionUNAULA = new Inscripcion(new LiquidacionUNAULA(true));
        System.out.println("El valor de su liquidación de " + liquidacionInscripcionUNAULA.getTipo() + " en UNAULA es $ " + liquidacionInscripcionUNAULA.getTotal());

        Liquidacion liquidacionDerechoGradoEAFIT = new DerechoGrado(new LiquidacionEAFIT(true));
        System.out.println("El valor de su liquidación de " + liquidacionDerechoGradoEAFIT.getTipo() + " en EAFIT es $ " + liquidacionDerechoGradoEAFIT.getTotal());
    }
}
