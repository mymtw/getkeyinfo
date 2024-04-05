package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.core.widget.NestedScrollView;
import p671sj.C18514d;
import p671sj.C18515e;

public final class zaf extends Drawable implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private int zag;
    private boolean zah;
    private boolean zai;
    private C18515e zaj;
    private Drawable zak;
    private Drawable zal;
    private boolean zam;
    private boolean zan;
    private boolean zao;
    private int zap;

    public zaf(Drawable drawable, Drawable drawable2) {
        this((C18515e) null);
        drawable = drawable == null ? C18514d.f40775a : drawable;
        this.zak = drawable;
        drawable.setCallback(this);
        C18515e eVar = this.zaj;
        eVar.f40778b = drawable.getChangingConfigurations() | eVar.f40778b;
        drawable2 = drawable2 == null ? C18514d.f40775a : drawable2;
        this.zal = drawable2;
        drawable2.setCallback(this);
        C18515e eVar2 = this.zaj;
        eVar2.f40778b = drawable2.getChangingConfigurations() | eVar2.f40778b;
    }

    private final boolean zab() {
        if (!this.zam) {
            this.zan = (this.zak.getConstantState() == null || this.zal.getConstantState() == null) ? false : true;
            this.zam = true;
        }
        return this.zan;
    }

    public final void draw(Canvas canvas) {
        int i = this.zaa;
        boolean z = false;
        boolean z2 = true;
        if (i != 1) {
            if (i == 2 && this.zab >= 0) {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.zab)) / ((float) this.zaf);
                if (uptimeMillis < 1.0f) {
                    z2 = false;
                }
                if (z2) {
                    this.zaa = 0;
                }
                this.zag = (int) ((((float) this.zad) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
            }
            z = z2;
        } else {
            this.zab = SystemClock.uptimeMillis();
            this.zaa = 2;
        }
        int i2 = this.zag;
        boolean z3 = this.zah;
        Drawable drawable = this.zak;
        Drawable drawable2 = this.zal;
        if (z) {
            if (!z3 || i2 == 0) {
                drawable.draw(canvas);
            }
            int i3 = this.zae;
            if (i2 == i3) {
                drawable2.setAlpha(i3);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.zae - i2);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.zae);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.zae);
        }
        invalidateSelf();
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C18515e eVar = this.zaj;
        return changingConfigurations | eVar.f40777a | eVar.f40778b;
    }

    public final Drawable.ConstantState getConstantState() {
        if (!zab()) {
            return null;
        }
        this.zaj.f40777a = getChangingConfigurations();
        return this.zaj;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.zak.getIntrinsicHeight(), this.zal.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.zak.getIntrinsicWidth(), this.zal.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.zao) {
            this.zap = Drawable.resolveOpacity(this.zak.getOpacity(), this.zal.getOpacity());
            this.zao = true;
        }
        return this.zap;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.zai && super.mutate() == this) {
            if (zab()) {
                this.zak.mutate();
                this.zal.mutate();
                this.zai = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.zak.setBounds(rect);
        this.zal.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.zag == this.zae) {
            this.zag = i;
        }
        this.zae = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.zak.setColorFilter(colorFilter);
        this.zal.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.zal;
    }

    public final void zaa(int i) {
        this.zac = 0;
        this.zad = this.zae;
        this.zag = 0;
        this.zaf = NestedScrollView.ANIMATED_SCROLL_GAP;
        this.zaa = 1;
        invalidateSelf();
    }

    public zaf(C18515e eVar) {
        this.zaa = 0;
        this.zae = 255;
        this.zag = 0;
        this.zah = true;
        this.zaj = new C18515e(eVar);
    }
}
