package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeProject {
    private int empID;
    private int projectID;
    private LocalDate dateFrom;
    private LocalDate dateTo;

    public EmployeeProject(int empID, int projectID, LocalDate dateFrom, LocalDate dateTo) {
        this.empID = empID;
        this.projectID = projectID;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public int getEmpID() {
        return empID;
    }

    public int getProjectID() {
        return projectID;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public long getDuration() {
        LocalDate endDate = dateTo != null ? dateTo : LocalDate.now();
        return ChronoUnit.DAYS.between(dateFrom, endDate);
    }
}
