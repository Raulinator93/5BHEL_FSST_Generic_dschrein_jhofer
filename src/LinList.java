public class LinList<T> {
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
        if(followingElement == null){
            return i;
        }
        i++;
        return followingElement.CountAlong(i);
    }

    public void PrintAll() {
        System.out.println(element);
        if(followingElement!=null) {
            followingElement.PrintAll();
        }
    }
}
