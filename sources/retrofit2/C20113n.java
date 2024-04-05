package retrofit2;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C19932b0;
import okhttp3.C19944e;
import okhttp3.C19946f;
import okhttp3.C19992n;
import okhttp3.C19997p;
import okhttp3.C20002r;
import okhttp3.C20004s;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import p756lr.C19893f;
import p756lr.C19897i;
import p756lr.C19900l;
import p756lr.C19906r;
import p756lr.C19913x;
import retrofit2.C20141t;

/* renamed from: retrofit2.n */
public final class C20113n<T> implements C20089b<T> {

    /* renamed from: b */
    public final C20143u f44500b;

    /* renamed from: c */
    public final Object[] f44501c;

    /* renamed from: d */
    public final C19944e.C19945a f44502d;

    /* renamed from: e */
    public final C20099f<C19928a0, T> f44503e;

    /* renamed from: f */
    public volatile boolean f44504f;

    /* renamed from: g */
    public C19944e f44505g;

    /* renamed from: h */
    public Throwable f44506h;

    /* renamed from: i */
    public boolean f44507i;

    /* renamed from: retrofit2.n$a */
    public class C20114a implements C19946f {

        /* renamed from: a */
        public final /* synthetic */ C20092d f44508a;

        public C20114a(C20092d dVar) {
            this.f44508a = dVar;
        }

        public final void onFailure(C19944e eVar, IOException iOException) {
            try {
                this.f44508a.mo1135j(C20113n.this, iOException);
            } catch (Throwable th) {
                C20085a0.m34351n(th);
                th.printStackTrace();
            }
        }

