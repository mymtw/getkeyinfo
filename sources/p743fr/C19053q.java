package p743fr;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19736t;
import okhttp3.internal.http2.ErrorCode;
import p003a2.C0015b;
import p735br.C18980c;
import p743fr.C19023b;
import p756lr.C19893f;
import p756lr.C19896h;

/* renamed from: fr.q */
public final class C19053q implements Closeable {

    /* renamed from: h */
    public static final Logger f42539h = Logger.getLogger(C19026c.class.getName());

    /* renamed from: b */
    public final C19893f f42540b;

    /* renamed from: c */
    public int f42541c = PrimitiveArrayBuilder.SMALL_CHUNK_SIZE;

    /* renamed from: d */
    public boolean f42542d;

    /* renamed from: e */
    public final C19023b.C19025b f42543e;

    /* renamed from: f */
    public final C19896h f42544f;

    /* renamed from: g */
    public final boolean f42545g;

    public C19053q(C19896h hVar, boolean z) {
        this.f42544f = hVar;
        this.f42545g = z;
        C19893f fVar = new C19893f();
        this.f42540b = fVar;
        this.f42543e = new C19023b.C19025b(fVar);
    }

    /* renamed from: a */
    public final synchronized void mo70526a(C19057t tVar) throws IOException {
        C19383o.m32797g(tVar, "peerSettings");
        if (!this.f42542d) {
            int i = this.f42541c;
            int i2 = tVar.f42553a;
            if ((i2 & 32) != 0) {
                i = tVar.f42554b[5];
            }
            this.f42541c = i;
            if (((i2 & 2) != 0 ? tVar.f42554b[1] : -1) != -1) {
                C19023b.C19025b bVar = this.f42543e;
                int i3 = (i2 & 2) != 0 ? tVar.f42554b[1] : -1;
                bVar.getClass();
                int min = Math.min(i3, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
                int i4 = bVar.f42410c;
                if (i4 != min) {
                    if (min < i4) {
                        bVar.f42408a = Math.min(bVar.f42408a, min);
                    }
                    bVar.f42409b = true;
                    bVar.f42410c = min;
                    int i5 = bVar.f42414g;
                    if (min < i5) {
                        if (min == 0) {
                            C19318k.m32610b1(bVar.f42411d, (C19736t) null);
                            bVar.f42412e = bVar.f42411d.length - 1;
                            bVar.f42413f = 0;
                            bVar.f42414g = 0;
                        } else {
                            bVar.mo70478a(i5 - min);
                        }
                    }
                }
            }
            mo70529d(0, 0, 4, 1);
            this.f42544f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo70527b(boolean z, int i, C19893f fVar, int i2) throws IOException {
        if (!this.f42542d) {
            mo70529d(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                C19896h hVar = this.f42544f;
                C19383o.m32794d(fVar);
                hVar.mo68512O(fVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() throws IOException {
        this.f42542d = true;
        this.f42544f.close();
    }

    /* renamed from: d */
    public final void mo70529d(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f42539h;
        boolean z = false;
        if (logger.isLoggable(Level.FINE)) {
            C19026c.f42421e.getClass();
            logger.fine(C19026c.m32198a(i, i2, i3, i4, false));
        }
        if (i2 <= this.f42541c) {
            if ((((int) 2147483648L) & i) == 0) {
                z = true;
            }
            if (z) {
                C19896h hVar = this.f42544f;
                byte[] bArr = C18980c.f42301a;
                C19383o.m32797g(hVar, "$this$writeMedium");
                hVar.writeByte((i2 >>> 16) & 255);
                hVar.writeByte((i2 >>> 8) & 255);
                hVar.writeByte(i2 & 255);
                this.f42544f.writeByte(i3 & 255);
                this.f42544f.writeByte(i4 & 255);
                this.f42544f.writeInt(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException(C0015b.m88g("reserved bit set: ", i).toString());
        }
        StringBuilder h = C0072d.m201h("FRAME_SIZE_ERROR length > ");
        h.append(this.f42541c);
        h.append(": ");
        h.append(i2);
        throw new IllegalArgumentException(h.toString().toString());
    }

    /* renamed from: e */
    public final synchronized void mo70530e(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        C19383o.m32797g(errorCode, "errorCode");
        if (!this.f42542d) {
            boolean z = false;
            if (errorCode.getHttpCode() != -1) {
                mo70529d(0, bArr.length + 8, 7, 0);
                this.f42544f.writeInt(i);
                this.f42544f.writeInt(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f42544f.write(bArr);
                }
                this.f42544f.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: f */
    public final synchronized void mo70531f(int i, int i2, boolean z) throws IOException {
        if (!this.f42542d) {
            mo70529d(0, 8, 6, z ? 1 : 0);
            this.f42544f.writeInt(i);
            this.f42544f.writeInt(i2);
            this.f42544f.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public final synchronized void mo70532g(int i, ErrorCode errorCode) throws IOException {
        C19383o.m32797g(errorCode, "errorCode");
        if (!this.f42542d) {
            if (errorCode.getHttpCode() != -1) {
                mo70529d(i, 4, 3, 0);
                this.f42544f.writeInt(errorCode.getHttpCode());
                this.f42544f.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: h */
    public final synchronized void mo70533h(int i, long j) throws IOException {
        if (!this.f42542d) {
            if (j != 0 && j <= ParserMinimalBase.MAX_INT_L) {
                mo70529d(i, 4, 8, 0);
                this.f42544f.writeInt((int) j);
                this.f42544f.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    public final void mo70534i(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min((long) this.f42541c, j);
            j -= min;
            mo70529d(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f42544f.mo68512O(this.f42540b, min);
        }
    }
}
