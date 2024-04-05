package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: androidx.compose.ui.input.pointer.i */
public final class C1637i {

    /* renamed from: a */
    public static final C1637i f3641a = new C1637i();

    /* renamed from: a */
    public final long mo6601a(MotionEvent motionEvent, int i) {
        C19383o.m32797g(motionEvent, "motionEvent");
        return C19421p.m32952q(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
