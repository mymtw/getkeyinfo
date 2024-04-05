package com.etsy.android.lib.push.registration;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.apiv3.vespa.ListSectionActionResult;
import com.etsy.android.lib.requests.LocaleRepository;
import com.etsy.android.lib.requests.ReceiptId;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.lib.util.C8919r;
import com.etsy.android.p327ui.cart.C9326n;
import com.etsy.android.p327ui.cart.C9420x;
import com.etsy.android.p327ui.home.landingpage.C10017b;
import com.etsy.android.p327ui.home.landingpage.C10021c;
import com.etsy.android.p327ui.user.C11769z;
import com.etsy.android.search.savedsearch.C8978d;
import com.etsy.android.search.savedsearch.C8982f;
import java.io.File;
import java.util.List;
import java.util.Random;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p001a0.C0005b;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p287xp.C8339g;
import p409o9.C13127g;
import p455u9.C13452f;
import p753kq.C19857l;
import p762or.C20023b;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: com.etsy.android.lib.push.registration.g */
public final /* synthetic */ class C8834g implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19428b;

    /* renamed from: c */
    public final /* synthetic */ Object f19429c;

    public /* synthetic */ C8834g(Object obj, int i) {
        this.f19428b = i;
        this.f19429c = obj;
    }

    public final Object apply(Object obj) {
        List<ListingCard> list;
        Object obj2 = null;
        switch (this.f19428b) {
            case 0:
                C19857l lVar = (C19857l) this.f19429c;
                C19383o.m32797g(lVar, "$tmp0");
                return (C20023b) lVar.invoke((Integer) obj);
            case 1:
                return LocaleRepository.m34870locale$lambda1((LocaleRepository) this.f19429c, (Throwable) obj);
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                Context context = ((C8886e) this.f19429c).f19638d;
                Random random = C8919r.f19677a;
                File file = new File(context.getFilesDir(), C8919r.m17359d("", ".jpg"));
                if (!C8919r.m17356a(file)) {
                    file = null;
                }
                if (bitmap != null && !TextUtils.isEmpty(C13452f.m21232i(bitmap, file))) {
                    return new C8886e.C8889c(bitmap, file);
                }
                file.delete();
                return new C8886e.C8889c((Bitmap) null, (File) null);
            case 3:
                C8982f fVar = (C8982f) this.f19429c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(fVar, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                if (!vVar.mo74384a()) {
                    return new C8978d.C8979a(C0761x.m1692S0(vVar, fVar.f19823b), vVar.f44614a.f44365f, (Throwable) null);
                }
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                if (a0Var != null) {
                    obj2 = MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), ListSectionActionResult.class);
                }
                C19383o.m32794d(obj2);
                return new C8978d.C8980b((ListSectionActionResult) obj2);
            case 4:
                C9420x xVar = (C9420x) this.f19429c;
                C20145v vVar2 = (C20145v) obj;
                C19383o.m32797g(xVar, "this$0");
                C19383o.m32797g(vVar2, ResponseConstants.RESPONSE);
                if (vVar2.mo74384a()) {
                    C19928a0 a0Var2 = (C19928a0) vVar2.f44615b;
                    if (a0Var2 != null) {
                        obj2 = MoshiModelFactory.createFromByteArray(a0Var2.mo72841a(), CartPage.class);
                    }
                    CartPage cartPage = (CartPage) obj2;
                    return cartPage != null ? new C9326n.C9328b(cartPage) : new C9326n.C9327a(new RuntimeException("CartPage failed to parse."), 2);
                }
                return new C9326n.C9327a(C0761x.m1694T0(vVar2, xVar.f20900d), (Throwable) new HttpException(vVar2));
            case 5:
                C10021c cVar = (C10021c) this.f19429c;
                C20145v vVar3 = (C20145v) obj;
                C19383o.m32797g(cVar, "this$0");
                C19383o.m32797g(vVar3, ResponseConstants.RESPONSE);
                if (!vVar3.mo74384a()) {
                    return new C10017b.C10019b(C0761x.m1692S0(vVar3, cVar.f22070b), vVar3.f44614a.f44365f, (Throwable) null);
                }
                C19928a0 a0Var3 = (C19928a0) vVar3.f44615b;
                if (a0Var3 == null || (list = MoshiModelFactory.createListFromByteArray(a0Var3.mo72841a(), ListingCard.class)) == null) {
                    list = EmptyList.INSTANCE;
                }
                if (!(!list.isEmpty())) {
                    return C10017b.C10018a.f22062a;
                }
                return new C10017b.C10020c(C0005b.m48l0(vVar3), list, C0005b.m46k0(vVar3));
            default:
                C11769z zVar = (C11769z) this.f19429c;
                ReceiptId receiptId = (ReceiptId) obj;
                C19383o.m32797g(zVar, "this$0");
                C19383o.m32797g(receiptId, "receiptId");
                C8071s<C20145v<C19928a0>> a = zVar.f26214a.mo38005a(receiptId.getId());
                C13127g gVar = new C13127g(zVar, 5);
                a.getClass();
                return new C19208j(a, gVar);
        }
    }
}
