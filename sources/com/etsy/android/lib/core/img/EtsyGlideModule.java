package com.etsy.android.lib.core.img;

import android.app.ActivityManager;
import android.content.Context;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C5951c;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p168l4.C7255g;
import p168l4.C7259j;
import p284x4.C8316a;

public final class EtsyGlideModule extends C8316a {
    /* renamed from: a */
    public final void mo16714a(Context context, C5951c cVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(cVar, "builder");
        Object systemService = context.getSystemService("activity");
        C19383o.m32795e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        if (!((ActivityManager) systemService).isLowRamDevice()) {
            Object systemService2 = context.getSystemService("activity");
            C19383o.m32795e(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
            long round = Math.round(((double) (((ActivityManager) systemService2).getMemoryClass() * RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE * RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE)) * 0.4d);
            int i = context.getResources().getDisplayMetrics().widthPixels * context.getResources().getDisplayMetrics().heightPixels * 4;
            float f = ((float) ((round - ((long) 8388608)) - ((long) (i * 1)))) / ((float) i);
            float f2 = 6.0f;
            float f3 = (f - 6.0f) / 2.0f;
            if (f3 > 0.0f) {
                f2 = 6.0f + f3;
            }
            C7259j.C7260a aVar = new C7259j.C7260a(context);
            C0114h.m280K("Memory cache screens must be greater than or equal to 0", f2 >= 0.0f);
            aVar.f16114d = f2;
            aVar.f16116f = 6291456;
            cVar.f12747j = new C7259j(aVar);
            cVar.f12746i = new C7255g(context, 917504000);
        }
    }
}
