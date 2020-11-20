public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String sum = binOps.sum("101", "101");
        String mult = binOps.mult("101", "101");
        System.out.println(sum);
        System.out.println(mult);
    }
}
