# FILE-HANDLING-UTILITY

**COMPANY**: CODETECH IT SOLUTIONS

**NAME**: THRISHA K

**INTERN ID**: CT08HIX

**DOMAIN**: JAVA PROGRAMMING

**BATCH DURATION**: DECEMBER 30TH, 2024 TO JANUARY 30TH, 2025

**MENTOR**: NEELA SANTHOSH KUMAR

Project Description: File Handling Utility Using JAVA

Objective:

This job aims to develop a Java utility that showcases basic file capabilities such as reading, writing, appending, and editing a text file. It helps to automate the operations of the text file without requiring any command line involvement from the users and makes the task easier.

Key Features:

File Reading:

The functionality allows reading a particular text file and then prints the text to the console. This allows the user to confirm what the contents of the file are before proceeding to use throughout different operations such as writing, appending or modifying.

File Writing:

The functionality allows writing new directory contents into a file but it will also erase all the previous data on the file. It will create a file if one does not already exist and insert all the data provided to it in the newly created file.

File Appending:

The functionality appends new contents to a file in its existing state, without deleting any old information. This allows the user to keep old data while still adding new content to the file.

File Modification:

A file with an updated configuration is written after replacing text with the ID value. The context of the file is loaded in memory as a string, changes are made to the required part alongside doing a string replacement operation, this is followed by saving the new changes into the file. 

How the Program Works: 

Hardcoded Inputs: The contents of the example.txt file are hardcoded and the name of the file is also set so that the program can operate on the example.txt file while ensuring writing and modification using preset content. This entirely zones out the manual input process for the user during program execution. 

File Operations Flow:

The initial phase involves reading the current information of the file and displaying it onto the screen. 

New data is then inputted alongside the old data to the file. 

Additional Content is then added or appended to the file afterwards. 

Lastly, the old string or variable is swapped out with the new content and the updated data is displayed. 

Technologies Used: 

Java I/O (Input/Output): 

BufferedReader: This is used for receiving data from the example.txt file. 

BufferedWriter: This is utilized when writing data to a file and during overwriting or appending. 

FileReader and FileWriter: to these are programs used to conduct reading and writing files. 

Java NIO (New Input/Output): 

Paths and Files: these are useful when the overall content of a file has to be read or written in one go e.g for making contact modifications.

Use Cases of The Application:

File Pooling Aid

If a single file is frequently updated with new content such as logs or various configuration parameters this application can help write a script to ease the process.

Data Evaluation in Business:

This application also provides an evaluation zone where each activity can be added such that it adds to the log in the form of a file instead of sending it to some programming code that will erase the previous log.

Lot Edit

This application is also handy when you want to change certain phrases in a set of documents for example in several files you want to change one word to a different one.

Alterations Aid:

You can read from a file and edit it to create copies of that information and when signing up for something where you are required to put additional data you can alter the contents of that file without difficulty.

Output example

To start if the name example.txt is being set through code then the program proceeds through the steps in this order.

Append new content to the file:

This is an appended line of text.
Modify content (replace "Java" with "Java Programming"):

Original content: "Java is great."
Modified content: "Java Programming is great."
Final file content after all operations:

This is the new content written to the file.
This is an appended line of text.
This is an example of Java Programming in the file.
Documentation:
This project is well-documented with inline comments to explain the functionality of each method. Additionally, the flow of operations is easy to follow in the main method.

Potential Enhancements:
Error Handling: Add more detailed error handling (e.g., check if the file is readable or writable).
User Input Interface: Allow for dynamic user input using a GUI or interactive command-line interface.
Multiple Files Support: Extend the program to support multiple files, where users can specify which file they wish to manipulate.
Advanced Search and Replace: Implement more sophisticated search and replace functionality (e.g., using regular expressions).
This project serves as a basic yet robust file handling utility, demonstrating how to perform common file operations in Java. It provides a foundation that can be extended for more complex file manipulation tasks.
