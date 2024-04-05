package com.paypal.pyplcheckout.billingagreements.viewmodel;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class BaInfoHeaderState {

    public static final class Hide extends BaInfoHeaderState {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Show extends BaInfoHeaderState {
        private final int headerTextId;
        private final int linkTextId;
        private final String merchantName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Show(String str, int i, int i2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "merchantName");
            this.merchantName = str;
            this.headerTextId = i;
            this.linkTextId = i2;
        }

        public static /* synthetic */ Show copy$default(Show show, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = show.merchantName;
            }
            if ((i3 & 2) != 0) {
                i = show.headerTextId;
            }
            if ((i3 & 4) != 0) {
                i2 = show.linkTextId;
            }
            return show.copy(str, i, i2);
        }

        public final String component1() {
            return this.merchantName;
        }

        public final int component2() {
            return this.headerTextId;
        }

        public final int component3() {
            return this.linkTextId;
        }

        public final Show copy(String str, int i, int i2) {
            C19383o.m32797g(str, "merchantName");
            return new Show(str, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Show)) {
                return false;
            }
            Show show = (Show) obj;
            return C19383o.m32792b(this.merchantName, show.merchantName) && this.headerTextId == show.headerTextId && this.linkTextId == show.linkTextId;
        }

        public final int getHeaderTextId() {
            return this.headerTextId;
        }

        public final int getLinkTextId() {
            return this.linkTextId;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public int hashCode() {
            return Integer.hashCode(this.linkTextId) + C0069a.m170a(this.headerTextId, this.merchantName.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.merchantName;
            int i = this.headerTextId;
            int i2 = this.linkTextId;
            StringBuilder sb = new StringBuilder();
            sb.append("Show(merchantName=");
            sb.append(str);
            sb.append(", headerTextId=");
            sb.append(i);
            sb.append(", linkTextId=");
            return C0071c.m191c(sb, i2, ")");
        }
    }

    private BaInfoHeaderState() {
    }

    public /* synthetic */ BaInfoHeaderState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
