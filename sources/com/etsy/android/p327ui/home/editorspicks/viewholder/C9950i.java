package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.interfaces.ListingLike;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p415of.C13186o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.i */
public final class C9950i implements C13186o, C8698l {

    /* renamed from: b */
    public final String f21938b;

    /* renamed from: c */
    public final String f21939c;

    /* renamed from: d */
    public final List<ListingLike> f21940d;

    /* renamed from: e */
    public Boolean f21941e;

    /* renamed from: f */
    public int f21942f;

    public C9950i() {
        throw null;
    }

    public C9950i(String str, String str2, List list) {
        int i;
        C19383o.m32797g(str2, "subtitle");
        C19383o.m32797g(list, "listings");
        this.f21938b = str;
        this.f21939c = str2;
        this.f21940d = list;
        this.f21941e = null;
        if (list.isEmpty()) {
            i = 0;
        } else if (list.size() % 2 == 0) {
            i = (list.size() / 2) - 1;
        } else {
            i = list.size() / 2;
        }
        this.f21942f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9950i)) {
            return false;
        }
        C9950i iVar = (C9950i) obj;
        return C19383o.m32792b(this.f21938b, iVar.f21938b) && C19383o.m32792b(this.f21939c, iVar.f21939c) && C19383o.m32792b(this.f21940d, iVar.f21940d) && C19383o.m32792b(this.f21941e, iVar.f21941e);
    }

    public final int getViewType() {
        return R.id.view_type_finds_hero_carousel;
    }

    public final int hashCode() {
        String str = this.f21938b;
        int i = 0;
        int g = C13983i.m21488g(this.f21940d, C0023f.m105e(this.f21939c, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        Boolean bool = this.f21941e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HeroCarousel(title=");
        h.append(this.f21938b);
        h.append(", subtitle=");
        h.append(this.f21939c);
        h.append(", listings=");
        h.append(this.f21940d);
        h.append(", isLongSubtitle=");
        h.append(this.f21941e);
        h.append(')');
        return h.toString();
    }
}
