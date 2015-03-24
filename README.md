UMS Interview Tasks
==

This is a collection of interview tasks for UMS. This just a small set of tasks, with associated Unit tests. Clone
this repository locally, and open in your favourite IDE. Then implement all the methods to get all the tests to pass. 
You are  not allowed to alter anything in the src/test folder.

This code requires Java 8, and an editor capable of editing Java 8 code. 

This project uses [gradle](http://gradle.org/) for building. The gradlew scripts and jars included should contain
everything needed to start building, assuming java is already installed.

IDE Installation
--
There exists tasks to generate both Intellij Idea and Eclipse project files.

For IDEA:

    gradlew idea

You should be able to use the [Intellij IDEA community Edition](http://www.jetbrains.com/idea/)

For Eclipse:

    gradlew eclipse
    
You should then be able to open/import the source code into your editor. You will need to install the Java 8 support,
for 4.3 Kepler, see [http://www.eclipse.org/downloads/java8/](Java 8 support for Eclipse Kepler SR2)

Testing
--
To test if everything is fine, use gradle:

    gradlew build
    
If tests are failing, you should see output directing you to an HTML report with all errors.

Bonus tasks
--
The tests in bonus are optional, but helps score extra points. They are harder, and requires either creativity,
or more internal knowledge about java.

Submitting
--
When done, commit your changes, then create a git patch, and send to your contact in UMS.
