package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

class FullSegmentEncryptionKeyCache$1 extends LinkedHashMap<Uri, byte[]> {
    public final /* synthetic */ int val$maxSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullSegmentEncryptionKeyCache$1(C14312e eVar, int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.val$maxSize = i2;
    }

    public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > this.val$maxSize;
    }
}
