package com.etsy.android.lib.network.oauth2.signin;

import android.util.Log;
import androidx.activity.result.C0126g;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.login.C12308b;
import com.facebook.login.C12311e;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.VmListensToRepoForUserAndCheckoutPayload;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p248tp.C8072t;
import p248tp.C8074v;
import p568fn.C17782b;
import p594jh.C17931k0;
import p619mh.C18225f;
import p645pi.C18383d;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.g */
public final /* synthetic */ class C8778g implements C8074v, C17931k0.C17936e, C18225f.C18226a, VmListensToRepoForUserAndCheckoutPayload {

    /* renamed from: b */
    public final /* synthetic */ Object f19320b;

    public /* synthetic */ C8778g(Object obj) {
        this.f19320b = obj;
    }

    /* renamed from: b */
    public final void mo21075b(C18225f fVar) {
        C18383d dVar = (C18383d) this.f19320b;
        C18383d.C18385b bVar = (C18383d.C18385b) fVar;
        dVar.getClass();
        bVar.f39937b = 0;
        bVar.f40184d = null;
        dVar.f40439b.add(bVar);
    }

    /* renamed from: f */
    public final void mo11996f(C8072t tVar) {
        C8781i iVar = (C8781i) this.f19320b;
        C19383o.m32797g(iVar, "this$0");
        iVar.f19327c.mo39617f(iVar.f19326b, new C8779h(iVar, tVar));
        C12311e eVar = iVar.f19327c;
        FragmentActivity fragmentActivity = iVar.f19325a;
        List<String> e0 = C17782b.m29865e0("email", "public_profile");
        eVar.getClass();
        if (e0 != null) {
            for (String str : e0) {
                if (C12311e.m20140c(str)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{str}));
                }
            }
        }
        C12308b bVar = new C12308b(e0);
        if (fragmentActivity instanceof C0126g) {
            Log.w(C12311e.f27437k, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        eVar.mo39618g(new C12311e.C12314c(fragmentActivity), eVar.mo39615a(bVar));
    }

    public final void onTaskCompleted() {
        ((MainPaysheetViewModel) this.f19320b).prepareFinalUi();
    }
}
