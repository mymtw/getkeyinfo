package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C6088l;
import com.bumptech.glide.load.resource.bitmap.C6096q;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p150j4.C7111d;
import p150j4.C7114e;

public final class DefaultOnHeaderDecodedListener implements ImageDecoder.OnHeaderDecodedListener {
    private static final String TAG = "ImageDecoder";
    private final DecodeFormat decodeFormat;
    private final C6096q hardwareConfigState = C6096q.m12102a();
    private final boolean isHardwareConfigAllowed;
    private final PreferredColorSpace preferredColorSpace;
    private final int requestedHeight;
    private final int requestedWidth;
    private final DownsampleStrategy strategy;

    /* renamed from: com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener$a */
    public class C6058a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public DefaultOnHeaderDecodedListener(int i, int i2, C7114e eVar) {
        this.requestedWidth = i;
        this.requestedHeight = i2;
        this.decodeFormat = (DecodeFormat) eVar.mo19443c(C6088l.f13086f);
        this.strategy = (DownsampleStrategy) eVar.mo19443c(DownsampleStrategy.f13054f);
        C7111d dVar = C6088l.f13089i;
        this.isHardwareConfigAllowed = eVar.mo19443c(dVar) != null && ((Boolean) eVar.mo19443c(dVar)).booleanValue();
        this.preferredColorSpace = (PreferredColorSpace) eVar.mo19443c(C6088l.f13087g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = false;
        if (this.hardwareConfigState.mo17040b(this.requestedWidth, this.requestedHeight, this.isHardwareConfigAllowed, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.decodeFormat == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C6058a());
        Size size = imageInfo.getSize();
        int i = this.requestedWidth;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.requestedHeight;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.strategy.mo17012b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(((float) size.getWidth()) * b);
        int round2 = Math.round(b * ((float) size.getHeight()));
        if (Log.isLoggable(TAG, 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace2 = this.preferredColorSpace;
        if (preferredColorSpace2 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (preferredColorSpace2 == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            return;
        }
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }
}
