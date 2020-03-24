public class ArrayListTesterA
{
    public static void main(String[] args)
    {
        ArrayList list1 = new ArrayList();
        System.out.println("Printing list1:\n" + list1 + "   (Should be [] or nothing at all, not \"null\")");

        ArrayList list2 = new ArrayList(12);
        System.out.println("Printing list2:\n" + list2 + "   (Should be [] or nothing at all, not \"null\")");

        String[] words = {"cat", "dog", "mouse"};
        ArrayList list3 = new ArrayList(words);
        System.out.println("Printing list3:\n" + list3 + "\n   (Should be: [\"cat\", \"dog\", \"mouse\"], with any formatting you want)");

        words[0] = "feline";
        System.out.println("Printing list3:\n" + list3 + "\n   (Should be: [\"cat\", \"dog\", \"mouse\"], with any formatting you want)");

        Integer[] nums = {3, 5};
        ArrayList list4 = new ArrayList(nums);
        System.out.println("Printing list4:\n" + list4 + "\n    (Should be: \"[3, 5]\" with whatever formatting you chose)");
    }
}


