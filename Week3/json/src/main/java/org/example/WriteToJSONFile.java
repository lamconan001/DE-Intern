package org.example;
import org.json.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WriteToJSONFile {

    public static void main(String[] args) throws IOException {
        List<Phone> phones1 = new ArrayList<Phone>();
        phones1.add(new Phone("Apple", "1234567890"));
        phones1.add(new Phone("Apple", "1234567890"));

        List<Phone> phones2 = new ArrayList<Phone>();
        phones2.add(new Phone("Oppo", "0964803299"));
        phones2.add(new Phone("Nokia", "0989539860"));

        Address address1 = new Address("Le Van Luong", "Ha Noi", "84");
        Address address2 = new Address("Tran Phu", "Ha Noi", "83");

        Person person1 = new Person("Binh", 20, address1, phones1);
        Person person2 = new Person("Lam", 22, address2, phones2);

        JSONArray jsonArray = new JSONArray();
        PersonToJSON personToJSON = new PersonToJSON();
        jsonArray.put(personToJSON.toJSON(person1));
        jsonArray.put(personToJSON.toJSON(person2));
        System.out.println(jsonArray.toString(4));

        FileWriter fileWriter = null;
        try {
            // Tạo và mở một file
            fileWriter = new FileWriter("output.json");

            // Chuyển đổi JSONObject thành String và ghi vào file
            fileWriter.write(jsonArray.toString(4)); // Định dạng chuỗi JSON với 4 khoảng trắng indent

            System.out.println("JSON Object successfully written to the file!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng fileWriter sau khi sử dụng để tránh rò rỉ tài nguyên
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}