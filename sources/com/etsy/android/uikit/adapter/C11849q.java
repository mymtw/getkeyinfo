package com.etsy.android.uikit.adapter;

import android.view.View;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.google.android.exoplayer2.ExoPlaybackException;
import kotlin.jvm.internal.C19383o;
import p594jh.C17884a1;

/* renamed from: com.etsy.android.uikit.adapter.q */
public final class C11849q implements C17884a1.C17888d {

    /* renamed from: b */
    public final /* synthetic */ View f26343b;

    /* renamed from: c */
    public final /* synthetic */ CollagePlayerView f26344c;

    public C11849q(CollagePlayerView collagePlayerView, View view) {
        this.f26343b = view;
        this.f26344c = collagePlayerView;
    }

    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            ViewExtensions.m12869m(this.f26343b);
            ViewExtensions.m12869m(this.f26344c);
        } else if (i != 3) {
            ViewExtensions.m12860d(this.f26343b);
            ViewExtensions.m12860d(this.f26344c);
        } else {
            ViewExtensions.m12860d(this.f26343b);
            ViewExtensions.m12869m(this.f26344c);
        }
    }

    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        C19383o.m32797g(exoPlaybackException, "error");
        ViewExtensions.m12869m(this.f26343b);
        ViewExtensions.m12860d(this.f26344c);
    }
}
