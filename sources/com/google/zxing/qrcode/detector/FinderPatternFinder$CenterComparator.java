package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

final class FinderPatternFinder$CenterComparator implements Serializable, Comparator<C17000a> {
    private final float average;

    public FinderPatternFinder$CenterComparator(float f, C17001b bVar) {
        this.average = f;
    }

    public int compare(C17000a aVar, C17000a aVar2) {
        aVar2.getClass();
        aVar.getClass();
        int compare = Integer.compare(0, 0);
        return compare == 0 ? Float.compare(Math.abs(0.0f - this.average), Math.abs(0.0f - this.average)) : compare;
    }
}
