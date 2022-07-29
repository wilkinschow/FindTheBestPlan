# Solver for Find The Best Plan coding challenge

**Input file format:**
The input file is several lines, each line represents a plan (name, price, and one or more
features, separated by comma). For example,
Example1.txt

The customer wants (email, voice, admin) service. He has the following
choices to cover his need:

(PLAN1, PLAN2): 100 + 150 = $250

(PLAN1, PLAN3): 100 + 125 = $225

(PLAN2, PLAN3): 150 + 125 = $275

(PLAN1, PLAN4): 100 + 135 = $235

(PLAN2, PLAN3, PLAN4) = 150 + 125 + 135 = $410

...// other possible plan choices omitted

And the minimum price is $225, PLAN1 + PLAN3.

Please write a program that output the minimum price for a given
feature set.

The app should accept 2 arguments, 1st is the path to the plan file; 2nd
is the features needed (separated by commas (,) ). 

For example:

Java -jar app2.jar c:\example1.txt email,voice,admin

**Build Instructions**
- Download and unzip package into VS Code. 
- Make sure your VS Code is set up for Java Development [here](https://code.visualstudio.com/docs/java/java-tutorial).
- Export jar file using point 3 in this [guide](https://dev.to/rohitk570/create-an-executable-jar-file-on-vs-code-n-command-line-154b).
- Command line usage: Java -jar .\FindTheBestPlan-master.jar c:\example1.txt F5,F2,F9,F0,F7,F6,F8,F3
- example1.txt file is provided in root directory.
