package p568fn;

import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.core.C0432j;
import androidx.compose.animation.core.C0439m0;
import androidx.compose.foundation.layout.C0707a;
import androidx.compose.material.C1180e0;
import androidx.compose.material.C1259v;
import androidx.compose.material.ColorsKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.colorspace.C1512i;
import androidx.compose.p015ui.layout.C1679f;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.work.C3436p;
import com.appboy.Constants;
import com.bugsnag.android.C5816o1;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingVideo;
import com.etsy.android.lib.models.apiv3.listing.VideoSize;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.bottom.C10680b;
import com.etsy.android.p327ui.navigation.bottom.C10682d;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.OrderTrackingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PurchasesKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.YouKey;
import com.etsy.android.uikit.viewholder.C12006r;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.assetpacks.C15657t2;
import com.google.android.play.core.internal.C15686c0;
import com.google.android.play.core.internal.C15689e;
import com.google.android.play.core.internal.C15705q;
import com.google.android.play.core.internal.zzt;
import dagger.android.C17550a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19394m;
import kotlin.TypeCastException;
import kotlin.collections.C19315h;
import kotlin.collections.C19318k;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19446a;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19497c;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.channels.C19510l;
import kotlinx.coroutines.channels.C19511m;
import kotlinx.coroutines.channels.C19517s;
import kotlinx.coroutines.flow.internal.C19640p;
import kotlinx.coroutines.internal.C19734r;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.ThreadContextKt;
import okhttp3.C19984j;
import okhttp3.C19997p;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0015b;
import p010a9.C0048b;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.ProtocolViolationException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p287xp.C8339g;
import p343ee.C12693a;
import p365hg.C12869i0;
import p400mf.C13074b;
import p453tf.C13418j;
import p513bj.C14049b0;
import p628nj.C18263b;
import p634np.C18290b;
import p736cq.C18981a;
import p746hq.C19067b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20057i;
import retrofit2.C20089b;
import retrofit2.C20092d;
import retrofit2.C20145v;

/* renamed from: fn.b */
public class C17782b implements C15686c0, C15705q, C5816o1, C8339g, C15689e, C20092d, C12693a, C18290b, C19984j {

    /* renamed from: b */
    public static C17782b f38631b;

    /* renamed from: c */
    public static final C1512i f38632c = new C1512i(0.31006f, 0.31616f);

    /* renamed from: d */
    public static final C1512i f38633d = new C1512i(0.34567f, 0.3585f);

    /* renamed from: e */
    public static final C1512i f38634e = new C1512i(0.32168f, 0.33767f);

    /* renamed from: f */
    public static final C1512i f38635f = new C1512i(0.31271f, 0.32902f);

    /* renamed from: g */
    public static final float[] f38636g = {0.964212f, 1.0f, 0.825188f};

    /* renamed from: h */
    public static final C17782b f38637h = new C17782b();

