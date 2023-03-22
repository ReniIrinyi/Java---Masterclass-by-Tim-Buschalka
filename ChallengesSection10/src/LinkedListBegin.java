 class LinkedListBegin {
     int daten;
     LinkedListBegin listenanfang;

     void setDaten(int datenNeu) {
         daten = datenNeu;
         listenanfang = null;
     }

     void anhaengen(int datenNeu) {

         if (listenanfang == null) {
             listenanfang = new LinkedListBegin();

         } else {
             //ende der Liste nicht erreicht => else :
             // /* Der Aufruf erfolgt allerdings nicht
             // für das aktuelle Element, sondern für das Element,
             // das über naechster angesprochen wird –
             // also für das Nachfolgeelement*/
             listenanfang.setDaten(datenNeu);
             listenanfang.anhaengen(datenNeu);

         }
     }


     void ausgeben () {
         if (listenanfang != null) {
             listenanfang.ausgeben();
             System.out.print(daten + " => ");
         }

     }

 }
