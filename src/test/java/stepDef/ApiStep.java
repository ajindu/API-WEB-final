package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pages.ApiPage;

public class ApiStep {
    ApiPage apiPage;
    Response res;

    public ApiStep(){
        this.apiPage = new ApiPage();
    }


    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCodeIsEquals(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUser();
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyCreateUser();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateUser();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteUser();
    }

    @And("hit api post create new user with invalid status")
    public void hitApiPostCreateNewUserWithInvalidStatus() {
        apiPage.hitApiPostCreateUserInvalidStatus();
    }

    @And("hit api get user by id {string}")
    public void hitApiGetUserById(String userId) {
        apiPage.hitApiGetUserById(userId);
    }

    @Then("validation response body get user by id")
    public void validationResponseBodyGetUserById() {
        apiPage.validationResponseBodyGetUserById();
    }

    @And("hit api search user by name {string}")
    public void hitApiSearchUserByName(String name) {
        apiPage.hitApiSearchUserByName(name);
    }

    @Then("validation response body search user by name")
    public void validationResponseBodySearchUserByName() {
        apiPage.validationResponseBodySearchUserByName();
    }

    @And("hit api search user by gender {string}")
    public void hitApiSearchUserByGender(String gender) {
        apiPage.hitApiSearchUserByGender(gender);
    }

    @Then("validation response body search user by gender")
    public void validationResponseBodySearchUserByGender() {
        apiPage.validationResponseBodySearchUserByGender();
    }

    @And("hit api search user by status {string}")
    public void hitApiSearchUserByStatus(String status) {
        apiPage.hitApiSearchUserByStatus(status);
    }

    @Then("validation response body search user by status")
    public void validationResponseBodySearchUserByStatus() {
        apiPage.validationResponseBodySearchUserByStatus();
    }

    @And("hit api delete user by id {string}")
    public void hitApiDeleteUserById(String userId) {
        apiPage.hitApiDeleteUserById(userId);
    }
}
