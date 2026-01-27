class Test {
    int modifyValue(int x) {
        return x + 10;
    }

    public static void main(String[] args) {
        int a = 5;
        Test obj = new Test();
        a = obj.modifyValue(a);   
        System.out.println(a);
    }
}
