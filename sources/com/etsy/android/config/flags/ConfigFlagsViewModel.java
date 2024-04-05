package com.etsy.android.config.flags;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.config.flags.C6383l;
import com.etsy.android.config.flags.events.C6350c;
import com.etsy.android.config.flags.events.C6351d;
import com.etsy.android.config.flags.events.C6358e;
import com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher;
import com.etsy.android.util.C12059p;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.flow.C19659o1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p634np.C18289a;
import p744gq.C19060c;
import p753kq.C19861p;

public final class ConfigFlagsViewModel extends C2866i0 {

    /* renamed from: b */
    public final C18289a<C6358e> f14129b;

    /* renamed from: c */
    public final ConfigFlagsEventDispatcher f14130c;

    /* renamed from: d */
    public final StateFlowImpl f14131d;

    /* renamed from: e */
    public final StateFlowImpl f14132e;

    /* renamed from: f */
    public final C2895z<C12059p<C6351d.C6353b>> f14133f;

    /* renamed from: g */
    public final C2895z f14134g;

    @C19060c(mo70540c = "com.etsy.android.config.flags.ConfigFlagsViewModel$1", mo70541f = "ConfigFlagsViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.config.flags.ConfigFlagsViewModel$1 */
    public static final class C63421 extends SuspendLambda implements C19861p<C6350c, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ConfigFlagsViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C63421 r0 = new C63421(this.this$0, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C6350c cVar, C19340c<? super C19394m> cVar2) {
            return ((C63421) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:163:0x0518  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x0532  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x0552  */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x0571  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x057a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r0.label
                if (r1 != 0) goto L_0x0829
                androidx.compose.foundation.layout.C0761x.m1684O0(r23)
                java.lang.Object r1 = r0.L$0
                com.etsy.android.config.flags.events.c r1 = (com.etsy.android.config.flags.events.C6350c) r1
                com.etsy.android.config.flags.ConfigFlagsViewModel r2 = r0.this$0
                np.a<com.etsy.android.config.flags.events.e> r2 = r2.f14129b
                java.lang.Object r2 = r2.get()
                com.etsy.android.config.flags.events.e r2 = (com.etsy.android.config.flags.events.C6358e) r2
                com.etsy.android.config.flags.ConfigFlagsViewModel r3 = r0.this$0
                kotlinx.coroutines.flow.StateFlowImpl r3 = r3.f14132e
                java.lang.Object r3 = r3.getValue()
                com.etsy.android.config.flags.l r3 = (com.etsy.android.config.flags.C6383l) r3
                r2.getClass()
                java.lang.String r4 = "state"
                kotlin.jvm.internal.C19383o.m32797g(r3, r4)
                java.lang.String r4 = "event"
                kotlin.jvm.internal.C19383o.m32797g(r1, r4)
                boolean r4 = r1 instanceof com.etsy.android.config.flags.events.C6361h
                java.lang.String r5 = "off"
                java.lang.String r6 = "on"
                java.lang.String r7 = ""
                r8 = 1
                r9 = 0
                if (r4 == 0) goto L_0x022d
                com.etsy.android.config.flags.events.j r1 = r2.f14155a
                r1.getClass()
                java.util.TreeSet r2 = new java.util.TreeSet
                com.etsy.android.config.flags.events.i r3 = new com.etsy.android.config.flags.events.i
                r3.<init>()
                r2.<init>(r3)
                com.etsy.android.lib.config.a r3 = r1.f14179b
                com.etsy.android.lib.config.e r3 = r3.f18706f
                java.util.HashMap<java.lang.String, o9.l> r3 = r3.f18943c
                java.util.Set r3 = r3.entrySet()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x005e:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L_0x00b8
                java.lang.Object r10 = r3.next()
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                java.util.ArrayList r11 = com.etsy.android.config.flags.events.C6363j.f14177f
                java.lang.Object r12 = r10.getKey()
                boolean r11 = r11.contains(r12)
                if (r11 != 0) goto L_0x00b1
                o9.e r11 = r1.f14180c
                java.util.Map<java.lang.String, java.lang.String> r11 = r11.f28855a
                java.lang.Object r12 = r10.getKey()
                boolean r11 = r11.containsKey(r12)
                if (r11 == 0) goto L_0x0087
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r11 = com.etsy.android.config.flags.p073ui.ConfigFlagOrigin.OVERWRITTEN
                goto L_0x0089
            L_0x0087:
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r11 = com.etsy.android.config.flags.p073ui.ConfigFlagOrigin.SERVER
            L_0x0089:
                java.lang.Object r12 = r10.getValue()
                java.lang.String r13 = "it.value"
                kotlin.jvm.internal.C19383o.m32796f(r12, r13)
                o9.l r12 = (p409o9.C13132l) r12
                com.etsy.android.lib.config.a r13 = r1.f14179b
                com.etsy.android.lib.config.e r13 = r13.f18706f
                java.lang.Object r10 = r10.getValue()
                o9.p r10 = (p409o9.C13137p) r10
                java.lang.String r10 = r13.mo21136f(r10)
                java.lang.String r13 = "etsyConfig.etsyConfigMap.getStringValue(it.value)"
                kotlin.jvm.internal.C19383o.m32796f(r10, r13)
                o9.l r10 = p409o9.C13132l.m20792g(r12, r10)
                kotlin.Pair r12 = new kotlin.Pair
                r12.<init>(r10, r11)
                goto L_0x00b2
            L_0x00b1:
                r12 = 0
            L_0x00b2:
                if (r12 == 0) goto L_0x005e
                r4.add(r12)
                goto L_0x005e
            L_0x00b8:
                r2.addAll(r4)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                com.etsy.android.config.flags.a r4 = r1.f14181d
                java.util.List<com.etsy.android.lib.config.EtsyConfigKey> r4 = r4.f14135a
                java.util.Iterator r4 = r4.iterator()
            L_0x00c8:
                boolean r10 = r4.hasNext()
                if (r10 == 0) goto L_0x011a
                java.lang.Object r10 = r4.next()
                com.etsy.android.lib.config.EtsyConfigKey r10 = (com.etsy.android.lib.config.EtsyConfigKey) r10
                java.util.ArrayList r11 = com.etsy.android.config.flags.events.C6363j.f14177f
                java.lang.String r12 = r10.f18695a
                boolean r11 = r11.contains(r12)
                if (r11 != 0) goto L_0x00c8
                o9.e r11 = r1.f14180c
                java.util.Map<java.lang.String, java.lang.String> r11 = r11.f28855a
                java.lang.String r12 = r10.f18695a
                boolean r11 = r11.containsKey(r12)
                if (r11 == 0) goto L_0x00ed
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r11 = com.etsy.android.config.flags.p073ui.ConfigFlagOrigin.OVERWRITTEN
                goto L_0x00ef
            L_0x00ed:
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r11 = com.etsy.android.config.flags.p073ui.ConfigFlagOrigin.COMPILED
            L_0x00ef:
                com.etsy.android.lib.config.a r12 = r1.f14179b
                com.etsy.android.lib.config.e r12 = r12.f18706f
                com.etsy.android.lib.config.EtsyConfigKey$Environment r13 = r12.f18941a
                boolean r12 = r12.f18942b
                o9.l r12 = r10.mo21103d(r13, r12)
                java.lang.String r13 = "etsyConfig.etsyConfigMap…Key\n                    )"
                kotlin.jvm.internal.C19383o.m32796f(r12, r13)
                com.etsy.android.lib.config.a r13 = r1.f14179b
                com.etsy.android.lib.config.e r13 = r13.f18706f
                java.lang.String r10 = r13.mo21136f(r10)
                java.lang.String r13 = "etsyConfig.etsyConfigMap…tStringValue(compiledKey)"
                kotlin.jvm.internal.C19383o.m32796f(r10, r13)
                o9.l r10 = p409o9.C13132l.m20792g(r12, r10)
                kotlin.Pair r12 = new kotlin.Pair
                r12.<init>(r10, r11)
                r3.add(r12)
                goto L_0x00c8
            L_0x011a:
                r2.addAll(r3)
                com.etsy.android.config.flags.g r3 = r1.f14178a
                java.util.List r2 = kotlin.collections.C19327t.m32660p1(r2)
                r3.getClass()
                java.lang.String r3 = "etsyConfigOptions"
                kotlin.jvm.internal.C19383o.m32797g(r2, r3)
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0134:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0212
                java.lang.Object r4 = r2.next()
                kotlin.Pair r4 = (kotlin.Pair) r4
                java.lang.Object r10 = r4.getFirst()
                o9.l r10 = (p409o9.C13132l) r10
                o9.d r10 = r10.f28875f
                if (r10 == 0) goto L_0x014d
                java.util.List<java.lang.String> r10 = r10.f28852e
                goto L_0x014e
            L_0x014d:
                r10 = 0
            L_0x014e:
                if (r10 == 0) goto L_0x0159
                boolean r10 = r10.isEmpty()
                if (r10 == 0) goto L_0x0157
                goto L_0x0159
            L_0x0157:
                r10 = r9
                goto L_0x015a
            L_0x0159:
                r10 = r8
            L_0x015a:
                java.lang.String r11 = "origin"
                java.lang.String r12 = "etsyConfigOption"
                if (r10 == 0) goto L_0x01c8
                java.lang.Object r10 = r4.getFirst()
                o9.l r10 = (p409o9.C13132l) r10
                java.lang.String r10 = r10.f28871b
                boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r6)
                if (r10 != 0) goto L_0x017c
                java.lang.Object r10 = r4.getFirst()
                o9.l r10 = (p409o9.C13132l) r10
                java.lang.String r10 = r10.f28871b
                boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r5)
                if (r10 == 0) goto L_0x01c8
            L_0x017c:
                java.lang.Object r10 = r4.getFirst()
                o9.l r10 = (p409o9.C13132l) r10
                java.lang.String r10 = r10.f28870a
                java.lang.Object r13 = r4.getFirst()
                o9.l r13 = (p409o9.C13132l) r13
                java.lang.Object r4 = r4.getSecond()
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r4 = (com.etsy.android.config.flags.p073ui.ConfigFlagOrigin) r4
                kotlin.jvm.internal.C19383o.m32797g(r13, r12)
                kotlin.jvm.internal.C19383o.m32797g(r4, r11)
                com.etsy.android.config.flags.ui.switchconfigflag.a r11 = new com.etsy.android.config.flags.ui.switchconfigflag.a
                java.lang.String r15 = r13.f28870a
                o9.d r12 = r13.f28875f
                if (r12 == 0) goto L_0x01a1
                java.lang.String r14 = r12.f28854g
                goto L_0x01a2
            L_0x01a1:
                r14 = 0
            L_0x01a2:
                r16 = r14
                if (r12 == 0) goto L_0x01a9
                java.lang.String r12 = r12.f28853f
                goto L_0x01aa
            L_0x01a9:
                r12 = 0
            L_0x01aa:
                r17 = r12
                boolean r18 = r13.mo45840h()
                com.etsy.android.config.flags.ui.ConfigFlagStatus$a r12 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.Companion
                o9.d r13 = r13.f28875f
                r12.getClass()
                com.etsy.android.config.flags.ui.ConfigFlagStatus r19 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.C6390a.m12825a(r13)
                r21 = 64
                r14 = r11
                r20 = r4
                r14.<init>((java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (boolean) r18, (com.etsy.android.config.flags.p073ui.ConfigFlagStatus) r19, (com.etsy.android.config.flags.p073ui.ConfigFlagOrigin) r20, (int) r21)
                r3.put(r10, r11)
                goto L_0x0134
            L_0x01c8:
                java.lang.Object r10 = r4.getFirst()
                o9.l r10 = (p409o9.C13132l) r10
                java.lang.String r10 = r10.f28870a
                java.lang.Object r13 = r4.getFirst()
                o9.l r13 = (p409o9.C13132l) r13
                java.lang.Object r4 = r4.getSecond()
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r4 = (com.etsy.android.config.flags.p073ui.ConfigFlagOrigin) r4
                kotlin.jvm.internal.C19383o.m32797g(r13, r12)
                kotlin.jvm.internal.C19383o.m32797g(r4, r11)
                com.etsy.android.config.flags.ui.textconfigflag.a r11 = new com.etsy.android.config.flags.ui.textconfigflag.a
                java.lang.String r15 = r13.f28870a
                o9.d r12 = r13.f28875f
                if (r12 == 0) goto L_0x01ed
                java.lang.String r14 = r12.f28854g
                goto L_0x01ee
            L_0x01ed:
                r14 = 0
            L_0x01ee:
                r16 = r14
                if (r12 == 0) goto L_0x01f5
                java.lang.String r14 = r12.f28853f
                goto L_0x01f6
            L_0x01f5:
                r14 = 0
            L_0x01f6:
                r17 = r14
                java.lang.String r13 = r13.f28871b
                com.etsy.android.config.flags.ui.ConfigFlagStatus$a r14 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.Companion
                r14.getClass()
                com.etsy.android.config.flags.ui.ConfigFlagStatus r19 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.C6390a.m12825a(r12)
                r21 = 64
                r14 = r11
                r18 = r13
                r20 = r4
                r14.<init>((java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.etsy.android.config.flags.p073ui.ConfigFlagStatus) r19, (com.etsy.android.config.flags.p073ui.ConfigFlagOrigin) r20, (int) r21)
                r3.put(r10, r11)
                goto L_0x0134
            L_0x0212:
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>(r3)
                com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher r1 = r1.f14182e
                com.etsy.android.config.flags.events.l r3 = new com.etsy.android.config.flags.events.l
                r3.<init>(r2)
                r1.mo18133a(r3)
                com.etsy.android.config.flags.events.d$c r1 = new com.etsy.android.config.flags.events.d$c
                com.etsy.android.config.flags.l$a r3 = new com.etsy.android.config.flags.l$a
                r3.<init>(r7, r2)
                r1.<init>(r3)
                goto L_0x07f6
            L_0x022d:
                boolean r4 = r1 instanceof com.etsy.android.config.flags.events.C6373s
                java.lang.String r10 = "null cannot be cast to non-null type com.etsy.android.config.flags.ui.switchconfigflag.SwitchConfigFlag"
                r11 = 87
                if (r4 == 0) goto L_0x0326
                com.etsy.android.config.flags.ui.switchconfigflag.b r2 = r2.f14156b
                com.etsy.android.config.flags.events.s r1 = (com.etsy.android.config.flags.events.C6373s) r1
                r2.getClass()
                com.etsy.android.config.flags.l$a r3 = (com.etsy.android.config.flags.C6383l.C6384a) r3
                java.lang.String r4 = r3.f14209b
                java.util.Map<java.lang.String, com.etsy.android.config.flags.ui.c> r3 = r3.f14208a
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                int r12 = r3.size()
                int r12 = kotlin.reflect.C19421p.m32930T(r12)
                r7.<init>(r12)
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x0257:
                boolean r12 = r3.hasNext()
                if (r12 == 0) goto L_0x0298
                java.lang.Object r12 = r3.next()
                java.util.Map$Entry r12 = (java.util.Map.Entry) r12
                java.lang.Object r13 = r12.getKey()
                java.lang.Object r14 = r12.getValue()
                com.etsy.android.config.flags.ui.c r14 = (com.etsy.android.config.flags.p073ui.C6403c) r14
                boolean r15 = r14 instanceof com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a
                if (r15 == 0) goto L_0x0294
                java.lang.Object r12 = r12.getValue()
                if (r12 == 0) goto L_0x028e
                r14 = r12
                com.etsy.android.config.flags.ui.switchconfigflag.a r14 = (com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a) r14
                java.lang.String r12 = r14.f14225a
                java.lang.String r15 = r1.f14197a
                boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r12, r15)
                if (r12 == 0) goto L_0x0294
                boolean r12 = r14.f14228d
                r12 = r12 ^ r8
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r15 = com.etsy.android.config.flags.p073ui.ConfigFlagOrigin.OVERWRITTEN
                com.etsy.android.config.flags.ui.switchconfigflag.a r14 = com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a.m12836h(r14, r12, r15, r9, r11)
                goto L_0x0294
            L_0x028e:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                r1.<init>(r10)
                throw r1
            L_0x0294:
                r7.put(r13, r14)
                goto L_0x0257
            L_0x0298:
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.Set r7 = r7.entrySet()
                java.util.Iterator r7 = r7.iterator()
            L_0x02a5:
                boolean r11 = r7.hasNext()
                if (r11 == 0) goto L_0x02ca
                java.lang.Object r11 = r7.next()
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r12 = r11.getValue()
                com.etsy.android.config.flags.ui.c r12 = (com.etsy.android.config.flags.p073ui.C6403c) r12
                if (r12 == 0) goto L_0x02bb
                r12 = r8
                goto L_0x02bc
            L_0x02bb:
                r12 = r9
            L_0x02bc:
                if (r12 == 0) goto L_0x02a5
                java.lang.Object r12 = r11.getKey()
                java.lang.Object r11 = r11.getValue()
                r3.put(r12, r11)
                goto L_0x02a5
            L_0x02ca:
                java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
                int r8 = r3.size()
                int r8 = kotlin.reflect.C19421p.m32930T(r8)
                r7.<init>(r8)
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x02df:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x02fc
                java.lang.Object r8 = r3.next()
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                java.lang.Object r9 = r8.getKey()
                java.lang.Object r8 = r8.getValue()
                kotlin.jvm.internal.C19383o.m32794d(r8)
                com.etsy.android.config.flags.ui.c r8 = (com.etsy.android.config.flags.p073ui.C6403c) r8
                r7.put(r9, r8)
                goto L_0x02df
            L_0x02fc:
                com.etsy.android.config.flags.l$a r3 = new com.etsy.android.config.flags.l$a
                r3.<init>(r4, r7)
                java.util.Map<java.lang.String, com.etsy.android.config.flags.ui.c> r4 = r3.f14208a
                java.lang.String r7 = r1.f14197a
                java.lang.Object r4 = r4.get(r7)
                kotlin.jvm.internal.C19383o.m32795e(r4, r10)
                com.etsy.android.config.flags.ui.switchconfigflag.a r4 = (com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a) r4
                boolean r4 = r4.f14228d
                if (r4 == 0) goto L_0x0313
                r5 = r6
            L_0x0313:
                com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher r2 = r2.f14232a
                com.etsy.android.config.flags.events.p r4 = new com.etsy.android.config.flags.events.p
                java.lang.String r1 = r1.f14197a
                r4.<init>(r1, r5)
                r2.mo18133a(r4)
                com.etsy.android.config.flags.events.d$c r1 = new com.etsy.android.config.flags.events.d$c
                r1.<init>(r3)
                goto L_0x07f6
            L_0x0326:
                boolean r4 = r1 instanceof com.etsy.android.config.flags.events.C6374t
                if (r4 == 0) goto L_0x033d
                com.etsy.android.config.flags.ui.textconfigflag.b r2 = r2.f14157c
                com.etsy.android.config.flags.events.t r1 = (com.etsy.android.config.flags.events.C6374t) r1
                r2.getClass()
                com.etsy.android.config.flags.events.d$b$c r2 = new com.etsy.android.config.flags.events.d$b$c
                java.lang.String r3 = r1.f14198a
                java.lang.String r1 = r1.f14199b
                r2.<init>(r3, r1)
                r1 = r2
                goto L_0x07f6
            L_0x033d:
                boolean r4 = r1 instanceof com.etsy.android.config.flags.events.C6375u
                if (r4 == 0) goto L_0x046b
                com.etsy.android.config.flags.ui.textconfigflag.d r2 = r2.f14158d
                com.etsy.android.config.flags.events.u r1 = (com.etsy.android.config.flags.events.C6375u) r1
                r2.getClass()
                com.etsy.android.config.flags.l$a r3 = (com.etsy.android.config.flags.C6383l.C6384a) r3
                java.lang.String r4 = r3.f14209b
                java.util.Map<java.lang.String, com.etsy.android.config.flags.ui.c> r3 = r3.f14208a
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                int r6 = r3.size()
                int r6 = kotlin.reflect.C19421p.m32930T(r6)
                r5.<init>(r6)
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x0363:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x03a5
                java.lang.Object r6 = r3.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r12 = r6.getKey()
                java.lang.Object r13 = r6.getValue()
                com.etsy.android.config.flags.ui.c r13 = (com.etsy.android.config.flags.p073ui.C6403c) r13
                boolean r14 = r13 instanceof com.etsy.android.config.flags.p073ui.textconfigflag.C6421a
                if (r14 == 0) goto L_0x03a1
                java.lang.Object r6 = r6.getValue()
                if (r6 == 0) goto L_0x0399
                r13 = r6
                com.etsy.android.config.flags.ui.textconfigflag.a r13 = (com.etsy.android.config.flags.p073ui.textconfigflag.C6421a) r13
                java.lang.String r6 = r13.f14235a
                java.lang.String r14 = r1.f14200a
                boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r14)
                if (r6 == 0) goto L_0x03a1
                java.lang.String r6 = r1.f14201b
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r14 = com.etsy.android.config.flags.p073ui.ConfigFlagOrigin.OVERWRITTEN
                com.etsy.android.config.flags.ui.textconfigflag.a r13 = com.etsy.android.config.flags.p073ui.textconfigflag.C6421a.m12845h(r13, r6, r14, r9, r11)
                goto L_0x03a1
            L_0x0399:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "null cannot be cast to non-null type com.etsy.android.config.flags.ui.textconfigflag.TextConfigFlag"
                r1.<init>(r2)
                throw r1
            L_0x03a1:
                r5.put(r12, r13)
                goto L_0x0363
            L_0x03a5:
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L_0x03b2:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x03d7
                java.lang.Object r6 = r5.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r11 = r6.getValue()
                com.etsy.android.config.flags.ui.c r11 = (com.etsy.android.config.flags.p073ui.C6403c) r11
                if (r11 == 0) goto L_0x03c8
                r11 = r8
                goto L_0x03c9
            L_0x03c8:
                r11 = r9
            L_0x03c9:
                if (r11 == 0) goto L_0x03b2
                java.lang.Object r11 = r6.getKey()
                java.lang.Object r6 = r6.getValue()
                r3.put(r11, r6)
                goto L_0x03b2
            L_0x03d7:
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                int r6 = r3.size()
                int r6 = kotlin.reflect.C19421p.m32930T(r6)
                r5.<init>(r6)
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x03ec:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x0409
                java.lang.Object r6 = r3.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r8 = r6.getKey()
                java.lang.Object r6 = r6.getValue()
                kotlin.jvm.internal.C19383o.m32794d(r6)
                com.etsy.android.config.flags.ui.c r6 = (com.etsy.android.config.flags.p073ui.C6403c) r6
                r5.put(r8, r6)
                goto L_0x03ec
            L_0x0409:
                com.etsy.android.config.flags.l$a r3 = new com.etsy.android.config.flags.l$a
                r3.<init>(r4, r5)
                java.util.Map<java.lang.String, com.etsy.android.config.flags.ui.c> r4 = r3.f14208a
                java.lang.String r5 = r1.f14200a
                java.lang.Object r4 = r4.get(r5)
                boolean r4 = r4 instanceof com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a
                if (r4 == 0) goto L_0x0452
                java.util.Map<java.lang.String, com.etsy.android.config.flags.ui.c> r4 = r3.f14208a
                java.util.LinkedHashMap r4 = kotlin.collections.C19294b0.m32558A0(r4)
                java.lang.String r5 = r1.f14200a
                java.lang.Object r5 = r4.remove(r5)
                kotlin.jvm.internal.C19383o.m32795e(r5, r10)
                com.etsy.android.config.flags.ui.switchconfigflag.a r5 = (com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a) r5
                java.lang.String r6 = r1.f14200a
                com.etsy.android.config.flags.ui.textconfigflag.a r15 = new com.etsy.android.config.flags.ui.textconfigflag.a
                java.lang.String r9 = r5.f14225a
                java.lang.String r10 = r5.f14226b
                java.lang.String r11 = r5.f14227c
                java.lang.String r12 = r1.f14201b
                com.etsy.android.config.flags.ui.ConfigFlagStatus r13 = r5.f14229e
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r14 = com.etsy.android.config.flags.p073ui.ConfigFlagOrigin.OVERWRITTEN
                boolean r5 = r5.f14231g
                r8 = r15
                r0 = r15
                r15 = r5
                r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (com.etsy.android.config.flags.p073ui.ConfigFlagStatus) r13, (com.etsy.android.config.flags.p073ui.ConfigFlagOrigin) r14, (boolean) r15)
                r4.put(r6, r0)
                java.lang.String r0 = r3.f14209b
                java.lang.String r3 = "searchQuery"
                kotlin.jvm.internal.C19383o.m32797g(r0, r3)
                com.etsy.android.config.flags.l$a r3 = new com.etsy.android.config.flags.l$a
                r3.<init>(r0, r4)
            L_0x0452:
                com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher r0 = r2.f14243a
                com.etsy.android.config.flags.events.p r2 = new com.etsy.android.config.flags.events.p
                java.lang.String r4 = r1.f14200a
                java.lang.String r1 = r1.f14201b
                if (r1 != 0) goto L_0x045d
                goto L_0x045e
            L_0x045d:
                r7 = r1
            L_0x045e:
                r2.<init>(r4, r7)
                r0.mo18133a(r2)
                com.etsy.android.config.flags.events.d$c r0 = new com.etsy.android.config.flags.events.d$c
                r0.<init>(r3)
                goto L_0x06fb
            L_0x046b:
                boolean r0 = r1 instanceof com.etsy.android.config.flags.events.C6368o
                if (r0 == 0) goto L_0x049c
                com.etsy.android.config.flags.ui.search.e r0 = r2.f14159e
                com.etsy.android.config.flags.events.o r1 = (com.etsy.android.config.flags.events.C6368o) r1
                r0.getClass()
                java.lang.String r2 = r1.f14193a
                if (r2 == 0) goto L_0x0482
                boolean r2 = kotlin.text.C19457k.m33020X0(r2)
                if (r2 == 0) goto L_0x0481
                goto L_0x0482
            L_0x0481:
                r8 = r9
            L_0x0482:
                if (r8 == 0) goto L_0x048c
                com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher r0 = r0.f14222a
                com.etsy.android.config.flags.events.b r1 = com.etsy.android.config.flags.events.C6349b.f14147a
                r0.mo18133a(r1)
                goto L_0x0498
            L_0x048c:
                com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher r0 = r0.f14222a
                com.etsy.android.config.flags.events.g r2 = new com.etsy.android.config.flags.events.g
                java.lang.String r1 = r1.f14193a
                r2.<init>(r1)
                r0.mo18133a(r2)
            L_0x0498:
                com.etsy.android.config.flags.events.d$a r1 = com.etsy.android.config.flags.events.C6351d.C6352a.f14148a
                goto L_0x07f6
            L_0x049c:
                boolean r0 = r1 instanceof com.etsy.android.config.flags.events.C6360g
                java.lang.String r4 = "null cannot be cast to non-null type com.etsy.android.config.flags.ui.ConfigFlagUiModel"
                r5 = 63
                if (r0 == 0) goto L_0x0603
                com.etsy.android.config.flags.ui.search.c r0 = r2.f14160f
                com.etsy.android.config.flags.events.g r1 = (com.etsy.android.config.flags.events.C6360g) r1
                r0.getClass()
                com.etsy.android.config.flags.l$a r3 = (com.etsy.android.config.flags.C6383l.C6384a) r3
                java.lang.String r0 = r1.f14175a
                java.util.Map<java.lang.String, com.etsy.android.config.flags.ui.c> r2 = r3.f14208a
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                int r6 = r2.size()
                int r6 = kotlin.reflect.C19421p.m32930T(r6)
                r3.<init>(r6)
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x04c6:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0593
                java.lang.Object r6 = r2.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                java.lang.Object r10 = r6.getValue()
                com.etsy.android.config.flags.ui.c r10 = (com.etsy.android.config.flags.p073ui.C6403c) r10
                boolean r11 = r10 instanceof com.etsy.android.config.flags.p073ui.C6403c
                if (r11 == 0) goto L_0x058e
                java.lang.Object r6 = r6.getValue()
                if (r6 == 0) goto L_0x0588
                com.etsy.android.config.flags.ui.c r6 = (com.etsy.android.config.flags.p073ui.C6403c) r6
                java.lang.String r10 = r6.mo18192b()
                java.util.Locale r11 = java.util.Locale.ROOT
                java.lang.String r12 = "ROOT"
                java.lang.String r13 = "this as java.lang.String).toLowerCase(locale)"
                java.lang.String r10 = android.support.p013v4.media.session.C0087d.m237g(r11, r12, r10, r11, r13)
                java.lang.String r12 = r1.f14175a
                boolean r10 = kotlin.text.C19459m.m33036e1(r10, r12, r9)
                if (r10 != 0) goto L_0x056c
                java.lang.String r10 = r6.mo18194d()
                if (r10 == 0) goto L_0x0515
                java.lang.String r10 = r10.toLowerCase(r11)
                kotlin.jvm.internal.C19383o.m32796f(r10, r13)
                java.lang.String r12 = r1.f14175a
                boolean r10 = kotlin.text.C19459m.m33036e1(r10, r12, r9)
                if (r10 != r8) goto L_0x0515
                r10 = r8
                goto L_0x0516
            L_0x0515:
                r10 = r9
            L_0x0516:
                if (r10 != 0) goto L_0x056c
                java.lang.String r10 = r6.mo18195e()
                if (r10 == 0) goto L_0x052f
                java.lang.String r10 = r10.toLowerCase(r11)
                kotlin.jvm.internal.C19383o.m32796f(r10, r13)
                java.lang.String r12 = r1.f14175a
                boolean r10 = kotlin.text.C19459m.m33036e1(r10, r12, r9)
                if (r10 != r8) goto L_0x052f
                r10 = r8
                goto L_0x0530
            L_0x052f:
                r10 = r9
            L_0x0530:
                if (r10 != 0) goto L_0x056c
                com.etsy.android.config.flags.ui.ConfigFlagStatus r10 = r6.mo18191a()
                if (r10 == 0) goto L_0x054f
                java.lang.String r10 = r10.getStatusName()
                if (r10 == 0) goto L_0x054f
                java.lang.String r10 = r10.toLowerCase(r11)
                kotlin.jvm.internal.C19383o.m32796f(r10, r13)
                java.lang.String r12 = r1.f14175a
                boolean r10 = kotlin.text.C19459m.m33036e1(r10, r12, r9)
                if (r10 != r8) goto L_0x054f
                r10 = r8
                goto L_0x0550
            L_0x054f:
                r10 = r9
            L_0x0550:
                if (r10 != 0) goto L_0x056c
                com.etsy.android.config.flags.ui.ConfigFlagOrigin r10 = r6.mo18193c()
                java.lang.String r10 = r10.name()
                java.lang.String r10 = r10.toLowerCase(r11)
                kotlin.jvm.internal.C19383o.m32796f(r10, r13)
                java.lang.String r11 = r1.f14175a
                boolean r10 = kotlin.text.C19459m.m33036e1(r10, r11, r9)
                if (r10 == 0) goto L_0x056a
                goto L_0x056c
            L_0x056a:
                r10 = r9
                goto L_0x056d
            L_0x056c:
                r10 = r8
            L_0x056d:
                boolean r11 = r6 instanceof com.etsy.android.config.flags.p073ui.textconfigflag.C6421a
                if (r11 == 0) goto L_0x057a
                com.etsy.android.config.flags.ui.textconfigflag.a r6 = (com.etsy.android.config.flags.p073ui.textconfigflag.C6421a) r6
                r11 = 0
                com.etsy.android.config.flags.ui.textconfigflag.a r6 = com.etsy.android.config.flags.p073ui.textconfigflag.C6421a.m12845h(r6, r11, r11, r10, r5)
            L_0x0578:
                r10 = r6
                goto L_0x058e
            L_0x057a:
                r11 = 0
                boolean r12 = r6 instanceof com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a
                if (r12 == 0) goto L_0x0586
                com.etsy.android.config.flags.ui.switchconfigflag.a r6 = (com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a) r6
                com.etsy.android.config.flags.ui.switchconfigflag.a r6 = com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a.m12836h(r6, r9, r11, r10, r5)
                goto L_0x0578
            L_0x0586:
                r10 = 0
                goto L_0x058e
            L_0x0588:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r4)
                throw r0
            L_0x058e:
                r3.put(r7, r10)
                goto L_0x04c6
            L_0x0593:
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.Set r2 = r3.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x05a0:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x05c5
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getValue()
                com.etsy.android.config.flags.ui.c r4 = (com.etsy.android.config.flags.p073ui.C6403c) r4
                if (r4 == 0) goto L_0x05b6
                r4 = r8
                goto L_0x05b7
            L_0x05b6:
                r4 = r9
            L_0x05b7:
                if (r4 == 0) goto L_0x05a0
                java.lang.Object r4 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                r1.put(r4, r3)
                goto L_0x05a0
            L_0x05c5:
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                int r3 = r1.size()
                int r3 = kotlin.reflect.C19421p.m32930T(r3)
                r2.<init>(r3)
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x05da:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x05f7
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.C19383o.m32794d(r3)
                com.etsy.android.config.flags.ui.c r3 = (com.etsy.android.config.flags.p073ui.C6403c) r3
                r2.put(r4, r3)
                goto L_0x05da
            L_0x05f7:
                com.etsy.android.config.flags.l$a r1 = new com.etsy.android.config.flags.l$a
                r1.<init>(r0, r2)
                com.etsy.android.config.flags.events.d$c r0 = new com.etsy.android.config.flags.events.d$c
                r0.<init>(r1)
                goto L_0x06fb
            L_0x0603:
                boolean r0 = r1 instanceof com.etsy.android.config.flags.events.C6349b
                if (r0 == 0) goto L_0x06da
                com.etsy.android.config.flags.ui.search.a r0 = r2.f14161g
                r0.getClass()
                com.etsy.android.config.flags.l$a r3 = (com.etsy.android.config.flags.C6383l.C6384a) r3
                java.util.Map<java.lang.String, com.etsy.android.config.flags.ui.c> r0 = r3.f14208a
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                int r2 = r0.size()
                int r2 = kotlin.reflect.C19421p.m32930T(r2)
                r1.<init>(r2)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0625:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x066a
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.Object r6 = r2.getValue()
                com.etsy.android.config.flags.ui.c r6 = (com.etsy.android.config.flags.p073ui.C6403c) r6
                boolean r10 = r6 instanceof com.etsy.android.config.flags.p073ui.C6403c
                if (r10 == 0) goto L_0x0666
                java.lang.Object r2 = r2.getValue()
                if (r2 == 0) goto L_0x0660
                com.etsy.android.config.flags.ui.c r2 = (com.etsy.android.config.flags.p073ui.C6403c) r2
                boolean r6 = r2 instanceof com.etsy.android.config.flags.p073ui.textconfigflag.C6421a
                if (r6 == 0) goto L_0x0654
                com.etsy.android.config.flags.ui.textconfigflag.a r2 = (com.etsy.android.config.flags.p073ui.textconfigflag.C6421a) r2
                r6 = 0
                com.etsy.android.config.flags.ui.textconfigflag.a r2 = com.etsy.android.config.flags.p073ui.textconfigflag.C6421a.m12845h(r2, r6, r6, r8, r5)
            L_0x0652:
                r6 = r2
                goto L_0x0666
            L_0x0654:
                r6 = 0
                boolean r10 = r2 instanceof com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a
                if (r10 == 0) goto L_0x0666
                com.etsy.android.config.flags.ui.switchconfigflag.a r2 = (com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a) r2
                com.etsy.android.config.flags.ui.switchconfigflag.a r2 = com.etsy.android.config.flags.p073ui.switchconfigflag.C6417a.m12836h(r2, r9, r6, r8, r5)
                goto L_0x0652
            L_0x0660:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r0.<init>(r4)
                throw r0
            L_0x0666:
                r1.put(r3, r6)
                goto L_0x0625
            L_0x066a:
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x0677:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x069c
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                com.etsy.android.config.flags.ui.c r3 = (com.etsy.android.config.flags.p073ui.C6403c) r3
                if (r3 == 0) goto L_0x068d
                r3 = r8
                goto L_0x068e
            L_0x068d:
                r3 = r9
            L_0x068e:
                if (r3 == 0) goto L_0x0677
                java.lang.Object r3 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                r0.put(r3, r2)
                goto L_0x0677
            L_0x069c:
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                int r2 = r0.size()
                int r2 = kotlin.reflect.C19421p.m32930T(r2)
                r1.<init>(r2)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x06b1:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x06ce
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                kotlin.jvm.internal.C19383o.m32794d(r2)
                com.etsy.android.config.flags.ui.c r2 = (com.etsy.android.config.flags.p073ui.C6403c) r2
                r1.put(r3, r2)
                goto L_0x06b1
            L_0x06ce:
                com.etsy.android.config.flags.l$a r0 = new com.etsy.android.config.flags.l$a
                r0.<init>(r7, r1)
                com.etsy.android.config.flags.events.d$c r1 = new com.etsy.android.config.flags.events.d$c
                r1.<init>(r0)
                goto L_0x07f6
            L_0x06da:
                boolean r0 = r1 instanceof com.etsy.android.config.flags.events.C6348a
                if (r0 == 0) goto L_0x06e7
                com.etsy.android.config.flags.ui.a r0 = r2.f14162h
                r0.getClass()
                com.etsy.android.config.flags.events.d$b$a r1 = com.etsy.android.config.flags.events.C6351d.C6353b.C6354a.f14149a
                goto L_0x07f6
            L_0x06e7:
                boolean r0 = r1 instanceof com.etsy.android.config.flags.events.C6369p
                if (r0 == 0) goto L_0x06fe
                com.etsy.android.config.flags.events.q r0 = r2.f14163i
                com.etsy.android.config.flags.events.p r1 = (com.etsy.android.config.flags.events.C6369p) r1
                r0.getClass()
                com.etsy.android.config.flags.events.d$b$b r0 = new com.etsy.android.config.flags.events.d$b$b
                java.lang.String r2 = r1.f14194a
                java.lang.String r1 = r1.f14195b
                r0.<init>(r2, r1)
            L_0x06fb:
                r1 = r0
                goto L_0x07f6
            L_0x06fe:
                boolean r0 = r1 instanceof com.etsy.android.config.flags.events.C6365l
                if (r0 == 0) goto L_0x0821
                com.etsy.android.config.flags.events.m r0 = r2.f14164j
                com.etsy.android.config.flags.events.l r1 = (com.etsy.android.config.flags.events.C6365l) r1
                r0.getClass()
                java.util.HashMap<java.lang.String, com.etsy.android.config.flags.ui.c> r1 = r1.f14189a
                java.util.Collection r1 = r1.values()
                java.lang.String r2 = "event.configFlagsMap.values"
                kotlin.jvm.internal.C19383o.m32796f(r1, r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r3 = r1.iterator()
            L_0x071d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x073b
                java.lang.Object r4 = r3.next()
                r5 = r4
                com.etsy.android.config.flags.ui.c r5 = (com.etsy.android.config.flags.p073ui.C6403c) r5
                com.etsy.android.config.flags.ui.ConfigFlagStatus r5 = r5.mo18191a()
                com.etsy.android.config.flags.ui.ConfigFlagStatus r6 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.CLEAN_UP
                if (r5 != r6) goto L_0x0734
                r5 = r8
                goto L_0x0735
            L_0x0734:
                r5 = r9
            L_0x0735:
                if (r5 == 0) goto L_0x071d
                r2.add(r4)
                goto L_0x071d
            L_0x073b:
                int r2 = r2.size()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r1.iterator()
            L_0x0748:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0766
                java.lang.Object r5 = r4.next()
                r6 = r5
                com.etsy.android.config.flags.ui.c r6 = (com.etsy.android.config.flags.p073ui.C6403c) r6
                com.etsy.android.config.flags.ui.ConfigFlagStatus r6 = r6.mo18191a()
                com.etsy.android.config.flags.ui.ConfigFlagStatus r7 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.IN_EXPERIMENT
                if (r6 != r7) goto L_0x075f
                r6 = r8
                goto L_0x0760
            L_0x075f:
                r6 = r9
            L_0x0760:
                if (r6 == 0) goto L_0x0748
                r3.add(r5)
                goto L_0x0748
            L_0x0766:
                int r3 = r3.size()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r5 = r1.iterator()
            L_0x0773:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0791
                java.lang.Object r6 = r5.next()
                r7 = r6
                com.etsy.android.config.flags.ui.c r7 = (com.etsy.android.config.flags.p073ui.C6403c) r7
                com.etsy.android.config.flags.ui.ConfigFlagStatus r7 = r7.mo18191a()
                com.etsy.android.config.flags.ui.ConfigFlagStatus r10 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.IN_PE
                if (r7 != r10) goto L_0x078a
                r7 = r8
                goto L_0x078b
            L_0x078a:
                r7 = r9
            L_0x078b:
                if (r7 == 0) goto L_0x0773
                r4.add(r6)
                goto L_0x0773
            L_0x0791:
                int r4 = r4.size()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r6 = r1.iterator()
            L_0x079e:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x07bc
                java.lang.Object r7 = r6.next()
                r10 = r7
                com.etsy.android.config.flags.ui.c r10 = (com.etsy.android.config.flags.p073ui.C6403c) r10
                com.etsy.android.config.flags.ui.ConfigFlagStatus r10 = r10.mo18191a()
                com.etsy.android.config.flags.ui.ConfigFlagStatus r11 = com.etsy.android.config.flags.p073ui.ConfigFlagStatus.OPERATIONAL
                if (r10 != r11) goto L_0x07b5
                r10 = r8
                goto L_0x07b6
            L_0x07b5:
                r10 = r9
            L_0x07b6:
                if (r10 == 0) goto L_0x079e
                r5.add(r7)
                goto L_0x079e
            L_0x07bc:
                int r5 = r5.size()
                fa.a r6 = r0.f14190a
                double r7 = (double) r2
                r2 = 1000(0x3e8, float:1.401E-42)
                double r9 = (double) r2
                double r7 = r7 * r9
                java.lang.String r2 = "configs.timer.should_clean_up"
                r6.mo45477d(r2, r7)
                fa.a r2 = r0.f14190a
                double r6 = (double) r4
                double r6 = r6 * r9
                java.lang.String r4 = "configs.timer.is_in_current_pe"
                r2.mo45477d(r4, r6)
                fa.a r2 = r0.f14190a
                double r4 = (double) r5
                double r4 = r4 * r9
                java.lang.String r6 = "configs.timer.is_operational"
                r2.mo45477d(r6, r4)
                fa.a r2 = r0.f14190a
                double r3 = (double) r3
                double r3 = r3 * r9
                java.lang.String r5 = "configs.timer.is_in_experiment"
                r2.mo45477d(r5, r3)
                fa.a r0 = r0.f14190a
                int r1 = r1.size()
                double r1 = (double) r1
                double r1 = r1 * r9
                java.lang.String r3 = "configs.timer.total"
                r0.mo45477d(r3, r1)
                com.etsy.android.config.flags.events.d$a r1 = com.etsy.android.config.flags.events.C6351d.C6352a.f14148a
            L_0x07f6:
                boolean r0 = r1 instanceof com.etsy.android.config.flags.events.C6351d.C6357c
                if (r0 == 0) goto L_0x0808
                r0 = r22
                com.etsy.android.config.flags.ConfigFlagsViewModel r2 = r0.this$0
                com.etsy.android.config.flags.events.d$c r1 = (com.etsy.android.config.flags.events.C6351d.C6357c) r1
                com.etsy.android.config.flags.l r1 = r1.f14154a
                kotlinx.coroutines.flow.StateFlowImpl r2 = r2.f14131d
                r2.setValue(r1)
                goto L_0x081e
            L_0x0808:
                r0 = r22
                boolean r2 = r1 instanceof com.etsy.android.config.flags.events.C6351d.C6352a
                if (r2 != 0) goto L_0x081e
                boolean r2 = r1 instanceof com.etsy.android.config.flags.events.C6351d.C6353b
                if (r2 == 0) goto L_0x081e
                com.etsy.android.config.flags.ConfigFlagsViewModel r2 = r0.this$0
                androidx.lifecycle.z<com.etsy.android.util.p<com.etsy.android.config.flags.events.d$b>> r2 = r2.f14133f
                com.etsy.android.util.p r3 = new com.etsy.android.util.p
                r3.<init>(r1)
                r2.setValue(r3)
            L_0x081e:
                kotlin.m r1 = kotlin.C19394m.f43287a
                return r1
            L_0x0821:
                r0 = r22
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            L_0x0829:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.config.flags.ConfigFlagsViewModel.C63421.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ConfigFlagsViewModel(C18289a<C6358e> aVar) {
        C19383o.m32797g(aVar, "lazyConfigFlagsEventRouter");
        this.f14129b = aVar;
        ConfigFlagsEventDispatcher configFlagsEventDispatcher = new ConfigFlagsEventDispatcher(C19388s.m32866i0(this));
        this.f14130c = configFlagsEventDispatcher;
        StateFlowImpl g = C19388s.m32862g(C6383l.C6386c.f14212a);
        this.f14131d = g;
        this.f14132e = g;
        C2895z<C12059p<C6351d.C6353b>> zVar = new C2895z<>();
        this.f14133f = zVar;
        this.f14134g = zVar;
        C19669s.m33429a(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C19659o1(configFlagsEventDispatcher.f14145b), new C63421(this, (C19340c<? super C63421>) null)), C19388s.m32866i0(this));
    }
}
