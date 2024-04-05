package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopLanguage {
    public static final int $stable = 0;
    private final String code;

    /* renamed from: id */
    private final Long f19146id;
    private final Integer isMachineLanguage;
    private final String langCode;
    private final Integer langId;
    private final String language;
    private final String machineCode;
    private final Long machineId;
    private final String name;

    public ShopLanguage(@C17402n(name = "code") String str, @C17402n(name = "id") Long l, @C17402n(name = "is_machine_language") Integer num, @C17402n(name = "lang_code") String str2, @C17402n(name = "lang_id") Integer num2, @C17402n(name = "language") String str3, @C17402n(name = "machine_code") String str4, @C17402n(name = "machine_id") Long l2, @C17402n(name = "name") String str5) {
        this.code = str;
        this.f19146id = l;
        this.isMachineLanguage = num;
        this.langCode = str2;
        this.langId = num2;
        this.language = str3;
        this.machineCode = str4;
        this.machineId = l2;
        this.name = str5;
    }

    public static /* synthetic */ ShopLanguage copy$default(ShopLanguage shopLanguage, String str, Long l, Integer num, String str2, Integer num2, String str3, String str4, Long l2, String str5, int i, Object obj) {
        ShopLanguage shopLanguage2 = shopLanguage;
        int i2 = i;
        return shopLanguage.copy((i2 & 1) != 0 ? shopLanguage2.code : str, (i2 & 2) != 0 ? shopLanguage2.f19146id : l, (i2 & 4) != 0 ? shopLanguage2.isMachineLanguage : num, (i2 & 8) != 0 ? shopLanguage2.langCode : str2, (i2 & 16) != 0 ? shopLanguage2.langId : num2, (i2 & 32) != 0 ? shopLanguage2.language : str3, (i2 & 64) != 0 ? shopLanguage2.machineCode : str4, (i2 & 128) != 0 ? shopLanguage2.machineId : l2, (i2 & 256) != 0 ? shopLanguage2.name : str5);
    }

    public final String component1() {
        return this.code;
    }

    public final Long component2() {
        return this.f19146id;
    }

    public final Integer component3() {
        return this.isMachineLanguage;
    }

    public final String component4() {
        return this.langCode;
    }

    public final Integer component5() {
        return this.langId;
    }

    public final String component6() {
        return this.language;
    }

    public final String component7() {
        return this.machineCode;
    }

    public final Long component8() {
        return this.machineId;
    }

    public final String component9() {
        return this.name;
    }

    public final ShopLanguage copy(@C17402n(name = "code") String str, @C17402n(name = "id") Long l, @C17402n(name = "is_machine_language") Integer num, @C17402n(name = "lang_code") String str2, @C17402n(name = "lang_id") Integer num2, @C17402n(name = "language") String str3, @C17402n(name = "machine_code") String str4, @C17402n(name = "machine_id") Long l2, @C17402n(name = "name") String str5) {
        return new ShopLanguage(str, l, num, str2, num2, str3, str4, l2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopLanguage)) {
            return false;
        }
        ShopLanguage shopLanguage = (ShopLanguage) obj;
        return C19383o.m32792b(this.code, shopLanguage.code) && C19383o.m32792b(this.f19146id, shopLanguage.f19146id) && C19383o.m32792b(this.isMachineLanguage, shopLanguage.isMachineLanguage) && C19383o.m32792b(this.langCode, shopLanguage.langCode) && C19383o.m32792b(this.langId, shopLanguage.langId) && C19383o.m32792b(this.language, shopLanguage.language) && C19383o.m32792b(this.machineCode, shopLanguage.machineCode) && C19383o.m32792b(this.machineId, shopLanguage.machineId) && C19383o.m32792b(this.name, shopLanguage.name);
    }

    public final String getCode() {
        return this.code;
    }

    public final Long getId() {
        return this.f19146id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final Integer getLangId() {
        return this.langId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getMachineCode() {
        return this.machineCode;
    }

    public final Long getMachineId() {
        return this.machineId;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f19146id;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.isMachineLanguage;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.langCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.langId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.language;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.machineCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.machineId;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.name;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode8 + i;
    }

    public final Integer isMachineLanguage() {
        return this.isMachineLanguage;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopLanguage(code=");
        h.append(this.code);
        h.append(", id=");
        h.append(this.f19146id);
        h.append(", isMachineLanguage=");
        h.append(this.isMachineLanguage);
        h.append(", langCode=");
        h.append(this.langCode);
        h.append(", langId=");
        h.append(this.langId);
        h.append(", language=");
        h.append(this.language);
        h.append(", machineCode=");
        h.append(this.machineCode);
        h.append(", machineId=");
        h.append(this.machineId);
        h.append(", name=");
        return C0391c.m1057c(h, this.name, ')');
    }
}
