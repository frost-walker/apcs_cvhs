public class ArrayListTesterD
{
    public static void main(String[] args)
    {
        String[] words = {"cat", "dog", "mouse"};
        ArrayList list = new ArrayList(words);

        boolean ableToAdd = list.add(0, "lion");
        System.out.println(list + "    Should print: [\"lion\", \"cat\", \"dog\", \"mouse\"]");
        System.out.println(ableToAdd + "    Should print: true");
        System.out.println(list.size() + "    Should print: 4");
    }
}


