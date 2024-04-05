package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse */
public final class AddressDetailsLayoutResponse {

    /* renamed from: a */
    public final String f25072a;

    /* renamed from: b */
    public final String f25073b;

    /* renamed from: c */
    public final List<String> f25074c;

    /* renamed from: d */
    public final List<String> f25075d;

    /* renamed from: e */
    public final String f25076e;

    /* renamed from: f */
    public final String f25077f;

    /* renamed from: g */
    public final String f25078g;

    /* renamed from: h */
    public final String f25079h;

    /* renamed from: i */
    public final String f25080i;

    /* renamed from: j */
    public final String f25081j;

    /* renamed from: k */
    public final Map<String, String> f25082k;

    /* renamed from: l */
    public final String f25083l;

    /* renamed from: m */
    public final String f25084m;

    /* renamed from: n */
    public final String f25085n;

    /* renamed from: o */
    public final Map<String, List<String>> f25086o;

    /* renamed from: p */
    public final String f25087p;

    /* renamed from: q */
    public final String f25088q;

    public AddressDetailsLayoutResponse(String str, String str2, @C17402n(name = "required_fields") List<String> list, @C17402n(name = "uppercase_fields") List<String> list2, @C17402n(name = "name") String str3, @C17402n(name = "administrative_area_type") String str4, @C17402n(name = "locality_type") String str5, @C17402n(name = "postal_code_type") String str6, @C17402n(name = "second_line_type") String str7, @C17402n(name = "postal_code_pattern") String str8, @C17402n(name = "administrative_areas") Map<String, String> map, @C17402n(name = "input_format") String str9, @C17402n(name = "local_input_format") String str10, @C17402n(name = "iso_code") String str11, @C17402n(name = "administrative_area_translation_map") Map<String, ? extends List<String>> map2, @C17402n(name = "phone") String str12, @C17402n(name = "invalid_address_char_pattern") String str13) {
        this.f25072a = str;
        this.f25073b = str2;
        this.f25074c = list;
        this.f25075d = list2;
        this.f25076e = str3;
        this.f25077f = str4;
        this.f25078g = str5;
        this.f25079h = str6;
        this.f25080i = str7;
        this.f25081j = str8;
        this.f25082k = map;
        this.f25083l = str9;
        this.f25084m = str10;
        this.f25085n = str11;
        this.f25086o = map2;
        this.f25087p = str12;
        this.f25088q = str13;
    }

    public final AddressDetailsLayoutResponse copy(String str, String str2, @C17402n(name = "required_fields") List<String> list, @C17402n(name = "uppercase_fields") List<String> list2, @C17402n(name = "name") String str3, @C17402n(name = "administrative_area_type") String str4, @C17402n(name = "locality_type") String str5, @C17402n(name = "postal_code_type") String str6, @C17402n(name = "second_line_type") String str7, @C17402n(name = "postal_code_pattern") String str8, @C17402n(name = "administrative_areas") Map<String, String> map, @C17402n(name = "input_format") String str9, @C17402n(name = "local_input_format") String str10, @C17402n(name = "iso_code") String str11, @C17402n(name = "administrative_area_translation_map") Map<String, ? extends List<String>> map2, @C17402n(name = "phone") String str12, @C17402n(name = "invalid_address_char_pattern") String str13) {
        return new AddressDetailsLayoutResponse(str, str2, list, list2, str3, str4, str5, str6, str7, str8, map, str9, str10, str11, map2, str12, str13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDetailsLayoutResponse)) {
            return false;
        }
        AddressDetailsLayoutResponse addressDetailsLayoutResponse = (AddressDetailsLayoutResponse) obj;
        return C19383o.m32792b(this.f25072a, addressDetailsLayoutResponse.f25072a) && C19383o.m32792b(this.f25073b, addressDetailsLayoutResponse.f25073b) && C19383o.m32792b(this.f25074c, addressDetailsLayoutResponse.f25074c) && C19383o.m32792b(this.f25075d, addressDetailsLayoutResponse.f25075d) && C19383o.m32792b(this.f25076e, addressDetailsLayoutResponse.f25076e) && C19383o.m32792b(this.f25077f, addressDetailsLayoutResponse.f25077f) && C19383o.m32792b(this.f25078g, addressDetailsLayoutResponse.f25078g) && C19383o.m32792b(this.f25079h, addressDetailsLayoutResponse.f25079h) && C19383o.m32792b(this.f25080i, addressDetailsLayoutResponse.f25080i) && C19383o.m32792b(this.f25081j, addressDetailsLayoutResponse.f25081j) && C19383o.m32792b(this.f25082k, addressDetailsLayoutResponse.f25082k) && C19383o.m32792b(this.f25083l, addressDetailsLayoutResponse.f25083l) && C19383o.m32792b(this.f25084m, addressDetailsLayoutResponse.f25084m) && C19383o.m32792b(this.f25085n, addressDetailsLayoutResponse.f25085n) && C19383o.m32792b(this.f25086o, addressDetailsLayoutResponse.f25086o) && C19383o.m32792b(this.f25087p, addressDetailsLayoutResponse.f25087p) && C19383o.m32792b(this.f25088q, addressDetailsLayoutResponse.f25088q);
    }

    public final int hashCode() {
        String str = this.f25072a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25073b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f25074c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f25075d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.f25076e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25077f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25078g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25079h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25080i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f25081j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, String> map = this.f25082k;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.f25083l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f25084m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f25085n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Map<String, List<String>> map2 = this.f25086o;
        int hashCode15 = (hashCode14 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str12 = this.f25087p;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f25088q;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return hashCode16 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AddressDetailsLayoutResponse(locale=");
        h.append(this.f25072a);
        h.append(", format=");
        h.append(this.f25073b);
        h.append(", requiredFields=");
        h.append(this.f25074c);
        h.append(", uppercaseFields=");
        h.append(this.f25075d);
        h.append(", countryName=");
        h.append(this.f25076e);
        h.append(", administrativeAreaType=");
        h.append(this.f25077f);
        h.append(", localityType=");
        h.append(this.f25078g);
        h.append(", postalCodeType=");
        h.append(this.f25079h);
        h.append(", secondLineType=");
        h.append(this.f25080i);
        h.append(", postalCodePattern=");
        h.append(this.f25081j);
        h.append(", administrativeAreas=");
        h.append(this.f25082k);
        h.append(", inputFormat=");
        h.append(this.f25083l);
        h.append(", localInputFormat=");
        h.append(this.f25084m);
        h.append(", isoCode=");
        h.append(this.f25085n);
        h.append(", administrativeAreaTranslationMap=");
        h.append(this.f25086o);
        h.append(", phoneNumber=");
        h.append(this.f25087p);
        h.append(", invalidAddressCharPattern=");
        return C0391c.m1057c(h, this.f25088q, ')');
    }
}