    /* renamed from: i */
    public static final String[] f38638i = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "firebase_campaign"};

    /* renamed from: j */
    public static final String[] f38639j = {"ad_impression"};

    /* renamed from: k */
    public static final String[] f38640k = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", Constants.APPBOY_PUSH_APPBOY_KEY, "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_cmp"};

    /* renamed from: l */
    public static final String[] f38641l = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: m */
    public static final /* synthetic */ C17782b f38642m = new C17782b();

    /* renamed from: n */
    public static final C19736t f38643n = new C19736t("EMPTY");

    /* renamed from: o */
    public static final C19736t f38644o = new C19736t("OFFER_SUCCESS");

    /* renamed from: p */
    public static final C19736t f38645p = new C19736t("OFFER_FAILED");

    /* renamed from: q */
    public static final C19736t f38646q = new C19736t("POLL_FAILED");

    /* renamed from: r */
    public static final C19736t f38647r = new C19736t("ENQUEUE_FAILED");

    /* renamed from: s */
    public static final C19736t f38648s = new C19736t("ON_CLOSE_HANDLER_INVOKED");

    /* renamed from: t */
    public static final int[] f38649t = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: u */
    public static final int[] f38650u = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* renamed from: v */
    public static final int[] f38651v = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    /* renamed from: w */
    public static final int[] f38652w = {-6803, -2, -1, -1, -1, -1, -1};

    /* renamed from: x */
    public static final int[] f38653x = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* renamed from: y */
    public static final int[] f38654y = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    /* renamed from: A */
    public static void m29830A(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) 6803) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[7]) & UnsignedInteger.INT_MASK;
        long j3 = (j * j2) + (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 0;
        int i = (int) j3;
        iArr3[0] = i;
        long j4 = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr3[1] = i2;
        long j6 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr3[2] = i3;
        int i4 = i2;
        long j8 = ((long) iArr[10]) & UnsignedInteger.INT_MASK;
        long j9 = j;
        long j10 = (j * j8) + j6 + (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        int i5 = (int) j10;
        iArr3[3] = i5;
        long j11 = ((long) iArr[11]) & UnsignedInteger.INT_MASK;
        long j12 = (j9 * j11) + j8 + (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (j10 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = ((long) iArr[12]) & UnsignedInteger.INT_MASK;
        long j14 = (j9 * j13) + j11 + (((long) iArr[5]) & UnsignedInteger.INT_MASK) + (j12 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = ((long) iArr[13]) & UnsignedInteger.INT_MASK;
        long j16 = (j9 * j15) + j13 + (((long) iArr[6]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + j15;
        long j18 = j17 & UnsignedInteger.INT_MASK;
        long j19 = (j9 * j18) + (((long) i) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j19;
        long j20 = j17 >>> 32;
        long j21 = (j9 * j20) + j18 + (((long) i4) & UnsignedInteger.INT_MASK) + (j19 >>> 32);
        iArr3[1] = (int) j21;
        long j22 = j20 + (((long) i3) & UnsignedInteger.INT_MASK) + (j21 >>> 32);
        iArr3[2] = (int) j22;
        long j23 = (j22 >>> 32) + (((long) i5) & UnsignedInteger.INT_MASK);
        iArr3[3] = (int) j23;
        if (((j23 >>> 32) == 0 ? 0 : C2606m.m6155u(7, iArr3, 4)) != 0 || (iArr3[6] == -1 && C2606m.m6122Q(iArr3, f38652w))) {
            C2606m.m6143i(7, 6803, iArr3);
        }
    }

    /* renamed from: A0 */
    public static void m29831A0(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = C19543e0.m33339v0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException(C0072d.m200g(26, "negative size: ", i2));
            } else {
                str = C19543e0.m33339v0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: B */
    public static void m29832B(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: B0 */
    public static void m29833B0(int i, Object[] objArr) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(C0072d.m200g(20, "at index ", i2));
            }
        }
    }

    /* renamed from: C */
    public static void m29834C(String str, String str2) {
        if (str != null) {
            m29832B(!TextUtils.isEmpty(str), str2);
            return;
        }
        throw new NullPointerException(str2);
    }

    /* renamed from: C0 */
    public static void m29835C0(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m29839E0(i, i2, "index"));
        }
    }

    /* renamed from: D */
    public static void m29836D(C17550a aVar, String str, Class cls) {
        if (aVar != null) {
            return;
        }
        if (!str.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            throw new NullPointerException(str.replace("%s", cls.getCanonicalName()));
        } else {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
    }

    /* renamed from: D0 */
    public static void m29837D0(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m29839E0(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m29839E0(i2, i3, "end index");
            } else {
                str = C19543e0.m33339v0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: E */
    public static void m29838E(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: E0 */
    public static String m29839E0(int i, int i2, String str) {
        if (i < 0) {
            return C19543e0.m33339v0("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C19543e0.m33339v0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(C0072d.m200g(26, "negative size: ", i2));
        }
    }

    /* renamed from: F */
    public static void m29840F(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: G */
    public static void m29841G(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: H */
    public static void m29842H(String str, String str2) {
        if (str2 != null) {
            m29834C(str2, str);
        }
    }

    /* renamed from: I */
    public static final void m29843I(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: J */
    public static final void m29844J(int i) {
        if (!new C20057i(2, 36).mo74327m(i)) {
            StringBuilder h = C0069a.m177h("radix ", i, " was not in valid range ");
            h.append(new C20057i(2, 36));
            throw new IllegalArgumentException(h.toString());
        }
    }

    /* renamed from: K */
    public static boolean m29845K(Double d) {
        return d.doubleValue() == 100.0d || new Random().nextDouble() * 100.0d <= d.doubleValue();
    }

    /* renamed from: L */
    public static C1180e0 m29846L(C1302d dVar) {
        C1302d dVar2 = dVar;
        dVar2.mo5465u(436017687);
        C1345l1 l1Var = ColorsKt.f2187a;
        long f = ((C1259v) dVar2.mo5410J(l1Var)).mo5359f();
        long C = C18263b.m30808C(C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), C19543e0.m33299P(dVar)), ((C1259v) dVar2.mo5410J(l1Var)).mo5363j());
        long f2 = ((C1259v) dVar2.mo5410J(l1Var)).mo5359f();
        long b = C1545s.m3356b(f2, 0.24f);
        long b2 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), 0.32f);
        long b3 = C1545s.m3356b(b2, 0.12f);
        long b4 = C1545s.m3356b(ColorsKt.m2174b(f2, dVar2), 0.54f);
        C1180e0 e0Var = new C1180e0(f, C, f2, b, b2, b3, b4, C1545s.m3356b(f2, 0.54f), C1545s.m3356b(b4, 0.12f), C1545s.m3356b(b3, 0.12f));
        dVar.mo5406H();
        return e0Var;
    }

    /* renamed from: M */
    public static Bundle m29847M(C13074b bVar) {
        C19383o.m32797g(bVar, "update");
        Bundle bundle = new Bundle();
        if (bVar instanceof C13074b.C13076b) {
            C13074b.C13076b bVar2 = (C13074b.C13076b) bVar;
            bundle.putString("id", String.valueOf(bVar2.f28749a));
            bundle.putBoolean(EtsyAction.STATE_FAVORITE, bVar2.f28750b);
        } else if (bVar instanceof C13074b.C13075a) {
            C13074b.C13075a aVar = (C13074b.C13075a) bVar;
            bundle.putString("id", String.valueOf(aVar.f28745a));
            bundle.putBoolean(EtsyAction.STATE_COLLECTIONS, aVar.f28746b);
        } else if (bVar instanceof C13074b.C13077c) {
            C13074b.C13077c cVar = (C13074b.C13077c) bVar;
            bundle.putString("id", String.valueOf(cVar.f28752a));
            bundle.putBoolean(EtsyAction.STATE_FAVORITE, cVar.f28753b);
        }
        return bundle;
    }

    /* renamed from: N */
    public static final long m29848N(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: O */
    public static String m29849O(String str) {
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str, C0391c.m1055a(str, 5)), ".", str, ",.", str);
        k.append(" *");
        return k.toString();
    }

    /* renamed from: P */
    public static void m29850P(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        m29898z(iArr3, iArr2);
    }

    /* renamed from: Q */
    public static void m29851Q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3436p.m8238L(iArr, iArr2, iArr3) != 0) {
            C2606m.m6117L(8, 977, iArr3);
        }
    }

    /* renamed from: R */
    public static void m29852R(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        C2606m.m6128W(iArr, iArr3);
        m29830A(iArr3, iArr2);
    }

    /* renamed from: S */
    public static void m29853S(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C2606m.m6131Z(iArr, iArr2, iArr3) != 0) {
            C2606m.m6117L(7, 6803, iArr3);
        }
    }

    /* renamed from: T */
    public static final void m29854T(String str) {
        File X = m29858X();
        if (X != null && str != null) {
            new File(X, str).delete();
        }
    }

    /* renamed from: U */
    public static final EmptyList m29855U() {
        return EmptyList.INSTANCE;
    }

    /* renamed from: V */
    public static final boolean m29856V(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: W */
    public static final C20057i m29857W(Collection collection) {
        C19383o.m32797g(collection, "<this>");
        return new C20057i(0, collection.size() - 1);
    }

    /* renamed from: X */
    public static final File m29858X() {
        File file = new File(C13418j.m21106b().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: Y */
    public static final int m29859Y(List list) {
        C19383o.m32797g(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: Z */
    public static final C19734r m29860Z(Object obj) {
        if (obj != C15588c1.f35093s) {
            return (C19734r) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: a0 */
    public static final C0432j m29861a0(C0439m0 m0Var, long j, C0432j jVar, C0432j jVar2, C0432j jVar3) {
        C19383o.m32797g(m0Var, "<this>");
        C19383o.m32797g(jVar, "start");
        C19383o.m32797g(jVar2, ResponseConstants.PROMOTION_END);
        C19383o.m32797g(jVar3, "startVelocity");
        return m0Var.mo3521g(j * 1000000, jVar, jVar2, jVar3);
    }

    /* renamed from: b0 */
    public static final boolean m29862b0(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                C19383o.m32796f(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                C19383o.m32796f(className, "element.className");
                if (C19457k.m33025c1(className, "com.facebook", false)) {
                    String className2 = stackTraceElement.getClassName();
                    C19383o.m32796f(className2, "element.className");
                    if (!C19457k.m33025c1(className2, "com.facebook.appevents.codeless", false)) {
                        String className3 = stackTraceElement.getClassName();
                        C19383o.m32796f(className3, "element.className");
                        if (!C19457k.m33025c1(className3, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C19383o.m32796f(methodName, "element.methodName");
                    if (!C19457k.m33025c1(methodName, "onClick", false)) {
                        String methodName2 = stackTraceElement.getMethodName();
                        C19383o.m32796f(methodName2, "element.methodName");
                        if (!C19457k.m33025c1(methodName2, "onItemClick", false)) {
                            String methodName3 = stackTraceElement.getMethodName();
                            C19383o.m32796f(methodName3, "element.methodName");
                            if (!C19457k.m33025c1(methodName3, "onTouch", false)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c0 */
    public static final boolean m29863c0(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: d0 */
    public static final List m29864d0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C19383o.m32796f(singletonList, "singletonList(element)");
        return singletonList;
    }

    /* renamed from: e0 */
    public static final List m29865e0(Object... objArr) {
        C19383o.m32797g(objArr, "elements");
        return objArr.length > 0 ? C19318k.m32599Q0(objArr) : EmptyList.INSTANCE;
    }

    /* renamed from: f0 */
    public static final ArrayList m29866f0(Object... objArr) {
        C19383o.m32797g(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C19315h(objArr, true));
    }

    /* renamed from: g0 */
    public static final List m29867g0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m29864d0(list.get(0)) : EmptyList.INSTANCE;
    }

    /* renamed from: h0 */
    public static C1436d m29868h0(C1679f fVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            f2 = Float.NaN;
        }
        C19383o.m32797g(fVar, "alignmentLine");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return new C0707a(fVar, f, f2);
    }

    /* renamed from: i0 */
    public static final void m29869i0(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(C0070b.m183e("fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(C0069a.m175f("fromIndex (", i2, ") is less than zero."));
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException(C0070b.m183e("toIndex (", i3, ") is greater than size (", i, ")."));
        }
    }

    /* renamed from: j0 */
    public static final JSONObject m29870j0(String str) {
        File X = m29858X();
        if (X == null || str == null) {
            return null;
        }
        try {
            return new JSONObject(C12869i0.m20557M(new FileInputStream(new File(X, str))));
        } catch (Exception unused) {
            m29854T(str);
            return null;
        }
    }

    /* renamed from: k0 */
    public static void m29871k0(Class cls) {
        String name = cls.getName();
        C18981a.m32123b(new ProtocolViolationException(C0048b.m164c("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    /* renamed from: l */
    public static AbstractChannel m29872l(int i, BufferOverflow bufferOverflow, int i2) {
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        int i3 = 1;
        if (i == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                C19499d.f43445e1.getClass();
                i3 = C19499d.C19500a.f43447b;
            }
            return new C19497c(i3, bufferOverflow, (C19857l) null);
        } else if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? (i == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) ? new C19510l((C19857l) null) : new C19497c(i, bufferOverflow, (C19857l) null) : new C19511m((C19857l) null) : bufferOverflow == BufferOverflow.SUSPEND ? new C19517s((C19857l) null) : new C19497c(1, bufferOverflow, (C19857l) null);
        } else {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                z = true;
            }
            if (z) {
                return new C19510l((C19857l) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    /* renamed from: l0 */
    public static final void m29873l0(String str, JSONArray jSONArray, GraphRequest.C12195b bVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                JSONObject o = C12869i0.m20576o();
                if (o != null) {
                    Iterator<String> keys = o.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, o.get(next));
                    }
                }
                GraphRequest.C12196c cVar = GraphRequest.f27224o;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C13418j.m21107c()}, 1));
                C19383o.m32796f(format, "java.lang.String.format(format, *args)");
                cVar.getClass();
                GraphRequest.C12196c.m20008h((AccessToken) null, format, jSONObject, bVar).mo39227d();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: m0 */
    public static void m29874m0(AtomicReference atomicReference, Disposable disposable, Class cls) {
        boolean z;
        if (disposable != null) {
            while (true) {
                z = false;
                if (!atomicReference.compareAndSet((Object) null, disposable)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                disposable.dispose();
                if (atomicReference.get() != DisposableHelper.DISPOSED) {
                    m29871k0(cls);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("next is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        if (r14 == 0) goto L_0x0041;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m29875n(int r14, int[] r15) {
        /*
            r0 = 8
            r1 = 977(0x3d1, float:1.369E-42)
            if (r14 == 0) goto L_0x0041
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r14
            long r6 = r6 & r4
            long r2 = r2 * r6
            r14 = 0
            r8 = r15[r14]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            r8 = 0
            long r2 = r2 + r8
            int r10 = (int) r2
            r15[r14] = r10
            r10 = 32
            long r2 = r2 >>> r10
            r11 = 1
            r12 = r15[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r6 = r6 + r12
            long r6 = r6 + r2
            int r2 = (int) r6
            r15[r11] = r2
            long r2 = r6 >>> r10
            r6 = 2
            r7 = r15[r6]
            long r11 = (long) r7
            long r4 = r4 & r11
            long r2 = r2 + r4
            int r4 = (int) r2
            r15[r6] = r4
            long r2 = r2 >>> r10
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r14 = 3
            int r14 = androidx.datastore.preferences.protobuf.C2606m.m6155u(r0, r15, r14)
        L_0x003f:
            if (r14 != 0) goto L_0x004f
        L_0x0041:
            r14 = 7
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0052
            int[] r14 = f38649t
            boolean r14 = androidx.work.C3436p.m8227A(r15, r14)
            if (r14 == 0) goto L_0x0052
        L_0x004f:
            androidx.datastore.preferences.protobuf.C2606m.m6143i(r0, r1, r15)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p568fn.C17782b.m29875n(int, int[]):void");
    }

    /* renamed from: n0 */
    public static final void m29876n0(View view, int i, C19846a aVar) {
        C19383o.m32798h(view, "$this$throwIfMissingAttrs");
        try {
            aVar.invoke();
        } catch (IllegalArgumentException e) {
            StringBuilder h = C0072d.m201h("This ");
            h.append(view.getClass().getSimpleName());
            h.append(" is missing an attribute. ");
            h.append("Add it to its style, or make the style inherit from ");
            h.append(view.getResources().getResourceName(i));
            h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            throw new IllegalArgumentException(h.toString(), e);
        }
    }

    /* renamed from: o0 */
    public static final void m29877o0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: p */
    public static void m29878p(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        while (true) {
            m29898z(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3436p.m8232F(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: p0 */
    public static final String m29879p0(char c, Locale locale) {
        C19383o.m32797g(locale, "locale");
        String valueOf = String.valueOf(c);
        C19383o.m32795e(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (upperCase.length() <= 1) {
            String valueOf2 = String.valueOf(c);
            C19383o.m32795e(valueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            C19383o.m32796f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !C19383o.m32792b(upperCase, upperCase2) ? upperCase : String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return upperCase;
        } else {
            char charAt = upperCase.charAt(0);
            String substring = upperCase.substring(1);
            C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m29880q(int r14, int[] r15) {
        /*
            r0 = 7
            r1 = 6803(0x1a93, float:9.533E-42)
            if (r14 == 0) goto L_0x0040
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r14
            long r6 = r6 & r4
            long r2 = r2 * r6
            r14 = 0
            r8 = r15[r14]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            r8 = 0
            long r2 = r2 + r8
            int r10 = (int) r2
            r15[r14] = r10
            r10 = 32
            long r2 = r2 >>> r10
            r11 = 1
            r12 = r15[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r6 = r6 + r12
            long r6 = r6 + r2
            int r2 = (int) r6
            r15[r11] = r2
            long r2 = r6 >>> r10
            r6 = 2
            r7 = r15[r6]
            long r11 = (long) r7
            long r4 = r4 & r11
            long r2 = r2 + r4
            int r4 = (int) r2
            r15[r6] = r4
            long r2 = r2 >>> r10
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            r14 = 3
            int r14 = androidx.datastore.preferences.protobuf.C2606m.m6155u(r0, r15, r14)
        L_0x003e:
            if (r14 != 0) goto L_0x004e
        L_0x0040:
            r14 = 6
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = f38652w
            boolean r14 = androidx.datastore.preferences.protobuf.C2606m.m6122Q(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            androidx.datastore.preferences.protobuf.C2606m.m6143i(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p568fn.C17782b.m29880q(int, int[]):void");
    }

    /* renamed from: q0 */
    public static String m29881q0(int i) {
        return C14049b0.m21640m("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }

    /* renamed from: r */
    public static void m29882r(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        C2606m.m6128W(iArr, iArr3);
        while (true) {
            m29830A(iArr3, iArr2);
            i--;
            if (i > 0) {
                C2606m.m6128W(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: r0 */
    public static final String m29883r0(byte b) {
        char[] cArr = C19421p.f43323m;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    /* renamed from: s */
    public static void m29884s(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* renamed from: s0 */
    public static final C12006r m29885s0(ListingVideo listingVideo) {
        List<VideoSize> listingCardSources;
        T t;
        String url;
        if (listingVideo.getThumbnailUrl() == null || (listingCardSources = listingVideo.getListingCardSources()) == null) {
            return null;
        }
        Iterator<T> it = listingCardSources.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C18263b.m30839d0(((VideoSize) t).getUrl())) {
                break;
            }
        }
        VideoSize videoSize = (VideoSize) t;
        if (videoSize == null || (url = videoSize.getUrl()) == null) {
            return null;
        }
        return new C12006r(url, listingVideo.getThumbnailUrl());
    }

    /* renamed from: t */
    public static final void m29886t(Throwable th, Throwable th2) {
        C19383o.m32797g(th, "<this>");
        C19383o.m32797g(th2, "exception");
        if (th != th2) {
            C19067b.f42563a.mo70554a(th, th2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t0 */
    public static final Object m29887t0(CoroutineContext coroutineContext, Object obj, Object obj2, C19861p pVar, C19340c cVar) {
        Object c = ThreadContextKt.m33530c(coroutineContext, obj2);
        try {
            C19640p pVar2 = new C19640p(cVar, coroutineContext);
            C19389t.m32910d(2, pVar);
            Object invoke = pVar.invoke(obj, pVar2);
            ThreadContextKt.m33528a(coroutineContext, c);
            if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                C19383o.m32797g(cVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            ThreadContextKt.m33528a(coroutineContext, c);
            throw th;
        }
    }

    /* renamed from: u */
    public static final ArrayList m29888u(Object... objArr) {
        C19383o.m32797g(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C19315h(objArr, true));
    }

    /* renamed from: u0 */
    public static final void m29889u0(String str, String str2) {
        File X = m29858X();
        if (X != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(X, str));
                byte[] bytes = str2.getBytes(C19446a.f43373b);
                C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: v */
    public static final boolean m29890v(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        C19383o.m32797g(bArr, Constants.APPBOY_PUSH_CONTENT_KEY);
        C19383o.m32797g(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v0 */
    public static byte m29891v0(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }

    /* renamed from: w */
    public static void m29892w(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        C3436p.m8230D(iArr, iArr2, iArr4);
        m29898z(iArr4, iArr3);
    }

    /* renamed from: w0 */
    public static int m29893w0(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: x */
    public static void m29894x(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        C2606m.m6120O(iArr, iArr2, iArr4);
        m29830A(iArr4, iArr3);
    }

    /* renamed from: x0 */
    public static Boolean m29895x0(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: y */
    public static int m29896y(ArrayList arrayList, Comparable comparable) {
        int i = 0;
        int size = arrayList.size();
        C19383o.m32797g(arrayList, "<this>");
        m29869i0(arrayList.size(), 0, size);
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int z = C18263b.m30880z((Comparable) arrayList.get(i3), comparable);
            if (z < 0) {
                i = i3 + 1;
            } else if (z <= 0) {
                return i3;
            } else {
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: y0 */
    public static String m29897y0(zzcf zzcf) {
        StringBuilder sb = new StringBuilder(zzcf.zzc());
        for (int i = 0; i < zzcf.zzc(); i++) {
            byte zza = zzcf.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zza >= 32 && zza <= 126) {
                            sb.append((char) zza);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: z */
    public static void m29898z(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) 977) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j3 = (j * j2) + (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 0;
        int i = (int) j3;
        iArr3[0] = i;
        long j4 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j5 = (j * j4) + j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr3[1] = i2;
        long j6 = ((long) iArr[10]) & UnsignedInteger.INT_MASK;
        long j7 = (j * j6) + j4 + (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr3[2] = i3;
        int i4 = i2;
        long j8 = ((long) iArr[11]) & UnsignedInteger.INT_MASK;
        long j9 = j;
        long j10 = (j * j8) + j6 + (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        int i5 = (int) j10;
        iArr3[3] = i5;
        long j11 = ((long) iArr[12]) & UnsignedInteger.INT_MASK;
        long j12 = (j9 * j11) + j8 + (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (j10 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = ((long) iArr[13]) & UnsignedInteger.INT_MASK;
        long j14 = (j9 * j13) + j11 + (((long) iArr[5]) & UnsignedInteger.INT_MASK) + (j12 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = ((long) iArr[14]) & UnsignedInteger.INT_MASK;
        long j16 = (j9 * j15) + j13 + (((long) iArr[6]) & UnsignedInteger.INT_MASK) + (j14 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = ((long) iArr[15]) & UnsignedInteger.INT_MASK;
        long j18 = (j9 * j17) + j15 + (((long) iArr[7]) & UnsignedInteger.INT_MASK) + (j16 >>> 32);
        iArr3[7] = (int) j18;
        long j19 = (j18 >>> 32) + j17;
        long j20 = j19 & UnsignedInteger.INT_MASK;
        long j21 = (j9 * j20) + (((long) i) & UnsignedInteger.INT_MASK) + 0;
        int i6 = 0;
        iArr3[0] = (int) j21;
        long j22 = j19 >>> 32;
        long j23 = (j9 * j22) + j20 + (((long) i4) & UnsignedInteger.INT_MASK) + (j21 >>> 32);
        iArr3[1] = (int) j23;
        long j24 = j22 + (((long) i3) & UnsignedInteger.INT_MASK) + (j23 >>> 32);
        iArr3[2] = (int) j24;
        long j25 = (j24 >>> 32) + (((long) i5) & UnsignedInteger.INT_MASK);
        iArr3[3] = (int) j25;
        if ((j25 >>> 32) != 0) {
            i6 = C2606m.m6155u(8, iArr3, 4);
        }
        if (i6 != 0 || (iArr3[7] == -1 && C3436p.m8227A(iArr3, f38649t))) {
            C2606m.m6143i(8, 977, iArr3);
        }
    }

    /* renamed from: z0 */
    public static String m29899z0(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            return (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) ? "" : replaceFirst.startsWith("base-") ? replaceFirst.replace("base-", "config.") : replaceFirst.replace(HelpFormatter.DEFAULT_OPT_PREFIX, ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: a */
    public List mo38909a(C19997p pVar) {
        C19383o.m32797g(pVar, "url");
        return EmptyList.INSTANCE;
    }

    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        C19383o.m32798h(objArr, "it");
        List Q0 = C19318k.m32599Q0(objArr);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(Q0));
        for (Object next : Q0) {
            if (next != null) {
                arrayList.add(next);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }
        return new C10682d((C10680b) arrayList.get(1), (C10680b) arrayList.get(2), (C10680b) arrayList.get(0));
    }

    /* renamed from: b */
    public void mo16602b(String str, Throwable th) {
        C19383o.m32798h(str, "msg");
        C19383o.m32798h(th, "throwable");
    }

    /* renamed from: c */
    public void mo16603c(String str, Throwable th) {
        C19383o.m32798h(str, "msg");
    }

    /* renamed from: d */
    public Object mo15d(IBinder iBinder) {
        return zzt.zzb(iBinder);
    }

    /* renamed from: d */
    public void mo16604d(String str) {
        C19383o.m32798h(str, "msg");
    }

    /* renamed from: e */
    public void mo16605e(String str) {
        C19383o.m32798h(str, "msg");
    }

    /* renamed from: e */
    public Object[] mo1130e(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) C19382n.m32722M0(obj, "makeDexElements", ArrayList.class, arrayList, File.class, file, ArrayList.class, arrayList2);
    }

    /* renamed from: f */
    public void mo16606f(String str) {
        C19383o.m32798h(str, "msg");
    }

    /* renamed from: g */
    public void mo16607g(String str, Exception exc) {
    }

    /* renamed from: h */
    public void mo16608h(String str) {
        C19383o.m32798h(str, "msg");
    }

    /* renamed from: i */
    public void mo38910i(C19997p pVar, List list) {
        C19383o.m32797g(pVar, "url");
    }

    /* renamed from: j */
    public void mo1135j(C20089b bVar, Throwable th) {
        StringBuilder h = C0072d.m201h("Error recording page view: ");
        h.append(th.getMessage());
        Log.e("Qualtrics", h.toString());
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        FragmentNavigationKey fragmentNavigationKey2 = fragmentNavigationKey;
        C19383o.m32797g(fragmentNavigationKey2, "key");
        if (fragmentNavigationKey2 instanceof OrderTrackingKey) {
            ArrayList arrayList = new ArrayList();
            if (!z) {
                arrayList.add(new YouKey(fragmentNavigationKey.getReferrer(), (Bundle) null, (String) null, 6, (DefaultConstructorMarker) null));
                arrayList.add(new PurchasesKey(fragmentNavigationKey.getReferrer(), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
                String referrer = fragmentNavigationKey.getReferrer();
                EtsyId receiptId = ((OrderTrackingKey) fragmentNavigationKey2).getReceiptId();
                arrayList.add(new ReceiptKey(referrer, receiptId != null ? Long.valueOf(receiptId.getIdAsLong()) : null, (Long) null, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
            }
            arrayList.add(fragmentNavigationKey2);
            return arrayList;
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey2 + " provided to " + this);
    }

    /* renamed from: m */
    public void mo1137m(C20089b bVar, C20145v vVar) {
        Log.i("Qualtrics", "Page view recorded");
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_you;
    }

    public /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C15657t2.f35340b);
        C15588c1.m25311V0(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
