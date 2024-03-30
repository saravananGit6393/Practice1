Feature: Verifying EAIAS Website ContactUs Module Automation

  @Scenario1
  Scenario Outline: Verifying contactus page is working or not
    Given User is on the homepage
    When User is on the contactus page
    And User enters given input fields "<title>","<name>","<companyName>","<jobTitle>","<country>", and "<phNo>"
    Then User should verify success msg or failed msg after enter send "Contact us coloumn is working fine" and "Contact us coloumn is not working"

    Examples: 
      | title | name | companyName | jobTitle | country | phNo       |
      | Mr    | ABC  | IASEAS      | Tester   | India   | 9876543210 |
