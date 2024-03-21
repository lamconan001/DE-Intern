package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class PersonToJSON implements ToJSON{
    @Override
    public JSONObject toJSON(Object object) {
        Person person;
        person = (Person) object;
        JSONObject personObject = new JSONObject();
        personObject.put("name", person.getName());
        personObject.put("age", person.getAge());
        personObject.put("address", new AddressToJSON().toJSON(person.getAddress()));
        JSONArray phones = new JSONArray();
        for (Phone phone: person.getPhones()) {
            phones.put(new PhoneToJSON().toJSON(phone));
        }
        personObject.put("phones", phones);
        return personObject;
    }
}
