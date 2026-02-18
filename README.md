# Java Learning Roadmap

## Current Skill Assessment

Based on the projects in this repository, the following concepts are already understood:

- Variables and primitive types (`int`, `float`, `char`, `String`)
- User input with `Scanner` and console output
- Conditional logic (`if`, `else if`, `else`)
- Loops (`for`, `while`)
- Static and instance methods, return types, and parameters
- Multiple classes working together, basic constructors
- Exception handling (`try/catch`, `throws`)
- Standard library usage (`Random`, `Math`, `StringBuilder`, `LocalDate`)
- Method overloading
- Type casting

---

## Roadmap

### Phase 1 - Solidifying the Basics (Weeks 1-2)

Small projects that are a natural next step from what is already working here. No new concepts required.

| Project | What It Builds |
|---|---|
| Number Guessing Game | Random number generation, loops, user input, attempt counting, higher/lower hints |
| Simple Calculator | Menu loop, switch statements, storing and displaying a running history of calculations |
| Grade Tracker | Accept multiple student marks, calculate average, assign letter grade, reject invalid input |

---

### Phase 2 - Object-Oriented Programming (Weeks 3-4)

Introduces collections and more structured class design. The jump from writing individual classes to designing systems of classes.

| Project | What It Builds |
|---|---|
| Contact Book | A `Contact` class, `ArrayList` to store contacts, add/search/delete/list operations |
| Bank Account Simulator | An `Account` class with deposit, withdraw, balance check, and overdraft protection |
| Student Records | Multiple `Student` objects in an `ArrayList`, sort by grade, filter by pass/fail |

**Core Concepts:**
- `ArrayList<T>` for storing dynamic lists of objects
- Iterating collections with `for-each` loops
- Encapsulation: private fields with public getters and setters
- `toString()` method override for printing objects

**Resources:**
- Oracle Java Docs: `java.util.ArrayList`
- *Head First Java* (Kathy Sierra) - Chapters 4-6

---

### Phase 3 - File Input and Output (Weeks 5-6)

Introduces reading and writing data to disk so programs can persist information between runs.

| Project | What It Builds |
|---|---|
| Simple Text Logger | Write timestamped log entries to a file, read and display the log |
| Notes App | Save, load, list, and delete notes stored in a plain text file |
| Caesar Cipher | Encrypt and decrypt a string using a shift key, save output to a file |

**Core Concepts:**
- `FileWriter` and `BufferedWriter` for writing to files
- `FileReader` and `BufferedReader` for reading from files
- `IOException` and why file operations require it
- Appending vs overwriting a file

**Resources:**
- Oracle Java Docs: `java.io` package
- Baeldung: "Java FileWriter" and "BufferedReader" articles (free, clear examples)

**Knowledge Required:**
- How files are represented as streams of bytes
- The difference between character streams and byte streams
- Basic understanding of file paths (relative vs absolute)

---

### Phase 4 - Cybersecurity-Relevant Projects (Weeks 7-9)

These are directly applicable to the cybersecurity pathway and will introduce Java's built-in security libraries and basic networking.

| Project | What It Builds |
|---|---|
| Hashing Tool | Input a string, output its MD5 and SHA-256 hash; compare two hashes |
| Brute Force Timer | Simulate brute force on a short PIN or password, calculate and display time taken |
| Caesar Cipher Breaker | Attempt all 26 shifts on a ciphertext and display the most readable result |

**Core Concepts:**
- `java.security.MessageDigest` for hashing
- Converting byte arrays to hex strings
- Why hashing is one-way and what collision resistance means
- How brute force time scales with password length and character set size

**Resources:**
- Oracle Java Docs: `java.security.MessageDigest`
- OWASP: Password Storage Cheat Sheet (understand *why* hashing matters)
- Computerphile on YouTube: "How NOT to Store Passwords" and "SHA-256 Hashing"

**Knowledge Required:**
- Difference between encoding, encryption, and hashing
- Hexadecimal notation
- Basic understanding of character sets and entropy

---

### Phase 5 - Intermediate OOP and Data Structures (Weeks 10-12)

Introduces inheritance, interfaces, and more complex data structures. This phase is a significant step up and may require more time.

| Project | What It Builds |
|---|---|
| Text-Based RPG | Multiple classes with inheritance (`Player`, `Enemy`), polymorphism, basic game loop |
| Inventory Management | A `HashMap` to store items by ID, search by name, update stock levels |
| Vigenere Cipher Tool | A multi-key cipher that extends the Caesar Cipher work above |

**Core Concepts:**
- Inheritance (`extends`) and method overriding (`@Override`)
- Abstract classes and interfaces
- Polymorphism: treating subclass objects as their parent type
- `HashMap<K, V>` for key-value storage
- `Comparable` and `Comparator` for sorting custom objects

**Resources:**
- *Head First Java* (Kathy Sierra) - Chapters 7-9
- Oracle Java Docs: `java.util.HashMap`
- Oracle Java Docs: Interfaces and Inheritance tutorial

**Knowledge Required:**
- Why inheritance reduces code duplication
- What a contract is in the context of an interface
- Basic understanding of how hash tables work

---

### Phase 6 - Networking and Concurrency (Months 3-4)

These topics require a more solid foundation and are best tackled after Phase 5. They are directly relevant to cybersecurity tooling.

| Project | What It Builds |
|---|---|
| Basic Port Scanner | Scan a range of ports on a host, report open/closed, record results to a file |
| Multi-threaded Port Scanner | Run the above scan using multiple threads to improve speed |
| Simple HTTP Client | Make GET requests to a URL, display response headers and body |

**Core Concepts:**
- `java.net.Socket` for TCP connections
- Connection timeouts and `IOException` handling for closed ports
- `Thread` class and `Runnable` interface
- `ExecutorService` and thread pools for managing concurrent tasks
- `java.net.HttpURLConnection` for HTTP requests

**Resources:**
- Oracle Java Docs: `java.net.Socket`, `java.lang.Thread`, `java.util.concurrent`
- Computerphile on YouTube: "What are Ports?" and "How TCP Works"
- TryHackMe or HackTheBox Academy: Networking fundamentals rooms (free tier)

**Knowledge Required:**
- How TCP handshakes work (SYN, SYN-ACK, ACK)
- Port ranges (well-known, registered, ephemeral)
- Why concurrency introduces race conditions and how to avoid them
- Basic networking: IP addresses, subnets, localhost vs external hosts

**Important Note:** Only scan systems you own or have explicit permission to scan. Running a port scanner against external hosts without permission is illegal in most jurisdictions.

---

## General Advice

- Commit every project to this repository, even if it is incomplete. Version history is a learning tool.
- When a project is finished, go back and refactor it once. The second pass teaches as much as the first.
- Do not skip Phase 3. File I/O is unglamorous but appears constantly in real-world code and in degree coursework.
- For the cybersecurity pathway, Phases 4 and 6 are the most directly relevant. Treat Phase 4 as preparation for understanding tools like Hashcat and John the Ripper from a programmer's perspective.
