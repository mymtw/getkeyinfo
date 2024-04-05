package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.a0 */
public abstract class C11381a0 {

    /* renamed from: com.etsy.android.ui.user.addresses.a0$a */
    public static final class C11382a extends C11381a0 {

        /* renamed from: a */
        public final Long f25109a;

        public C11382a(Long l) {
            this.f25109a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11382a) && C19383o.m32792b(this.f25109a, ((C11382a) obj).f25109a);
        }

        public final int hashCode() {
            Long l = this.f25109a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("DeleteAddressSpec(addressId=");
            h.append(this.f25109a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a0$b */
    public static final class C11383b extends C11381a0 {

        /* renamed from: a */
        public final long f25110a;

        /* renamed from: b */
        public final C11462y f25111b;

        public C11383b(long j, C11462y yVar) {
            this.f25110a = j;
            this.f25111b = yVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11383b)) {
                return false;
            }
            C11383b bVar = (C11383b) obj;
            return this.f25110a == bVar.f25110a && C19383o.m32792b(this.f25111b, bVar.f25111b);
        }

        public final int hashCode() {
            return this.f25111b.hashCode() + (Long.hashCode(this.f25110a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("EditAddressSpec(addressId=");
            h.append(this.f25110a);
            h.append(", address=");
            h.append(this.f25111b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a0$c */
    public static final class C11384c extends C11381a0 {

        /* renamed from: a */
        public static final C11384c f25112a = new C11384c();
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a0$d */
    public static final class C11385d extends C11381a0 {

        /* renamed from: a */
        public static final C11385d f25113a = new C11385d();
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a0$e */
    public static final class C11386e extends C11381a0 {

        /* renamed from: a */
        public final int f25114a;

        public C11386e(int i) {
            this.f25114a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11386e) && this.f25114a == ((C11386e) obj).f25114a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25114a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("LayoutForCountrySpec(countryId="), this.f25114a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a0$f */
    public static final class C11387f extends C11381a0 {

        /* renamed from: a */
        public final C11462y f25115a;

        public C11387f(C11462y yVar) {
            this.f25115a = yVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11387f) && C19383o.m32792b(this.f25115a, ((C11387f) obj).f25115a);
        }

        public final int hashCode() {
            return this.f25115a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SaveAddressSpec(address=");
            h.append(this.f25115a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a0$g */
    public static final class C11388g extends C11381a0 {

        /* renamed from: a */
        public final String f25116a;

        /* renamed from: b */
        public final int f25117b = 209;

        public C11388g(String str) {
            C19383o.m32797g(str, "postalCode");
            this.f25116a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11388g)) {
                return false;
            }
            C11388g gVar = (C11388g) obj;
            return C19383o.m32792b(this.f25116a, gVar.f25116a) && this.f25117b == gVar.f25117b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25117b) + (this.f25116a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SuggestionForZipSpec(postalCode=");
            h.append(this.f25116a);
            h.append(", countryId=");
            return C0073e.m208h(h, this.f25117b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a0$h */
    public static final class C11389h extends C11381a0 {

        /* renamed from: a */
        public final C11462y f25118a;

        public C11389h(C11462y yVar) {
            this.f25118a = yVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11389h) && C19383o.m32792b(this.f25118a, ((C11389h) obj).f25118a);
        }

        public final int hashCode() {
            return this.f25118a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ValidateAddressSpec(address=");
            h.append(this.f25118a);
            h.append(')');
            return h.toString();
        }
    }
}
