package com.etsy.android.p327ui.favorites.add;

import com.google.android.exoplayer2.source.C14355m;
import com.google.android.exoplayer2.source.C14363n;
import kotlin.jvm.internal.Ref$ObjectRef;
import p644ph.C18364t;

/* renamed from: com.etsy.android.ui.favorites.add.s */
public final /* synthetic */ class C9784s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21629b;

    /* renamed from: c */
    public final /* synthetic */ Object f21630c;

    /* renamed from: d */
    public final /* synthetic */ Object f21631d;

    public /* synthetic */ C9784s(int i, Object obj, Object obj2) {
        this.f21629b = i;
        this.f21630c = obj;
        this.f21631d = obj2;
    }

    public final void run() {
        switch (this.f21629b) {
            case 0:
                NameAListFragment.m34975onStart$lambda1((NameAListFragment) this.f21630c, (Ref$ObjectRef) this.f21631d);
                return;
            default:
                C14355m mVar = (C14355m) this.f21630c;
                C18364t tVar = (C18364t) this.f21631d;
                mVar.f32219z = mVar.f32212s == null ? tVar : new C18364t.C18366b(-9223372036854775807L);
                mVar.f32182A = tVar.mo47835i();
                int i = 1;
                boolean z = mVar.f32188G == -1 && tVar.mo47835i() == -9223372036854775807L;
                mVar.f32183B = z;
                if (z) {
                    i = 7;
                }
                mVar.f32184C = i;
                ((C14363n) mVar.f32201h).mo47837s(mVar.f32182A, tVar.mo47834g(), mVar.f32183B);
                if (!mVar.f32216w) {
                    mVar.mo47809z();
                    return;
                }
                return;
        }
    }
}
