import org.junit.Assert;
import org.junit.Test;
public class PersonTest {
    @Test
    public void testHello() {
        Person p = new Person("Koketso", 23, "male",
                new String[]{"coding", "music production", "listening to music"});
        String result = p.hello();
        Assert.assertEquals(result, "Hello, my name is Koketso and I am 23 years old male . My interest are coding, music production and listening to music.");

    }
}