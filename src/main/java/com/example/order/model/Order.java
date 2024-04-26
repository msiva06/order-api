package com.example.order.model;

import java.util.Date;

public class Order {
    private int orderId;
    private int customerId;
    private int quantity;
    private double totalPrice;
    private Date orderDate;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingCountry;
    private int billingPostalCode;
    private enum PAYMENT_METHOD{
        CREDITCARD,
        PAYPAL
    };
    private enum STATUS{
        CONFIRMED,
        CANCELLED,
        INPROCESS
    }
    private Date deliveryDate;
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getBillingAddress() {
        return billingAddress;
    }
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    public String getBillingCity() {
        return billingCity;
    }
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }
    public String getBillingState() {
        return billingState;
    }
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }
    public String getBillingCountry() {
        return billingCountry;
    }
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }
    public int getBillingPostalCode() {
        return billingPostalCode;
    }
    public void setBillingPostalCode(int billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }
    public Date getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    

    
}
