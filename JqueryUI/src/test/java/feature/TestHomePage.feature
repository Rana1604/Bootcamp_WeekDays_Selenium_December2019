Feature: JQueryUI
  Background: JQueryUI Home Page
    Given I am in JQueryUI Home Page


    Scenario: ResizeButton
      Given I am resizing the Button
      Then Close the Browser

  Scenario: Image Selection
    Given I am Selecting Image
    Then Close the Browser

#  Scenario: CalenderDatePicker
#    Given I am Selecting Date from Calender
#    Then Close the Browser

#  Scenario: Drop Down
#    Given I am Selecting DropDown
#    Then Close the Browser
#
  Scenario: Right Click on Mouse
    Given I am Right Clicking on Mouse
    Then Close the Browser

#  Scenario: Hover Contribute Tab
#    Given I am Doing HoverContributeTab
#    Then Close the Browser
#
#  Scenario: PopUp Handling
#    Given I am Doing PopUp Handling
#    Then Close the Browser

  Scenario: Drag And Drop Handling
    Given I am Doing PDrag And Drop Handling
    Then Close the Browser