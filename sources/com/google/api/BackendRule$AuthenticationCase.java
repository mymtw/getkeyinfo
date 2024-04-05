package com.google.api;

public enum BackendRule$AuthenticationCase {
    JWT_AUDIENCE(7),
    DISABLE_AUTH(8),
    AUTHENTICATION_NOT_SET(0);
    
    private final int value;

    private BackendRule$AuthenticationCase(int i) {
        this.value = i;
    }

    public static BackendRule$AuthenticationCase forNumber(int i) {
        if (i == 0) {
            return AUTHENTICATION_NOT_SET;
        }
        if (i == 7) {
            return JWT_AUDIENCE;
        }
        if (i != 8) {
            return null;
        }
        return DISABLE_AUTH;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static BackendRule$AuthenticationCase valueOf(int i) {
        return forNumber(i);
    }
}
