public class ArrayPractice {
    public static void main(String[] args)
    {
        //int[] myArray = {10, 330, 230, 4220, 5120, 5121, 34223};

        //arrayReverseInt(myArray);
        //printArrayInt(myArray);

        //System.out.println(myArray[findArrayMin(myArray)]);
        //System.out.println(myArray[findArrayMax(myArray)]);

        String myString = "Pragra";
        reverseString(myString);
        System.out.println(myString);
    }

    public static void arrayReverseInt(int[] targetArray)
    {
        int temp;
        for (int i = 0; i < targetArray.length/2; i++)
        {
            temp = targetArray[i];
            targetArray[i] = targetArray[targetArray.length - i - 1];
            targetArray[targetArray.length - i - 1] = temp;
        }
    }

    public static void printArrayInt(int[] targetArray)
    {
        for (int i = 0; i < targetArray.length; i++)
        {
            System.out.println(targetArray[i]);
        }
    }

    public static int findArrayMin(int[] targetArray)
    {
        int currentLowestIndex = 0;
        for (int i = 0; i < targetArray.length; i++)
        {
            if (targetArray[i] < targetArray[currentLowestIndex]) currentLowestIndex = i;
        }
        return currentLowestIndex;
    }

    public static int findArrayMax(int[] targetArray)
    {
        int currentHighestIndex = 0;
        for (int i = 0; i < targetArray.length; i++)
        {
            if (targetArray[i] > targetArray[currentHighestIndex]) currentHighestIndex = i;
        }
        return currentHighestIndex;
    }

    public static void reverseString(String targetString)
    {
        char[] targetStringArray = targetString.toCharArray();
        char tempChar;
        for (int i = 0; i < targetStringArray.length / 2; i++)
        {
            tempChar = targetStringArray[i];
            targetStringArray[i] = targetStringArray[targetString.length() - 1 - i];
            targetStringArray[targetString.length() - 1 - i] = tempChar;
        }

        targetString = "";
        for (char c : targetStringArray)
        {
            targetString += c;
        }
    }
}

