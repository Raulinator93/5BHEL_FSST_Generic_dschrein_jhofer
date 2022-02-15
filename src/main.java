public class main{
    public static void main(String[] args) {
        System.out.println("Test");

        LinList root = new LinList(0);
        root.Add(2);
        root.Add(3);
        root.Add(4);
        root.Add(9);
        root.Add(1);

        root.PrintAll();

        System.out.println("\n");

        LinList<Integer> head1 = new LinList<Integer>(0);
        head1.PrintAll();

        System.out.println("\n");

        LinList head = new LinList(0);
        head.Add(2);
        head.Add(3);
        head.Add(4);
        head.Add(9);
        head.Add(1);
        head.Add(7);

        System.out.println("Elemente: " + head.Count());  // sollte: 6 liefern
        head.PrintAll();

        System.out.println("\n");

        LinList<Schueler> list = new LinList<Schueler>(new Schueler("Lechner"));
        list.Add(new Schueler("Bendra"));
        list.Add(new Schueler("Scharnreitner"));
        list.Add(new Schueler("Wiedermann"));

        list.PrintAll();

        System.out.println("\n");

        for(Object s:list){
            System.out.println();
        }
    }

}
