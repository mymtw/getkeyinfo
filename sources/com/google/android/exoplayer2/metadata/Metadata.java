package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;
import p513bj.C14049b0;
import p594jh.C17963p0;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C14250a();
    private final Entry[] entries;

    public interface Entry extends Parcelable {
        byte[] getWrappedMetadataBytes() {
            return null;
        }

        Format getWrappedMetadataFormat() {
            return null;
        }

        void populateMediaMetadata(C17963p0.C17964a aVar) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    public class C14250a implements Parcelable.Creator<Metadata> {
        public final Object createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        public final Object[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Entry... entryArr) {
        this.entries = entryArr;
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        Entry[] entryArr2 = this.entries;
        int i = C14049b0.f30913a;
        Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
        return new Metadata((Entry[]) copyOf);
    }

    public Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.entries, ((Metadata) obj).entries);
    }

    public Entry get(int i) {
        return this.entries[i];
    }

    public int hashCode() {
        return Arrays.hashCode(this.entries);
    }

    public int length() {
        return this.entries.length;
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.entries));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.entries.length);
        for (Entry writeParcelable : this.entries) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.entries = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.entries = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.entries;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
