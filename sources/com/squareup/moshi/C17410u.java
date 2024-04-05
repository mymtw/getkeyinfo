package com.squareup.moshi;

import java.io.IOException;
import okio.ByteString;
import p756lr.C19888c0;
import p756lr.C19890d0;
import p756lr.C19893f;
import p756lr.C19897i;

/* renamed from: com.squareup.moshi.u */
public final class C17410u implements C19888c0 {

    /* renamed from: i */
    public static final ByteString f37995i = ByteString.encodeUtf8("[]{}\"'/#");

    /* renamed from: j */
    public static final ByteString f37996j = ByteString.encodeUtf8("'\\");

    /* renamed from: k */
    public static final ByteString f37997k = ByteString.encodeUtf8("\"\\");

    /* renamed from: l */
    public static final ByteString f37998l = ByteString.encodeUtf8("\r\n");

    /* renamed from: m */
    public static final ByteString f37999m = ByteString.encodeUtf8("*");

    /* renamed from: n */
    public static final ByteString f38000n = ByteString.EMPTY;

    /* renamed from: b */
    public final C19897i f38001b;

    /* renamed from: c */
    public final C19893f f38002c;

    /* renamed from: d */
    public final C19893f f38003d;

    /* renamed from: e */
    public ByteString f38004e;

    /* renamed from: f */
    public int f38005f;

    /* renamed from: g */
    public long f38006g = 0;

    /* renamed from: h */
    public boolean f38007h = false;

    public C17410u(C19897i iVar, C19893f fVar, ByteString byteString, int i) {
        this.f38001b = iVar;
        this.f38002c = iVar.mo72745l();
        this.f38003d = fVar;
        this.f38004e = byteString;
        this.f38005f = i;
    }

    /* renamed from: J */
    public final long mo68544J(C19893f fVar, long j) throws IOException {
        if (this.f38007h) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            if (!this.f38003d.mo72733e0()) {
                long J = this.f38003d.mo68544J(fVar, j);
                long j2 = j - J;
                if (this.f38002c.mo72733e0()) {
                    return J;
                }
                long J2 = mo68544J(fVar, j2);
                return J2 != -1 ? J + J2 : J;
            }
            mo68545a(j);
            long j3 = this.f38006g;
            if (j3 != 0) {
                long min = Math.min(j, j3);
                fVar.mo68512O(this.f38002c, min);
                this.f38006g -= min;
                return min;
            } else if (this.f38004e == f38000n) {
                return -1;
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    public final void mo68545a(long j) throws IOException {
        ByteString byteString;
        while (true) {
            long j2 = this.f38006g;
            if (j2 < j && this.f38004e != (byteString = f38000n)) {
                if (j2 == this.f38002c.f43876c) {
                    if (j2 <= 0) {
                        this.f38001b.mo72723U(1);
                    } else {
                        return;
                    }
                }
                long k = this.f38002c.mo72743k(this.f38006g, this.f38004e);
                if (k == -1) {
                    this.f38006g = this.f38002c.f43876c;
                } else {
                    byte h = this.f38002c.mo72738h(k);
                    ByteString byteString2 = this.f38004e;
                    ByteString byteString3 = f37995i;
                    if (byteString2 == byteString3) {
                        if (h == 34) {
                            this.f38004e = f37997k;
                            this.f38006g = k + 1;
                        } else if (h == 35) {
                            this.f38004e = f37998l;
                            this.f38006g = k + 1;
                        } else if (h == 39) {
                            this.f38004e = f37996j;
                            this.f38006g = k + 1;
                        } else if (h != 47) {
                            if (h != 91) {
                                if (h != 93) {
                                    if (h != 123) {
                                        if (h != 125) {
                                        }
                                    }
                                }
                                int i = this.f38005f - 1;
                                this.f38005f = i;
                                if (i == 0) {
                                    this.f38004e = byteString;
                                }
                                this.f38006g = k + 1;
                            }
                            this.f38005f++;
                            this.f38006g = k + 1;
                        } else {
                            long j3 = 2 + k;
                            this.f38001b.mo72723U(j3);
                            long j4 = k + 1;
                            byte h2 = this.f38002c.mo72738h(j4);
                            if (h2 == 47) {
                                this.f38004e = f37998l;
                                this.f38006g = j3;
                            } else if (h2 == 42) {
                                this.f38004e = f37999m;
                                this.f38006g = j3;
                            } else {
                                this.f38006g = j4;
                            }
                        }
                    } else if (byteString2 == f37996j || byteString2 == f37997k) {
                        if (h == 92) {
                            long j5 = k + 2;
                            this.f38001b.mo72723U(j5);
                            this.f38006g = j5;
                        } else {
                            if (this.f38005f > 0) {
                                byteString = byteString3;
                            }
                            this.f38004e = byteString;
                            this.f38006g = k + 1;
                        }
                    } else if (byteString2 == f37999m) {
                        long j6 = 2 + k;
                        this.f38001b.mo72723U(j6);
                        long j7 = k + 1;
                        if (this.f38002c.mo72738h(j7) == 47) {
                            this.f38006g = j6;
                            this.f38004e = byteString3;
                        } else {
                            this.f38006g = j7;
                        }
                    } else if (byteString2 == f37998l) {
                        this.f38006g = k + 1;
                        this.f38004e = byteString3;
                    } else {
                        throw new AssertionError();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void close() throws IOException {
        this.f38007h = true;
    }

    /* renamed from: m */
    public final C19890d0 mo68547m() {
        return this.f38001b.mo68547m();
    }
}
