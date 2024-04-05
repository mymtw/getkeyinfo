package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.C5970e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements C5970e<ParcelFileDescriptor> {

    /* renamed from: a */
    public final InternalRewinder f12772a;

    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f12773a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f12773a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f12773a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f12773a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C5964a implements C5970e.C5971a<ParcelFileDescriptor> {
        /* renamed from: a */
        public final Class<ParcelFileDescriptor> mo16846a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: b */
        public final C5970e mo16847b(Object obj) {
            return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f12772a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: b */
    public final void mo16843b() {
    }

    /* renamed from: c */
    public final ParcelFileDescriptor mo16842a() throws IOException {
        return this.f12772a.rewind();
    }
}
