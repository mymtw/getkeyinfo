package android.graphics;

import android.annotation.NonNull;
import android.annotation.Nullable;

public final /* synthetic */ class RenderNode {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ RenderNode(@Nullable String str) {
    }

    @NonNull
    public native /* synthetic */ RecordingCanvas beginRecording();

    public native /* synthetic */ void discardDisplayList();

    public native /* synthetic */ void endRecording();

    public native /* synthetic */ float getAlpha();

    public native /* synthetic */ int getBottom();

    public native /* synthetic */ boolean getClipToBounds();

    public native /* synthetic */ boolean getClipToOutline();

    public native /* synthetic */ float getElevation();

    public native /* synthetic */ int getHeight();

    public native /* synthetic */ int getLeft();

    public native /* synthetic */ void getMatrix(@NonNull Matrix matrix);

    public native /* synthetic */ int getRight();

    public native /* synthetic */ int getTop();

    public native /* synthetic */ int getWidth();

    public native /* synthetic */ boolean hasDisplayList();

    public native /* synthetic */ boolean offsetLeftAndRight(int i);

    public native /* synthetic */ boolean offsetTopAndBottom(int i);

    public native /* synthetic */ boolean setAlpha(float f);

    public native /* synthetic */ boolean setAmbientShadowColor(int i);

    public native /* synthetic */ boolean setCameraDistance(float f);

    public native /* synthetic */ boolean setClipToBounds(boolean z);

    public native /* synthetic */ boolean setClipToOutline(boolean z);

    public native /* synthetic */ boolean setElevation(float f);

    public native /* synthetic */ boolean setHasOverlappingRendering(boolean z);

    public native /* synthetic */ boolean setOutline(@Nullable Outline outline);

    public native /* synthetic */ boolean setPivotX(float f);

    public native /* synthetic */ boolean setPivotY(float f);

    public native /* synthetic */ boolean setPosition(int i, int i2, int i3, int i4);

    public native /* synthetic */ boolean setRotationX(float f);

    public native /* synthetic */ boolean setRotationY(float f);

    public native /* synthetic */ boolean setRotationZ(float f);

    public native /* synthetic */ boolean setScaleX(float f);

    public native /* synthetic */ boolean setScaleY(float f);

    public native /* synthetic */ boolean setSpotShadowColor(int i);

    public native /* synthetic */ boolean setTranslationX(float f);

    public native /* synthetic */ boolean setTranslationY(float f);
}
