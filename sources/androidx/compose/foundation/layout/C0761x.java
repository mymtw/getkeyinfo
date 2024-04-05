package androidx.compose.foundation.layout;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.core.C0414b0;
import androidx.compose.animation.core.C0429h0;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0446q;
import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0450s;
import androidx.compose.animation.core.C0466z;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.C0553d;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.input.pointer.C1633e;
import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.layout.C1681g;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1323f1;
import androidx.compose.runtime.C1326g1;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1339j1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1318h;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import androidx.work.C3436p;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.C6051s;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6177d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6194p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6197r;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6204w;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.core.http.HttpErrorMessage;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10425l;
import com.etsy.android.p327ui.listing.p329ui.panels.PanelHelperKt$configure$2;
import com.etsy.android.p327ui.search.p330v2.C10971c;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11015r;
import com.etsy.android.stylekit.CenteredImageSpan;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.C14598c3;
import com.google.android.gms.internal.measurement.C14633f;
import com.google.android.gms.internal.measurement.C14646g;
import com.google.android.gms.internal.measurement.C14672i;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.internal.measurement.C14724m;
import com.google.android.gms.internal.measurement.C14750o;
import com.google.android.gms.internal.measurement.C14763p;
import com.google.android.gms.internal.measurement.C14776q;
import com.google.android.gms.internal.measurement.C14813t;
import com.google.android.gms.internal.measurement.C14817t3;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.internal.C15702n;
import com.google.android.play.core.internal.C15706r;
import com.google.gson.internal.C16790g;
import com.google.logging.type.LogSeverity;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.zhuinden.simplestack.C17527e;
import dagger.android.C17550a;
import java.io.File;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19378j;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19400c;
import kotlin.reflect.C19421p;
import kotlin.text.C19456j;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C19590b;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19655n0;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19689x1;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C19634k;
import kotlinx.coroutines.flow.internal.C19637m;
import kotlinx.coroutines.internal.C19722g;
import kotlinx.coroutines.internal.C19737u;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import okhttp3.C19928a0;
import p003a2.C0015b;
import p087e0.C6682a;
import p087e0.C6683b;
import p087e0.C6684c;
import p087e0.C6685d;
import p087e0.C6687f;
import p129h7.C6959b;
import p141i7.C6997b;
import p150j4.C7114e;
import p161k6.C7198a;
import p161k6.C7199b;
import p162k7.C7207b;
import p171l7.C7277c;
import p173m.C7279a;
import p174m0.C7290i;
import p181m7.C7339a;
import p181m7.C7346h;
import p181m7.C7347i;
import p181m7.C7348j;
import p181m7.C7350l;
import p181m7.C7352n;
import p223r5.C7770q;
import p228s.C7791c;
import p244t5.C7959a;
import p244t5.C8005o1;
import p250u0.C8100m;
import p264v4.C8203c;
import p267v7.C8212a;
import p288y.C8341a;
import p288y.C8342b;
import p288y.C8343c;
import p288y.C8346e;
import p385kg.C12997a;
import p385kg.C12999b;
import p401mg.C13080a;
import p409o9.C13138q;
import p429qd.C13298a;
import p451td.C13391a;
import p453tf.C13418j;
import p453tf.C13442y;
import p455u9.C13449c;
import p455u9.C13450d;
import p455u9.C13453g;
import p466vc.C13574d;
import p513bj.C14077r;
import p568fn.C17782b;
import p628nj.C18263b;
import p634np.C18290b;
import p643op.C18335a;
import p644ph.C18348g;
import p644ph.C18351j;
import p644ph.C18364t;
import p644ph.C18368v;
import p665rl.C18486d;
import p676so.C18543b;
import p683tn.C18567f;
import p735br.C18980c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19864s;
import p756lr.C19893f;
import p756lr.C19897i;
import retrofit2.C20145v;

/* renamed from: androidx.compose.foundation.layout.x */
public class C0761x implements C18290b, C15706r, C14941c2, C15702n, C18567f, C16790g, FeatureManager.C12256a, C18351j, C8203c {

    /* renamed from: b */
    public static final /* synthetic */ C0761x f1558b = new C0761x();

    /* renamed from: c */
    public static final C0761x f1559c = new C0761x();

    /* renamed from: d */
    public static ThreadPoolExecutor f1560d;

    /* renamed from: e */
    public static final int[] f1561e = {-19, -1, -1, -1, -1, -1, -1, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* renamed from: f */
    public static final int[] f1562f = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    /* renamed from: g */
    public static final int[] f1563g = {Api.BaseClientBuilder.API_PRIORITY_OTHER, -1, -1, -1, -1};

    /* renamed from: h */
    public static final int[] f1564h = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* renamed from: i */
    public static final int[] f1565i = {-1, -1073741826, -1, -1, -1, 1, 1};

    /* renamed from: j */
    public static C18543b f1566j;

    /* renamed from: k */
    public static final C0761x f1567k = new C0761x();

    /* renamed from: l */
    public static final int[] f1568l = {R.attr.snapEnabled, R.attr.snapGravity, R.attr.snapLastItem, R.attr.snapMaxFlingSizeFraction, R.attr.snapScrollMsPerInch, R.attr.snapToPadding};

    /* renamed from: A */
    public static final C1436d m1655A(C1436d dVar, long j, C1530k0 k0Var) {
        C19383o.m32797g(dVar, "$this$background");
        C19383o.m32797g(k0Var, "shape");
        C1545s sVar = new C1545s(j);
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C0553d(sVar, k0Var));
    }

