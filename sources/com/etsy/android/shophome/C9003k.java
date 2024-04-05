package com.etsy.android.shophome;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import kotlin.jvm.internal.C19383o;
import p340ea.C12673n;
import p456ua.C13461f;

/* renamed from: com.etsy.android.shophome.k */
public final class C9003k implements C2870k0.C2872b {

    /* renamed from: a */
    public final String f19867a;

    /* renamed from: b */
    public final String f19868b;

    /* renamed from: c */
    public final C8994h f19869c;

    /* renamed from: d */
    public final C13461f f19870d;

    /* renamed from: e */
    public final C12673n f19871e;

    /* renamed from: f */
    public final C8618c f19872f;

    public C9003k(String str, String str2, C8994h hVar, C13461f fVar, C12673n nVar, C8623e eVar) {
        C19383o.m32797g(hVar, "repository");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(nVar, "elkLogger");
        this.f19867a = str;
        this.f19868b = str2;
        this.f19869c = hVar;
        this.f19870d = fVar;
        this.f19871e = nVar;
        this.f19872f = eVar;
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        return new C8999j(this.f19867a, this.f19868b, this.f19869c, this.f19870d, this.f19871e, this.f19872f);
    }
}
