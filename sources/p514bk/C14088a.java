package p514bk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.window.C2090c;
import androidx.slice.SliceSpec;
import com.etsy.android.R;
import com.etsy.android.extensions.UnexpectedResultException;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticFooter;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticHeader;
import com.etsy.android.p327ui.core.review.bottomsheet.ListingReviewPagerBottomSheetFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10385e;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PurchasesKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.YouKey;
import com.etsy.android.p327ui.user.addresses.C11463z;
import com.etsy.android.p327ui.user.inappnotifications.UpdatesFeed;
import com.etsy.android.p327ui.user.inappnotifications.UpdatesGroup;
import com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption;
import com.etsy.android.p327ui.user.review.ReviewFlowNavigationOptionType;
import com.etsy.android.util.C12059p;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.gms.measurement.internal.C15050o3;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.common.collect.C16228u1;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Doubles;
import com.google.gson.internal.C16790g;
import dagger.android.C17550a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.C19322o;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19465a0;
import kotlinx.coroutines.C19466a1;
import kotlinx.coroutines.C19476b1;
import kotlinx.coroutines.C19793s0;
import kotlinx.coroutines.C19842z;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.sync.C19813b;
import kotlinx.coroutines.sync.MutexImpl;
import org.apache.commons.lang3.ClassUtils;
import p111g1.C6830b;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.subjects.PublishSubject;
import p287xp.C8339g;
import p343ee.C12693a;
import p521ck.C14168b;
import p568fn.C17782b;
import p628nj.C18263b;
import p634np.C18290b;
import p736cq.C18981a;
import p762or.C20024c;
import p772tq.C20203a;

/* renamed from: bk.a */
public class C14088a implements C2090c, C17550a, C18290b, C8339g, C14941c2, C16790g, C12693a {

    /* renamed from: b */
    public static boolean f31021b = false;

    /* renamed from: c */
    public static final SliceSpec f31022c = new SliceSpec("androidx.slice.BASIC", 1);

    /* renamed from: d */
    public static final SliceSpec f31023d = new SliceSpec("androidx.slice.LIST", 1);

    /* renamed from: e */
    public static final String[] f31024e = {"True-Client-IP", "X-Served-By", "X-Etsy-Request-Uuid", "X-Error-Detail", "X-Android-Received-Millis", "X-Android-Sent-Millis"};

    /* renamed from: f */
    public static C20203a f31025f;

    /* renamed from: g */
    public static final C14088a f31026g = new C14088a();

    /* renamed from: h */
    public static final /* synthetic */ C14088a f31027h = new C14088a();

    /* renamed from: i */
    public static final String[] f31028i = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", ResponseConstants.TOPIC, "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: j */
    public static final String[] f31029j = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: k */
    public static final String[] f31030k = {ResponseConstants.ITEMS};

    /* renamed from: l */
    public static final String[] f31031l = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", ResponseConstants.PRICE, "promotion_id", ResponseConstants.COUPON_PROMOTION_NAME, ResponseConstants.QUANTITY, "shipping", "shipping_tier", "tax", ResponseConstants.TRANSACTION_ID, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: m */
    public static final C19736t f31032m = new C19736t("COMPLETING_ALREADY");

    /* renamed from: n */
    public static final C19736t f31033n = new C19736t("COMPLETING_WAITING_CHILDREN");

    /* renamed from: o */
    public static final C19736t f31034o = new C19736t("COMPLETING_RETRY");

    /* renamed from: p */
    public static final C19736t f31035p = new C19736t("TOO_LATE_TO_CANCEL");

    /* renamed from: q */
    public static final C19736t f31036q = new C19736t("SEALED");

    /* renamed from: r */
    public static final C19793s0 f31037r = new C19793s0(false);

    /* renamed from: s */
    public static final C19793s0 f31038s = new C19793s0(true);

    /* renamed from: t */
    public static final C19736t f31039t = new C19736t("UNLOCK_FAIL");

    /* renamed from: u */
    public static final C19736t f31040u;

