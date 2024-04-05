package com.etsy.android.search;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;

/* renamed from: com.etsy.android.search.c */
public final class C8971c {

    /* renamed from: a */
    public final C8970b f19789a;

    /* renamed from: b */
    public final C13461f f19790b;

    /* renamed from: c */
    public final C8694h f19791c;

    /* renamed from: d */
    public final SharedPreferences f19792d;

    public C8971c(Context context, C8970b bVar, C13461f fVar, C8694h hVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(bVar, "endpoint");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(hVar, "logCat");
        this.f19789a = bVar;
        this.f19790b = fVar;
        this.f19791c = hVar;
        this.f19792d = context.getSharedPreferences("AutoSuggest", 0);
    }
}
