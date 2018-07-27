package com.example.appmomos.recyclerviewusingapi;

import org.json.JSONException;
import org.json.JSONObject;

public class RequestJsonBody
{

    static JSONObject getOwnerDetails(String salesExecutiveId)
    {
        JSONObject object = new JSONObject();

        try
        {
            object.put("salesExecutiveId",salesExecutiveId);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }


        return object;
    }








































   /* public static JSONObject addOrderStatusHistory(String oid, String date_created, String status, String uniqueOrderId)
    {
        JSONObject object = new JSONObject();
        try
        {
            object.put("oid",oid);
            object.put("date_created",date_created);
            object.put("status",status);
            object.put("uniqueOrderId",uniqueOrderId);

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return object;
    }
*/

    public static JSONObject getSectors()
    {
        return new JSONObject();
    }

}
