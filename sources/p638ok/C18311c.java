package p638ok;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ok.c */
public class C18311c<V extends View> extends CoordinatorLayout.C2245c<V> {

    /* renamed from: a */
    public C18312d f40201a;

    /* renamed from: b */
    public int f40202b = 0;

    public C18311c() {
    }

    /* renamed from: a */
    public final int mo69849a() {
        C18312d dVar = this.f40201a;
        if (dVar != null) {
            return dVar.f40206d;
        }
        return 0;
    }

    /* renamed from: b */
    public void mo69848b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo69848b(coordinatorLayout, v, i);
        if (this.f40201a == null) {
            this.f40201a = new C18312d(v);
        }
        C18312d dVar = this.f40201a;
        dVar.f40204b = dVar.f40203a.getTop();
        dVar.f40205c = dVar.f40203a.getLeft();
        this.f40201a.mo69850a();
        int i2 = this.f40202b;
        if (i2 == 0) {
            return true;
        }
        this.f40201a.mo69851b(i2);
        this.f40202b = 0;
        return true;
    }

    public C18311c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
