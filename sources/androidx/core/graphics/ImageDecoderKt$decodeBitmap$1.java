package androidx.core.graphics;

import android.graphics.ImageDecoder;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19862q;

public final class ImageDecoderKt$decodeBitmap$1 implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ C19862q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C19394m> $action;

    public ImageDecoderKt$decodeBitmap$1(C19862q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C19394m> qVar) {
        this.$action = qVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C19383o.m32797g(imageDecoder, "decoder");
        C19383o.m32797g(imageInfo, "info");
        C19383o.m32797g(source, "source");
        this.$action.invoke(imageDecoder, imageInfo, source);
    }
}
