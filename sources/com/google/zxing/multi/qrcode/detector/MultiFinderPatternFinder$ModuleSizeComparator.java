package com.google.zxing.multi.qrcode.detector;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.zxing.qrcode.detector.C17000a;
import java.io.Serializable;
import java.util.Comparator;

final class MultiFinderPatternFinder$ModuleSizeComparator implements Serializable, Comparator<C17000a> {
    private MultiFinderPatternFinder$ModuleSizeComparator() {
    }

    public int compare(C17000a aVar, C17000a aVar2) {
        aVar2.getClass();
        aVar.getClass();
        double d = (double) 0.0f;
        if (d < ShadowDrawableWrapper.COS_45) {
            return -1;
        }
        return d > ShadowDrawableWrapper.COS_45 ? 1 : 0;
    }
}
