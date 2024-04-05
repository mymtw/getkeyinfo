package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.foundation.layout.C0761x;
import com.appboy.Constants;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import com.braze.BrazeUser;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.C5410a;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.images.C5442a;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19706i0;
import kotlinx.coroutines.CoroutineStart;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONObject;
import p003a2.C0023f;
import p030bo.app.C3564b;
import p030bo.app.C3582b3;
import p030bo.app.C3602c2;
import p030bo.app.C3604c4;
import p030bo.app.C3620d2;
import p030bo.app.C3649e4;
import p030bo.app.C3666f2;
import p030bo.app.C3677g1;
import p030bo.app.C3730h3;
import p030bo.app.C3734h4;
import p030bo.app.C3738h6;
import p030bo.app.C3777i2;
import p030bo.app.C3779i4;
import p030bo.app.C3787j;
import p030bo.app.C3853k1;
import p030bo.app.C3958m0;
import p030bo.app.C3969n;
import p030bo.app.C4107q6;
import p030bo.app.C4143r6;
import p030bo.app.C4173s2;
import p030bo.app.C4174s3;
import p030bo.app.C4208t1;
import p030bo.app.C4257w1;
import p030bo.app.C4259w3;
import p030bo.app.C4261w4;
import p030bo.app.C4274x1;
import p030bo.app.C4276x3;
import p030bo.app.C4281x5;
import p030bo.app.C4297y2;
import p030bo.app.C4309z;
import p030bo.app.C4311z0;
import p301z3.C8433c;
import p301z3.C8434d;
import p301z3.C8435e;
import p301z3.C8436f;
import p301z3.C8437g;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

public final class Braze implements C5416d {

    /* renamed from: m */
    public static final Companion f11170m = new Companion();

    /* renamed from: n */
    public static final ReentrantLock f11171n = new ReentrantLock();

    /* renamed from: o */
    public static final Set<String> f11172o = C19382n.m32702C0("calypso appcrawler");

    /* renamed from: p */
    public static final Set<String> f11173p = C19382n.m32704D0("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    /* renamed from: q */
    public static volatile Braze f11174q;

    /* renamed from: r */
    public static final ReentrantLock f11175r = new ReentrantLock();

    /* renamed from: s */
    public static C5380a f11176s;

    /* renamed from: t */
    public static boolean f11177t;

    /* renamed from: u */
    public static boolean f11178u;

    /* renamed from: v */
    public static C4261w4 f11179v;

    /* renamed from: w */
    public static final ArrayList f11180w = new ArrayList();

    /* renamed from: x */
    public static final C5410a f11181x = new C5410a(new C5410a.C5411a());

    /* renamed from: a */
    public C5442a f11182a;

    /* renamed from: b */
    public Context f11183b;

    /* renamed from: c */
    public C4281x5 f11184c;

    /* renamed from: d */
    public C4174s3 f11185d;

    /* renamed from: e */
    public BrazeUser f11186e;

    /* renamed from: f */
    public Boolean f11187f;

    /* renamed from: g */
    public boolean f11188g;

    /* renamed from: h */
    public C3602c2 f11189h;

    /* renamed from: i */
    public C4311z0 f11190i;

    /* renamed from: j */
    public C3777i2 f11191j;

    /* renamed from: k */
    public BrazeConfigurationProvider f11192k;

    /* renamed from: l */
    public C4297y2 f11193l;

    public static final class Companion {

        /* renamed from: com.braze.Braze$Companion$a */
        final class C5124a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ EnumSet<BrazeSdkMetadata> f11194b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5124a(EnumSet<BrazeSdkMetadata> enumSet) {
                super(0);
                this.f11194b = enumSet;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11194b, "Failed to add SDK Metadata of: ");
            }
        }

        /* renamed from: com.braze.Braze$Companion$a0 */
        final class C5125a0 extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5125a0 f11195b = new C5125a0();

            public C5125a0() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to delete data from the internal storage cache.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$b */
        final class C5126b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5126b f11196b = new C5126b();

