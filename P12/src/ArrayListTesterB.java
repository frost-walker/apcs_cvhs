public class ArrayListTesterB
{
    public static void main(String[] args)
    {
        ArrayList list1 = new ArrayList();
        System.out.println("Size: " + list1.size() + "   (Should be 0)");

        ArrayList list2 = new ArrayList(12);
        System.out.println("Size: " + list2.size() + "   (Should be 0)");

        String[] words = {"cat", "dog", "mouse"};
        ArrayList list3 = new ArrayList(words);
        System.out.println("Size: " + list3.size() + "   (Should be 3)");


        try
        {
            list1.get(0);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");
        try
        {
            list1.get(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle a negative index\n");

        try
        {
            list2.get(0);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");

        try
        {
            list2.get(-1);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle a negative index\n");

        System.out.println(list3.get(0) + "    Should be \"cat\"");
        System.out.println(list3.get(2) + "    Should be \"mouse\"");

        try
        {
            System.out.println(list3.get(3));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");

        try
        {
            System.out.println(list3.get(4));
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Should print: \"java.lang.IndexOutOfBoundsException:\" followed by the text you wrote to handle an index being too big\n");
    }
}
