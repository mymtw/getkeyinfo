package com.etsy.android.p327ui.user.help;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.help.PhoneRegion */
public final class PhoneRegion {

    /* renamed from: a */
    public final String f25424a;

    /* renamed from: b */
    public final String f25425b;

    /* renamed from: c */
    public final List<String> f25426c;

    public PhoneRegion() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public PhoneRegion(@C17402n(name = "name") String str, @C17402n(name = "phoneNumber") String str2, @C17402n(name = "regionCodes") List<String> list) {
        this.f25424a = str;
        this.f25425b = str2;
        this.f25426c = list;
    }

    public final PhoneRegion copy(@C17402n(name = "name") String str, @C17402n(name = "phoneNumber") String str2, @C17402n(name = "regionCodes") List<String> list) {
        return new PhoneRegion(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneRegion)) {
            return false;
        }
        PhoneRegion phoneRegion = (PhoneRegion) obj;
        return C19383o.m32792b(this.f25424a, phoneRegion.f25424a) && C19383o.m32792b(this.f25425b, phoneRegion.f25425b) && C19383o.m32792b(this.f25426c, phoneRegion.f25426c);
    }

    public final int hashCode() {
        String str = this.f25424a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25425b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f25426c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PhoneRegion(name=");
        h.append(this.f25424a);
        h.append(", phoneNumber=");
        h.append(this.f25425b);
        h.append(", regionCodes=");
        return C0070b.m186i(h, this.f25426c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhoneRegion(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
