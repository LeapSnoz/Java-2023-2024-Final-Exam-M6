/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author Nameless
 */
class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public void displayInfo() {
        double serviceDiscountRate = customer.getServiceMemberDiscount(customer.getCustomerType());
        double productDiscountRate = customer.getProductMemberDiscount(customer.getCustomerType());
        double serviceDiscount = serviceExpense * serviceDiscountRate;
        double productDiscount = productExpense * productDiscountRate;
        double totalDiscount = serviceDiscount + productDiscount;
        double payableAmount = getTotalExpense() - totalDiscount;
        System.out.println("==========================Transaction================================");
        System.out.println("==========================Customer Info==============================");
        System.out.println("ExerciseOne.Customer: " + customer.getCustomerName());
        System.out.println("Membership: " + customer.getCustomerType());
        System.out.println("Date(yyyy-mm-dd): " + date);
        System.out.println("==========================Expenses Info===============================");
        System.out.println("Expense on Service: $" + serviceExpense);
        System.out.println("Discount: $" + serviceDiscount);
        System.out.println("Expense on Product : $" + productExpense);
        System.out.println("Discount: $" + productDiscount);
        System.out.println("Total Expense: $" + payableAmount);
        System.out.println();
    }
}

