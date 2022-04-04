# Projectask_FirstApproach

selenium-cucumber-java
=================

selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
It enables you to write and execute automated acceptance/unit tests.
It is cross-platform, open source and free.
Automate your test cases with minimal coding.

Installation (pre-requisites)
JDK 1.8+ (make sure Java class path is set)
Maven (make sure .m2 class path is set)
Eclipse
Eclipse Plugins for
Maven
Cucumber
Browser driver

**Projects First Approach**-Here i used only many feature files under each feature file there is scenario realted to particular to test  
 
 
 Page Object Design Pattern
 --------------
  Web Pages like Login,Logout Object Repository created for UI webelemnts under each Page class.Which is packaged under src/test/java/pageObjects
 
Writing a testscenarios
--------------

The cucumber features goes in the `features` folder under src/test/resources and should have the ".feature" extension.


Automation scripts using BDD approach - Cucumber-Java
-----------------
There are already many predefined StepDefinitions which is packaged under src/test/StepDef will help you speed up your automation development that support both your favorite workaday helpers methods.

Running test
--------------
1->Running each feature file individually by rightclick RunAs-Cucumber Feature
or
2->Using TestRunner class located under src/test/java/TestRunner to run feature file RunAs-Junit

**Screenshot** folder is under src/test/resources where u can see all screenshot of whenever u try to access information without login

Reports
--------------

1->Cucumber Report can be seen under target folder
2->Spark Report can be seen under test-output folder
3->Allure Reports can be seen under target/allure-reports folder
