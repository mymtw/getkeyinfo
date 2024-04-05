package kotlin.text;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C19433i;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlin.text.Regex$splitToSequence$1", mo70541f = "Regex.kt", mo70542l = {276, 284, 288}, mo70543m = "invokeSuspend")
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements C19861p<C19433i<? super String>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ CharSequence $input;
    public final /* synthetic */ int $limit;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, C19340c<? super Regex$splitToSequence$1> cVar) {
        super(2, cVar);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, cVar);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    public final Object invoke(C19433i<? super String> iVar, C19340c<? super C19394m> cVar) {
        return ((Regex$splitToSequence$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 1
            r3 = 2
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 == r2) goto L_0x002c
            if (r1 == r3) goto L_0x001d
            if (r1 != r4) goto L_0x0015
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x009d
        L_0x0015:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001d:
            int r1 = r10.I$0
            java.lang.Object r5 = r10.L$1
            java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
            java.lang.Object r6 = r10.L$0
            kotlin.sequences.i r6 = (kotlin.sequences.C19433i) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            r7 = r10
            goto L_0x0071
        L_0x002c:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x00af
        L_0x0031:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            java.lang.Object r11 = r10.L$0
            kotlin.sequences.i r11 = (kotlin.sequences.C19433i) r11
            kotlin.text.Regex r1 = r10.this$0
            java.util.regex.Pattern r1 = r1.nativePattern
            java.lang.CharSequence r6 = r10.$input
            java.util.regex.Matcher r1 = r1.matcher(r6)
            int r6 = r10.$limit
            if (r6 == r2) goto L_0x00a0
            boolean r6 = r1.find()
            if (r6 != 0) goto L_0x004f
            goto L_0x00a0
        L_0x004f:
            r7 = r10
            r6 = r11
            r11 = r5
            r5 = r1
            r1 = r11
        L_0x0054:
            java.lang.CharSequence r8 = r7.$input
            int r9 = r5.start()
            java.lang.CharSequence r11 = r8.subSequence(r11, r9)
            java.lang.String r11 = r11.toString()
            r7.L$0 = r6
            r7.L$1 = r5
            r7.I$0 = r1
            r7.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = r6.mo72006a(r11, r7)
            if (r11 != r0) goto L_0x0071
            return r0
        L_0x0071:
            int r11 = r5.end()
            int r1 = r1 + r2
            int r8 = r7.$limit
            int r8 = r8 - r2
            if (r1 == r8) goto L_0x0081
            boolean r8 = r5.find()
            if (r8 != 0) goto L_0x0054
        L_0x0081:
            java.lang.CharSequence r1 = r7.$input
            int r2 = r1.length()
            java.lang.CharSequence r11 = r1.subSequence(r11, r2)
            java.lang.String r11 = r11.toString()
            r1 = 0
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = r6.mo72006a(r11, r7)
            if (r11 != r0) goto L_0x009d
            return r0
        L_0x009d:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        L_0x00a0:
            java.lang.CharSequence r1 = r10.$input
            java.lang.String r1 = r1.toString()
            r10.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = r11.mo72006a(r1, r10)
            if (r11 != r0) goto L_0x00af
            return r0
        L_0x00af:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
