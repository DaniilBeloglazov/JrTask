package JavaRush.lvl9tasks.tsk11;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void test1(){
        Solution.main(null);
        assertEquals("Я не хочу изучать Java, я хочу большую зарплату\n" +
                " не хочу изучать Java, я хочу большую зарплату\n" +
                "не хочу изучать Java, я хочу большую зарплату\n" +
                "е хочу изучать Java, я хочу большую зарплату\n" +
                " хочу изучать Java, я хочу большую зарплату\n" +
                "хочу изучать Java, я хочу большую зарплату\n" +
                "очу изучать Java, я хочу большую зарплату\n" +
                "чу изучать Java, я хочу большую зарплату\n" +
                "у изучать Java, я хочу большую зарплату\n" +
                " изучать Java, я хочу большую зарплату\n" +
                "изучать Java, я хочу большую зарплату\n" +
                "зучать Java, я хочу большую зарплату\n" +
                "учать Java, я хочу большую зарплату\n" +
                "чать Java, я хочу большую зарплату\n" +
                "ать Java, я хочу большую зарплату\n" +
                "ть Java, я хочу большую зарплату\n" +
                "ь Java, я хочу большую зарплату\n" +
                " Java, я хочу большую зарплату\n" +
                "Java, я хочу большую зарплату\n" +
                "ava, я хочу большую зарплату\n" +
                "va, я хочу большую зарплату\n" +
                "a, я хочу большую зарплату\n" +
                ", я хочу большую зарплату\n" +
                " я хочу большую зарплату\n" +
                "я хочу большую зарплату\n" +
                " хочу большую зарплату\n" +
                "хочу большую зарплату\n" +
                "очу большую зарплату\n" +
                "чу большую зарплату\n" +
                "у большую зарплату\n" +
                " большую зарплату\n" +
                "большую зарплату\n" +
                "ольшую зарплату\n" +
                "льшую зарплату\n" +
                "ьшую зарплату\n" +
                "шую зарплату\n" +
                "ую зарплату\n" +
                "ю зарплату\n" +
                " зарплату\n" +
                "зарплату\n", outContent.toString());
    }
}