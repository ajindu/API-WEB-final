Feature: API Automation Test

  @api
  Scenario: test get list user normal
    Given prepare url for "GET_LIST_USERS"
    And hit api get list users
    Then validation status code is equals 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal.json"

  @api
  Scenario: Test get user by id
    Given prepare url for "GET_USER_BY_ID"
    And hit api get user by id "7567331"
    Then validation status code is equals 200
    Then validation response body get user by id

  @api
  Scenario: Test get user by invalid id
    Given prepare url for "GET_USER_BY_ID"
    And hit api get user by id "99999999"
    Then validation status code is equals 404

  @api
  Scenario: Test create new user
    Given prepare url for "CREATE_NEW_USER"
    And hit api post create new user
    Then validation status code is equals 201
    Then validation response body post create new user
    Then validation response json with JSONSchema "post_create_new_user_normal.json"

  @api
  Scenario: Test update user normal
    Given prepare url for "CREATE_NEW_USER"
    And hit api post create new user
    Then validation status code is equals 201
    Then validation response body post create new user
    And hit api update data
    Then validation status code is equals 200
    Then validation response body update user

  @api
  Scenario: Test delete user normal
    Given prepare url for "CREATE_NEW_USER"
    And hit api post create new user
    Then validation status code is equals 201
    Then validation response body post create new user
    And hit api delete new
    Then validation status code is equals 204

  @api
  Scenario: Test delete user by id
    Given prepare url for "DELETE_USER"
    And hit api delete user by id "7567887"
    Then validation status code is equals 204

  @api
  Scenario: Test delete user by invalid id
    Given prepare url for "DELETE_USER"
    And hit api delete user by id "7567887"
    Then validation status code is equals 404

  @api
  Scenario: Test create user with invalid status
    Given prepare url for "CREATE_NEW_USER"
    And hit api post create new user with invalid status
    Then validation status code is equals 422

  @api
  Scenario: Search user by valid name query
    Given prepare url for "SEARCH_USER"
    And hit api search user by name "pentung"
    Then validation status code is equals 200
    Then validation response body search user by name

  @api
  Scenario: Search user by invalid name query
    Given prepare url for "SEARCH_USER"
    And hit api search user by name "afgan"
    Then validation status code is equals 200

  @api
  Scenario: Search user by gender is male
    Given prepare url for "SEARCH_USER"
    And hit api search user by gender "male"
    Then validation status code is equals 200
    Then validation response body search user by gender

  @api
  Scenario: Search user by gender is female
    Given prepare url for "SEARCH_USER"
    And hit api search user by gender "female"
    Then validation status code is equals 200
    Then validation response body search user by gender

  @api
  Scenario: Search user by status is active
    Given prepare url for "SEARCH_USER"
    And hit api search user by status "active"
    Then validation status code is equals 200
    Then validation response body search user by status

  @api
  Scenario: Search user by status is inactive
    Given prepare url for "SEARCH_USER"
    And hit api search user by status "inactive"
    Then validation status code is equals 200
    Then validation response body search user by status






