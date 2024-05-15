package PrimeraClaseEjercicio;

public class Ave {
    private String Raza, Color, Dieta;
    public Ave(){

    }
    public Ave(String raza, String color, String dieta ){
        this.Raza = raza;
        this.Color = color;
        this.Dieta = dieta;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getDieta() {
        return Dieta;
    }

    public void setDieta(String dieta) {
        Dieta = dieta;
    }

    public static void volar(Ave Pajaro){
        System.out.println(Pajaro.getRaza() + " esta volando");
    }
    public static void alimentacion(Ave Pajaro){
        System.out.println(Pajaro.getRaza() + "Se alimenta de: " + Pajaro.getDieta());
    }
    public static void datos(Ave Pajaro){
        System.out.println("Raza: "+ Pajaro.getRaza() + " Color: "+Pajaro.getColor());
    }
}
