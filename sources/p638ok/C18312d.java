package p638ok;

import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: ok.d */
public final class C18312d {

    /* renamed from: a */
    public final View f40203a;

    /* renamed from: b */
    public int f40204b;

    /* renamed from: c */
    public int f40205c;

    /* renamed from: d */
    public int f40206d;

    public C18312d(View view) {
        this.f40203a = view;
    }

    /* renamed from: a */
    public final void mo69850a() {
        View view = this.f40203a;
        int top = this.f40206d - (view.getTop() - this.f40204b);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        view.offsetTopAndBottom(top);
        View view2 = this.f40203a;
        view2.offsetLeftAndRight(0 - (view2.getLeft() - this.f40205c));
    }

    /* renamed from: b */
    public final boolean mo69851b(int i) {
        if (this.f40206d == i) {
            return false;
        }
        this.f40206d = i;
        mo69850a();
        return true;
    }
}
