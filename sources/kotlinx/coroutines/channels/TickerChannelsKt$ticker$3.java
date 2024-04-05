package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", mo70541f = "TickerChannels.kt", mo70542l = {72, 73}, mo70543m = "invokeSuspend")
final class TickerChannelsKt$ticker$3 extends SuspendLambda implements C19861p<C19513o<? super C19394m>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $delayMillis;
    public final /* synthetic */ long $initialDelayMillis;
    public final /* synthetic */ TickerMode $mode;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: kotlinx.coroutines.channels.TickerChannelsKt$ticker$3$a */
    public /* synthetic */ class C19493a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43433a;

        static {
            int[] iArr = new int[TickerMode.values().length];
            iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
            iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
            f43433a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TickerChannelsKt$ticker$3(TickerMode tickerMode, long j, long j2, C19340c<? super TickerChannelsKt$ticker$3> cVar) {
        super(2, cVar);
        this.$mode = tickerMode;
        this.$delayMillis = j;
        this.$initialDelayMillis = j2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.$mode, this.$delayMillis, this.$initialDelayMillis, cVar);
        tickerChannelsKt$ticker$3.L$0 = obj;
        return tickerChannelsKt$ticker$3;
    }

    public final Object invoke(C19513o<? super C19394m> oVar, C19340c<? super C19394m> cVar) {
        return ((TickerChannelsKt$ticker$3) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19513o oVar = (C19513o) this.L$0;
            int i2 = C19493a.f43433a[this.$mode.ordinal()];
            if (i2 == 1) {
                long j = this.$delayMillis;
                long j2 = this.$initialDelayMillis;
                C19519u t = oVar.mo72217t();
                this.label = 1;
                if (C19523x.m33273b(j, j2, t, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 == 2) {
                long j3 = this.$delayMillis;
                long j4 = this.$initialDelayMillis;
                C19519u t2 = oVar.mo72217t();
                this.label = 2;
                if (C19523x.m33272a(j3, j4, t2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
