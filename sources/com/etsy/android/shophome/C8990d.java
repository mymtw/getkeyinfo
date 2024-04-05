package com.etsy.android.shophome;

import kotlin.collections.C19327t;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p425q9.C13250b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.shophome.d */
public final class C8990d {

    /* renamed from: a */
    public final C8989c f19848a;

    public C8990d(C8989c cVar) {
        this.f19848a = cVar;
    }

    /* renamed from: a */
    public final C19208j mo30653a(C8991e eVar) {
        C20002r.f44260f.getClass();
        C20002r b = C20002r.C20003a.m34244b("application/x-www-form-urlencoded; charset=UTF-8");
        String Z0 = C19327t.m32644Z0(eVar.f19849a, "&", (String) null, (String) null, ListingMemberDataRepository$getListingMemberData$content$1.INSTANCE, 30);
        C8989c cVar = this.f19848a;
        C20016y.f44360a.getClass();
        C8071s<C20145v<C19928a0>> a = cVar.mo30652a(C20016y.C20017a.m34281b(Z0, b));
        C13250b bVar = new C13250b(1);
        a.getClass();
        return new C19208j(a, bVar);
    }
}
