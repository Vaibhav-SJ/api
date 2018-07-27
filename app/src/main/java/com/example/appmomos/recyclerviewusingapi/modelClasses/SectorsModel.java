package com.example.appmomos.recyclerviewusingapi.modelClasses;

import java.util.List;

public class SectorsModel
{

    /**
     * success : true
     * productSectors : [{"id":"1","date_created":"2015-09-12 05:56:42","date_updated":"2015-09-14 10:51:10","name":"Solar Lantern"},{"id":"2","date_created":"2015-09-14 10:51:00","date_updated":"2017-07-31 10:02:50","name":"Agriculture"},{"id":"3","date_created":"2015-09-14 10:51:21","date_updated":"2015-09-14 10:51:21","name":"Battery"},{"id":"4","date_created":"2015-09-14 10:51:29","date_updated":"2015-09-14 10:51:29","name":"Battery Charger"},{"id":"5","date_created":"2015-09-14 10:51:40","date_updated":"2015-09-14 10:51:40","name":"Cookstove"},{"id":"6","date_created":"2015-09-14 10:51:48","date_updated":"2015-09-14 10:51:48","name":"Fan"},{"id":"7","date_created":"2015-09-14 10:51:57","date_updated":"2015-09-14 10:51:57","name":"Gadget"},{"id":"8","date_created":"2015-09-14 10:52:06","date_updated":"2015-09-14 10:52:06","name":"Solar Home Lighting"},{"id":"9","date_created":"2015-09-14 10:52:16","date_updated":"2015-09-14 10:52:16","name":"Solar UPS"},{"id":"10","date_created":"2015-09-14 10:52:25","date_updated":"2015-09-14 10:52:25","name":"Speakers"},{"id":"11","date_created":"2015-09-14 10:52:36","date_updated":"2015-09-14 10:52:36","name":"Tablet PC"},{"id":"12","date_created":"2015-09-14 10:52:56","date_updated":"2015-09-14 10:52:56","name":"Torchlight"},{"id":"13","date_created":"2015-09-14 10:53:27","date_updated":"2015-09-14 10:53:27","name":"Transport"},{"id":"14","date_created":"2015-09-14 10:53:34","date_updated":"2015-09-14 10:53:34","name":"Water Filter"},{"id":"15","date_created":"2015-09-14 10:53:44","date_updated":"2015-09-14 10:53:44","name":"Water Pump"},{"id":"16","date_created":"2015-09-14 10:53:52","date_updated":"2015-09-14 10:53:52","name":"Health"},{"id":"17","date_created":"2015-09-14 10:54:04","date_updated":"2015-09-14 10:54:04","name":"Electric Cycle"},{"id":"18","date_created":"2015-09-14 10:54:12","date_updated":"2015-09-14 10:54:12","name":"Cookware"},{"id":"19","date_created":"2015-09-14 10:54:21","date_updated":"2015-09-14 10:54:21","name":"Smart Phone"},{"id":"20","date_created":"2015-09-14 10:54:31","date_updated":"2015-09-14 10:54:31","name":"Computer - Desktop"},{"id":"21","date_created":"2015-09-14 10:54:39","date_updated":"2015-09-14 10:54:39","name":"Computer - Laptop"},{"id":"22","date_created":"2015-09-14 10:54:49","date_updated":"2015-09-14 10:54:49","name":"Room Cooler"},{"id":"23","date_created":"2015-09-14 10:54:58","date_updated":"2015-09-14 10:54:58","name":"Room Heater"},{"id":"24","date_created":"2015-09-14 10:55:11","date_updated":"2015-09-14 10:55:11","name":"Cooler (Refrigeration)"},{"id":"25","date_created":"2015-09-14 10:55:21","date_updated":"2015-09-14 10:55:21","name":"Helmet"},{"id":"26","date_created":"2015-09-14 10:55:33","date_updated":"2015-09-14 10:55:33","name":"Replacement Parts"},{"id":"27","date_created":"2016-02-12 09:14:11","date_updated":"2016-02-12 09:14:11","name":"Household Appliances"},{"id":"28","date_created":"2016-02-15 05:42:19","date_updated":"2016-02-15 05:42:19","name":"Kitchen Tools"},{"id":"29","date_created":"2016-04-07 10:30:42","date_updated":"2016-04-07 10:30:42","name":"Test Sector"},{"id":"30","date_created":"2018-01-08 01:54:29","date_updated":"2018-01-08 01:54:29","name":"Rechargable Light"},{"id":"31","date_created":"2018-04-09 12:21:43","date_updated":"2018-04-09 12:21:43","name":"Head Torch"}]
     */

    private boolean success;
    /**
     * id : 1
     * date_created : 2015-09-12 05:56:42
     * date_updated : 2015-09-14 10:51:10
     * name : Solar Lantern
     */

    private List<ProductSectorsBean> productSectors;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ProductSectorsBean> getProductSectors() {
        return productSectors;
    }

    public void setProductSectors(List<ProductSectorsBean> productSectors) {
        this.productSectors = productSectors;
    }

    public static class ProductSectorsBean {
        private String id;
        private String date_created;
        private String date_updated;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDate_created() {
            return date_created;
        }

        public void setDate_created(String date_created) {
            this.date_created = date_created;
        }

        public String getDate_updated() {
            return date_updated;
        }

        public void setDate_updated(String date_updated) {
            this.date_updated = date_updated;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
