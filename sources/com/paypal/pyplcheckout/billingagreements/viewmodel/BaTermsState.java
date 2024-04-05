package com.paypal.pyplcheckout.billingagreements.viewmodel;

import android.support.p013v4.media.C0069a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public abstract class BaTermsState {

    public static final class Hide extends BaTermsState {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowLinkText extends BaTermsState {
        private final String merchantName;
        private final int stringRes;
        private final String url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowLinkText(int i, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "merchantName");
            C19383o.m32797g(str2, "url");
            this.stringRes = i;
            this.merchantName = str;
            this.url = str2;
        }

        public static /* synthetic */ ShowLinkText copy$default(ShowLinkText showLinkText, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showLinkText.stringRes;
            }
            if ((i2 & 2) != 0) {
                str = showLinkText.merchantName;
            }
            if ((i2 & 4) != 0) {
                str2 = showLinkText.url;
            }
            return showLinkText.copy(i, str, str2);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final String component2() {
            return this.merchantName;
        }

        public final String component3() {
            return this.url;
        }

        public final ShowLinkText copy(int i, String str, String str2) {
            C19383o.m32797g(str, "merchantName");
            C19383o.m32797g(str2, "url");
            return new ShowLinkText(i, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowLinkText)) {
                return false;
            }
            ShowLinkText showLinkText = (ShowLinkText) obj;
            return this.stringRes == showLinkText.stringRes && C19383o.m32792b(this.merchantName, showLinkText.merchantName) && C19383o.m32792b(this.url, showLinkText.url);
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + C0023f.m105e(this.merchantName, Integer.hashCode(this.stringRes) * 31, 31);
        }

        public String toString() {
            int i = this.stringRes;
            String str = this.merchantName;
            String str2 = this.url;
            StringBuilder sb = new StringBuilder();
            sb.append("ShowLinkText(stringRes=");
            sb.append(i);
            sb.append(", merchantName=");
            sb.append(str);
            sb.append(", url=");
            return C0023f.m110k(sb, str2, ")");
        }
    }

    public static final class ShowText extends BaTermsState {
        private final int stringRes;

        public ShowText(int i) {
            super((DefaultConstructorMarker) null);
            this.stringRes = i;
        }

        public static /* synthetic */ ShowText copy$default(ShowText showText, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showText.stringRes;
            }
            return showText.copy(i);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final ShowText copy(int i) {
            return new ShowText(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowText) && this.stringRes == ((ShowText) obj).stringRes;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return Integer.hashCode(this.stringRes);
        }

        public String toString() {
            return C0069a.m175f("ShowText(stringRes=", this.stringRes, ")");
        }
    }

    private BaTermsState() {
    }

    public /* synthetic */ BaTermsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
