package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.activity.C0114h;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.load.resource.gif.C6113a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p138i4.C6987a;
import p150j4.C7117h;
import p302z4.C8448i;

public class GifDrawable extends Drawable implements C6113a.C6115b, Animatable, Animatable2Compat {
    private static final int GRAVITY = 119;
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC = 0;
    private List<Animatable2Compat.C3306a> animationCallbacks;
    private boolean applyGravity;
    private Rect destRect;
    private boolean isRecycled;
    private boolean isRunning;
    private boolean isStarted;
    private boolean isVisible;
    private int loopCount;
    private int maxLoopCount;
    private Paint paint;
    private final C6112a state;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C6112a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C6113a f13140a;

        public C6112a(C6113a aVar) {
            this.f13140a = aVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new GifDrawable(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new GifDrawable(this);
        }
    }

    @Deprecated
    public GifDrawable(Context context, C6987a aVar, C5998d dVar, C7117h<Bitmap> hVar, int i, int i2, Bitmap bitmap) {
        this(context, aVar, hVar, i, i2, bitmap);
    }

    private Drawable.Callback findCallback() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect getDestRect() {
        if (this.destRect == null) {
            this.destRect = new Rect();
        }
        return this.destRect;
    }

    private Paint getPaint() {
        if (this.paint == null) {
            this.paint = new Paint(2);
        }
        return this.paint;
    }

