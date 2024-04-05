package p739dr;

import android.support.p013v4.media.C0072d;
import com.facebook.login.LoginFragment;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19967c;
import okhttp3.internal.connection.C19971e;
import okhttp3.internal.connection.C19976g;

/* renamed from: dr.f */
public final class C19006f implements C20000q.C20001a {

    /* renamed from: a */
    public int f42346a;

    /* renamed from: b */
    public final C19971e f42347b;

    /* renamed from: c */
    public final List<C20000q> f42348c;

    /* renamed from: d */
    public final int f42349d;

    /* renamed from: e */
    public final C19967c f42350e;

    /* renamed from: f */
    public final C20011u f42351f;

    /* renamed from: g */
    public final int f42352g;

    /* renamed from: h */
    public final int f42353h;

    /* renamed from: i */
    public final int f42354i;

    public C19006f(C19971e eVar, List<? extends C20000q> list, int i, C19967c cVar, C20011u uVar, int i2, int i3, int i4) {
        C19383o.m32797g(eVar, "call");
        C19383o.m32797g(list, "interceptors");
        C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
        this.f42347b = eVar;
        this.f42348c = list;
        this.f42349d = i;
        this.f42350e = cVar;
        this.f42351f = uVar;
        this.f42352g = i2;
        this.f42353h = i3;
        this.f42354i = i4;
    }

    /* renamed from: c */
    public static C19006f m32154c(C19006f fVar, int i, C19967c cVar, C20011u uVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f42349d;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            cVar = fVar.f42350e;
        }
        C19967c cVar2 = cVar;
        if ((i2 & 4) != 0) {
            uVar = fVar.f42351f;
        }
        C20011u uVar2 = uVar;
        int i4 = (i2 & 8) != 0 ? fVar.f42352g : 0;
        int i5 = (i2 & 16) != 0 ? fVar.f42353h : 0;
        int i6 = (i2 & 32) != 0 ? fVar.f42354i : 0;
        fVar.getClass();
        C19383o.m32797g(uVar2, LoginFragment.EXTRA_REQUEST);
        return new C19006f(fVar.f42347b, fVar.f42348c, i3, cVar2, uVar2, i4, i5, i6);
    }

    /* renamed from: a */
    public final C20018z mo70453a(C20011u uVar) throws IOException {
        C19383o.m32797g(uVar, LoginFragment.EXTRA_REQUEST);
        boolean z = true;
        if (this.f42349d < this.f42348c.size()) {
            this.f42346a++;
            C19967c cVar = this.f42350e;
            if (cVar != null) {
                if (cVar.f44130e.mo72912b(uVar.f44342b)) {
                    if (!(this.f42346a == 1)) {
                        StringBuilder h = C0072d.m201h("network interceptor ");
                        h.append(this.f42348c.get(this.f42349d - 1));
                        h.append(" must call proceed() exactly once");
                        throw new IllegalStateException(h.toString().toString());
                    }
                } else {
                    StringBuilder h2 = C0072d.m201h("network interceptor ");
                    h2.append(this.f42348c.get(this.f42349d - 1));
                    h2.append(" must retain the same host and port");
                    throw new IllegalStateException(h2.toString().toString());
                }
            }
            C19006f c = m32154c(this, this.f42349d + 1, (C19967c) null, uVar, 58);
            C20000q qVar = this.f42348c.get(this.f42349d);
            C20018z intercept = qVar.intercept(c);
            if (intercept != null) {
                if (this.f42350e != null) {
                    if (!(this.f42349d + 1 >= this.f42348c.size() || c.f42346a == 1)) {
                        throw new IllegalStateException(("network interceptor " + qVar + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.f44368i == null) {
                    z = false;
                }
                if (z) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + qVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final C19976g mo70454b() {
        C19967c cVar = this.f42350e;
        if (cVar != null) {
            return cVar.f44127b;
        }
        return null;
    }

    /* renamed from: g */
    public final C20011u mo70455g() {
        return this.f42351f;
    }
}
