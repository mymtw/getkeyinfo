package com.etsy.android.lib.network.oauth2;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.network.oauth2.OAuth2Repository;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.internal.operators.single.C19206h;
import p340ea.C12664e;
import p340ea.C12665f;
import p340ea.C12666g;
import p340ea.C12673n;
import p456ua.C13461f;
import p753kq.C19846a;

final class OAuth2Repository$performTokenExchange$newTokenPackage$1 extends Lambda implements C19846a<C19394m> {

    /* renamed from: $e */
    public final /* synthetic */ Exception f19213$e;
    public final /* synthetic */ OAuth2Repository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuth2Repository$performTokenExchange$newTokenPackage$1(OAuth2Repository oAuth2Repository, Exception exc) {
        super(0);
        this.this$0 = oAuth2Repository;
        this.f19213$e = exc;
    }

    public final void invoke() {
        if (this.this$0.f19208g.mo21132b(C8592b.f18823q1)) {
            CrashUtil.m17307a().mo30457b(new OAuth2Repository.OAuth2TokenException("Token exchange attempt failed.", this.f19213$e));
            return;
        }
        C12673n nVar = this.this$0.f19207f;
        StringBuilder h = C0072d.m201h("OAuth2Repository.TokenExchangeError: ");
        String localizedMessage = this.f19213$e.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "unknown";
        }
        h.append(localizedMessage);
        String sb = h.toString();
        nVar.getClass();
        C19383o.m32797g(sb, "message");
        C19206h hVar = new C19206h(new C12664e(nVar, sb));
        nVar.f27943a.getClass();
        hVar.mo20660i(C13461f.m21235b()).mo20658g(new C12665f(0), new C12666g(0));
    }
}
