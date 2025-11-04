#  Software Engineering Katas

This repository contains the **practice exercises (Katas)** developed for the *Software Engineering* course.  
Each Kata focuses on strengthening fundamental software development skills, emphasizing automation, professional tool usage, clean code, and version control with Git.

---


##  Completed Katas

### 🥋 Kata 1 — Workflow with IntelliJ IDEA and Git
**Goal:**  
Use **IntelliJ IDEA** and **Git** to develop an efficient Java project workflow, maximizing the use of keyboard shortcuts and minimizing mouse interaction.

**Main tasks:**
- Create a new Java project in IntelliJ IDEA.  
- Initialize a Git repository in the project directory.  
- Learn and use essential keyboard shortcuts for file creation, navigation, and project management.  
- Perform frequent commits with descriptive messages to document project progress.  
- Focus on efficiency and productivity within the IDE.

---

### 🥋 Kata 2 — Loading a Dataset into Memory with Immutable Objects
**Goal:**  
Develop a program that loads at least one dataset into memory, representing each record as an **immutable object** and each column as an attribute of that object.

**Main tasks:**
- Design an immutable class that represents one record of the dataset.  
- Implement basic methods such as constructors, getters, and `toString()`.  
- Read the dataset file (CSV, TSV, Excel, JSON, etc.).  
- For each record, create an object of the designed class and assign its attribute values.  
- Practice object-oriented modeling and basic data processing.

---

### 🥋 Kata 3 — In-Memory Histogram with Dependency Injection
**Goal:**  
Generate a histogram in memory over a selected attribute of the loaded objects using **dependency injection** (lambda or method reference) and a simple **Histogram** view model.

**Main tasks:**
- Use a function to convert each record into a **bin** (e.g., decade computed from `year`).  
- Implement a lightweight `Histogram` view model that stores frequencies in a `Map` and allows increment (`put`) and querying (`count`).  
- Build the histogram from the loaded collection using a `HistogramBuilder` that applies the injected function to each object.  
- Print the results by iterating over the bins and showing `bin: frequency`.

---

## 🛠️ Technologies Used
- **Language:** Java  
- **IDE:** IntelliJ IDEA  
- **Version Control:** Git / GitHub  

---

## 👨‍💻 Author
**Raul Reguera Bravo**  
Computer Science Student — USAL / ULPGC 
