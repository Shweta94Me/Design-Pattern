# Design-Pattern

# What is design pattern?
A typical solution to commonly occurring problems in software design.
The pattern is not a specific piece of code, but a general concept for solving a particular problem.
Often confused with alogorithm. However, algorithm always defines a clear set of action that can achieve some goal, whereas pattern is more high level description of a solution.

# Three main groups of pattern:
Creational Pattern: Provides object creation mechanisms that increases flexibiliy and reuse of existing code
Structural Pattern: Explains how to assemble objects and classes into larger structures, while keeping the structure flexible and efficent 
Behavioual Pattern: Takes care of effective communication and the assignment of responsibilities between objects.

# Design pattern in Python

# Creational Patterns

1. Abstract Factory 
Let you produce families of related objects without specifying their concrete classes.
Abstract Factory pattern suggests to explicitly declare interfaces for each distinct product of product family.
Then all varients of products follows those interfaces. 
The next move is to delcare the Abstarct Factory - an interface with  alist of creation method for all product that are the part of product family. These methods must return abstract product types represented by the interfaces we extracted previously. 



OO Principles
i. Encapsulate what varies
ii. Favor Composition over inheritance
iii. Program to interfaces, not implementations
iv. Strive for loosely coupled designs between objects that interact

OO Patterns:
i. Oberver - 
	defines a one-to-many dependency between objects so that when one object change state, all its dependents are notified and updated automatically.
	JAVA has several implementations of the Observer Pattern, including the general purpose java.util Observable.


