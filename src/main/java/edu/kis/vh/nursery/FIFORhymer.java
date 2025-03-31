package edu.kis.vh.nursery;

/**
 * Klasa tworzy stos first in first out
 * dziedziczy ona od klasy DefaultCountingOutRhymer i nadpisuje metodę countOut()
 *
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Nadpisuje metodę countOut() z klasy bazowej
     * Elementy są zdejmowane w kolejności, w jakiej zostały dodane, bez odwracania tej kolejności.
     * @return Zwraca element z przodu stosu FIFO
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
    /**
     * Zwraca referencję do obiektu tymczasowego stosu
     * @return Obiekt tymczasowego stosu typu DefaultCountingOutRhymer.
     */

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
