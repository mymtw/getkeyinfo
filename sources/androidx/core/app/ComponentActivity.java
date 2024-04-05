package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.C2303g;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2888t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import p193o.C7506i;

public class ComponentActivity extends Activity implements C2887s, C2303g.C2304a {
    private C7506i<Class<? extends C2250a>, C2250a> mExtraDataMap = new C7506i<>();
    private C2888t mLifecycleRegistry = new C2888t(this, true);

    @Deprecated
    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C2250a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C2303g.m5027a(decorView, keyEvent)) {
            return C2303g.m5028b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C2303g.m5027a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C2250a> T getExtraData(Class<T> cls) {
        return (C2250a) this.mExtraDataMap.getOrDefault(cls, null);
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C2888t tVar = this.mLifecycleRegistry;
        Lifecycle.State state = Lifecycle.State.CREATED;
        tVar.mo10836e("markState");
        tVar.mo10839h(state);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(C2250a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
