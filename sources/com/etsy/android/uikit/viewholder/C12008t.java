package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p357gf.C12796e;
import p425q9.C13265p;

/* renamed from: com.etsy.android.uikit.viewholder.t */
public final class C12008t {

    /* renamed from: a */
    public final C8672b f26764a;

    /* renamed from: b */
    public final C13265p f26765b;

    /* renamed from: c */
    public final C12009u f26766c;

    /* renamed from: d */
    public final StrikethroughSpan f26767d = new StrikethroughSpan();

    /* renamed from: e */
    public final ForegroundColorSpan f26768e;

    /* renamed from: f */
    public final StyleKitSpan.NormalSpan f26769f;

    public C12008t(Context context, C8672b bVar, C8623e eVar, C13265p pVar, C12796e eVar2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(bVar, "analyticsContext");
        C19383o.m32797g(eVar, "configMap");
        C19383o.m32797g(pVar, "session");
        this.f26764a = bVar;
        this.f26765b = pVar;
        this.f26766c = eVar2;
        Object obj = C8184a.f17966a;
        this.f26768e = new ForegroundColorSpan(C8184a.C8188d.m16468a(context, R.color.clg_color_charcoal));
        this.f26769f = new StyleKitSpan.NormalSpan(context);
    }
}
