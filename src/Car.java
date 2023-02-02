public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if(model == null||model.isEmpty() ){
            this.model = "default";
        } else {
        this.model = model;}
        if(brand==null ||brand.isEmpty()){
            this.brand = "default";
        } else{
        this.brand = brand;}
        if(country == null||country.isEmpty()){
            this.country = "default";
        } else{
            this.country = country;}
        if(engineVolume<=0){
            this.engineVolume = 1.5;
        } else{
            this.engineVolume = engineVolume;}
        if(color == null||color.isEmpty()){
            this.color = "белый";
        } else{
            this.color = color;}
        if(year<=0){
            this.year = 2000;
        } else{
            this.year = year;}
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                " литров, цвет: " + color + ", год производства: " + year + ", страна сборки: " + country;
    }
}