        public final void onResponse(C19944e eVar, C20018z zVar) {
            try {
                try {
                    this.f44508a.mo1137m(C20113n.this, C20113n.this.mo74374c(zVar));
                } catch (Throwable th) {
                    C20085a0.m34351n(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C20085a0.m34351n(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: retrofit2.n$b */
    public static final class C20115b extends C19928a0 {

        /* renamed from: d */
        public final C19928a0 f44510d;

        /* renamed from: e */
        public final C19913x f44511e;

        /* renamed from: f */
        public IOException f44512f;

        /* renamed from: retrofit2.n$b$a */
        public class C20116a extends C19900l {
            public C20116a(C19897i iVar) {
                super(iVar);
            }

            /* renamed from: J */
            public final long mo68544J(C19893f fVar, long j) throws IOException {
                try {
                    return super.mo68544J(fVar, j);
                } catch (IOException e) {
                    C20115b.this.f44512f = e;
                    throw e;
                }
            }
        }

        public C20115b(C19928a0 a0Var) {
            this.f44510d = a0Var;
            this.f44511e = C19906r.m33998b(new C20116a(a0Var.mo70458f()));
        }

        public final void close() {
            this.f44510d.close();
        }

        /* renamed from: d */
        public final long mo70456d() {
            return this.f44510d.mo70456d();
        }

        /* renamed from: e */
        public final C20002r mo70457e() {
            return this.f44510d.mo70457e();
        }

        /* renamed from: f */
        public final C19897i mo70458f() {
            return this.f44511e;
        }
    }

    /* renamed from: retrofit2.n$c */
    public static final class C20117c extends C19928a0 {

        /* renamed from: d */
        public final C20002r f44514d;

        /* renamed from: e */
        public final long f44515e;

        public C20117c(C20002r rVar, long j) {
            this.f44514d = rVar;
            this.f44515e = j;
        }

        /* renamed from: d */
        public final long mo70456d() {
            return this.f44515e;
        }

        /* renamed from: e */
        public final C20002r mo70457e() {
            return this.f44514d;
        }

        /* renamed from: f */
        public final C19897i mo70458f() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C20113n(C20143u uVar, Object[] objArr, C19944e.C19945a aVar, C20099f<C19928a0, T> fVar) {
        this.f44500b = uVar;
        this.f44501c = objArr;
        this.f44502d = aVar;
        this.f44503e = fVar;
    }

    /* renamed from: G */
    public final void mo74362G(C20092d<T> dVar) {
        C19944e eVar;
        Throwable th;
        synchronized (this) {
            if (!this.f44507i) {
                this.f44507i = true;
                eVar = this.f44505g;
                th = this.f44506h;
                if (eVar == null && th == null) {
                    try {
                        C19944e a = mo74372a();
                        this.f44505g = a;
                        eVar = a;
                    } catch (Throwable th2) {
                        th = th2;
                        C20085a0.m34351n(th);
                        this.f44506h = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo1135j(this, th);
            return;
        }
        if (this.f44504f) {
            eVar.cancel();
        }
        eVar.mo72857S(new C20114a(dVar));
    }

    /* renamed from: a */
    public final C19944e mo74372a() throws IOException {
        C19997p pVar;
        C19997p.C19998a aVar;
        C19944e.C19945a aVar2 = this.f44502d;
        C20143u uVar = this.f44500b;
        Object[] objArr = this.f44501c;
        C20122r<?>[] rVarArr = uVar.f44587j;
        int length = objArr.length;
        if (length == rVarArr.length) {
            C20141t tVar = new C20141t(uVar.f44580c, uVar.f44579b, uVar.f44581d, uVar.f44582e, uVar.f44583f, uVar.f44584g, uVar.f44585h, uVar.f44586i);
            if (uVar.f44588k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                rVarArr[i].mo74375a(tVar, objArr[i]);
            }
            C19997p.C19998a aVar3 = tVar.f44568d;
            if (aVar3 != null) {
                pVar = aVar3.mo72978d();
            } else {
                C19997p pVar2 = tVar.f44566b;
                String str = tVar.f44567c;
                pVar2.getClass();
                C19383o.m32797g(str, ResponseConstants.LINK);
                try {
                    aVar = new C19997p.C19998a();
                    aVar.mo72980f(str, pVar2);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                pVar = aVar != null ? aVar.mo72978d() : null;
                if (pVar == null) {
                    StringBuilder h = C0072d.m201h("Malformed URL. Base: ");
                    h.append(tVar.f44566b);
                    h.append(", Relative: ");
                    h.append(tVar.f44567c);
                    throw new IllegalArgumentException(h.toString());
                }
            }
            C20141t.C20142a aVar4 = tVar.f44575k;
            if (aVar4 == null) {
                C19992n.C19993a aVar5 = tVar.f44574j;
                if (aVar5 != null) {
                    aVar4 = new C19992n(aVar5.f44231a, aVar5.f44232b);
                } else {
                    C20004s.C20005a aVar6 = tVar.f44573i;
                    if (aVar6 != null) {
                        aVar4 = aVar6.mo72989b();
                    } else if (tVar.f44572h) {
                        C20016y.f44360a.getClass();
                        aVar4 = C20016y.C20017a.m34282c(new byte[0], (C20002r) null, 0, 0);
                    }
                }
            }
            C20002r rVar = tVar.f44571g;
            if (rVar != null) {
                if (aVar4 != null) {
                    aVar4 = new C20141t.C20142a(aVar4, rVar);
                } else {
                    tVar.f44570f.mo72958a("Content-Type", rVar.f44261a);
                }
            }
            C20011u.C20012a aVar7 = tVar.f44569e;
            aVar7.getClass();
            aVar7.f44347a = pVar;
            aVar7.f44349c = tVar.f44570f.mo72961d().mo72952g();
            aVar7.mo73001d(tVar.f44565a, aVar4);
            aVar7.mo73002e(C20109j.class, new C20109j(uVar.f44578a, arrayList));
            C19944e a = aVar2.mo20743a(aVar7.mo72999b());
            if (a != null) {
                return a;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(C0071c.m191c(C0069a.m177h("Argument count (", length, ") doesn't match expected count ("), rVarArr.length, ")"));
    }

    /* renamed from: b */
    public final C19944e mo74373b() throws IOException {
        C19944e eVar = this.f44505g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f44506h;
        if (th == null) {
            try {
                C19944e a = mo74372a();
                this.f44505g = a;
                return a;
            } catch (IOException | Error | RuntimeException e) {
                C20085a0.m34351n(e);
                this.f44506h = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    /* renamed from: c */
    public final C20145v<T> mo74374c(C20018z zVar) throws IOException {
        C19928a0 a0Var = zVar.f44368i;
        C20018z.C20019a aVar = new C20018z.C20019a(zVar);
        aVar.f44381g = new C20117c(a0Var.mo70457e(), a0Var.mo70456d());
        C20018z a = aVar.mo73008a();
        int i = a.f44365f;
        if (i < 200 || i >= 300) {
            try {
                C19932b0 a2 = C20085a0.m34338a(a0Var);
                if (!a.mo73006d()) {
                    return new C20145v<>(a, (Object) null, a2);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                a0Var.close();
            }
        } else if (i == 204 || i == 205) {
            a0Var.close();
            if (a.mo73006d()) {
                return new C20145v<>(a, (Object) null, (C19932b0) null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            C20115b bVar = new C20115b(a0Var);
            try {
                T convert = this.f44503e.convert(bVar);
                if (a.mo73006d()) {
                    return new C20145v<>(a, convert, (C19932b0) null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e) {
                IOException iOException = bVar.f44512f;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
    }

    public final void cancel() {
        C19944e eVar;
        this.f44504f = true;
        synchronized (this) {
            eVar = this.f44505g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C20113n(this.f44500b, this.f44501c, this.f44502d, this.f44503e);
    }

    /* renamed from: e */
    public final C20145v<T> mo74365e() throws IOException {
        C19944e b;
        synchronized (this) {
            if (!this.f44507i) {
                this.f44507i = true;
                b = mo74373b();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f44504f) {
            b.cancel();
        }
        return mo74374c(b.mo72859e());
    }

    /* renamed from: g */
    public final synchronized C20011u mo74366g() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return mo74373b().mo72860g();
    }

    /* renamed from: n */
    public final boolean mo74367n() {
        boolean z = true;
        if (this.f44504f) {
            return true;
        }
        synchronized (this) {
            C19944e eVar = this.f44505g;
            if (eVar == null || !eVar.mo72861n()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final C20089b m35495clone() {
        return new C20113n(this.f44500b, this.f44501c, this.f44502d, this.f44503e);
    }
}
