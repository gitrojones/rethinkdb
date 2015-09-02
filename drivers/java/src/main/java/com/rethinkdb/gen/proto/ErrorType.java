// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/Enum.java

package com.rethinkdb.gen.proto;

public enum ErrorType {

    INTERNAL(1000000),
    RESOURCE_LIMIT(2000000),
    QUERY_LOGIC(3000000),
    NON_EXISTENCE(3100000),
    OP_FAILED(4100000),
    OP_INDETERMINATE(4200000),
    USER(5000000);

    public final int value;

    private ErrorType(int value){
        this.value = value;
    }

    public static ErrorType fromValue(int value) {
        switch (value) {
            case 1000000: return ErrorType.INTERNAL;
            case 2000000: return ErrorType.RESOURCE_LIMIT;
            case 3000000: return ErrorType.QUERY_LOGIC;
            case 3100000: return ErrorType.NON_EXISTENCE;
            case 4100000: return ErrorType.OP_FAILED;
            case 4200000: return ErrorType.OP_INDETERMINATE;
            case 5000000: return ErrorType.USER;
            default:
                throw new IllegalArgumentException(String.format(
                "%s is not a legal value for ErrorType", value));
        }
    }

}
