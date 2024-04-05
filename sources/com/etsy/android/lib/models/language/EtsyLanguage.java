package com.etsy.android.lib.models.language;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class EtsyLanguage {
    public static final int $stable = 0;
    private final String code;

    /* renamed from: id */
    private final String f19155id;
    private final String name;

    public EtsyLanguage() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public EtsyLanguage(@C17402n(name = "code") String str, @C17402n(name = "id") String str2, @C17402n(name = "name") String str3) {
        this.code = str;
        this.f19155id = str2;
        this.name = str3;
    }

    public static /* synthetic */ EtsyLanguage copy$default(EtsyLanguage etsyLanguage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = etsyLanguage.code;
        }
        if ((i & 2) != 0) {
            str2 = etsyLanguage.f19155id;
        }
        if ((i & 4) != 0) {
            str3 = etsyLanguage.name;
        }
        return etsyLanguage.copy(str, str2, str3);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.f19155id;
    }

    public final String component3() {
        return this.name;
    }

    public final EtsyLanguage copy(@C17402n(name = "code") String str, @C17402n(name = "id") String str2, @C17402n(name = "name") String str3) {
        return new EtsyLanguage(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EtsyLanguage)) {
            return false;
        }
        EtsyLanguage etsyLanguage = (EtsyLanguage) obj;
        return C19383o.m32792b(this.code, etsyLanguage.code) && C19383o.m32792b(this.f19155id, etsyLanguage.f19155id) && C19383o.m32792b(this.name, etsyLanguage.name);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.f19155id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19155id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("EtsyLanguage(code=");
        h.append(this.code);
        h.append(", id=");
        h.append(this.f19155id);
        h.append(", name=");
        return C0391c.m1057c(h, this.name, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EtsyLanguage(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
