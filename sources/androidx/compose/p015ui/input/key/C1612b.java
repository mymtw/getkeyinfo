package androidx.compose.p015ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.input.key.b */
public final class C1612b {

    /* renamed from: a */
    public final KeyEvent f3587a;

    public /* synthetic */ C1612b(KeyEvent keyEvent) {
        this.f3587a = keyEvent;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1612b) && C19383o.m32792b(this.f3587a, ((C1612b) obj).f3587a);
    }

    public final int hashCode() {
        return this.f3587a.hashCode();
    }

    public final String toString() {
        KeyEvent keyEvent = this.f3587a;
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }
}
