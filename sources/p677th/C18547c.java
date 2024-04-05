package p677th;

import p513bj.C14075p;
import p644ph.C18346e;
import p644ph.C18350i;

/* renamed from: th.c */
public final class C18547c implements C18350i {

    /* renamed from: a */
    public final C18350i f40824a;

    /* renamed from: b */
    public final long f40825b;

    public C18547c(C18346e eVar, long j) {
        this.f40824a = eVar;
        C14075p.m21691c(eVar.f40294d >= j);
        this.f40825b = j;
    }

    /* renamed from: a */
    public final void mo69871a(int i, int i2, byte[] bArr) {
        this.f40824a.mo69871a(i, i2, bArr);
    }

    /* renamed from: c */
    public final boolean mo69872c(byte[] bArr, int i, int i2, boolean z) {
        return this.f40824a.mo69872c(bArr, i, i2, z);
    }

    /* renamed from: f */
    public final void mo69873f() {
        this.f40824a.mo69873f();
    }

    /* renamed from: g */
    public final boolean mo69874g(byte[] bArr, int i, int i2, boolean z) {
        return this.f40824a.mo69874g(bArr, i, i2, z);
    }

    public final long getLength() {
        return this.f40824a.getLength() - this.f40825b;
    }

    public final long getPosition() {
        return this.f40824a.getPosition() - this.f40825b;
    }

    /* renamed from: h */
    public final long mo69877h() {
        return this.f40824a.mo69877h() - this.f40825b;
    }

    /* renamed from: i */
    public final void mo69878i(int i) {
        this.f40824a.mo69878i(i);
    }

    /* renamed from: j */
    public final void mo69879j(int i) {
        this.f40824a.mo69879j(i);
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.f40824a.read(bArr, i, i2);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.f40824a.readFully(bArr, i, i2);
    }
}
