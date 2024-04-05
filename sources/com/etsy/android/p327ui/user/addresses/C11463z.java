package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.addresses.AddressValidationError;
import com.etsy.android.lib.models.apiv3.addresses.UserAddress;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.z */
public abstract class C11463z {

    /* renamed from: com.etsy.android.ui.user.addresses.z$a */
    public static final class C11464a extends C11463z {

        /* renamed from: a */
        public final List<AddressValidationError> f25311a;

        public C11464a(List<AddressValidationError> list) {
            C19383o.m32797g(list, "errors");
            this.f25311a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11464a) && C19383o.m32792b(this.f25311a, ((C11464a) obj).f25311a);
        }

        public final int hashCode() {
            return this.f25311a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("AddressValidationResult(errors="), this.f25311a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.z$b */
    public static final class C11465b extends C11463z {

        /* renamed from: a */
        public final List<UserAddress> f25312a;

        public C11465b(List<UserAddress> list) {
            C19383o.m32797g(list, "addresses");
            this.f25312a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11465b) && C19383o.m32792b(this.f25312a, ((C11465b) obj).f25312a);
        }

        public final int hashCode() {
            return this.f25312a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("AddressesResult(addresses="), this.f25312a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.z$c */
    public static final class C11466c extends C11463z {

        /* renamed from: a */
        public final List<Country> f25313a;

        public C11466c(List<Country> list) {
            C19383o.m32797g(list, ResponseConstants.COUNTRIES);
            this.f25313a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11466c) && C19383o.m32792b(this.f25313a, ((C11466c) obj).f25313a);
        }

        public final int hashCode() {
            return this.f25313a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("CountriesResult(countries="), this.f25313a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.z$d */
    public static final class C11467d extends C11463z {

        /* renamed from: a */
        public static final C11467d f25314a = new C11467d();
    }

    /* renamed from: com.etsy.android.ui.user.addresses.z$e */
    public static final class C11468e extends C11463z {

        /* renamed from: a */
        public final UserAddress f25315a;

        public C11468e(UserAddress userAddress) {
            C19383o.m32797g(userAddress, "modifiedAddress");
            this.f25315a = userAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11468e) && C19383o.m32792b(this.f25315a, ((C11468e) obj).f25315a);
        }

        public final int hashCode() {
            return this.f25315a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("EditAddressResult(modifiedAddress=");
            h.append(this.f25315a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.z$f */
    public static final class C11469f extends C11463z {

        /* renamed from: a */
        public final AddressDetailsLayoutResponse f25316a;

        public C11469f(AddressDetailsLayoutResponse addressDetailsLayoutResponse) {
            C19383o.m32797g(addressDetailsLayoutResponse, "addressDetailsLayoutResponse");
            this.f25316a = addressDetailsLayoutResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11469f) && C19383o.m32792b(this.f25316a, ((C11469f) obj).f25316a);
        }

        public final int hashCode() {
            return this.f25316a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LayoutForCountryResult(addressDetailsLayoutResponse=");
            h.append(this.f25316a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.z$g */
    public static final class C11470g extends C11463z {

        /* renamed from: a */
        public final UserAddress f25317a;

        public C11470g(UserAddress userAddress) {
            C19383o.m32797g(userAddress, "addedAddress");
            this.f25317a = userAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11470g) && C19383o.m32792b(this.f25317a, ((C11470g) obj).f25317a);
        }

        public final int hashCode() {
            return this.f25317a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SaveAddressResult(addedAddress=");
            h.append(this.f25317a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.z$h */
    public static final class C11471h extends C11463z {

        /* renamed from: a */
        public final List<PostalCodeSuggestion> f25318a;

        public C11471h(List<PostalCodeSuggestion> list) {
            C19383o.m32797g(list, ResponseConstants.SUGGESTIONS);
            this.f25318a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11471h) && C19383o.m32792b(this.f25318a, ((C11471h) obj).f25318a);
        }

        public final int hashCode() {
            return this.f25318a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("SuggestionsForZipResult(suggestions="), this.f25318a, ')');
        }
    }
}
