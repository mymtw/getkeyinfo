package androidx.fragment.app;

import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: androidx.fragment.app.i0 */
public final class C2767i0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6307b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f6308c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f6309d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f6310e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f6311f;

    public C2767i0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f6307b = i;
        this.f6308c = arrayList;
        this.f6309d = arrayList2;
        this.f6310e = arrayList3;
        this.f6311f = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.f6307b; i++) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2373i.m5275v((View) this.f6308c.get(i), (String) this.f6309d.get(i));
            C2364y.C2373i.m5275v((View) this.f6310e.get(i), (String) this.f6311f.get(i));
        }
    }
}
