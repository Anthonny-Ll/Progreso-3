package udla.allanos.excepciones;

public class DivisionPorCeroException extends  Exception{
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}
