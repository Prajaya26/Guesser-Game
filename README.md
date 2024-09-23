Guesser Game
Overview
Guesser Game is a simple console-based game built using Java. The game involves a computer randomly selecting a number, which the player must guess within three attempts. After each guess, the computer provides feedback on whether the player should guess higher or lower. The player wins the game if they guess the correct number.

How to Play
The computer will randomly select a number from a predefined range (e.g., 1 to 100).
The player will have three chances to guess the number.
After each guess, the computer will respond with:
"Guess Higher" if the guessed number is lower than the target.
"Guess Lower" if the guessed number is higher than the target.
If the player guesses the number correctly, they win the game. Otherwise, after three incorrect guesses, the player loses, and the correct number will be revealed.
Java Concepts Used

This project demonstrates several key Java programming concepts:
1.Object-Oriented Programming (OOP): The game is structured using classes and objects, following OOP principles such as encapsulation and abstraction. The game logic is divided into multiple classes, making it modular and easy to understand.
2.Packages: The project is organized into two packages:
3.com.solution.Game: Contains the core game logic, rules, and helper methods.
4.com.solution.Main: Contains the Test class, which runs the game by starting the Game class from com.solution.Game.

Class and Methods: The game logic is divided into different classes, each handling specific parts of the game:
1)Game Class: Manages the main game loop, giving the player three chances to guess the number. A for loop is used here to control the number of attempts.
2)Computer Class: Uses the Random function to generate the computer's choice, and the comp() method returns the randomly chosen number.
3)Player Class: Handles user input using the Scanner class. The playerguess() method is used to capture the player's guess and return it for further processing.
4)Rules Class: Contains the logic to compare the choices of the computer and the player, and provides feedback (whether the player should guess higher or lower).
5)Random Number Generation: The game uses the java.util.Random class to generate a random number for the computer's guess.

*Control Structures: The game uses a for loop to control the number of attempts and if-else conditions to provide feedback to the player based on the comparison of the guesses.
*Input Handling: The Scanner class is used to capture player input from the console.

Project Structure
The project is organized into two packages:

com.solution.Game: This package contains all the classes that manage the game logic and rules:
1)Game Class: This class contains the main game loop, giving the player three chances to guess the correct number. The guesses from the player and computer are handled within this class.
2)Computer Class: Responsible for generating the computer's random choice using the Random class. The choice is generated and returned via the comp() method.
3)Player Class: Manages player input. The playerguess() method captures the player's guess using the Scanner class and returns it for comparison.
4)Rules Class: Contains the logic to compare the player's guess with the computer's number. It provides feedback to guide the player (whether to guess higher or lower).

com.solution.Main: This package contains the class that initiates and runs the game.
1)Test Class: The Test class has the main() method, which is the entry point for the game. It creates an object of the Game class from the com.solution.Game package and calls the start() method to begin the game execution.


Example Structure:
src/
  com/
    solution/
      Game/
        Game.java       // Contains the main game loop and logic
        Computer.java   // Generates the random number for the computer
        Player.java     // Handles user input
        Rules.java      // Contains the rules to compare guesses and give feedback
      Main/
        Test.java       // Main class to run the game

Contributions: 
Feel free to contribute to the game by forking the repository and submitting pull requests.


