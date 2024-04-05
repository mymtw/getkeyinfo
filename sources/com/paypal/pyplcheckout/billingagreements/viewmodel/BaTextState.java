package com.paypal.pyplcheckout.billingagreements.viewmodel;

import android.support.p013v4.media.C0071c;
import com.paypal.pyplcheckout.pojo.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class BaTextState {

    public static final class Hide extends BaTextState {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Show extends BaTextState {
        private final String merchantName;
        private final int resource;
        private final Locale userLocale;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Show(String str, Locale locale, int i) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "merchantName");
            this.merchantName = str;
            this.userLocale = locale;
            this.resource = i;
        }

        public static /* synthetic */ Show copy$default(Show show, String str, Locale locale, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = show.merchantName;
            }
            if ((i2 & 2) != 0) {
                locale = show.userLocale;
            }
            if ((i2 & 4) != 0) {
                i = show.resource;
            }
            return show.copy(str, locale, i);
        }

        public final String component1() {
            return this.merchantName;
        }

        public final Locale component2() {
            return this.userLocale;
        }

        public final int component3() {
            return this.resource;
        }

        public final Show copy(String str, Locale locale, int i) {
            C19383o.m32797g(str, "merchantName");
            return new Show(str, locale, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Show)) {
                return false;
            }
            Show show = (Show) obj;
            return C19383o.m32792b(this.merchantName, show.merchantName) && C19383o.m32792b(this.userLocale, show.userLocale) && this.resource == show.resource;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final int getResource() {
            return this.resource;
        }

        public final Locale getUserLocale() {
            return this.userLocale;
        }

        public int hashCode() {
            int hashCode = this.merchantName.hashCode() * 31;
            Locale locale = this.userLocale;
            return Integer.hashCode(this.resource) + ((hashCode + (locale == null ? 0 : locale.hashCode())) * 31);
        }

        public String toString() {
            String str = this.merchantName;
            Locale locale = this.userLocale;
            int i = this.resource;
            StringBuilder sb = new StringBuilder();
            sb.append("Show(merchantName=");
            sb.append(str);
            sb.append(", userLocale=");
            sb.append(locale);
            sb.append(", resource=");
            return C0071c.m191c(sb, i, ")");
        }
    }

    private BaTextState() {
    }

    public /* synthetic */ BaTextState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
