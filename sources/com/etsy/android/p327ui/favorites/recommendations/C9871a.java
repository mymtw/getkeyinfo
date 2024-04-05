package com.etsy.android.p327ui.favorites.recommendations;

import androidx.compose.animation.C0388a;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.uikit.view.ToggleableSwipeViewPager;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p425q9.C13265p;
import p456ua.C13461f;
import p500ze.C13961b;

/* renamed from: com.etsy.android.ui.favorites.recommendations.a */
public final class C9871a {

    /* renamed from: a */
    public final C8672b f21781a;

    /* renamed from: b */
    public final C11786n f21782b;

    /* renamed from: c */
    public final C13961b f21783c;

    /* renamed from: d */
    public final C13461f f21784d;

    /* renamed from: e */
    public C9872b f21785e;

    /* renamed from: f */
    public ToggleableSwipeViewPager f21786f;

    /* renamed from: g */
    public final C7091a f21787g = new C7091a();

    /* renamed from: h */
    public boolean f21788h;

    public C9871a(C8672b bVar, C11786n nVar, C13961b bVar2, C13461f fVar, C13265p pVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(pVar, "session");
        this.f21781a = bVar;
        this.f21782b = nVar;
        this.f21783c = bVar2;
        this.f21784d = fVar;
    }

    /* renamed from: a */
    public static String m18104a(C9871a aVar, String str, String str2) {
        if (str2 == null) {
            aVar.getClass();
            str2 = null + ' ' + null;
        }
        if (str != null) {
            return C0388a.m1049e(new Object[]{str2}, 1, aVar.f21782b.mo38059c(R.string.collection_buyers_header_with_avatar, new Object[0]), "format(format, *args)");
        }
        return C0388a.m1049e(new Object[]{str2}, 1, aVar.f21782b.mo38059c(R.string.collection_buyers_header_with_no_avatar, new Object[0]), "format(format, *args)");
    }
}