    /* renamed from: A0 */
    public static final Object m1656A0(Object obj, LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (obj == null) {
            return lockFreeLinkedListNode;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(lockFreeLinkedListNode);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(lockFreeLinkedListNode);
        return arrayList;
    }

    /* renamed from: B0 */
    public static final C6684c m1658B0(ArrayList arrayList, ArrayList arrayList2) {
        float f;
        float f2;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!arrayList.isEmpty()) {
            int i = 2;
            if (2 >= arrayList.size()) {
                i = arrayList.size() - 1;
            }
            ArrayList arrayList5 = new ArrayList(3);
            int i2 = 0;
            while (true) {
                f = 0.0f;
                if (i2 >= 3) {
                    break;
                }
                arrayList5.add(Float.valueOf(0.0f));
                i2++;
            }
            int size = arrayList.size();
            int i3 = i + 1;
            C6682a aVar = new C6682a(i3, size);
            int i4 = 0;
            while (true) {
                f2 = 1.0f;
                if (i4 >= size) {
                    break;
                }
                aVar.mo18838c(1.0f, 0, i4);
                for (int i5 = 1; i5 < i3; i5++) {
                    aVar.mo18838c(((Number) arrayList3.get(i4)).floatValue() * aVar.mo18836a(i5 - 1, i4), i5, i4);
                }
                i4++;
            }
            C6682a aVar2 = new C6682a(i3, size);
            C6682a aVar3 = new C6682a(i3, i3);
            int i6 = 0;
            while (i6 < i3) {
                for (int i7 = 0; i7 < size; i7++) {
                    aVar2.mo18838c(aVar.mo18836a(i6, i7), i6, i7);
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    float a = aVar2.mo18837b(i6).mo18845a(aVar2.mo18837b(i8));
                    for (int i9 = 0; i9 < size; i9++) {
                        aVar2.mo18838c(aVar2.mo18836a(i6, i9) - (aVar2.mo18836a(i8, i9) * a), i6, i9);
                    }
                }
                C6685d b = aVar2.mo18837b(i6);
                float sqrt = (float) Math.sqrt((double) b.mo18845a(b));
                if (((double) sqrt) >= 1.0E-6d) {
                    float f3 = 1.0f / sqrt;
                    for (int i10 = 0; i10 < size; i10++) {
                        aVar2.mo18838c(aVar2.mo18836a(i6, i10) * f3, i6, i10);
                    }
                    int i11 = 0;
                    while (i11 < i3) {
                        aVar3.mo18838c(i11 < i6 ? 0.0f : aVar2.mo18837b(i6).mo18845a(aVar.mo18837b(i11)), i6, i11);
                        i11++;
                    }
                    i6++;
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            C6685d dVar = new C6685d(size);
            for (int i12 = 0; i12 < size; i12++) {
                dVar.f14750b[i12] = Float.valueOf(((Number) arrayList4.get(i12)).floatValue() * 1.0f);
            }
            int i13 = i3 - 1;
            for (int i14 = i13; -1 < i14; i14--) {
                arrayList5.set(i14, Float.valueOf(aVar2.mo18837b(i14).mo18845a(dVar)));
                int i15 = i14 + 1;
                if (i15 <= i13) {
                    int i16 = i13;
                    while (true) {
                        arrayList5.set(i14, Float.valueOf(((Number) arrayList5.get(i14)).floatValue() - (((Number) arrayList5.get(i16)).floatValue() * aVar3.mo18836a(i14, i16))));
                        if (i16 == i15) {
                            break;
                        }
                        i16--;
                    }
                }
                arrayList5.set(i14, Float.valueOf(((Number) arrayList5.get(i14)).floatValue() / aVar3.mo18836a(i14, i14)));
            }
            float f4 = 0.0f;
            for (int i17 = 0; i17 < size; i17++) {
                f4 += ((Number) arrayList4.get(i17)).floatValue();
            }
            float f5 = f4 / ((float) size);
            float f6 = 0.0f;
            for (int i18 = 0; i18 < size; i18++) {
                float floatValue = ((Number) arrayList4.get(i18)).floatValue() - ((Number) arrayList5.get(0)).floatValue();
                float f7 = 1.0f;
                for (int i19 = 1; i19 < i3; i19++) {
                    f7 *= ((Number) arrayList3.get(i18)).floatValue();
                    floatValue -= ((Number) arrayList5.get(i19)).floatValue() * f7;
                }
                f6 += floatValue * 1.0f * floatValue;
                float floatValue2 = ((Number) arrayList4.get(i18)).floatValue() - f5;
                f += floatValue2 * 1.0f * floatValue2;
            }
            if (f > 1.0E-6f) {
                f2 = 1.0f - (f6 / f);
            }
            return new C6684c(arrayList5, f2);
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }

    /* renamed from: C */
    public static String m1659C(int i) {
        if (i == 0) {
            return "qTESLA-I";
        }
        if (i == 1) {
            return "qTESLA-III-size";
        }
        if (i == 2) {
            return "qTESLA-III-speed";
        }
        if (i == 3) {
            return "qTESLA-p-I";
        }
        if (i == 4) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException(C0015b.m88g("unknown security category: ", i));
    }

    /* renamed from: C0 */
    public static long m1660C0(C14077r rVar, int i, int i2) {
        rVar.mo46935z(i);
        if (rVar.f30988c - rVar.f30987b < 5) {
            return -9223372036854775807L;
        }
        int c = rVar.mo46912c();
        if ((8388608 & c) != 0 || ((2096896 & c) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((c & 32) != 0) && rVar.mo46925p() >= 7 && rVar.f30988c - rVar.f30987b >= 7) {
            if ((rVar.mo46925p() & 16) == 16) {
                byte[] bArr = new byte[6];
                rVar.mo46911b(0, 6, bArr);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: D */
    public static void m1661D(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        int i = iArr[7];
        int i2 = i;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[i3 + 8];
            iArr3[0 + i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        long j = ((long) 19) & UnsignedInteger.INT_MASK;
        long j2 = ((((long) iArr3[0]) & UnsignedInteger.INT_MASK) * j) + (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 0;
        iArr3[0] = (int) j2;
        long j3 = ((((long) iArr3[1]) & UnsignedInteger.INT_MASK) * j) + (((long) iArr[1]) & UnsignedInteger.INT_MASK) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = ((((long) iArr3[2]) & UnsignedInteger.INT_MASK) * j) + (((long) iArr[2]) & UnsignedInteger.INT_MASK) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = ((((long) iArr3[3]) & UnsignedInteger.INT_MASK) * j) + (((long) iArr[3]) & UnsignedInteger.INT_MASK) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = ((((long) iArr3[4]) & UnsignedInteger.INT_MASK) * j) + (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = ((((long) iArr3[5]) & UnsignedInteger.INT_MASK) * j) + (((long) iArr[5]) & UnsignedInteger.INT_MASK) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = ((((long) iArr3[6]) & UnsignedInteger.INT_MASK) * j) + (((long) iArr[6]) & UnsignedInteger.INT_MASK) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        long j9 = (j * (((long) iArr3[7]) & UnsignedInteger.INT_MASK)) + (UnsignedInteger.INT_MASK & ((long) iArr[7])) + (j8 >>> 32);
        int i5 = (int) j9;
        iArr3[7] = i5;
        iArr3[7] = C2606m.m6158x(7, (((i5 >>> 31) - (i >>> 31)) + (((int) (j9 >>> 32)) << 1)) * 19, iArr3) + (i5 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (C3436p.m8227A(iArr3, f1561e)) {
            m1752x(iArr2);
        }
    }

    /* renamed from: D0 */
    public static final C19590b m1662D0(AbstractChannel abstractChannel) {
        return new C19590b(abstractChannel, false);
    }

    /* renamed from: E */
    public static void m1663E(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[5]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[6]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr[7]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j5 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j6 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j + (j << 31) + 0;
        iArr3[0] = (int) j6;
        long j7 = (((long) iArr[1]) & UnsignedInteger.INT_MASK) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr3[1] = (int) j7;
        long j8 = (((long) iArr[2]) & UnsignedInteger.INT_MASK) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr3[2] = (int) j8;
        long j9 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr3[3] = (int) j9;
        long j10 = (UnsignedInteger.INT_MASK & ((long) iArr[4])) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr3[4] = (int) j10;
        m1733m((int) (j10 >>> 32), iArr3);
    }

    /* renamed from: E0 */
    public static final C1338j0 m1664E0(Object obj, C1302d dVar) {
        dVar.mo5465u(-1058319986);
        dVar.mo5465u(-492369756);
        Object v = dVar.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = m1751w0(obj, C1351n1.f2948a);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1338j0 j0Var = (C1338j0) v;
        j0Var.setValue(obj);
        dVar.mo5406H();
        return j0Var;
    }

    /* renamed from: F */
    public static final float m1665F(long j, float f, long j2, long j3) {
        long C = C18263b.m30808C(C1545s.m3356b(j, f), j3);
        float f0 = C18263b.m30843f0(C18263b.m30808C(j2, C)) + 0.05f;
        float f02 = C18263b.m30843f0(C) + 0.05f;
        return Math.max(f0, f02) / Math.min(f0, f02);
    }

    /* renamed from: F0 */
    public static final void m1666F0(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* renamed from: G */
    public static final Object m1667G(C19597d dVar, C19861p pVar, C19340c cVar) {
        Object collect = C19634k.C19635a.m33421a(C19655n0.m33426a(dVar, pVar), (CoroutineDispatcher) null, 0, BufferOverflow.SUSPEND, 1).collect(C19637m.f43600b, cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (collect != coroutineSingletons) {
            collect = C19394m.f43287a;
        }
        return collect == coroutineSingletons ? collect : C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        throw r8;
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1668G0(java.io.File r7, int r8) {
        /*
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = r7.getAbsolutePath()
            android.graphics.Bitmap r0 = p455u9.C13452f.m21230g(r8, r8, r0)
            if (r0 == 0) goto L_0x0057
            int r1 = r0.getHeight()
            int r2 = r0.getWidth()
            float r3 = (float) r1
            float r4 = (float) r2
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            float r3 = r3 / r4
            if (r1 >= r2) goto L_0x0026
            float r1 = (float) r8
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            goto L_0x002f
        L_0x0026:
            float r1 = (float) r8
            float r1 = r1 / r3
            int r1 = java.lang.Math.round(r1)
            r6 = r1
            r1 = r8
            r8 = r6
        L_0x002f:
            r2 = 1
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createScaledBitmap(r0, r8, r1, r2)
            java.lang.String r1 = "getUnconstrainedResizedB…nstrainedBitmap, maxSize)"
            kotlin.jvm.internal.C19383o.m32796f(r8, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r7)
            r7 = 0
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0050 }
            r3 = 100
            r8.compress(r2, r3, r1)     // Catch:{ all -> 0x0050 }
            kotlin.reflect.C19421p.m32917E(r1, r7)
            r8.recycle()
            r0.recycle()
            goto L_0x0057
        L_0x0050:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r8 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r7)
            throw r8
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0761x.m1668G0(java.io.File, int):void");
    }

    /* renamed from: H */
    public static final void m1669H(C19857l lVar, CollageContentToggle collageContentToggle) {
        collageContentToggle.setListener(new C13391a(lVar, collageContentToggle));
        collageContentToggle.addOnAttachStateChangeListener(new PanelHelperKt$configure$2(lVar, collageContentToggle));
    }

    /* renamed from: H0 */
    public static void m1670H0(Set set, C17527e eVar) {
        Iterator it = new ArrayList(set).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!eVar.contains(next)) {
                set.remove(next);
            }
        }
    }

    /* renamed from: I */
    public static float[] m1671I() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* renamed from: I0 */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 m1672I0(float f, C0743k kVar, LayoutOrientation layoutOrientation, SizeMode sizeMode, C19864s sVar) {
        C19383o.m32797g(layoutOrientation, "orientation");
        C19383o.m32797g(sVar, "arrangement");
        C19383o.m32797g(sizeMode, "crossAxisSize");
        return new RowColumnImplKt$rowColumnMeasurePolicy$1(f, kVar, layoutOrientation, sizeMode, sVar);
    }

    /* renamed from: J */
    public static final Result.Failure m1673J(Throwable th) {
        C19383o.m32797g(th, "exception");
        return new Result.Failure(th);
    }

    /* renamed from: J0 */
    public static final List m1674J0(Throwable th) {
        C19383o.m32798h(th, "$this$safeUnrollCauses");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            th = th.getCause();
        }
        return C19327t.m32660p1(linkedHashSet);
    }

    /* renamed from: K */
    public static void m1675K(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        m1661D(iArr3, iArr2);
    }

    /* renamed from: K0 */
    public static void m1676K0(Context context, String str, String str2, String str3, boolean z) {
        C8100m mVar = new C8100m(context, (String) null);
        PendingIntent activity = PendingIntent.getActivity(context.getApplicationContext(), 0, new Intent(), 67108864);
        C13138q.m20808a();
        Notification notification = mVar.f17655C;
        notification.icon = R.drawable.ic_stat_ic_notification;
        notification.tickerText = C8100m.m16287c(str);
        mVar.f17655C.when = System.currentTimeMillis();
        mVar.mo20690d(str3);
        mVar.mo20693g(16, true);
        mVar.f17663g = activity;
        mVar.mo20691e(str2);
        if (z) {
            mVar.f17670n = 100;
            mVar.f17671o = 0;
            mVar.f17672p = true;
        }
        ((NotificationManager) context.getSystemService("notification")).notify(-22, mVar.mo20689b());
    }

    /* renamed from: L */
    public static void m1677L(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3436p.m8238L(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & UnsignedInteger.INT_MASK) - 19;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                j2 = (long) C2606m.m6134b(7, iArr3, 1);
            }
            iArr3[7] = (int) ((UnsignedInteger.INT_MASK & ((long) iArr3[7])) + 2147483648L + j2);
        }
    }

    /* renamed from: L0 */
    public static C0429h0 m1678L0(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C0429h0(f, f2, obj);
    }

    /* renamed from: M */
    public static void m1679M(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C3039b.m7161e0(iArr, iArr3);
        m1663E(iArr3, iArr2);
    }

    /* renamed from: M0 */
    public static final long m1680M0(long j, long j2, long j3, String str) {
        String str2;
        int i = C19737u.f43688a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long U0 = C19456j.m33017U0(str2);
        if (U0 != null) {
            long longValue = U0.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    /* renamed from: N */
    public static void m1681N(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3039b.m7178o0(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & UnsignedInteger.INT_MASK) - (UnsignedInteger.INT_MASK & ((long) -2147483647));
            iArr3[0] = (int) j;
            if ((j >> 32) != 0) {
                C2606m.m6134b(5, iArr3, 1);
            }
        }
    }

    /* renamed from: N0 */
    public static int m1682N0(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) m1680M0((long) i, (long) i2, (long) i3, str);
    }

    /* renamed from: O */
    public static byte[] m1683O(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    /* renamed from: O0 */
    public static final void m1684O0(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = r5;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress m1685P(int r17, int r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r0) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r0) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = kotlin.text.C19457k.m33024b1(r1, r6, r14, r5)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = kotlin.text.C19457k.m33024b1(r1, r6, r11, r5)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = kotlin.text.C19457k.m33024b1(r1, r6, r11, r5)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r0) goto L_0x009c
            if (r11 != r2) goto L_0x0052
        L_0x0050:
            r0 = r5
            goto L_0x00a2
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r14 = r1.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
            goto L_0x0050
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r0) goto L_0x008b
            char r5 = r1.charAt(r14)
            r2 = 48
            int r16 = kotlin.jvm.internal.C19383o.m32799i(r5, r2)
            if (r16 < 0) goto L_0x008b
            r4 = 57
            int r4 = kotlin.jvm.internal.C19383o.m32799i(r5, r4)
            if (r4 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r13
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r0) goto L_0x00c2
            char r4 = r1.charAt(r6)
            int r4 = p735br.C18980c.m32112p(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r13) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0761x.m1685P(int, int, java.lang.String):java.net.InetAddress");
    }

    /* renamed from: P0 */
    public static final String m1686P0(String str) {
        C19383o.m32797g(str, "$this$toCanonicalHost");
        int i = 0;
        int i2 = -1;
        if (C19459m.m33036e1(str, MessageDraft.IMAGE_DELIMITER, false)) {
            InetAddress P = (!C19457k.m33025c1(str, "[", false) || !C19457k.m33018V0(str, "]")) ? m1685P(0, str.length(), str) : m1685P(1, str.length() - 1, str);
            if (P == null) {
                return null;
            }
            byte[] address = P.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C19893f fVar = new C19893f();
                while (i < address.length) {
                    if (i == i2) {
                        fVar.mo72771x0(58);
                        i += i4;
                        if (i == 16) {
                            fVar.mo72771x0(58);
                        }
                    } else {
                        if (i > 0) {
                            fVar.mo72771x0(58);
                        }
                        byte b = address[i];
                        byte[] bArr = C18980c.f42301a;
                        fVar.mo72709B0((long) (((b & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return fVar.mo72708B();
            } else if (address.length == 4) {
                return P.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C19383o.m32796f(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                C19383o.m32796f(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                C19383o.m32796f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i7);
                    if (C19383o.m32799i(charAt, 31) <= 0) {
                        break;
                    } else if (C19383o.m32799i(charAt, 127) >= 0) {
                        break;
                    } else if (C19459m.m33042k1(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i7++;
                    }
                }
                i = 1;
                if (i != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: Q */
    public static final DerivedSnapshotState m1687Q(C19846a aVar) {
        C1339j1 j1Var = C1326g1.f2887a;
        C19383o.m32797g(aVar, "calculation");
        return new DerivedSnapshotState(aVar);
    }

    /* renamed from: Q0 */
    public static final void m1688Q0(String str, char[] cArr, int i, int i2, int i3) {
        for (int i4 = i2; i4 < i3; i4++) {
            cArr[(i + i4) - i2] = str.charAt(i4);
        }
    }

    /* renamed from: R */
    public static final C19597d m1689R(C19597d dVar) {
        C19857l<Object, Object> lVar = FlowKt__DistinctKt.f43517a;
        if (dVar instanceof C19689x1) {
            return dVar;
        }
        C19857l<Object, Object> lVar2 = FlowKt__DistinctKt.f43517a;
        C19861p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f43518b;
        if (dVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) dVar;
            if (distinctFlowImpl.f43510c == lVar2 && distinctFlowImpl.f43511d == pVar) {
                return dVar;
            }
        }
        return new DistinctFlowImpl(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = r2.f44616c;
     */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m1690R0(retrofit2.HttpException r2, com.squareup.moshi.C17414y r3) {
        /*
            java.lang.String r0 = "moshi"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.Class<com.etsy.android.lib.core.http.HttpErrorMessage> r0 = com.etsy.android.lib.core.http.HttpErrorMessage.class
            com.squareup.moshi.JsonAdapter r3 = r3.mo68556a(r0)
            retrofit2.v r2 = r2.response()
            r0 = 0
            if (r2 == 0) goto L_0x001b
            okhttp3.a0 r2 = r2.f44616c
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = r2.mo72844g()
            goto L_0x001c
        L_0x001b:
            r2 = r0
        L_0x001c:
            java.lang.String r1 = ""
            if (r2 != 0) goto L_0x0021
            r2 = r1
        L_0x0021:
            java.lang.Object r2 = r3.fromJson((java.lang.String) r2)
            com.etsy.android.lib.core.http.HttpErrorMessage r2 = (com.etsy.android.lib.core.http.HttpErrorMessage) r2
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = r2.f18955a
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0761x.m1690R0(retrofit2.HttpException, com.squareup.moshi.y):java.lang.String");
    }

    /* renamed from: S */
    public static void m1691S(int[] iArr, int[] iArr2) {
        C2606m.m6154t(8, 0, iArr, iArr2);
        if (C3436p.m8227A(iArr2, f1561e)) {
            m1752x(iArr2);
        }
    }

    /* renamed from: S0 */
    public static final String m1692S0(C20145v vVar, C17414y yVar) {
        C19383o.m32797g(vVar, "<this>");
        C19383o.m32797g(yVar, "moshi");
        JsonAdapter<HttpErrorMessage> a = yVar.mo68556a(HttpErrorMessage.class);
        C19928a0 a0Var = vVar.f44616c;
        String str = null;
        String g = a0Var != null ? a0Var.mo72844g() : null;
        if (g == null) {
            g = "";
        }
        HttpErrorMessage fromJson = a.fromJson(g);
        if (fromJson != null) {
            str = fromJson.f18955a;
        }
        return str == null ? "" : str;
    }

    /* renamed from: T */
    public static String m1693T(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            sb.append("0123456789abcdef".charAt(b2 / 16));
            sb.append("0123456789abcdef".charAt(b2 % 16));
        }
        return sb.toString();
    }

    /* renamed from: T0 */
    public static final String m1694T0(C20145v vVar, C17414y yVar) {
        C19897i f;
        HttpErrorMessage fromJson;
        C19383o.m32797g(vVar, "<this>");
        C19383o.m32797g(yVar, "moshi");
        try {
            C19928a0 a0Var = vVar.f44616c;
            if (a0Var == null || (f = a0Var.mo70458f()) == null || (fromJson = yVar.mo68556a(HttpErrorMessage.class).fromJson(f)) == null) {
                return null;
            }
            return fromJson.f18955a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: U */
    public static int m1695U(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil((double) fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: U0 */
    public static CharSequence m1696U0(Context context, String str) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller);
        List y1 = C19459m.m33056y1(str, new String[]{"\\|"}, 0, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new CenteredImageSpan(context, R.drawable.clg_icon_core_navigateright_v1, dimensionPixelSize, (Integer) null), 0, 1, 33);
        C19394m mVar = C19394m.f43287a;
        C19327t.m32642X0(y1, spannableStringBuilder, spannableString, "", "", -1, "...", (C19857l) null);
        return spannableStringBuilder;
    }

    /* renamed from: V */
    public static String m1697V() {
        List<String> list = C8591a.f18700r;
        return C18263b.f40056T.f18706f.mo21136f(C8592b.f18744L0);
    }

    /* renamed from: V0 */
    public static final long m1698V0(long j) {
        return C0114h.m319t((float) ((int) (j >> 32)), (float) C7290i.m13995b(j));
    }

    /* renamed from: W */
    public static ArrayList m1699W(Set set) {
        C19383o.m32797g(set, "allCollections");
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (((CheckableListingCollection) next).getIsChecked()) {
                arrayList.add(next);
            }
        }
        if (!C19543e0.m33306Y(arrayList)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CheckableListingCollection) it.next()).getKey());
        }
        return arrayList2;
    }

    /* renamed from: W0 */
    public static final String m1700W0(float f) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - ((float) i) >= 0.5f) {
            i++;
        }
        float f3 = ((float) i) / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* renamed from: X */
    public static final C0762y m1701X(C1681g gVar) {
        Object f = gVar.mo6666f();
        if (f instanceof C0762y) {
            return (C0762y) f;
        }
        return null;
    }

    /* renamed from: X0 */
    public static void m1702X0(float[] fArr, float f, float f2) {
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = fArr[3] * f;
        float f7 = fArr[11] * 0.0f;
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f7 + (fArr[7] * f2) + f6 + fArr[15];
    }

    /* renamed from: Y */
    public static final void m1703Y(ImageView imageView, String str, int i, int i2) {
        C19383o.m32797g(imageView, "<this>");
        if (m1714c1(imageView, str)) {
            Glide.with((View) imageView).load(str).mo16818O(new C13449c(imageView)).mo16816M(imageView);
        }
    }

    /* renamed from: Y0 */
    public static final C0433j0 m1704Y0(int i, int i2, C0448r rVar) {
        C19383o.m32797g(rVar, "easing");
        return new C0433j0(i, i2, rVar);
    }

    /* renamed from: Z */
    public static final void m1705Z(C13450d dVar) {
        ImageView imageView = dVar.f29468b;
        if (imageView != null) {
            Glide.with((View) imageView).load(dVar.f29467a).mo16818O(dVar.f29471e).mo16816M(imageView);
        }
    }

    /* renamed from: Z0 */
    public static /* synthetic */ C0433j0 m1706Z0(int i, int i2, C0448r rVar, int i3) {
        if ((i3 & 1) != 0) {
            i = LogSeverity.NOTICE_VALUE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            rVar = C0450s.f1167a;
        }
        return m1704Y0(i, i2, rVar);
    }

    /* renamed from: a */
    public static final long m1707a(int i, int i2) {
        return (((long) i2) & UnsignedInteger.INT_MASK) | (((long) i) << 32);
    }

    /* renamed from: a0 */
    public static final void m1708a0(int i, ImageView imageView, String str) {
        C19383o.m32797g(imageView, "<this>");
        if (m1714c1(imageView, str)) {
            C13453g gVar = new C13453g(i / 2, imageView, str);
            gVar.f29469c = i;
            gVar.f29470d = i;
            m1705Z(gVar);
        }
    }

    /* renamed from: a1 */
    public static final C13574d.C13594c m1709a1(ListingViewState.C10092d dVar, C19857l lVar) {
        ListingViewState.C10092d dVar2 = dVar;
        C19857l lVar2 = lVar;
        C19383o.m32797g(dVar2, "<this>");
        C19383o.m32797g(lVar2, "lambda");
        C10409f fVar = dVar2.f22238f;
        C19383o.m32797g(fVar, "<this>");
        C10419g gVar = new C10419g(fVar);
        lVar2.invoke(gVar);
        return new C13574d.C13594c(ListingViewState.C10092d.m18242e(dVar2, false, new C10409f(gVar.f22860a, gVar.f22862c, gVar.f22861b, gVar.f22863d, gVar.f22864e, gVar.f22865f, gVar.f22866g, gVar.f22867h, gVar.f22868i, gVar.f22869j, gVar.f22870k, gVar.f22871l, gVar.f22872m, gVar.f22873n, C13298a.f29204a, gVar.f22874o, gVar.f22875p, gVar.f22876q), (GooglePayData) null, (AppsInventoryAddToCartContext) null, (C10425l) null, false, 1015));
    }

    /* renamed from: b0 */
    public static final void m1710b0(ImageView imageView, String str, int i) {
        C19383o.m32797g(imageView, "<this>");
        if (m1714c1(imageView, str)) {
            C13453g gVar = new C13453g(i / 2, imageView, str);
            gVar.f29469c = i;
            gVar.f29470d = i;
            gVar.f29471e.getClass();
            m1705Z(gVar);
        }
    }

    /* renamed from: b1 */
    public static final String m1711b1(ListingImage listingImage, int i) {
        C19383o.m32797g(listingImage, "<this>");
        if (i <= 75 && C18263b.m30839d0(listingImage.getUrl75x75())) {
            String url75x75 = listingImage.getUrl75x75();
            C19383o.m32794d(url75x75);
            return url75x75;
        } else if (i <= 170 && C18263b.m30839d0(listingImage.getUrl170x135())) {
            String url170x135 = listingImage.getUrl170x135();
            C19383o.m32794d(url170x135);
            return url170x135;
        } else if (i <= 224 && C18263b.m30839d0(listingImage.getUrl224xN())) {
            String url224xN = listingImage.getUrl224xN();
            C19383o.m32794d(url224xN);
            return url224xN;
        } else if (i <= 300 && C18263b.m30839d0(listingImage.getUrl300x300())) {
            String url300x300 = listingImage.getUrl300x300();
            C19383o.m32794d(url300x300);
            return url300x300;
        } else if (i <= 340 && C18263b.m30839d0(listingImage.getUrl340x270())) {
            String url340x270 = listingImage.getUrl340x270();
            C19383o.m32794d(url340x270);
            return url340x270;
        } else if (i <= 570 && C18263b.m30839d0(listingImage.getUrl570xN())) {
            String url570xN = listingImage.getUrl570xN();
            C19383o.m32794d(url570xN);
            return url570xN;
        } else if (i <= 600 && C18263b.m30839d0(listingImage.getUrl600x600())) {
            return listingImage.getUrl600x600();
        } else {
            if (i > 680 || !C18263b.m30839d0(listingImage.getUrl680x540())) {
                return C18263b.m30839d0(listingImage.getUrl()) ? listingImage.getUrl() : "";
            }
            String url680x540 = listingImage.getUrl680x540();
            C19383o.m32794d(url680x540);
            return url680x540;
        }
    }

    /* renamed from: c */
    public static final C8346e m1712c(float f, float f2, float f3, float f4, long j) {
        long s = C0114h.m317s(C8341a.m16635b(j), C8341a.m16636c(j));
        return new C8346e(f, f2, f3, f4, s, s, s, s);
    }

    /* renamed from: c0 */
    public static final Class m1713c0(C19400c cVar) {
        C19383o.m32797g(cVar, "<this>");
        Class<?> a = ((C19378j) cVar).mo71917a();
        C19383o.m32795e(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a;
    }

    /* renamed from: c1 */
    public static final boolean m1714c1(ImageView imageView, String str) {
        if (str != null && URLUtil.isValidUrl(str)) {
            return true;
        }
        if (imageView == null) {
            return false;
        }
        imageView.setImageResource(17170445);
        return false;
    }

    /* renamed from: d0 */
    public static final Class m1715d0(C19400c cVar) {
        C19383o.m32797g(cVar, "<this>");
        Class<?> a = ((C19378j) cVar).mo71917a();
        if (!a.isPrimitive()) {
            return a;
        }
        String name = a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a : Double.class;
            case 104431:
                return !name.equals("int") ? a : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a : Byte.class;
            case 3052374:
                return !name.equals("char") ? a : Character.class;
            case 3327612:
                return !name.equals("long") ? a : Long.class;
            case 3625364:
                return !name.equals("void") ? a : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a : Float.class;
            case 109413500:
                return !name.equals("short") ? a : Short.class;
            default:
                return a;
        }
    }

    /* renamed from: d1 */
    public static final void m1716d1(C8703p pVar, ArrayList arrayList, ArrayList arrayList2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder("[");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append("[");
                sb.append(str);
                sb.append("]");
            }
            sb.append("]");
            String sb2 = sb.toString();
            C19383o.m32796f(sb2, "sb.toString()");
            linkedHashMap.put(PredefinedAnalyticsProperty.GROUPED_CART_IDS, sb2);
        }
        if (!arrayList2.isEmpty()) {
            linkedHashMap.put(PredefinedAnalyticsProperty.LISTING_IDS, arrayList2);
        }
        if (pVar != null) {
            pVar.mo21333d("cart_view", linkedHashMap);
        }
    }

    /* renamed from: e0 */
    public static final C19753l m1717e0(C19340c cVar) {
        if (!(cVar instanceof C19722g)) {
            return new C19753l(1, cVar);
        }
        C19753l h = ((C19722g) cVar).mo72455h();
        if (h == null || !h.mo72551t()) {
            h = null;
        }
        return h == null ? new C19753l(2, cVar) : h;
    }

    /* renamed from: e1 */
    public static C14763p m1718e1(C14817t3 t3Var) {
        if (t3Var == null) {
            return C14763p.f33033g0;
        }
        int A = t3Var.mo50857A() - 1;
        if (A == 1) {
            return t3Var.mo50865z() ? new C14813t(t3Var.mo50860u()) : C14763p.f33040o0;
        }
        if (A == 2) {
            return t3Var.mo50864y() ? new C14672i(Double.valueOf(t3Var.mo50858r())) : new C14672i((Double) null);
        }
        if (A == 3) {
            return t3Var.mo50863x() ? new C14646g(Boolean.valueOf(t3Var.mo50862w())) : new C14646g((Boolean) null);
        }
        if (A == 4) {
            List<C14817t3> v = t3Var.mo50861v();
            ArrayList arrayList = new ArrayList();
            for (C14817t3 e1 : v) {
                arrayList.add(m1718e1(e1));
            }
            return new C14776q(t3Var.mo50859t(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    /* renamed from: f0 */
    public static TextView m1719f0(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: f1 */
    public static ThreadPoolExecutor m1720f1() {
        if (f1560d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C18486d());
            f1560d = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f1560d;
    }

    /* renamed from: g */
    public static C7198a m1721g(C7770q qVar) {
        if (qVar instanceof C6997b) {
            C6997b bVar = (C6997b) qVar;
            return new C7198a(C7277c.m13938b(bVar.f15539b), C8212a.m16504k(bVar.f15540c));
        } else if (qVar instanceof C7207b) {
            C7207b bVar2 = (C7207b) qVar;
            return new C7198a(new C7199b(C7339a.f16302d, new C7346h(C7277c.m13939c(bVar2.f15251b))), C8212a.m16504k(bVar2.f16003c));
        } else if (qVar instanceof C6959b) {
            return new C7198a(new C7199b(C7339a.f16303e), C8212a.m16504k(((C6959b) qVar).f15442b));
        } else {
            if (qVar instanceof C6204w) {
                C6204w wVar = (C6204w) qVar;
                return new C7198a(new C7199b(C7339a.f16304f, new C7347i(wVar.f13518c.f13501c, C7277c.m13941e((String) wVar.f17194b))), (C8005o1) new C7352n(C6177d.m12380f(wVar.f13521f), C6177d.m12380f(wVar.f13520e)));
            } else if (qVar instanceof C6197r) {
                C6197r rVar = (C6197r) qVar;
                C7959a aVar = C7339a.f16305g;
                C6194p pVar = rVar.f13492c;
                return new C7198a(new C7199b(aVar, new C7348j(pVar.f13476c, pVar.f13477d, C7277c.m13941e((String) rVar.f17177b))), (C8005o1) new C7350l(C6177d.m12380f(rVar.f13495f), C6177d.m12380f(rVar.f13494e)));
            } else {
                throw new IOException("key parameters not recognized");
            }
        }
    }

    /* renamed from: g0 */
    public static final float m1722g0(C0762y yVar) {
        if (yVar != null) {
            return yVar.f1569a;
        }
        return 0.0f;
    }

    /* renamed from: g1 */
    public static C14633f m1723g1(C14633f fVar, C14598c3 c3Var, C14750o oVar, Boolean bool, Boolean bool2) {
        C14633f fVar2 = new C14633f();
        Iterator<Integer> p = fVar.mo50493p();
        while (p.hasNext()) {
            int intValue = p.next().intValue();
            if (fVar.mo50498w(intValue)) {
                C14763p b = oVar.mo50553b(c3Var, Arrays.asList(new C14763p[]{fVar.mo50491n(intValue), new C14672i(Double.valueOf((double) intValue)), fVar}));
                if (b.zzg().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || b.zzg().equals(bool2)) {
                    fVar2.mo50497v(intValue, b);
                }
            }
        }
        return fVar2;
    }

    /* renamed from: h */
    public static void m1724h(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = C2606m.m6158x(7, ((i << 1) | (i2 >>> 31)) * 19, iArr) + (i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (C3436p.m8227A(iArr, f1561e)) {
            m1752x(iArr);
        }
    }

    /* renamed from: h0 */
    public static void m1725h0(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: h1 */
    public static C14763p m1726h1(Object obj) {
        if (obj == null) {
            return C14763p.f33034h0;
        }
        if (obj instanceof String) {
            return new C14813t((String) obj);
        }
        if (obj instanceof Double) {
            return new C14672i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C14672i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C14672i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C14646g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C14724m mVar = new C14724m();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C14763p h1 = m1726h1(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    mVar.mo50484e((String) next, h1);
                }
            }
            return mVar;
        } else if (obj instanceof List) {
            C14633f fVar = new C14633f();
            for (Object h12 : (List) obj) {
                fVar.mo50497v(fVar.mo50490m(), m1726h1(h12));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: i0 */
    public static C0466z m1727i0(C0446q qVar) {
        RepeatMode repeatMode = RepeatMode.Restart;
        C19383o.m32797g(repeatMode, "repeatMode");
        return new C0466z(qVar, repeatMode, (long) 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[RETURN] */
    /* renamed from: i1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C14763p m1728i1(com.google.android.gms.internal.measurement.C14633f r9, com.google.android.gms.internal.measurement.C14598c3 r10, java.util.ArrayList r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            kotlin.jvm.internal.C19388s.m32842Q0(r0, r11, r1)
            r2 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r0, r11, r2)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.p r3 = (com.google.android.gms.internal.measurement.C14763p) r3
            com.google.android.gms.internal.measurement.p r3 = r10.mo50400c(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C14685j
            if (r4 == 0) goto L_0x009f
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.p r11 = (com.google.android.gms.internal.measurement.C14763p) r11
            com.google.android.gms.internal.measurement.p r11 = r10.mo50400c(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.mo50490m()
            if (r11 == 0) goto L_0x0097
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.j r3 = (com.google.android.gms.internal.measurement.C14685j) r3
            int r4 = r9.mo50490m()
            if (r12 == 0) goto L_0x0047
            r5 = r0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = r0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = r1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.p r11 = r9.mo50491n(r5)
            goto L_0x0094
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0096
            boolean r12 = r9.mo50498w(r5)
            if (r12 == 0) goto L_0x0094
            r12 = 4
            com.google.android.gms.internal.measurement.p[] r12 = new com.google.android.gms.internal.measurement.C14763p[r12]
            r12[r0] = r11
            com.google.android.gms.internal.measurement.p r11 = r9.mo50491n(r5)
            r12[r1] = r11
            com.google.android.gms.internal.measurement.i r11 = new com.google.android.gms.internal.measurement.i
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.android.gms.internal.measurement.p r11 = r3.mo50553b(r10, r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r12 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0094:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0096:
            return r11
        L_0x0097:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x009f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0761x.m1728i1(com.google.android.gms.internal.measurement.f, com.google.android.gms.internal.measurement.c3, java.util.ArrayList, boolean):com.google.android.gms.internal.measurement.p");
    }

    /* renamed from: j */
    public static void m1729j(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        C3436p.m8232F(iArr, iArr3);
        while (true) {
            m1661D(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3436p.m8232F(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: j0 */
    public static void m1730j0(Activity activity) {
        if (activity != null) {
            Application application = activity.getApplication();
            if (application instanceof C18335a) {
                m1735n0(activity, (C18335a) application);
            } else {
                throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C18335a.class.getCanonicalName()}));
            }
        } else {
            throw new NullPointerException("activity");
        }
    }

    /* renamed from: k0 */
    public static void m1731k0(Fragment fragment) {
        C18335a aVar;
        if (fragment != null) {
            Fragment fragment2 = fragment;
            while (true) {
                fragment2 = fragment2.getParentFragment();
                if (fragment2 != null) {
                    if (fragment2 instanceof C18335a) {
                        aVar = (C18335a) fragment2;
                        break;
                    }
                } else {
                    Activity activity = fragment.getActivity();
                    if (activity instanceof C18335a) {
                        aVar = (C18335a) activity;
                    } else if (activity.getApplication() instanceof C18335a) {
                        aVar = (C18335a) activity.getApplication();
                    } else {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
                    }
                }
            }
            if (Log.isLoggable("dagger.android", 3)) {
                Log.d("dagger.android", String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), aVar.getClass().getCanonicalName()}));
            }
            m1735n0(fragment, aVar);
            return;
        }
        throw new NullPointerException("fragment");
    }

    /* renamed from: l0 */
    public static void m1732l0(Service service) {
        if (service != null) {
            Application application = service.getApplication();
            if (application instanceof C18335a) {
                m1735n0(service, (C18335a) application);
            } else {
                throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C18335a.class.getCanonicalName()}));
            }
        } else {
            throw new NullPointerException("service");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r12 == 0) goto L_0x0036;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1733m(int r12, int[] r13) {
        /*
            r0 = 5
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r12 == 0) goto L_0x0036
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r12
            long r6 = r6 & r4
            long r6 = r6 * r2
            r12 = 0
            r2 = r13[r12]
            long r2 = (long) r2
            long r2 = r2 & r4
            long r6 = r6 + r2
            r2 = 0
            long r6 = r6 + r2
            int r8 = (int) r6
            r13[r12] = r8
            r8 = 32
            long r6 = r6 >>> r8
            r9 = 1
            r10 = r13[r9]
            long r10 = (long) r10
            long r4 = r4 & r10
            long r6 = r6 + r4
            int r4 = (int) r6
            r13[r9] = r4
            long r4 = r6 >>> r8
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            r12 = 2
            int r12 = androidx.datastore.preferences.protobuf.C2606m.m6155u(r0, r13, r12)
        L_0x0034:
            if (r12 != 0) goto L_0x0044
        L_0x0036:
            r12 = 4
            r12 = r13[r12]
            r2 = -1
            if (r12 != r2) goto L_0x0047
            int[] r12 = f1563g
            boolean r12 = androidx.preference.C3039b.m7147Q(r13, r12)
            if (r12 == 0) goto L_0x0047
        L_0x0044:
            androidx.datastore.preferences.protobuf.C2606m.m6158x(r0, r1, r13)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0761x.m1733m(int, int[]):void");
    }

    /* renamed from: m0 */
    public static void m1734m0(BroadcastReceiver broadcastReceiver, Context context) {
        if (broadcastReceiver == null) {
            throw new NullPointerException("broadcastReceiver");
        } else if (context != null) {
            Application application = (Application) context.getApplicationContext();
            if (application instanceof C18335a) {
                m1735n0(broadcastReceiver, (C18335a) application);
            } else {
                throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C18335a.class.getCanonicalName()}));
            }
        } else {
            throw new NullPointerException(ResponseConstants.CONTEXT);
        }
    }

    /* renamed from: n0 */
    public static void m1735n0(Object obj, C18335a aVar) {
        C17550a<Object> androidInjector = aVar.androidInjector();
        C17782b.m29836D(androidInjector, "%s.androidInjector() returned null", aVar.getClass());
        androidInjector.mo1133h(obj);
    }

    /* renamed from: o */
    public static void m1736o(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        C3039b.m7161e0(iArr, iArr3);
        while (true) {
            m1663E(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3039b.m7161e0(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: o0 */
    public static boolean m1737o0(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: p0 */
    public static boolean m1738p0(char c) {
        return (c == 13 || c == '*' || c == '>') || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: q */
    public static final int m1739q(List list, C19861p pVar, C19861p pVar2, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        boolean z = true;
        if (layoutOrientation == layoutOrientation2) {
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                C1681g gVar = (C1681g) list.get(i5);
                float g0 = m1722g0(m1701X(gVar));
                int intValue = ((Number) pVar.invoke(gVar, Integer.valueOf(i))).intValue();
                if (g0 == 0.0f) {
                    i4 += intValue;
                } else if (g0 > 0.0f) {
                    f += g0;
                    i3 = Math.max(i3, C7279a.m13954l(((float) intValue) / g0));
                }
            }
            return ((list.size() - 1) * i2) + C7279a.m13954l(((float) i3) * f) + i4;
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        int i6 = 0;
        float f2 = 0.0f;
        for (int i7 = 0; i7 < size2; i7++) {
            C1681g gVar2 = (C1681g) list.get(i7);
            float g02 = m1722g0(m1701X(gVar2));
            if (g02 == 0.0f) {
                int min2 = Math.min(((Number) pVar2.invoke(gVar2, Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER))).intValue(), i - min);
                min += min2;
                i6 = Math.max(i6, ((Number) pVar.invoke(gVar2, Integer.valueOf(min2))).intValue());
            } else if (g02 > 0.0f) {
                f2 += g02;
            }
        }
        if (f2 != 0.0f) {
            z = false;
        }
        int l = z ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : C7279a.m13954l(((float) Math.max(i - min, 0)) / f2);
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            C1681g gVar3 = (C1681g) list.get(i8);
            float g03 = m1722g0(m1701X(gVar3));
            if (g03 > 0.0f) {
                i6 = Math.max(i6, ((Number) pVar.invoke(gVar3, Integer.valueOf(l != Integer.MAX_VALUE ? C7279a.m13954l(((float) l) * g03) : Integer.MAX_VALUE))).intValue());
            }
        }
        return i6;
    }

    /* renamed from: q0 */
    public static final boolean m1740q0(C8346e eVar) {
        C19383o.m32797g(eVar, "<this>");
        if (C8341a.m16635b(eVar.f18309e) == C8341a.m16636c(eVar.f18309e)) {
            if (C8341a.m16635b(eVar.f18309e) == C8341a.m16635b(eVar.f18310f)) {
                if (C8341a.m16635b(eVar.f18309e) == C8341a.m16636c(eVar.f18310f)) {
                    if (C8341a.m16635b(eVar.f18309e) == C8341a.m16635b(eVar.f18311g)) {
                        if (C8341a.m16635b(eVar.f18309e) == C8341a.m16636c(eVar.f18311g)) {
                            if (C8341a.m16635b(eVar.f18309e) == C8341a.m16635b(eVar.f18312h)) {
                                if (C8341a.m16635b(eVar.f18309e) == C8341a.m16636c(eVar.f18312h)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: r0 */
    public static String m1741r0(Collection collection) {
        if (collection == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C17782b.m29832B(!TextUtils.isEmpty(str), "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }

    /* renamed from: s */
    public static final float m1742s(float f) {
        return Math.signum(f) * ((float) Math.sqrt((double) (Math.abs(f) * ((float) 2))));
    }

    /* renamed from: s0 */
    public static final C0414b0 m1743s0(C19857l lVar) {
        C19383o.m32797g(lVar, "init");
        C0414b0.C0416b bVar = new C0414b0.C0416b();
        lVar.invoke(bVar);
        return new C0414b0(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getProfile();
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0176  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt m1744t(com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3 r27) {
        /*
            com.etsy.android.lib.models.pastpurchase.Seller r0 = r27.getSeller()
            if (r0 == 0) goto L_0x0011
            com.etsy.android.lib.models.pastpurchase.Profile r0 = r0.getProfile()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.getFirstName()
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            com.etsy.android.lib.models.pastpurchase.Seller r2 = r27.getSeller()
            if (r2 == 0) goto L_0x0023
            com.etsy.android.lib.models.pastpurchase.Profile r2 = r2.getProfile()
            if (r2 == 0) goto L_0x0023
            java.lang.String r2 = r2.getLastName()
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            com.etsy.android.lib.models.pastpurchase.Seller r3 = r27.getSeller()
            if (r3 == 0) goto L_0x0035
            com.etsy.android.lib.models.pastpurchase.Profile r3 = r3.getProfile()
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = r3.getLoginName()
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            com.etsy.android.lib.models.pastpurchase.Seller r4 = r27.getSeller()
            if (r4 == 0) goto L_0x0047
            com.etsy.android.lib.models.pastpurchase.Profile r4 = r4.getProfile()
            if (r4 == 0) goto L_0x0047
            java.lang.String r4 = r4.getImageUrl75x75()
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            com.etsy.android.lib.models.pastpurchase.PastPurchaseUserProfile r5 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseUserProfile
            r5.<init>(r4, r0, r2, r3)
            com.etsy.android.lib.models.pastpurchase.Seller r0 = r27.getSeller()
            if (r0 == 0) goto L_0x0087
            java.util.List r0 = r0.getShops()
            if (r0 == 0) goto L_0x0087
            java.util.ArrayList r0 = kotlin.collections.C19327t.m32636R0(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x006a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = r0.next()
            com.etsy.android.lib.models.pastpurchase.ShopItem r3 = (com.etsy.android.lib.models.pastpurchase.ShopItem) r3
            com.etsy.android.lib.models.pastpurchase.PastPurchaseShop r4 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseShop
            java.lang.String r6 = r3.getShopName()
            java.lang.String r3 = r3.getIconUrlFullxfull()
            r4.<init>(r6, r3)
            r2.add(r4)
            goto L_0x006a
        L_0x0087:
            r2 = 0
        L_0x0088:
            com.etsy.android.lib.models.pastpurchase.PastPurchaseUser r0 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseUser
            com.etsy.android.lib.models.pastpurchase.Seller r3 = r27.getSeller()
            if (r3 == 0) goto L_0x0095
            java.lang.String r3 = r3.getLoginName()
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            r0.<init>(r3, r5, r2)
            java.util.List r2 = r27.getTransactions()
            r4 = 0
            if (r2 == 0) goto L_0x0191
            java.util.ArrayList r2 = kotlin.collections.C19327t.m32636R0(r2)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r6 = kotlin.collections.C19322o.m32624F0(r2)
            r15.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x00b2:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x018d
            java.lang.Object r6 = r2.next()
            com.etsy.android.lib.models.pastpurchase.Transaction r6 = (com.etsy.android.lib.models.pastpurchase.Transaction) r6
            java.lang.Long r7 = r6.getTransactionId()
            if (r7 == 0) goto L_0x00c9
            long r7 = r7.longValue()
            goto L_0x00ca
        L_0x00c9:
            r7 = r4
        L_0x00ca:
            java.lang.Integer r9 = r6.getQuantity()
            if (r9 == 0) goto L_0x00d5
            int r9 = r9.intValue()
            goto L_0x00d6
        L_0x00d5:
            r9 = 0
        L_0x00d6:
            java.lang.Boolean r10 = r6.isGiftCard()
            if (r10 == 0) goto L_0x00e1
            boolean r10 = r10.booleanValue()
            goto L_0x00e2
        L_0x00e1:
            r10 = 0
        L_0x00e2:
            java.lang.String r11 = r6.getTitle()
            java.lang.String r12 = r6.getPrice()
            java.lang.String r13 = r6.getCurrencyCode()
            java.lang.Boolean r14 = r6.isFeedbackMutable()
            if (r14 == 0) goto L_0x00f9
            boolean r14 = r14.booleanValue()
            goto L_0x00fa
        L_0x00f9:
            r14 = 0
        L_0x00fa:
            java.lang.Long r16 = r6.getListingId()
            if (r16 == 0) goto L_0x015f
            long r18 = r16.longValue()
            com.etsy.android.lib.models.pastpurchase.Listing r16 = r6.getListing()
            if (r16 != 0) goto L_0x010b
            goto L_0x015f
        L_0x010b:
            java.lang.String r20 = r6.getTitle()
            java.lang.Boolean r17 = r16.isPersonalizable()
            if (r17 == 0) goto L_0x011c
            boolean r17 = r17.booleanValue()
            r21 = r17
            goto L_0x011e
        L_0x011c:
            r21 = 0
        L_0x011e:
            java.lang.Boolean r22 = r16.getHasVariations()
            java.lang.Boolean r17 = r16.isDigital()
            if (r17 == 0) goto L_0x012f
            boolean r17 = r17.booleanValue()
            r23 = r17
            goto L_0x0131
        L_0x012f:
            r23 = 0
        L_0x0131:
            java.lang.Boolean r17 = r16.isVintage()
            if (r17 == 0) goto L_0x013e
            boolean r17 = r17.booleanValue()
            r25 = r17
            goto L_0x0140
        L_0x013e:
            r25 = 0
        L_0x0140:
            java.lang.Integer r16 = r16.getState()
            if (r16 == 0) goto L_0x014b
            int r16 = r16.intValue()
            goto L_0x0151
        L_0x014b:
            com.etsy.android.lib.models.pastpurchase.PastPurchasesReceiptListingState r16 = com.etsy.android.lib.models.pastpurchase.PastPurchasesReceiptListingState.UNAVAILABLE
            int r16 = r16.ordinal()
        L_0x0151:
            com.etsy.android.lib.models.pastpurchase.PastPurchasesReceiptListingState[] r17 = com.etsy.android.lib.models.pastpurchase.PastPurchasesReceiptListingState.values()
            r24 = r17[r16]
            com.etsy.android.lib.models.pastpurchase.PastPurchaseListing r16 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseListing
            r17 = r16
            r17.<init>(r18, r20, r21, r22, r23, r24, r25)
            goto L_0x0161
        L_0x015f:
            r17 = 0
        L_0x0161:
            com.etsy.android.lib.models.pastpurchase.ReceiptUserReview r18 = r6.getUserReview()
            com.etsy.android.lib.models.pastpurchase.PastPurchasesGiftCardDesign r16 = r6.getGiftCardDesign()
            com.etsy.android.lib.models.pastpurchase.PastPurchaseMainImage r1 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseMainImage
            com.etsy.android.lib.models.pastpurchase.MainImage r6 = r6.getMainImage()
            if (r6 == 0) goto L_0x0176
            java.lang.String r6 = r6.getUrlFullxfull()
            goto L_0x0177
        L_0x0176:
            r6 = 0
        L_0x0177:
            r1.<init>(r6)
            com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction r6 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction
            r21 = r6
            r3 = r15
            r15 = r1
            r19 = r0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r21
            r3.add(r1)
            r15 = r3
            goto L_0x00b2
        L_0x018d:
            r3 = r15
            r26 = r3
            goto L_0x0193
        L_0x0191:
            r26 = 0
        L_0x0193:
            java.util.List r1 = r27.getShipments()
            if (r1 == 0) goto L_0x0208
            java.util.ArrayList r1 = kotlin.collections.C19327t.m32636R0(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x01aa:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0205
            java.lang.Object r3 = r1.next()
            com.etsy.android.lib.models.pastpurchase.Shipment r3 = (com.etsy.android.lib.models.pastpurchase.Shipment) r3
            java.lang.Long r7 = r3.getReceiptShippingId()
            java.lang.String r8 = r3.getTrackingCode()
            java.lang.String r9 = r3.getTrackingUrl()
            java.lang.String r10 = r3.getCarrierName()
            java.lang.String r11 = r3.getMailClass()
            java.lang.String r12 = r3.getBuyerNote()
            java.lang.Long r6 = r3.getMailingDate()
            if (r6 == 0) goto L_0x01d9
            long r13 = r6.longValue()
            goto L_0x01da
        L_0x01d9:
            r13 = r4
        L_0x01da:
            java.lang.String r16 = r3.getMajorTrackingstate()
            java.lang.String r3 = r3.getCurrentStep()
            if (r3 == 0) goto L_0x01ef
            java.lang.Integer r3 = kotlin.text.C19456j.m33016T0(r3)
            if (r3 == 0) goto L_0x01ef
            int r3 = r3.intValue()
            goto L_0x01f5
        L_0x01ef:
            com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState r3 = com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState.UNKNOWN
            int r3 = r3.ordinal()
        L_0x01f5:
            com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState[] r6 = com.etsy.android.lib.models.pastpurchase.PastPurchaseShippingState.values()
            r15 = r6[r3]
            com.etsy.android.lib.models.pastpurchase.PastPurchaseShipment r3 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseShipment
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16)
            r2.add(r3)
            goto L_0x01aa
        L_0x0205:
            r19 = r2
            goto L_0x020a
        L_0x0208:
            r19 = 0
        L_0x020a:
            java.lang.Long r1 = r27.getReceiptId()
            if (r1 == 0) goto L_0x0216
            long r1 = r1.longValue()
            r7 = r1
            goto L_0x0217
        L_0x0216:
            r7 = r4
        L_0x0217:
            java.lang.Boolean r1 = r27.getWasPaid()
            if (r1 == 0) goto L_0x0223
            boolean r1 = r1.booleanValue()
            r9 = r1
            goto L_0x0224
        L_0x0223:
            r9 = 0
        L_0x0224:
            java.lang.Boolean r1 = r27.getFlaggedForManualFraudReview()
            if (r1 == 0) goto L_0x0230
            boolean r1 = r1.booleanValue()
            r10 = r1
            goto L_0x0231
        L_0x0230:
            r10 = 0
        L_0x0231:
            java.lang.Boolean r11 = r27.getWasGiftCardBalanceApplied()
            java.lang.String r12 = r27.getGrandTotal()
            java.lang.String r13 = r27.getCurrencyCode()
            java.lang.Boolean r1 = r27.getWasShipped()
            if (r1 == 0) goto L_0x0249
            boolean r1 = r1.booleanValue()
            r14 = r1
            goto L_0x024a
        L_0x0249:
            r14 = 0
        L_0x024a:
            java.lang.Boolean r1 = r27.isInPerson()
            if (r1 == 0) goto L_0x0256
            boolean r1 = r1.booleanValue()
            r15 = r1
            goto L_0x0257
        L_0x0256:
            r15 = 0
        L_0x0257:
            java.lang.String r18 = r27.getMultiShopNote()
            java.lang.Long r1 = r27.getCreationTsz()
            if (r1 == 0) goto L_0x0268
            long r1 = r1.longValue()
            r16 = r1
            goto L_0x026a
        L_0x0268:
            r16 = r4
        L_0x026a:
            java.lang.String r24 = r27.getTransparentPriceMessage()
            java.lang.Long r1 = r27.getEstimatedShippedDate()
            if (r1 == 0) goto L_0x027b
            long r1 = r1.longValue()
            r22 = r1
            goto L_0x027d
        L_0x027b:
            r22 = r4
        L_0x027d:
            java.lang.Long r1 = r27.getShippedDate()
            if (r1 == 0) goto L_0x028a
            long r1 = r1.longValue()
            r20 = r1
            goto L_0x028c
        L_0x028a:
            r20 = r4
        L_0x028c:
            com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt r1 = new com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt
            r6 = r1
            r25 = r0
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r22, r24, r25, r26)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0761x.m1744t(com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3):com.etsy.android.lib.models.pastpurchase.PastPurchaseReceipt");
    }

    /* renamed from: t0 */
    public static int m1745t0(int i, int i2, String str) {
        float[] fArr;
        int i3;
        int i4 = i;
        String str2 = str;
        if (i4 >= str.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i5 = 0;
        while (true) {
            int i6 = i4 + i5;
            if (i6 == str.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int U = m1695U(fArr, iArr, bArr);
                int i7 = 0;
                for (int i8 = 0; i8 < 6; i8++) {
                    i7 += bArr[i8];
                }
                if (iArr[0] == U) {
                    return 0;
                }
                if (i7 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i7 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i7 != 1 || bArr[2] <= 0) {
                    return (i7 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = str2.charAt(i6);
            i5++;
            if (charAt >= '0' && charAt <= '9') {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m1737o0(charAt)) {
                float ceil = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m1737o0(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m1737o0(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m1738p0(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m1737o0(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                i3 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i3 = 4;
                if (m1737o0(charAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i5 >= i3) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m1695U(fArr, iArr2, bArr2);
                int i9 = 0;
                for (int i10 = 0; i10 < 6; i10++) {
                    i9 += bArr2[i10];
                }
                int i11 = iArr2[0];
                int i12 = iArr2[5];
                if (i11 < i12 && i11 < iArr2[1] && i11 < iArr2[2] && i11 < iArr2[3] && i11 < iArr2[4]) {
                    return 0;
                }
                if (i12 < i11) {
                    return 5;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    return 5;
                }
                if (i9 == 1 && b4 > 0) {
                    return 4;
                }
                if (i9 == 1 && b2 > 0) {
                    return 2;
                }
                if (i9 == 1 && b3 > 0) {
                    return 3;
                }
                int i13 = iArr2[1];
                int i14 = i13 + 1;
                if (i14 < i11 && i14 < i12 && i14 < iArr2[4] && i14 < iArr2[2]) {
                    int i15 = iArr2[3];
                    if (i13 < i15) {
                        return 1;
                    }
                    if (i13 == i15) {
                        int i16 = i4 + i5 + 1;
                        while (i16 < str.length()) {
                            char charAt2 = str2.charAt(i16);
                            if (!(charAt2 == 13 || charAt2 == '*' || charAt2 == '>')) {
                                if (!m1738p0(charAt2)) {
                                    break;
                                }
                                i16++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public static final LinkedHashMap m1746u(C11015r rVar) {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = rVar.f24423g;
        if (num != null) {
            linkedHashMap.put("limit", num.toString());
        }
        String str = rVar.f24424h;
        boolean z = false;
        if (str == null || str.length() == 0) {
            linkedHashMap.put("keywords", rVar.f24417a);
        }
        String str2 = rVar.f24420d;
        if (str2 != null) {
            linkedHashMap.put("currency", str2);
        }
        if (rVar.f24418b != null) {
            String str3 = rVar.f24424h;
            if (str3 == null || str3.length() == 0) {
                linkedHashMap.put(ResponseConstants.ANCHOR_LISTING_ID, rVar.f24418b);
            }
        }
        linkedHashMap.putAll(rVar.f24421e);
        C10971c cVar = rVar.f24422f;
        if (cVar != null) {
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair(C10971c.m18950a("app_foreground_time"), String.valueOf(cVar.f24330a.f29159e));
            pairArr[1] = new Pair(C10971c.m18950a("app_initial_start_time"), String.valueOf(cVar.f24330a.f29157c));
            pairArr[2] = new Pair(C10971c.m18950a("device_model"), cVar.f24333d);
            String a = C10971c.m18950a("network_type");
            ConnectivityManager connectivityManager = cVar.f24331b.f19159a;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
                z = true;
            }
            pairArr[3] = new Pair(a, z ? "Wifi" : "WWAN");
            map = C19294b0.m32562s0(pairArr);
        } else {
            map = null;
        }
        if (map == null) {
            map = C19294b0.m32559p0();
        }
        linkedHashMap.putAll(map);
        Boolean bool = rVar.f24425i;
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("exclude_listings", rVar.f24425i.toString());
        }
        linkedHashMap.put("with_static_filters", String.valueOf(rVar.f24426j));
        linkedHashMap.put("include_additional_listing_images", String.valueOf(rVar.f24427k));
        Long l = rVar.f24429m;
        if (l != null) {
            l.longValue();
            linkedHashMap.put(SavableSearchQuery.SAVED_SEARCH_ID_FIELD_NAME, rVar.f24429m.toString());
        }
        linkedHashMap.putAll(rVar.f24419c.asMap());
        Boolean bool2 = rVar.f24430n;
        if (bool2 != null) {
            linkedHashMap.put("include_featured_categories", String.valueOf(bool2.booleanValue()));
        }
        linkedHashMap.put("with_deep_facets", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        return linkedHashMap;
    }

    /* renamed from: u0 */
    public static final long m1747u0(long j, float[] fArr) {
        float c = C8343c.m16642c(j);
        float d = C8343c.m16643d(j);
        float f = ((float) 1) / (((fArr[7] * d) + (fArr[3] * c)) + fArr[15]);
        if (!(!Float.isInfinite(f) && !Float.isNaN(f))) {
            f = 0.0f;
        }
        return C19421p.m32952q(((fArr[4] * d) + (fArr[0] * c) + fArr[12]) * f, ((fArr[5] * d) + (fArr[1] * c) + fArr[13]) * f);
    }

    /* renamed from: v */
    public static final void m1748v(C6687f fVar, C1644p pVar) {
        C19383o.m32797g(fVar, "<this>");
        C19383o.m32797g(pVar, "event");
        List list = pVar.f3665j;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1633e eVar = (C1633e) list.get(i);
            long j = eVar.f3627a;
            long j2 = eVar.f3628b;
            int i2 = (fVar.f14757b + 1) % 20;
            fVar.f14757b = i2;
            fVar.f14756a[i2] = new C6683b(j2, j);
        }
        long j3 = pVar.f3657b;
        long j4 = pVar.f3658c;
        int i3 = (fVar.f14757b + 1) % 20;
        fVar.f14757b = i3;
        fVar.f14756a[i3] = new C6683b(j4, j3);
    }

    /* renamed from: v0 */
    public static final void m1749v0(float[] fArr, C8342b bVar) {
        C19383o.m32797g(bVar, "rect");
        long u0 = m1747u0(C19421p.m32952q(bVar.f18291a, bVar.f18292b), fArr);
        long u02 = m1747u0(C19421p.m32952q(bVar.f18291a, bVar.f18294d), fArr);
        long u03 = m1747u0(C19421p.m32952q(bVar.f18293c, bVar.f18292b), fArr);
        long u04 = m1747u0(C19421p.m32952q(bVar.f18293c, bVar.f18294d), fArr);
        bVar.f18291a = Math.min(Math.min(C8343c.m16642c(u0), C8343c.m16642c(u02)), Math.min(C8343c.m16642c(u03), C8343c.m16642c(u04)));
        bVar.f18292b = Math.min(Math.min(C8343c.m16643d(u0), C8343c.m16643d(u02)), Math.min(C8343c.m16643d(u03), C8343c.m16643d(u04)));
        bVar.f18293c = Math.max(Math.max(C8343c.m16642c(u0), C8343c.m16642c(u02)), Math.max(C8343c.m16642c(u03), C8343c.m16642c(u04)));
        bVar.f18294d = Math.max(Math.max(C8343c.m16643d(u0), C8343c.m16643d(u02)), Math.max(C8343c.m16643d(u03), C8343c.m16643d(u04)));
    }

    /* renamed from: w */
    public static final C19662p1 m1750w(StateFlowImpl stateFlowImpl) {
        return new C19662p1(stateFlowImpl, (C19699g1) null);
    }

    /* renamed from: w0 */
    public static final ParcelableSnapshotMutableState m1751w0(Object obj, C1323f1 f1Var) {
        C19383o.m32797g(f1Var, "policy");
        C19285c cVar = ActualAndroid_androidKt.f2681a;
        return new ParcelableSnapshotMutableState(obj, f1Var);
    }

    /* renamed from: x */
    public static void m1752x(int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C2606m.m6159y(7, iArr, 1);
        }
        iArr[7] = (int) (((UnsignedInteger.INT_MASK & ((long) iArr[7])) - 2147483648L) + j2);
    }

    /* renamed from: y */
    public static void m1754y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        C3436p.m8230D(iArr, iArr2, iArr4);
        m1661D(iArr4, iArr3);
    }

    /* renamed from: y0 */
    public static LinkedHashMap m1755y0(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: z */
    public static void m1756z(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        C3039b.m7159c0(iArr, iArr2, iArr4);
        m1663E(iArr4, iArr3);
    }

    /* renamed from: z0 */
    public static final void m1757z0(C19846a aVar, C19857l lVar, C19857l lVar2) {
        C1339j1 j1Var = C1326g1.f2887a;
        C7791c cVar = (C7791c) j1Var.mo5886c();
        try {
            C7791c cVar2 = (C7791c) j1Var.mo5886c();
            if (cVar2 == null) {
                cVar2 = C1318h.f2880c;
            }
            j1Var.mo5887d(cVar2.add(new Pair(lVar, lVar2)));
            aVar.invoke();
            j1Var.mo5887d(cVar);
        } catch (Throwable th) {
            C1326g1.f2887a.mo5887d(cVar);
            throw th;
        }
    }

    /* renamed from: b */
    public Object[] mo4157b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        return (Object[]) C19382n.m32722M0(obj, "makePathElements", List.class, arrayList, File.class, (File) null, List.class, arrayList2);
    }

    /* renamed from: d */
    public boolean mo4158d(ClassLoader classLoader, File file, File file2, boolean z) {
        return C15099u.m24634g(classLoader, file, file2, z, new C17782b(), ResponseConstants.ZIP, new C15588c1());
    }

    /* renamed from: e */
    public void mo4159e(ClassLoader classLoader, HashSet hashSet) {
        C15099u.m24633f(classLoader, hashSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ed  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p699vn.C18667b mo4160f(java.lang.String r19, com.google.zxing.BarcodeFormat r20, java.util.EnumMap r21) {
        /*
            r18 = this;
            r0 = r21
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            com.google.zxing.EncodeHintType r2 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0018
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
        L_0x0018:
            com.google.zxing.EncodeHintType r2 = com.google.zxing.EncodeHintType.ERROR_CORRECTION
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x002d
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
            goto L_0x002f
        L_0x002d:
            r2 = 33
        L_0x002f:
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.AZTEC_LAYERS
            boolean r4 = r0.containsKey(r3)
            r5 = 0
            if (r4 == 0) goto L_0x0045
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            goto L_0x0046
        L_0x0045:
            r0 = r5
        L_0x0046:
            com.google.zxing.BarcodeFormat r3 = com.google.zxing.BarcodeFormat.AZTEC
            r4 = r20
            if (r4 != r3) goto L_0x044d
            r3 = r19
            byte[] r1 = r3.getBytes(r1)
            un.c r3 = new un.c
            r3.<init>(r1)
            un.e r1 = p691un.C18630e.f41137e
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r4 = r5
        L_0x005e:
            byte[] r6 = r3.f41134a
            int r7 = r6.length
            r8 = 3
            r9 = 32
            r10 = 10
            r11 = 4
            r12 = 2
            r13 = 1
            if (r4 >= r7) goto L_0x016e
            int r7 = r4 + 1
            int r14 = r6.length
            if (r7 >= r14) goto L_0x0073
            byte r14 = r6[r7]
            goto L_0x0074
        L_0x0073:
            r14 = r5
        L_0x0074:
            byte r6 = r6[r4]
            r15 = 13
            if (r6 == r15) goto L_0x0093
            r10 = 44
            if (r6 == r10) goto L_0x008f
            r10 = 46
            if (r6 == r10) goto L_0x008b
            r10 = 58
            if (r6 == r10) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            if (r14 != r9) goto L_0x0097
            r6 = 5
            goto L_0x0098
        L_0x008b:
            if (r14 != r9) goto L_0x0097
            r6 = r8
            goto L_0x0098
        L_0x008f:
            if (r14 != r9) goto L_0x0097
            r6 = r11
            goto L_0x0098
        L_0x0093:
            if (r14 != r10) goto L_0x0097
            r6 = r12
            goto L_0x0098
        L_0x0097:
            r6 = r5
        L_0x0098:
            if (r6 <= 0) goto L_0x00ed
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a3:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00e6
            java.lang.Object r10 = r1.next()
            un.e r10 = (p691un.C18630e) r10
            un.e r14 = r10.mo70140b(r4)
            un.e r15 = r14.mo70142d(r11, r6)
            r9.add(r15)
            int r15 = r10.f41138a
            if (r15 == r11) goto L_0x00c5
            un.e r15 = r14.mo70143e(r11, r6)
            r9.add(r15)
        L_0x00c5:
            if (r6 == r8) goto L_0x00c9
            if (r6 != r11) goto L_0x00d6
        L_0x00c9:
            int r15 = 16 - r6
            un.e r14 = r14.mo70142d(r12, r15)
            un.e r14 = r14.mo70142d(r12, r13)
            r9.add(r14)
        L_0x00d6:
            int r14 = r10.f41140c
            if (r14 <= 0) goto L_0x00a3
            un.e r10 = r10.mo70139a(r4)
            un.e r10 = r10.mo70139a(r7)
            r9.add(r10)
            goto L_0x00a3
        L_0x00e6:
            java.util.LinkedList r1 = p691un.C18628c.m31414a(r9)
            r4 = r7
            goto L_0x016b
        L_0x00ed:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f6:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0167
            java.lang.Object r7 = r1.next()
            un.e r7 = (p691un.C18630e) r7
            byte[] r8 = r3.f41134a
            byte r8 = r8[r4]
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            int[][] r9 = p691un.C18628c.f41132d
            int r10 = r7.f41138a
            r9 = r9[r10]
            r9 = r9[r8]
            if (r9 <= 0) goto L_0x0115
            r9 = r13
            goto L_0x0116
        L_0x0115:
            r9 = r5
        L_0x0116:
            r10 = 0
            r14 = r5
        L_0x0118:
            if (r14 > r11) goto L_0x014f
            int[][] r11 = p691un.C18628c.f41132d
            r11 = r11[r14]
            r11 = r11[r8]
            if (r11 <= 0) goto L_0x014a
            if (r10 != 0) goto L_0x0128
            un.e r10 = r7.mo70140b(r4)
        L_0x0128:
            if (r9 == 0) goto L_0x0130
            int r15 = r7.f41138a
            if (r14 == r15) goto L_0x0130
            if (r14 != r12) goto L_0x0137
        L_0x0130:
            un.e r12 = r10.mo70142d(r14, r11)
            r6.add(r12)
        L_0x0137:
            if (r9 != 0) goto L_0x014a
            int[][] r12 = p691un.C18628c.f41133e
            int r15 = r7.f41138a
            r12 = r12[r15]
            r12 = r12[r14]
            if (r12 < 0) goto L_0x014a
            un.e r11 = r10.mo70143e(r14, r11)
            r6.add(r11)
        L_0x014a:
            int r14 = r14 + 1
            r11 = 4
            r12 = 2
            goto L_0x0118
        L_0x014f:
            int r9 = r7.f41140c
            if (r9 > 0) goto L_0x015d
            int[][] r9 = p691un.C18628c.f41132d
            int r10 = r7.f41138a
            r9 = r9[r10]
            r8 = r9[r8]
            if (r8 != 0) goto L_0x0164
        L_0x015d:
            un.e r7 = r7.mo70139a(r4)
            r6.add(r7)
        L_0x0164:
            r11 = 4
            r12 = 2
            goto L_0x00f6
        L_0x0167:
            java.util.LinkedList r1 = p691un.C18628c.m31414a(r6)
        L_0x016b:
            int r4 = r4 + r13
            goto L_0x005e
        L_0x016e:
            un.b r4 = new un.b
            r4.<init>()
            java.lang.Object r1 = java.util.Collections.min(r1, r4)
            un.e r1 = (p691un.C18630e) r1
            byte[] r3 = r3.f41134a
            r1.getClass()
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            int r6 = r3.length
            un.e r1 = r1.mo70140b(r6)
            un.f r1 = r1.f41139b
        L_0x018a:
            if (r1 == 0) goto L_0x0192
            r4.addFirst(r1)
            un.f r1 = r1.f41143a
            goto L_0x018a
        L_0x0192:
            vn.a r1 = new vn.a
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x019b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01ab
            java.lang.Object r6 = r4.next()
            un.f r6 = (p691un.C18631f) r6
            r6.mo70135a(r1, r3)
            goto L_0x019b
        L_0x01ab:
            int r3 = r1.f41277c
            r4 = 100
            r6 = 11
            int r2 = android.support.p013v4.media.C0072d.m196b(r2, r3, r4, r6)
            int r3 = r3 + r2
            if (r0 == 0) goto L_0x020c
            if (r0 >= 0) goto L_0x01bc
            r3 = r13
            goto L_0x01bd
        L_0x01bc:
            r3 = r5
        L_0x01bd:
            int r4 = java.lang.Math.abs(r0)
            if (r3 == 0) goto L_0x01c4
            r9 = 4
        L_0x01c4:
            if (r4 > r9) goto L_0x01f8
            if (r3 == 0) goto L_0x01cb
            r0 = 88
            goto L_0x01cd
        L_0x01cb:
            r0 = 112(0x70, float:1.57E-43)
        L_0x01cd:
            int r5 = r4 << 4
            int r0 = r0 + r5
            int r0 = r0 * r4
            int[] r5 = p610kp.C18161c.f39719w1
            r5 = r5[r4]
            int r7 = r0 % r5
            int r7 = r0 - r7
            vn.a r1 = p610kp.C18161c.m30671p(r5, r1)
            int r8 = r1.f41277c
            int r2 = r2 + r8
            java.lang.String r9 = "Data to large for user specified layer"
            if (r2 > r7) goto L_0x01f2
            if (r3 == 0) goto L_0x0254
            int r2 = r5 << 6
            if (r8 > r2) goto L_0x01ec
            goto L_0x0254
        L_0x01ec:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01f8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r5] = r0
            java.lang.String r0 = "Illegal value %s for layers"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x020c:
            r0 = 0
            r4 = r5
            r7 = r4
        L_0x020f:
            if (r5 > r9) goto L_0x0445
            if (r5 > r8) goto L_0x0214
            r4 = r13
        L_0x0214:
            if (r4 == 0) goto L_0x0219
            int r8 = r5 + 1
            goto L_0x021a
        L_0x0219:
            r8 = r5
        L_0x021a:
            if (r4 == 0) goto L_0x021f
            r10 = 88
            goto L_0x0221
        L_0x021f:
            r10 = 112(0x70, float:1.57E-43)
        L_0x0221:
            int r11 = r8 << 4
            int r10 = r10 + r11
            int r10 = r10 * r8
            if (r3 > r10) goto L_0x043f
            if (r0 == 0) goto L_0x022f
            int[] r11 = p610kp.C18161c.f39719w1
            r11 = r11[r8]
            if (r7 == r11) goto L_0x023c
        L_0x022f:
            int[] r0 = p610kp.C18161c.f39719w1
            r0 = r0[r8]
            vn.a r7 = p610kp.C18161c.m30671p(r0, r1)
            r17 = r7
            r7 = r0
            r0 = r17
        L_0x023c:
            int r11 = r10 % r7
            int r11 = r10 - r11
            if (r4 == 0) goto L_0x0248
            int r12 = r0.f41277c
            int r14 = r7 << 6
            if (r12 > r14) goto L_0x043f
        L_0x0248:
            int r12 = r0.f41277c
            int r12 = r12 + r2
            if (r12 <= r11) goto L_0x024f
            goto L_0x043f
        L_0x024f:
            r1 = r0
            r3 = r4
            r5 = r7
            r4 = r8
            r0 = r10
        L_0x0254:
            vn.a r0 = p610kp.C18161c.m30669m(r1, r0, r5)
            int r1 = r1.f41277c
            int r1 = r1 / r5
            vn.a r2 = new vn.a
            r2.<init>()
            if (r3 == 0) goto L_0x0276
            int r5 = r4 + -1
            r7 = 2
            r2.mo70167b(r5, r7)
            int r1 = r1 + -1
            r5 = 6
            r2.mo70167b(r1, r5)
            r1 = 28
            r5 = 4
            vn.a r1 = p610kp.C18161c.m30669m(r2, r1, r5)
            goto L_0x0288
        L_0x0276:
            r5 = 4
            int r7 = r4 + -1
            r8 = 5
            r2.mo70167b(r7, r8)
            int r1 = r1 + -1
            r2.mo70167b(r1, r6)
            r1 = 40
            vn.a r1 = p610kp.C18161c.m30669m(r2, r1, r5)
        L_0x0288:
            if (r3 == 0) goto L_0x028b
            goto L_0x028d
        L_0x028b:
            r6 = 14
        L_0x028d:
            int r2 = r4 << 2
            int r6 = r6 + r2
            int[] r2 = new int[r6]
            if (r3 == 0) goto L_0x029e
            r5 = 0
        L_0x0295:
            if (r5 >= r6) goto L_0x029c
            r2[r5] = r5
            int r5 = r5 + 1
            goto L_0x0295
        L_0x029c:
            r8 = r6
            goto L_0x02c2
        L_0x029e:
            int r5 = r6 + 1
            int r7 = r6 / 2
            int r8 = r7 + -1
            int r8 = r8 / 15
            int r8 = r8 * 2
            int r8 = r8 + r5
            int r5 = r8 / 2
            r9 = 0
        L_0x02ac:
            if (r9 >= r7) goto L_0x02c2
            int r10 = r9 / 15
            int r10 = r10 + r9
            int r11 = r7 - r9
            int r11 = r11 - r13
            int r12 = r5 - r10
            int r12 = r12 - r13
            r2[r11] = r12
            int r11 = r7 + r9
            int r10 = r10 + r5
            int r10 = r10 + r13
            r2[r11] = r10
            int r9 = r9 + 1
            goto L_0x02ac
        L_0x02c2:
            vn.b r5 = new vn.b
            r5.<init>(r8, r8)
            r7 = 0
            r9 = 0
        L_0x02c9:
            if (r7 >= r4) goto L_0x0351
            int r10 = r4 - r7
            int r10 = r10 << 2
            if (r3 == 0) goto L_0x02d4
            r11 = 9
            goto L_0x02d6
        L_0x02d4:
            r11 = 12
        L_0x02d6:
            int r10 = r10 + r11
            r11 = 0
        L_0x02d8:
            if (r11 >= r10) goto L_0x034a
            int r12 = r11 << 1
            r13 = 0
        L_0x02dd:
            r14 = 2
            if (r13 >= r14) goto L_0x0347
            int r14 = r9 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo70170d(r14)
            if (r14 == 0) goto L_0x02f5
            int r14 = r7 << 1
            int r15 = r14 + r13
            r15 = r2[r15]
            int r14 = r14 + r11
            r14 = r2[r14]
            r5.mo70175b(r15, r14)
        L_0x02f5:
            int r14 = r10 << 1
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo70170d(r14)
            if (r14 == 0) goto L_0x0311
            int r14 = r7 << 1
            int r15 = r14 + r11
            r15 = r2[r15]
            int r16 = r6 + -1
            int r16 = r16 - r14
            int r16 = r16 - r13
            r14 = r2[r16]
            r5.mo70175b(r15, r14)
        L_0x0311:
            int r14 = r10 << 2
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo70170d(r14)
            if (r14 == 0) goto L_0x032b
            int r14 = r6 + -1
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r15 = r14 - r13
            r15 = r2[r15]
            int r14 = r14 - r11
            r14 = r2[r14]
            r5.mo70175b(r15, r14)
        L_0x032b:
            int r14 = r10 * 6
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo70170d(r14)
            if (r14 == 0) goto L_0x0344
            int r14 = r6 + -1
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r14 = r14 - r11
            r14 = r2[r14]
            int r15 = r15 + r13
            r15 = r2[r15]
            r5.mo70175b(r14, r15)
        L_0x0344:
            int r13 = r13 + 1
            goto L_0x02dd
        L_0x0347:
            int r11 = r11 + 1
            goto L_0x02d8
        L_0x034a:
            int r10 = r10 << 3
            int r9 = r9 + r10
            int r7 = r7 + 1
            goto L_0x02c9
        L_0x0351:
            int r0 = r8 / 2
            r2 = 7
            if (r3 == 0) goto L_0x0391
            r4 = 0
        L_0x0357:
            if (r4 >= r2) goto L_0x03d1
            int r7 = r0 + -3
            int r7 = r7 + r4
            boolean r9 = r1.mo70170d(r4)
            if (r9 == 0) goto L_0x0367
            int r9 = r0 + -5
            r5.mo70175b(r7, r9)
        L_0x0367:
            int r9 = r4 + 7
            boolean r9 = r1.mo70170d(r9)
            if (r9 == 0) goto L_0x0374
            int r9 = r0 + 5
            r5.mo70175b(r9, r7)
        L_0x0374:
            int r9 = 20 - r4
            boolean r9 = r1.mo70170d(r9)
            if (r9 == 0) goto L_0x0381
            int r9 = r0 + 5
            r5.mo70175b(r7, r9)
        L_0x0381:
            int r9 = 27 - r4
            boolean r9 = r1.mo70170d(r9)
            if (r9 == 0) goto L_0x038e
            int r9 = r0 + -5
            r5.mo70175b(r9, r7)
        L_0x038e:
            int r4 = r4 + 1
            goto L_0x0357
        L_0x0391:
            r4 = 0
            r7 = 10
        L_0x0394:
            if (r4 >= r7) goto L_0x03d1
            int r9 = r0 + -5
            int r9 = r9 + r4
            int r10 = r4 / 5
            int r10 = r10 + r9
            boolean r9 = r1.mo70170d(r4)
            if (r9 == 0) goto L_0x03a7
            int r9 = r0 + -7
            r5.mo70175b(r10, r9)
        L_0x03a7:
            int r9 = r4 + 10
            boolean r9 = r1.mo70170d(r9)
            if (r9 == 0) goto L_0x03b4
            int r9 = r0 + 7
            r5.mo70175b(r9, r10)
        L_0x03b4:
            int r9 = 29 - r4
            boolean r9 = r1.mo70170d(r9)
            if (r9 == 0) goto L_0x03c1
            int r9 = r0 + 7
            r5.mo70175b(r10, r9)
        L_0x03c1:
            int r9 = 39 - r4
            boolean r9 = r1.mo70170d(r9)
            if (r9 == 0) goto L_0x03ce
            int r9 = r0 + -7
            r5.mo70175b(r9, r10)
        L_0x03ce:
            int r4 = r4 + 1
            goto L_0x0394
        L_0x03d1:
            if (r3 == 0) goto L_0x03d8
            r1 = 5
            p610kp.C18161c.m30668l(r5, r0, r1)
            goto L_0x03ff
        L_0x03d8:
            p610kp.C18161c.m30668l(r5, r0, r2)
            r1 = 0
            r2 = 0
        L_0x03dd:
            int r3 = r6 / 2
            int r3 = r3 + -1
            if (r1 >= r3) goto L_0x03ff
            r3 = r0 & 1
        L_0x03e5:
            if (r3 >= r8) goto L_0x03fa
            int r4 = r0 - r2
            r5.mo70175b(r4, r3)
            int r7 = r0 + r2
            r5.mo70175b(r7, r3)
            r5.mo70175b(r3, r4)
            r5.mo70175b(r3, r7)
            int r3 = r3 + 2
            goto L_0x03e5
        L_0x03fa:
            int r1 = r1 + 15
            int r2 = r2 + 16
            goto L_0x03dd
        L_0x03ff:
            int r0 = r5.f41278b
            int r1 = r5.f41279c
            r2 = 200(0xc8, float:2.8E-43)
            int r3 = java.lang.Math.max(r2, r0)
            int r2 = java.lang.Math.max(r2, r1)
            int r4 = r3 / r0
            int r6 = r2 / r1
            int r4 = java.lang.Math.min(r4, r6)
            int r6 = r0 * r4
            int r6 = r3 - r6
            int r6 = r6 / 2
            int r7 = r1 * r4
            int r7 = r2 - r7
            int r7 = r7 / 2
            vn.b r8 = new vn.b
            r8.<init>(r3, r2)
            r2 = 0
        L_0x0427:
            if (r2 >= r1) goto L_0x043e
            r3 = 0
            r9 = r6
        L_0x042b:
            if (r3 >= r0) goto L_0x043a
            boolean r10 = r5.mo70174a(r3, r2)
            if (r10 == 0) goto L_0x0436
            r8.mo70176c(r9, r7, r4, r4)
        L_0x0436:
            int r3 = r3 + 1
            int r9 = r9 + r4
            goto L_0x042b
        L_0x043a:
            int r2 = r2 + 1
            int r7 = r7 + r4
            goto L_0x0427
        L_0x043e:
            return r8
        L_0x043f:
            int r5 = r5 + 1
            r4 = 0
            r8 = 3
            goto L_0x020f
        L_0x0445:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
        L_0x044d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r2 = "Can only encode AZTEC, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0761x.mo4160f(java.lang.String, com.google.zxing.BarcodeFormat, java.util.EnumMap):vn.b");
    }

    /* renamed from: i */
    public Object mo1134i() {
        return new ArrayDeque();
    }

    /* renamed from: k */
    public C6051s mo4161k(C6051s sVar, C7114e eVar) {
        return sVar;
    }

    /* renamed from: l */
    public void mo4162l(C18364t tVar) {
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        Class<C12997a> cls;
        if (z) {
            AtomicBoolean atomicBoolean = C12999b.f28620a;
            Class<C12999b> cls2 = C12999b.class;
            synchronized (cls2) {
                if (!C13080a.m20762b(cls2)) {
                    try {
                        if (!C12999b.f28620a.getAndSet(true)) {
                            String str = C13418j.f29381a;
                            if (C13442y.m21140c()) {
                                C12999b.m20709a();
                            }
                            int i = C12997a.f28615a;
                            cls = C12997a.class;
                            if (!C13080a.m20762b(cls)) {
                                C12997a.f28616b.scheduleAtFixedRate(C12997a.f28618d, 0, (long) 500, TimeUnit.MILLISECONDS);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C13080a.m20761a(cls2, th);
                    }
                } else {
                    return;
                }
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: p */
    public void mo4163p() {
    }

    /* renamed from: r */
    public C18368v mo4164r(int i, int i2) {
        return new C18348g();
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().zzk());
    }
}
