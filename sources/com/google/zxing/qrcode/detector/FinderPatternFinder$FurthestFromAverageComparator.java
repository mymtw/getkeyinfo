package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

final class FinderPatternFinder$FurthestFromAverageComparator implements Serializable, Comparator<C17000a> {
    private final float average;

    public FinderPatternFinder$FurthestFromAverageComparator(float f, C17001b bVar) {
        this.average = f;
    }

    public int compare(C17000a aVar, C17000a aVar2) {
        aVar2.getClass();
        float abs = Math.abs(0.0f - this.average);
        aVar.getClass();
        return Float.compare(abs, Math.abs(0.0f - this.average));
    }
}
