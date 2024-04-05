package p404nb;

import android.os.Bundle;
import android.view.View;
import p088e1.C6689b;
import p396mb.C13042h;

/* renamed from: nb.h */
public final class C13109h implements C13042h.C13043a {

    /* renamed from: a */
    public final /* synthetic */ View f28822a;

    /* renamed from: b */
    public final /* synthetic */ C6689b.C6690a f28823b;

    public C13109h(View view, C6689b.C6690a aVar) {
        this.f28822a = view;
        this.f28823b = aVar;
    }

    /* renamed from: a */
    public final boolean mo30839a(Bundle bundle) {
        View view = this.f28822a;
        int a = this.f28823b.mo18875a();
        if (bundle == null) {
            bundle = new Bundle();
        }
        return view.performAccessibilityAction(a, bundle);
    }
}
