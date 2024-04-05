package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19997p;
import okhttp3.C20002r;
import p735br.C18980c;
import p756lr.C19893f;
import p756lr.C19896h;

/* renamed from: okhttp3.n */
public final class C19992n extends C20016y {

    /* renamed from: d */
    public static final C20002r f44228d = C20002r.C20003a.m34243a("application/x-www-form-urlencoded");

    /* renamed from: b */
    public final List<String> f44229b;

    /* renamed from: c */
    public final List<String> f44230c;

    /* renamed from: okhttp3.n$a */
    public static final class C19993a {

        /* renamed from: a */
        public final ArrayList f44231a;

        /* renamed from: b */
        public final ArrayList f44232b;

        /* renamed from: c */
        public final Charset f44233c;

        public C19993a() {
            this(0);
        }

        public C19993a(int i) {
            this.f44233c = null;
            this.f44231a = new ArrayList();
            this.f44232b = new ArrayList();
        }

        /* renamed from: a */
        public final void mo72947a(String str, String str2) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str2, "value");
            ArrayList arrayList = this.f44231a;
            C19997p.C19999b bVar = C19997p.f44238l;
            arrayList.add(C19997p.C19999b.m34232a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f44233c, 91));
            this.f44232b.add(C19997p.C19999b.m34232a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f44233c, 91));
        }
    }

    static {
        C20002r.f44260f.getClass();
    }

    public C19992n(ArrayList arrayList, ArrayList arrayList2) {
        C19383o.m32797g(arrayList, "encodedNames");
        C19383o.m32797g(arrayList2, "encodedValues");
        this.f44229b = C18980c.m32118v(arrayList);
        this.f44230c = C18980c.m32118v(arrayList2);
    }

    /* renamed from: a */
    public final long mo72943a() {
        return mo72946d((C19896h) null, true);
    }

    /* renamed from: b */
    public final C20002r mo72944b() {
        return f44228d;
    }

    /* renamed from: c */
    public final void mo72945c(C19896h hVar) throws IOException {
        mo72946d(hVar, false);
    }

    /* renamed from: d */
    public final long mo72946d(C19896h hVar, boolean z) {
        C19893f fVar;
        if (z) {
            fVar = new C19893f();
        } else {
            C19383o.m32794d(hVar);
            fVar = hVar.mo72745l();
        }
        int size = this.f44229b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVar.mo72771x0(38);
            }
            fVar.mo72715G0(this.f44229b.get(i));
            fVar.mo72771x0(61);
            fVar.mo72715G0(this.f44230c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = fVar.f43876c;
        fVar.mo72726a();
        return j;
    }
}
