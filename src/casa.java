public class casa {

    private  String localizacion;
    private  String color;
    private Boolean escaleras;
    private float valor;
    private int habitaciones ;

    //Constructores

    public casa(){
    }
    public casa(String localizacion,String color,boolean escaleras, float valor, int habitaciones){
        this.localizacion=localizacion;
        this.color=color;
        this.escaleras=escaleras;
        this.valor= valor;
        this.habitaciones=habitaciones;
    }
    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion){
        this.localizacion = localizacion;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean getescaleras(){
        return escaleras;
    }
    public void setEscaleras(Boolean escaleras){
        this.escaleras=escaleras;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getHabitaciones(){
        return habitaciones;
    }
    public void setHabitaciones(int habitaciones){
        this.habitaciones=habitaciones;
    }
    @Override
    public String toString(){
       return "Casa{" +
               "localizacion"+localizacion+ '\''+
               "color"+color+'\''+
               "escaleras"+escaleras+
               "valor"+valor+
               "habitaciones"+habitaciones+
               '}';
    }
    //metodos de uso general
    public boolean ubicacion(){
        System.out.println("Ubicacion de la casa: "+ localizacion);
        return true;
    }
    public boolean niveles(){
        System.out.println("Numero de pisos :"+ escaleras);
        return true;
    }
    public boolean costo(){
        System.out.println("Costo de la casa: " + valor);
        return true;
    }
}
