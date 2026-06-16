Factory Method Pattern
Objective
Implement the Factory Method Design Pattern to create different types of documents (Word, PDF, and Excel) without directly instantiating their classes.

Files
Document.java
WordDocument.java
PdfDocument.java
ExcelDocument.java
DocumentFactory.java
WordFactory.java
PdfFactory.java
ExcelFactory.java
FactoryMethodTest.java

Concepts Used
Interface
Abstraction
Inheritance
Polymorphism

Factory Method Design Pattern
How It Works
Document is an interface that defines the open() method.
WordDocument, PdfDocument, and ExcelDocument implement the Document interface.
DocumentFactory is an abstract factory class with the method createDocument().
WordFactory, PdfFactory, and ExcelFactory create their respective document objects.
The client code uses factories instead of directly creating document objects.

Output
Opening Word Document
Opening PDF Document
Opening Excel Document

Conclusion
The Factory Method Pattern hides the object creation logic from the client. It improves flexibility, maintainability, and scalability by delegating object creation to factory classes.