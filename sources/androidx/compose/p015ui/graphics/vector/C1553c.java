package androidx.compose.p015ui.graphics.vector;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p174m0.C7284d;
import p504ai.C13983i;

/* renamed from: androidx.compose.ui.graphics.vector.c */
public final class C1553c {

    /* renamed from: a */
    public final String f3428a;

    /* renamed from: b */
    public final float f3429b;

    /* renamed from: c */
    public final float f3430c;

    /* renamed from: d */
    public final float f3431d;

    /* renamed from: e */
    public final float f3432e;

    /* renamed from: f */
    public final C1581i f3433f;

    /* renamed from: g */
    public final long f3434g;

    /* renamed from: h */
    public final int f3435h;

    /* renamed from: i */
    public final boolean f3436i;

    public C1553c(String str, float f, float f2, float f3, float f4, C1581i iVar, long j, int i, boolean z) {
        this.f3428a = str;
        this.f3429b = f;
        this.f3430c = f2;
        this.f3431d = f3;
        this.f3432e = f4;
        this.f3433f = iVar;
        this.f3434g = j;
        this.f3435h = i;
        this.f3436i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1553c)) {
            return false;
        }
        C1553c cVar = (C1553c) obj;
        if (!C19383o.m32792b(this.f3428a, cVar.f3428a) || !C7284d.m13983a(this.f3429b, cVar.f3429b) || !C7284d.m13983a(this.f3430c, cVar.f3430c)) {
            return false;
        }
        if (!(this.f3431d == cVar.f3431d)) {
            return false;
        }
        if (!(this.f3432e == cVar.f3432e) || !C19383o.m32792b(this.f3433f, cVar.f3433f) || !C1545s.m3357c(this.f3434g, cVar.f3434g)) {
            return false;
        }
        return (this.f3435h == cVar.f3435h) && this.f3436i == cVar.f3436i;
    }

    public final int hashCode() {
        int c = C0023f.m104c(this.f3432e, C0023f.m104c(this.f3431d, C0023f.m104c(this.f3430c, C0023f.m104c(this.f3429b, this.f3428a.hashCode() * 31, 31), 31), 31), 31);
        long j = this.f3434g;
        int i = C1545s.f3365j;
        return Boolean.hashCode(this.f3436i) + C0069a.m170a(this.f3435h, C13983i.m21487f(j, (this.f3433f.hashCode() + c) * 31, 31), 31);
    }

    /* renamed from: androidx.compose.ui.graphics.vector.c$a */
    public static final class C1554a {

        /* renamed from: a */
        public final String f3437a;

        /* renamed from: b */
        public final float f3438b;

        /* renamed from: c */
        public final float f3439c;

        /* renamed from: d */
        public final float f3440d;

        /* renamed from: e */
        public final float f3441e;

        /* renamed from: f */
        public final long f3442f;

        /* renamed from: g */
        public final int f3443g;

        /* renamed from: h */
        public final boolean f3444h;

        /* renamed from: i */
        public final ArrayList<C1555a> f3445i;

        /* renamed from: j */
        public C1555a f3446j;

        /* renamed from: k */
        public boolean f3447k;

        /* renamed from: androidx.compose.ui.graphics.vector.c$a$a */
        public static final class C1555a {

            /* renamed from: a */
            public String f3448a;

            /* renamed from: b */
            public float f3449b;

            /* renamed from: c */
            public float f3450c;

            /* renamed from: d */
            public float f3451d;

            /* renamed from: e */
            public float f3452e;

            /* renamed from: f */
            public float f3453f;

            /* renamed from: g */
            public float f3454g;

            /* renamed from: h */
            public float f3455h;

            /* renamed from: i */
            public List<? extends C1556d> f3456i;

            /* renamed from: j */
            public List<C1584k> f3457j;

            public C1555a() {
                this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, 1023);
            }

            public C1555a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends C1556d> list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                list = (i & 256) != 0 ? C1583j.f3538a : list;
                ArrayList arrayList = (i & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? new ArrayList() : null;
                C19383o.m32797g(str, "name");
                C19383o.m32797g(list, "clipPathData");
                C19383o.m32797g(arrayList, ResponseConstants.CHILDREN);
                this.f3448a = str;
                this.f3449b = f;
                this.f3450c = f2;
                this.f3451d = f3;
                this.f3452e = f4;
                this.f3453f = f5;
                this.f3454g = f6;
                this.f3455h = f7;
                this.f3456i = list;
                this.f3457j = arrayList;
            }
        }

        public C1554a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.f3437a = str;
            this.f3438b = f;
            this.f3439c = f2;
            this.f3440d = f3;
            this.f3441e = f4;
            this.f3442f = j;
            this.f3443g = i;
            this.f3444h = z;
            ArrayList<C1555a> arrayList = new ArrayList<>();
            this.f3445i = arrayList;
            C1555a aVar = new C1555a((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, 1023);
            this.f3446j = aVar;
            arrayList.add(aVar);
        }

        /* renamed from: a */
        public final void mo6445a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            C19383o.m32797g(str, "name");
            List list2 = list;
            C19383o.m32797g(list2, "clipPathData");
            mo6449f();
            this.f3445i.add(new C1555a(str, f, f2, f3, f4, f5, f6, f7, list2, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN));
        }

        /* renamed from: b */
        public final void mo6446b(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, C1533m mVar, C1533m mVar2, String str, List list) {
            C19383o.m32797g(list, "pathData");
            C19383o.m32797g(str, "name");
            mo6449f();
            ArrayList<C1555a> arrayList = this.f3445i;
            C1585l lVar = r1;
            List<C1584k> list2 = arrayList.get(arrayList.size() - 1).f3457j;
            C1585l lVar2 = new C1585l(str, list, i, mVar, f, mVar2, f2, f3, i2, i3, f4, f5, f6, f7);
            list2.add(lVar);
        }

        /* renamed from: d */
        public final C1553c mo6447d() {
            mo6449f();
            while (this.f3445i.size() > 1) {
                mo6448e();
            }
            String str = this.f3437a;
            float f = this.f3438b;
            float f2 = this.f3439c;
            float f3 = this.f3440d;
            float f4 = this.f3441e;
            C1555a aVar = this.f3446j;
            float f5 = f4;
            C1581i iVar = new C1581i(aVar.f3448a, aVar.f3449b, aVar.f3450c, aVar.f3451d, aVar.f3452e, aVar.f3453f, aVar.f3454g, aVar.f3455h, aVar.f3456i, aVar.f3457j);
            C1553c cVar = new C1553c(str, f, f2, f3, f5, iVar, this.f3442f, this.f3443g, this.f3444h);
            this.f3447k = true;
            return cVar;
        }

        /* renamed from: e */
        public final void mo6448e() {
            mo6449f();
            ArrayList<C1555a> arrayList = this.f3445i;
            C1555a remove = arrayList.remove(arrayList.size() - 1);
            ArrayList<C1555a> arrayList2 = this.f3445i;
            arrayList2.get(arrayList2.size() - 1).f3457j.add(new C1581i(remove.f3448a, remove.f3449b, remove.f3450c, remove.f3451d, remove.f3452e, remove.f3453f, remove.f3454g, remove.f3455h, remove.f3456i, remove.f3457j));
        }

        /* renamed from: f */
        public final void mo6449f() {
            if (!(!this.f3447k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        public C1554a(String str) {
            this(str, 24.0f, 24.0f, 24.0f, 24.0f, C1545s.f3364i, 5, false);
        }
    }
}
