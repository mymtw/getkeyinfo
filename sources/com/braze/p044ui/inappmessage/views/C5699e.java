package com.braze.p044ui.inappmessage.views;

import android.view.View;
import com.google.android.exoplayer2.drm.C14216b;
import p513bj.C14049b0;
import p520cj.C14164p;
import p568fn.C17781a;
import p616ln.C18203b;
import p616ln.C18208f;

/* renamed from: com.braze.ui.inappmessage.views.e */
public final /* synthetic */ class C5699e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f12089b;

    /* renamed from: c */
    public final /* synthetic */ Object f12090c;

    /* renamed from: d */
    public final /* synthetic */ Object f12091d;

    public /* synthetic */ C5699e(int i, Object obj, Object obj2) {
        this.f12089b = i;
        this.f12090c = obj;
        this.f12091d = obj2;
    }

    public final void run() {
        switch (this.f12089b) {
            case 0:
                ((InAppMessageImmersiveBaseView) this.f12090c).lambda$setLargerCloseButtonClickArea$1((View) this.f12091d);
                return;
            case 1:
                C14216b.C14217a aVar = (C14216b.C14217a) this.f12090c;
                ((C14216b) this.f12091d).mo47328v(aVar.f31564a, aVar.f31565b);
                return;
            case 2:
                C14164p pVar = ((C14164p.C14165a) this.f12090c).f31267b;
                int i = C14049b0.f30913a;
                pVar.mo47101a((String) this.f12091d);
                return;
            default:
                C18208f fVar = (C18208f) this.f12090c;
                C18203b bVar = (C18203b) this.f12091d;
                C17781a aVar2 = C18208f.f39881s;
                fVar.getClass();
                fVar.mo69737d(bVar.f39856a, bVar.f39857b);
                return;
        }
    }
}
