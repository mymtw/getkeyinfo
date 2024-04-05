package com.paypal.pyplcheckout.home.viewmodel;

import android.support.p013v4.media.C0069a;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class SpinnerState {

    public static final class Hide extends SpinnerState {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Show extends SpinnerState {
        private final int stringId;

        public Show(int i) {
            super((DefaultConstructorMarker) null);
            this.stringId = i;
        }

        public static /* synthetic */ Show copy$default(Show show, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = show.stringId;
            }
            return show.copy(i);
        }

        public final int component1() {
            return this.stringId;
        }

        public final Show copy(int i) {
            return new Show(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Show) && this.stringId == ((Show) obj).stringId;
        }

        public final int getStringId() {
            return this.stringId;
        }

        public int hashCode() {
            return Integer.hashCode(this.stringId);
        }

        public String toString() {
            return C0069a.m175f("Show(stringId=", this.stringId, ")");
        }
    }

    private SpinnerState() {
    }

    public /* synthetic */ SpinnerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
