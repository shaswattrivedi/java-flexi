class Student {
    int id;
    String name; 

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 181;
        s1.name = "Shashank";
        s2.id = 182;
        s2.name = "Shaswat";
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
}
}