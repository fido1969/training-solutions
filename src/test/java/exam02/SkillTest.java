package exam02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SkillTest {

    @Test
    public void testCreate() {
        Skill skill = new Skill("programming", 3);
        assertEquals("programming", skill.getName());
        assertEquals(3, skill.getLevel());
    }
}