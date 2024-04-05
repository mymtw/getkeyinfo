package com.cardinalcommerce.cardinalmobilesdk.models;

public enum CardinalActionCode {
    ERROR("ERROR"),
    SUCCESS("SUCCESS"),
    NOACTION("NOACTION"),
    FAILURE("FAILURE"),
    CANCEL("CANCEL"),
    TIMEOUT("TIMEOUT");
    
    private final String string;

    private CardinalActionCode(String str) {
        this.string = str;
    }

    public static CardinalActionCode getActionCode(String str) {
        String upperCase = str.toUpperCase();
        upperCase.getClass();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case -1149187101:
                if (upperCase.equals("SUCCESS")) {
                    c = 0;
                    break;
                }
                break;
            case -595928767:
                if (upperCase.equals("TIMEOUT")) {
                    c = 1;
                    break;
                }
                break;
            case -368591510:
                if (upperCase.equals("FAILURE")) {
                    c = 2;
                    break;
                }
                break;
            case 66247144:
                if (upperCase.equals("ERROR")) {
                    c = 3;
                    break;
                }
                break;
            case 1334385268:
                if (upperCase.equals("NO_ACTION")) {
                    c = 4;
                    break;
                }
                break;
            case 1818912567:
                if (upperCase.equals("NOACTION")) {
                    c = 5;
                    break;
                }
                break;
            case 1980572282:
                if (upperCase.equals("CANCEL")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SUCCESS;
            case 1:
                return TIMEOUT;
            case 2:
                return FAILURE;
            case 3:
                return ERROR;
            case 4:
            case 5:
                return NOACTION;
            case 6:
                return CANCEL;
            default:
                return ERROR;
        }
    }

    public String getString() {
        return this.string;
    }
}
