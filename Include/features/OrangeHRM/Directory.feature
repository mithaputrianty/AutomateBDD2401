Feature: Directory

Background:
    Given User Already Login
  
  @tag
  Scenario Outline: Search Directory using various input 
    Given User click Menu Directory
    When User input name <Name>
    And User select job title
    And User select location 
    And User click button Search
    Then User successfully search employee directory
    And Show search result on table

    @valid
    Examples: Valid Data
      | Name    	     |
      | Step			     |
      #| Fiona Grace    |

    #@invalid
    #Examples: Invalid Data
      #| Name    	     | Job Title | Location |
      #| Otong 1        | All       | All	    |
      #| Otong 2        | All       | All	    |