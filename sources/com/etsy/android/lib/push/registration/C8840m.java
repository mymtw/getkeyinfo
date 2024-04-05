package com.etsy.android.lib.push.registration;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.apiv3.vespa.ListSectionActionResult;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.p327ui.favorites.C9855j;
import com.etsy.android.p327ui.favorites.C9856k;
import com.etsy.android.p327ui.home.home.C9994e;
import com.etsy.android.p327ui.home.home.C9995f;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p001a0.C0005b;
import p248tp.C8065q;
import p287xp.C8339g;
import p367ib.C12921a;
import p367ib.C12929d;
import p464va.C13548c;
import p464va.C13552e;
import p753kq.C19857l;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: com.etsy.android.lib.push.registration.m */
public final /* synthetic */ class C8840m implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19444b;

    /* renamed from: c */
    public final /* synthetic */ Object f19445c;

    public /* synthetic */ C8840m(Object obj, int i) {
        this.f19444b = i;
        this.f19445c = obj;
    }

    public final Object apply(Object obj) {
        C9995f.C9996a aVar;
        List<ListSectionActionResult> list;
        List<HomeTab> list2;
        Object obj2 = null;
        switch (this.f19444b) {
            case 0:
                C19857l lVar = (C19857l) this.f19445c;
                C19383o.m32797g(lVar, "$tmp0");
                return (C8065q) lVar.invoke((Integer) obj);
            case 1:
                C13552e eVar = (C13552e) this.f19445c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(eVar, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                if (vVar.mo74384a()) {
                    C19928a0 a0Var = (C19928a0) vVar.f44615b;
                    if (a0Var == null || (list = MoshiModelFactory.createListFromByteArray(a0Var.mo72841a(), ListSectionActionResult.class)) == null) {
                        list = EmptyList.INSTANCE;
                    }
                    return new C13548c.C13550b(list, C0005b.m48l0(vVar));
                }
                return new C13548c.C13549a(C0761x.m1694T0(vVar, eVar.f29636c), new HttpException(vVar));
            case 2:
                C12929d dVar = (C12929d) this.f19445c;
                C20145v vVar2 = (C20145v) obj;
                C19383o.m32797g(dVar, "this$0");
                C19383o.m32797g(vVar2, ResponseConstants.RESPONSE);
                if (vVar2.mo74384a()) {
                    C19928a0 a0Var2 = (C19928a0) vVar2.f44615b;
                    if (a0Var2 != null) {
                        obj2 = MoshiModelFactory.createFromByteArray(a0Var2.mo72841a(), CartPage.class);
                    }
                    return new C12921a.C12923b((CartPage) obj2);
                }
                return new C12921a.C12922a(C0761x.m1694T0(vVar2, dVar.f28493b), new HttpException(vVar2));
            case 3:
                C9855j jVar = (C9855j) this.f19445c;
                C20145v vVar3 = (C20145v) obj;
                C19383o.m32797g(jVar, "this$0");
                C19383o.m32797g(vVar3, ResponseConstants.RESPONSE);
                if (!vVar3.mo74384a()) {
                    return new C9856k.C9857a(C0761x.m1692S0(vVar3, jVar.f21758b), vVar3.f44614a.f44365f, (Throwable) null);
                }
                C19928a0 a0Var3 = (C19928a0) vVar3.f44615b;
                if (a0Var3 == null || (list2 = MoshiModelFactory.createListFromByteArray(a0Var3.mo72841a(), HomeTab.class)) == null) {
                    list2 = EmptyList.INSTANCE;
                }
                return new C9856k.C9858b(list2);
            default:
                C9994e eVar2 = (C9994e) this.f19445c;
                C20145v vVar4 = (C20145v) obj;
                C19383o.m32797g(eVar2, "this$0");
                C19383o.m32797g(vVar4, ResponseConstants.RESPONSE);
                if (vVar4.mo74384a()) {
                    C19928a0 a0Var4 = (C19928a0) vVar4.f44615b;
                    if (a0Var4 != null) {
                        obj2 = MoshiModelFactory.createFromByteArray(a0Var4.mo72841a(), Page.class);
                    }
                    Page page = (Page) obj2;
                    if (page != null) {
                        return new C9995f.C9997b(page, C0005b.m48l0(vVar4));
                    }
                    aVar = new C9995f.C9996a(C0761x.m1694T0(vVar4, eVar2.f21997c), new RuntimeException("Home screen page model couldn't be parsed."));
                } else {
                    aVar = new C9995f.C9996a(C0761x.m1694T0(vVar4, eVar2.f21997c), new HttpException(vVar4));
                }
                return aVar;
        }
    }
}
