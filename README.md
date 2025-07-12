# 🎯 Java Number Guessing Game
A fun and interactive **console-based number guessing game** built in Java.  
Build a game where the computer picks a random number between 1 and 100, and the player has to guess it within 7 attempts.  
The game provides smart hints like "Too high", "Too low", or "Very close!" to guide the player.  
A score is calculated based on how quickly the number is guessed.

---

## 💡 Features
- Random number generation (1–100)
- Limited to 7 attempts
- Smart hints:
  - Too Low
  - Too High
  - Very Close (±5 range)
- Score out of 100
- Replay option after each game
- Input validation for a smoother experience

---

## 🧪 Sample Gameplay

🎯 Welcome to the Number Guessing Game!
Guess a number between 1 and 100. You have 7 attempts.

Enter your guess: 40
Too low!
Enter your guess: 80
Too high!
Enter your guess: 77
You're very close!
Too high!
Enter your guess: 74
Congratulations! You guessed the number in 4 attempts.
Your score: 70/100

Do you want to play again? (yes/no): no
Thanks for playing! Goodbye!

````

## 🛠️ Technologies Used
- Java (Core)
- Scanner class for input
- Random class for number generation
- Basic logic, loops, and conditionals

## 🚀 How to Run
1. Clone this repository:
   ```
   git clone https://github.com/your-username/Java-Number-Guessing-Game.git
````
2. Compile the program:
   ```
   javac NumberGuessingGame.java
   ```
3. Run the program:
   ```
   java NumberGuessingGame
   ```
---
## 📁 File Structure
```
📦Java-Number-Guessing-Game
 └── 📄 NumberGuessingGame.java
 └── 📄 README.md
```
