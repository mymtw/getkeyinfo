package com.etsy.android.lib.network.oauth2;

import android.content.Intent;
import com.appboy.Constants;
import com.etsy.android.C6332c;
import com.etsy.android.lib.network.oauth2.C8799y;
import com.etsy.android.lib.network.oauth2.signin.C8773b;
import com.etsy.android.lib.network.oauth2.signin.C8776e;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.etsy.android.lib.network.oauth2.signin.C8781i;
import com.etsy.android.lib.network.oauth2.signin.C8784l;
import com.etsy.android.lib.network.oauth2.signin.SignInContainerActivity;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3673f7;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.internal.operators.single.SingleCreate;
import p145io.reactivex.internal.operators.single.SingleFlatMap;
import p248tp.C8071s;
import p456ua.C13461f;

/* renamed from: com.etsy.android.lib.network.oauth2.q */
public final class C8767q {

    /* renamed from: a */
    public final C8776e f19280a;

    /* renamed from: b */
    public final C8784l f19281b;

    /* renamed from: c */
    public final C8781i f19282c;

    /* renamed from: d */
    public final C8759i f19283d;

    /* renamed from: e */
    public final C8744a f19284e;

    /* renamed from: f */
    public final C13461f f19285f;

    public C8767q(C8776e eVar, C8784l lVar, C8781i iVar, C8759i iVar2, C8744a aVar, C13461f fVar) {
        C19383o.m32797g(eVar, "etsySignInHelper");
        C19383o.m32797g(lVar, "googleSignInHelper");
        C19383o.m32797g(iVar, "facebookSignInHelper");
        C19383o.m32797g(iVar2, "externalIdentityProvider");
        C19383o.m32797g(aVar, "storeAccessTokens");
        C19383o.m32797g(fVar, "schedulers");
        this.f19280a = eVar;
        this.f19281b = lVar;
        this.f19282c = iVar;
        this.f19283d = iVar2;
        this.f19284e = aVar;
        this.f19285f = fVar;
    }

    /* renamed from: a */
    public final C8071s<AccessTokens> mo30081a(C8799y yVar) {
        Class<SignInContainerActivity> cls = SignInContainerActivity.class;
        C19383o.m32797g(yVar, "signInMethod");
        if (yVar instanceof C8799y.C8800a) {
            String str = ((C8799y.C8800a) yVar).f19349a;
            C8776e eVar = this.f19280a;
            eVar.getClass();
            C19383o.m32797g(str, "email");
            Intent intent = new Intent(eVar.f19315a, cls);
            intent.putExtra("oauth2_sign_in_email", str);
            return new SingleCreate(new C8773b(eVar, intent));
        } else if (C19383o.m32792b(yVar, C8799y.C8802c.f19351a)) {
            C8784l lVar = this.f19281b;
            lVar.getClass();
            return new C19202e(new SingleFlatMap(new SingleCreate(new C3673f7(lVar, 3)), new C3673f7(this, 0)), new C6332c(this, 2));
        } else if (C19383o.m32792b(yVar, C8799y.C8801b.f19350a)) {
            C8781i iVar = this.f19282c;
            iVar.getClass();
            return new C19202e(new SingleFlatMap(new SingleCreate(new C8778g(iVar)), new C8765o(this, 0)), new C8766p(this, 0));
        } else if (yVar instanceof C8799y.C8803d) {
            String str2 = ((C8799y.C8803d) yVar).f19352a;
            C8776e eVar2 = this.f19280a;
            eVar2.getClass();
            C19383o.m32797g(str2, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            Intent intent2 = new Intent(eVar2.f19315a, cls);
            intent2.putExtra(SignInActivity.EXTRA_MAGIC_LINK, str2);
            return new SingleCreate(new C8773b(eVar2, intent2));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
