class TestFinallyBlock {
    public static void main(String args[]) {
        int data = 0;
        try {

            data = 25 / 0;
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Unknown error");
        } finally {
            System.out.println("h");
        }

        System.out.println("k");
    }
}