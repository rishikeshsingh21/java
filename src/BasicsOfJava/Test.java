package BasicsOfJava;

public class Test {
    String name;
    int age;
    public Test(String name,int age){
        System.out.println("Constructor is calles"+this);
        this.name = name;
        this.age = age;
        System.out.println("Constructor is calles"+this);
    }
    public static void main(String[] args) {
        Test obj = new Test("Rishikesh",22);
        Test obj1 = new Test("Pratham",21);

        System.out.println(obj.toString());
        System.out.println(obj1.toString());
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + this.age +
                ", name='" + this.name + '\'' +
                '}';
    }
}
