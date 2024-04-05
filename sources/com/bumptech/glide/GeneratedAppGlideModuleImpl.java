package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.etsy.android.lib.core.img.EtsyGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    public final EtsyGlideModule f12720a = new EtsyGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.etsy.android.lib.core.img.EtsyGlideModule");
        }
    }

    /* renamed from: a */
    public final void mo16714a(Context context, C5951c cVar) {
        this.f12720a.mo16714a(context, cVar);
    }

    /* renamed from: b */
    public final void mo16715b() {
        this.f12720a.getClass();
    }

    /* renamed from: c */
    public final boolean mo16716c() {
        this.f12720a.getClass();
        return false;
    }

    /* renamed from: d */
    public final Set<Class<?>> mo16712d() {
        return Collections.emptySet();
    }

    /* renamed from: e */
    public final RequestManagerRetriever.C6119b mo16713e() {
        return new C5949a();
    }
}
