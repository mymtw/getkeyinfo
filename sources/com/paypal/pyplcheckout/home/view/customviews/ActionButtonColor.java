package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.content.res.ColorStateList;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

public enum ActionButtonColor {
    BLUE,
    GRAY,
    WHITE;
    
    public static final Companion Companion = null;
    private static final String EXCEPTION_INVALID_ATTRIBUTE_INDEX = "Attempted to create a ActionButtonColor with an invalid index. Please use an index that is between 0 and 3 and try again.";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ActionButtonColor invoke(int i) {
            if (i == 0) {
                return ActionButtonColor.BLUE;
            }
            if (i == 1) {
                return ActionButtonColor.GRAY;
            }
            if (i == 2) {
                return ActionButtonColor.WHITE;
            }
            throw new IllegalArgumentException(ActionButtonColor.EXCEPTION_INVALID_ATTRIBUTE_INDEX);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[ActionButtonColor.values().length];
            iArr[ActionButtonColor.BLUE.ordinal()] = 1;
            iArr[ActionButtonColor.GRAY.ordinal()] = 2;
            iArr[ActionButtonColor.WHITE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public final ColorStateList retrieveColorResource(Context context) {
        int i;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            i = C17165R.color.blue_color_600;
        } else if (i2 == 2) {
            i = C17165R.color.gray_color_200;
        } else if (i2 == 3) {
            i = C17165R.color.paypal_white;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ColorStateList b = C8184a.m16459b(context, i);
        C19383o.m32794d(b);
        return b;
    }
}
