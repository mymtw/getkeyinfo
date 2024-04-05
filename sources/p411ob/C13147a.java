package p411ob;

import android.view.View;
import androidx.core.view.C2273a;
import androidx.viewpager.widget.ViewPager;
import kotlin.C19394m;
import p088e1.C6689b;

/* renamed from: ob.a */
public final class C13147a extends C2273a {

    /* renamed from: a */
    public final /* synthetic */ C2273a f28915a;

    /* renamed from: b */
    public final /* synthetic */ View f28916b;

    public C13147a(ViewPager viewPager, C2273a aVar) {
        this.f28915a = aVar;
        this.f28916b = viewPager;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        C19394m mVar;
        C2273a aVar = this.f28915a;
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
            bVar.f14759a.setTraversalAfter(this.f28916b);
        }
    }
}
