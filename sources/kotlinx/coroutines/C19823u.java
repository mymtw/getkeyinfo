package kotlinx.coroutines;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.u */
public final class C19823u {

    /* renamed from: a */
    public final Object f43826a;

    /* renamed from: b */
    public final C19705i f43827b;

    /* renamed from: c */
    public final C19857l<Throwable, C19394m> f43828c;

    /* renamed from: d */
    public final Object f43829d;

    /* renamed from: e */
    public final Throwable f43830e;

    public C19823u(Object obj, C19705i iVar, C19857l<? super Throwable, C19394m> lVar, Object obj2, Throwable th) {
        this.f43826a = obj;
        this.f43827b = iVar;
        this.f43828c = lVar;
        this.f43829d = obj2;
        this.f43830e = th;
    }

    /* renamed from: a */
    public static C19823u m33830a(C19823u uVar, C19705i iVar, CancellationException cancellationException, int i) {
        Object obj = null;
        Object obj2 = (i & 1) != 0 ? uVar.f43826a : null;
        if ((i & 2) != 0) {
            iVar = uVar.f43827b;
        }
        C19705i iVar2 = iVar;
        C19857l<Throwable, C19394m> lVar = (i & 4) != 0 ? uVar.f43828c : null;
        if ((i & 8) != 0) {
            obj = uVar.f43829d;
        }
        Object obj3 = obj;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = uVar.f43830e;
        }
        uVar.getClass();
        return new C19823u(obj2, iVar2, lVar, obj3, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19823u)) {
            return false;
        }
        C19823u uVar = (C19823u) obj;
        return C19383o.m32792b(this.f43826a, uVar.f43826a) && C19383o.m32792b(this.f43827b, uVar.f43827b) && C19383o.m32792b(this.f43828c, uVar.f43828c) && C19383o.m32792b(this.f43829d, uVar.f43829d) && C19383o.m32792b(this.f43830e, uVar.f43830e);
    }

    public final int hashCode() {
        Object obj = this.f43826a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C19705i iVar = this.f43827b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C19857l<Throwable, C19394m> lVar = this.f43828c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f43829d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f43830e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CompletedContinuation(result=");
        h.append(this.f43826a);
        h.append(", cancelHandler=");
        h.append(this.f43827b);
        h.append(", onCancellation=");
        h.append(this.f43828c);
        h.append(", idempotentResume=");
        h.append(this.f43829d);
        h.append(", cancelCause=");
        return C0070b.m185h(h, this.f43830e, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19823u(Object obj, C19705i iVar, C19857l lVar, Object obj2, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : cancellationException);
    }
}
