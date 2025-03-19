import estrutura_dados_array_list.MyArrayList;


public class Main {
    public static void main(String[] args)
    {

        MyArrayList vetor = new MyArrayList(10);

        // add(E e);

        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");

        // add(int index, E e);

        vetor.add(1, "elemento 4");

        // remove(int index);

        vetor.remove(0);

        // remove(Object o);

        vetor.remove("elemento 4");

        // set(int index, E e);

        vetor.set(0, "elemento 1");

        // get(int index);

        System.out.println(vetor.get(0));

        // contains(Object o);

        System.out.println(vetor.contains("elemento 1"));

        // indexOf(Object o);

        System.out.println("O elemento 3 está no index: " + vetor.indexOf("elemento 3"));

        // toArray();

        System.out.println(vetor.toArray());

    }
}