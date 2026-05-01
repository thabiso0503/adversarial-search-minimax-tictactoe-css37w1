# 🧠 Tic-Tac-Toe AI using MiniMax Algorithm (Java + GUI)

This repository contains a **Java implementation** of the MiniMax algorithm applied to a classic Tic-Tac-Toe game, enhanced with a **Graphical User Interface (GUI)** using Java Swing.

The project demonstrates how **adversarial search** is used in Artificial Intelligence to make optimal decisions in competitive environments.

---

# 📌 Project Overview

| Field | Detail |
|------|--------|
| Module | Artificial Intelligence |
| Objective | Develop an intelligent Tic-Tac-Toe agent using the MiniMax algorithm |
| Language | Java |
| Interface | Java Swing (GUI) |
| Key Concepts | Adversarial search, recursion, game trees, decision-making |

---

# 🎮 Problem Definition

The system implements a standard **3×3 Tic-Tac-Toe game** where a human player competes against an AI agent.

### Game Rules:
- The board is a 3×3 grid  
- Player uses **X**  
- AI uses **O**  
- A win occurs when a player places three symbols in a straight line:
  - Row  
  - Column  
  - Diagonal  

---

⚙️ Algorithm Implemented

MiniMax Algorithm

**Strategy:**  
The algorithm simulates all possible future game states and selects the move that maximizes the AI’s chances of winning while minimizing the opponent’s chances.

### Core Idea:
- AI tries to **maximize** the score  
- Player tries to **minimize** the score  

### Scoring System:
- AI win → `+1`  
- Player win → `-1`  
- Draw → `0`  

---

## 🔁 Game Execution Flow

- Initialize empty board  
- Player clicks a cell (GUI interaction)  
- Update board with player move  
- Check for WIN / LOSE / DRAW  
- AI computes best move using MiniMax  
- Update board and GUI  
- Repeat until game ends  

---

## 🧠 Key Components

### 1. `Minimax.java`
- Implements the recursive MiniMax algorithm  
- Explores all possible game states  
- Returns the optimal score  

### 2. `AIPlayer.java`
- Uses MiniMax to determine the best move  
- Ensures optimal decision-making  

### 3. `GameState.java`
- Evaluates the board state  
- Determines:
  - WIN  
  - LOSE  
  - DRAW  

### 4. `Board.java`
- Manages the game board  
- Handles player moves  
- Provides board utilities  

### 5. `TicTacToeGUI.java`
- Implements the graphical interface using Java Swing  
- Handles user interaction (button clicks)  
- Updates the display dynamically  

### 6. `Main.java`
- Entry point of the application  
- Launches the GUI  

---

## 📊 System Behaviour

| Feature | Description |
|--------|------------|
| Decision Strategy | Optimal (AI never loses) |
| Data Structure | 2D Array |
| Search Type | Adversarial Search |
| Algorithm Type | Recursive |
| Interface | Event-driven GUI |

---

## ⏱️ Time Complexity Analysis

The MiniMax algorithm has exponential time complexity:
O(b^d)

### Interpretation:
- Explores all possible game states  
- Guarantees optimal decision-making  
- Computationally expensive  

### Why it's acceptable:
- Small state space  
- Runs efficiently in Tic-Tac-Toe  

---

## 🎮 User Interface

- 3×3 interactive grid using buttons  
- Player clicks to place **X**  
- AI responds instantly with **O**  
- Popup message displays:
  - WIN  
  - LOSE  
  - DRAW  

---

## 📝 Findings

- MiniMax ensures optimal moves  
- Recursion explores all possibilities  
- AI never loses  
- Exponential complexity is manageable  
- GUI improves usability  



## 🧱 Board Representation

```java
char[][] board = {
    {' ', ' ', ' '},
    {' ', ' ', ' '},
    {' ', ' ', ' '}
};



