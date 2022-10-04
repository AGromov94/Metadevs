package ru.metadevs.andrew.OOP;

import org.junit.jupiter.api.Test;
import ru.metadevs.andrew.OOP.Company.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CompanyTest {

    @Test
    public void shouldHireEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 2);
        AbstractEmployee ivan = new Worker("Ivan", 20);
        AbstractEmployee petr = new Manager(("Petr"), 30);

        metadevs.hire(ivan, 30000);
        metadevs.hire(petr, 35000);

        assertThat(metadevs.getEmployees().length).isEqualTo(2);
        assertThat(metadevs.employeeByName(ivan.getName())).isEqualTo(ivan);
        assertThat(metadevs.employeeByName(petr.getName())).isEqualTo(petr);
    }

    @Test
    public void shouldFireEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 2);
        AbstractEmployee ivan = new Worker("Ivan", 20);
        AbstractEmployee petr = new Manager(("Petr"), 30);

        metadevs.hire(ivan, 20000);
        metadevs.hire(petr, 30000);
        metadevs.fire(ivan);

        assertThat(metadevs.getEmployees().length).isEqualTo(1);
        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metadevs.employeeByName(ivan.getName()));
    }

    @Test
    public void shouldFireNonExistEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 1);
        AbstractEmployee ivan = new Manager("Ivan", 21);
        AbstractEmployee pavel = new Worker("Pavel", 18);
        metadevs.hire(ivan, 1500);

        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metadevs.fire(pavel));
    }

    @Test
    public void shouldHireAlreadyHiredEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 2);
        AbstractEmployee ivan = new Worker("Ivan", 20);
        metadevs.hire(ivan, 20000);

        assertThatExceptionOfType(EmployeeAlreadyExistsInCompanyException.class).isThrownBy(() -> metadevs.hire(ivan, 20000));
    }

    @Test
    public void shouldHireEmployeeWhoseSalaryLessThanAge() {
        Company metadevs = new Company("Metadevs", 1);
        AbstractEmployee ivan = new Worker("Ivan", 20);

        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(() -> metadevs.hire(ivan, 15));
    }
}