package com.etsy.android.p327ui.cart.clicklisteners;

import android.widget.FrameLayout;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C19383o;
import p466vc.C13574d;
import p513bj.C14049b0;
import p513bj.C14075p;
import p520cj.C14164p;
import p594jh.C17894b1;
import p594jh.C17931k0;
import p619mh.C18223d;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.c */
public final /* synthetic */ class C9272c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f20480b;

    /* renamed from: c */
    public final /* synthetic */ Object f20481c;

    /* renamed from: d */
    public final /* synthetic */ Object f20482d;

    public /* synthetic */ C9272c(int i, Object obj, Object obj2) {
        this.f20480b = i;
        this.f20481c = obj;
        this.f20482d = obj2;
    }

    public final void run() {
        switch (this.f20480b) {
            case 0:
                CollageBottomSheet collageBottomSheet = (CollageBottomSheet) this.f20481c;
                CollageTextInput collageTextInput = (CollageTextInput) this.f20482d;
                C19383o.m32797g(collageBottomSheet, "$this_apply");
                C19383o.m32797g(collageTextInput, "$textInput");
                BottomSheetBehavior<FrameLayout> behavior = collageBottomSheet.getBehavior();
                C19383o.m32796f(behavior, "behavior");
                behavior.setState(3);
                collageTextInput.requestFocus();
                return;
            case 1:
                ListingFragment.m35007handleSideEffect$lambda4$lambda3((ListingFragment) this.f20481c, (C13574d.C13576b) this.f20482d);
                return;
            case 2:
                C17894b1 b1Var = (C17894b1) this.f20482d;
                ((C17931k0) this.f20481c).getClass();
                try {
                    synchronized (b1Var) {
                    }
                    b1Var.f38859a.handleMessage(b1Var.f38862d, b1Var.f38863e);
                    b1Var.mo69361b(true);
                    return;
                } catch (ExoPlaybackException e) {
                    C14075p.m21698j("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    b1Var.mo69361b(true);
                    throw th;
                }
            default:
                C14164p.C14165a aVar = (C14164p.C14165a) this.f20481c;
                C18223d dVar = (C18223d) this.f20482d;
                aVar.getClass();
                synchronized (dVar) {
                }
                C14164p pVar = aVar.f31267b;
                int i = C14049b0.f30913a;
                pVar.mo47109y(dVar);
                return;
        }
    }
}
