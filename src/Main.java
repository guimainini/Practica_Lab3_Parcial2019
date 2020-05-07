import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ingrediente> listaIngredientesRoja = new ArrayList<>();
        ArrayList<Ingrediente> listaIngredientesRubia = new ArrayList<>();
        ArrayList<Ingrediente> listaIngredientesNegra = new ArrayList<>();
        ArrayList<Ingrediente> listaIngredientesConSinGletun = new ArrayList<>();


        ArrayList<Cerveza> listCerveza = new ArrayList<>();

        Ingrediente ingrediente1 = new Ingrediente(1,"Agua","Solo Agua",1,100);
        Ingrediente ingrediente2 = new Ingrediente(2,"Sal","Solo Sal",2,200);
        Ingrediente ingrediente3 = new Ingrediente(3,"Pimienta","Solo Pimienta",3,300);
        Ingrediente ingrediente4 = new Ingrediente(4,"Azucar","Solo Azucar",4,200);
        Ingrediente ingrediente5 = new Ingrediente(5,"Cloro","Solo Cloro",5,200);
        Ingrediente ingrediente6 = new Ingrediente(5,"Clorato","Solo Clorato",6,250);
        Ingrediente ingrediente7 = new Ingrediente(5,"CO2","Solo CO2",5,500);
        Ingrediente ingrediente8 = new Ingrediente(5,"Fosforo","Solo Fosforo",5,800);

        
        listaIngredientesRoja.add(ingrediente1);
        listaIngredientesRoja.add(ingrediente2);
        listaIngredientesRoja.add(ingrediente3);
        listaIngredientesRoja.add(ingrediente4);
        listaIngredientesRoja.add(ingrediente5);
        
        listaIngredientesRubia.add(ingrediente6);
        listaIngredientesRubia.add(ingrediente7);
        listaIngredientesRubia.add(ingrediente8);
        
        listaIngredientesNegra.add(ingrediente1);
        listaIngredientesNegra.add(ingrediente5);
        listaIngredientesNegra.add(ingrediente8);

        listaIngredientesConSinGletun.add(ingrediente1);

        ingrediente1.indicarCantidad(listaIngredientesRoja,"Sal");

        
        Receta recetaRoja = new Receta(1,"Algo parecido a la Roja","Argentina",listaIngredientesRoja);
        
        Receta recetaRubia = new Receta(2,"Casi Perfecta la Rubia","Holanda",listaIngredientesRubia);
        
        Receta recetaNegro = new Receta(3,"Afro","Magadascar",listaIngredientesNegra);


        Receta recetaConSinGluten = new Receta (3,"Esto esta mal","En casa",listaIngredientesConSinGletun);


        Cerveza roja = new Roja(1,"Rojita",100,111,"LALA",true,recetaRoja,15);
        Cerveza rubia = new Rubia(2,"Rubita",150,222,"LELE",true,recetaRubia,10);
        Cerveza negra = new Negra(3,"Negrita",200,333,"LILI",true,recetaNegro,20);


        System.out.println("El costo de fabricacion es de la Con Gluten : "+TipoCerveza.calcularCostoFabricacion(recetaConSinGluten,false));
        System.out.println("El costo de fabricacion es de la Con Gluten : "+TipoCerveza.calcularCostoFabricacion(recetaConSinGluten,true));

        
        System.out.println(roja.toString());
        System.out.println(roja.calcularCostoFabricacion());
        System.out.println(rubia.toString());
        System.out.println(rubia.calcularCostoFabricacion());
        System.out.println(negra.toString());
        System.out.println(negra.calcularCostoFabricacion());

        Fabrica fabrica = new Fabrica(1,"Antares","12 de octubre 7500",listCerveza);

        fabrica.agregarCerveza(roja);
        fabrica.agregarCerveza(rubia);
        fabrica.agregarCerveza(negra);
        fabrica.agregarCerveza(negra);



        fabrica.listarCerveza();
        System.out.println();
        System.out.println();
        fabrica.quitarCerveza(2);

        fabrica.listarCerveza();


    }





}
