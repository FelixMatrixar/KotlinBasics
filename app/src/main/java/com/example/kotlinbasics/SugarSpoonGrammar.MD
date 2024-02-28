# Problem: Coffee Preparation in Kotlin

**Objective:**
Enhance the `makeCoffee` function in Kotlin to handle different sugar counts.

**Instructions:**

### 1. Step 1: Adding the Basic If Condition:
- Inside the `makeCoffee` function, start by adding an `if` condition to check if `sugarCount` is equal to 1.
- Don't worry about adding any code inside the `if` block just yet.

> *Hint: The condition should be `if (sugarCount == 1)`.*

### 2. Step 2: Adjusting the Print Statement for '1 Spoon':
- Within the `if` block you just created, add a `println` statement that prints "Coffee with 1 spoon of sugar".

### 3. Step 3: Adding the Else Block:
- After your `if` block, add an `else` block. This will handle cases where the sugar count isn't 1.

### 4. Step 4: Adjusting the Print Statement for Other Cases:
- Inside your `else` block, add a `println` statement that uses the original message: "Coffee with $sugarCount spoons of sugar".

### 5. Step 5: Testing the Function:
- Within the `main` function, add a few more test cases.
- Try testing with values like 0 and a negative number to ensure your function works for all scenarios.

**Final Step:**
You have successfully enhanced the `makeCoffee` function to handle different sugar counts. Test the function with various scenarios to ensure its correctness and robustness.

# Problem: Enhanced Coffee Preparation in Kotlin

**Objective:**
Modify the `makeCoffee` function in Kotlin to accept additional parameters and handle special cases.

**Instructions:**

### 1. Step 1: Define the Function with Parameters:
- Remember, our goal is to know who the coffee is for. Modify the function to accept another parameter, `name`.
- In your `makeCoffee` function, add a parameter named `name` of type `String`.
- Ensure that the function can now accept two parameters: the `name` and the sugar count.

### 2. Step 2: Modify the Print Statement:
- Enhance the print statement inside the `makeCoffee` function so it prints the name of the person for whom the coffee is made.
- Your output should look something like this: "Coffee with 2 spoons of sugar for Jimmy."

### 3. Step 3: Handle Special Cases:
- Modify the print statement to handle the case when the sugar count is 0. In such a case, it should print "Coffee with no sugar for [Name]."
- Also, add the condition to check when there's only one spoon, it should print "spoon" instead of "spoons."

### 4. Step 4: Test your Function:
- Now, let's test our modified function.
- Call the `makeCoffee` function multiple times with different names and sugar counts.
- Ensure that it works for all scenarios, including 0, 1, and multiple spoons of sugar.

**Final Step:**
You have successfully modified the `makeCoffee` function to accept additional parameters and handle special cases. Test the function thoroughly to ensure its correctness and robustness.
