package org.peronal;

public class DenominatorCannotBeZeroException extends Exception {
    protected String getMessage;

    public DenominatorCannotBeZeroException(String mess) {
        super(mess);
    }

}
