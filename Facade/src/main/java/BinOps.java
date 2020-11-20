public class BinOps implements IBinOps {
    @Override
    public String sum(String a, String b) {
        int i = Integer.parseInt(a, 2);
        int j = Integer.parseInt(b, 2);
        return Integer.toBinaryString(i + j);
    }

    @Override
    public String mult(String a, String b) {
        int i = Integer.parseInt(a, 2);
        int j = Integer.parseInt(b, 2);
        return Integer.toBinaryString(i * j);
    }
}
