package com.example.project2.dto.response;

public class BillResponse {
    private String productName;
    private int totalprice;
    private int netprice;
    public BillResponse(String productName, int totalprice,int netprice) {
        this.productName = productName;
        this.totalprice = totalprice;
        this.netprice=netprice;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getTotalprice() {
        return totalprice;
    }
    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }
    public int getNetprice() {
        return netprice;
    }
    public void setNetprice(int netprice) {
        this.netprice = netprice;
    }
    
    
    
}
