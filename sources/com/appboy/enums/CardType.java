package com.appboy.enums;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum CardType {
    BANNER,
    CAPTIONED_IMAGE,
    DEFAULT,
    SHORT_NEWS,
    TEXT_ANNOUNCEMENT,
    CONTROL;
    
    public static final Companion Companion = null;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CardType fromValue(int i) {
            return CardType.values()[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public static final CardType fromValue(int i) {
        return Companion.fromValue(i);
    }

    public final int getValue() {
        return ordinal();
    }
}
