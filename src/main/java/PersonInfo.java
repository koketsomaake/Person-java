public class PersonInfo {
    public static void main(String[] args) {
        //creating the object of the class Person
        Person person = new Person("Koketso", 23, "male",
                new String[]{"coding", "music-production", "listening to music"});
        System.out.println(person.hello());//calling the method
    }
}