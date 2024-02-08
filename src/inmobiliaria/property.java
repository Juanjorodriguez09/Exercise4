package inmobiliaria;

public class property {
    public int idProperty;
    public String address;
    public double area;
    public double price;
    public int rooms;
    public int bathroom;
    public boolean garage;
    public String status;

    public property(int idProperty,String address, double area, double price, int rooms, int bathroom, boolean garage, String status) {
        this.idProperty = idProperty;
        this.address = address;
        this.area = area;
        this.price = price;
        this.rooms = rooms;
        this.bathroom = bathroom;
        this.garage = garage;
        this.status = status;
    }

    public int getIdProperty() {
        return idProperty;
    }
    public String getAddress(){
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public int getRooms() {
        return rooms;
    }

    public int getBathroom() {
        return bathroom;
    }

    public boolean getGarage() {
        return garage;
    }

    public String getStatus() {
        return status;
    }

    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void showData(){
        System.out.println("id Property :" + idProperty);
        System.out.println("address :" + address);
        System.out.println("area :" + area);
        System.out.println("price :" + price);
        System.out.println("rooms :"+ rooms);
        System.out.println("bathroom :"+ bathroom);
        System.out.println("garage :" + garage);
        System.out.println("status :" + status);
    }

}




