package kotlinx.coroutines.flow.internal;

import androidx.compose.animation.C0391c;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19512n;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.C19515q;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.flow.internal.c */
public abstract class C19626c<T> implements C19634k<T> {

    /* renamed from: b */
    public final CoroutineContext f43591b;

    /* renamed from: c */
    public final int f43592c;

    /* renamed from: d */
    public final BufferOverflow f43593d;

    public C19626c(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        this.f43591b = coroutineContext;
        this.f43592c = i;
        this.f43593d = bufferOverflow;
    }

    /* renamed from: b */
    public final C19597d<T> mo72332b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        CoroutineContext plus = coroutineContext.plus(this.f43591b);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.f43592c;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.f43593d;
        }
        return (C19383o.m32792b(plus, this.f43591b) && i == this.f43592c && bufferOverflow == this.f43593d) ? this : mo72261g(plus, i, bufferOverflow);
    }

    /* renamed from: c */
    public String mo72340c() {
        return null;
    }

    public Object collect(C19600e<? super T> eVar, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new ChannelFlow$collect$2(eVar, this, (C19340c<? super ChannelFlow$collect$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }

    /* renamed from: f */
    public abstract Object mo72260f(C19513o<? super T> oVar, C19340c<? super C19394m> cVar);

    /* renamed from: g */
    public abstract C19626c<T> mo72261g(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);

    /* renamed from: h */
    public C19597d<T> mo72341h() {
        return null;
    }

    /* renamed from: i */
    public C19515q<T> mo72342i(C19525d0 d0Var) {
        CoroutineContext coroutineContext = this.f43591b;
        int i = this.f43592c;
        if (i == -3) {
            i = -2;
        }
        BufferOverflow bufferOverflow = this.f43593d;
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, (C19340c<? super ChannelFlow$collectToFun$1>) null);
        C19512n nVar = new C19512n(CoroutineContextKt.m33062c(d0Var, coroutineContext), C17782b.m29872l(i, bufferOverflow, 4));
        coroutineStart.invoke(channelFlow$collectToFun$1, nVar, nVar);
        return nVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c = mo72340c();
        if (c != null) {
            arrayList.add(c);
        }
        CoroutineContext coroutineContext = this.f43591b;
        if (coroutineContext != EmptyCoroutineContext.INSTANCE) {
            arrayList.add(C19383o.m32802l(coroutineContext, "context="));
        }
        int i = this.f43592c;
        if (i != -3) {
            arrayList.add(C19383o.m32802l(Integer.valueOf(i), "capacity="));
        }
        BufferOverflow bufferOverflow = this.f43593d;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add(C19383o.m32802l(bufferOverflow, "onBufferOverflow="));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return C0391c.m1057c(sb, C19327t.m32644Z0(arrayList, ", ", (String) null, (String) null, (C19857l) null, 62), ']');
    }
}
