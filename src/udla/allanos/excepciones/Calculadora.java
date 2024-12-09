package udla.allanos.excepciones;

public class Calculadora {
    public double dividir(int dividendo, int divisor) throws DivisionPorCeroException{
        if (divisor == 0){
            try {
                throw new DivisionPorCeroException("No es posible dividir para cero");
            }catch (DivisionPorCeroException dpc){

            }
        }
        return dividendo/(double)divisor;
    }
    public double dividir(String dividendo, String divisor) throws DivisionPorCeroException, FormatoNumeroException {
        try {
            int divid = Integer.parseInt(dividendo);
            int divos = Integer.parseInt(divisor);
            //throw new FormatoNumeroException("No es posible dividir sin numeros");
            return this.dividir(divid,divos);
        }catch (DivisionPorCeroException dcp){}

        return 0;
    }


}
