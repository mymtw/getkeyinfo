package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.m */
public final class C9824m extends RecyclerView.C3084b0 {

    /* renamed from: d */
    public static final /* synthetic */ int f21720d = 0;

    /* renamed from: b */
    public final C9823l f21721b;

    /* renamed from: c */
    public final C9816h f21722c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9824m(View view, C9823l lVar, C9816h hVar) {
        super(view);
        C19383o.m32797g(lVar, "dispatcher");
        C19383o.m32797g(hVar, "repo");
        this.f21721b = lVar;
        this.f21722c = hVar;
    }

    /* renamed from: e */
    public final void mo32877e(boolean z) {
        View view = this.itemView;
        if (z) {
            ViewExtensions.m12869m((ImageView) view.findViewById(R.id.favorites_create_list_check));
            ((ImageView) view.findViewById(R.id.favorites_create_list_image)).setAlpha(0.35f);
            return;
        }
        ViewExtensions.m12860d((ImageView) view.findViewById(R.id.favorites_create_list_check));
        ((ImageView) view.findViewById(R.id.favorites_create_list_image)).setAlpha(1.0f);
    }
}
