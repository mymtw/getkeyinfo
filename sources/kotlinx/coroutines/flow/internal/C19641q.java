package kotlinx.coroutines.flow.internal;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19671s1;
import kotlinx.coroutines.flow.C19689x1;

/* renamed from: kotlinx.coroutines.flow.internal.q */
public final class C19641q extends C19671s1<Integer> implements C19689x1<Integer> {
    public C19641q(int i) {
        super(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, BufferOverflow.DROP_OLDEST);
        mo72331a(Integer.valueOf(i));
    }

    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f43615i;
            C19383o.m32794d(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f43616j + ((long) ((int) ((mo72381o() + ((long) this.f43618l)) - this.f43616j)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
