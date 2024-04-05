package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaab;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p001a0.C0005b;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;
    private View.OnClickListener zad;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(@RecentlyNonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onClick(@RecentlyNonNull View view) {
        View.OnClickListener onClickListener = this.zad;
        if (onClickListener != null && view == this.zac) {
            onClickListener.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        setStyle(this.zaa, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.zac.setEnabled(z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(@RecentlyNonNull Scope[] scopeArr) {
        setStyle(this.zaa, this.zab);
    }

    public final void setSize(int i) {
        setStyle(i, this.zab);
    }

    public final void setStyle(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
        Context context = getContext();
        View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = zay.zaa(context, this.zaa, this.zab);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.zaa;
            int i4 = this.zab;
            zaab zaab = new zaab(context);
            zaab.zaa(context.getResources(), i3, i4);
            this.zac = zaab;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    public SignInButton(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(@RecentlyNonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zad = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0005b.f13k, 0, 0);
        try {
            this.zaa = obtainStyledAttributes.getInt(0, 0);
            this.zab = obtainStyledAttributes.getInt(1, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.zaa, this.zab);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Deprecated
    public final void setStyle(int i, int i2, @RecentlyNonNull Scope[] scopeArr) {
        setStyle(i, i2);
    }
}
