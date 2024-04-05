package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.addresses.PostalCodeSuggestion */
public final class PostalCodeSuggestion {

    /* renamed from: a */
    public final String f25099a;

    /* renamed from: b */
    public final String f25100b;

    /* renamed from: c */
    public final String f25101c;

    /* renamed from: d */
    public final String f25102d;

    public PostalCodeSuggestion(String str, String str2, @C17402n(name = "postal_code") String str3, @C17402n(name = "state_code") String str4) {
        this.f25099a = str;
        this.f25100b = str2;
        this.f25101c = str3;
        this.f25102d = str4;
    }

    public final PostalCodeSuggestion copy(String str, String str2, @C17402n(name = "postal_code") String str3, @C17402n(name = "state_code") String str4) {
        return new PostalCodeSuggestion(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostalCodeSuggestion)) {
            return false;
        }
        PostalCodeSuggestion postalCodeSuggestion = (PostalCodeSuggestion) obj;
        return C19383o.m32792b(this.f25099a, postalCodeSuggestion.f25099a) && C19383o.m32792b(this.f25100b, postalCodeSuggestion.f25100b) && C19383o.m32792b(this.f25101c, postalCodeSuggestion.f25101c) && C19383o.m32792b(this.f25102d, postalCodeSuggestion.f25102d);
    }

    public final int hashCode() {
        String str = this.f25099a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25100b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25101c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25102d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PostalCodeSuggestion(city=");
        h.append(this.f25099a);
        h.append(", state=");
        h.append(this.f25100b);
        h.append(", postalCode=");
        h.append(this.f25101c);
        h.append(", stateCode=");
        return C0391c.m1057c(h, this.f25102d, ')');
    }
}
