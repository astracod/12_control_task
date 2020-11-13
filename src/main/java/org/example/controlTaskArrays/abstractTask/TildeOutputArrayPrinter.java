package org.example.controlTaskArrays.abstractTask;

public class TildeOutputArrayPrinter extends ArrayPrinter{
    @Override
    protected String printElem(int elem) {
        return " Номер ~ "+elem+" ~";
    }
}
