package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C2273a;
import androidx.recyclerview.widget.C3137d0;
import androidx.recyclerview.widget.RecyclerView;
import p088e1.C6689b;

@Deprecated
/* renamed from: androidx.preference.g */
public final class C3049g extends C3137d0 {

    /* renamed from: c */
    public final RecyclerView f6947c;

    /* renamed from: d */
    public final C3137d0.C3138a f6948d = this.f7211b;

    /* renamed from: e */
    public final C3050a f6949e = new C3050a();

    /* renamed from: androidx.preference.g$a */
    public class C3050a extends C2273a {
        public C3050a() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            Preference l;
            C3049g.this.f6948d.onInitializeAccessibilityNodeInfo(view, bVar);
            int childAdapterPosition = C3049g.this.f6947c.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = C3049g.this.f6947c.getAdapter();
            if ((adapter instanceof C3040c) && (l = ((C3040c) adapter).mo11193l(childAdapterPosition)) != null) {
                l.mo11062r(bVar);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return C3049g.this.f6948d.performAccessibilityAction(view, i, bundle);
        }
    }

    public C3049g(RecyclerView recyclerView) {
        super(recyclerView);
        this.f6947c = recyclerView;
    }

    /* renamed from: a */
    public final C2273a mo11207a() {
        return this.f6949e;
    }
}
