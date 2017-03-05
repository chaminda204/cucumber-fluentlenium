package com.example.au;



import cucumber.api.DataTable;
import cucumber.api.java8.En;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorSteps implements En {

    private Calculator calculator = null;

    private Integer total = null;

    public CalculatorSteps(){

        Given("^I have a calculator$", () -> {
            calculator = new Calculator();
        });

        When("^I add number (\\d+) and number (\\d+)$", (Integer number1, Integer number2) -> {
            total = calculator.addTwoNumbers(number1, number2);
        });

        Then("^the total should be (\\d+)$", (Integer totalShouldBe) -> {
            assertThat(total).isEqualTo(totalShouldBe);
        });
        Given("^I have following data$", (DataTable additionData) -> {
            List<Integer> providedData = additionData.asList(Integer.class);
            assertThat(providedData.get(0)).isEqualTo(new Integer(12));
            assertThat(providedData.get(1)).isEqualTo(new Integer(5));
            assertThat(providedData.get(2)).isEqualTo(new Integer(17));

        });

        Given("^I have following data with header$", (DataTable tableWithHeader) -> {
            Map<String, Integer> dataTableWithHeader = tableWithHeader.asMap(String.class, Integer.class);

            dataTableWithHeader.keySet().forEach(key -> {
                System.out.println(dataTableWithHeader.get(key));
            });
            assertThat(dataTableWithHeader.get("first")).isEqualTo(new Integer(12));
            assertThat(dataTableWithHeader.get("second")).isEqualTo(new Integer(5));
            assertThat(dataTableWithHeader.get("total")).isEqualTo(new Integer(17));


        });



    }



}