    private void notifyAnimationEndToListeners() {
        List<Animatable2Compat.C3306a> list = this.animationCallbacks;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.animationCallbacks.get(i).mo12418a();
            }
        }
    }

    private void resetLoopCount() {
        this.loopCount = 0;
    }

    private void startRunning() {
        C0114h.m280K("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.isRecycled);
        if (this.state.f13140a.f13141a.mo19158d() == 1) {
            invalidateSelf();
        } else if (!this.isRunning) {
            this.isRunning = true;
            C6113a aVar = this.state.f13140a;
            if (aVar.f13151k) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!aVar.f13143c.contains(this)) {
                boolean isEmpty = aVar.f13143c.isEmpty();
                aVar.f13143c.add(this);
                if (isEmpty && !aVar.f13146f) {
                    aVar.f13146f = true;
                    aVar.f13151k = false;
                    aVar.mo17079a();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    private void stopRunning() {
        this.isRunning = false;
        C6113a aVar = this.state.f13140a;
        aVar.f13143c.remove(this);
        if (aVar.f13143c.isEmpty()) {
            aVar.f13146f = false;
        }
    }

    public void clearAnimationCallbacks() {
        List<Animatable2Compat.C3306a> list = this.animationCallbacks;
        if (list != null) {
            list.clear();
        }
    }

    public void draw(Canvas canvas) {
        if (!this.isRecycled) {
            if (this.applyGravity) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), getDestRect());
                this.applyGravity = false;
            }
            C6113a aVar = this.state.f13140a;
            C6113a.C6114a aVar2 = aVar.f13150j;
            canvas.drawBitmap(aVar2 != null ? aVar2.f13162h : aVar.f13153m, (Rect) null, getDestRect(), getPaint());
        }
    }

    public ByteBuffer getBuffer() {
        return this.state.f13140a.f13141a.getData().asReadOnlyBuffer();
    }

    public Drawable.ConstantState getConstantState() {
        return this.state;
    }

    public Bitmap getFirstFrame() {
        return this.state.f13140a.f13153m;
    }

    public int getFrameCount() {
        return this.state.f13140a.f13141a.mo19158d();
    }

    public int getFrameIndex() {
        C6113a.C6114a aVar = this.state.f13140a.f13150j;
        if (aVar != null) {
            return aVar.f13160f;
        }
        return -1;
    }

    public C7117h<Bitmap> getFrameTransformation() {
        return this.state.f13140a.f13154n;
    }

    public int getIntrinsicHeight() {
        return this.state.f13140a.f13158r;
    }

    public int getIntrinsicWidth() {
        return this.state.f13140a.f13157q;
    }

    public int getOpacity() {
        return -2;
    }

    public int getSize() {
        C6113a aVar = this.state.f13140a;
        return aVar.f13141a.mo19164i() + aVar.f13156p;
    }

    public boolean isRecycled() {
        return this.isRecycled;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyGravity = true;
    }

    public void onFrameReady() {
        if (findCallback() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (getFrameIndex() == getFrameCount() - 1) {
            this.loopCount++;
        }
        int i = this.maxLoopCount;
        if (i != -1 && this.loopCount >= i) {
            notifyAnimationEndToListeners();
            stop();
        }
    }

    public void recycle() {
        this.isRecycled = true;
        C6113a aVar = this.state.f13140a;
        aVar.f13143c.clear();
        Bitmap bitmap = aVar.f13153m;
        if (bitmap != null) {
            aVar.f13145e.mo16924e(bitmap);
            aVar.f13153m = null;
        }
        aVar.f13146f = false;
        C6113a.C6114a aVar2 = aVar.f13150j;
        if (aVar2 != null) {
            aVar.f13144d.clear((C8448i<?>) aVar2);
            aVar.f13150j = null;
        }
        C6113a.C6114a aVar3 = aVar.f13152l;
        if (aVar3 != null) {
            aVar.f13144d.clear((C8448i<?>) aVar3);
            aVar.f13152l = null;
        }
        C6113a.C6114a aVar4 = aVar.f13155o;
        if (aVar4 != null) {
            aVar.f13144d.clear((C8448i<?>) aVar4);
            aVar.f13155o = null;
        }
        aVar.f13141a.clear();
        aVar.f13151k = true;
    }

    public void registerAnimationCallback(Animatable2Compat.C3306a aVar) {
        if (aVar != null) {
            if (this.animationCallbacks == null) {
                this.animationCallbacks = new ArrayList();
            }
            this.animationCallbacks.add(aVar);
        }
    }

    public void setAlpha(int i) {
        getPaint().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        getPaint().setColorFilter(colorFilter);
    }

    public void setFrameTransformation(C7117h<Bitmap> hVar, Bitmap bitmap) {
        this.state.f13140a.mo17081c(hVar, bitmap);
    }

    public void setIsRunning(boolean z) {
        this.isRunning = z;
    }

    public void setLoopCount(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            int e = this.state.f13140a.f13141a.mo19159e();
            if (e != 0) {
                i2 = e;
            }
            this.maxLoopCount = i2;
        } else {
            this.maxLoopCount = i;
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        C0114h.m280K("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.isRecycled);
        this.isVisible = z;
        if (!z) {
            stopRunning();
        } else if (this.isStarted) {
            startRunning();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.isStarted = true;
        resetLoopCount();
        if (this.isVisible) {
            startRunning();
        }
    }

    public void startFromFirstFrame() {
        C0114h.m280K("You cannot restart a currently running animation.", !this.isRunning);
        C6113a aVar = this.state.f13140a;
        C0114h.m280K("Can't restart a running animation", !aVar.f13146f);
        aVar.f13148h = true;
        C6113a.C6114a aVar2 = aVar.f13155o;
        if (aVar2 != null) {
            aVar.f13144d.clear((C8448i<?>) aVar2);
            aVar.f13155o = null;
        }
        start();
    }

    public void stop() {
        this.isStarted = false;
        stopRunning();
    }

    public boolean unregisterAnimationCallback(Animatable2Compat.C3306a aVar) {
        List<Animatable2Compat.C3306a> list = this.animationCallbacks;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    public GifDrawable(Context context, C6987a aVar, C7117h<Bitmap> hVar, int i, int i2, Bitmap bitmap) {
        this(new C6112a(new C6113a(Glide.get(context), aVar, i, i2, hVar, bitmap)));
    }

    public GifDrawable(C6112a aVar) {
        this.isVisible = true;
        this.maxLoopCount = -1;
        C0114h.m281L(aVar);
        this.state = aVar;
    }

    public GifDrawable(C6113a aVar, Paint paint2) {
        this(new C6112a(aVar));
        this.paint = paint2;
    }
}
