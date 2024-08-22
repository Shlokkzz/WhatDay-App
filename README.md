[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/paV3BV1l)
# WhatDay

This simple Android app asks the user for a date in the Gregorian calendar and returns the day of the week for that date.

## Pair Information
- **Name:** Shlok Patel
- **ID:** 2021A7PS2441G
- **Email:** f20212441@goa.bits-pilani.ac.in <br /> <br/>
- **Name:** Suraz Kumar
- **ID:** 2021A7PS1602G
- **Email:** f20211602@goa.bits-pilani.ac.in

## Project Description
The "What Day" app enables users to input a calendar date and see which day of the week it falls on. It includes validation checks to ensure the date entered is valid, and it handles errors such as invalid years, months, or dates by providing specific error messages like "Invalid year," "Invalid month," or "Invalid date."

### Known Bugs
- No known issues at this moment.

## Task Completion Overview

### Task 1: Model Design, Development, and Testing
- **Approach:**
    - Developed the main functionality using the `Calendar` API to calculate the day of the week for valid dates.
    - Added validation to manage incorrect inputs, including dates out of range, non-numeric values, and invalid leap-year dates.
    - The model outputs relevant error messages when the input is not valid.

### Task 2: UI Modification
- **Approach:**
    - Connected the model with the UI, linking the input fields and the button to the model's methods.
    - Implemented the logic to capture user input, send it to the model, and then display either the result or an error message on the screen.

### Task 3: Application Testing
- **Approach:**
    - Adopted a test-driven development approach, starting with the provided test cases and adding more as development advanced.
    - Created additional custom test cases to cover edge cases that were not included in the starter code.
    - Conducted stress testing using the monkey tool to ensure the app’s stability under various conditions.

### Testing
- **Test-Driven Development (TDD):** Yes, TDD was employed. Writing test cases before implementation helped focus on the requirements and catch issues early.
- **Monkey Tool:** The monkey tool was used to simulate random user interactions, which helped identify and address potential crashes.
- **Test Case Results:** All test cases, including edge cases, passed successfully, with no crashes encountered during testing.

## Stats
- **Hours Spent:** Approximately 4 hours
- **Pair Programming Usage Rating:** 4 out of 5
- **Assignment Difficulty Rating:** 6 out of 10

## Optional Additional Activities

### Suggested Improvements
- **New Features:**
    - Add functionality to calculate the number of days between two dates.
    - Include a history log to track previously entered dates and their corresponding days of the week.
    - Implement localization to support various languages and date formats.
- **UI Enhancements:**
    - Incorporate a calendar picker instead of manual input fields for a better user experience.
    - Display the date and day of the week more visually, perhaps on a calendar or in a specially styled area.