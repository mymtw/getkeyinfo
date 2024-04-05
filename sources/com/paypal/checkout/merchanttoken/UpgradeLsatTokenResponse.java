package com.paypal.checkout.merchanttoken;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class UpgradeLsatTokenResponse {

    public static final class Failed extends UpgradeLsatTokenResponse {
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Success extends UpgradeLsatTokenResponse {
        private final String upgradedAccessToken;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "upgradedAccessToken");
            this.upgradedAccessToken = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.upgradedAccessToken;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.upgradedAccessToken;
        }

        public final Success copy(String str) {
            C19383o.m32797g(str, "upgradedAccessToken");
            return new Success(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C19383o.m32792b(this.upgradedAccessToken, ((Success) obj).upgradedAccessToken);
        }

        public final String getUpgradedAccessToken() {
            return this.upgradedAccessToken;
        }

        public int hashCode() {
            return this.upgradedAccessToken.hashCode();
        }

        public String toString() {
            return C0048b.m163a("Success(upgradedAccessToken=", this.upgradedAccessToken, ")");
        }
    }

    private UpgradeLsatTokenResponse() {
    }

    public /* synthetic */ UpgradeLsatTokenResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
