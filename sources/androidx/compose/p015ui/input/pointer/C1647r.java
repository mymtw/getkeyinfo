package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.input.pointer.r */
public final class C1647r {

    /* renamed from: a */
    public final List<C1648s> f3671a;

    /* renamed from: b */
    public final MotionEvent f3672b;

    public C1647r(ArrayList arrayList, MotionEvent motionEvent) {
        C19383o.m32797g(arrayList, "pointers");
        C19383o.m32797g(motionEvent, "motionEvent");
        this.f3671a = arrayList;
        this.f3672b = motionEvent;
    }
}
