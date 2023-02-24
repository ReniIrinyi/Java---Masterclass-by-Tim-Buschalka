public class VarArgs {
    public static void main(String... args) {
        System.out.println("Hello World");
        String[]splitStrings="Hallo World again".split(" ");
        printText(splitStrings);



    //ha ... teszünk []helyére akkor olyan methodot kreáltunk amivel több módon is hivhatjuk ezt a methodot.
     System.out.println("_".repeat(20));
    printText("Hallo");
        System.out.println("_".repeat(20));
    printText("Hallo", "World", "again");
        System.out.println("_".repeat(20));
    printText();


    String[] sArray={"first", "second"};
        System.out.println(String.join(",",sArray));
    }
    private static void printText(String... textList){
        for(String t:textList){
            System.out.println(t);
        }
    }
}
