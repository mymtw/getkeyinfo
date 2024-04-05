package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.support.p013v4.media.C0072d;
import java.util.Arrays;
import p513bj.C14049b0;
import p513bj.C14075p;

/* renamed from: com.google.android.exoplayer2.source.ads.a */
public final class C14290a {

    /* renamed from: g */
    public static final C14290a f31769g = new C14290a((Object) null, new long[0], (C14291a[]) null, 0, -9223372036854775807L);

    /* renamed from: a */
    public final Object f31770a;

    /* renamed from: b */
    public final int f31771b;

    /* renamed from: c */
    public final long[] f31772c;

    /* renamed from: d */
    public final C14291a[] f31773d;

    /* renamed from: e */
    public final long f31774e;

    /* renamed from: f */
    public final long f31775f;

    /* renamed from: com.google.android.exoplayer2.source.ads.a$a */
    public static final class C14291a {

        /* renamed from: a */
        public final int f31776a;

        /* renamed from: b */
        public final Uri[] f31777b;

        /* renamed from: c */
        public final int[] f31778c;

        /* renamed from: d */
        public final long[] f31779d;

        public C14291a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        /* renamed from: a */
        public final int mo47665a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f31778c;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    return i3;
                }
                i3++;
            }
            return i3;
        }

        /* renamed from: b */
        public final boolean mo47666b() {
            return this.f31776a == -1 || mo47665a(-1) < this.f31776a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14291a.class != obj.getClass()) {
                return false;
            }
            C14291a aVar = (C14291a) obj;
            return this.f31776a == aVar.f31776a && Arrays.equals(this.f31777b, aVar.f31777b) && Arrays.equals(this.f31778c, aVar.f31778c) && Arrays.equals(this.f31779d, aVar.f31779d);
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f31778c);
            return Arrays.hashCode(this.f31779d) + ((hashCode + (((this.f31776a * 31) + Arrays.hashCode(this.f31777b)) * 31)) * 31);
        }

        public C14291a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C14075p.m21691c(iArr.length == uriArr.length);
            this.f31776a = i;
            this.f31778c = iArr;
            this.f31777b = uriArr;
            this.f31779d = jArr;
        }
    }

    public C14290a(Object obj, long[] jArr, C14291a[] aVarArr, long j, long j2) {
        C14075p.m21691c(aVarArr == null || aVarArr.length == jArr.length);
        this.f31770a = obj;
        this.f31772c = jArr;
        this.f31774e = j;
        this.f31775f = j2;
        int length = jArr.length;
        this.f31771b = length;
        if (aVarArr == null) {
            aVarArr = new C14291a[length];
            for (int i = 0; i < this.f31771b; i++) {
                aVarArr[i] = new C14291a();
            }
        }
        this.f31773d = aVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14290a.class != obj.getClass()) {
            return false;
        }
        C14290a aVar = (C14290a) obj;
        return C14049b0.m21628a(this.f31770a, aVar.f31770a) && this.f31771b == aVar.f31771b && this.f31774e == aVar.f31774e && this.f31775f == aVar.f31775f && Arrays.equals(this.f31772c, aVar.f31772c) && Arrays.equals(this.f31773d, aVar.f31773d);
    }

    public final int hashCode() {
        int i = this.f31771b * 31;
        Object obj = this.f31770a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        return Arrays.hashCode(this.f31773d) + ((Arrays.hashCode(this.f31772c) + ((((((i + hashCode) * 31) + ((int) this.f31774e)) * 31) + ((int) this.f31775f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AdPlaybackState(adsId=");
        h.append(this.f31770a);
        h.append(", adResumePositionUs=");
        h.append(this.f31774e);
        h.append(", adGroups=[");
        for (int i = 0; i < this.f31773d.length; i++) {
            h.append("adGroup(timeUs=");
            h.append(this.f31772c[i]);
            h.append(", ads=[");
            for (int i2 = 0; i2 < this.f31773d[i].f31778c.length; i2++) {
                h.append("ad(state=");
                int i3 = this.f31773d[i].f31778c[i2];
                if (i3 == 0) {
                    h.append('_');
                } else if (i3 == 1) {
                    h.append('R');
                } else if (i3 == 2) {
                    h.append('S');
                } else if (i3 == 3) {
                    h.append('P');
                } else if (i3 != 4) {
                    h.append(RFC1522Codec.SEP);
                } else {
                    h.append('!');
                }
                h.append(", durationUs=");
                h.append(this.f31773d[i].f31779d[i2]);
                h.append(')');
                if (i2 < this.f31773d[i].f31778c.length - 1) {
                    h.append(", ");
                }
            }
            h.append("])");
            if (i < this.f31773d.length - 1) {
                h.append(", ");
            }
        }
        h.append("])");
        return h.toString();
    }
}
