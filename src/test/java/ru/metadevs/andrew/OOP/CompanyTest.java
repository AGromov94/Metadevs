package ru.metadevs.andrew.OOP;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CompanyTest {

    @Test
    public void shouldHireWorkerCompany() {
        Company metadevs = new Company("Metadevs", 2);
        Worker ivan = new Worker("Ivan", 20);
        Manager petr = new Manager(("Petr"), 30);

        assertThat(metadevs.getEmployees().length).isEqualTo(3);
    }

    @Test
    public void shouldFireEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 2);
        Worker ivan = new Worker("Ivan", 20);
        Manager petr = new Manager(("Petr"), 30);
        metadevs.hire(ivan, 20000);
        metadevs.hire(petr, 30000);
        metadevs.fire(ivan);

        assertThat(!(Arrays.asList(metadevs.getEmployees()).contains(ivan)));
    }

    @Test
    public void shouldFireNonExistEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 1);
        Employee ivan = new Manager("Ivan", 21);
        Employee pavel = new Worker("Pavel", 18);
        metadevs.hire(ivan, 1500);

        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metadevs.fire(pavel));
    }

    @Test
    public void shouldFindNonExistEmployeeInCompany(){
        Company metadevs = new Company("Metadevs", 2);
        Employee ivan = new Manager("Ivan", 21);
        metadevs.hire(ivan,20000);

        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metadevs.employeeByName("petya"));
    }

    @Test
    public void shouldHireAlreadyHiredEmployeeFromCompany(){
        Company metadevs = new Company("Metadevs", 2);
        Worker ivan = new Worker("Ivan", 20);
        metadevs.hire(ivan, 20000);

        assertThatExceptionOfType(EmployeeValidateException.class).isThrownBy(() -> metadevs.hire(ivan,20000));
    }
}