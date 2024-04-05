package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19846a;

/* renamed from: bo.app.k5 */
public final class C3857k5 implements C4232u1 {

    /* renamed from: c */
    public static final C3858a f8738c = new C3858a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private boolean f8739a;

    /* renamed from: b */
    private final SharedPreferences f8740b;

    /* renamed from: bo.app.k5$a */
    public static final class C3858a {
        private C3858a() {
        }

        public /* synthetic */ C3858a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.k5$b */
    public static final class C3859b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f8741b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3859b(C4208t1 t1Var) {
            super(0);
            this.f8741b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8741b, "Storage provider is closed. Not adding event: ");
        }
    }

    /* renamed from: bo.app.k5$c */
    public static final class C3860c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f8742b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3860c(C4208t1 t1Var) {
            super(0);
            this.f8742b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8742b.mo13454r(), "Adding event to storage with uid ");
        }
    }

    /* renamed from: bo.app.k5$d */
    public static final class C3861d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3861d f8743b = new C3861d();

        public C3861d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    /* renamed from: bo.app.k5$e */
    public static final class C3862e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<String> f8744b;

        /* renamed from: c */
        public final /* synthetic */ String f8745c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3862e(Ref$ObjectRef<String> ref$ObjectRef, String str) {
            super(0);
            this.f8744b = ref$ObjectRef;
            this.f8745c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Could not create BrazeEvent from [serialized event string=");
            h.append((String) this.f8744b.element);
            h.append(", unique identifier=");
            h.append(this.f8745c);
            h.append("] ... Deleting!");
            return h.toString();
        }
    }

    /* renamed from: bo.app.k5$f */
    public static final class C3863f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3863f f8746b = new C3863f();

        public C3863f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Setting this provider to closed.";
        }
    }

    /* renamed from: bo.app.k5$g */
    public static final class C3864g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Set<C4208t1> f8747b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3864g(Set<? extends C4208t1> set) {
            super(0);
            this.f8747b = set;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8747b, "Storage provider is closed. Not deleting events: ");
        }
    }

    /* renamed from: bo.app.k5$h */
    public static final class C3865h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8748b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3865h(String str) {
            super(0);
            this.f8748b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8748b, "Deleting event from storage with uid ");
        }
    }

    public C3857k5(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f8740b = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.appboy.storage.appboy_event_storage"), 0);
    }

    /* renamed from: a */
    public Collection<C4208t1> mo13062a() {
        if (this.f8739a) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C3861d.f8743b, 6);
            return EmptyList.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = this.f8740b.getAll();
        C19383o.m32796f(all, "prefs.all");
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            T value = next.getValue();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = "";
            if (value != null) {
                try {
                    ref$ObjectRef.element = (String) value;
                    C19383o.m32796f(str, "eventId");
                    C4208t1 b = C3787j.f8608h.mo13476b((String) value, str);
                    if (b != null) {
                        linkedHashSet.add(b);
                    }
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C3862e(ref$ObjectRef, str), 4);
                    mo13573a(str);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return linkedHashSet;
    }

    public void close() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C3863f.f8746b, 6);
        this.f8739a = true;
    }

    /* renamed from: a */
    public void mo13063a(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        if (this.f8739a) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3859b(t1Var), 6);
            return;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3860c(t1Var), 3);
        this.f8740b.edit().putString(t1Var.mo13454r(), t1Var.mo14106p()).apply();
    }

    /* renamed from: a */
    public void mo13064a(Set<? extends C4208t1> set) {
        C19383o.m32797g(set, "events");
        if (this.f8739a) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3864g(set), 6);
            return;
        }
        SharedPreferences.Editor edit = this.f8740b.edit();
        for (C4208t1 r : set) {
            String r2 = r.mo13454r();
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3865h(r2), 3);
            edit.remove(r2);
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo13573a(String str) {
        SharedPreferences.Editor edit = this.f8740b.edit();
        edit.remove(str);
        edit.apply();
    }
}
