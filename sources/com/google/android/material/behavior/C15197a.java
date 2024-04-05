package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C15439g;
import java.util.WeakHashMap;
import p088e1.C6697d;

/* renamed from: com.google.android.material.behavior.a */
public final class C15197a implements C6697d {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f34109a;

    public C15197a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f34109a = swipeDismissBehavior;
    }

    /* renamed from: a */
    public final boolean mo10006a(View view) {
        boolean z = false;
        if (!this.f34109a.mo53108a(view)) {
            return false;
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        boolean z2 = C2364y.C2369e.m5233d(view) == 1;
        int i = this.f34109a.f34098d;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.C15195b bVar = this.f34109a.f34096b;
        if (bVar != null) {
            ((C15439g) bVar).mo54776a(view);
        }
        return true;
    }
}