    /* renamed from: v */
    public static final C19736t f31041v;

    /* renamed from: w */
    public static final C19813b f31042w;

    /* renamed from: x */
    public static final C19813b f31043x;

    static {
        new C19736t("LOCK_FAIL");
        C19736t tVar = new C19736t("LOCKED");
        f31040u = tVar;
        C19736t tVar2 = new C19736t("UNLOCKED");
        f31041v = tVar2;
        f31042w = new C19813b(tVar);
        f31043x = new C19813b(tVar2);
    }

    /* renamed from: A */
    public static String m21778A(Context context, String str) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = C15050o3.m24586a(context);
        }
        return C15050o3.m24587b(resources, "google_app_id", str);
    }

    /* renamed from: d */
    public static MutexImpl m21779d() {
        return new MutexImpl(false);
    }

    /* renamed from: e */
    public static final void m21780e(PublishSubject publishSubject, C10385e eVar) {
        publishSubject.onNext(new C12059p(eVar));
    }

    /* renamed from: f */
    public static double m21781f(double d, double d2) {
        if (Doubles.m26354a(d)) {
            return d2;
        }
        if (Doubles.m26354a(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }

    /* renamed from: g */
    public static final ArrayList m21782g(UpdatesFeed updatesFeed) {
        Collection collection;
        Iterable iterable;
        C19383o.m32797g(updatesFeed, "<this>");
        List<UpdatesGroup> list = updatesFeed.f25526b;
        ArrayList arrayList = new ArrayList();
        for (UpdatesGroup updatesGroup : list) {
            if (C18263b.m30837c0(updatesGroup.f25527a)) {
                iterable = C19322o.m32625G0(C17782b.m29865e0(C17782b.m29864d0(new InAppNotificationSyntheticHeader(updatesGroup.f25527a, false, 2, (DefaultConstructorMarker) null)), updatesGroup.f25528b, C17782b.m29864d0(InAppNotificationSyntheticFooter.INSTANCE)));
            } else {
                iterable = updatesGroup.f25528b;
            }
            C19324q.m32628J0(iterable, arrayList);
        }
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (!(((InAppNotification) listIterator.previous()) instanceof InAppNotificationSyntheticFooter)) {
                        collection = C19327t.m32657m1(arrayList, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
            return C19327t.m32661q1(collection);
        }
        collection = EmptyList.INSTANCE;
        return C19327t.m32661q1(collection);
    }

    /* renamed from: j */
    public static String m21783j(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder k = C0326j.m866k('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                k.append('[');
                k.append(iArr2[i2]);
                k.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                k.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                String str = strArr[i2];
                if (str != null) {
                    k.append(str);
                }
            }
        }
        return k.toString();
    }

    /* renamed from: l */
    public static final C6830b m21784l(View view) {
        C6830b bVar = (C6830b) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bVar != null) {
            return bVar;
        }
        C6830b bVar2 = new C6830b();
        view.setTag(R.id.pooling_container_listener_holder_tag, bVar2);
        return bVar2;
    }

    /* renamed from: m */
    public static final void m21785m(Throwable th, CoroutineContext coroutineContext) {
        try {
            C19842z zVar = (C19842z) coroutineContext.get(C19842z.C19843a.f43850b);
            if (zVar == null) {
                C19465a0.m33079a(th, coroutineContext);
            } else {
                zVar.handleException(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C17782b.m29886t(runtimeException, th);
                th = runtimeException;
            }
            C19465a0.m33079a(th, coroutineContext);
        }
    }

    /* renamed from: n */
    public static boolean m21786n(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = Ordering.natural();
            }
        } else if (!(iterable instanceof C16228u1)) {
            return false;
        } else {
            obj = ((C16228u1) iterable).comparator();
        }
        return comparator.equals(obj);
    }

    /* renamed from: p */
    public static synchronized void m21787p(Context context) {
        synchronized (C14088a.class) {
            Preconditions.checkNotNull(context, "Context is null");
            if (!f31021b) {
                try {
                    zze a = C14168b.m21957a(context);
                    try {
                        C15588c1.f35079e = (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(a.zze());
                        com.google.android.gms.internal.maps.zze zzf = a.zzf();
                        if (C19421p.f43316f == null) {
                            C19421p.f43316f = (com.google.android.gms.internal.maps.zze) Preconditions.checkNotNull(zzf);
                        }
                        f31021b = true;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }
    }

    /* renamed from: q */
    public static final ReviewFlowNavigationOption m21788q(List list) {
        Object obj;
        boolean z;
        C19383o.m32797g(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ReviewFlowNavigationOption) obj).f25998a == ReviewFlowNavigationOptionType.NEXT) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (ReviewFlowNavigationOption) obj;
    }

    /* renamed from: r */
    public static void m21789r(Observer observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                observer.onError(terminate);
            } else {
                observer.onComplete();
            }
        }
    }

    /* renamed from: s */
    public static void m21790s(C20024c cVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                cVar.onError(terminate);
            } else {
                cVar.onComplete();
            }
        }
    }

    /* renamed from: t */
    public static void m21791t(Observer observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            observer.onError(atomicThrowable.terminate());
        }
    }

    /* renamed from: u */
    public static void m21792u(C20024c cVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(atomicThrowable.terminate());
        }
    }

    /* renamed from: v */
    public static void m21793v(Observer observer, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    observer.onError(terminate);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    /* renamed from: w */
    public static void m21794w(C20024c cVar, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    cVar.onError(terminate);
                } else {
                    cVar.onComplete();
                }
            }
        }
    }

    /* renamed from: x */
    public static final String m21795x(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + url.getHost();
        } catch (MalformedURLException unused) {
            return "https://api.paypal.com";
        }
    }

    /* renamed from: y */
    public static final Object m21796y(Object obj) {
        C19466a1 a1Var;
        C19476b1 b1Var = obj instanceof C19476b1 ? (C19476b1) obj : null;
        return (b1Var == null || (a1Var = b1Var.f43411a) == null) ? obj : a1Var;
    }

    /* renamed from: z */
    public static String m21797z(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo7973a(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        C19383o.m32797g(windowManager, "windowManager");
        C19383o.m32797g(view, "popupView");
        C19383o.m32797g(layoutParams, ResponseConstants.PARAMS);
        windowManager.updateViewLayout(view, layoutParams);
    }

    public Object apply(Object obj) {
        C19383o.m32797g(obj, "item");
        C11463z.C11468e eVar = (C11463z.C11468e) (!(obj instanceof C11463z.C11468e) ? null : obj);
        if (eVar != null) {
            return eVar;
        }
        StringBuilder h = C0072d.m201h("Expected value of type ");
        h.append(C11463z.C11468e.class.getSimpleName());
        h.append(", but it was ");
        h.append(obj.getClass().getSimpleName());
        throw new UnexpectedResultException(h.toString());
    }

    /* renamed from: b */
    public void mo7974b(View view, Rect rect) {
        C19383o.m32797g(view, "composeView");
        C19383o.m32797g(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }

    /* renamed from: c */
    public void mo7975c(View view, int i, int i2) {
        C19383o.m32797g(view, "composeView");
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo1133h(Object obj) {
        ListingReviewPagerBottomSheetFragment listingReviewPagerBottomSheetFragment = (ListingReviewPagerBottomSheetFragment) obj;
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new ConcurrentHashMap();
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        if (fragmentNavigationKey instanceof ReceiptKey) {
            ArrayList arrayList = new ArrayList();
            if (!z) {
                arrayList.add(new YouKey(fragmentNavigationKey.getReferrer(), (Bundle) null, (String) null, 6, (DefaultConstructorMarker) null));
                arrayList.add(new PurchasesKey(fragmentNavigationKey.getReferrer(), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
            }
            arrayList.add(fragmentNavigationKey);
            return arrayList;
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey + " provided to " + this);
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_you;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().zzc());
    }
}
