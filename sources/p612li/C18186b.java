package p612li;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.Loader;
import p505aj.C13999g;
import p505aj.C14002i;
import p505aj.C14013s;
import p595ji.C17992d;

/* renamed from: li.b */
public abstract class C18186b implements Loader.C14427d {

    /* renamed from: a */
    public final long f39825a = C17992d.f39337b.getAndIncrement();

    /* renamed from: b */
    public final C14002i f39826b;

    /* renamed from: c */
    public final int f39827c;

    /* renamed from: d */
    public final Format f39828d;

    /* renamed from: e */
    public final int f39829e;

    /* renamed from: f */
    public final Object f39830f;

    /* renamed from: g */
    public final long f39831g;

    /* renamed from: h */
    public final long f39832h;

    /* renamed from: i */
    public final C14013s f39833i;

    public C18186b(C13999g gVar, C14002i iVar, int i, Format format, int i2, Object obj, long j, long j2) {
        this.f39833i = new C14013s(gVar);
        this.f39826b = iVar;
        this.f39827c = i;
        this.f39828d = format;
        this.f39829e = i2;
        this.f39830f = obj;
        this.f39831g = j;
        this.f39832h = j2;
    }
}
