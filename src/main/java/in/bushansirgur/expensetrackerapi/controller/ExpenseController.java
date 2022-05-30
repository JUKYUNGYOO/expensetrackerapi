package in.bushansirgur.expensetrackerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {
//    URI -  annotation = RequestMapping.class
    @GetMapping("/expenses")
    public String getAllExpenses(){
        return "List of Expenses";
    }
}
