package com.paypal.pyplcheckout.home.view.customviews;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum ActionButtonShape {
    RECTANGLE,
    PILL,
    ROUNDED,
    MATERIAL_DESIGN;
    
    public static final Companion Companion = null;
    private static final String EXCEPTION_INVALID_ATTRIBUTE_INDEX = "Attempted to create a ActionButtonShape with an invalid index. Please use an index that is between 0 and 2 and try again.";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ActionButtonShape invoke(int i) {
            if (i == 0) {
                return ActionButtonShape.RECTANGLE;
            }
            if (i == 1) {
                return ActionButtonShape.PILL;
            }
            if (i == 2) {
                return ActionButtonShape.ROUNDED;
            }
            if (i == 3) {
                return ActionButtonShape.MATERIAL_DESIGN;
            }
            throw new IllegalArgumentException(ActionButtonShape.EXCEPTION_INVALID_ATTRIBUTE_INDEX);
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }
}
