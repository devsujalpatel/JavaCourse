**Java \- Introduction to Programming**  
**Lecture 6**

**Patterns \- Part 2**

1. 

import java.util.\*;

public class Solutions {  
   public static void main(String args\[\]) {  
       int n \= 4;

       //upper part  
       for(int i\=1; i\<=n; i\++) {  
           for(int j\=1; j\<=i; j\++) {  
               System.out.print("\*");  
           }

           int spaces \= 2 \* (n\-i);  
           for(int j\=1; j\<=spaces; j\++) {  
               System.out.print(" ");  
           }

           for(int j\=1; j\<=i; j\++) {  
               System.out.print("\*");  
           }  
           System.out.println();  
       }

       //lower part  
       for(int i\=n; i\>=1; i\--) {  
           for(int j\=1; j\<=i; j\++) {  
               System.out.print("\*");  
           }

           int spaces \= 2 \* (n\-i);  
           for(int j\=1; j\<=spaces; j\++) {  
               System.out.print(" ");  
           }

           for(int j\=1; j\<=i; j\++) {  
               System.out.print("\*");  
           }  
           System.out.println();  
       }  
   }     
}

2. 

import java.util.\*;

public class Solutions {  
   public static void main(String args\[\]) {  
       int n \= 5;

       for(int i\=1; i\<=n; i\++) {  
           //spaces  
           for(int j\=1; j\<=n\-i; j\++) {  
               System.out.print(" ");  
           }

           //stars  
           for(int j\=1; j\<=n; j\++) {  
               System.out.print("\*");  
           }  
           System.out.println();  
       }  
   }     
}

3. 

import java.util.\*;

public class Solutions {  
   public static void main(String args\[\]) {  
       int n \= 5;

       for(int i\=1; i\<=n; i\++) {  
           //spaces  
           for(int j\=1; j\<=n\-i; j\++) {  
               System.out.print(" ");  
           }

           //numbers  
           for(int j\=1; j\<=i; j\++) {  
               System.out.print(i\+" ");  
           }  
           System.out.println();  
       }  
   }     
}

4. 

import java.util.\*;

public class Solutions {  
   public static void main(String args\[\]) {  
       int n \= 5;  
       for(int i\=1; i\<=n; i\++) {  
           //spaces  
           for(int j\=1; j\<=n\-i; j\++) {  
               System.out.print(" ");  
           }

           //first part  
           for(int j\=i; j\>=1; j\--) {  
               System.out.print(j);  
           }

           //second part  
           for(int j\=2; j\<=i; j\++) {  
               System.out.print(j);  
           }  
           System.out.println();  
       }  
   }     
}

5. 

import java.util.\*;

public class Solutions {  
   public static void main(String args\[\]) {  
       int n \= 5;

       //upper part  
       for(int i\=1; i\<=n; i\++) {  
           //spaces  
           for(int j\=1; j\<=n\-i; j\++) {  
               System.out.print(" ");  
           }  
           for(int j\=1; j\<=2\*i\-1; j\++) {  
               System.out.print("\*");  
           }  
           System.out.println();  
       }

       //lower part  
       for(int i\=n; i\>=1; i\--) {  
           //spaces  
           for(int j\=1; j\<=n\-i; j\++) {  
               System.out.print(" ");  
           }  
           for(int j\=1; j\<=2\*i\-1; j\++) {  
               System.out.print("\*");  
           }  
           System.out.println();  
       }  
   }     
}

**Homework Problems** 

1. **Print a hollow Butterfly.**

		

2. **Print a hollow Rhombus.**  
       \*\*\*\*\*  
      \*      \*  
     \*     \*  
    \*     \*  
   \*\*\*\*\*  
3. **Print Pascal’s Triangle.**  
       1  
      1 1  
     1 2 1  
    1 3 3 1  
   1 4 6 4 1  
4. **Print half Pyramid.**  
       1  
      1 2  
     1 2 3  
    1 2 3 4  
   1 2 3 4 5  
5. **Print Inverted Half Pyramid.**  
   11111  
   222  
   33  
   4

	