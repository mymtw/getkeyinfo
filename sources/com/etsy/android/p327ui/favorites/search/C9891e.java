package com.etsy.android.p327ui.favorites.search;

import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.UntrackedObject;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;

/* renamed from: com.etsy.android.ui.favorites.search.e */
public final class C9891e extends UntrackedObject implements C13186o {

    /* renamed from: b */
    public final C9890d f21819b;

    /* renamed from: c */
    public final boolean f21820c;

    /* renamed from: d */
    public final boolean f21821d;

    /* renamed from: e */
    public final boolean f21822e;

    /* renamed from: f */
    public final String f21823f;

    /* renamed from: g */
    public final C9885a f21824g;

    public C9891e(String str, C9890d dVar, boolean z, boolean z2, boolean z3, String str2, int i) {
        z2 = (i & 8) != 0 ? true : z2;
        z3 = (i & 16) != 0 ? true : z3;
        str2 = (i & 32) != 0 ? null : str2;
        C19383o.m32797g(str, ResponseConstants.HINT);
        C19383o.m32797g(dVar, "onSearchListener");
        this.f21819b = dVar;
        this.f21820c = z;
        this.f21821d = z2;
        this.f21822e = z3;
        this.f21823f = str2;
        this.f21824g = null;
    }

    public final int getViewType() {
        return R.id.view_type_search_favorites;
    }
}
