package okhttp3.internal.connection;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19989m;
import okhttp3.C20018z;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p739dr.C19004d;
import p756lr.C19882a0;
import p756lr.C19888c0;
import p756lr.C19893f;
import p756lr.C19899k;
import p756lr.C19900l;

/* renamed from: okhttp3.internal.connection.c */
public final class C19967c {

    /* renamed from: a */
    public boolean f44126a;

    /* renamed from: b */
    public final C19976g f44127b;

    /* renamed from: c */
    public final C19971e f44128c;

    /* renamed from: d */
    public final C19989m f44129d;

    /* renamed from: e */
    public final C19970d f44130e;

    /* renamed from: f */
    public final C19004d f44131f;

    /* renamed from: okhttp3.internal.connection.c$a */
    public final class C19968a extends C19899k {

        /* renamed from: c */
        public boolean f44132c;

        /* renamed from: d */
        public long f44133d;

        /* renamed from: e */
        public boolean f44134e;

        /* renamed from: f */
        public final long f44135f;

        /* renamed from: g */
        public final /* synthetic */ C19967c f44136g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19968a(C19967c cVar, C19882a0 a0Var, long j) {
            super(a0Var);
            C19383o.m32797g(a0Var, "delegate");
            this.f44136g = cVar;
            this.f44135f = j;
        }

        /* renamed from: O */
        public final void mo68512O(C19893f fVar, long j) throws IOException {
            C19383o.m32797g(fVar, "source");
            if (!this.f44134e) {
                long j2 = this.f44135f;
                if (j2 == -1 || this.f44133d + j <= j2) {
                    try {
                        super.mo68512O(fVar, j);
                        this.f44133d += j;
                    } catch (IOException e) {
                        throw mo72909a(e);
                    }
                } else {
                    StringBuilder h = C0072d.m201h("expected ");
                    h.append(this.f44135f);
                    h.append(" bytes but received ");
                    h.append(this.f44133d + j);
                    throw new ProtocolException(h.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E mo72909a(E e) {
            if (this.f44132c) {
                return e;
            }
            this.f44132c = true;
            return this.f44136g.mo72906a(false, true, e);
        }

        public final void close() throws IOException {
            if (!this.f44134e) {
                this.f44134e = true;
                long j = this.f44135f;
                if (j == -1 || this.f44133d == j) {
                    try {
                        super.close();
                        mo72909a((IOException) null);
                    } catch (IOException e) {
                        throw mo72909a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw mo72909a(e);
            }
        }
    }

    /* renamed from: okhttp3.internal.connection.c$b */
    public final class C19969b extends C19900l {

        /* renamed from: c */
        public long f44137c;

        /* renamed from: d */
        public boolean f44138d = true;

        /* renamed from: e */
        public boolean f44139e;

        /* renamed from: f */
        public boolean f44140f;

        /* renamed from: g */
        public final long f44141g;

        /* renamed from: h */
        public final /* synthetic */ C19967c f44142h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19969b(C19967c cVar, C19888c0 c0Var, long j) {
            super(c0Var);
            C19383o.m32797g(c0Var, "delegate");
            this.f44142h = cVar;
            this.f44141g = j;
            if (j == 0) {
                mo72910a((IOException) null);
            }
        }

        /* renamed from: J */
        public final long mo68544J(C19893f fVar, long j) throws IOException {
            C19383o.m32797g(fVar, "sink");
            if (!this.f44140f) {
                try {
                    long J = this.f43883b.mo68544J(fVar, j);
                    if (this.f44138d) {
                        this.f44138d = false;
                        C19967c cVar = this.f44142h;
                        C19989m mVar = cVar.f44129d;
                        C19971e eVar = cVar.f44128c;
                        mVar.getClass();
                        C19383o.m32797g(eVar, "call");
                    }
                    if (J == -1) {
                        mo72910a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f44137c + J;
                    long j3 = this.f44141g;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f44141g + " bytes but received " + j2);
                        }
                    }
                    this.f44137c = j2;
                    if (j2 == j3) {
                        mo72910a((IOException) null);
                    }
                    return J;
                } catch (IOException e) {
                    throw mo72910a(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E mo72910a(E e) {
            if (this.f44139e) {
                return e;
            }
            this.f44139e = true;
            if (e == null && this.f44138d) {
                this.f44138d = false;
                C19967c cVar = this.f44142h;
                C19989m mVar = cVar.f44129d;
                C19971e eVar = cVar.f44128c;
                mVar.getClass();
                C19383o.m32797g(eVar, "call");
            }
            return this.f44142h.mo72906a(true, false, e);
        }

        public final void close() throws IOException {
            if (!this.f44140f) {
                this.f44140f = true;
                try {
                    super.close();
                    mo72910a((IOException) null);
                } catch (IOException e) {
                    throw mo72910a(e);
                }
            }
        }
    }

    public C19967c(C19971e eVar, C19989m mVar, C19970d dVar, C19004d dVar2) {
        C19383o.m32797g(mVar, "eventListener");
        this.f44128c = eVar;
        this.f44129d = mVar;
        this.f44130e = dVar;
        this.f44131f = dVar2;
        this.f44127b = dVar2.mo70446c();
    }

    /* renamed from: a */
    public final IOException mo72906a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            mo72908c(iOException);
        }
        if (z2) {
            if (iOException != null) {
                C19989m mVar = this.f44129d;
                C19971e eVar = this.f44128c;
                mVar.getClass();
                C19383o.m32797g(eVar, "call");
            } else {
                C19989m mVar2 = this.f44129d;
                C19971e eVar2 = this.f44128c;
                mVar2.getClass();
                C19383o.m32797g(eVar2, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                C19989m mVar3 = this.f44129d;
                C19971e eVar3 = this.f44128c;
                mVar3.getClass();
                C19383o.m32797g(eVar3, "call");
            } else {
                C19989m mVar4 = this.f44129d;
                C19971e eVar4 = this.f44128c;
                mVar4.getClass();
                C19383o.m32797g(eVar4, "call");
            }
        }
        return this.f44128c.mo72919h(this, z2, z, iOException);
    }

    /* renamed from: b */
    public final C20018z.C20019a mo72907b(boolean z) throws IOException {
        try {
            C20018z.C20019a g = this.f44131f.mo70451g(z);
            if (g != null) {
                g.f44387m = this;
            }
            return g;
        } catch (IOException e) {
            C19989m mVar = this.f44129d;
            C19971e eVar = this.f44128c;
            mVar.getClass();
            C19383o.m32797g(eVar, "call");
            mo72908c(e);
            throw e;
        }
    }

    /* renamed from: c */
    public final void mo72908c(IOException iOException) {
        this.f44130e.mo72913c(iOException);
        C19976g c = this.f44131f.mo70446c();
        C19971e eVar = this.f44128c;
        synchronized (c) {
            C19383o.m32797g(eVar, "call");
            if (!(iOException instanceof StreamResetException)) {
                if (!(c.f44181f != null) || (iOException instanceof ConnectionShutdownException)) {
                    c.f44184i = true;
                    if (c.f44187l == 0) {
                        C19976g.m34166d(eVar.f44168q, c.f44192q, iOException);
                        c.f44186k++;
                    }
                }
            } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i = c.f44188m + 1;
                c.f44188m = i;
                if (i > 1) {
                    c.f44184i = true;
                    c.f44186k++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !eVar.f44165n) {
                c.f44184i = true;
                c.f44186k++;
            }
        }
    }
}
