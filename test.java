public class  test {
    public static boolean isGoodApartment(int area, String street) {
        return area >= 100 || (area >= 80 && "Main Street".equals(street));
    }
}
