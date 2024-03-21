package org.example;

import org.json.JSONObject;

public class AddressToJSON implements ToJSON {

    @Override
    public JSONObject toJSON(Object object) {
        Address address = (Address)object;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("street", address.getStreet());
        jsonObject.put("city", address.getCity());
        jsonObject.put("zip", address.getZip());
        return jsonObject;
    }
}
