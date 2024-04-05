package android.graphics;

import android.annotation.NonNull;
import android.graphics.Shader;

public final /* synthetic */ class RenderEffect {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f, float f2, @NonNull RenderEffect renderEffect, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f, float f2, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f, float f2);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f, float f2, @NonNull RenderEffect renderEffect);
}
