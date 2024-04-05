package com.etsy.android.p327ui.favorites;

import android.view.View;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;

/* renamed from: com.etsy.android.ui.favorites.p */
public final /* synthetic */ class C9864p implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f21771b;

    /* renamed from: c */
    public final /* synthetic */ int f21772c;

    /* renamed from: d */
    public final /* synthetic */ Object f21773d;

    public /* synthetic */ C9864p(Object obj, int i, int i2) {
        this.f21771b = i2;
        this.f21773d = obj;
        this.f21772c = i;
    }

    public final void onClick(View view) {
        switch (this.f21771b) {
            case 0:
                FavoritesHeaderView.m34970getTab$lambda3$lambda2((C9896u) this.f21773d, this.f21772c, view);
                return;
            default:
                StyledPlayerControlView.C14401d dVar = (StyledPlayerControlView.C14401d) this.f21773d;
                int i = this.f21772c;
                if (i != dVar.f32419d) {
                    StyledPlayerControlView.this.setPlaybackSpeed(((float) dVar.f32418c[i]) / 100.0f);
                }
                StyledPlayerControlView.this.settingsWindow.dismiss();
                return;
        }
    }
}
