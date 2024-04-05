package com.etsy.android.lib.network;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.toolbar.AdminToolbarNetworkResponse;
import com.etsy.android.lib.toolbar.C8860a;
import com.etsy.android.lib.util.C8906j;
import com.etsy.android.lib.util.CrashUtil;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.text.C19459m;
import okhttp3.C19928a0;
import okhttp3.C19932b0;
import okhttp3.C19994o;
import okhttp3.C20000q;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p373ja.C12967a;
import p628nj.C18263b;
import p739dr.C19006f;
import p756lr.C19893f;

/* renamed from: com.etsy.android.lib.network.b */
public final class C8723b implements C20000q {
    public final C20018z intercept(C20000q.C20001a aVar) {
        int i;
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        String str = uVar.f44342b.f44248j;
        int i2 = C8860a.f19556m;
        String str2 = uVar.f44343c;
        C19383o.m32797g(str2, ResponseConstants.METHOD);
        C19383o.m32797g(str, "networkRequest");
        if (C8860a.C8861a.m17264a() && !C19459m.m33036e1(str, "analytics/uploadCompressedData", false)) {
            try {
                C8860a aVar2 = C8860a.f19558o;
                C19383o.m32794d(aVar2);
                ArrayDeque<String> arrayDeque = aVar2.f19571l;
                arrayDeque.add(str2 + ' ' + URLDecoder.decode(str, "UTF-8"));
                while (aVar2.f19571l.size() > 5) {
                    aVar2.f19571l.remove();
                }
                C8860a aVar3 = C8860a.f19558o;
                C19383o.m32794d(aVar3);
                C8860a.m17262a(aVar3);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        CrashUtil.m17307a().mo30460e(new C8906j.C8909c("OkHttpRequest", C19421p.m32931U(new Pair("url", str))));
        C20018z a = fVar.mo70453a(uVar);
        int i3 = a.f44365f;
        C19994o oVar = a.f44367h;
        C19928a0 a0Var = a.f44368i;
        byte[] a2 = a0Var != null ? a0Var.mo72841a() : null;
        if (!a.mo73006d()) {
            String str3 = a.f44364e;
            try {
                Class.forName("org.junit.Test");
                i = 100;
            } catch (ClassNotFoundException unused) {
                List<String> list = C8591a.f18700r;
                i = C18263b.f40056T.f18706f.mo21134d(C8592b.f18753Q);
            }
            int i4 = i;
            C12967a aVar4 = r3;
            C12967a aVar5 = new C12967a(i3, str3, str, oVar, a2);
            C15588c1.m25313X(aVar4, i4);
        }
        int i5 = C8860a.f19556m;
        if (C8860a.C8861a.m17264a() && oVar != null && !C19459m.m33036e1(str, "analytics/uploadCompressedData", false)) {
            C8860a aVar6 = C8860a.f19558o;
            C19383o.m32794d(aVar6);
            aVar6.f19570k.add(new AdminToolbarNetworkResponse(str, i3, oVar, a2));
            while (aVar6.f19570k.size() > 3) {
                aVar6.f19570k.remove();
            }
        }
        CrashUtil.m17307a().mo30460e(new C8906j.C8909c("OkHttpResponse", C19294b0.m32562s0(new Pair("url", str), new Pair(ResponseConstants.CODE, String.valueOf(i3)))));
        C20018z.C20019a aVar7 = new C20018z.C20019a(a);
        C19928a0.C19930b bVar = C19928a0.f43959c;
        C19928a0 a0Var2 = a.f44368i;
        C20002r e2 = a0Var2 != null ? a0Var2.mo70457e() : null;
        if (a2 == null) {
            a2 = new byte[0];
        }
        bVar.getClass();
        C19893f fVar2 = new C19893f();
        fVar2.write(a2);
        aVar7.f44381g = new C19932b0(e2, (long) a2.length, fVar2);
        return aVar7.mo73008a();
    }
}
