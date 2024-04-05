package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p505aj.C13996d;
import p505aj.C14002i;
import p513bj.C14049b0;

public final class FileDataSource extends C13996d {

    /* renamed from: e */
    public RandomAccessFile f32484e;

    /* renamed from: f */
    public Uri f32485f;

    /* renamed from: g */
    public long f32486g;

    /* renamed from: h */
    public boolean f32487h;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* renamed from: o */
    public static RandomAccessFile m22844o(Uri uri) throws FileDataSourceException {
        try {
            String path = uri.getPath();
            path.getClass();
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e);
            }
            throw new FileDataSourceException(e);
        }
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws FileDataSourceException {
        try {
            Uri uri = iVar.f30774a;
            this.f32485f = uri;
            mo46809m(iVar);
            RandomAccessFile o = m22844o(uri);
            this.f32484e = o;
            o.seek(iVar.f30779f);
            long j = iVar.f30780g;
            if (j == -1) {
                j = this.f32484e.length() - iVar.f30779f;
            }
            this.f32486g = j;
            if (j >= 0) {
                this.f32487h = true;
                mo46810n(iVar);
                return this.f32486g;
            }
            throw new DataSourceException(0);
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    public final void close() throws FileDataSourceException {
        this.f32485f = null;
        try {
            RandomAccessFile randomAccessFile = this.f32484e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f32484e = null;
            if (this.f32487h) {
                this.f32487h = false;
                mo46808l();
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        } catch (Throwable th) {
            this.f32484e = null;
            if (this.f32487h) {
                this.f32487h = false;
                mo46808l();
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.f32485f;
    }

    public final int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f32486g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f32484e;
            int i3 = C14049b0.f30913a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f32486g -= (long) read;
                mo46807k(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }
}
