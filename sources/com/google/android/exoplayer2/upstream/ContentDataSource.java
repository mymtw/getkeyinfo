package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p505aj.C13996d;
import p505aj.C14002i;
import p513bj.C14049b0;

public final class ContentDataSource extends C13996d {

    /* renamed from: e */
    public final ContentResolver f32478e;

    /* renamed from: f */
    public Uri f32479f;

    /* renamed from: g */
    public AssetFileDescriptor f32480g;

    /* renamed from: h */
    public FileInputStream f32481h;

    /* renamed from: i */
    public long f32482i;

    /* renamed from: j */
    public boolean f32483j;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f32478e = context.getContentResolver();
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws ContentDataSourceException {
        try {
            Uri uri = iVar.f30774a;
            this.f32479f = uri;
            mo46809m(iVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f32478e.openAssetFileDescriptor(uri, "r");
            this.f32480g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f32481h = fileInputStream;
                int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i != 0) {
                    if (iVar.f30779f > length) {
                        throw new DataSourceException(0);
                    }
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(iVar.f30779f + startOffset) - startOffset;
                if (skip == iVar.f30779f) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f32482i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f32482i = position;
                            if (position < 0) {
                                throw new DataSourceException(0);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f32482i = j;
                        if (j < 0) {
                            throw new DataSourceException(0);
                        }
                    }
                    long j2 = iVar.f30780g;
                    if (j2 != -1) {
                        long j3 = this.f32482i;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f32482i = j2;
                    }
                    this.f32483j = true;
                    mo46810n(iVar);
                    long j4 = iVar.f30780g;
                    return j4 != -1 ? j4 : this.f32482i;
                }
                throw new DataSourceException(0);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new ContentDataSourceException(e);
        }
    }

    public final void close() throws ContentDataSourceException {
        this.f32479f = null;
        try {
            FileInputStream fileInputStream = this.f32481h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f32481h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f32480g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f32480g = null;
                if (this.f32483j) {
                    this.f32483j = false;
                    mo46808l();
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            } catch (Throwable th) {
                this.f32480g = null;
                if (this.f32483j) {
                    this.f32483j = false;
                    mo46808l();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        } catch (Throwable th2) {
            this.f32481h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f32480g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f32480g = null;
                if (this.f32483j) {
                    this.f32483j = false;
                    mo46808l();
                }
                throw th2;
            } catch (IOException e3) {
                throw new ContentDataSourceException(e3);
            } catch (Throwable th3) {
                this.f32480g = null;
                if (this.f32483j) {
                    this.f32483j = false;
                    mo46808l();
                }
                throw th3;
            }
        }
    }

    public final Uri getUri() {
        return this.f32479f;
    }

    public final int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f32482i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            }
        }
        FileInputStream fileInputStream = this.f32481h;
        int i3 = C14049b0.f30913a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f32482i;
        if (j2 != -1) {
            this.f32482i = j2 - ((long) read);
        }
        mo46807k(read);
        return read;
    }
}
