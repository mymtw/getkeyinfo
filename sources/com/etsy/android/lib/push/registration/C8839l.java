package com.etsy.android.lib.push.registration;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.EtsyCurrency;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.favorites.search.clusters.ClusterItem;
import com.etsy.android.p327ui.shop.ShopSectionListingsFragment;
import com.etsy.android.p327ui.user.C11520e;
import com.etsy.android.p327ui.user.EtsyCurrencyK;
import com.etsy.android.p327ui.user.review.C11715n;
import com.etsy.android.p327ui.user.review.C11751v;
import com.etsy.android.shophome.C8999j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import okhttp3.C19928a0;
import p010a9.C0048b;
import p145io.reactivex.internal.operators.observable.C19163g0;
import p248tp.C8061n;
import p287xp.C8339g;
import p412oc.C13150b;
import p412oc.C13151c;
import p764pq.C20057i;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: com.etsy.android.lib.push.registration.l */
public final /* synthetic */ class C8839l implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19442b;

    /* renamed from: c */
    public final /* synthetic */ Object f19443c;

    public /* synthetic */ C8839l(Object obj, int i) {
        this.f19442b = i;
        this.f19443c = obj;
    }

    public final Object apply(Object obj) {
        List<ClusterItem> list;
        String str = null;
        int i = 0;
        switch (this.f19442b) {
            case 0:
                C8841n nVar = (C8841n) this.f19443c;
                C8061n nVar2 = (C8061n) obj;
                C19383o.m32797g(nVar, "this$0");
                C19383o.m32797g(nVar2, "errors");
                return new C19163g0(nVar2, new C20057i(1, nVar.f19451f), new C0048b()).mo20634d(new C8840m(new TokenUploader$upload$1$2(nVar), 0));
            case 1:
                C13150b bVar = (C13150b) this.f19443c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(bVar, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                if (!vVar.mo74384a()) {
                    return new C13151c.C13152a(C0761x.m1692S0(vVar, bVar.f28923c), vVar.f44614a.f44365f, (Throwable) null);
                }
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                if (a0Var == null || (list = MoshiModelFactory.createListFromByteArray(a0Var.mo72841a(), ClusterItem.class)) == null) {
                    list = EmptyList.INSTANCE;
                }
                bVar.f28925e.addAll(list);
                return new C13151c.C13153b(list);
            case 2:
                return ShopSectionListingsFragment.m35052onViewCreated$lambda0((ShopSectionListingsFragment) this.f19443c, (C8999j.C9000a) obj);
            case 3:
                C11520e eVar = (C11520e) this.f19443c;
                List<EtsyCurrencyK> list2 = (List) obj;
                C19383o.m32797g(eVar, "this$0");
                C19383o.m32797g(list2, ResponseConstants.RESPONSE);
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(list2));
                for (EtsyCurrencyK etsyCurrencyK : list2) {
                    EtsyMoney a = eVar.f25417c.mo21248a("0", etsyCurrencyK.f24994b.getCurrencyCode());
                    EtsyCurrency etsyCurrency = new EtsyCurrency();
                    etsyCurrency.mName = etsyCurrencyK.f24995c;
                    etsyCurrency.mUnit = a;
                    etsyCurrency.mNumberPrecision = etsyCurrencyK.f24996d;
                    arrayList.add(etsyCurrency);
                }
                int T = C19421p.m32930T(C19322o.m32624F0(arrayList));
                if (T < 16) {
                    T = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(T);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String code = ((EtsyCurrency) next).getCode();
                    C19383o.m32796f(code, "it.code");
                    linkedHashMap.put(code, next);
                }
                return linkedHashMap;
            default:
                C11715n nVar3 = (C11715n) this.f19443c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(nVar3, "this$0");
                C19383o.m32797g(th, "it");
                HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
                if (httpException != null) {
                    str = C0761x.m1690R0(httpException, nVar3.f26066b);
                }
                if (httpException != null) {
                    i = httpException.code();
                }
                return new C11751v.C11752a(str, Integer.valueOf(i), (Throwable) httpException);
        }
    }
}
