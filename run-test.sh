#!/usr/bin/env bash

javac StringCalculator.java 
javac -cp .:/usr/share/java/junit-4.13.2.jar StringCalculatorTest.java
java -cp .:/usr/share/java/junit-4.13.2.jar:/usr/share/java/hamcrest-core.jar org.junit.runner.JUnitCore StringCalculatorTest