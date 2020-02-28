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
    public String hello() {
        // returning my personal info
        String message = "";
        String punctuation = "";
        for (int i = 0; i < interest.length; i++) {
            if(i >0 && i < interest.length-1) {
                punctuation +=", ";
            }
            if(i == interest.length-1) {
                punctuation +=" and ";
            }
            punctuation += interest[i];
        }
        message="Hello, my name is " + name + " and I am " + age + " years old "
                + gender + " . My interest are " ;
        return message + punctuation + ".";
    }
}
