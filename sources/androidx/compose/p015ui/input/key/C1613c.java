package androidx.compose.p015ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: androidx.compose.ui.input.key.c */
public final class C1613c {
    /* renamed from: a */
    public static final long m3423a(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "$this$key");
        return C19421p.m32951p(keyEvent.getKeyCode());
    }

    /* renamed from: b */
    public static final int m3424b(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
