class LinkedListEnd {
    String daten="Erste element";
    LinkedListEnd listenanfang;//successor
    LinkedListEnd listenende;//presessor

    public void setDaten(String daten) {
        this.daten = daten;
    }



    void anhaengen(String datenNeu) {

        if (listenanfang == null) {
            listenanfang = new LinkedListEnd();
            listenanfang.setDaten(datenNeu);
        } else {
            listenende=listenanfang;
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
