package com.example.appmomos.recyclerviewusingapi.modelClasses;

import java.util.List;

/**
 * Created by Vaibhav on 26-07-2018.
 */

public class OwnerNameModel
{

    /**
     * success : true
     * deliveredOrders : [{"oid":"5977","shopName":"Bhairaweshwara Agency","order_total":"15250","order_delivered_date":"04/06/2018 04:31 Mon","creditPeriod":"30","daysOverDue":"22","dueDate":"04/07/2018 04:31 Wed","ownerName":"Deepak ","pendingBalance":"15250","shopNum":"8197775389","shopAddress":"Handpost","shopTaluk":"Mudigere","shopDistrict":"Chikmagalur","countryName":"India","stateName":"Karnataka","gstNum":"","productName":"FAI Power Sprayer (Petrol Powered - 20L), FAI 4 Stroke Power Sprayer (20L)","status":"Delivered","salesExecutive":"Niranjan V","salesExecutiveId":"20"},{"oid":"6060","shopName":"Shree Ram Shetty Store","order_total":"2030","order_delivered_date":"16/06/2018 00:29 Sat","creditPeriod":"30","daysOverDue":"10","dueDate":"16/07/2018 00:29 Mon","ownerName":"Shree Ram Shetty Store","pendingBalance":"2030","shopNum":"9481314653","shopAddress":"Bankal Town","shopTaluk":"Mudigere","shopDistrict":"Chikmagalur","countryName":"India","stateName":"Karnataka","gstNum":"(ARN)  AA2907170686931","productName":"GLP SunKing Pro All Night, GLP SunKing Pico","status":"Delivered","salesExecutive":"Niranjan V","salesExecutiveId":"20"},{"oid":"5672","shopName":"J.M.J Provision","order_total":"2400","order_delivered_date":"28/05/2018 23:49 Mon","creditPeriod":"30","daysOverDue":"29","dueDate":"27/06/2018 23:49 Wed","ownerName":"Sandeep ","pendingBalance":"1400","shopNum":"9740529146","shopAddress":"Talugudu","shopTaluk":"Belur","shopDistrict":"Hassan","countryName":"India","stateName":"Karnataka","gstNum":"","productName":"GLP Sunking Boom","status":"Delivered","salesExecutive":"Niranjan V","salesExecutiveId":"20"},{"oid":"5708","shopName":"Bairaweshwara Agency","order_total":"14500","order_delivered_date":"29/05/2018 01:21 Tue","creditPeriod":"30","daysOverDue":"28","dueDate":"28/06/2018 01:21 Thu","ownerName":"Gowtham","pendingBalance":"14600","shopNum":"9483455954","shopAddress":"Banakal Town","shopTaluk":"Mudigere","shopDistrict":"Chikmagalur","countryName":"India","stateName":"Karnataka","gstNum":"","productName":"FAI Power Sprayer (Battery cum Manual - 16L), FAI Hand Pressure Garden Sprayer (16L)","status":"Delivered","salesExecutive":"Niranjan V","salesExecutiveId":"20"},{"oid":"5823","shopName":"Bairashwara Traders","order_total":"14700","order_delivered_date":"29/05/2018 23:10 Tue","creditPeriod":"30","daysOverDue":"28","dueDate":"28/06/2018 23:10 Thu","ownerName":"Bharath","pendingBalance":"14700","shopNum":"9482730004","shopAddress":"Jannapura","shopTaluk":"Mudigere","shopDistrict":"Chikmagalur","countryName":"India","stateName":"Karnataka","gstNum":"29BWOPB7030C12Q","productName":"FAI Power Sprayer (Battery cum Manual - 16L)","status":"Delivered","salesExecutive":"Niranjan V","salesExecutiveId":"20"}]
     */

    private boolean success;
    /**
     * oid : 5977
     * shopName : Bhairaweshwara Agency
     * order_total : 15250
     * order_delivered_date : 04/06/2018 04:31 Mon
     * creditPeriod : 30
     * daysOverDue : 22
     * dueDate : 04/07/2018 04:31 Wed
     * ownerName : Deepak
     * pendingBalance : 15250
     * shopNum : 8197775389
     * shopAddress : Handpost
     * shopTaluk : Mudigere
     * shopDistrict : Chikmagalur
     * countryName : India
     * stateName : Karnataka
     * gstNum :
     * productName : FAI Power Sprayer (Petrol Powered - 20L), FAI 4 Stroke Power Sprayer (20L)
     * status : Delivered
     * salesExecutive : Niranjan V
     * salesExecutiveId : 20
     */

    private List<DeliveredOrdersBean> deliveredOrders;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DeliveredOrdersBean> getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(List<DeliveredOrdersBean> deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }

    public static class DeliveredOrdersBean {
        private String oid;
        private String shopName;
        private String order_total;
        private String order_delivered_date;
        private String creditPeriod;
        private String daysOverDue;
        private String dueDate;
        private String ownerName;
        private String pendingBalance;
        private String shopNum;
        private String shopAddress;
        private String shopTaluk;
        private String shopDistrict;
        private String countryName;
        private String stateName;
        private String gstNum;
        private String productName;
        private String status;
        private String salesExecutive;
        private String salesExecutiveId;

        public String getOid() {
            return oid;
        }

        public void setOid(String oid) {
            this.oid = oid;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getOrder_total() {
            return order_total;
        }

        public void setOrder_total(String order_total) {
            this.order_total = order_total;
        }

        public String getOrder_delivered_date() {
            return order_delivered_date;
        }

        public void setOrder_delivered_date(String order_delivered_date) {
            this.order_delivered_date = order_delivered_date;
        }

        public String getCreditPeriod() {
            return creditPeriod;
        }

        public void setCreditPeriod(String creditPeriod) {
            this.creditPeriod = creditPeriod;
        }

        public String getDaysOverDue() {
            return daysOverDue;
        }

        public void setDaysOverDue(String daysOverDue) {
            this.daysOverDue = daysOverDue;
        }

        public String getDueDate() {
            return dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public String getPendingBalance() {
            return pendingBalance;
        }

        public void setPendingBalance(String pendingBalance) {
            this.pendingBalance = pendingBalance;
        }

        public String getShopNum() {
            return shopNum;
        }

        public void setShopNum(String shopNum) {
            this.shopNum = shopNum;
        }

        public String getShopAddress() {
            return shopAddress;
        }

        public void setShopAddress(String shopAddress) {
            this.shopAddress = shopAddress;
        }

        public String getShopTaluk() {
            return shopTaluk;
        }

        public void setShopTaluk(String shopTaluk) {
            this.shopTaluk = shopTaluk;
        }

        public String getShopDistrict() {
            return shopDistrict;
        }

        public void setShopDistrict(String shopDistrict) {
            this.shopDistrict = shopDistrict;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getStateName() {
            return stateName;
        }

        public void setStateName(String stateName) {
            this.stateName = stateName;
        }

        public String getGstNum() {
            return gstNum;
        }

        public void setGstNum(String gstNum) {
            this.gstNum = gstNum;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSalesExecutive() {
            return salesExecutive;
        }

        public void setSalesExecutive(String salesExecutive) {
            this.salesExecutive = salesExecutive;
        }

        public String getSalesExecutiveId() {
            return salesExecutiveId;
        }

        public void setSalesExecutiveId(String salesExecutiveId) {
            this.salesExecutiveId = salesExecutiveId;
        }
    }
}
