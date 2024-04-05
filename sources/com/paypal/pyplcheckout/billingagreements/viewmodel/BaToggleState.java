package com.paypal.pyplcheckout.billingagreements.viewmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class BaToggleState {

    public static final class Hide extends BaToggleState {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Show extends BaToggleState {
        private final boolean isSelected;

        public Show(boolean z) {
            super((DefaultConstructorMarker) null);
            this.isSelected = z;
        }

        public static /* synthetic */ Show copy$default(Show show, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = show.isSelected;
            }
            return show.copy(z);
        }

        public final boolean component1() {
            return this.isSelected;
        }

        public final Show copy(boolean z) {
            return new Show(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Show) && this.isSelected == ((Show) obj).isSelected;
        }

        public int hashCode() {
            boolean z = this.isSelected;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public String toString() {
            boolean z = this.isSelected;
            return "Show(isSelected=" + z + ")";
        }
    }

    private BaToggleState() {
    }

    public /* synthetic */ BaToggleState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
