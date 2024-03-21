package org.example;

import org.json.JSONObject;

public class PhoneToJSON implements ToJSON {



    public JSONObject toJSON(Object object) {
        Phone phone = (Phone) object;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", phone.getType());
        jsonObject.put("number", phone.getNumber());
        return jsonObject;
    }
}
