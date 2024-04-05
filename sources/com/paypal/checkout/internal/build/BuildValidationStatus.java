package com.paypal.checkout.internal.build;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class BuildValidationStatus {

    public static abstract class Invalid extends BuildValidationStatus {

        public static final class Expired extends Invalid {
            private final String reason;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Expired(String str) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, "reason");
                this.reason = str;
            }

            public static /* synthetic */ Expired copy$default(Expired expired, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = expired.getReason();
                }
                return expired.copy(str);
            }

            public final String component1() {
                return getReason();
            }

            public final Expired copy(String str) {
                C19383o.m32797g(str, "reason");
                return new Expired(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Expired) && C19383o.m32792b(getReason(), ((Expired) obj).getReason());
            }

            public String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return getReason().hashCode();
            }

            public String toString() {
                return C0048b.m163a("Expired(reason=", getReason(), ")");
            }
        }

        private Invalid() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ Invalid(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getReason();
    }

    public static final class Valid extends BuildValidationStatus {
        public static final Valid INSTANCE = new Valid();

        private Valid() {
            super((DefaultConstructorMarker) null);
        }
    }

    private BuildValidationStatus() {
    }

    public /* synthetic */ BuildValidationStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
