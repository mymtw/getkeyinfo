package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Locale {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("country")
    private final String country;
    @C18417a("culture")
    private final String culture;
    @C18417a("directionality")
    private final String directionality;
    @C18417a("language")
    private final String language;
    @C18417a("locale")
    private final String locale;

    public Locale() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 63, (DefaultConstructorMarker) null);
    }

    public Locale(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.locale = str;
        this.language = str2;
        this.culture = str3;
        this.directionality = str4;
        this.country = str5;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Locale copy$default(Locale locale2, String str, String str2, String str3, String str4, String str5, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locale2.locale;
        }
        if ((i & 2) != 0) {
            str2 = locale2.language;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = locale2.culture;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = locale2.directionality;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = locale2.country;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            map = locale2.additionalProperties;
        }
        return locale2.copy(str, str6, str7, str8, str9, map);
    }

    public final String component1() {
        return this.locale;
    }

    public final String component2() {
        return this.language;
    }

    public final String component3() {
        return this.culture;
    }

    public final String component4() {
        return this.directionality;
    }

    public final String component5() {
        return this.country;
    }

    public final Map<String, Object> component6() {
        return this.additionalProperties;
    }

    public final Locale copy(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new Locale(str, str2, str3, str4, str5, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Locale)) {
            return false;
        }
        Locale locale2 = (Locale) obj;
        return C19383o.m32792b(this.locale, locale2.locale) && C19383o.m32792b(this.language, locale2.language) && C19383o.m32792b(this.culture, locale2.culture) && C19383o.m32792b(this.directionality, locale2.directionality) && C19383o.m32792b(this.country, locale2.country) && C19383o.m32792b(this.additionalProperties, locale2.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCulture() {
        return this.culture;
    }

    public final String getDirectionality() {
        return this.directionality;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLocale() {
        return this.locale;
    }

    public int hashCode() {
        String str = this.locale;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.language;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.culture;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.directionality;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode4 + i) * 31);
    }

    public String toString() {
        String str = this.locale;
        String str2 = this.language;
        String str3 = this.culture;
        String str4 = this.directionality;
        String str5 = this.country;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder f = C0388a.m1050f("Locale(locale=", str, ", language=", str2, ", culture=");
        C0391c.m1061h(f, str3, ", directionality=", str4, ", country=");
        f.append(str5);
        f.append(", additionalProperties=");
        f.append(map);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Locale(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r9
        L_0x0023:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002c
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x002c:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Locale.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
