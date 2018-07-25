# myJavaCollectionApi
This branch will model the Java Collection API. I will try to replicate the java.util.{Collection} basic features in Java

Stack API: It has been implemeted in Java trying to replicate Java's Stack API. Though, java documentation recommends using Dequeue instead of Stack class. Also, Java's Stack class extends Vector Class. Thus, using various features of Vectors class.

I personallly likes how elements are popped up in Java's stack. Every time you remove an element from Java's stack System.arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length) is called. Thus no extra memory is wasted. As in my API, I have used constant MAX to intialise an array.

In Stack API: later I would be updating my pop() method in the similar fashion as Java has done.
