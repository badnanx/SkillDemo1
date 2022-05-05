
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo01Test { 
    @Test
    public void multiplication() {
        assertEquals(9, SkillDemo01.multi(3, 2));
        // failing test
    }
}