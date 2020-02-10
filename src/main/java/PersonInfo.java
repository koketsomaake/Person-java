public class PersonInfo {

    public static void main (String[] args) {
        String[] interest = {"coding", "beats", "music"};
        //creating the object of the class Person

        Person person = new Person("koketso", 25, "male",
                new String[] {"coding", "making beats", "listening to music."});

        System.out.println(person.hello());//calling the method


    }
}

