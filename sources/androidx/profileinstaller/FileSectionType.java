package androidx.profileinstaller;

import android.support.p013v4.media.C0073e;

enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    private FileSectionType(long j) {
        this.mValue = j;
    }

    public static FileSectionType fromValue(long j) {
        FileSectionType[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue() == j) {
                return values[i];
            }
        }
        throw new IllegalArgumentException(C0073e.m205e("Unsupported FileSection Type ", j));
    }

    public long getValue() {
        return this.mValue;
    }
}
