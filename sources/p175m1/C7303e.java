package p175m1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C2665e;
import androidx.emoji2.text.C2681i;

/* renamed from: m1.e */
public final class C7303e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f16191a;

    /* renamed from: b */
    public final C7304a f16192b;

    /* renamed from: m1.e$a */
    public static class C7304a {
    }

    public C7303e(KeyListener keyListener) {
        C7304a aVar = new C7304a();
        this.f16191a = keyListener;
        this.f16192b = aVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f16191a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.f16191a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f16192b.getClass();
        Object obj = C2665e.f6003j;
        if (i != 67 ? i != 112 ? false : C2681i.m6434a(editable, keyEvent, true) : C2681i.m6434a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f16191a.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f16191a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f16191a.onKeyUp(view, editable, i, keyEvent);
    }
}
