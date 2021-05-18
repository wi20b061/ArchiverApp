import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test_MainTestToShowThatProjectWorks(){
        //Arrange

        //Act
        String actualvalue = Main.message();

        //Assert
        Assertions.assertEquals("test", actualvalue);
    }


}
