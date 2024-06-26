# Hashmap-Activity-Author-and-Book

This repository contains code for an activity that utilizes HashMap to create a report displaying information about books and their authors. This activity is part of LabSeatwork#5 for the HashMap lesson requirements as specified by Sir Jerry Esperanza.

## Project Description

The project involves creating a report that displays the ISBN, book title, author's name, and bio. The data is loaded from CSV files using FileReader and stored in HashMaps, with ISBNs serving as keys. The report is generated by iterating through the HashMaps and printing the relevant information for each book.

## File Structure

- **Author.java**: Defines the Author class with attributes and methods for storing author information.
- **AuthorDA.java**: Manages the loading of author data from the "Author.csv" file into a HashMap.
- **Book.java**: Defines the Book class with attributes and methods for storing book information.
- **BookDA.java**: Manages the loading of book data from the "Book.csv" file into a HashMap, including associating books with their respective authors.
- **BookReport.java**: Main class responsible for generating the report by iterating through the HashMaps of books and authors.
- **Author.csv**: CSV file containing author information (name and bio).
- **Book.csv**: CSV file containing book information (ISBN, title, and author name).

## Usage

To run the project, execute the `BookReport.java` file. Make sure that the CSV files (`Author.csv` and `Book.csv`) are present in the project directory.

The program will generate a report displaying the ISBN, title, author's name, and bio for each book.

## Credits

This project was developed as part of a HashMap activity for LabSeatwork#5, based on lesson requirements provided by Sir Jerry Esperanza.

