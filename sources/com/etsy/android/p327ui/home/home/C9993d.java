package com.etsy.android.p327ui.home.home;

import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p287xp.C8339g;

/* renamed from: com.etsy.android.ui.home.home.d */
public final /* synthetic */ class C9993d implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ C9994e f21993b;

    /* renamed from: c */
    public final /* synthetic */ C10011k f21994c;

    public /* synthetic */ C9993d(C9994e eVar, C10011k kVar) {
        this.f21993b = eVar;
        this.f21994c = kVar;
    }

    public final Object apply(Object obj) {
        C9994e eVar = this.f21993b;
        C10011k kVar = this.f21994c;
        byte[] bArr = (byte[]) obj;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(kVar, "$specs");
        C19383o.m32797g(bArr, "requestBody");
        C9990a aVar = eVar.f21995a;
        String str = kVar.f22033b;
        HashMap a = kVar.mo33238a();
        C20016y.C20017a aVar2 = C20016y.f44360a;
        C20002r.f44260f.getClass();
        C20002r b = C20002r.C20003a.m34244b("application/json; charset=UTF-8");
        int length = bArr.length;
        aVar2.getClass();
        return aVar.mo33221b(str, a, C20016y.C20017a.m34282c(bArr, b, 0, length));
    }
}
