package kotlinx.coroutines.flow;

import android.support.p013v4.media.C0072d;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.flow.internal.C19626c;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.flow.c */
public class C19594c<T> extends C19626c<T> {

    /* renamed from: e */
    public final C19861p<C19513o<? super T>, C19340c<? super C19394m>, Object> f43563e;

    public C19594c(C19861p<? super C19513o<? super T>, ? super C19340c<? super C19394m>, ? extends Object> pVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f43563e = pVar;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("block[");
        h.append(this.f43563e);
        h.append("] -> ");
        h.append(super.toString());
        return h.toString();
    }
}
