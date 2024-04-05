package com.etsy.android.lib.models;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum Status {
    UNKNOWN((String) null),
    ACTIVE(0),
    INACTIVE(1),
    SOLD_OUT(2),
    DRAFT(3),
    REMOVED(4),
    EXPIRED(5);
    
    public static final Companion Companion = null;
    private final Integer value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Status fromInt(Integer num) {
            Status status;
            Status[] values = Status.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    status = null;
                    break;
                }
                status = values[i];
                if (C19383o.m32792b(status.getValue(), num)) {
                    break;
                }
                i++;
            }
            return status == null ? Status.UNKNOWN : status;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Status(Integer num) {
        this.value = num;
    }

    public final Integer getValue() {
        return this.value;
    }
}
