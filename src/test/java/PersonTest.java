import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testHello()
    {
    Person p = new Person ("koketso", 25, "male",
            new String[] {"coding", "making beats", "listening to music."});

    String result = p.hello();

    Assert.assertEquals(result, "Hello, my name is koketso and I am 25 years old male . My interest are coding , making beats and listening to music.");





}
}

