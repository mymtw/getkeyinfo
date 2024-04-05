package p600jo;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.linkedin.android.litr.exception.MediaTargetException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;

/* renamed from: jo.b */
public final class C18040b implements C18043d {

    /* renamed from: a */
    public LinkedList<C18041a> f39460a;

    /* renamed from: b */
    public boolean f39461b;

    /* renamed from: c */
    public MediaMuxer f39462c;

    /* renamed from: d */
    public MediaFormat[] f39463d;

    /* renamed from: e */
    public ParcelFileDescriptor f39464e;

    /* renamed from: f */
    public int f39465f;

    /* renamed from: g */
    public int f39466g;

    /* renamed from: jo.b$a */
    public class C18041a {

        /* renamed from: a */
        public int f39467a;

        /* renamed from: b */
        public ByteBuffer f39468b;

        /* renamed from: c */
        public MediaCodec.BufferInfo f39469c;

        public C18041a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f39467a = i;
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            this.f39469c = bufferInfo2;
            bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
            this.f39468b = allocate;
            allocate.put(byteBuffer);
            this.f39468b.flip();
        }
    }

    public C18040b(Context context, Uri uri, int i, int i2, int i3) throws MediaTargetException {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rwt");
            this.f39464e = openFileDescriptor;
            if (openFileDescriptor != null) {
                mo69613d(new MediaMuxer(this.f39464e.getFileDescriptor(), i3), i, i2);
                return;
            }
            throw new IOException("Inaccessible URI " + uri);
        } catch (IllegalArgumentException e) {
            throw new MediaTargetException(MediaTargetException.Error.INVALID_PARAMS, uri, i3, (Throwable) e);
        } catch (IOException e2) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f39464e;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f39464e = null;
                }
            } catch (IOException unused) {
            }
            throw new MediaTargetException(MediaTargetException.Error.IO_FAILUE, uri, i3, (Throwable) e2);
        }
    }

    /* renamed from: a */
    public final void mo69610a() {
    }

    /* renamed from: b */
    public final int mo69611b(int i, MediaFormat mediaFormat) {
        this.f39463d[i] = mediaFormat;
        int i2 = this.f39465f + 1;
        this.f39465f = i2;
        if (i2 == this.f39466g) {
            StringBuilder h = C0072d.m201h("All tracks added, starting MediaMuxer, writing out ");
            h.append(this.f39460a.size());
            h.append(" queued samples");
            Log.d("b", h.toString());
            for (MediaFormat addTrack : this.f39463d) {
                this.f39462c.addTrack(addTrack);
            }
            this.f39462c.start();
            this.f39461b = true;
            while (!this.f39460a.isEmpty()) {
                C18041a removeFirst = this.f39460a.removeFirst();
                this.f39462c.writeSampleData(removeFirst.f39467a, removeFirst.f39468b, removeFirst.f39469c);
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo69612c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (!this.f39461b) {
            this.f39460a.addLast(new C18041a(i, byteBuffer, bufferInfo));
        } else if (byteBuffer == null) {
            Log.e("b", "Trying to write a null buffer, skipping");
        } else {
            this.f39462c.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }

    /* renamed from: d */
    public final void mo69613d(MediaMuxer mediaMuxer, int i, int i2) throws IllegalArgumentException {
        this.f39466g = i;
        this.f39462c = mediaMuxer;
        mediaMuxer.setOrientationHint(i2);
        this.f39465f = 0;
        this.f39461b = false;
        this.f39460a = new LinkedList<>();
        this.f39463d = new MediaFormat[i];
    }

    public final void release() {
        this.f39462c.release();
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.f39464e;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
                this.f39464e = null;
            }
        } catch (IOException unused) {
        }
    }
}
