package com.etsy.android.lib.network.oauth2;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.p327ui.search.shopresults.SearchResultsShopsViewModel;
import com.etsy.android.p327ui.search.shopresults.SearchShopsRepository;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p346fa.C12703a;
import p486y9.C13888d;
import p486y9.C13890f;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.m */
public final class C8763m implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19264a;

    /* renamed from: b */
    public final C19011a f19265b;

    /* renamed from: c */
    public final C19011a f19266c;

    /* renamed from: d */
    public final Object f19267d;

    public /* synthetic */ C8763m(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f19264a = i;
        this.f19265b = aVar;
        this.f19266c = aVar2;
        this.f19267d = aVar3;
    }

    public final Object get() {
        switch (this.f19264a) {
            case 0:
                return new OAuth2Authenticator((C8793t) this.f19265b.get(), (C8769s) this.f19266c.get(), (C12703a) ((C19011a) this.f19267d).get());
            case 1:
                return new SearchResultsShopsViewModel((SearchShopsRepository) this.f19265b.get(), (Connectivity) this.f19266c.get(), (C12703a) ((C19011a) this.f19267d).get());
            default:
                Context context = (Context) this.f19265b.get();
                C13890f fVar = (C13890f) this.f19266c.get();
                ((C19388s) this.f19267d).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                C19383o.m32797g(fVar, "localeResolver");
                return new C13888d(context, fVar);
        }
    }

    public C8763m(C19388s sVar, C19011a aVar, C19011a aVar2) {
        this.f19264a = 2;
        this.f19267d = sVar;
        this.f19265b = aVar;
        this.f19266c = aVar2;
    }
}
