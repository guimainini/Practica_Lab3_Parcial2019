public class Roja extends TipoCerveza{
    //constructores
    public Roja(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, porcentajeComplejidad);
    }

    //calcula el costo de fabricacion
    public float calcularCostoFabricacion(){
        int contador = 0;

        for(int i=0; i < getReceta().getListaingrediente().size();i++){
            contador += getReceta().getListaingrediente().get(i).getPrecioUnidad();
        }
        contador += contador * (getPorcentajeComplejidad()/100);
        return contador;
    }

    @Override
    public String toString() {
        return "Roja{}"+super.toString();
    }
}
