# Palindromic Word Checker (Java)

This Java application checks whether a given word is a **palindrome**. A palindrome is a word that reads the same forward and backward (e.g., `kayak`, `abba`, `12321`).

## 🧠 Data Structures Used

The program uses two custom data structures:

- **Stack**: To reverse the word.
- **Queue**: To keep the word in its original order.

Both are implemented using a singly linked list with a custom `Node` class.

## 🚀 How It Works

1. The user inputs a word.
2. Each character is inserted into both the Stack and the Queue.
3. Characters are popped from the Stack and dequeued from the Queue simultaneously and compared.
4. If all characters match, the word is a palindrome.

## 📂 Project Structure

- `Main.java`: Entry point of the application.
- `StackList.java`: Stack implementation using linked list.
- `QueueList.java`: Queue implementation using linked list.
- `Node.java`: Node structure used in both Stack and Queue.

## 💡 Example

Enter a word:
abba
abba is a palindrome.

Copy
Edit
Enter a word:
furkan
furkan is not a palindrome.


## 🛠 Requirements

- Java 8 or above
- IntelliJ IDEA (or any Java IDE)
- Terminal or Command Line

## 📄 License

This project is licensed under the MIT License. Feel free to use, modify, and share it.
