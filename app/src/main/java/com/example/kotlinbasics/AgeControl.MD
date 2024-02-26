# Problem: Age Control in Kotlin

**Objective:**
Create a Kotlin file named "AgeControl.kt" to implement age verification and control logic.

**Instructions:**

### 1. Setting up the Playground:
- Start by creating a new Kotlin file named "AgeControl.kt."
- Ensure that there is no existing code.

### 2. Step 1: Basic Age Verification:
- Prompt the user to enter their age using `print("Enter your age as a whole number: ")`.
- Store the entered age as an `Int` variable named `age`.
- Use an `if` statement to check if the age is greater than or equal to 18. If true, print "You can enter the club."

### 3. Step 2: Incorporating "else if":
- Extend your `if` statement to include an `else if` condition to check if the age is greater than or equal to 40.
- If this condition is met, print "You cannot go into the club, please go home."

> *Hint: Always remember the sequence matters! Code is executed from top to bottom.*

### 4. Step 3: Adding an "else" Clause:
- Conclude your "if-else if" chain by adding an `else` clause.
- In this clause, print "Age not verified. Please contact support."

### 5. Step 4: Combining Conditions:
- Update your initial `if` condition to check two things:
    - The age is greater than or equal to 18.
    - The age is less than 40.
- Use the `&&` operator to combine these conditions.

> *Hint: Use the && operator to combine these conditions.*

### 6. Step 5: Using Range Checks:
- Refactor your code to replace the combined conditions from Step 4 with a range check.
- Use the `in` keyword to check if the age is within the range of 18 to 39 (inclusive).

> *Hint: The syntax for a range is startValue..endValue.*

**Final Step:**
You have successfully implemented age verification and control logic in Kotlin. Observe the different messages based on the user's age and enhance your understanding of conditional statements and range checks.
