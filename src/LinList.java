import java.util.Iterator;

public class LinList<T> implements Iterable{
    T element;
    LinList<T> followingElement = null;
    public LinList(T root) {
        element = root;
    }
    public void Add(T element){
        if(followingElement != null){
            followingElement.Add(element);
        }else {
            followingElement = new LinList<>(element);
        }
    }

    public int Count(){
        int i = 0;
        return CountAlong(i);
    }

    private int CountAlong(int i){
        i++;
        if(followingElement == null){
            return i;
        }
        return followingElement.CountAlong(i);
    }

    public void PrintAll() {
        System.out.println(element);
        if(followingElement!=null) {
            followingElement.PrintAll();
        }
    }

    public boolean existFollowingElement(){
        if(followingElement==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Iterator iterator() {
        return new LinListIterator<T>(this);
    }
}
