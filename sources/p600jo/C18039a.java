package p600jo;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.linkedin.android.litr.exception.MediaSourceException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import p610kp.C18161c;
import p628nj.C18263b;

/* renamed from: jo.a */
public final class C18039a implements C18042c {

    /* renamed from: a */
    public final MediaExtractor f39456a;

    /* renamed from: b */
    public final C18263b f39457b;

    /* renamed from: c */
    public int f39458c;

    /* renamed from: d */
    public long f39459d;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.res.AssetFileDescriptor, java.util.Map] */
    public C18039a(Context context, Uri uri, C18263b bVar) throws MediaSourceException {
        StringBuilder sb;
        this.f39457b = bVar;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f39456a = mediaExtractor;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        ? r1 = 0;
        try {
            mediaExtractor.setDataSource(context, uri, r1);
            mediaMetadataRetriever.setDataSource(context, uri);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata != null) {
                this.f39458c = Integer.parseInt(extractMetadata);
            }
            int i = C18161c.f39709r1;
            long j = -1;
            if (ResponseConstants.CONTENT.equals(uri.getScheme())) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                    long statSize = openAssetFileDescriptor != null ? openAssetFileDescriptor.getParcelFileDescriptor().getStatSize() : 0;
                    j = statSize >= 0 ? statSize : j;
                    if (openAssetFileDescriptor != null) {
                        try {
                            openAssetFileDescriptor.close();
                        } catch (IOException e) {
                            e = e;
                            sb = new StringBuilder();
                        }
                    }
                } catch (FileNotFoundException | IllegalStateException e2) {
                    Log.e("c", "Unable to extract length from targetFile: " + uri, e2);
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e3) {
                            e = e3;
                            sb = new StringBuilder();
                        }
                    }
                } catch (Throwable th) {
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e4) {
                            Log.e("c", "Unable to close file descriptor from targetFile: " + uri, e4);
                        }
                    }
                    throw th;
                }
            } else if (ResponseConstants.FILE.equals(uri.getScheme()) && uri.getPath() != null) {
                j = new File(uri.getPath()).length();
            }
            this.f39459d = j;
            mediaMetadataRetriever.release();
            sb.append("Unable to close file descriptor from targetFile: ");
            sb.append(uri);
            Log.e("c", sb.toString(), e);
            this.f39459d = j;
            mediaMetadataRetriever.release();
        } catch (IOException e5) {
            mediaMetadataRetriever.release();
            throw new MediaSourceException(MediaSourceException.Error.DATA_SOURCE, uri, e5);
        }
    }

    /* renamed from: a */
    public final long mo69598a() {
        return this.f39459d;
    }

    /* renamed from: b */
    public final void mo69599b() {
        this.f39456a.advance();
    }

    /* renamed from: c */
    public final int mo69600c() {
        return this.f39456a.getSampleTrackIndex();
    }

    /* renamed from: d */
    public final long mo69601d() {
        return this.f39456a.getSampleTime();
    }

    /* renamed from: e */
    public final int mo69602e() {
        return this.f39456a.getTrackCount();
    }

    /* renamed from: f */
    public final void mo69603f(long j) {
        this.f39456a.seekTo(j, 0);
    }

    /* renamed from: g */
    public final int mo69604g(ByteBuffer byteBuffer) {
        return this.f39456a.readSampleData(byteBuffer, 0);
    }

    public final C18263b getSelection() {
        return this.f39457b;
    }

    /* renamed from: h */
    public final MediaFormat mo69606h(int i) {
        return this.f39456a.getTrackFormat(i);
    }

    /* renamed from: i */
    public final void mo69607i(int i) {
        this.f39456a.selectTrack(i);
    }

    /* renamed from: j */
    public final int mo69608j() {
        return this.f39456a.getSampleFlags();
    }

    public final void release() {
        this.f39456a.release();
    }
}
