package handlearray;
// Program handles integet array and string array in both initialised and assigned values way.
// Array is group of elements with index starting at Zero.
// int [] <arrayname> defines single dimesntion array
// int [] [] <arrayname1> <arrayname2> defines two dimensional array

public class HandleArray {

    public static void main(String args[]) {
        int[] integerarray = new int[]{25, 50, 75};
        int[] intarr1 = new int[3];
        String[] stringarray = new String[]{"Kiran", "Sanjay", "SanKir"};
        String[] strarr1 = new String[3];
        System.out.println(integerarray.length);

        System.out.println("#1 Printing elements of Initialised Integer Array thru printf");
        System.out.printf("%d, %d, %d\n\n", integerarray[0], integerarray[1], integerarray[2]);
        System.out.println("#2 Printing elements of Initialised String Array thru printf");
        System.out.printf("%s, %s, %s\n\n", stringarray[0], stringarray[1], stringarray[2]);
        //System.out.printf("%c, %c\n\n", stringarray[0][0], stringarray[1][0]);

        intarr1[0] = 100;
        intarr1[1] = 200;
        intarr1[2] = 300;
        System.out.println("#3 Printing Assigned values of Integer Array Elements thru printf");
        System.out.printf("%d, %d, %d\n\n", intarr1[0], intarr1[1], intarr1[2]);

        strarr1[0] = "Adithya";
        strarr1[1] = "Rohit";
        strarr1[2] = Integer.toString(intarr1[2]);
        System.out.println("#4 Printing Assigned values of String Array Elements thru printf");
        System.out.printf("%s, %s, %s\n", strarr1[0], strarr1[1], strarr1[2]);

        System.out.println("-------------------------------------------------------------------");

        System.out.println("\n#5 Using for-loop: Printing Initialised Elements of Integer Array:");
        for (int i = 0; i < 3; i++)
            System.out.printf("%d, ", integerarray[i]);

        System.out.println("\n\n#6 Using for-loop: Printing Initialised Elements of String array:");
        for (int i = 0; i < 3; i++)
            System.out.printf("%s, ", stringarray[i]);

        // Use enhanced loop
        System.out.println("\n\n#7 Using enhanced-loop: Printing Initialised Elements of Integer array:");
        for (int i : integerarray)
            System.out.printf("%d, ", i);

        System.out.println("\n\n#8 Using enhanced loop: Printing Initialised Eements of String array:");
        for (String s : stringarray)
            System.out.printf("%s, ", s);

        System.out.println();

    }

}
