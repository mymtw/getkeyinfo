package p404nb;

import android.os.Bundle;
import android.view.View;
import p088e1.C6689b;
import p396mb.C13042h;

/* renamed from: nb.b */
public final class C13103b implements C13042h.C13043a {

    /* renamed from: a */
    public final /* synthetic */ View f28810a;

    /* renamed from: b */
    public final /* synthetic */ C6689b.C6690a f28811b;

    public C13103b(View view, C6689b.C6690a aVar) {
        this.f28810a = view;
        this.f28811b = aVar;
    }

    /* renamed from: a */
    public final boolean mo30839a(Bundle bundle) {
        View view = this.f28810a;
        int a = this.f28811b.mo18875a();
        if (bundle == null) {
            bundle = new Bundle();
        }
        return view.performAccessibilityAction(a, bundle);
    }
}
