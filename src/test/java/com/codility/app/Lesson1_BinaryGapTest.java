package test.java.com.codility.app;

import main.java.com.codility.app.Lesson1_BinaryGap;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Lesson1_BinaryGapTest {

    @Test
    public void solution_Nis9_Return2() {
        //Arrange
        Lesson1_BinaryGap SUT = new Lesson1_BinaryGap();

        //Action
        int result = SUT.solution(9);

        //Assert
        assertThat(result, is(2));
    }

    @Test
    public void solution_Nis529_Return4() {
        //Arrange
        Lesson1_BinaryGap SUT = new Lesson1_BinaryGap();

        //Action
        int result = SUT.solution(529);

        //Assert
        assertThat(result, is(4));
    }

    @Test
    public void solution_Nis20_Return1() {
        //Arrange
        Lesson1_BinaryGap SUT = new Lesson1_BinaryGap();

        //Action
        int result = SUT.solution(20);

        //Assert
        assertThat(result, is(1));
    }

    @Test
    public void solution_Nis15_Return0() {
        //Arrange
        Lesson1_BinaryGap SUT = new Lesson1_BinaryGap();

        //Action
        int result = SUT.solution(15);

        //Assert
        assertThat(result, is(0));
    }
    @Test
    public void solution_Nis32_Return0() {
        //Arrange
        Lesson1_BinaryGap SUT = new Lesson1_BinaryGap();

        //Action
        int result = SUT.solution(32);

        //Assert
        assertThat(result, is(0));
    }
    @Test
    public void solution_Nis1041_Return5() {
        //Arrange
        Lesson1_BinaryGap SUT = new Lesson1_BinaryGap();

        //Action
        int result = SUT.solution(1041);

        //Assert
        assertThat(result, is(5));
    }

    @Test
    public void solution_Nis2147483647_Return0() {
        //Arrange
        Lesson1_BinaryGap SUT = new Lesson1_BinaryGap();

        //Action
        int result = SUT.solution(2147483647);

        //Assert
        assertThat(result, is(0));
    }
}