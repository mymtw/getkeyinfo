package com.paypal.checkout.order;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum OrderStatus {
    CREATED,
    SAVED,
    APPROVED,
    VOIDED,
    COMPLETED,
    PAYER_ACTION_REQUIRED;
    
    public static final Companion Companion = null;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OrderStatus invoke(String str) {
            C19383o.m32797g(str, ResponseConstants.STATUS);
            Locale locale = Locale.US;
            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
            String upperCase = str.toUpperCase(locale);
            C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            switch (upperCase.hashCode()) {
                case -1757659853:
                    if (upperCase.equals("VOIDED")) {
                        return OrderStatus.VOIDED;
                    }
                    break;
                case -1493926274:
                    if (upperCase.equals("PAYER_ACTION_REQUIRED")) {
                        return OrderStatus.PAYER_ACTION_REQUIRED;
                    }
                    break;
                case 78673511:
                    if (upperCase.equals("SAVED")) {
                        return OrderStatus.SAVED;
                    }
                    break;
                case 1383663147:
                    if (upperCase.equals("COMPLETED")) {
                        return OrderStatus.COMPLETED;
                    }
                    break;
                case 1746537160:
                    if (upperCase.equals("CREATED")) {
                        return OrderStatus.CREATED;
                    }
                    break;
                case 1967871671:
                    if (upperCase.equals("APPROVED")) {
                        return OrderStatus.APPROVED;
                    }
                    break;
            }
            throw new IllegalArgumentException(C0326j.m864i("Attempted to create invalid status: ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }
}
