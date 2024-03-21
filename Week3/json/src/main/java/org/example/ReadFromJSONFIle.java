package org.example;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromJSONFIle {
    public static void main(String[] args) {
        try {
            // Đọc nội dung file vào một chuỗi
            String content = new String(Files.readAllBytes(Paths.get("output.json")));

            // Tạo một đối tượng JSON từ chuỗi
            JSONArray people = new JSONArray(content);
            for (int i = 0; i < people.length(); i++)
            {
                JSONObject person = people.getJSONObject(i);
                System.out.println("name: " + person.getString("name"));
                System.out.println("age: " + person.getInt("age"));

                JSONObject address = person.getJSONObject("address");
                System.out.println("address: " + address.getString("street") + " " +
                        address.getString("city") + " " + address.getString("zip"));

                JSONArray phones = person.getJSONArray("phones");
                for (int j = 0; j < phones.length(); j++) {
                    JSONObject phone = phones.getJSONObject(j);
                    System.out.println("phone: " + phone.getString("type") + " " + phone.getString("number"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
