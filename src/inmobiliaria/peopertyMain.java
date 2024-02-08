package inmobiliaria;

public class peopertyMain {
    public static void main(String[] args) {
        property[] properties = new property[3];
        properties[0] = new property(1, "street 2", 1.000, 200000000, 5, 3, true, "available");
        properties[1] = new property(2, "apartment 2", 150.0, 150000000, 2, 1, true, "rented");
        properties[2] = new property(3, "street 3", 170, 100000000, 3, 1, false, "for sale");

        for (property property: properties) {
            property.showData();
            System.out.println(properties);


        }
        properties[0].setPrice(2);
        properties[2].setIdProperty(7);

    }
}
