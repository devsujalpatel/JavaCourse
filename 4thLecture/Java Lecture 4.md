**Java \- Introduction to Programming**  
**Lecture 4**

**Loops**  
A loop is used for executing a block of statements repeatedly until a particular  condition is satisfied. A loop consists of an initialization statement, a test condition and an increment statement.

**For Loop**  
The syntax of the for loop is  :

for (initialization; condition; update) {   
 // body of-loop   
}

for (int i=1; i\<=20; i++) {  
   System.*out*.println(i);  
}

**While Loop**  
The syntax for while loop is :  
while(condition) {   
 // body of the loop   
}

int i \= 0;  
while(i\<=20) {  
   System.*out*.println(i);  
   i++;  
}

**Do-While Loop**  
The syntax for the do-while loop is :  
do {   
 // body of loop;   
}   
while (condition);

int i \= 0;  
do {  
   System.*out*.println(i);  
   i++;  
} while(i\<=20);

**Homework Problems**

1. Print all even numbers till n.  
2. Run  
   for(; ;) {  
               System.out.println("Apna College");  
           }  
   loop on your system and analyze what happens. Try to think of the reason for the output produced.  
     
3.  Make a menu driven program. The user can enter 2 numbers, either 1 or 0\.   
   If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).   
   If they enter 0 then stop.  
   If he/ she scores :  
   **Marks \>=90** \-\> print “This is Good”  
   **89 \>= Marks \>= 60** \-\> print “This is also Good”  
   **59 \>= Marks \>= 0** \-\> print “This is Good as well”

	Because marks don’t matter but our effort does.

(Hint : use do-while loop but think & understand why)

**BONUS**

Qs. Print if a number is prime or not (Input n from the user). 

\[In this problem you will learn how to check if a number is prime or not\]

**Homework Solution (Lecture 3\)**

**import java.util.\*;**

**public class Conditions {**  
   **public static void main(String args\[\]) {**  
       **Scanner sc \= new Scanner(System.in);**  
       **int a \= sc.nextInt();**  
       **int b \= sc.nextInt();**  
       **int operator \= sc.nextInt();**

       **/\*\***  
        **\* 1 \-\> \+**  
        **\* 2 \-\> \-**  
        **\* 3 \-\> \***  
        **\* 4 \-\> /**  
        **\* 5 \-\> %**  
        **\*/**

       **switch(operator) {**  
           **case 1 : System.out.println(a\+b);**  
           **break;**  
           **case 2 : System.out.println(a\-b);**  
           **break;**  
           **case 3 : System.out.println(a\*b);**  
           **break;**  
           **case 4 : if(b \== 0) {**  
                       **System.out.println("Invalid Division");**  
                   **} else {**  
                       **System.out.println(a/b);**  
                   **}**  
	    **break;**  
           **case 5 : if(b \== 0) {**  
                       **System.out.println("Invalid Division");**  
                   **} else {**  
                       **System.out.println(a%b);**  
                   **}**  
	    **break;**   
           **default : System.out.println("Invalid Operator");**  
       **}**  
   **}**  
**}**  