            public C5126b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Clearing Braze instance";
            }
        }

        /* renamed from: com.braze.Braze$Companion$b0 */
        final class C5127b0 extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ File f11197b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5127b0(File file) {
                super(0);
                this.f11197b = file;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11197b.getAbsolutePath(), "Deleting shared prefs file at: ");
            }
        }

        /* renamed from: com.braze.Braze$Companion$c */
        final class C5128c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ C5410a f11198b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5128c(C5410a aVar) {
                super(0);
                this.f11198b = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11198b, "Braze.configure() called with configuration: ");
            }
        }

        /* renamed from: com.braze.Braze$Companion$c0 */
        final class C5129c0 extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5129c0 f11199b = new C5129c0();

            public C5129c0() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to delete shared preference data for the Braze SDK.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$d */
        final class C5130d extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5130d f11200b = new C5130d();

            public C5130d() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Braze.configure() cannot be called while the singleton is still live.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$e */
        final class C5131e extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5131e f11201b = new C5131e();

            public C5131e() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Braze.configure() called with a null config; Clearing all configuration values.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$f */
        final class C5132f extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5132f f11202b = new C5132f();

            public C5132f() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Stopping the SDK instance.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$g */
        final class C5133g extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5133g f11203b = new C5133g();

            public C5133g() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Disabling all network requests";
            }
        }

        /* renamed from: com.braze.Braze$Companion$h */
        final class C5134h extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5134h f11204b = new C5134h();

            public C5134h() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$i */
        final class C5135i extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5135i f11205b = new C5135i();

            public C5135i() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$j */
        final class C5136j extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5136j f11206b = new C5136j();

            public C5136j() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$k */
        final class C5137k extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5137k f11207b = new C5137k();

            public C5137k() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Setting SDK to enabled.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$l */
        final class C5138l extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5138l f11208b = new C5138l();

            public C5138l() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Enabling all network requests";
            }
        }

        /* renamed from: com.braze.Braze$Companion$m */
        public static final class C5139m extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5139m f11209b = new C5139m();

            public C5139m() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
            }
        }

        /* renamed from: com.braze.Braze$Companion$n */
        public static final class C5140n extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5140n f11210b = new C5140n();

            public C5140n() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Caught exception while retrieving API key.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$o */
        public static final class C5141o extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5141o f11211b = new C5141o();

            public C5141o() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "SDK enablement provider was null. Returning SDK as enabled.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$p */
        public static final class C5142p extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5142p f11212b = new C5142p();

            public C5142p() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "API key not present. Actions will not be performed on the SDK.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$q */
        public static final class C5143q extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5143q f11213b = new C5143q();

            public C5143q() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "SDK is disabled. Actions will not be performed on the SDK.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$r */
        public static final class C5144r extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ boolean f11214b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5144r(boolean z) {
                super(0);
                this.f11214b = z;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11214b ? "disabled" : ResponseConstants.ENABLED, "Braze SDK outbound network requests are now ");
            }
        }

        /* renamed from: com.braze.Braze$Companion$s */
        public static final class C5145s extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5145s f11215b = new C5145s();

            public C5145s() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Push contained key for fetching test triggers, fetching triggers.";
            }
        }

        /* renamed from: com.braze.Braze$Companion$t */
        public static final class C5146t extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5146t f11216b = new C5146t();

            public C5146t() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The instance is null. Allowing instance initialization";
            }
        }

        /* renamed from: com.braze.Braze$Companion$u */
        public static final class C5147u extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5147u f11217b = new C5147u();

            public C5147u() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The instance was stopped. Allowing instance initialization";
            }
        }

        /* renamed from: com.braze.Braze$Companion$v */
        public static final class C5148v extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5148v f11218b = new C5148v();

            public C5148v() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "No API key was found previously. Allowing instance initialization";
            }
        }

        /* renamed from: com.braze.Braze$Companion$w */
        final class C5149w extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5149w f11219b = new C5149w();

            public C5149w() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Shutting down all queued work on the Braze SDK";
            }
        }

        /* renamed from: com.braze.Braze$Companion$x */
        final class C5150x extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5150x f11220b = new C5150x();

            public C5150x() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Sending sdk data wipe event to external subscribers";
            }
        }

        /* renamed from: com.braze.Braze$Companion$y */
        final class C5151y extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5151y f11221b = new C5151y();

            public C5151y() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Shutting down the singleton work queue";
            }
        }

        /* renamed from: com.braze.Braze$Companion$z */
        final class C5152z extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5152z f11222b = new C5152z();

            public C5152z() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to shutdown queued work on the Braze SDK.";
            }
        }

        /* renamed from: d */
        public static Uri m10671d(Uri uri) {
            C19383o.m32797g(uri, "brazeEndpoint");
            ReentrantLock reentrantLock = Braze.f11175r;
            reentrantLock.lock();
            try {
                C5380a aVar = Braze.f11176s;
                if (aVar != null) {
                    Uri a = aVar.mo15805a(uri);
                    if (a != null) {
                        reentrantLock.unlock();
                        return a;
                    }
                }
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, Braze.f11170m, BrazeLogger.Priority.W, e, C5139m.f11209b, 4);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            reentrantLock.unlock();
            return uri;
        }

        /* renamed from: g */
        public static C4261w4 m10672g(Context context) {
            C4261w4 w4Var = Braze.f11179v;
            if (w4Var != null) {
                return w4Var;
            }
            C4261w4 w4Var2 = new C4261w4(context);
            Braze.f11179v = w4Var2;
            return w4Var2;
        }

        /* renamed from: a */
        public final void mo15511a(Application application, C5410a aVar) {
            C19383o.m32797g(application, ResponseConstants.CONTEXT);
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C5128c(aVar), 7);
            ReentrantLock reentrantLock = Braze.f11171n;
            reentrantLock.lock();
            try {
                Braze braze = Braze.f11174q;
                if (braze == null || braze.f11188g || !C19383o.m32792b(Boolean.TRUE, braze.f11187f)) {
                    Braze.f11180w.add(aVar);
                    reentrantLock.unlock();
                    return;
                }
                BrazeLogger.m11282d(brazeLogger, Braze.f11170m, BrazeLogger.Priority.I, (Throwable) null, C5130d.f11200b, 6);
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final void mo15512b(Application application) {
            ReentrantLock reentrantLock;
            C19383o.m32797g(application, ResponseConstants.CONTEXT);
            m10672g(application).mo14146a(true);
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, C5132f.f11202b, 6);
            try {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, C5149w.f11219b, 6);
                reentrantLock = Braze.f11171n;
                reentrantLock.lock();
                BrazeCoroutineScope.m11006a();
                Braze braze = Braze.f11174q;
                if (braze != null) {
                    Companion companion = Braze.f11170m;
                    BrazeLogger.m11282d(brazeLogger, companion, BrazeLogger.Priority.V, (Throwable) null, C5150x.f11220b, 6);
                    braze.f11190i.mo13286a(new C8437g(), C8437g.class);
                    BrazeLogger.m11282d(brazeLogger, companion, (BrazeLogger.Priority) null, (Throwable) null, C5151y.f11221b, 7);
                    C3730h3.f8514a.mo13380a();
                    if (braze.f11193l != null) {
                        braze.mo15500p().mo14010c().mo13345a(true);
                        braze.mo15500p().mo14012e().mo13124a();
                        braze.mo15500p().mo14015h().mo13607c();
                    }
                    braze.f11188g = true;
                }
                C19394m mVar = C19394m.f43287a;
                reentrantLock.unlock();
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C5152z.f11222b, 4);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, C5133g.f11203b, 6);
            mo15518j(true);
        }

        /* renamed from: c */
        public final void mo15513c(Application application) {
            C19383o.m32797g(application, ResponseConstants.CONTEXT);
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger brazeLogger2 = brazeLogger;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5137k.f11207b, 6);
            m10672g(application).mo14146a(false);
            BrazeLogger.m11282d(brazeLogger2, this, priority, (Throwable) null, C5138l.f11208b, 6);
            mo15518j(false);
        }

        /* renamed from: e */
        public final String mo15514e(BrazeConfigurationProvider brazeConfigurationProvider) {
            try {
                return brazeConfigurationProvider.getBrazeApiKey().toString();
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5140n.f11210b, 4);
                return null;
            }
        }

        /* renamed from: f */
        public final Braze mo15515f(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            if (mo15519k()) {
                ReentrantLock reentrantLock = Braze.f11171n;
                reentrantLock.lock();
                try {
                    if (Braze.f11170m.mo15519k()) {
                        Braze braze = new Braze(context);
                        braze.f11188g = false;
                        Braze.f11174q = braze;
                        return braze;
                    }
                    C19394m mVar = C19394m.f43287a;
                    reentrantLock.unlock();
                } finally {
                    reentrantLock.unlock();
                }
            }
            Braze braze2 = Braze.f11174q;
            if (braze2 != null) {
                return braze2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.Braze");
        }

        /* renamed from: h */
        public final boolean mo15516h() {
            C4261w4 w4Var = Braze.f11179v;
            if (w4Var == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5141o.f11211b, 7);
                return false;
            }
            Braze braze = Braze.f11174q;
            if (braze == null || !C19383o.m32792b(Boolean.FALSE, braze.f11187f)) {
                boolean a = w4Var.mo14147a();
                if (a) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5143q.f11213b, 6);
                }
                return a;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5142p.f11212b, 6);
            return true;
        }

        /* renamed from: i */
        public final void mo15517i(Intent intent, C4274x1 x1Var) {
            C19383o.m32797g(intent, "intent");
            C19383o.m32797g(x1Var, "brazeManager");
            String stringExtra = intent.getStringExtra(Constants.APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY);
            if (stringExtra != null && C19383o.m32792b(stringExtra, "true")) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5145s.f11215b, 6);
                x1Var.mo13832a(new C4276x3.C4277a((String) null, (Boolean) null, (Boolean) null, (C4259w3) null, 15, (DefaultConstructorMarker) null).mo14175c());
            }
        }

        /* renamed from: j */
        public final void mo15518j(boolean z) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C5144r(z), 6);
            ReentrantLock reentrantLock = Braze.f11171n;
            reentrantLock.lock();
            try {
                Braze.f11178u = z;
                Braze braze = Braze.f11174q;
                if (braze != null) {
                    braze.mo15485B(new C5278s2(z), new C5282t2(z), true);
                    C19394m mVar = C19394m.f43287a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: k */
        public final boolean mo15519k() {
            Braze braze = Braze.f11174q;
            if (braze == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C5146t.f11216b, 6);
                return true;
            } else if (braze.f11188g) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5147u.f11217b, 7);
                return true;
            } else if (!C19383o.m32792b(Boolean.FALSE, braze.f11187f)) {
                return false;
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5148v.f11218b, 7);
                return true;
            }
        }
    }

    /* renamed from: com.braze.Braze$a */
    public static final class C5153a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5153a f11223b = new C5153a();

        public C5153a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze SDK Initializing";
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$deviceId$2", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$a0 */
    final class C5154a0 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super String>, Object> {

        /* renamed from: b */
        public int f11224b;

        public C5154a0(C19340c<? super C5154a0> cVar) {
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super String> cVar) {
            return ((C5154a0) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5154a0(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11224b == 0) {
                C0761x.m1684O0(obj);
                C3602c2 c2Var = Braze.this.f11189h;
                if (c2Var != null) {
                    return c2Var.getDeviceId();
                }
                C19383o.m32805o("deviceIdReader");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.Braze$a1 */
    final class C5155a1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11226b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11227c;

        /* renamed from: com.braze.Braze$a1$a */
        public static final class C5156a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5156a f11228b = new C5156a();

            public C5156a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification opened.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5155a1(String str, Braze braze) {
            super(0);
            this.f11226b = str;
            this.f11227c = braze;
        }

        /* renamed from: a */
        public final void mo15551a() {
            String str = this.f11226b;
            if (str == null || C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11227c, BrazeLogger.Priority.W, (Throwable) null, C5156a.f11228b, 6);
            } else {
                this.f11227c.mo15500p().mo14019l().mo13838a((C4208t1) C3734h4.f8521j.mo13385a(this.f11226b));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15551a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$a2 */
    final class C5157a2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5157a2 f11229b = new C5157a2();

        public C5157a2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request geofence refresh.";
        }
    }

    /* renamed from: com.braze.Braze$a3 */
    final class C5158a3 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5158a3 f11230b = new C5158a3();

        public C5158a3() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for session updates.";
        }
    }

    /* renamed from: com.braze.Braze$b */
    public static final class C5159b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11231b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5159b(String str) {
            super(0);
            this.f11231b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11231b, "Device build model matches a known crawler. Enabling mock network request mode. Device it: ");
        }
    }

    /* renamed from: com.braze.Braze$b0 */
    final class C5160b0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5160b0 f11232b = new C5160b0();

        public C5160b0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
        }
    }

    /* renamed from: com.braze.Braze$b1 */
    public static final class C5161b1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Intent f11233b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5161b1(Intent intent) {
            super(0);
            this.f11233b = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11233b, "Error logging push notification with intent: ");
        }
    }

    /* renamed from: com.braze.Braze$b2 */
    final class C5162b2 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ double f11234b;

        /* renamed from: c */
        public final /* synthetic */ double f11235c;

        /* renamed from: d */
        public final /* synthetic */ Braze f11236d;

        /* renamed from: com.braze.Braze$b2$a */
        public static final class C5163a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ double f11237b;

            /* renamed from: c */
            public final /* synthetic */ double f11238c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5163a(double d, double d2) {
                super(0);
                this.f11237b = d;
                this.f11238c = d2;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: ");
                h.append(this.f11237b);
                h.append(" - ");
                h.append(this.f11238c);
                return h.toString();
            }
        }

        /* renamed from: com.braze.Braze$b2$b */
        public static final class C5164b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ double f11239b;

            /* renamed from: c */
            public final /* synthetic */ double f11240c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5164b(double d, double d2) {
                super(0);
                this.f11239b = d;
                this.f11240c = d2;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Manually requesting Geofence refresh of with provided latitude - longitude: ");
                h.append(this.f11239b);
                h.append(" - ");
                h.append(this.f11240c);
                return h.toString();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5162b2(double d, double d2, Braze braze) {
            super(0);
            this.f11234b = d;
            this.f11235c = d2;
            this.f11236d = braze;
        }

        /* renamed from: a */
        public final void mo15558a() {
            if (!ValidationUtils.m11347b(this.f11234b, this.f11235c)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11236d, BrazeLogger.Priority.W, (Throwable) null, new C5163a(this.f11234b, this.f11235c), 6);
                return;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11236d, BrazeLogger.Priority.W, (Throwable) null, new C5164b(this.f11234b, this.f11235c), 6);
            this.f11236d.mo15500p().mo14015h().mo13596a((C4257w1) new C3969n(this.f11234b, this.f11235c, (Double) null, (Double) null, 12, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15558a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$b3 */
    final class C5165b3 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11241b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5165b3(String str) {
            super(0);
            this.f11241b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("The Braze SDK requires the permission "), this.f11241b, ". Check your AndroidManifest.");
        }
    }

    /* renamed from: com.braze.Braze$c */
    public static final class C5166c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5166c f11242b = new C5166c();

        public C5166c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to perform initial Braze singleton setup.";
        }
    }

    /* renamed from: com.braze.Braze$c0 */
    final class C5167c0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5167c0 f11243b = new C5167c0();

        public C5167c0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.";
        }
    }

    /* renamed from: com.braze.Braze$c1 */
    public static final class C5168c1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Intent f11244b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11245c;

        /* renamed from: com.braze.Braze$c1$a */
        public static final class C5169a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5169a f11246b = new C5169a();

            public C5169a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
            }
        }

        /* renamed from: com.braze.Braze$c1$b */
        public static final class C5170b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11247b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5170b(String str) {
                super(0);
                this.f11247b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11247b, "Logging push click. Campaign Id: ");
            }
        }

        /* renamed from: com.braze.Braze$c1$c */
        public static final class C5171c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5171c f11248b = new C5171c();

            public C5171c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5168c1(Intent intent, Braze braze) {
            super(0);
            this.f11244b = intent;
            this.f11245c = braze;
        }

        /* renamed from: a */
        public final void mo15564a() {
            Intent intent = this.f11244b;
            if (intent == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11245c, BrazeLogger.Priority.I, (Throwable) null, C5169a.f11246b, 6);
                return;
            }
            String stringExtra = intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            if (!(stringExtra == null || C19457k.m33020X0(stringExtra))) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11245c, BrazeLogger.Priority.I, (Throwable) null, new C5170b(stringExtra), 6);
                this.f11245c.mo15500p().mo14019l().mo13838a((C4208t1) C3734h4.f8521j.mo13385a(stringExtra));
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11245c, BrazeLogger.Priority.I, (Throwable) null, C5171c.f11248b, 6);
            }
            Braze.f11170m.mo15517i(this.f11244b, this.f11245c.mo15500p().mo14019l());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15564a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$c2 */
    final class C5172c2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5172c2 f11249b = new C5172c2();

        public C5172c2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to initialize geofences with the geofence manager.";
        }
    }

    /* renamed from: com.braze.Braze$c3 */
    final class C5173c3 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5173c3 f11250b = new C5173c3();

        public C5173c3() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
        }
    }

    /* renamed from: com.braze.Braze$d */
    public static final class C5174d extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Braze f11251b;

        /* renamed from: c */
        public final /* synthetic */ Context f11252c;

        /* renamed from: com.braze.Braze$d$a */
        public static final class C5175a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5175a f11253b = new C5175a();

            public C5175a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to startup user dependency manager.";
            }
        }

        /* renamed from: com.braze.Braze$d$b */
        public static final class C5176b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5176b f11254b = new C5176b();

            public C5176b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
            }
        }

        /* renamed from: com.braze.Braze$d$c */
        public static final class C5177c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5177c f11255b = new C5177c();

            public C5177c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        /* renamed from: com.braze.Braze$d$d */
        public static final class C5178d extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5178d f11256b = new C5178d();

            public C5178d() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        /* renamed from: com.braze.Braze$d$e */
        public static final class C5179e extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5179e f11257b = new C5179e();

            public C5179e() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
            }
        }

        /* renamed from: com.braze.Braze$d$f */
        public static final class C5180f extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5180f f11258b = new C5180f();

            public C5180f() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "ADM manifest requirements not met. Braze will not register for ADM.";
            }
        }

        /* renamed from: com.braze.Braze$d$g */
        public static final class C5181g extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5181g f11259b = new C5181g();

            public C5181g() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
            }
        }

        /* renamed from: com.braze.Braze$d$h */
        public static final class C5182h extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5182h f11260b = new C5182h();

            public C5182h() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to setup pre SDK tasks";
            }
        }

        /* renamed from: com.braze.Braze$d$i */
        public static final class C5183i extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5183i f11261b = new C5183i();

            public C5183i() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Starting up a new user dependency manager";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5174d(Braze braze, Context context) {
            super(0);
            this.f11251b = braze;
            this.f11252c = context;
        }

        /* renamed from: a */
        public final void mo15570a() {
            this.f11251b.mo15495j();
            Braze braze = this.f11251b;
            BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(this.f11251b.f11183b);
            braze.getClass();
            braze.f11192k = brazeConfigurationProvider;
            Braze braze2 = this.f11251b;
            Companion companion = Braze.f11170m;
            String e = companion.mo15514e(braze2.mo15497l());
            boolean z = false;
            braze2.f11187f = Boolean.valueOf(!(e == null || C19457k.m33020X0(e)));
            int loggerInitialLogLevel = this.f11251b.mo15497l().getLoggerInitialLogLevel();
            synchronized (BrazeLogger.class) {
                if (!BrazeLogger.f11935d) {
                    BrazeLogger.m11289k(loggerInitialLogLevel);
                }
            }
            BrazeLogger.m11284f();
            this.f11251b.f11184c = new C4281x5();
            C4281x5 x5Var = this.f11251b.f11184c;
            if (x5Var != null) {
                BrazeLogger.f11933b = x5Var;
                if (Companion.m10672g(this.f11252c).mo14147a()) {
                    companion.mo15518j(true);
                }
                Braze braze3 = this.f11251b;
                C3958m0 m0Var = new C3958m0(this.f11251b.f11183b);
                braze3.getClass();
                braze3.f11189h = m0Var;
                this.f11251b.f11185d = new C4174s3(this.f11251b.f11183b);
                Braze braze4 = this.f11251b;
                Braze braze5 = this.f11251b;
                braze4.f11191j = new C3779i4(braze5.f11183b, braze5.mo15497l());
                String customEndpoint = this.f11251b.mo15497l().getCustomEndpoint();
                if (customEndpoint == null || C19457k.m33020X0(customEndpoint)) {
                    z = true;
                }
                if (!z) {
                    String customEndpoint2 = this.f11251b.mo15497l().getCustomEndpoint();
                    ReentrantLock reentrantLock = Braze.f11175r;
                    reentrantLock.lock();
                    try {
                        C5380a aVar = new C5380a(customEndpoint2);
                        reentrantLock.lock();
                        Braze.f11176s = aVar;
                        C19394m mVar = C19394m.f43287a;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                try {
                    if (this.f11251b.mo15497l().isFirebaseCloudMessagingRegistrationEnabled()) {
                        Context context = this.f11252c;
                        C3777i2 i2Var = this.f11251b.f11191j;
                        if (i2Var != null) {
                            C3677g1 g1Var = new C3677g1(context, i2Var);
                            if (g1Var.mo13315a()) {
                                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.I, (Throwable) null, C5176b.f11254b, 6);
                                String firebaseCloudMessagingSenderIdKey = this.f11251b.mo15497l().getFirebaseCloudMessagingSenderIdKey();
                                if (firebaseCloudMessagingSenderIdKey != null) {
                                    g1Var.mo13314a(firebaseCloudMessagingSenderIdKey);
                                }
                            } else {
                                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.W, (Throwable) null, C5177c.f11255b, 6);
                            }
                        } else {
                            C19383o.m32805o("registrationDataProvider");
                            throw null;
                        }
                    } else {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.I, (Throwable) null, C5178d.f11256b, 6);
                    }
                    if (!this.f11251b.mo15497l().isAdmMessagingRegistrationEnabled()) {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.I, (Throwable) null, C5181g.f11259b, 6);
                    } else if (C3564b.f8221c.mo13109a(this.f11251b.f11183b)) {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.I, (Throwable) null, C5179e.f11257b, 6);
                        Braze braze6 = this.f11251b;
                        Context context2 = braze6.f11183b;
                        C3777i2 i2Var2 = braze6.f11191j;
                        if (i2Var2 != null) {
                            new C3564b(context2, i2Var2).mo13108a();
                        } else {
                            C19383o.m32805o("registrationDataProvider");
                            throw null;
                        }
                    } else {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.W, (Throwable) null, C5180f.f11258b, 6);
                    }
                    Braze.m10642h(this.f11251b);
                } catch (Exception e2) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.E, e2, C5182h.f11260b, 4);
                }
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.V, (Throwable) null, C5183i.f11261b, 6);
                try {
                    Braze braze7 = this.f11251b;
                    Context context3 = braze7.f11183b;
                    C4174s3 s3Var = braze7.f11185d;
                    if (s3Var != null) {
                        BrazeConfigurationProvider l = braze7.mo15497l();
                        Braze braze8 = this.f11251b;
                        C4311z0 z0Var = braze8.f11190i;
                        C3602c2 c2Var = braze8.f11189h;
                        if (c2Var != null) {
                            C3777i2 i2Var3 = braze8.f11191j;
                            if (i2Var3 != null) {
                                boolean z2 = Braze.f11177t;
                                boolean z3 = Braze.f11178u;
                                C4281x5 x5Var2 = braze8.f11184c;
                                if (x5Var2 != null) {
                                    Braze.m10641g(braze7, new C4143r6(context3, s3Var, l, z0Var, c2Var, i2Var3, z2, z3, x5Var2));
                                } else {
                                    C19383o.m32805o("testUserDeviceLoggingManager");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("registrationDataProvider");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("deviceIdReader");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("offlineUserStorageProvider");
                        throw null;
                    }
                } catch (Exception e3) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11251b, BrazeLogger.Priority.E, e3, C5175a.f11253b, 4);
                    this.f11251b.mo15508x(e3);
                }
            } else {
                C19383o.m32805o("testUserDeviceLoggingManager");
                throw null;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15570a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$d0 */
    final class C5184d0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5184d0 f11262b = new C5184d0();

        public C5184d0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.";
        }
    }

    /* renamed from: com.braze.Braze$d1 */
    public static final class C5185d1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11263b;

        /* renamed from: c */
        public final /* synthetic */ String f11264c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5185d1(String str, String str2) {
            super(0);
            this.f11263b = str;
            this.f11264c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to log push story page clicked for pageId: ");
            h.append(this.f11263b);
            h.append(" campaignId: ");
            h.append(this.f11264c);
            return h.toString();
        }
    }

    /* renamed from: com.braze.Braze$d2 */
    final class C5186d2 extends Lambda implements C19846a<C19394m> {
        public C5186d2() {
            super(0);
        }

        /* renamed from: a */
        public final void mo15582a() {
            Braze.this.mo15500p().mo14015h().mo13603b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15582a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$d3 */
    final class C5187d3 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5187d3 f11266b = new C5187d3();

        public C5187d3() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
        }
    }

    /* renamed from: com.braze.Braze$e */
    public static final class C5188e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f11267b;

        /* renamed from: c */
        public final /* synthetic */ long f11268c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5188e(long j, long j2) {
            super(0);
            this.f11267b = j;
            this.f11268c = j2;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0087d.m236f(C0072d.m201h("Braze SDK loaded in "), TimeUnit.MILLISECONDS.convert(this.f11267b - this.f11268c, TimeUnit.NANOSECONDS), " ms.");
        }
    }

    /* renamed from: com.braze.Braze$e0 */
    final class C5189e0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5189e0 f11269b = new C5189e0();

        public C5189e0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.";
        }
    }

    /* renamed from: com.braze.Braze$e1 */
    public static final class C5190e1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11270b;

        /* renamed from: c */
        public final /* synthetic */ String f11271c;

        /* renamed from: d */
        public final /* synthetic */ Braze f11272d;

        /* renamed from: com.braze.Braze$e1$a */
        public static final class C5191a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5191a f11273b = new C5191a();

            public C5191a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5190e1(String str, String str2, Braze braze) {
            super(0);
            this.f11270b = str;
            this.f11271c = str2;
            this.f11272d = braze;
        }

        /* renamed from: a */
        public final void mo15586a() {
            if (!ValidationUtils.m11350e(this.f11270b, this.f11271c)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11272d, BrazeLogger.Priority.W, (Throwable) null, C5191a.f11273b, 6);
                return;
            }
            C3787j.C3788a aVar = C3787j.f8608h;
            String str = this.f11270b;
            C19383o.m32794d(str);
            String str2 = this.f11271c;
            C19383o.m32794d(str2);
            C4208t1 e = aVar.mo13482e(str, str2);
            if (e != null) {
                this.f11272d.mo15500p().mo14019l().mo13838a(e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15586a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$e2 */
    public static final class C5192e2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5192e2 f11274b = new C5192e2();

        public C5192e2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request data flush.";
        }
    }

    /* renamed from: com.braze.Braze$e3 */
    final class C5193e3 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5193e3 f11275b = new C5193e3();

        public C5193e3() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "";
        }
    }

    /* renamed from: com.braze.Braze$f */
    final class C5194f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11276b;

        /* renamed from: c */
        public final /* synthetic */ String f11277c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5194f(String str, String str2) {
            super(0);
            this.f11276b = str;
            this.f11277c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to update ContentCard storage provider with single card update. User id: ");
            h.append(this.f11276b);
            h.append(" Serialized json: ");
            h.append(this.f11277c);
            return h.toString();
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$getCurrentUser$1", mo70541f = "Braze.kt", mo70542l = {713}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$f0 */
    public static final class C5195f0 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f11278b;

        /* renamed from: c */
        public final /* synthetic */ C8435e<BrazeUser> f11279c;

        /* renamed from: d */
        public final /* synthetic */ Braze f11280d;

        @C19060c(mo70540c = "com.braze.Braze$getCurrentUser$1$1", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
        /* renamed from: com.braze.Braze$f0$a */
        public static final class C5196a extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

            /* renamed from: b */
            public int f11281b;

            /* renamed from: c */
            public final /* synthetic */ C8435e<BrazeUser> f11282c;

            /* renamed from: d */
            public final /* synthetic */ Braze f11283d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5196a(C8435e<BrazeUser> eVar, Braze braze, C19340c<? super C5196a> cVar) {
                super(2, cVar);
                this.f11282c = eVar;
                this.f11283d = braze;
            }

            /* renamed from: a */
            public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                return ((C5196a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
            }

            public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                return new C5196a(this.f11282c, this.f11283d, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f11281b == 0) {
                    C0761x.m1684O0(obj);
                    C8435e<BrazeUser> eVar = this.f11282c;
                    BrazeUser brazeUser = this.f11283d.f11186e;
                    if (brazeUser != null) {
                        eVar.mo16190b(brazeUser);
                        return C19394m.f43287a;
                    }
                    C19383o.m32805o("brazeUser");
                    throw null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5195f0(C8435e<BrazeUser> eVar, Braze braze, C19340c<? super C5195f0> cVar) {
            super(2, cVar);
            this.f11279c = eVar;
            this.f11280d = braze;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C5195f0) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5195f0(this.f11279c, this.f11280d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f11278b;
            if (i == 0) {
                C0761x.m1684O0(obj);
                BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.f11696b;
                CoroutineContext coroutineContext = BrazeCoroutineScope.f11697c;
                C5196a aVar = new C5196a(this.f11279c, this.f11280d, (C19340c<? super C5196a>) null);
                this.f11278b = 1;
                if (C19697g.m33471i(this, coroutineContext, aVar) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$f1 */
    public static final class C5197f1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5197f1 f11284b = new C5197f1();

        public C5197f1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to open session.";
        }
    }

    /* renamed from: com.braze.Braze$f2 */
    public static final class C5198f2 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Braze f11285b;

        /* renamed from: com.braze.Braze$f2$a */
        public static final class C5199a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5199a f11286b = new C5199a();

            public C5199a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Requesting immediate data flush to Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5198f2(Braze braze) {
            super(0);
            this.f11285b = braze;
        }

        /* renamed from: a */
        public final void mo15594a() {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11285b, BrazeLogger.Priority.I, (Throwable) null, C5199a.f11286b, 6);
            this.f11285b.mo15500p().mo14019l().mo13839b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15594a();
            return C19394m.f43287a;
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$waitForUserDependencyThread$2", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$f3 */
    final class C5200f3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f11287b;

        /* renamed from: c */
        private /* synthetic */ Object f11288c;

        /* renamed from: com.braze.Braze$f3$a */
        public static final class C5201a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5201a f11289b = new C5201a();

            public C5201a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Waited on previous tasks to finish!";
            }
        }

        public C5200f3(C19340c<? super C5200f3> cVar) {
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C5200f3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C5200f3 f3Var = new C5200f3(cVar);
            f3Var.f11288c = obj;
            return f3Var;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11287b == 0) {
                C0761x.m1684O0(obj);
                BrazeLogger.m11282d(BrazeLogger.f11932a, (C19525d0) this.f11288c, (BrazeLogger.Priority) null, (Throwable) null, C5201a.f11289b, 7);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.Braze$g */
    final class C5202g extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11290b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11291c;

        /* renamed from: d */
        public final /* synthetic */ String f11292d;

        /* renamed from: com.braze.Braze$g$a */
        public static final class C5203a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11293b;

            /* renamed from: c */
            public final /* synthetic */ String f11294c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5203a(String str, String str2) {
                super(0);
                this.f11293b = str;
                this.f11294c = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Cannot add null or blank card json to storage. Returning. User id: ");
                h.append(this.f11293b);
                h.append(" Serialized json: ");
                h.append(this.f11294c);
                return h.toString();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5202g(String str, Braze braze, String str2) {
            super(0);
            this.f11290b = str;
            this.f11291c = braze;
            this.f11292d = str2;
        }

        /* renamed from: a */
        public final void mo15598a() {
            if (C19457k.m33020X0(this.f11290b)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11291c, BrazeLogger.Priority.W, (Throwable) null, new C5203a(this.f11292d, this.f11290b), 6);
                return;
            }
            this.f11291c.mo15500p().mo14016i().mo13017a(new C4309z(this.f11290b), this.f11292d);
            Braze braze = this.f11291c;
            braze.f11190i.mo13286a(braze.mo15500p().mo14016i().getCachedCardsAsEvent(), C8433c.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15598a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$g0 */
    public static final class C5204g0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5204g0 f11295b = new C5204g0();

        public C5204g0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    /* renamed from: com.braze.Braze$g1 */
    public static final class C5205g1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Activity f11296b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11297c;

        /* renamed from: com.braze.Braze$g1$a */
        public static final class C5206a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5206a f11298b = new C5206a();

            public C5206a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot open session with null activity.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5205g1(Activity activity, Braze braze) {
            super(0);
            this.f11296b = activity;
            this.f11297c = braze;
        }

        /* renamed from: a */
        public final void mo15601a() {
            if (this.f11296b == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11297c, BrazeLogger.Priority.I, (Throwable) null, C5206a.f11298b, 6);
            } else {
                this.f11297c.mo15500p().mo14019l().openSession(this.f11296b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15601a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$g2 */
    public static final class C5207g2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5207g2 f11299b = new C5207g2();

        public C5207g2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location permissions were granted. Requesting geofence and location initialization.";
        }
    }

    /* renamed from: com.braze.Braze$g3 */
    final class C5208g3 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5208g3 f11300b = new C5208g3();

        public C5208g3() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while waiting for previous tasks in serial work queue to finish.";
        }
    }

    /* renamed from: com.braze.Braze$h */
    final class C5209h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Class<Object> f11301b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5209h(Class<Object> cls) {
            super(0);
            this.f11301b = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11301b, "Failed to add synchronous subscriber for class: ");
        }
    }

    /* renamed from: com.braze.Braze$h0 */
    final class C5210h0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5210h0 f11302b = new C5210h0();

        public C5210h0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error handling test in-app message push";
        }
    }

    /* renamed from: com.braze.Braze$h1 */
    final class C5211h1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5211h1 f11303b = new C5211h1();

        public C5211h1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "User dependency manager is uninitialized. Not publishing error.";
        }
    }

    /* renamed from: com.braze.Braze$h2 */
    final class C5212h2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5212h2 f11304b = new C5212h2();

        public C5212h2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update";
        }
    }

    /* renamed from: com.braze.Braze$i */
    public static final class C5213i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5213i f11305b = new C5213i();

        public C5213i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Applying any pending runtime configuration values";
        }
    }

    /* renamed from: com.braze.Braze$i0 */
    final class C5214i0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Intent f11306b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11307c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5214i0(Intent intent, Braze braze) {
            super(0);
            this.f11306b = intent;
            this.f11307c = braze;
        }

        /* renamed from: a */
        public final void mo15610a() {
            Braze.f11170m.mo15517i(this.f11306b, this.f11307c.mo15500p().mo14019l());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15610a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$i1 */
    final class C5215i1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Throwable f11308b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5215i1(Throwable th) {
            super(0);
            this.f11308b = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11308b, "Failed to log throwable: ");
        }
    }

    /* renamed from: com.braze.Braze$i2 */
    final class C5216i2 extends Lambda implements C19846a<C19394m> {
        public C5216i2() {
            super(0);
        }

        /* renamed from: a */
        public final void mo15612a() {
            Braze.this.mo15500p().mo14014g().mo13378a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15612a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$j */
    public static final class C5217j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5217j f11310b = new C5217j();

        public C5217j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Clearing config values";
        }
    }

    /* renamed from: com.braze.Braze$j0 */
    final class C5218j0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5218j0 f11311b = new C5218j0();

        public C5218j0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Ephemeral events enabled";
        }
    }

    /* renamed from: com.braze.Braze$j1 */
    final class C5219j1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5219j1 f11312b = new C5219j1();

        public C5219j1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to post geofence report.";
        }
    }

    /* renamed from: com.braze.Braze$j2 */
    final class C5220j2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C8436f f11313b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5220j2(C8436f fVar) {
            super(0);
            this.f11313b = fVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11313b, "Error retrying In-App Message from event ");
        }
    }

    /* renamed from: com.braze.Braze$k */
    public static final class C5221k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C5410a f11314b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5221k(C5410a aVar) {
            super(0);
            this.f11314b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11314b, "Setting pending config object: ");
        }
    }

    /* renamed from: com.braze.Braze$k0 */
    final class C5222k0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11315b;

        /* renamed from: c */
        public final /* synthetic */ Set<String> f11316c;

        /* renamed from: d */
        public final /* synthetic */ boolean f11317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5222k0(String str, Set<String> set, boolean z) {
            super(0);
            this.f11315b = str;
            this.f11316c = set;
            this.f11317d = z;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Checking event key [");
            h.append(this.f11315b);
            h.append("] against ephemeral event list ");
            h.append(this.f11316c);
            h.append(" and got match?: ");
            h.append(this.f11317d);
            return h.toString();
        }
    }

    /* renamed from: com.braze.Braze$k1 */
    final class C5223k1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11318b;

        /* renamed from: c */
        public final /* synthetic */ C3853k1 f11319c;

        /* renamed from: d */
        public final /* synthetic */ Braze f11320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5223k1(String str, C3853k1 k1Var, Braze braze) {
            super(0);
            this.f11318b = str;
            this.f11319c = k1Var;
            this.f11320d = braze;
        }

        /* renamed from: a */
        public final void mo15619a() {
            String str = this.f11318b;
            if (!(str == null || C19457k.m33020X0(str)) && this.f11319c != null) {
                this.f11320d.mo15500p().mo14015h().mo13605b(this.f11318b, this.f11319c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15619a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$k2 */
    final class C5224k2 extends Lambda implements C19846a<C19394m> {

        /* renamed from: c */
        public final /* synthetic */ C8436f f11322c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5224k2(C8436f fVar) {
            super(0);
            this.f11322c = fVar;
        }

        /* renamed from: a */
        public final void mo15620a() {
            C3738h6 k = Braze.this.mo15500p().mo14018k();
            C8436f fVar = this.f11322c;
            k.mo13389a(fVar.f18451a, fVar.f18452b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15620a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$l */
    final class C5225l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5225l f11323b = new C5225l();

        public C5225l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
        }
    }

    /* renamed from: com.braze.Braze$l0 */
    public static final class C5226l0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11324b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5226l0(String str) {
            super(0);
            this.f11324b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11324b, "Failed to log custom event: ");
        }
    }

    /* renamed from: com.braze.Braze$l1 */
    final class C5227l1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5227l1 f11325b = new C5227l1();

        public C5227l1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get the registered push registration token.";
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$run$1", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$l2 */
    final class C5228l2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f11326b;

        /* renamed from: c */
        public final /* synthetic */ C19846a<C19394m> f11327c;

        @C19060c(mo70540c = "com.braze.Braze$run$1$1", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
        /* renamed from: com.braze.Braze$l2$a */
        public static final class C5229a extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

            /* renamed from: b */
            public int f11328b;

            /* renamed from: c */
            public final /* synthetic */ C19846a<C19394m> f11329c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5229a(C19846a<C19394m> aVar, C19340c<? super C5229a> cVar) {
                super(2, cVar);
                this.f11329c = aVar;
            }

            /* renamed from: a */
            public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                return ((C5229a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
            }

            public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                return new C5229a(this.f11329c, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f11328b == 0) {
                    C0761x.m1684O0(obj);
                    this.f11329c.invoke();
                    return C19394m.f43287a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5228l2(C19846a<C19394m> aVar, C19340c<? super C5228l2> cVar) {
            super(2, cVar);
            this.f11327c = aVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C5228l2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5228l2(this.f11327c, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11326b == 0) {
                C0761x.m1684O0(obj);
                Object unused = C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new C5229a(this.f11327c, (C19340c<? super C5229a>) null));
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$cachedContentCardsUpdatedEvent$2", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$m */
    final class C5230m extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C8433c>, Object> {

        /* renamed from: b */
        public int f11330b;

        public C5230m(C19340c<? super C5230m> cVar) {
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C8433c> cVar) {
            return ((C5230m) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5230m(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11330b == 0) {
                C0761x.m1684O0(obj);
                return Braze.this.mo15500p().mo14016i().getCachedCardsAsEvent();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.Braze$m0 */
    public static final class C5231m0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11332b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11333c;

        /* renamed from: d */
        public final /* synthetic */ BrazeProperties f11334d;

        /* renamed from: com.braze.Braze$m0$a */
        public static final class C5232a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Ref$ObjectRef<String> f11335b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5232a(Ref$ObjectRef<String> ref$ObjectRef) {
                super(0);
                this.f11335b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                return C0071c.m192d(C0072d.m201h("Logged custom event with name "), this.f11335b.element, " was invalid. Not logging custom event to Braze.");
            }
        }

        /* renamed from: com.braze.Braze$m0$b */
        public static final class C5233b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Ref$ObjectRef<String> f11336b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5233b(Ref$ObjectRef<String> ref$ObjectRef) {
                super(0);
                this.f11336b = ref$ObjectRef;
            }

            /* renamed from: a */
            public final String invoke() {
                return C0071c.m192d(C0072d.m201h("Custom event with name "), this.f11336b.element, " logged with invalid properties. Not logging custom event to Braze.");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5231m0(String str, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.f11332b = str;
            this.f11333c = braze;
            this.f11334d = brazeProperties;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
            if ((com.braze.support.StringUtils.m11340a(r1) > com.appboy.Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES) == true) goto L_0x004e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo15627a() {
            /*
                r15 = this;
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                java.lang.String r1 = r15.f11332b
                r0.element = r1
                com.braze.Braze r2 = r15.f11333c
                bo.app.y2 r2 = r2.mo15500p()
                bo.app.a5 r2 = r2.mo14011d()
                boolean r1 = com.braze.support.ValidationUtils.m11348c(r1, r2)
                if (r1 != 0) goto L_0x002a
                com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
                com.braze.Braze r3 = r15.f11333c
                com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.W
                com.braze.Braze$m0$a r6 = new com.braze.Braze$m0$a
                r6.<init>(r0)
                r5 = 0
                r7 = 6
                com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
                return
            L_0x002a:
                com.braze.models.outgoing.BrazeProperties r1 = r15.f11334d
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0031
                goto L_0x004d
            L_0x0031:
                org.json.JSONObject r1 = r1.f11850b
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "propertiesJSONObject.toString()"
                kotlin.jvm.internal.C19383o.m32796f(r1, r4)
                long r4 = com.braze.support.StringUtils.m11340a(r1)
                r6 = 51200(0xc800, double:2.5296E-319)
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 <= 0) goto L_0x0049
                r1 = r3
                goto L_0x004a
            L_0x0049:
                r1 = r2
            L_0x004a:
                if (r1 != r3) goto L_0x004d
                goto L_0x004e
            L_0x004d:
                r3 = r2
            L_0x004e:
                if (r3 == 0) goto L_0x0061
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.f11932a
                com.braze.Braze r5 = r15.f11333c
                com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.W
                com.braze.Braze$m0$b r8 = new com.braze.Braze$m0$b
                r8.<init>(r0)
                r7 = 0
                r9 = 6
                com.braze.support.BrazeLogger.m11282d(r4, r5, r6, r7, r8, r9)
                return
            L_0x0061:
                T r1 = r0.element
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = com.braze.support.ValidationUtils.m11346a(r1)
                r0.element = r1
                bo.app.j$a r3 = p030bo.app.C3787j.f8608h
                com.braze.models.outgoing.BrazeProperties r4 = r15.f11334d
                bo.app.t1 r1 = r3.mo13468a((java.lang.String) r1, (com.braze.models.outgoing.BrazeProperties) r4)
                if (r1 != 0) goto L_0x0076
                return
            L_0x0076:
                com.braze.Braze r9 = r15.f11333c
                T r3 = r0.element
                r10 = r3
                java.lang.String r10 = (java.lang.String) r10
                com.braze.configuration.BrazeConfigurationProvider r3 = r9.mo15497l()
                boolean r3 = r3.isEphemeralEventsEnabled()
                if (r3 != 0) goto L_0x0088
                goto L_0x00b0
            L_0x0088:
                com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r11 = com.braze.support.BrazeLogger.Priority.V
                com.braze.Braze$j0 r7 = com.braze.Braze.C5218j0.f11311b
                r12 = 0
                r13 = 6
                r6 = 0
                r8 = 6
                r3 = r2
                r4 = r9
                r5 = r11
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                com.braze.configuration.BrazeConfigurationProvider r3 = r9.mo15497l()
                java.util.Set r3 = r3.getEphemeralEventKeys()
                boolean r14 = r3.contains(r10)
                com.braze.Braze$k0 r7 = new com.braze.Braze$k0
                r7.<init>(r10, r3, r14)
                r3 = r2
                r6 = r12
                r8 = r13
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                r2 = r14
            L_0x00b0:
                if (r2 == 0) goto L_0x00c1
                com.braze.Braze r2 = r15.f11333c
                bo.app.y2 r2 = r2.mo15500p()
                bo.app.a5 r2 = r2.mo14011d()
                boolean r2 = r2.mo13092m()
                goto L_0x00cf
            L_0x00c1:
                com.braze.Braze r2 = r15.f11333c
                bo.app.y2 r2 = r2.mo15500p()
                bo.app.x1 r2 = r2.mo14019l()
                boolean r2 = r2.mo13838a((p030bo.app.C4208t1) r1)
            L_0x00cf:
                if (r2 == 0) goto L_0x00e9
                com.braze.Braze r2 = r15.f11333c
                bo.app.y2 r2 = r2.mo15500p()
                bo.app.h6 r2 = r2.mo14018k()
                bo.app.e0 r3 = new bo.app.e0
                T r0 = r0.element
                java.lang.String r0 = (java.lang.String) r0
                com.braze.models.outgoing.BrazeProperties r4 = r15.f11334d
                r3.<init>(r0, r4, r1)
                r2.mo13388a((p030bo.app.C4173s2) r3)
            L_0x00e9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.Braze.C5231m0.mo15627a():void");
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15627a();
            return C19394m.f43287a;
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$registeredPushToken$2", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$m1 */
    final class C5234m1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super String>, Object> {

        /* renamed from: b */
        public int f11337b;

        public C5234m1(C19340c<? super C5234m1> cVar) {
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super String> cVar) {
            return ((C5234m1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5234m1(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11337b == 0) {
                C0761x.m1684O0(obj);
                C3777i2 i2Var = Braze.this.f11191j;
                if (i2Var != null) {
                    return i2Var.mo13439a();
                }
                C19383o.m32805o("registrationDataProvider");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.Braze$m2 */
    final class C5235m2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5235m2 f11339b = new C5235m2();

        public C5235m2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Got error in singleton run without result";
        }
    }

    /* renamed from: com.braze.Braze$n */
    final class C5236n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11340b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5236n(String str) {
            super(0);
            this.f11340b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11340b, "Failed to set external id to: ");
        }
    }

    /* renamed from: com.braze.Braze$n0 */
    final class C5237n0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11341b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5237n0(String str) {
            super(0);
            this.f11341b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11341b, "Failed to log feed card clicked. Card id: ");
        }
    }

    /* renamed from: com.braze.Braze$n1 */
    public static final class C5238n1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11342b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5238n1(String str) {
            super(0);
            this.f11342b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11342b, "Failed to set the push token ");
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$runForResult$1", mo70541f = "Braze.kt", mo70542l = {1174}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$n2 */
    final class C5239n2 extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {

        /* renamed from: b */
        public int f11343b;

        /* renamed from: c */
        public final /* synthetic */ C19861p<C19525d0, C19340c<Object>, Object> f11344c;

        @C19060c(mo70540c = "com.braze.Braze$runForResult$1$1", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
        /* renamed from: com.braze.Braze$n2$a */
        public static final class C5240a extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {

            /* renamed from: b */
            public int f11345b;

            /* renamed from: c */
            public final /* synthetic */ C19861p<C19525d0, C19340c<Object>, Object> f11346c;

            @C19060c(mo70540c = "com.braze.Braze$runForResult$1$1$1", mo70541f = "Braze.kt", mo70542l = {1172}, mo70543m = "invokeSuspend")
            /* renamed from: com.braze.Braze$n2$a$a */
            public static final class C5241a extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {

                /* renamed from: b */
                public int f11347b;

                /* renamed from: c */
                private /* synthetic */ Object f11348c;

                /* renamed from: d */
                public final /* synthetic */ C19861p<C19525d0, C19340c<Object>, Object> f11349d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C5241a(C19861p<? super C19525d0, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super C5241a> cVar) {
                    super(2, cVar);
                    this.f11349d = pVar;
                }

                /* renamed from: a */
                public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
                    return ((C5241a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
                }

                public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                    C5241a aVar = new C5241a(this.f11349d, cVar);
                    aVar.f11348c = obj;
                    return aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f11347b;
                    if (i == 0) {
                        C0761x.m1684O0(obj);
                        C19861p<C19525d0, C19340c<Object>, Object> pVar = this.f11349d;
                        this.f11347b = 1;
                        obj = pVar.invoke((C19525d0) this.f11348c, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i == 1) {
                        C0761x.m1684O0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5240a(C19861p<? super C19525d0, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super C5240a> cVar) {
                super(2, cVar);
                this.f11346c = pVar;
            }

            /* renamed from: a */
            public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
                return ((C5240a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
            }

            public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                return new C5240a(this.f11346c, cVar);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f11345b == 0) {
                    C0761x.m1684O0(obj);
                    return C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new C5241a(this.f11346c, (C19340c<? super C5241a>) null));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5239n2(C19861p<? super C19525d0, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super C5239n2> cVar) {
            super(2, cVar);
            this.f11344c = pVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
            return ((C5239n2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5239n2(this.f11344c, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f11343b;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19706i0 b = C19697g.m33464b(C3730h3.f8514a, new C5240a(this.f11344c, (C19340c<? super C5240a>) null));
                this.f11343b = 1;
                obj = b.mo72507I(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* renamed from: com.braze.Braze$o */
    final class C5242o extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11350b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11351c;

        /* renamed from: d */
        public final /* synthetic */ String f11352d;

        /* renamed from: com.braze.Braze$o$a */
        public static final class C5243a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5243a f11353b = new C5243a();

            public C5243a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "userId passed to changeUser was null or empty. The current user will remain the active user.";
            }
        }

        /* renamed from: com.braze.Braze$o$b */
        public static final class C5244b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11354b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5244b(String str) {
                super(0);
                this.f11354b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11354b, "Rejected user id with byte length longer than 997. Not changing user. Input user id: ");
            }
        }

        /* renamed from: com.braze.Braze$o$c */
        public static final class C5245c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11355b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5245c(String str) {
                super(0);
                this.f11355b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Received request to change current user ");
                h.append(this.f11355b);
                h.append(" to the same user id. Not changing user.");
                return h.toString();
            }
        }

        /* renamed from: com.braze.Braze$o$d */
        public static final class C5246d extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11356b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5246d(String str) {
                super(0);
                this.f11356b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11356b, "Set sdk auth signature on changeUser call: ");
            }
        }

        /* renamed from: com.braze.Braze$o$e */
        public static final class C5247e extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11357b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5247e(String str) {
                super(0);
                this.f11357b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11357b, "Changing anonymous user to ");
            }
        }

        /* renamed from: com.braze.Braze$o$f */
        public static final class C5248f extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11358b;

            /* renamed from: c */
            public final /* synthetic */ String f11359c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5248f(String str, String str2) {
                super(0);
                this.f11358b = str;
                this.f11359c = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Changing current user ");
                h.append(this.f11358b);
                h.append(" to new user ");
                h.append(this.f11359c);
                h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                return h.toString();
            }
        }

        /* renamed from: com.braze.Braze$o$g */
        public static final class C5249g extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11360b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5249g(String str) {
                super(0);
                this.f11360b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11360b, "Set sdk auth signature on changeUser call: ");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5242o(String str, Braze braze, String str2) {
            super(0);
            this.f11350b = str;
            this.f11351c = braze;
            this.f11352d = str2;
        }

        /* renamed from: a */
        public final void mo15638a() {
            String str = this.f11350b;
            boolean z = true;
            if (str == null || str.length() == 0) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11351c, BrazeLogger.Priority.W, (Throwable) null, C5243a.f11353b, 6);
            } else if (StringUtils.m11340a(this.f11350b) > 997) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11351c, BrazeLogger.Priority.W, (Throwable) null, new C5244b(this.f11350b), 6);
            } else {
                BrazeUser brazeUser = this.f11351c.f11186e;
                if (brazeUser != null) {
                    ReentrantLock reentrantLock = brazeUser.f11462f;
                    reentrantLock.lock();
                    try {
                        String str2 = brazeUser.f11459c;
                        reentrantLock.unlock();
                        if (C19383o.m32792b(str2, this.f11350b)) {
                            BrazeLogger brazeLogger = BrazeLogger.f11932a;
                            BrazeLogger.m11282d(brazeLogger, this.f11351c, BrazeLogger.Priority.I, (Throwable) null, new C5245c(this.f11350b), 6);
                            String str3 = this.f11352d;
                            if (str3 != null && !C19457k.m33020X0(str3)) {
                                z = false;
                            }
                            if (!z) {
                                BrazeLogger.m11282d(brazeLogger, this.f11351c, (BrazeLogger.Priority) null, (Throwable) null, new C5246d(this.f11352d), 7);
                                this.f11351c.mo15500p().mo14021n().mo14135a(this.f11352d);
                                return;
                            }
                            return;
                        }
                        if (C19383o.m32792b(str2, "")) {
                            BrazeLogger brazeLogger2 = BrazeLogger.f11932a;
                            BrazeLogger.m11282d(brazeLogger2, this.f11351c, BrazeLogger.Priority.I, (Throwable) null, new C5247e(this.f11350b), 6);
                            C4174s3 s3Var = this.f11351c.f11185d;
                            if (s3Var != null) {
                                s3Var.mo14056a(this.f11350b);
                                BrazeUser brazeUser2 = this.f11351c.f11186e;
                                if (brazeUser2 != null) {
                                    String str4 = this.f11350b;
                                    C19383o.m32797g(str4, "userId");
                                    BrazeLogger.m11282d(brazeLogger2, brazeUser2, BrazeLogger.Priority.V, (Throwable) null, new BrazeUser.C5335d1(str4), 6);
                                    ReentrantLock reentrantLock2 = brazeUser2.f11462f;
                                    reentrantLock2.lock();
                                    try {
                                        if (!C19383o.m32792b(brazeUser2.f11459c, "")) {
                                            if (!C19383o.m32792b(brazeUser2.f11459c, str4)) {
                                                throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + brazeUser2.f11459c + "], tried to change to: [" + str4 + ']');
                                            }
                                        }
                                        brazeUser2.f11459c = str4;
                                        brazeUser2.f11457a.mo13941i(str4);
                                        C19394m mVar = C19394m.f43287a;
                                    } finally {
                                        reentrantLock2.unlock();
                                    }
                                } else {
                                    C19383o.m32805o("brazeUser");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("offlineUserStorageProvider");
                                throw null;
                            }
                        } else {
                            BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11351c, BrazeLogger.Priority.I, (Throwable) null, new C5248f(str2, this.f11350b), 6);
                            this.f11351c.f11190i.mo13286a(new FeedUpdatedEvent(new ArrayList(), this.f11350b, false, DateTimeUtils.m11302d()), FeedUpdatedEvent.class);
                        }
                        this.f11351c.mo15500p().mo14019l().mo13846e();
                        C4174s3 s3Var2 = this.f11351c.f11185d;
                        if (s3Var2 != null) {
                            s3Var2.mo14056a(this.f11350b);
                            C4297y2 p = this.f11351c.mo15500p();
                            Braze braze = this.f11351c;
                            Context context = braze.f11183b;
                            C4174s3 s3Var3 = braze.f11185d;
                            if (s3Var3 != null) {
                                BrazeConfigurationProvider l = braze.mo15497l();
                                Braze braze2 = this.f11351c;
                                C4311z0 z0Var = braze2.f11190i;
                                C3602c2 c2Var = braze2.f11189h;
                                if (c2Var != null) {
                                    C3777i2 i2Var = braze2.f11191j;
                                    if (i2Var != null) {
                                        boolean z2 = Braze.f11177t;
                                        boolean z3 = Braze.f11178u;
                                        C4281x5 x5Var = braze2.f11184c;
                                        if (x5Var != null) {
                                            Braze.m10641g(this.f11351c, new C4143r6(context, s3Var3, l, z0Var, c2Var, i2Var, z2, z3, x5Var));
                                            String str5 = this.f11352d;
                                            if (str5 != null && !C19457k.m33020X0(str5)) {
                                                z = false;
                                            }
                                            if (!z) {
                                                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11351c, (BrazeLogger.Priority) null, (Throwable) null, new C5249g(this.f11352d), 7);
                                                this.f11351c.mo15500p().mo14021n().mo14135a(this.f11352d);
                                            }
                                            this.f11351c.mo15500p().mo14009b().mo13938h();
                                            this.f11351c.mo15500p().mo14019l().mo13845d();
                                            this.f11351c.mo15500p().mo14019l().mo13832a(new C4276x3.C4277a((String) null, (Boolean) null, (Boolean) null, (C4259w3) null, 15, (DefaultConstructorMarker) null).mo14171b());
                                            this.f11351c.mo15509y(false);
                                            p.mo14007a();
                                            return;
                                        }
                                        C19383o.m32805o("testUserDeviceLoggingManager");
                                        throw null;
                                    }
                                    C19383o.m32805o("registrationDataProvider");
                                    throw null;
                                }
                                C19383o.m32805o("deviceIdReader");
                                throw null;
                            }
                            C19383o.m32805o("offlineUserStorageProvider");
                            throw null;
                        }
                        C19383o.m32805o("offlineUserStorageProvider");
                        throw null;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        reentrantLock.unlock();
                        throw th2;
                    }
                } else {
                    C19383o.m32805o("brazeUser");
                    throw null;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15638a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$o0 */
    final class C5250o0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11361b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11362c;

        /* renamed from: com.braze.Braze$o0$a */
        public static final class C5251a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5251a f11363b = new C5251a();

            public C5251a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Card ID cannot be null or blank.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5250o0(String str, Braze braze) {
            super(0);
            this.f11361b = str;
            this.f11362c = braze;
        }

        /* renamed from: a */
        public final void mo15646a() {
            String str = this.f11361b;
            if (str == null || C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11362c, BrazeLogger.Priority.W, (Throwable) null, C5251a.f11363b, 6);
                return;
            }
            C4208t1 e = C3787j.f8608h.mo13481e(this.f11361b);
            if (e != null) {
                this.f11362c.mo15500p().mo14019l().mo13838a(e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15646a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$o1 */
    public static final class C5252o1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Braze f11364b;

        /* renamed from: c */
        public final /* synthetic */ String f11365c;

        /* renamed from: com.braze.Braze$o1$a */
        public static final class C5253a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11366b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5253a(String str) {
                super(0);
                this.f11366b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Push token ");
                h.append(this.f11366b);
                h.append(" registered and immediately being flushed.");
                return h.toString();
            }
        }

        /* renamed from: com.braze.Braze$o1$b */
        public static final class C5254b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5254b f11367b = new C5254b();

            public C5254b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Push token must not be null or blank. Not registering for push with Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5252o1(Braze braze, String str) {
            super(0);
            this.f11364b = braze;
            this.f11365c = str;
        }

        /* renamed from: a */
        public final void mo15648a() {
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, this.f11364b, BrazeLogger.Priority.I, (Throwable) null, new C5253a(this.f11365c), 6);
            String str = this.f11365c;
            if (str == null || C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(brazeLogger, this.f11364b, BrazeLogger.Priority.W, (Throwable) null, C5254b.f11367b, 6);
                return;
            }
            C3777i2 i2Var = this.f11364b.f11191j;
            if (i2Var != null) {
                i2Var.mo13440a(this.f11365c);
                this.f11364b.mo15510z();
                return;
            }
            C19383o.m32805o("registrationDataProvider");
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15648a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$o2 */
    final class C5255o2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11368b;

        /* renamed from: c */
        public final /* synthetic */ boolean f11369c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5255o2(String str, boolean z) {
            super(0);
            this.f11368b = str;
            this.f11369c = z;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to set Google Advertising ID data on device. Google Advertising ID: ");
            h.append(this.f11368b);
            h.append(" and limit-ad-tracking: ");
            h.append(this.f11369c);
            return h.toString();
        }
    }

    /* renamed from: com.braze.Braze$p */
    public static final class C5256p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5256p f11370b = new C5256p();

        public C5256p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to close session.";
        }
    }

    /* renamed from: com.braze.Braze$p0 */
    final class C5257p0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11371b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5257p0(String str) {
            super(0);
            this.f11371b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11371b, "Failed to log feed card impression. Card id: ");
        }
    }

    /* renamed from: com.braze.Braze$p1 */
    public static final class C5258p1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Class<T> f11372b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5258p1(Class<T> cls) {
            super(0);
            this.f11372b = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to remove ");
            h.append(this.f11372b.getName());
            h.append(" subscriber.");
            return h.toString();
        }
    }

    /* renamed from: com.braze.Braze$p2 */
    final class C5259p2 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11373b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11374c;

        /* renamed from: d */
        public final /* synthetic */ boolean f11375d;

        /* renamed from: com.braze.Braze$p2$a */
        public static final class C5260a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5260a f11376b = new C5260a();

            public C5260a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Google Advertising ID cannot be null or blank";
            }
        }

        /* renamed from: com.braze.Braze$p2$b */
        public static final class C5261b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11377b;

            /* renamed from: c */
            public final /* synthetic */ boolean f11378c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5261b(String str, boolean z) {
                super(0);
                this.f11377b = str;
                this.f11378c = z;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Setting Google Advertising ID: ");
                h.append(this.f11377b);
                h.append(" and limit-ad-tracking: ");
                h.append(this.f11378c);
                return h.toString();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5259p2(String str, Braze braze, boolean z) {
            super(0);
            this.f11373b = str;
            this.f11374c = braze;
            this.f11375d = z;
        }

        /* renamed from: a */
        public final void mo15655a() {
            if (C19457k.m33020X0(this.f11373b)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11374c, BrazeLogger.Priority.W, (Throwable) null, C5260a.f11376b, 6);
                return;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11374c, BrazeLogger.Priority.D, (Throwable) null, new C5261b(this.f11373b, this.f11375d), 6);
            this.f11374c.mo15500p().mo14023p().mo13134a(this.f11373b);
            this.f11374c.mo15500p().mo14023p().mo13135a(this.f11375d);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15655a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$q */
    public static final class C5262q extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Activity f11379b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11380c;

        /* renamed from: com.braze.Braze$q$a */
        public static final class C5263a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5263a f11381b = new C5263a();

            public C5263a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot close session with null activity.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5262q(Activity activity, Braze braze) {
            super(0);
            this.f11379b = activity;
            this.f11380c = braze;
        }

        /* renamed from: a */
        public final void mo15658a() {
            if (this.f11379b == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11380c, BrazeLogger.Priority.W, (Throwable) null, C5263a.f11381b, 6);
            } else {
                this.f11380c.mo15500p().mo14019l().closeSession(this.f11379b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15658a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$q0 */
    final class C5264q0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11382b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11383c;

        /* renamed from: com.braze.Braze$q0$a */
        public static final class C5265a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5265a f11384b = new C5265a();

            public C5265a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Card ID cannot be null or blank.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5264q0(String str, Braze braze) {
            super(0);
            this.f11382b = str;
            this.f11383c = braze;
        }

        /* renamed from: a */
        public final void mo15660a() {
            String str = this.f11382b;
            if (str == null || C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11383c, BrazeLogger.Priority.W, (Throwable) null, C5265a.f11384b, 6);
                return;
            }
            C4208t1 f = C3787j.f8608h.mo13483f(this.f11382b);
            if (f != null) {
                this.f11383c.mo15500p().mo14019l().mo13838a(f);
            }
            this.f11383c.mo15500p().mo14013f().markCardAsViewed(this.f11382b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15660a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$q1 */
    public static final class C5266q1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ boolean f11385b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5266q1(boolean z) {
            super(0);
            this.f11385b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Boolean.valueOf(this.f11385b), "Failed to request Content Cards refresh. Requesting from cache: ");
        }
    }

    /* renamed from: com.braze.Braze$q2 */
    final class C5267q2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11386b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5267q2(String str) {
            super(0);
            this.f11386b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11386b, "Failed to set SDK authentication signature on device.\n");
        }
    }

    /* renamed from: com.braze.Braze$r */
    final class C5268r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5268r f11387b = new C5268r();

        public C5268r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    /* renamed from: com.braze.Braze$r0 */
    public static final class C5269r0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5269r0 f11388b = new C5269r0();

        public C5269r0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log that the feed was displayed.";
        }
    }

    /* renamed from: com.braze.Braze$r1 */
    public static final class C5270r1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ boolean f11389b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11390c;

        /* renamed from: com.braze.Braze$r1$a */
        public static final class C5271a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5271a f11391b = new C5271a();

            public C5271a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Content Cards is not enabled, skipping API call to refresh";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5270r1(boolean z, Braze braze) {
            super(0);
            this.f11389b = z;
            this.f11390c = braze;
        }

        /* renamed from: a */
        public final void mo15666a() {
            if (this.f11389b) {
                Braze braze = this.f11390c;
                braze.f11190i.mo13286a(braze.mo15500p().mo14016i().getCachedCardsAsEvent(), C8433c.class);
            } else if (this.f11390c.mo15500p().mo14011d().mo13091l()) {
                C4274x1.m9763a(this.f11390c.mo15500p().mo14019l(), this.f11390c.mo15500p().mo14016i().mo13033e(), this.f11390c.mo15500p().mo14016i().mo13035f(), 0, 4, (Object) null);
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11390c, (BrazeLogger.Priority) null, (Throwable) null, C5271a.f11391b, 7);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15666a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$r2 */
    final class C5272r2 extends Lambda implements C19846a<C19394m> {

        /* renamed from: c */
        public final /* synthetic */ String f11393c;

        /* renamed from: com.braze.Braze$r2$a */
        public static final class C5273a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11394b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5273a(String str) {
                super(0);
                this.f11394b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f11394b, "Got new sdk auth signature ");
            }
        }

        /* renamed from: com.braze.Braze$r2$b */
        public static final class C5274b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5274b f11395b = new C5274b();

            public C5274b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "SDK authentication signature cannot be null or blank";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5272r2(String str) {
            super(0);
            this.f11393c = str;
        }

        /* renamed from: a */
        public final void mo15668a() {
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, Braze.this, BrazeLogger.Priority.V, (Throwable) null, new C5273a(this.f11393c), 6);
            if (C19457k.m33020X0(this.f11393c)) {
                BrazeLogger.m11282d(brazeLogger, Braze.this, BrazeLogger.Priority.W, (Throwable) null, C5274b.f11395b, 6);
                return;
            }
            Braze.this.mo15500p().mo14021n().mo14135a(this.f11393c);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15668a();
            return C19394m.f43287a;
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$currentUser$2", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$s */
    final class C5275s extends SuspendLambda implements C19861p<C19525d0, C19340c<? super BrazeUser>, Object> {

        /* renamed from: b */
        public int f11396b;

        public C5275s(C19340c<? super C5275s> cVar) {
            super(2, cVar);
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super BrazeUser> cVar) {
            return ((C5275s) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5275s(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11396b == 0) {
                C0761x.m1684O0(obj);
                BrazeUser brazeUser = Braze.this.f11186e;
                if (brazeUser != null) {
                    return brazeUser;
                }
                C19383o.m32805o("brazeUser");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.Braze$s0 */
    public static final class C5276s0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Braze f11398b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5276s0(Braze braze) {
            super(0);
            this.f11398b = braze;
        }

        /* renamed from: a */
        public final void mo15672a() {
            C4208t1 a = C3787j.f8608h.mo13458a();
            if (a != null) {
                this.f11398b.mo15500p().mo14019l().mo13838a(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15672a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$s1 */
    public static final class C5277s1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5277s1 f11399b = new C5277s1();

        public C5277s1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request refresh of feed.";
        }
    }

    /* renamed from: com.braze.Braze$s2 */
    final class C5278s2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ boolean f11400b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5278s2(boolean z) {
            super(0);
            this.f11400b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Boolean.valueOf(this.f11400b), "Failed to set sync policy offline to ");
        }
    }

    /* renamed from: com.braze.Braze$t */
    final class C5279t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5279t f11401b = new C5279t();

        public C5279t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot deserialize null content card json string. Returning null.";
        }
    }

    /* renamed from: com.braze.Braze$t0 */
    final class C5280t0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5280t0 f11402b = new C5280t0();

        public C5280t0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    /* renamed from: com.braze.Braze$t1 */
    public static final class C5281t1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Braze f11403b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5281t1(Braze braze) {
            super(0);
            this.f11403b = braze;
        }

        /* renamed from: a */
        public final void mo15677a() {
            this.f11403b.mo15500p().mo14019l().mo13832a(new C4276x3.C4277a((String) null, (Boolean) null, (Boolean) null, (C4259w3) null, 15, (DefaultConstructorMarker) null).mo14171b());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15677a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$t2 */
    final class C5282t2 extends Lambda implements C19846a<C19394m> {

        /* renamed from: c */
        public final /* synthetic */ boolean f11405c;

        /* renamed from: com.braze.Braze$t2$a */
        public static final class C5283a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ boolean f11406b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5283a(boolean z) {
                super(0);
                this.f11406b = z;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(Boolean.valueOf(this.f11406b), "Setting the image loader deny network downloads to ");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5282t2(boolean z) {
            super(0);
            this.f11405c = z;
        }

        /* renamed from: a */
        public final void mo15678a() {
            Braze.this.mo15500p().mo14019l().mo13842b(this.f11405c);
            Braze.this.mo15500p().mo14010c().mo13345a(this.f11405c);
            Braze braze = Braze.this;
            if (braze.f11182a != null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, braze, (BrazeLogger.Priority) null, (Throwable) null, new C5283a(this.f11405c), 7);
                ((DefaultBrazeImageLoader) Braze.this.mo15499n()).mo15926g(this.f11405c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15678a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$u */
    final class C5284u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11407b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5284u(String str) {
            super(0);
            this.f11407b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11407b, "Failed to deserialize content card json string. Payload: ");
        }
    }

    /* renamed from: com.braze.Braze$u0 */
    final class C5285u0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4257w1 f11408b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11409c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5285u0(C4257w1 w1Var, Braze braze) {
            super(0);
            this.f11408b = w1Var;
            this.f11409c = braze;
        }

        /* renamed from: a */
        public final void mo15681a() {
            C4208t1 a = C3787j.f8608h.mo13461a(this.f11408b);
            if (a != null) {
                this.f11409c.mo15500p().mo14019l().mo13838a(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15681a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$u1 */
    public static final class C5286u1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5286u1 f11410b = new C5286u1();

        public C5286u1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve and publish feed from offline cache.";
        }
    }

    /* renamed from: com.braze.Braze$u2 */
    public static final class C5287u2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5287u2 f11411b = new C5287u2();

        public C5287u2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for Content Cards updates.";
        }
    }

    /* renamed from: com.braze.Braze$v */
    final class C5288v extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f11412b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5288v(JSONObject jSONObject) {
            super(0);
            this.f11412b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11412b, "Failed to deserialize content card json. Payload: ");
        }
    }

    /* renamed from: com.braze.Braze$v0 */
    public static final class C5289v0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11413b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5289v0(String str) {
            super(0);
            this.f11413b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11413b, "Failed to log purchase event of: ");
        }
    }

    /* renamed from: com.braze.Braze$v1 */
    public static final class C5290v1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ Braze f11414b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5290v1(Braze braze) {
            super(0);
            this.f11414b = braze;
        }

        /* renamed from: a */
        public final void mo15686a() {
            Braze braze = this.f11414b;
            braze.f11190i.mo13286a(braze.mo15500p().mo14013f().getCachedCardsAsEvent(), FeedUpdatedEvent.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15686a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$v2 */
    public static final class C5291v2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5291v2 f11415b = new C5291v2();

        public C5291v2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for feed updates.";
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$deserializeContentCard$4", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$w */
    final class C5292w extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Card>, Object> {

        /* renamed from: b */
        public int f11416b;

        /* renamed from: c */
        private /* synthetic */ Object f11417c;

        /* renamed from: d */
        public final /* synthetic */ JSONObject f11418d;

        /* renamed from: e */
        public final /* synthetic */ Braze f11419e;

        /* renamed from: com.braze.Braze$w$a */
        public static final class C5293a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5293a f11420b = new C5293a();

            public C5293a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot deserialize null content card json. Returning null.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5292w(JSONObject jSONObject, Braze braze, C19340c<? super C5292w> cVar) {
            super(2, cVar);
            this.f11418d = jSONObject;
            this.f11419e = braze;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super Card> cVar) {
            return ((C5292w) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C5292w wVar = new C5292w(this.f11418d, this.f11419e, cVar);
            wVar.f11417c = obj;
            return wVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11416b == 0) {
                C0761x.m1684O0(obj);
                C19525d0 d0Var = (C19525d0) this.f11417c;
                if (this.f11418d != null) {
                    return this.f11419e.mo15500p().mo14016i().mo13016a(this.f11418d);
                }
                BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var, BrazeLogger.Priority.W, (Throwable) null, C5293a.f11420b, 6);
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.Braze$w0 */
    public static final class C5294w0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11421b;

        /* renamed from: c */
        public final /* synthetic */ String f11422c;

        /* renamed from: d */
        public final /* synthetic */ BigDecimal f11423d;

        /* renamed from: e */
        public final /* synthetic */ int f11424e;

        /* renamed from: f */
        public final /* synthetic */ Braze f11425f;

        /* renamed from: g */
        public final /* synthetic */ BrazeProperties f11426g;

        /* renamed from: com.braze.Braze$w0$a */
        public static final class C5295a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5295a f11427b = new C5295a();

            public C5295a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* renamed from: com.braze.Braze$w0$b */
        public static final class C5296b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5296b f11428b = new C5296b();

            public C5296b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Purchase logged with invalid properties. Not logging custom event to Braze.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5294w0(String str, String str2, BigDecimal bigDecimal, int i, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.f11421b = str;
            this.f11422c = str2;
            this.f11423d = bigDecimal;
            this.f11424e = i;
            this.f11425f = braze;
            this.f11426g = brazeProperties;
        }

        /* renamed from: a */
        public final void mo15690a() {
            String str = this.f11421b;
            if (!ValidationUtils.m11349d(str, this.f11422c, this.f11423d, this.f11424e, this.f11425f.mo15500p().mo14011d())) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11425f, BrazeLogger.Priority.W, (Throwable) null, C5295a.f11427b, 6);
                return;
            }
            BrazeProperties brazeProperties = this.f11426g;
            boolean z = false;
            if (brazeProperties != null) {
                String jSONObject = brazeProperties.f11850b.toString();
                C19383o.m32796f(jSONObject, "propertiesJSONObject.toString()");
                if (StringUtils.m11340a(jSONObject) > Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES) {
                    z = true;
                }
            }
            if (z) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11425f, BrazeLogger.Priority.W, (Throwable) null, C5296b.f11428b, 6);
                return;
            }
            String a = ValidationUtils.m11346a(str);
            C3787j.C3788a aVar = C3787j.f8608h;
            String str2 = this.f11422c;
            C19383o.m32794d(str2);
            BigDecimal bigDecimal = this.f11423d;
            C19383o.m32794d(bigDecimal);
            C4208t1 a2 = aVar.mo13470a(a, str2, bigDecimal, this.f11424e, this.f11426g);
            if (a2 != null && this.f11425f.mo15500p().mo14019l().mo13838a(a2)) {
                this.f11425f.mo15500p().mo14018k().mo13388a((C4173s2) new C3604c4(a, this.f11426g, a2));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15690a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$w1 */
    final class C5297w1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5297w1 f11429b = new C5297w1();

        public C5297w1() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request geofence refresh.";
        }
    }

    /* renamed from: com.braze.Braze$w2 */
    final class C5298w2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5298w2 f11430b = new C5298w2();

        public C5298w2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for network failures.";
        }
    }

    /* renamed from: com.braze.Braze$x */
    final class C5299x extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11431b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5299x(String str) {
            super(0);
            this.f11431b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11431b, "Failed to deserialize in-app message json. Payload: ");
        }
    }

    /* renamed from: com.braze.Braze$x0 */
    public static final class C5300x0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5300x0 f11432b = new C5300x0();

        public C5300x0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log push notification action clicked.";
        }
    }

    /* renamed from: com.braze.Braze$x1 */
    final class C5301x1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4257w1 f11433b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11434c;

        /* renamed from: com.braze.Braze$x1$a */
        public static final class C5302a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5302a f11435b = new C5302a();

            public C5302a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Cannot request Geofence refresh with null location.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5301x1(C4257w1 w1Var, Braze braze) {
            super(0);
            this.f11433b = w1Var;
            this.f11434c = braze;
        }

        /* renamed from: a */
        public final void mo15697a() {
            if (this.f11433b == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11434c, (BrazeLogger.Priority) null, (Throwable) null, C5302a.f11435b, 7);
            } else {
                this.f11434c.mo15500p().mo14015h().mo13596a(this.f11433b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15697a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$x2 */
    public static final class C5303x2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5303x2 f11436b = new C5303x2();

        public C5303x2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber to new in-app messages.";
        }
    }

    @C19060c(mo70540c = "com.braze.Braze$deserializeInAppMessageString$2", mo70541f = "Braze.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.Braze$y */
    final class C5304y extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C5483a>, Object> {

        /* renamed from: b */
        public int f11437b;

        /* renamed from: c */
        public final /* synthetic */ String f11438c;

        /* renamed from: d */
        public final /* synthetic */ Braze f11439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5304y(String str, Braze braze, C19340c<? super C5304y> cVar) {
            super(2, cVar);
            this.f11438c = str;
            this.f11439d = braze;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C5483a> cVar) {
            return ((C5304y) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C5304y(this.f11438c, this.f11439d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f11437b == 0) {
                C0761x.m1684O0(obj);
                String str = this.f11438c;
                if (str == null) {
                    return null;
                }
                return C3582b3.m8481a(str, this.f11439d.mo15500p().mo14019l());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.braze.Braze$y0 */
    public static final class C5305y0 extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ String f11440b;

        /* renamed from: c */
        public final /* synthetic */ Braze f11441c;

        /* renamed from: d */
        public final /* synthetic */ String f11442d;

        /* renamed from: e */
        public final /* synthetic */ String f11443e;

        /* renamed from: com.braze.Braze$y0$a */
        public static final class C5306a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5306a f11444b = new C5306a();

            public C5306a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
            }
        }

        /* renamed from: com.braze.Braze$y0$b */
        public static final class C5307b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5307b f11445b = new C5307b();

            public C5307b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Action ID cannot be null or blank.";
            }
        }

        /* renamed from: com.braze.Braze$y0$c */
        public static final class C5308c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C5308c f11446b = new C5308c();

            public C5308c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Action Type cannot be null or blank.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5305y0(String str, Braze braze, String str2, String str3) {
            super(0);
            this.f11440b = str;
            this.f11441c = braze;
            this.f11442d = str2;
            this.f11443e = str3;
        }

        /* renamed from: a */
        public final void mo15701a() {
            String str = this.f11440b;
            boolean z = false;
            if (str == null || C19457k.m33020X0(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11441c, BrazeLogger.Priority.W, (Throwable) null, C5306a.f11444b, 6);
                return;
            }
            String str2 = this.f11442d;
            if (str2 == null || C19457k.m33020X0(str2)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11441c, BrazeLogger.Priority.W, (Throwable) null, C5307b.f11445b, 6);
                return;
            }
            String str3 = this.f11443e;
            if (str3 == null || C19457k.m33020X0(str3)) {
                z = true;
            }
            if (z) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this.f11441c, BrazeLogger.Priority.W, (Throwable) null, C5308c.f11446b, 6);
            } else {
                this.f11441c.mo15500p().mo14019l().mo13838a(C3649e4.f8376k.mo13257a(this.f11440b, this.f11442d, this.f11443e));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15701a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$y1 */
    final class C5309y1 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ boolean f11447b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5309y1(boolean z) {
            super(0);
            this.f11447b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Boolean.valueOf(this.f11447b), "Failed to request geofence refresh with rate limit ignore: ");
        }
    }

    /* renamed from: com.braze.Braze$y2 */
    final class C5310y2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5310y2 f11448b = new C5310y2();

        public C5310y2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for push notification updates.";
        }
    }

    /* renamed from: com.braze.Braze$z */
    final class C5311z extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5311z f11449b = new C5311z();

        public C5311z() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the device id.";
        }
    }

    /* renamed from: com.braze.Braze$z0 */
    final class C5312z0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11450b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5312z0(String str) {
            super(0);
            this.f11450b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to log push open for '");
            h.append(this.f11450b);
            h.append('\'');
            return h.toString();
        }
    }

    /* renamed from: com.braze.Braze$z1 */
    final class C5313z1 extends Lambda implements C19846a<C19394m> {

        /* renamed from: c */
        public final /* synthetic */ boolean f11452c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5313z1(boolean z) {
            super(0);
            this.f11452c = z;
        }

        /* renamed from: a */
        public final void mo15709a() {
            Braze.this.mo15500p().mo14015h().mo13606b(this.f11452c);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo15709a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: com.braze.Braze$z2 */
    final class C5314z2 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5314z2 f11453b = new C5314z2();

        public C5314z2() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for SDK authentication failures.";
        }
    }

    public Braze(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        long nanoTime = System.nanoTime();
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C5153a.f11223b, 7);
        Context applicationContext = context.getApplicationContext();
        C19383o.m32796f(applicationContext, "context.applicationContext");
        this.f11183b = applicationContext;
        String str = Build.MODEL;
        if (str != null) {
            Set<String> set = f11172o;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (set.contains(lowerCase)) {
                BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C5159b(str), 6);
                Companion companion = f11170m;
                if (f11174q == null) {
                    ReentrantLock reentrantLock = f11171n;
                    reentrantLock.lock();
                    try {
                        if (f11174q != null) {
                            C19394m mVar = C19394m.f43287a;
                            reentrantLock.unlock();
                        } else if (f11177t) {
                            BrazeLogger.m11282d(brazeLogger, companion, priority, (Throwable) null, Companion.C5134h.f11204b, 6);
                        } else {
                            BrazeLogger.m11282d(brazeLogger, companion, priority, (Throwable) null, Companion.C5135i.f11205b, 6);
                            f11177t = true;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                BrazeLogger.m11282d(brazeLogger, companion, BrazeLogger.Priority.W, (Throwable) null, Companion.C5136j.f11206b, 6);
            }
        }
        this.f11182a = new DefaultBrazeImageLoader(this.f11183b);
        this.f11190i = new C4311z0(Companion.m10672g(this.f11183b));
        mo15485B(C5166c.f11242b, new C5174d(this, context), false);
        BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C5188e(System.nanoTime(), nanoTime), 7);
    }

    /* renamed from: g */
    public static final void m10641g(Braze braze, C4143r6 r6Var) {
        braze.getClass();
        braze.f11193l = r6Var;
        C3730h3.f8514a.mo13381a(braze.mo15500p().mo14017j());
        C4107q6 b = braze.mo15500p().mo14009b();
        C4274x1 l = braze.mo15500p().mo14019l();
        C4174s3 s3Var = braze.f11185d;
        if (s3Var != null) {
            braze.f11186e = new BrazeUser(b, l, s3Var.mo14055a(), braze.mo15500p().mo14014g(), braze.mo15500p().mo14011d());
            braze.mo15500p().mo14022o().mo14189a((C3666f2) braze.mo15500p().mo14017j());
            braze.mo15500p().mo14020m().mo13271d();
            braze.mo15500p().mo14012e().mo13125a((C3620d2) braze.mo15500p().mo14020m());
            C4281x5 x5Var = braze.f11184c;
            if (x5Var != null) {
                x5Var.mo14178a(braze.mo15500p().mo14019l());
                C4281x5 x5Var2 = braze.f11184c;
                if (x5Var2 != null) {
                    x5Var2.mo14181a(braze.mo15500p().mo14011d().mo13095p());
                } else {
                    C19383o.m32805o("testUserDeviceLoggingManager");
                    throw null;
                }
            } else {
                C19383o.m32805o("testUserDeviceLoggingManager");
                throw null;
            }
        } else {
            C19383o.m32805o("offlineUserStorageProvider");
            throw null;
        }
    }

    /* renamed from: h */
    public static final void m10642h(Braze braze) {
        braze.getClass();
        boolean z = false;
        boolean z2 = true;
        for (String next : f11173p) {
            if (!PermissionUtils.m11331a(braze.f11183b, next)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, braze, BrazeLogger.Priority.W, (Throwable) null, new C5165b3(next), 6);
                z2 = false;
            }
        }
        if (C19457k.m33020X0(braze.mo15497l().getBrazeApiKey().toString())) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, braze, BrazeLogger.Priority.W, (Throwable) null, C5173c3.f11250b, 6);
        } else {
            z = z2;
        }
        if (!z) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, braze, BrazeLogger.Priority.W, (Throwable) null, C5187d3.f11266b, 6);
        }
    }

    /* renamed from: o */
    public static final Braze m10643o(Context context) {
        return f11170m.mo15515f(context);
    }

    /* renamed from: A */
    public final void mo15484A() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5207g2.f11299b, 7);
        mo15485B(C5172c2.f11249b, new C5186d2(), true);
        mo15485B(C5212h2.f11304b, new C5216i2(), true);
    }

    /* renamed from: B */
    public final /* synthetic */ void mo15485B(C19846a aVar, C19846a aVar2, boolean z) {
        if (!z || !f11170m.mo15516h()) {
            try {
                C19697g.m33468f(C3730h3.f8514a, (CoroutineContext) null, (CoroutineStart) null, new C5228l2(aVar2, (C19340c<? super C5228l2>) null), 3);
            } catch (Exception e) {
                if (aVar == null) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, e, C5235m2.f11339b, 5);
                } else {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, aVar, 4);
                }
                mo15508x(e);
            }
        }
    }

    /* renamed from: C */
    public final void mo15486C(C8434d<C8433c> dVar) {
        try {
            this.f11190i.mo13289c(dVar, C8433c.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C5287u2.f11411b, 4);
            mo15508x(e);
        }
    }

    /* renamed from: D */
    public final void mo15487D(C8434d<C8436f> dVar) {
        C19383o.m32797g(dVar, "subscriber");
        try {
            this.f11190i.mo13289c(dVar, C8436f.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C5303x2.f11436b, 4);
            mo15508x(e);
        }
    }

    /* renamed from: a */
    public final void mo15488a(C8434d<FeedUpdatedEvent> dVar) {
        C19383o.m32797g(dVar, "subscriber");
        try {
            this.f11190i.mo13289c(dVar, FeedUpdatedEvent.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C5291v2.f11415b, 4);
            mo15508x(e);
        }
    }

    /* renamed from: b */
    public final void mo15489b() {
        mo15485B(C5286u1.f11410b, new C5290v1(this), true);
    }

    /* renamed from: c */
    public final void mo15490c(String str) {
        mo15485B(new C5238n1(str), new C5252o1(this, str), true);
    }

    /* renamed from: d */
    public final <T> void mo15491d(C8434d<T> dVar, Class<T> cls) {
        if (dVar != null) {
            try {
                this.f11190i.mo13288b(dVar, cls);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5258p1(cls), 4);
                mo15508x(e);
            }
        }
    }

    /* renamed from: e */
    public final void mo15492e(String str) {
        mo15485B(new C5236n(str), new C5242o(str, this, (String) null), true);
    }

    /* renamed from: f */
    public final void mo15493f() {
        mo15485B(C5277s1.f11399b, new C5281t1(this), true);
    }

    /* renamed from: i */
    public final void mo15494i(C8434d dVar) {
        Class<C8437g> cls = C8437g.class;
        C19383o.m32797g(dVar, "subscriber");
        try {
            this.f11190i.mo13287a(dVar, cls);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, new C5209h(cls), 4);
            mo15508x(e);
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo15495j() {
        ReentrantLock reentrantLock = f11171n;
        reentrantLock.lock();
        try {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C5213i.f11305b, 7);
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(this.f11183b);
            Iterator it = f11180w.iterator();
            while (it.hasNext()) {
                C5410a aVar = (C5410a) it.next();
                if (C19383o.m32792b(aVar, f11181x)) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C5217j.f11310b, 6);
                    runtimeAppConfigurationProvider.mo15894a();
                } else {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C5221k(aVar), 6);
                    runtimeAppConfigurationProvider.mo15898e(aVar);
                }
            }
            f11180w.clear();
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: k */
    public final void mo15496k(Activity activity) {
        mo15485B(C5256p.f11370b, new C5262q(activity, this), true);
    }

    /* renamed from: l */
    public final BrazeConfigurationProvider mo15497l() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.f11192k;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        C19383o.m32805o("configurationProvider");
        throw null;
    }

    /* renamed from: m */
    public final void mo15498m(C8435e<BrazeUser> eVar) {
        if (f11170m.mo15516h()) {
            eVar.mo16189a();
            return;
        }
        try {
            C19697g.m33468f(C3730h3.f8514a, (CoroutineContext) null, (CoroutineStart) null, new C5195f0(eVar, this, (C19340c<? super C5195f0>) null), 3);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C5204g0.f11295b, 4);
            eVar.mo16189a();
            mo15508x(e);
        }
    }

    /* renamed from: n */
    public final C5442a mo15499n() {
        C5442a aVar = this.f11182a;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("imageLoader");
        throw null;
    }

    /* renamed from: p */
    public final C4297y2 mo15500p() {
        C4297y2 y2Var = this.f11193l;
        if (y2Var != null) {
            return y2Var;
        }
        C19383o.m32805o("udm");
        throw null;
    }

    /* renamed from: q */
    public final void mo15501q(String str, BrazeProperties brazeProperties) {
        mo15485B(new C5226l0(str), new C5231m0(str, this, brazeProperties == null ? null : brazeProperties.mo16039e()), true);
    }

    /* renamed from: r */
    public final void mo15502r() {
        mo15485B(C5269r0.f11388b, new C5276s0(this), true);
    }

    /* renamed from: s */
    public final void mo15503s(String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties) {
        mo15485B(new C5289v0(str), new C5294w0(str, str2, bigDecimal, i, this, brazeProperties == null ? null : brazeProperties.mo16039e()), true);
    }

    /* renamed from: t */
    public final void mo15504t(String str, String str2, String str3) {
        mo15485B(C5300x0.f11432b, new C5305y0(str, this, str2, str3), true);
    }

    /* renamed from: u */
    public final void mo15505u(Intent intent) {
        mo15485B(new C5161b1(intent), new C5168c1(intent, this), true);
    }

    /* renamed from: v */
    public final void mo15506v(String str, String str2) {
        mo15485B(new C5185d1(str2, str), new C5190e1(str, str2, this), true);
    }

    /* renamed from: w */
    public final void mo15507w(Activity activity) {
        mo15485B(C5197f1.f11284b, new C5205g1(activity, this), true);
    }

    /* renamed from: x */
    public final void mo15508x(Exception exc) {
        if (this.f11193l == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, exc, C5211h1.f11303b, 4);
            return;
        }
        try {
            mo15500p().mo14017j().mo13286a(exc, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C5215i1(exc), 4);
        }
    }

    /* renamed from: y */
    public final void mo15509y(boolean z) {
        mo15485B(new C5266q1(z), new C5270r1(z, this), true);
    }

    /* renamed from: z */
    public final void mo15510z() {
        mo15485B(C5192e2.f11274b, new C5198f2(this), true);
    }
}
