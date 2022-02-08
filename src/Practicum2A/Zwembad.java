package Practicum2A;

public class Zwembad{

    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad (double br,double len,double die){
        breedte = br;
        lengte = len;
        diepte = die;
    }
    public Zwembad (){

    }
    public  void setBreedte(double br){
        this.breedte = br;
    }

    public  void setLengte(double len){
        this.lengte = len;
    }

    public  void setDiepte(double die){
        diepte = die;
    }

    public double getBreedte(){
        return breedte;
    }

    public double getLengte(){
        return lengte;
    }

    public double getDiepte(){
        return diepte;
    }

    public double inhoud(){
        double inhoud = this.breedte * this.lengte * this.diepte;
        return inhoud;}

    public String toString() {
        return "de breedte is " + breedte + " lengte is " + lengte + " diepte is " + diepte;
    }}