package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.C2665e;
import p001a0.C0005b;
import p175m1.C7295a;
import p175m1.C7299c;
import p175m1.C7303e;
import p175m1.C7309g;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.h */
public final class C0320h {

    /* renamed from: a */
    public final EditText f810a;

    /* renamed from: b */
    public final C7295a f811b;

    public C0320h(EditText editText) {
        this.f810a = editText;
        this.f811b = new C7295a(editText);
    }

    /* renamed from: a */
    public final KeyListener mo3053a(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        this.f811b.f16179a.getClass();
        if (keyListener instanceof C7303e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return new C7303e(keyListener);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo3054b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f810a.getContext().obtainStyledAttributes(attributeSet, C18263b.f40079p, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            mo3056d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public final InputConnection mo3055c(InputConnection inputConnection, EditorInfo editorInfo) {
        C7295a aVar = this.f811b;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        C7295a.C7296a aVar2 = aVar.f16179a;
        aVar2.getClass();
        return inputConnection instanceof C7299c ? inputConnection : new C7299c(aVar2.f16180a, inputConnection, editorInfo);
    }

    /* renamed from: d */
    public final void mo3056d(boolean z) {
        C7309g gVar = this.f811b.f16179a.f16181b;
        if (gVar.f16201e != z) {
            if (gVar.f16200d != null) {
                C2665e a = C2665e.m6414a();
                C7309g.C7310a aVar = gVar.f16200d;
                a.getClass();
                C0005b.m24R(aVar, "initCallback cannot be null");
                a.f6005a.writeLock().lock();
                try {
                    a.f6006b.remove(aVar);
                } finally {
                    a.f6005a.writeLock().unlock();
                }
            }
            gVar.f16201e = z;
            if (z) {
                C7309g.m14025a(gVar.f16198b, C2665e.m6414a().mo10064b());
            }
        }
    }
}
