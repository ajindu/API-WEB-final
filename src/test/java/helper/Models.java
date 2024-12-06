package helper;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders() {

        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer 8ebd68e3a47532676e8c6aaf6cfecc2a3ba3f56febdb4327ee8e8e052ca198ff");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint) {
        String name = "mamamia";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response postCreateUserInvalidStatus(String endpoint) {
        String name = "Zee";
        String gender = "female";
        String email = generateRandomEmail();
        String status = "aktif";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response updateUser(String endpoint, String user_id){
        setupHeaders();

        String name = "pentung";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);


        String finalEndpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }
    public static Response deleteUser(String endpoint, String user_id){
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }
    public static Response getUserById(String endpoint, String user_id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().get(finalEndpoint);
    }
    public static Response searchUserByName(String endpoint, String name) {
        setupHeaders();
        String finalEndpoint = endpoint + "?name=" + name;
        return request.when().get(finalEndpoint);
    }
    public static Response searchUserByGender(String endpoint, String gender) {
        setupHeaders();
        String finalEndpoint = endpoint + "?gender=" + gender;
        return request.when().get(finalEndpoint);
    }
    public static Response searchUserByStatus(String endpoint, String status) {
        setupHeaders();
        String finalEndpoint = endpoint + "?status=" + status;
        return request.when().get(finalEndpoint);
    }



}

