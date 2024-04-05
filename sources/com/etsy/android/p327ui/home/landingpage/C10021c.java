package com.etsy.android.p327ui.home.landingpage;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.squareup.moshi.C17414y;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import okhttp3.C20004s;
import okhttp3.C20013v;
import okhttp3.C20016y;
import p248tp.C8071s;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.home.landingpage.c */
public final class C10021c {

    /* renamed from: a */
    public final C10022d f22069a;

    /* renamed from: b */
    public final C17414y f22070b;

    public C10021c(C10022d dVar, C17414y yVar) {
        C19383o.m32797g(dVar, "landingPageEndpoint");
        C19383o.m32797g(yVar, "moshi");
        this.f22069a = dVar;
        this.f22070b = yVar;
    }

    /* renamed from: a */
    public final C8071s<C20145v<C19928a0>> mo33285a(C10034g gVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = gVar.f22086b;
        if (map == null) {
            map = C19294b0.m32559p0();
        }
        linkedHashMap.putAll(map);
        Map<String, String> map2 = gVar.f22087c;
        if (map2 == null) {
            map2 = C19294b0.m32559p0();
        }
        linkedHashMap.putAll(map2);
        Map y0 = C19294b0.m32568y0(linkedHashMap);
        int i = gVar.f22089e;
        if (i != 1) {
            return i != 2 ? i != 3 ? this.f22069a.mo33286a(gVar.f22085a, y0) : this.f22069a.mo33287b(gVar.f22085a, y0) : this.f22069a.mo33288c(gVar.f22085a, y0);
        }
        C20004s.C20005a aVar = new C20004s.C20005a(0);
        Map<String, String> map3 = gVar.f22088d;
        if (map3 != null) {
            for (Map.Entry next : map3.entrySet()) {
                aVar.mo72988a((String) next.getKey(), (String) next.getValue());
            }
        }
        Pair<String, File> pair = gVar.f22090f;
        if (pair != null) {
            try {
                String first = pair.getFirst();
                File second = pair.getSecond();
                String name = second.getName();
                C20016y.C20017a aVar2 = C20016y.f44360a;
                C20002r.f44260f.getClass();
                C20002r a = C20002r.C20003a.m34243a("image/*");
                aVar2.getClass();
                C20013v a2 = C20016y.C20017a.m34280a(second, a);
                C19383o.m32797g(first, "name");
                C20004s.C20007c.f44276c.getClass();
                aVar.f44275c.add(C20004s.C20007c.C20008a.m34255c(first, name, a2));
            } catch (Exception e) {
                C8694h a3 = LogCatKt.m17045a();
                a3.mo21309d("Error attaching " + pair + " to LandingPageRepository request", e);
                C19394m mVar = C19394m.f43287a;
            }
        }
        C20002r.f44260f.getClass();
        aVar.mo72990c(C20002r.C20003a.m34243a("multipart/form-data"));
        C20004s b = aVar.mo72989b();
        return true ^ b.f44272e.isEmpty() ? this.f22069a.mo33289d(gVar.f22085a, y0, b) : this.f22069a.mo33290e(gVar.f22085a, y0);
    }
}
