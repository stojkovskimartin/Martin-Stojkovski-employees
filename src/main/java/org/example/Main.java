package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "file.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    int empId = Integer.parseInt(parts[0]);
                    int projectId = Integer.parseInt(parts[1]);
                    LocalDate dateFrom = LocalDate.parse(parts[2]);
                    LocalDate dateTo = null;
                    if (parts.length > 3 && parts[3] != null && !parts[3].isEmpty() && !parts[3].equalsIgnoreCase("NULL")) {
                        dateTo = LocalDate.parse(parts[3]);
                    } else {
                        dateTo = LocalDate.now();
                    }
                    // process the data here
                } else {
                    System.err.println("Line does not contain enough data: " + line);
                    continue;
                }
            }
        }

        String maxDurationEmpPairKey = null;
        long maxDuration = 0;
        String[] empPair = maxDurationEmpPairKey.split("-");
        String emp1 = empPair[0];
        String emp2 = empPair[1];
        System.out.println(emp1 + ", " + emp2 + ", " + maxDuration);
    }
}
