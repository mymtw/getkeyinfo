package com.etsy.android.p327ui.listing.favoriting;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p400mf.C13074b;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.favoriting.h */
public final class C10130h {
    /* renamed from: a */
    public static C13574d.C13594c m18268a(ListingViewState.C10092d dVar, C13597g.C13649h1 h1Var) {
        C19383o.m32797g(h1Var, "event");
        C13074b bVar = h1Var.f30136a;
        if (bVar instanceof C13074b.C13075a) {
            return C0761x.m1709a1(dVar, new HeartUpdateEventHandler$handle$1(dVar, bVar));
        }
        if (bVar instanceof C13074b.C13076b) {
            return C0761x.m1709a1(dVar, new HeartUpdateEventHandler$handle$2(dVar, bVar));
        }
        if (bVar instanceof C13074b.C13077c) {
            return C0761x.m1709a1(dVar, new HeartUpdateEventHandler$handle$3(bVar));
        }
        throw new NoWhenBranchMatchedException();
    }
}
