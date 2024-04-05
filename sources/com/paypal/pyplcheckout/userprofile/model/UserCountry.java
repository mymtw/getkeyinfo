package com.paypal.pyplcheckout.userprofile.model;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class UserCountry {
    private final String country;
    private final String locale;

    /* renamed from: com.paypal.pyplcheckout.userprofile.model.UserCountry$EU */
    public static final class C17272EU extends UserCountry {
        private final String country;
        private final String locale;

        public C17272EU(String str, String str2) {
            super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            this.country = str;
            this.locale = str2;
        }

        public static /* synthetic */ C17272EU copy$default(C17272EU eu, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eu.getCountry();
            }
            if ((i & 2) != 0) {
                str2 = eu.getLocale();
            }
            return eu.copy(str, str2);
        }

        public final String component1() {
            return getCountry();
        }

        public final String component2() {
            return getLocale();
        }

        public final C17272EU copy(String str, String str2) {
            return new C17272EU(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17272EU)) {
                return false;
            }
            C17272EU eu = (C17272EU) obj;
            return C19383o.m32792b(getCountry(), eu.getCountry()) && C19383o.m32792b(getLocale(), eu.getLocale());
        }

        public String getCountry() {
            return this.country;
        }

        public String getLocale() {
            return this.locale;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (getCountry() == null ? 0 : getCountry().hashCode()) * 31;
            if (getLocale() != null) {
                i = getLocale().hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return C0048b.m164c("EU(country=", getCountry(), ", locale=", getLocale(), ")");
        }
    }

    public static final class Other extends UserCountry {
        private final String country;
        private final String locale;

        public Other(String str, String str2) {
            super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
            this.country = str;
            this.locale = str2;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.getCountry();
            }
            if ((i & 2) != 0) {
                str2 = other.getLocale();
            }
            return other.copy(str, str2);
        }

        public final String component1() {
            return getCountry();
        }

        public final String component2() {
            return getLocale();
        }

        public final Other copy(String str, String str2) {
            return new Other(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Other)) {
                return false;
            }
            Other other = (Other) obj;
            return C19383o.m32792b(getCountry(), other.getCountry()) && C19383o.m32792b(getLocale(), other.getLocale());
        }

        public String getCountry() {
            return this.country;
        }

        public String getLocale() {
            return this.locale;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (getCountry() == null ? 0 : getCountry().hashCode()) * 31;
            if (getLocale() != null) {
                i = getLocale().hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return C0048b.m164c("Other(country=", getCountry(), ", locale=", getLocale(), ")");
        }
    }

    /* renamed from: com.paypal.pyplcheckout.userprofile.model.UserCountry$US */
    public static final class C17273US extends UserCountry {
        private final String locale;

        public C17273US(String str) {
            super(UserStateKt.US_COUNTRY, (String) null, 2, (DefaultConstructorMarker) null);
            this.locale = str;
        }

        public static /* synthetic */ C17273US copy$default(C17273US us, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = us.getLocale();
            }
            return us.copy(str);
        }

        public final String component1() {
            return getLocale();
        }

        public final C17273US copy(String str) {
            return new C17273US(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17273US) && C19383o.m32792b(getLocale(), ((C17273US) obj).getLocale());
        }

        public String getLocale() {
            return this.locale;
        }

        public int hashCode() {
            if (getLocale() == null) {
                return 0;
            }
            return getLocale().hashCode();
        }

        public String toString() {
            return C0048b.m163a("US(locale=", getLocale(), ")");
        }
    }

    public static final class Unknown extends UserCountry {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
    }

    private UserCountry(String str, String str2) {
        this.country = str;
        this.locale = str2;
    }

    public /* synthetic */ UserCountry(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public String getCountry() {
        return this.country;
    }

    public String getLocale() {
        return this.locale;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserCountry(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (DefaultConstructorMarker) null);
    }
}
