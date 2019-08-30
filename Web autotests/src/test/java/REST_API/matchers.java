package REST_API;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.notNullValue;

public class matchers {

    @Test
    public void givenNumber_whenConditions_thenCorrect() {
        Integer intVal = 7;
        assertThat(intVal, allOf(greaterThan(5), lessThanOrEqualTo(7), not(equalTo(6)), notNullValue()));
    }

    @Test
    public void given2Strings_whenEqual_thenCorrect() {
        String a = "Petya";
        String b = "petya";
        assertThat(a, equalToIgnoringCase(b));
    }

    @Test
    public void given2Strings_whenEqualIgnWS_thenCorrect() {
        String a = "  Hi   Petya ";
        assertThat(a, equalToIgnoringWhiteSpace("Hi Petya"));
    }

    //Списки
    @Test
    public void givenList_whenCheck_thenNotEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, is(not(empty())));
    }

    @Test
    public void givenList_whenCheck_thenSize3() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
    }

    @Test
    public void givenList_whenCheck_thenPosotiveElements() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, everyItem(greaterThan(0)));
    }

    @Test
    public void givenList_whenCheck_thenHasItem() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasItem(5));
    }

    @Test
    public void givenList_whenCheck_thenContainsElements() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, contains(5, 2, 4));
    }

    @Test
    public void givenMap_whenCheck_thenContains() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        assertThat(map, hasKey(1));
        assertThat(map, hasValue("a"));
        assertThat(map, hasEntry(3, "c"));
    }

    //Массивы
    @Test
    public void givenArray_whenCheck_thenNotEmpty() {
        String[] array = new String[] { "ab" };
        assertThat(array, not(emptyArray()));
    }

    @Test
    public void givenArray_whenCheck_thenSize3() {
        Integer[] array = new Integer[] { 5, 2, 4 };
        assertThat(array, arrayWithSize(3));
    }

    @Test
    public void givenArray_whenCheck_thenContainInAnyOrder() {
        Integer[] array = new Integer[] { 5, 2, 4 };
        assertThat(array, arrayContainingInAnyOrder(2, 5, 4));
    }

    @Test
    public void givenArray_whenCheck_thenHasItem() {
        Integer[] array = new Integer[] { 5, 2, 4 };
        assertThat(array, hasItemInArray(5));
    }

    @Test
    public void givenArray_whenCheck_thenContainsElements() {
        Integer[] array = new Integer[] { 5, 2, 4 };
        assertThat(array, arrayContaining(5, 2, 4));
    }



}
