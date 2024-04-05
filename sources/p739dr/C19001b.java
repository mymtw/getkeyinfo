package p739dr;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.text.input.C1993m;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C19928a0;
import okhttp3.C19989m;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19967c;
import okhttp3.internal.connection.C19971e;
import p735br.C18980c;
import p756lr.C19906r;
import p756lr.C19912w;

/* renamed from: dr.b */
public final class C19001b implements C20000q {

    /* renamed from: b */
    public final boolean f42342b;

    public C19001b(boolean z) {
        this.f42342b = z;
    }

    public final C20018z intercept(C20000q.C20001a aVar) throws IOException {
        boolean z;
        C20018z.C20019a aVar2;
        C20018z zVar;
        C19006f fVar = (C19006f) aVar;
        C19967c cVar = fVar.f42350e;
        C19383o.m32794d(cVar);
        C20011u uVar = fVar.f42351f;
        C20016y yVar = uVar.f44345e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C19989m mVar = cVar.f44129d;
            C19971e eVar = cVar.f44128c;
            mVar.getClass();
            C19383o.m32797g(eVar, "call");
            cVar.f44131f.mo70450f(uVar);
            C19989m mVar2 = cVar.f44129d;
            C19971e eVar2 = cVar.f44128c;
            mVar2.getClass();
            C19383o.m32797g(eVar2, "call");
            Long l = null;
            if (!C1993m.m4361V(uVar.f44343c) || yVar == null) {
                cVar.f44128c.mo72919h(cVar, true, false, null);
                aVar2 = null;
                z = true;
            } else {
                if (C19457k.m33019W0("100-continue", uVar.f44344d.mo72948a("Expect"), true)) {
                    try {
                        cVar.f44131f.mo70452h();
                        aVar2 = cVar.mo72907b(true);
                        C19989m mVar3 = cVar.f44129d;
                        C19971e eVar3 = cVar.f44128c;
                        mVar3.getClass();
                        C19383o.m32797g(eVar3, "call");
                        z = false;
                    } catch (IOException e) {
                        C19989m mVar4 = cVar.f44129d;
                        C19971e eVar4 = cVar.f44128c;
                        mVar4.getClass();
                        C19383o.m32797g(eVar4, "call");
                        cVar.mo72908c(e);
                        throw e;
                    }
                } else {
                    aVar2 = null;
                    z = true;
                }
                if (aVar2 == null) {
                    cVar.f44126a = false;
                    C20016y yVar2 = uVar.f44345e;
                    C19383o.m32794d(yVar2);
                    long a = yVar2.mo72943a();
                    C19989m mVar5 = cVar.f44129d;
                    C19971e eVar5 = cVar.f44128c;
                    mVar5.getClass();
                    C19383o.m32797g(eVar5, "call");
                    C19912w a2 = C19906r.m33997a(new C19967c.C19968a(cVar, cVar.f44131f.mo70449e(uVar, a), a));
                    yVar.mo72945c(a2);
                    a2.close();
                } else {
                    cVar.f44128c.mo72919h(cVar, true, false, null);
                    if (!(cVar.f44127b.f44181f != null)) {
                        cVar.f44131f.mo70446c().mo72930k();
                    }
                }
            }
            try {
                cVar.f44131f.mo70444a();
                if (aVar2 == null) {
                    aVar2 = cVar.mo72907b(false);
                    C19383o.m32794d(aVar2);
                    if (z) {
                        C19989m mVar6 = cVar.f44129d;
                        C19971e eVar6 = cVar.f44128c;
                        mVar6.getClass();
                        C19383o.m32797g(eVar6, "call");
                        z = false;
                    }
                }
                aVar2.f44375a = uVar;
                aVar2.f44379e = cVar.f44127b.f44179d;
                aVar2.f44385k = currentTimeMillis;
                aVar2.f44386l = System.currentTimeMillis();
                C20018z a3 = aVar2.mo73008a();
                int i = a3.f44365f;
                if (i == 100) {
                    C20018z.C20019a b = cVar.mo72907b(false);
                    C19383o.m32794d(b);
                    if (z) {
                        C19989m mVar7 = cVar.f44129d;
                        C19971e eVar7 = cVar.f44128c;
                        mVar7.getClass();
                        C19383o.m32797g(eVar7, "call");
                    }
                    b.f44375a = uVar;
                    b.f44379e = cVar.f44127b.f44179d;
                    b.f44385k = currentTimeMillis;
                    b.f44386l = System.currentTimeMillis();
                    a3 = b.mo73008a();
                    i = a3.f44365f;
                }
                C19989m mVar8 = cVar.f44129d;
                C19971e eVar8 = cVar.f44128c;
                mVar8.getClass();
                C19383o.m32797g(eVar8, "call");
                if (!this.f42342b || i != 101) {
                    C20018z.C20019a aVar3 = new C20018z.C20019a(a3);
                    try {
                        String b2 = C20018z.m34284b(a3, "Content-Type");
                        long d = cVar.f44131f.mo70448d(a3);
                        aVar3.f44381g = new C19007g(b2, d, C19906r.m33998b(new C19967c.C19969b(cVar, cVar.f44131f.mo70445b(a3), d)));
                        zVar = aVar3.mo73008a();
                    } catch (IOException e2) {
                        C19989m mVar9 = cVar.f44129d;
                        C19971e eVar9 = cVar.f44128c;
                        mVar9.getClass();
                        C19383o.m32797g(eVar9, "call");
                        cVar.mo72908c(e2);
                        throw e2;
                    }
                } else {
                    C20018z.C20019a aVar4 = new C20018z.C20019a(a3);
                    aVar4.f44381g = C18980c.f42303c;
                    zVar = aVar4.mo73008a();
                }
                if (C19457k.m33019W0(ConstantsKt.CLOSE, zVar.f44362c.f44344d.mo72948a("Connection"), true) || C19457k.m33019W0(ConstantsKt.CLOSE, C20018z.m34284b(zVar, "Connection"), true)) {
                    cVar.f44131f.mo70446c().mo72930k();
                }
                if (i == 204 || i == 205) {
                    C19928a0 a0Var = zVar.f44368i;
                    if ((a0Var != null ? a0Var.mo70456d() : -1) > 0) {
                        StringBuilder h = C0069a.m177h("HTTP ", i, " had non-zero Content-Length: ");
                        C19928a0 a0Var2 = zVar.f44368i;
                        if (a0Var2 != null) {
                            l = Long.valueOf(a0Var2.mo70456d());
                        }
                        h.append(l);
                        throw new ProtocolException(h.toString());
                    }
                }
                return zVar;
            } catch (IOException e3) {
                C19989m mVar10 = cVar.f44129d;
                C19971e eVar10 = cVar.f44128c;
                mVar10.getClass();
                C19383o.m32797g(eVar10, "call");
                cVar.mo72908c(e3);
                throw e3;
            }
        } catch (IOException e4) {
            C19989m mVar11 = cVar.f44129d;
            C19971e eVar11 = cVar.f44128c;
            mVar11.getClass();
            C19383o.m32797g(eVar11, "call");
            cVar.mo72908c(e4);
            throw e4;
        }
    }
}
