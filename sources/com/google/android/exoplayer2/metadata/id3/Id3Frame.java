package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id */
    public final String f31709id;

    public Id3Frame(String str) {
        this.f31709id = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f31709id;
    }
}
