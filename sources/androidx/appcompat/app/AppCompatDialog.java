package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0194a;
import androidx.core.view.C2303g;
import com.etsy.android.R;

public class AppCompatDialog extends Dialog implements C0155e {
    private C0156f mDelegate;
    private final C2303g.C2304a mKeyDispatcher;

    /* renamed from: androidx.appcompat.app.AppCompatDialog$a */
    public class C0150a implements C2303g.C2304a {
        public C0150a() {
        }

        public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDialog.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public AppCompatDialog(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo1312c(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        getDelegate().mo1324o();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C2303g.m5028b(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo1315f(i);
    }

    public C0156f getDelegate() {
        if (this.mDelegate == null) {
            int i = C0156f.f386b;
            this.mDelegate = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo1319j();
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo1321l();
    }

    public void onCreate(Bundle bundle) {
        getDelegate().mo1320k();
        super.onCreate(bundle);
        getDelegate().mo1323n();
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo1331t();
    }

    public void onSupportActionModeFinished(C0194a aVar) {
    }

    public void onSupportActionModeStarted(C0194a aVar) {
    }

    public C0194a onWindowStartingSupportActionMode(C0194a.C0195a aVar) {
        return null;
    }

    public void setContentView(int i) {
        getDelegate().mo1333w(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo1290C(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo1332v(i);
    }

    public AppCompatDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C0150a();
        C0156f delegate = getDelegate();
        delegate.mo1289B(getThemeResId(context, i));
        delegate.mo1323n();
    }

    public void setContentView(View view) {
        getDelegate().mo1334x(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo1335y(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo1290C(getContext().getString(i));
    }

    public AppCompatDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new C0150a();
    }
}
