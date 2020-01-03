package rocks.zipcode.io.quiz4.generics;
import java.util.*;
import java.util.ArrayList;
import java.lang.*;
/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void insert(T value) {
            this.list.add(value);
    }

    @Override
    public void delete(T value) {
        this.list.remove(value);
    }

    public Integer indexOf(T value) {
        return this.list.indexOf(value);
    }
}
