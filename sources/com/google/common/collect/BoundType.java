package com.google.common.collect;

public enum BoundType {
    OPEN(false),
    CLOSED(true);
    
    public final boolean inclusive;

    private BoundType(boolean z) {
        this.inclusive = z;
    }

    public static BoundType forBoolean(boolean z) {
        return z ? CLOSED : OPEN;
    }

    public BoundType flip() {
        return forBoolean(!this.inclusive);
    }
}
