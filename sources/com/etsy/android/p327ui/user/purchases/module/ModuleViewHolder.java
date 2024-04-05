package com.etsy.android.p327ui.user.purchases.module;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.user.purchases.C11639e;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.stylekit.views.CollageHeadingLayout;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder */
public final class ModuleViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: o */
    public static final /* synthetic */ int f25782o = 0;

    /* renamed from: b */
    public final C11661b f25783b;

    /* renamed from: c */
    public int f25784c;

    /* renamed from: d */
    public final C19285c f25785d = C19350d.m32677b(new ModuleViewHolder$moduleHeading$2(this));

    /* renamed from: e */
    public final C19285c f25786e = C19350d.m32677b(new ModuleViewHolder$moduleTitle$2(this));

    /* renamed from: f */
    public final C19285c f25787f = C19350d.m32677b(new ModuleViewHolder$linkTitle$2(this));

    /* renamed from: g */
    public final C19285c f25788g = C19350d.m32677b(new ModuleViewHolder$moduleListing0$2(this));

    /* renamed from: h */
    public final C19285c f25789h = C19350d.m32677b(new ModuleViewHolder$moduleListing1$2(this));

    /* renamed from: i */
    public final C19285c f25790i = C19350d.m32677b(new ModuleViewHolder$moduleListing2$2(this));

    /* renamed from: j */
    public final C19285c f25791j = C19350d.m32677b(new ModuleViewHolder$moduleListing3$2(this));

    /* renamed from: k */
    public final C19285c f25792k = C19350d.m32677b(new ModuleViewHolder$moduleListing4$2(this));

    /* renamed from: l */
    public final C19285c f25793l = C19350d.m32677b(new ModuleViewHolder$moduleListing5$2(this));

    /* renamed from: m */
    public final C19285c f25794m = C19350d.m32677b(new ModuleViewHolder$moduleLink$2(this));

    /* renamed from: n */
    public final C19285c f25795n = C19350d.m32677b(new ModuleViewHolder$listingCards$2(this));

    /* renamed from: com.etsy.android.ui.user.purchases.module.ModuleViewHolder$ListingCard */
    public static final class ListingCard {

        /* renamed from: a */
        public final C19285c f25796a;

        /* renamed from: b */
        public final C19285c f25797b;

        public ListingCard(MaterialCardView materialCardView) {
            this.f25796a = C19350d.m32677b(new ModuleViewHolder$ListingCard$imageView$2(materialCardView));
            this.f25797b = C19350d.m32677b(new ModuleViewHolder$ListingCard$favHeartButton$2(materialCardView));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleViewHolder(View view, C11661b bVar) {
        super(view);
        C19383o.m32797g(bVar, "dispatcher");
        this.f25783b = bVar;
    }

    /* renamed from: e */
    public final void mo37747e(C11639e.C11641b bVar) {
        C11667h hVar = bVar.f25765a;
        Object value = this.f25786e.getValue();
        C19383o.m32796f(value, "<get-moduleTitle>(...)");
        ((TextView) value).setText(hVar.f25830a);
        Object value2 = this.f25787f.getValue();
        C19383o.m32796f(value2, "<get-linkTitle>(...)");
        ((CollageButton) value2).setText(hVar.f25831b.f25814a);
        Object value3 = this.f25787f.getValue();
        C19383o.m32796f(value3, "<get-linkTitle>(...)");
        ViewExtensions.m12869m((CollageButton) value3);
        List<C11666g> list = bVar.f25765a.f25832c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object value4 = ((ListingCard) ((List) this.f25795n.getValue()).get(i)).f25796a.getValue();
            C19383o.m32796f(value4, "<get-imageView>(...)");
            ImageView imageView = (ImageView) value4;
            Object value5 = ((ListingCard) ((List) this.f25795n.getValue()).get(i)).f25797b.getValue();
            C19383o.m32796f(value5, "<get-favHeartButton>(...)");
            FavHeartButton favHeartButton = (FavHeartButton) value5;
            C11666g gVar = list.get(i);
            imageView.setContentDescription(gVar.f25824c);
            ViewExtensions.m12866j(imageView, new ModuleViewHolder$bind$1(this, gVar));
            ViewExtensions.m12868l(imageView, new ModuleViewHolder$bind$2(this, gVar));
            Object value6 = this.f25785d.getValue();
            C19383o.m32796f(value6, "<get-moduleHeading>(...)");
            ViewExtensions.m12866j((CollageHeadingLayout) value6, new ModuleViewHolder$bind$3(this, hVar));
            Object value7 = this.f25794m.getValue();
            C19383o.m32796f(value7, "<get-moduleLink>(...)");
            ViewExtensions.m12866j((TextView) value7, new ModuleViewHolder$bind$4(this, hVar));
            C11665f fVar = gVar.f25828g;
            if (fVar != null) {
                int i2 = this.f25784c;
                if (i2 <= 0) {
                    ViewExtensions.m12864h(imageView, new ModuleViewHolder$bind$5(this, imageView, gVar));
                } else {
                    String a = fVar.mo37768a(i2);
                    if (a != null) {
                        C0114h.m270B0(this.itemView.getContext()).load(a).mo16816M(imageView);
                    }
                }
            }
            favHeartButton.setFav(gVar.f25826e || gVar.f25827f, gVar.f25824c, false);
            ViewExtensions.m12866j(favHeartButton, new ModuleViewHolder$bind$6(this, gVar));
        }
    }
}
