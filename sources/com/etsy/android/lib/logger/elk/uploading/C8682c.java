package com.etsy.android.lib.logger.elk.uploading;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.Connectivity;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p340ea.C12658b;
import p456ua.C13461f;

/* renamed from: com.etsy.android.lib.logger.elk.uploading.c */
public final class C8682c {

    /* renamed from: a */
    public final C8694h f19076a;

    /* renamed from: b */
    public final C8618c f19077b;

    /* renamed from: c */
    public final C12658b f19078c;

    /* renamed from: d */
    public final Connectivity f19079d;

    /* renamed from: e */
    public final C8684e f19080e;

    /* renamed from: f */
    public final C13461f f19081f;

    public C8682c(C8694h hVar, C8618c cVar, C12658b bVar, Connectivity connectivity, C8684e eVar, C13461f fVar) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(eVar, "elkLogUploadRepository");
        this.f19076a = hVar;
        this.f19077b = cVar;
        this.f19078c = bVar;
        this.f19079d = connectivity;
        this.f19080e = eVar;
        this.f19081f = fVar;
    }

    /* renamed from: a */
    public final boolean mo21338a(boolean z) {
        boolean z2 = false;
        if (!this.f19079d.mo29933a()) {
            this.f19076a.mo21308c();
            return false;
        } else if (this.f19078c.count() == 0) {
            this.f19076a.mo21308c();
            return true;
        } else if (z) {
            this.f19076a.mo21308c();
            while (this.f19078c.count() > 0) {
                z2 = mo21339b();
                if (!z2) {
                    return z2;
                }
            }
            return z2;
        } else {
            this.f19076a.mo21308c();
            return mo21339b();
        }
    }

    /* renamed from: b */
    public final boolean mo21339b() {
        Boolean bool;
        ArrayList c = this.f19078c.mo45439c((int) this.f19077b.mo21135e(C8592b.f18741K));
        C8694h hVar = this.f19076a;
        c.size();
        hVar.mo21308c();
        try {
            C19208j a = this.f19080e.mo21340a(new C8685f(c));
            this.f19081f.getClass();
            bool = (Boolean) a.mo20660i(C13461f.m21235b()).mo20656d();
        } catch (Exception e) {
            this.f19076a.mo21314h(e);
            bool = Boolean.FALSE;
        }
        C19383o.m32796f(bool, "success");
        if (bool.booleanValue()) {
            this.f19076a.mo21308c();
            this.f19078c.mo45437a(c);
            this.f19076a.mo21308c();
            return true;
        }
        C8694h hVar2 = this.f19076a;
        c.size();
        hVar2.mo21308c();
        return false;
    }
}
