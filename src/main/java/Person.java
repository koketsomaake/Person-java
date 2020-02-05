public class Person {

    //declaring instance variables
    private String name;
    private int age;
    private String gender;
    private String[] interest;

    //overloaded constructor
    public Person(String name, int age, String gender, String[] interest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }


    public String hello()
    {
        //  returning my personal info

        return "Hello, my name is " + name + " and I am " + age + " years old "
            + gender + " . My interest are " + interest[0] + " , " + interest[1] + " and " + interest[2];
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
