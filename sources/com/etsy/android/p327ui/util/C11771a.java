package com.etsy.android.p327ui.util;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8878a;
import com.etsy.android.p327ui.cart.C9243b;
import com.etsy.android.p327ui.cart.saved.C9342c;
import com.etsy.android.p327ui.shop.C11307x0;
import com.etsy.android.uikit.util.C11905i;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19198c;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p321cc.C8567a;
import p402n9.C13088h;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.util.a */
public final /* synthetic */ class C11771a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C11773c f26220b;

    /* renamed from: c */
    public final /* synthetic */ EtsyId f26221c;

    /* renamed from: d */
    public final /* synthetic */ boolean f26222d;

    /* renamed from: e */
    public final /* synthetic */ C11905i f26223e;

    public /* synthetic */ C11771a(C11773c cVar, EtsyId etsyId, boolean z, C11905i iVar) {
        this.f26220b = cVar;
        this.f26221c = etsyId;
        this.f26222d = z;
        this.f26223e = iVar;
    }

    public final Object call() {
        C11773c cVar = this.f26220b;
        EtsyId etsyId = this.f26221c;
        boolean z = this.f26222d;
        C11905i iVar = this.f26223e;
        C19383o.m32797g(cVar, "this$0");
        C19383o.m32797g(etsyId, "$userId");
        C19383o.m32797g(iVar, "$followRepository");
        cVar.mo38017a(etsyId, z);
        String id = etsyId.getId();
        C19383o.m32797g(id, "userId");
        if (z) {
            C8071s<C20145v<C19928a0>> b = iVar.f26462a.mo38467b(id, "Profile(image_url_75x75,city,transaction_sold_count,is_seller,bio,first_name,last_name,login_name)/Country(name)", "user_id,login_name,creation_tsz,following_count,follower_count");
            C11307x0 x0Var = new C11307x0(3);
            b.getClass();
            return new C19211l(new C19198c(new C19208j(b, x0Var), new C13088h(2)), new C9342c(4));
        }
        C8071s<C20145v<C19928a0>> a = iVar.f26462a.mo38466a(id, "Profile(image_url_75x75,city,transaction_sold_count,is_seller,bio,first_name,last_name,login_name)/Country(name)", "user_id,login_name,creation_tsz,following_count,follower_count");
        C9243b bVar = new C9243b(4);
        a.getClass();
        return new C19211l(new C19198c(new C19208j(a, bVar), new C8878a(1)), new C8567a(5));
    }
}
