package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p683tn.C18567f;
import p699vn.C18667b;

/* renamed from: com.google.zxing.oned.m */
public final class C16984m implements C18567f {

    /* renamed from: b */
    public final C16980i f37360b = new C16980i();

    /* renamed from: f */
    public final C18667b mo4160f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f37360b.mo4160f("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
