# Mutliple Choice Questions

Which of the methods would you use to look up a element in a given map using a specified key.

A) get() :heavy_check_mark:
B) look()
C) search()
D) value()

---

What is the result of the following command?

```java
import java.util.*;
public class Priorities {
    public static void main(String[] args) {
        PriorityQueue toDo = new PriorityQueue();
        toDo.add("dishes");
        toDo.add("laundry");
        toDo.add("bills");
        toDo.offer("bills");
        System.out.print(toDo.size() + " " + toDo.poll());
        System.out.print(" " + toDo.peek() + " " + toDo.poll());
        System.out.println(" " + toDo.poll() + " " + toDo.poll());
    }
}
```

A) 3 bills dishes laundry null null
B) 3 bills bills dishes laundry null
C) 3 dishes dishes laundry bills null
D) 4 bills bills dishes laundry null
E) 4 bills bills bills dishes laundry :heavy_check_mark:
F) 4 dishes laundry laundry bills bills
G) Compilation fails.
H) An exception is thrown at runtime.

---

What will be the output of this code snippet. Assume that all necessary imports have been taken care of:

```java
public class Test{
    public static void main(String args[]) {
        try {
            int x = 0;
            for (x=1; x<4; x++);
            System.out.println(x);
        } catch(Exception e) {}
        finally {
            System.out.println("Error");
        }
    }
}
```

A) 1 2 3
B) 4
C) 1 2 3 4
D) 4 Error :heavy_check_mark:

---

What is true of the following program? (Don't know hm)

```java
public class TestFirstApp {
    static void doIt(int x, int y, int m) {
    if (x == 5) m=y;
        else m=x;
    }
}

public static void main(String[] args) {
    int i=6, j=4, k=9;
    TestFirStApp.doIt(i,j,k);
        System.out.print(k);
}
```

A) Doesn’t matter what the values of i and j are, the output will always be 5 .
B) Doesn’t matter what the values of k and j are, the output will always be 5 .
C) Doesn’t matter what the values of i and j are, the output will always be 9 . :heavy_check_mark:
D) Doesn’t matter what the values of k and j are, the output will always be 9 .

---

What is the output of the following program?

```java
class Constructor
{
   static String str;
   public void Constructor()
   {
      System.out.println("In constructor");
      str = "Hello World";
   }
   public static void main(String [] args)
   {
      Constructor c = new Constructor();
      System.out.println(str);
   }
}
```

A) In constructor
B) null :heavy_check_mark:
C) Compilation fails
D) None of the above
