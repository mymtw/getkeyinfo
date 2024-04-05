package p411ob;

import android.view.View;
import androidx.core.view.C2273a;
import kotlin.C19394m;
import p088e1.C6689b;

/* renamed from: ob.b */
public final class C13148b extends C2273a {

    /* renamed from: a */
    public final /* synthetic */ C2273a f28917a;

    /* renamed from: b */
    public final /* synthetic */ View f28918b;

    public C13148b(View view, C2273a aVar) {
        this.f28917a = aVar;
        this.f28918b = view;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        C19394m mVar;
        C2273a aVar = this.f28917a;
        if (aVar != null) {
            aVar.onInitializeAccessibilityNodeInfo(view, bVar);
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
        }
        if (bVar != null) {
            bVar.f14759a.setTraversalBefore(this.f28918b);
        }
    }
}
