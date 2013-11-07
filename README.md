GoHealth Code Challenge
=======================

##Summary
Author: Brian Tong
 
Task: Implement a Secret Santa assignment generator
 
* Example  Input: { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" }
* Example Output: { "Eric", "Stewie", "Brian", "Kenny", "Kyle", "Stan" }
* The assignments would be as follows: [Kyle-Eric], [Kenny-Stewie], etc.

##Environment Setup
Maven was used as a build tool so it would be easiest if you had the latest version of Maven installed on your machine too.

I followed this to set up Maven on my own machine: http://maven.apache.org/download.cgi

* Java version 1.6.0_65
* JUnit 4.11
* Maven 3.11
 * Maven-Surefire-Plugin v2.16
 * Maven-Compiler-Plugin v3.1

##Program Setup 
###(assumes Maven is setup on machine)
1. Unzip `secretsanta-maven.zip` into any directory you want  
2. In Terminal cd into `secretsanta-maven/SecretSanta`  
3. Type `mvn compile`  
4. Then type `mvn package` which should run the Tests and generate a JAR file to run the program  

####To Run Program
1. Type `java -cp target/SecretSanta-1.0-SNAPSHOT.jar com.brianctong.App` and you should see the following:

```
Participants: [Kyle, Kenny, Eric, Stan, Stewie, Brian]
Assignments: [Stewie, Eric, Stan, Kyle, Brian, Kenny]
```
(Assignments will vary [while still being valid] each time you run the program) 
Go ahead, run it a few times to see!

####To Run Tests
Test should run during the package step but if you would like to only run the tests:

1. Type `mvn test`

