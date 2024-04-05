package com.etsy.android.search.savedsearch;

import com.etsy.android.lib.config.C8618c;
import kotlin.jvm.internal.C19383o;
import p496za.C13943a;

/* renamed from: com.etsy.android.search.savedsearch.b */
public final class C8976b {

    /* renamed from: a */
    public final C13943a f19809a;

    /* renamed from: b */
    public final C8618c f19810b;

    /* renamed from: c */
    public boolean f19811c;

    /* renamed from: d */
    public boolean f19812d;

    /* renamed from: e */
    public boolean f19813e;

    public C8976b(C8618c cVar, C13943a aVar) {
        C19383o.m32797g(aVar, "sharedPrefProvider");
        C19383o.m32797g(cVar, "configMap");
        this.f19809a = aVar;
        this.f19810b = cVar;
        this.f19813e = aVar.mo46761a().getBoolean("savedSearchOnboardingPromptShownKey", false);
    }
}
