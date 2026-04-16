//write a meathod using the throws keyword
class Throws {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void throwException() throws Exception {
        throw new Exception("This is a thrown exception.");
    }
}