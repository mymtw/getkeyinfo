package com.google.api;

public enum Distribution$BucketOptions$OptionsCase {
    LINEAR_BUCKETS(1),
    EXPONENTIAL_BUCKETS(2),
    EXPLICIT_BUCKETS(3),
    OPTIONS_NOT_SET(0);
    
    private final int value;

    private Distribution$BucketOptions$OptionsCase(int i) {
        this.value = i;
    }

    public static Distribution$BucketOptions$OptionsCase forNumber(int i) {
        if (i == 0) {
            return OPTIONS_NOT_SET;
        }
        if (i == 1) {
            return LINEAR_BUCKETS;
        }
        if (i == 2) {
            return EXPONENTIAL_BUCKETS;
        }
        if (i != 3) {
            return null;
        }
        return EXPLICIT_BUCKETS;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static Distribution$BucketOptions$OptionsCase valueOf(int i) {
        return forNumber(i);
    }
}
