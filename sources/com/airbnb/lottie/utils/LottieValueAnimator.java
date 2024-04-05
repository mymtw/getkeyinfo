package com.airbnb.lottie.utils;

import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.C4828c;
import p206p3.C7658d;
import p772tq.C20203a;

public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    private C4828c composition;
    private float frame = 0.0f;
    private long lastFrameTimeNs = 0;
    private float maxFrame = 2.14748365E9f;
    private float minFrame = -2.14748365E9f;
    private int repeatCount = 0;
    public boolean running = false;
    private float speed = 1.0f;
    private boolean speedReversedForRepeatMode = false;

    private float getFrameDurationNs() {
        C4828c cVar = this.composition;
        if (cVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / cVar.f10853m) / Math.abs(this.speed);
    }

    private boolean isReversed() {
        return getSpeed() < 0.0f;
    }

    private void verifyFrame() {
        if (this.composition != null) {
            float f = this.frame;
            if (f < this.minFrame || f > this.maxFrame) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.minFrame), Float.valueOf(this.maxFrame), Float.valueOf(this.frame)}));
            }
        }
    }

    public void cancel() {
        notifyCancel();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.composition = null;
        this.minFrame = -2.14748365E9f;
        this.maxFrame = 2.14748365E9f;
    }

    public void doFrame(long j) {
        postFrameCallback();
        if (this.composition != null && isRunning()) {
            long j2 = this.lastFrameTimeNs;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float frameDurationNs = ((float) j3) / getFrameDurationNs();
            float f = this.frame;
            if (isReversed()) {
                frameDurationNs = -frameDurationNs;
            }
            float f2 = f + frameDurationNs;
            this.frame = f2;
            float minFrame2 = getMinFrame();
            float maxFrame2 = getMaxFrame();
            PointF pointF = C7658d.f16962a;
            boolean z = !(f2 >= minFrame2 && f2 <= maxFrame2);
            this.frame = C7658d.m14697b(this.frame, getMinFrame(), getMaxFrame());
            this.lastFrameTimeNs = j;
            notifyUpdate();
            if (z) {
                if (getRepeatCount() == -1 || this.repeatCount < getRepeatCount()) {
                    notifyRepeat();
                    this.repeatCount++;
                    if (getRepeatMode() == 2) {
                        this.speedReversedForRepeatMode = !this.speedReversedForRepeatMode;
                        reverseAnimationSpeed();
                    } else {
                        this.frame = isReversed() ? getMaxFrame() : getMinFrame();
                    }
                    this.lastFrameTimeNs = j;
                } else {
                    this.frame = this.speed < 0.0f ? getMinFrame() : getMaxFrame();
                    removeFrameCallback();
                    notifyEnd(isReversed());
                }
            }
            verifyFrame();
            C20203a.m34518A();
        }
    }

    public void endAnimation() {
        removeFrameCallback();
        notifyEnd(isReversed());
    }

    public float getAnimatedFraction() {
        float minFrame2;
        float maxFrame2;
        float minFrame3;
        if (this.composition == null) {
            return 0.0f;
        }
        if (isReversed()) {
            minFrame2 = getMaxFrame() - this.frame;
            maxFrame2 = getMaxFrame();
            minFrame3 = getMinFrame();
        } else {
            minFrame2 = this.frame - getMinFrame();
            maxFrame2 = getMaxFrame();
            minFrame3 = getMinFrame();
        }
        return minFrame2 / (maxFrame2 - minFrame3);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        C4828c cVar = this.composition;
        if (cVar == null) {
            return 0.0f;
        }
        float f = this.frame;
        float f2 = cVar.f10851k;
        return (f - f2) / (cVar.f10852l - f2);
    }

    public long getDuration() {
        C4828c cVar = this.composition;
        if (cVar == null) {
            return 0;
        }
        return (long) cVar.mo14582b();
    }

    public float getFrame() {
        return this.frame;
    }

    public float getMaxFrame() {
        C4828c cVar = this.composition;
        if (cVar == null) {
            return 0.0f;
        }
        float f = this.maxFrame;
        return f == 2.14748365E9f ? cVar.f10852l : f;
    }

    public float getMinFrame() {
        C4828c cVar = this.composition;
        if (cVar == null) {
            return 0.0f;
        }
        float f = this.minFrame;
        return f == -2.14748365E9f ? cVar.f10851k : f;
    }

    public float getSpeed() {
        return this.speed;
    }

    public boolean isRunning() {
        return this.running;
    }

    public void pauseAnimation() {
        removeFrameCallback();
    }

    public void playAnimation() {
        this.running = true;
        notifyStart(isReversed());
        setFrame((float) ((int) (isReversed() ? getMaxFrame() : getMinFrame())));
        this.lastFrameTimeNs = 0;
        this.repeatCount = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void removeFrameCallback() {
        removeFrameCallback(true);
    }

    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.lastFrameTimeNs = 0;
        if (isReversed() && getFrame() == getMinFrame()) {
            this.frame = getMaxFrame();
        } else if (!isReversed() && getFrame() == getMaxFrame()) {
            this.frame = getMinFrame();
        }
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(C4828c cVar) {
        boolean z = this.composition == null;
        this.composition = cVar;
        if (z) {
            setMinAndMaxFrames((float) ((int) Math.max(this.minFrame, cVar.f10851k)), (float) ((int) Math.min(this.maxFrame, cVar.f10852l)));
        } else {
            setMinAndMaxFrames((float) ((int) cVar.f10851k), (float) ((int) cVar.f10852l));
        }
        float f = this.frame;
        this.frame = 0.0f;
        setFrame((float) ((int) f));
    }

    public void setFrame(float f) {
        if (this.frame != f) {
            this.frame = C7658d.m14697b(f, getMinFrame(), getMaxFrame());
            this.lastFrameTimeNs = 0;
            notifyUpdate();
        }
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.minFrame, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        if (f <= f2) {
            C4828c cVar = this.composition;
            float f3 = cVar == null ? -3.4028235E38f : cVar.f10851k;
            float f4 = cVar == null ? Float.MAX_VALUE : cVar.f10852l;
            this.minFrame = C7658d.m14697b(f, f3, f4);
            this.maxFrame = C7658d.m14697b(f2, f3, f4);
            setFrame((float) ((int) C7658d.m14697b(this.frame, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames((float) i, (float) ((int) this.maxFrame));
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.speedReversedForRepeatMode) {
            this.speedReversedForRepeatMode = false;
            reverseAnimationSpeed();
        }
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void removeFrameCallback(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }
}
