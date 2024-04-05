package com.etsy.android.p327ui.user.circles;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

/* renamed from: com.etsy.android.ui.user.circles.a */
public final class C11506a {

    /* renamed from: a */
    public final String f25386a;

    /* renamed from: b */
    public final String f25387b;

    /* renamed from: c */
    public final String f25388c;

    /* renamed from: d */
    public final int f25389d;

    /* renamed from: e */
    public final String f25390e;

    /* renamed from: f */
    public final List<String> f25391f;

    public C11506a(String str, String str2, String str3, int i, String str4, ArrayList arrayList) {
        C0048b.m167f(str, "id", str2, "userName", str3, "formattedName");
        this.f25386a = str;
        this.f25387b = str2;
        this.f25388c = str3;
        this.f25389d = i;
        this.f25390e = str4;
        this.f25391f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11506a)) {
            return false;
        }
        C11506a aVar = (C11506a) obj;
        return C19383o.m32792b(this.f25386a, aVar.f25386a) && C19383o.m32792b(this.f25387b, aVar.f25387b) && C19383o.m32792b(this.f25388c, aVar.f25388c) && this.f25389d == aVar.f25389d && C19383o.m32792b(this.f25390e, aVar.f25390e) && C19383o.m32792b(this.f25391f, aVar.f25391f);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f25389d, C0023f.m105e(this.f25388c, C0023f.m105e(this.f25387b, this.f25386a.hashCode() * 31, 31), 31), 31);
        String str = this.f25390e;
        return this.f25391f.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CircledUser(id=");
        h.append(this.f25386a);
        h.append(", userName=");
        h.append(this.f25387b);
        h.append(", formattedName=");
        h.append(this.f25388c);
        h.append(", followerCount=");
        h.append(this.f25389d);
        h.append(", imageUrl75x75=");
        h.append(this.f25390e);
        h.append(", listingImages=");
        return C0070b.m186i(h, this.f25391f, ')');
    }
}
