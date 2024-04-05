package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.etsy.android.lib.core.img.GlideRequests;
import p273w4.C8239h;
import p273w4.C8242k;

/* renamed from: com.bumptech.glide.a */
public final class C5949a implements RequestManagerRetriever.C6119b {
    /* renamed from: a */
    public final RequestManager mo16811a(Glide glide, C8239h hVar, C8242k kVar, Context context) {
        return new GlideRequests(glide, hVar, kVar, context);
    }
}
