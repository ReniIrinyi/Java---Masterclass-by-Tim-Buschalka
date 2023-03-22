public class Main {


    public static void main(String[] args) {
        //EINFÜGEN LISTENANFANG
        System.out.println("-".repeat(25));
        System.out.println("EINFÜGEN LISTENANFANG");
        System.out.println("-".repeat(25));
        System.out.println();
        LinkedListBegin addAnfang = new LinkedListBegin();
        System.out.print("ANFANG DER LISTE => ");
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            addAnfang.anhaengen(i);
            System.out.println("Nachdem wir "+i+" hinzugefügt haben dann wurde: ");
            addAnfang.ausgeben();

        }
        addAnfang.ausgeben();
        System.out.print("ENDE (NULL)");
        System.out.println();
        System.out.println("-".repeat(25));
        System.out.println();

        //EINFÜGEN LISTENENDE

/*
        LinkedList<String> list = new LinkedList<String>();
        list.addLast("l");
        list.addLast("i");
        list.addLast("s");
        list.addLast("t");
        list.insertBefore("l", "s");
        list.delete("s");
        System.out.println(list);

        */

    }




    }











