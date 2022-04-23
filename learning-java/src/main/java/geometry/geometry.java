package geometry;

public class geometry {
    public static void main(String[] args) {
        shape coin = new circle("Coin");
        System.out.println("The area for the coin is: " + coin.calculateArea());

        shape box = new square("Box");
        System.out.println("The area for the box is: " + box.calculateArea());
    }
}
