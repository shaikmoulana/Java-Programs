package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam String expression, Model model) {
        try {
            // Evaluate the expression in Java
            double result = evaluateExpression(expression);
            model.addAttribute("result", result);
        } catch (Exception e) {
            // Handle errors, for example, if the expression is not valid
            model.addAttribute("result", "Error");
        }

        return "result";
    }

    private double evaluateExpression(String expression) {
        // Using regular expression to split the expression
        String[] parts = expression.split("\\s*(\\+|\\-|\\*|\\/)\\s*");

        if (parts.length != 2) {
            // Handle invalid expressions
            throw new IllegalArgumentException("Invalid expression");
        }

        double operand1 = Double.parseDouble(parts[0].trim());
        double operand2 = Double.parseDouble(parts[1].trim());

        // Determine the operator and perform the corresponding operation
        if (expression.contains("+")) {
            return operand1 + operand2;
        } else if (expression.contains("-")) {
            return operand1 - operand2;
        } else if (expression.contains("*")) {
            return operand1 * operand2;
        } else if (expression.contains("/")) {
            return operand1 / operand2;
        } else {
            // Handle unsupported operations or invalid expressions
            throw new IllegalArgumentException("Unsupported operation or invalid expression");
        }
    }

    }
