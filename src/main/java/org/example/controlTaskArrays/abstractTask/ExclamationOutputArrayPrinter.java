package org.example.controlTaskArrays.abstractTask;

public class ExclamationOutputArrayPrinter extends ArrayPrinter{
    @Override
    protected String printElem(int elem) {
        return " Элемент № : "+ elem + " ! ";
    }
}
