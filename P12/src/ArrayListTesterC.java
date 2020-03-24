import java.io.Serializable;

public class ArrayListTesterC
{
    public static void main(String[] args)
    {
        String[] words = {"cat", "dog", "mouse"};
        ArrayList list = new ArrayList(words);

        try
        {
            list.remove(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle a negative index\n");

        try
        {
            list.remove(3);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");

        try
        {
            list.remove(4);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");

        list.remove(0);
        System.out.println(list + "    Should be: [\"dog\", \"mouse\"]");

        list.remove(1);
        System.out.println(list + "    Should be: [\"dog\"]");

        list.remove(0);
        System.out.println(list + "    Should be empty: []");
        try
        {
            list.remove(0);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");

        boolean ableToAdd = list.add(0, 1);     // Java converts the primitive int value "1" into an object of type Integer
        System.out.println(list + "    Should print: [1]");
        System.out.println(ableToAdd + "    Should print: true");

        try
        {
            list.add(-1, "house");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle a negative index\n");

        try
        {
            list.add(2, "house");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");

        list.add(1, "house");
        System.out.println(list + "    Should print: [1, \"house\"]");

        list.add(1, "car");
        System.out.println(list + "    Should print: [1, \"car\", \"house\"]");

        ableToAdd = list.add(1, "nothing");
        System.out.println(list + "    Should print: [1, \"car\", \"house\"]");
        System.out.println(ableToAdd + "    Should print: false (assuming you have not yet done P12D)");
    }
}


