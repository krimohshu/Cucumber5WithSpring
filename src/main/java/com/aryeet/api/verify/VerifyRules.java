package com.aryeet.api.verify;

import com.aryeet.api.model.Employee;
import com.aryeet.api.model.EmployeeListWithStatus;
import io.restassured.response.Response;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class VerifyRules {

    private List<Employee> returnedEmps =null;
    private EmployeeListWithStatus employeeListWithStatus;




    public boolean isRulePassed(String expectedResult, Response response) {
        List<String> whatToVerify = Arrays.asList(expectedResult.split(";"));

        boolean nothingMatched= false;

        switch (whatToVerify.get(0)) {

            case "response_VerifyEmployee_idx_":
                employeeListWithStatus = response.getBody().as(EmployeeListWithStatus.class);
                List<String> findTheValueToVerify = Arrays.asList( whatToVerify.get(1).split(":"));



                nothingMatched= returnedEmps.get(Integer.parseInt(findTheValueToVerify.get(1))-1).getId().equalsIgnoreCase(findTheValueToVerify.get(1));
                break;

        }

        return nothingMatched;

    }


    public boolean isRulePresent(String expectedResult) {
        List<String> whatToVerify = Arrays.asList(expectedResult.split(";"));
        boolean isRulePresent= false;

        switch (whatToVerify.get(0)) {
            case "response_VerifyEmployee_idx_":
                isRulePresent=true;

                break ;
        }
        return isRulePresent;
    }
}
