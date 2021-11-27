# Autor: Juan


@HU
Feature: the user wants to make a purchase from the application
  Scenario: User wants to buy a dress

    Given  the user is on the main page

    When user logs in
    |email            |password|
    |juanra@correo.com|123456  |

    And choose the preferred dress

    Then confirm the purchase so that it can be sent to your address
    |confirmation      |
    |Order confirmation|





