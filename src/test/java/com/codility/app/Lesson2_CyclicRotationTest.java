package test.java.com.codility.app;

import main.java.com.codility.app.Lesson2_CyclicRotation;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Lesson2_CyclicRotationTest {

    @Test
    public void CyclicRotation_Input3_8_9_7_6_Kis3_Return97638(){
        Lesson2_CyclicRotation SUT = new Lesson2_CyclicRotation();

        int[] A= {3,8,9,7,6};

        int[] expectedResult  = {9,7,6,3,8};
        int[] result = SUT.solution(A, 3);

        assertThat(result, is(expectedResult));
    }

    @Test
    public void CyclicRotation_Input000_Kis1_Return000(){
        Lesson2_CyclicRotation SUT = new Lesson2_CyclicRotation();

        int[] A= {0,0,0};

        int[] expectedResult  = {0,0,0};
        int[] result = SUT.solution(A, 1);

        assertThat(result, is(expectedResult));
    }

    @Test
    public void CyclicRotation_Input1234_Kis4_Return1234(){
        Lesson2_CyclicRotation SUT = new Lesson2_CyclicRotation();

        int[] A= {1,2,3,4};

        int[] expectedResult  = {1,2,3,4};
        int[] result = SUT.solution(A, 4);

        assertThat(result, is(expectedResult));
    }

    @Test
    public void CyclicRotation_InputEmpty_Kis1_ReturnEmpty(){
        Lesson2_CyclicRotation SUT = new Lesson2_CyclicRotation();

        int[] A= {};

        int[] expectedResult  = {};
        int[] result = SUT.solution(A, 1);

        assertThat(result, is(expectedResult));
    }
}