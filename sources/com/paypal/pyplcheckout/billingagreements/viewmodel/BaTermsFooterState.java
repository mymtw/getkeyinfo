package com.paypal.pyplcheckout.billingagreements.viewmodel;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class BaTermsFooterState {

    public static final class Hide extends BaTermsFooterState {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowLink extends BaTermsFooterState {
        private final String link;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowLink(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, ResponseConstants.LINK);
            this.link = str;
        }

        public static /* synthetic */ ShowLink copy$default(ShowLink showLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showLink.link;
            }
            return showLink.copy(str);
        }

        public final String component1() {
            return this.link;
        }

        public final ShowLink copy(String str) {
            C19383o.m32797g(str, ResponseConstants.LINK);
            return new ShowLink(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLink) && C19383o.m32792b(this.link, ((ShowLink) obj).link);
        }

        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        public String toString() {
            return C0048b.m163a("ShowLink(link=", this.link, ")");
        }
    }

    private BaTermsFooterState() {
    }

    public /* synthetic */ BaTermsFooterState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
