package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.C17165R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum ActionButtonSize {
    SMALL(r3, r4, r5),
    MEDIUM(r3, r4, r5),
    LARGE(C17165R.dimen.paypal_payment_button_min_height_large, C17165R.dimen.paypal_payment_button_vertical_padding_large, C17165R.dimen.text_size_title);
    
    public static final Companion Companion = null;
    private static final String EXCEPTION_INVALID_ATTRIBUTE_INDEX = "Attempted to create a ActionButtonSize with an invalid index. Please use an index that is between 0 and 2 and try again.";
    private final int labelTextSizeResId;
    private final int minHeightResId;
    private final int verticalPaddingResId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ActionButtonSize invoke(int i) {
            if (i == 0) {
                return ActionButtonSize.SMALL;
            }
            if (i == 1) {
                return ActionButtonSize.MEDIUM;
            }
            if (i == 2) {
                return ActionButtonSize.LARGE;
            }
            throw new IllegalArgumentException(ActionButtonSize.EXCEPTION_INVALID_ATTRIBUTE_INDEX);
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private ActionButtonSize(int i, int i2, int i3) {
        this.minHeightResId = i;
        this.verticalPaddingResId = i2;
        this.labelTextSizeResId = i3;
    }

    public final int getLabelTextSizeResId() {
        return this.labelTextSizeResId;
    }

    public final int getMinHeightResId() {
        return this.minHeightResId;
    }

    public final int getVerticalPaddingResId() {
        return this.verticalPaddingResId;
    }
}
