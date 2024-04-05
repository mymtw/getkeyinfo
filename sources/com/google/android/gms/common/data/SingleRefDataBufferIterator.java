package com.google.android.gms.common.data;

import android.support.p013v4.media.C0072d;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
import p504ai.C13983i;

@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(@RecentlyNonNull DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @RecentlyNonNull
    public T next() {
        if (hasNext()) {
            int i = this.zab + 1;
            this.zab = i;
            if (i == 0) {
                T checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = checkNotNull;
                if (!(checkNotNull instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(this.zac.getClass());
                    throw new IllegalStateException(C13983i.m21492k(valueOf.length() + 44, "DataBuffer reference of type ", valueOf, " is not movable"));
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        throw new NoSuchElementException(C0072d.m200g(46, "Cannot advance the iterator beyond ", this.zab));
    }
}
