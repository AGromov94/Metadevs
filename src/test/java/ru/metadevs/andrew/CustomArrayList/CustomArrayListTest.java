package ru.metadevs.andrew.CustomArrayList;

import org.junit.jupiter.api.Test;
import ru.metadevs.andrew.OOP.Company.*;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CustomArrayListTest {
    AbstractEmployee ivan = new Manager("Ivan", 21);
    AbstractEmployee pavel = new Worker("Pavel", 18);
    AbstractEmployee alex = new Worker("Alex", 18);

    @Test
    public void shouldAddElementInCustomArrayList() {
        CustomArrayList<AbstractEmployee> testList = new CustomArrayList<>();
        testList.add(0, ivan);
        testList.add(1, alex);
        assertThat(testList.get(0)).isEqualTo(ivan);
        assertThat(testList.get(1)).isEqualTo(alex);
    }

    @Test
    public void shouldRemoveElementFromCustomArrayList() {
        CustomArrayList<AbstractEmployee> testList = new CustomArrayList<>();
        testList.add(0, ivan);
        testList.add(1, pavel);
        testList.remove(pavel);
        assertThat(testList.size()).isEqualTo(1);
    }

    @Test
    public void shouldGetCustomArrayListSize() {
        CustomArrayList<AbstractEmployee> testList = new CustomArrayList<>();
        testList.add(0, ivan);
        testList.add(1, pavel);
        assertThat(testList.size()).isEqualTo(2);
    }

    @Test
    public void checkThatCustomArrayListIsEmpty() {
        CustomArrayList<AbstractEmployee> testList = new CustomArrayList<>();
        testList.add(0, ivan);
        testList.add(1, pavel);
        assertThat(testList.isEmpty()).isFalse();
    }

    @Test
    public void checkThatCustomArrayListContainedElement() {
        CustomArrayList<AbstractEmployee> testList = new CustomArrayList<>();
        testList.add(0, ivan);
        testList.add(1, pavel);
        assertThat(testList.contains(pavel)).isTrue();
    }

    @Test
    public void shouldGetSublistFromCustomArrayList() {
        CustomArrayList<AbstractEmployee> testList = new CustomArrayList<>();
        testList.add(0, ivan);
        testList.add(1, pavel);
        testList.add(2, alex);
        List<AbstractEmployee> subList = testList.subList(1, 3);
        assertThat(subList.size()).isEqualTo(2);
        assertThat(subList.get(0)).isEqualTo(pavel);
        assertThat(subList.contains(alex)).isTrue();
    }
}
