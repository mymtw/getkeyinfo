package com.etsy.android.p327ui.util.countries;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorViewModel$setSelectedCountry$1 */
public final class CountrySelectorViewModel$setSelectedCountry$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CountrySelectorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectorViewModel$setSelectedCountry$1(CountrySelectorViewModel countrySelectorViewModel) {
        super(1);
        this.this$0 = countrySelectorViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        C8694h hVar = this.this$0.f26230d;
        StringBuilder h = C0072d.m201h("Error subscribing to ");
        h.append(this.this$0.f26231e);
        hVar.mo21313g(h.toString());
    }
}
