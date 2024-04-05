package p404nb;

import android.os.Bundle;
import android.view.View;
import p088e1.C6689b;
import p396mb.C13042h;

/* renamed from: nb.g */
public final class C13108g implements C13042h.C13043a {

    /* renamed from: a */
    public final /* synthetic */ View f28820a;

    /* renamed from: b */
    public final /* synthetic */ C6689b.C6690a f28821b;

    public C13108g(View view, C6689b.C6690a aVar) {
        this.f28820a = view;
        this.f28821b = aVar;
    }

    /* renamed from: a */
    public final boolean mo30839a(Bundle bundle) {
        View view = this.f28820a;
        int a = this.f28821b.mo18875a();
        if (bundle == null) {
            bundle = new Bundle();
        }
        return view.performAccessibilityAction(a, bundle);
    }
}
