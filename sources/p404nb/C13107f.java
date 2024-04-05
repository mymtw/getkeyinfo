package p404nb;

import android.os.Bundle;
import android.view.View;
import p088e1.C6689b;
import p396mb.C13042h;

/* renamed from: nb.f */
public final class C13107f implements C13042h.C13043a {

    /* renamed from: a */
    public final /* synthetic */ View f28818a;

    /* renamed from: b */
    public final /* synthetic */ C6689b.C6690a f28819b;

    public C13107f(View view, C6689b.C6690a aVar) {
        this.f28818a = view;
        this.f28819b = aVar;
    }

    /* renamed from: a */
    public final boolean mo30839a(Bundle bundle) {
        View view = this.f28818a;
        int a = this.f28819b.mo18875a();
        if (bundle == null) {
            bundle = new Bundle();
        }
        return view.performAccessibilityAction(a, bundle);
    }
}
