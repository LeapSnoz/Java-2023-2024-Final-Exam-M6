/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author Nameless
 */
public interface DiscountRate {
    double getServiceMemberDiscount(String customerType);
    double getProductMemberDiscount(String customerType);
}
