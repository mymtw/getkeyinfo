package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.foundation.layout.C0761x;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19453g;
import kotlin.text.C19457k;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONObject;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.h6 */
public final class C3738h6 implements C4210t2 {

    /* renamed from: n */
    public static final C3739a f8524n = new C3739a((DefaultConstructorMarker) null);

    /* renamed from: o */
    private static final long f8525o = TimeUnit.SECONDS.toMillis(30);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final String f8526p = BrazeLogger.m11287i(C3738h6.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8527a;

    /* renamed from: b */
    private final C4274x1 f8528b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3666f2 f8529c;

    /* renamed from: d */
    private final long f8530d;

    /* renamed from: e */
    private final SharedPreferences f8531e;

    /* renamed from: f */
    private final C4102q2 f8532f;

    /* renamed from: g */
    private final C4258w2 f8533g;

    /* renamed from: h */
    private final AtomicInteger f8534h;

    /* renamed from: i */
    private final Queue<C4173s2> f8535i;

    /* renamed from: j */
    private final Map<String, C4275x2> f8536j;

    /* renamed from: k */
    private volatile long f8537k;

    /* renamed from: l */
    private final ReentrantLock f8538l = new ReentrantLock();

    /* renamed from: m */
    private final ReentrantLock f8539m = new ReentrantLock();

    /* renamed from: bo.app.h6$b */
    public static final class C3746b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3746b f8549b = new C3746b();

        public C3746b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "In flight trigger requests is empty. Executing any pending trigger events.";
        }
    }

    /* renamed from: bo.app.h6$c */
    public static final class C3747c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4173s2 f8550b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3747c(C4173s2 s2Var) {
            super(0);
            this.f8550b = s2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("New incoming <");
            h.append(this.f8550b.mo13075d());
            h.append(">. Searching for matching triggers.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$d */
    public static final class C3748d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8551b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3748d(C4275x2 x2Var) {
            super(0);
            this.f8551b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Found potential triggered action for incoming trigger event. Action id ");
            h.append(this.f8551b.getId());
            h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$e */
    public static final class C3749e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4173s2 f8552b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3749e(C4173s2 s2Var) {
            super(0);
            this.f8552b = s2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to match triggered action for incoming <");
            h.append(this.f8552b.mo13075d());
            h.append(">.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$f */
    public static final class C3750f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4173s2 f8553b;

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef<C4275x2> f8554c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3750f(C4173s2 s2Var, Ref$ObjectRef<C4275x2> ref$ObjectRef) {
            super(0);
            this.f8553b = s2Var;
            this.f8554c = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("\n     Found best triggered action for incoming trigger event ");
            h.append(this.f8553b.mo13262a() != null ? JsonUtils.m11315f((JSONObject) this.f8553b.mo13262a().forJsonPut()) : "");
            h.append(".\n     Matched Action id: ");
            h.append(((C4275x2) this.f8554c.element).getId());
            h.append(".\n                ");
            return C19453g.m33013Q0(h.toString());
        }
    }

    @C19060c(mo70540c = "com.braze.triggers.managers.TriggerManager$performTriggeredAction$1", mo70541f = "TriggerManager.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.h6$g */
    public static final class C3751g extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f8555b;

        /* renamed from: c */
        public final /* synthetic */ C4275x2 f8556c;

        /* renamed from: d */
        public final /* synthetic */ C3738h6 f8557d;

        /* renamed from: e */
        public final /* synthetic */ C4173s2 f8558e;

        /* renamed from: f */
        public final /* synthetic */ long f8559f;

        /* renamed from: g */
        public final /* synthetic */ long f8560g;

        /* renamed from: bo.app.h6$g$a */
        public static final class C3752a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ long f8561b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3752a(long j) {
                super(0);
                this.f8561b = j;
            }

            /* renamed from: a */
            public final String invoke() {
                return C0087d.m236f(C0072d.m201h("Performing triggered action after a delay of "), this.f8561b, " ms.");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3751g(C4275x2 x2Var, C3738h6 h6Var, C4173s2 s2Var, long j, long j2, C19340c<? super C3751g> cVar) {
            super(1, cVar);
            this.f8556c = x2Var;
            this.f8557d = h6Var;
            this.f8558e = s2Var;
            this.f8559f = j;
            this.f8560g = j2;
        }

        /* renamed from: a */
        public final Object invoke(C19340c<? super C19394m> cVar) {
            return ((C3751g) create(cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(C19340c<?> cVar) {
            return new C3751g(this.f8556c, this.f8557d, this.f8558e, this.f8559f, this.f8560g, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8555b == 0) {
                C0761x.m1684O0(obj);
                BrazeLogger.m11283e(C3738h6.f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3752a(this.f8560g), 14);
                this.f8556c.mo13245a(this.f8557d.f8527a, this.f8557d.f8529c, this.f8558e, this.f8559f);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.h6$h */
    public static final class C3753h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ List<C4275x2> f8562b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3753h(List<? extends C4275x2> list) {
            super(0);
            this.f8562b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Registering ");
            h.append(this.f8562b.size());
            h.append(" new triggered actions.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$i */
    public static final class C3754i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8563b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3754i(C4275x2 x2Var) {
            super(0);
            this.f8563b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Registering triggered action id ");
            h.append(this.f8563b.getId());
            h.append(' ');
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$j */
    public static final class C3755j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3755j f8564b = new C3755j();

        public C3755j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Test triggered actions found, triggering test event.";
        }
    }

    /* renamed from: bo.app.h6$k */
    public static final class C3756k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3756k f8565b = new C3756k();

        public C3756k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No test triggered actions found.";
        }
    }

    /* renamed from: bo.app.h6$l */
    public static final class C3757l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8566b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3757l(String str) {
            super(0);
            this.f8566b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Received null or blank serialized triggered action string for action id ");
            h.append(this.f8566b);
            h.append(" from shared preferences. Not parsing.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$m */
    public static final class C3758m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8567b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3758m(C4275x2 x2Var) {
            super(0);
            this.f8567b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Retrieving templated triggered action id ");
            h.append(this.f8567b.getId());
            h.append(" from local storage.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$n */
    public static final class C3759n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3759n f8568b = new C3759n();

        public C3759n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored triggered actions.";
        }
    }

    /* renamed from: bo.app.h6$o */
    public static final class C3760o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8569b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3760o(C4275x2 x2Var) {
            super(0);
            this.f8569b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Trigger manager received failed triggered action with id: <");
            h.append(this.f8569b.getId());
            h.append(">. Will attempt to perform fallback triggered actions, if present.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h6$p */
    public static final class C3761p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3761p f8570b = new C3761p();

        public C3761p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
        }
    }

    /* renamed from: bo.app.h6$q */
    public static final class C3762q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3762q f8571b = new C3762q();

        public C3762q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action has no fallback action to perform. Doing nothing.";
        }
    }

    /* renamed from: bo.app.h6$r */
    public static final class C3763r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8572b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3763r(C4275x2 x2Var) {
            super(0);
            this.f8572b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8572b.getId(), "Fallback trigger has expired. Trigger id: ");
        }
    }

    /* renamed from: bo.app.h6$s */
    public static final class C3764s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f8573b;

        /* renamed from: c */
        public final /* synthetic */ long f8574c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3764s(C4275x2 x2Var, long j) {
            super(0);
            this.f8573b = x2Var;
            this.f8574c = j;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Performing fallback triggered action with id: <");
            h.append(this.f8573b.getId());
            h.append("> with a delay: ");
            return C0087d.m236f(h, this.f8574c, " ms");
        }
    }

    @C19060c(mo70540c = "com.braze.triggers.managers.TriggerManager$retryTriggeredAction$6", mo70541f = "TriggerManager.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.h6$t */
    public static final class C3765t extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f8575b;

        /* renamed from: c */
        public final /* synthetic */ C4275x2 f8576c;

        /* renamed from: d */
        public final /* synthetic */ C3738h6 f8577d;

        /* renamed from: e */
        public final /* synthetic */ C4173s2 f8578e;

        /* renamed from: f */
        public final /* synthetic */ long f8579f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3765t(C4275x2 x2Var, C3738h6 h6Var, C4173s2 s2Var, long j, C19340c<? super C3765t> cVar) {
            super(1, cVar);
            this.f8576c = x2Var;
            this.f8577d = h6Var;
            this.f8578e = s2Var;
            this.f8579f = j;
        }

        /* renamed from: a */
        public final Object invoke(C19340c<? super C19394m> cVar) {
            return ((C3765t) create(cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(C19340c<?> cVar) {
            return new C3765t(this.f8576c, this.f8577d, this.f8578e, this.f8579f, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f8575b == 0) {
                C0761x.m1684O0(obj);
                this.f8576c.mo13245a(this.f8577d.f8527a, this.f8577d.f8529c, this.f8578e, this.f8579f);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.h6$u */
    public static final class C3766u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3766u f8580b = new C3766u();

        public C3766u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Subscribing to trigger dispatch events.";
        }
    }

    public C3738h6(Context context, C4274x1 x1Var, C3666f2 f2Var, BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(x1Var, "brazeManager");
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
        C19383o.m32797g(str2, "apiKey");
        Context applicationContext = context.getApplicationContext();
        C19383o.m32796f(applicationContext, "context.applicationContext");
        this.f8527a = applicationContext;
        this.f8528b = x1Var;
        this.f8529c = f2Var;
        this.f8530d = brazeConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.appboy.storage.triggers.actions"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f8531e = sharedPreferences;
        this.f8532f = new C4323z5(context, str2);
        this.f8533g = new C3866k6(context, str, str2);
        this.f8536j = mo13399h();
        this.f8534h = new AtomicInteger(0);
        this.f8535i = new ArrayDeque();
        m8763i();
    }

    /* renamed from: i */
    private final void m8763i() {
        BrazeLogger.m11283e(f8526p, BrazeLogger.Priority.V, (Throwable) null, C3766u.f8580b, 12);
        this.f8529c.mo13287a(new C3563a7(this, 0), C3606c6.class);
        this.f8529c.mo13287a(new C3594b7(this, 0), C3593b6.class);
    }

    /* renamed from: c */
    public final AtomicInteger mo13394c() {
        return this.f8534h;
    }

    /* renamed from: d */
    public long mo13395d() {
        return this.f8537k;
    }

    /* renamed from: e */
    public final Queue<C4173s2> mo13396e() {
        return this.f8535i;
    }

    /* renamed from: f */
    public C4258w2 mo13397f() {
        return this.f8533g;
    }

    /* renamed from: g */
    public final SharedPreferences mo13398g() {
        return this.f8531e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[Catch:{ Exception -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ Exception -> 0x007a }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, p030bo.app.C4275x2> mo13399h() {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r9.f8531e
            java.util.Map r1 = r1.getAll()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0018
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r3
        L_0x0019:
            if (r4 == 0) goto L_0x001c
            return r0
        L_0x001c:
            java.util.Set r1 = r1.keySet()
            java.util.Set r1 = kotlin.collections.C19327t.m32664t1(r1)
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x007a }
        L_0x0028:
            boolean r4 = r1.hasNext()     // Catch:{ Exception -> 0x007a }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r1.next()     // Catch:{ Exception -> 0x007a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x007a }
            android.content.SharedPreferences r5 = r9.f8531e     // Catch:{ Exception -> 0x007a }
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch:{ Exception -> 0x007a }
            if (r5 == 0) goto L_0x0046
            boolean r7 = kotlin.text.C19457k.m33020X0(r5)     // Catch:{ Exception -> 0x007a }
            if (r7 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r7 = r2
            goto L_0x0047
        L_0x0046:
            r7 = r3
        L_0x0047:
            if (r7 == 0) goto L_0x0058
            java.lang.String r5 = f8526p     // Catch:{ Exception -> 0x007a }
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x007a }
            bo.app.h6$l r8 = new bo.app.h6$l     // Catch:{ Exception -> 0x007a }
            r8.<init>(r4)     // Catch:{ Exception -> 0x007a }
            r4 = 12
            com.braze.support.BrazeLogger.m11283e(r5, r7, r6, r8, r4)     // Catch:{ Exception -> 0x007a }
            goto L_0x0028
        L_0x0058:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x007a }
            r4.<init>(r5)     // Catch:{ Exception -> 0x007a }
            bo.app.x1 r5 = r9.f8528b     // Catch:{ Exception -> 0x007a }
            bo.app.x2 r4 = p030bo.app.C3843j6.m8954b(r4, r5)     // Catch:{ Exception -> 0x007a }
            if (r4 != 0) goto L_0x0066
            goto L_0x0028
        L_0x0066:
            java.lang.String r5 = f8526p     // Catch:{ Exception -> 0x007a }
            bo.app.h6$m r7 = new bo.app.h6$m     // Catch:{ Exception -> 0x007a }
            r7.<init>(r4)     // Catch:{ Exception -> 0x007a }
            r8 = 14
            com.braze.support.BrazeLogger.m11283e(r5, r6, r6, r7, r8)     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = r4.getId()     // Catch:{ Exception -> 0x007a }
            r0.put(r5, r4)     // Catch:{ Exception -> 0x007a }
            goto L_0x0028
        L_0x007a:
            r1 = move-exception
            java.lang.String r2 = f8526p
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.E
            bo.app.h6$n r4 = p030bo.app.C3738h6.C3759n.f8568b
            r5 = 8
            com.braze.support.BrazeLogger.m11283e(r2, r3, r1, r4, r5)
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3738h6.mo13399h():java.util.Map");
    }

    /* renamed from: b */
    private final void m8761b(C4173s2 s2Var) {
        BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3747c(s2Var), 14);
        C4275x2 c = mo13393c(s2Var);
        if (c != null) {
            mo13392b(s2Var, c);
        }
    }

    /* renamed from: c */
    public final C4275x2 mo13393c(C4173s2 s2Var) {
        C4173s2 s2Var2 = s2Var;
        C19383o.m32797g(s2Var2, "event");
        ReentrantLock reentrantLock = this.f8538l;
        reentrantLock.lock();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator<C4275x2> it = this.f8536j.values().iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                T t = (C4275x2) it.next();
                if (t.mo13679b(s2Var2) && mo13397f().mo13582b(t)) {
                    T t2 = t;
                    if (f8524n.mo13401a(s2Var, t, mo13395d(), this.f8530d)) {
                        BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3748d(t2), 14);
                        int u = t2.mo13680f().mo13779u();
                        if (u > i) {
                            ref$ObjectRef.element = t2;
                            i = u;
                        }
                        arrayList.add(t2);
                    }
                }
            }
            T t3 = ref$ObjectRef.element;
            if (t3 == null) {
                BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3749e(s2Var2), 14);
                return null;
            }
            arrayList.remove(t3);
            ((C4275x2) ref$ObjectRef.element).mo13678a(new C3784i6(arrayList));
            BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3750f(s2Var2, ref$ObjectRef), 14);
            C4275x2 x2Var = (C4275x2) ref$ObjectRef.element;
            reentrantLock.unlock();
            return x2Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public void mo13387a(long j) {
        this.f8537k = j;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo13390a(List<? extends C4275x2> list) {
        C19383o.m32797g(list, "triggeredActions");
        C4249v5 v5Var = new C4249v5();
        ReentrantLock reentrantLock = this.f8538l;
        reentrantLock.lock();
        try {
            this.f8536j.clear();
            SharedPreferences.Editor clear = mo13398g().edit().clear();
            BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3753h(list), 14);
            boolean z = false;
            for (C4275x2 x2Var : list) {
                BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3754i(x2Var), 14);
                this.f8536j.put(x2Var.getId(), x2Var);
                clear.putString(x2Var.getId(), String.valueOf(x2Var.forJsonPut()));
                if (x2Var.mo13679b(v5Var)) {
                    z = true;
                }
            }
            clear.apply();
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            mo13397f().mo13390a(list);
            this.f8532f.mo13390a(list);
            if (z) {
                BrazeLogger.m11283e(f8526p, BrazeLogger.Priority.I, (Throwable) null, C3755j.f8564b, 12);
                mo13388a((C4173s2) v5Var);
                return;
            }
            BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, C3756k.f8565b, 14);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo13391b() {
        ReentrantLock reentrantLock = this.f8539m;
        reentrantLock.lock();
        try {
            if (mo13394c().get() <= 0) {
                BrazeLogger.m11283e(f8526p, (BrazeLogger.Priority) null, (Throwable) null, C3746b.f8549b, 14);
                while (!mo13396e().isEmpty()) {
                    C4173s2 poll = mo13396e().poll();
                    if (poll != null) {
                        m8761b(poll);
                    }
                }
                C19394m mVar = C19394m.f43287a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: bo.app.h6$a */
    public static final class C3739a {

        /* renamed from: bo.app.h6$a$a */
        public static final class C3740a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C3740a f8540b = new C3740a();

            public C3740a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
            }
        }

        /* renamed from: bo.app.h6$a$b */
        public static final class C3741b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ int f8541b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3741b(int i) {
                super(0);
                this.f8541b = i;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(Integer.valueOf(this.f8541b), "Using override minimum display interval: ");
            }
        }

        /* renamed from: bo.app.h6$a$c */
        public static final class C3742c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ long f8542b;

            /* renamed from: c */
            public final /* synthetic */ long f8543c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3742c(long j, long j2) {
                super(0);
                this.f8542b = j;
                this.f8543c = j2;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Minimum time interval requirement met for matched trigger. Action display time: ");
                h.append(this.f8542b);
                h.append(" . Next viable display time: ");
                h.append(this.f8543c);
                return h.toString();
            }
        }

        /* renamed from: bo.app.h6$a$d */
        public static final class C3743d extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ long f8544b;

            /* renamed from: c */
            public final /* synthetic */ long f8545c;

            /* renamed from: d */
            public final /* synthetic */ long f8546d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3743d(long j, long j2, long j3) {
                super(0);
                this.f8544b = j;
                this.f8545c = j2;
                this.f8546d = j3;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Minimum time interval requirement and triggered action override time interval requirement of ");
                h.append(this.f8544b);
                h.append(" not met for matched trigger. Returning null. Next viable display time: ");
                h.append(this.f8545c);
                h.append(". Action display time: ");
                h.append(this.f8546d);
                return h.toString();
            }
        }

        /* renamed from: bo.app.h6$a$e */
        public static final class C3744e extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ InAppMessageFailureType f8547b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3744e(InAppMessageFailureType inAppMessageFailureType) {
                super(0);
                this.f8547b = inAppMessageFailureType;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f8547b, "Trigger internal timeout exceeded. Attempting to log trigger failure: ");
            }
        }

        /* renamed from: bo.app.h6$a$f */
        public static final class C3745f extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ InAppMessageFailureType f8548b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3745f(InAppMessageFailureType inAppMessageFailureType) {
                super(0);
                this.f8548b = inAppMessageFailureType;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f8548b, "Trigger ID is blank. Not logging trigger failure: ");
            }
        }

        private C3739a() {
        }

        public /* synthetic */ C3739a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo13401a(C4173s2 s2Var, C4275x2 x2Var, long j, long j2) {
            long j3;
            C4173s2 s2Var2 = s2Var;
            C19383o.m32797g(s2Var2, "triggerEvent");
            C19383o.m32797g(x2Var, ResponseConstants.ACTION);
            if (s2Var2 instanceof C4249v5) {
                BrazeLogger.m11283e(C3738h6.f8526p, (BrazeLogger.Priority) null, (Throwable) null, C3740a.f8540b, 14);
                return true;
            }
            long d = DateTimeUtils.m11302d() + ((long) x2Var.mo13680f().mo13775g());
            int l = x2Var.mo13680f().mo13777l();
            if (l != -1) {
                BrazeLogger.m11283e(C3738h6.f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3741b(l), 14);
                j3 = j + ((long) l);
            } else {
                j3 = j + j2;
            }
            long j4 = j3;
            if (d >= j4) {
                BrazeLogger.m11283e(C3738h6.f8526p, BrazeLogger.Priority.I, (Throwable) null, new C3742c(d, j4), 12);
                return true;
            }
            BrazeLogger.m11283e(C3738h6.f8526p, BrazeLogger.Priority.I, (Throwable) null, new C3743d(j2, j4, d), 12);
            return false;
        }

        /* renamed from: a */
        public final void mo13400a(C4274x1 x1Var, String str, InAppMessageFailureType inAppMessageFailureType) {
            C19383o.m32797g(x1Var, "brazeManager");
            C19383o.m32797g(str, "triggerAnalyticsId");
            C19383o.m32797g(inAppMessageFailureType, "inAppMessageFailureType");
            BrazeLogger.m11283e(C3738h6.f8526p, BrazeLogger.Priority.I, (Throwable) null, new C3744e(inAppMessageFailureType), 12);
            if (C19457k.m33020X0(str)) {
                BrazeLogger.m11283e(C3738h6.f8526p, (BrazeLogger.Priority) null, (Throwable) null, new C3745f(inAppMessageFailureType), 14);
                return;
            }
            C4208t1 a = C3787j.f8608h.mo13466a(str, inAppMessageFailureType);
            if (a != null) {
                x1Var.mo13838a(a);
            }
        }
    }

    /* renamed from: b */
    public final void mo13392b(C4173s2 s2Var, C4275x2 x2Var) {
        C19383o.m32797g(s2Var, "event");
        C19383o.m32797g(x2Var, ResponseConstants.ACTION);
        x2Var.mo13781a(this.f8532f.mo13912a(x2Var));
        C4004n2 f = x2Var.mo13680f();
        long e = f.mo13773a() != -1 ? s2Var.mo13265e() + ((long) f.mo13773a()) : -1;
        long millis = TimeUnit.SECONDS.toMillis((long) f.mo13775g());
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.f11696b;
        BrazeCoroutineScope.m11007c(Long.valueOf(millis), new C3751g(x2Var, this, s2Var, e, millis, (C19340c<? super C3751g>) null));
    }

    /* renamed from: a */
    public void mo13388a(C4173s2 s2Var) {
        C19383o.m32797g(s2Var, "triggerEvent");
        ReentrantLock reentrantLock = this.f8539m;
        reentrantLock.lock();
        try {
            mo13396e().add(s2Var);
            if (mo13394c().get() == 0) {
                mo13391b();
            }
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public void mo13389a(C4173s2 s2Var, C4275x2 x2Var) {
        long j;
        C4173s2 s2Var2 = s2Var;
        C4275x2 x2Var2 = x2Var;
        C19383o.m32797g(s2Var2, "triggerEvent");
        C19383o.m32797g(x2Var2, "failedAction");
        String str = f8526p;
        BrazeLogger.m11283e(str, (BrazeLogger.Priority) null, (Throwable) null, new C3760o(x2Var2), 14);
        C3784i6 i = x2Var.mo13682i();
        if (i == null) {
            BrazeLogger.m11283e(str, (BrazeLogger.Priority) null, (Throwable) null, C3761p.f8570b, 14);
            return;
        }
        C4275x2 a = i.mo13443a();
        if (a == null) {
            BrazeLogger.m11283e(str, (BrazeLogger.Priority) null, (Throwable) null, C3762q.f8571b, 14);
            return;
        }
        a.mo13678a(i);
        a.mo13781a(this.f8532f.mo13912a(a));
        long e = s2Var.mo13265e();
        C4004n2 f = a.mo13680f();
        long a2 = (long) f.mo13773a();
        long millis = TimeUnit.SECONDS.toMillis((long) f.mo13775g());
        if (a2 != -1) {
            j = a2 + e;
        } else {
            j = e + millis + f8525o;
        }
        TimeZone timeZone = DateTimeUtils.f11946a;
        if (j < System.currentTimeMillis()) {
            BrazeLogger.m11283e(str, (BrazeLogger.Priority) null, (Throwable) null, new C3763r(a), 14);
            f8524n.mo13400a(this.f8528b, a.getId(), InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED);
            mo13389a(s2Var2, a);
            return;
        }
        long max = Math.max(0, (millis + e) - System.currentTimeMillis());
        BrazeLogger.m11283e(str, (BrazeLogger.Priority) null, (Throwable) null, new C3764s(a, max), 14);
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.f11696b;
        BrazeCoroutineScope.m11007c(Long.valueOf(max), new C3765t(a, this, s2Var, j, (C19340c<? super C3765t>) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8758a(C3738h6 h6Var, C3606c6 c6Var) {
        C19383o.m32797g(h6Var, "this$0");
        C19383o.m32797g(c6Var, "$noName_0");
        h6Var.f8534h.incrementAndGet();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8757a(C3738h6 h6Var, C3593b6 b6Var) {
        C19383o.m32797g(h6Var, "this$0");
        C19383o.m32797g(b6Var, "$noName_0");
        h6Var.f8534h.decrementAndGet();
        h6Var.mo13391b();
    }
}
