package retrofit2;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19992n;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20002r;
import okhttp3.C20004s;
import okhttp3.C20011u;
import okhttp3.C20016y;
import p756lr.C19896h;

/* renamed from: retrofit2.t */
public final class C20141t {

    /* renamed from: l */
    public static final char[] f44563l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f44564m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f44565a;

    /* renamed from: b */
    public final C19997p f44566b;

    /* renamed from: c */
    public String f44567c;

    /* renamed from: d */
    public C19997p.C19998a f44568d;

    /* renamed from: e */
    public final C20011u.C20012a f44569e = new C20011u.C20012a();

    /* renamed from: f */
    public final C19994o.C19995a f44570f;

    /* renamed from: g */
    public C20002r f44571g;

    /* renamed from: h */
    public final boolean f44572h;

    /* renamed from: i */
    public C20004s.C20005a f44573i;

    /* renamed from: j */
    public C19992n.C19993a f44574j;

    /* renamed from: k */
    public C20016y f44575k;

    /* renamed from: retrofit2.t$a */
    public static class C20142a extends C20016y {

        /* renamed from: b */
        public final C20016y f44576b;

        /* renamed from: c */
        public final C20002r f44577c;

        public C20142a(C20016y yVar, C20002r rVar) {
            this.f44576b = yVar;
            this.f44577c = rVar;
        }

        /* renamed from: a */
        public final long mo72943a() throws IOException {
            return this.f44576b.mo72943a();
        }

        /* renamed from: b */
        public final C20002r mo72944b() {
            return this.f44577c;
        }

        /* renamed from: c */
        public final void mo72945c(C19896h hVar) throws IOException {
            this.f44576b.mo72945c(hVar);
        }
    }

    public C20141t(String str, C19997p pVar, String str2, C19994o oVar, C20002r rVar, boolean z, boolean z2, boolean z3) {
        this.f44565a = str;
        this.f44566b = pVar;
        this.f44567c = str2;
        this.f44571g = rVar;
        this.f44572h = z;
        if (oVar != null) {
            this.f44570f = oVar.mo72952g();
        } else {
            this.f44570f = new C19994o.C19995a();
        }
        if (z2) {
            this.f44574j = new C19992n.C19993a();
        } else if (z3) {
            C20004s.C20005a aVar = new C20004s.C20005a();
            this.f44573i = aVar;
            aVar.mo72990c(C20004s.f44265g);
        }
    }

    /* renamed from: a */
    public final void mo74379a(String str, String str2, boolean z) {
        String str3 = str;
        if (z) {
            C19992n.C19993a aVar = this.f44574j;
            aVar.getClass();
            C19383o.m32797g(str3, "name");
            ArrayList arrayList = aVar.f44231a;
            C19997p.C19999b bVar = C19997p.f44238l;
            arrayList.add(C19997p.C19999b.m34232a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f44233c, 83));
            aVar.f44232b.add(C19997p.C19999b.m34232a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f44233c, 83));
            return;
        }
        this.f44574j.mo72947a(str3, str2);
    }

    /* renamed from: b */
    public final void mo74380b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                C20002r.f44260f.getClass();
                this.f44571g = C20002r.C20003a.m34243a(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(C0326j.m864i("Malformed content type: ", str2), e);
            }
        } else {
            this.f44570f.mo72958a(str, str2);
        }
    }

    /* renamed from: c */
    public final void mo74381c(String str, String str2, boolean z) {
        C19997p.C19998a aVar;
        String str3 = this.f44567c;
        if (str3 != null) {
            C19997p pVar = this.f44566b;
            pVar.getClass();
            try {
                aVar = new C19997p.C19998a();
                aVar.mo72980f(str3, pVar);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f44568d = aVar;
            if (aVar != null) {
                this.f44567c = null;
            } else {
                StringBuilder h = C0072d.m201h("Malformed URL. Base: ");
                h.append(this.f44566b);
                h.append(", Relative: ");
                h.append(this.f44567c);
                throw new IllegalArgumentException(h.toString());
            }
        }
        if (z) {
            this.f44568d.mo72975a(str, str2);
        } else {
            this.f44568d.mo72977c(str, str2);
        }
    }
}
