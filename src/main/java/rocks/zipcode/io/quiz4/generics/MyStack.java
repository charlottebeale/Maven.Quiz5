package rocks.zipcode.io.quiz4.generics;
import java.util.*;
/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType>  implements Iterable<SomeType>{
    private MyStack<SomeType> stack = new MyStack<SomeType>();

    public MyStack(SomeType... args) {
            for (SomeType item: args) {
                this.stack.push(item);
            }
//            throw new UnsupportedOperationException("Method not yet implemented");

    }

    public Boolean isEmpty() {
      if(this.stack.isEmpty())
          return true;
      else
          return false;

    }

    public void push(SomeType i) {
        this.stack.push(i);
    }

    public SomeType peek() {
//        throw new UnsupportedOperationException("Method not yet implemented");
       return (isEmpty())? null : this.stack.peek();
    }

    public SomeType pop() {
        return this.stack.pop();
    }


    @Override
    public Iterator<SomeType> iterator() {
        return this.stack.iterator();
    }
}
