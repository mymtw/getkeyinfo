package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;
import p505aj.C13996d;
import p505aj.C14002i;
import p513bj.C14049b0;

public final class AssetDataSource extends C13996d {

    /* renamed from: e */
    public final AssetManager f32473e;

    /* renamed from: f */
    public Uri f32474f;

    /* renamed from: g */
    public InputStream f32475g;

    /* renamed from: h */
    public long f32476h;

    /* renamed from: i */
    public boolean f32477i;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f32473e = context.getAssets();
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws AssetDataSourceException {
        try {
            Uri uri = iVar.f30774a;
            this.f32474f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo46809m(iVar);
            InputStream open = this.f32473e.open(path, 1);
            this.f32475g = open;
            if (open.skip(iVar.f30779f) >= iVar.f30779f) {
                long j = iVar.f30780g;
                if (j != -1) {
                    this.f32476h = j;
                } else {
                    long available = (long) this.f32475g.available();
                    this.f32476h = available;
                    if (available == ParserMinimalBase.MAX_INT_L) {
                        this.f32476h = -1;
                    }
                }
                this.f32477i = true;
                mo46810n(iVar);
                return this.f32476h;
            }
            throw new DataSourceException(0);
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    public final void close() throws AssetDataSourceException {
        this.f32474f = null;
        try {
            InputStream inputStream = this.f32475g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f32475g = null;
            if (this.f32477i) {
                this.f32477i = false;
                mo46808l();
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        } catch (Throwable th) {
            this.f32475g = null;
            if (this.f32477i) {
                this.f32477i = false;
                mo46808l();
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.f32474f;
    }

    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f32476h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e);
            }
        }
        InputStream inputStream = this.f32475g;
        int i3 = C14049b0.f30913a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f32476h;
        if (j2 != -1) {
            this.f32476h = j2 - ((long) read);
        }
        mo46807k(read);
        return read;
    }
}
