package p594jh;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p513bj.C14049b0;
import p513bj.C14075p;

/* renamed from: jh.o0 */
public final class C17954o0 {

    /* renamed from: a */
    public final String f39137a;

    /* renamed from: b */
    public final C17960f f39138b;

    /* renamed from: c */
    public final C17959e f39139c;

    /* renamed from: d */
    public final C17963p0 f39140d;

    /* renamed from: e */
    public final C17957c f39141e;

    /* renamed from: jh.o0$a */
    public static final class C17955a {

        /* renamed from: a */
        public final Uri f39142a;

        /* renamed from: b */
        public final Object f39143b;

        public C17955a(Uri uri, Object obj) {
            this.f39142a = uri;
            this.f39143b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17955a)) {
                return false;
            }
            C17955a aVar = (C17955a) obj;
            return this.f39142a.equals(aVar.f39142a) && C14049b0.m21628a(this.f39143b, aVar.f39143b);
        }

        public final int hashCode() {
            int hashCode = this.f39142a.hashCode() * 31;
            Object obj = this.f39143b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* renamed from: jh.o0$b */
    public static final class C17956b {

        /* renamed from: A */
        public float f39144A = -3.4028235E38f;

        /* renamed from: a */
        public String f39145a;

        /* renamed from: b */
        public Uri f39146b;

        /* renamed from: c */
        public String f39147c;

        /* renamed from: d */
        public long f39148d;

        /* renamed from: e */
        public boolean f39149e;

        /* renamed from: f */
        public boolean f39150f;

        /* renamed from: g */
        public boolean f39151g;

        /* renamed from: h */
        public Uri f39152h;

        /* renamed from: i */
        public Map<String, String> f39153i = Collections.emptyMap();

        /* renamed from: j */
        public UUID f39154j;

        /* renamed from: k */
        public boolean f39155k;

        /* renamed from: l */
        public boolean f39156l;

        /* renamed from: m */
        public boolean f39157m;

        /* renamed from: n */
        public List<Integer> f39158n = Collections.emptyList();

        /* renamed from: o */
        public byte[] f39159o;

        /* renamed from: p */
        public List<StreamKey> f39160p = Collections.emptyList();

        /* renamed from: q */
        public String f39161q;

        /* renamed from: r */
        public List<C17961g> f39162r = Collections.emptyList();

        /* renamed from: s */
        public Uri f39163s;

        /* renamed from: t */
        public Object f39164t;

        /* renamed from: u */
        public Object f39165u;

        /* renamed from: v */
        public C17963p0 f39166v;

        /* renamed from: w */
        public long f39167w = -9223372036854775807L;

        /* renamed from: x */
        public long f39168x = -9223372036854775807L;

        /* renamed from: y */
        public long f39169y = -9223372036854775807L;

        /* renamed from: z */
        public float f39170z = -3.4028235E38f;

        /* renamed from: a */
        public final C17954o0 mo69497a() {
            C17960f fVar;
            C14075p.m21694f(this.f39152h == null || this.f39154j != null);
            Uri uri = this.f39146b;
            C17955a aVar = null;
            if (uri != null) {
                String str = this.f39147c;
                UUID uuid = this.f39154j;
                C17958d dVar = uuid != null ? new C17958d(uuid, this.f39152h, this.f39153i, this.f39155k, this.f39157m, this.f39156l, this.f39158n, this.f39159o) : null;
                Uri uri2 = this.f39163s;
                if (uri2 != null) {
                    aVar = new C17955a(uri2, this.f39164t);
                }
                fVar = new C17960f(uri, str, dVar, aVar, this.f39160p, this.f39161q, this.f39162r, this.f39165u);
            } else {
                fVar = null;
            }
            String str2 = this.f39145a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C17957c cVar = new C17957c(this.f39148d, Long.MIN_VALUE, this.f39149e, this.f39150f, this.f39151g);
            C17959e eVar = new C17959e(this.f39167w, this.f39168x, this.f39169y, this.f39170z, this.f39144A);
            C17963p0 p0Var = this.f39166v;
            if (p0Var == null) {
                p0Var = C17963p0.f39198q;
            }
            return new C17954o0(str3, cVar, fVar, eVar, p0Var);
        }
    }

    /* renamed from: jh.o0$c */
    public static final class C17957c {

        /* renamed from: a */
        public final long f39171a;

        /* renamed from: b */
        public final long f39172b;

        /* renamed from: c */
        public final boolean f39173c;

        /* renamed from: d */
        public final boolean f39174d;

        /* renamed from: e */
        public final boolean f39175e;

        public C17957c(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f39171a = j;
            this.f39172b = j2;
            this.f39173c = z;
            this.f39174d = z2;
            this.f39175e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17957c)) {
                return false;
            }
            C17957c cVar = (C17957c) obj;
            return this.f39171a == cVar.f39171a && this.f39172b == cVar.f39172b && this.f39173c == cVar.f39173c && this.f39174d == cVar.f39174d && this.f39175e == cVar.f39175e;
        }

        public final int hashCode() {
            long j = this.f39171a;
            long j2 = this.f39172b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f39173c ? 1 : 0)) * 31) + (this.f39174d ? 1 : 0)) * 31) + (this.f39175e ? 1 : 0);
        }
    }

    /* renamed from: jh.o0$d */
    public static final class C17958d {

        /* renamed from: a */
        public final UUID f39176a;

        /* renamed from: b */
        public final Uri f39177b;

        /* renamed from: c */
        public final Map<String, String> f39178c;

        /* renamed from: d */
        public final boolean f39179d;

        /* renamed from: e */
        public final boolean f39180e;

        /* renamed from: f */
        public final boolean f39181f;

        /* renamed from: g */
        public final List<Integer> f39182g;

        /* renamed from: h */
        public final byte[] f39183h;

        public C17958d() {
            throw null;
        }

        public C17958d(UUID uuid, Uri uri, Map map, boolean z, boolean z2, boolean z3, List list, byte[] bArr) {
            C14075p.m21691c(!z2 || uri != null);
            this.f39176a = uuid;
            this.f39177b = uri;
            this.f39178c = map;
            this.f39179d = z;
            this.f39181f = z2;
            this.f39180e = z3;
            this.f39182g = list;
            this.f39183h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17958d)) {
                return false;
            }
            C17958d dVar = (C17958d) obj;
            return this.f39176a.equals(dVar.f39176a) && C14049b0.m21628a(this.f39177b, dVar.f39177b) && C14049b0.m21628a(this.f39178c, dVar.f39178c) && this.f39179d == dVar.f39179d && this.f39181f == dVar.f39181f && this.f39180e == dVar.f39180e && this.f39182g.equals(dVar.f39182g) && Arrays.equals(this.f39183h, dVar.f39183h);
        }

        public final int hashCode() {
            int hashCode = this.f39176a.hashCode() * 31;
            Uri uri = this.f39177b;
            int hashCode2 = uri != null ? uri.hashCode() : 0;
            int hashCode3 = this.f39178c.hashCode();
            return Arrays.hashCode(this.f39183h) + ((this.f39182g.hashCode() + ((((((((hashCode3 + ((hashCode + hashCode2) * 31)) * 31) + (this.f39179d ? 1 : 0)) * 31) + (this.f39181f ? 1 : 0)) * 31) + (this.f39180e ? 1 : 0)) * 31)) * 31);
        }
    }

    /* renamed from: jh.o0$e */
    public static final class C17959e {

        /* renamed from: a */
        public final long f39184a;

        /* renamed from: b */
        public final long f39185b;

        /* renamed from: c */
        public final long f39186c;

        /* renamed from: d */
        public final float f39187d;

        /* renamed from: e */
        public final float f39188e;

        public C17959e(long j, long j2, long j3, float f, float f2) {
            this.f39184a = j;
            this.f39185b = j2;
            this.f39186c = j3;
            this.f39187d = f;
            this.f39188e = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17959e)) {
                return false;
            }
            C17959e eVar = (C17959e) obj;
            return this.f39184a == eVar.f39184a && this.f39185b == eVar.f39185b && this.f39186c == eVar.f39186c && this.f39187d == eVar.f39187d && this.f39188e == eVar.f39188e;
        }

        public final int hashCode() {
            long j = this.f39184a;
            long j2 = this.f39185b;
            long j3 = this.f39186c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f39187d;
            int i2 = 0;
            int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f39188e;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            }
            return floatToIntBits + i2;
        }
    }

    /* renamed from: jh.o0$f */
    public static final class C17960f {

        /* renamed from: a */
        public final Uri f39189a;

        /* renamed from: b */
        public final String f39190b;

        /* renamed from: c */
        public final C17958d f39191c;

        /* renamed from: d */
        public final C17955a f39192d;

        /* renamed from: e */
        public final List<StreamKey> f39193e;

        /* renamed from: f */
        public final String f39194f;

        /* renamed from: g */
        public final List<C17961g> f39195g;

        /* renamed from: h */
        public final Object f39196h;

        public C17960f() {
            throw null;
        }

        public C17960f(Uri uri, String str, C17958d dVar, C17955a aVar, List list, String str2, List list2, Object obj) {
            this.f39189a = uri;
            this.f39190b = str;
            this.f39191c = dVar;
            this.f39192d = aVar;
            this.f39193e = list;
            this.f39194f = str2;
            this.f39195g = list2;
            this.f39196h = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17960f)) {
                return false;
            }
            C17960f fVar = (C17960f) obj;
            return this.f39189a.equals(fVar.f39189a) && C14049b0.m21628a(this.f39190b, fVar.f39190b) && C14049b0.m21628a(this.f39191c, fVar.f39191c) && C14049b0.m21628a(this.f39192d, fVar.f39192d) && this.f39193e.equals(fVar.f39193e) && C14049b0.m21628a(this.f39194f, fVar.f39194f) && this.f39195g.equals(fVar.f39195g) && C14049b0.m21628a(this.f39196h, fVar.f39196h);
        }

        public final int hashCode() {
            int hashCode = this.f39189a.hashCode() * 31;
            String str = this.f39190b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C17958d dVar = this.f39191c;
            int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            C17955a aVar = this.f39192d;
            int hashCode4 = (this.f39193e.hashCode() + ((hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
            String str2 = this.f39194f;
            int hashCode5 = (this.f39195g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f39196h;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode5 + i;
        }
    }

    /* renamed from: jh.o0$g */
    public static final class C17961g {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17961g)) {
                return false;
            }
            ((C17961g) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public C17954o0(String str, C17957c cVar, C17960f fVar, C17959e eVar, C17963p0 p0Var) {
        this.f39137a = str;
        this.f39138b = fVar;
        this.f39139c = eVar;
        this.f39140d = p0Var;
        this.f39141e = cVar;
    }

    /* renamed from: a */
    public final C17956b mo69492a() {
        C17956b bVar = new C17956b();
        C17957c cVar = this.f39141e;
        long j = cVar.f39172b;
        bVar.f39149e = cVar.f39173c;
        bVar.f39150f = cVar.f39174d;
        bVar.f39148d = cVar.f39171a;
        bVar.f39151g = cVar.f39175e;
        bVar.f39145a = this.f39137a;
        bVar.f39166v = this.f39140d;
        C17959e eVar = this.f39139c;
        bVar.f39167w = eVar.f39184a;
        bVar.f39168x = eVar.f39185b;
        bVar.f39169y = eVar.f39186c;
        bVar.f39170z = eVar.f39187d;
        bVar.f39144A = eVar.f39188e;
        C17960f fVar = this.f39138b;
        if (fVar != null) {
            bVar.f39161q = fVar.f39194f;
            bVar.f39147c = fVar.f39190b;
            bVar.f39146b = fVar.f39189a;
            bVar.f39160p = fVar.f39193e;
            bVar.f39162r = fVar.f39195g;
            bVar.f39165u = fVar.f39196h;
            C17958d dVar = fVar.f39191c;
            if (dVar != null) {
                bVar.f39152h = dVar.f39177b;
                bVar.f39153i = dVar.f39178c;
                bVar.f39155k = dVar.f39179d;
                bVar.f39157m = dVar.f39181f;
                bVar.f39156l = dVar.f39180e;
                bVar.f39158n = dVar.f39182g;
                bVar.f39154j = dVar.f39176a;
                byte[] bArr = dVar.f39183h;
                bVar.f39159o = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            }
            C17955a aVar = fVar.f39192d;
            if (aVar != null) {
                bVar.f39163s = aVar.f39142a;
                bVar.f39164t = aVar.f39143b;
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17954o0)) {
            return false;
        }
        C17954o0 o0Var = (C17954o0) obj;
        return C14049b0.m21628a(this.f39137a, o0Var.f39137a) && this.f39141e.equals(o0Var.f39141e) && C14049b0.m21628a(this.f39138b, o0Var.f39138b) && C14049b0.m21628a(this.f39139c, o0Var.f39139c) && C14049b0.m21628a(this.f39140d, o0Var.f39140d);
    }

    public final int hashCode() {
        int hashCode = this.f39137a.hashCode() * 31;
        C17960f fVar = this.f39138b;
        int hashCode2 = fVar != null ? fVar.hashCode() : 0;
        int hashCode3 = this.f39139c.hashCode();
        return this.f39140d.hashCode() + ((this.f39141e.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
