package p321cc;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: cc.d */
public final class C8579d {

    /* renamed from: a */
    public final long f18666a;

    /* renamed from: b */
    public final int f18667b;

    /* renamed from: c */
    public final String f18668c = "control";

    /* renamed from: d */
    public final boolean f18669d;

    /* renamed from: e */
    public final String f18670e;

    /* renamed from: f */
    public final Integer f18671f;

    /* renamed from: g */
    public final Boolean f18672g;

    /* renamed from: h */
    public final Boolean f18673h;

    /* renamed from: i */
    public final Boolean f18674i;

    public C8579d(long j, int i, boolean z, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f18666a = j;
        this.f18667b = i;
        this.f18669d = z;
        this.f18670e = str;
        this.f18671f = num;
        this.f18672g = bool;
        this.f18673h = bool2;
        this.f18674i = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8579d)) {
            return false;
        }
        C8579d dVar = (C8579d) obj;
        return this.f18666a == dVar.f18666a && this.f18667b == dVar.f18667b && C19383o.m32792b(this.f18668c, dVar.f18668c) && this.f18669d == dVar.f18669d && C19383o.m32792b(this.f18670e, dVar.f18670e) && C19383o.m32792b(this.f18671f, dVar.f18671f) && C19383o.m32792b(this.f18672g, dVar.f18672g) && C19383o.m32792b(this.f18673h, dVar.f18673h) && C19383o.m32792b(this.f18674i, dVar.f18674i);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f18668c, C0069a.m170a(this.f18667b, Long.hashCode(this.f18666a) * 31, 31), 31);
        boolean z = this.f18669d;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        String str = this.f18670e;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f18671f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f18672g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f18673h;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f18674i;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingReviewsSpecs(listingId=");
        h.append(this.f18666a);
        h.append(", offset=");
        h.append(this.f18667b);
        h.append(", dsmlVariant=");
        h.append(this.f18668c);
        h.append(", filteringExperiment=");
        h.append(this.f18669d);
        h.append(", sort=");
        h.append(this.f18670e);
        h.append(", rating=");
        h.append(this.f18671f);
        h.append(", withPhotosOnly=");
        h.append(this.f18672g);
        h.append(", withVideosOnly=");
        h.append(this.f18673h);
        h.append(", includeVideos=");
        h.append(this.f18674i);
        h.append(')');
        return h.toString();
    }
}
