import java.util.Iterator;
import java.util.function.Consumer;

public class LinListIterator<T> implements Iterator {
    LinList<T> linList;

    public LinListIterator(LinList<T> linList) {
        this.linList = linList;
    }

    @Override
    public boolean hasNext() {
        return linList.existFollowingElement();
    }

    @Override
    public T next() {
        linList = linList.followingElement;
        return linList.element;
    }
}
