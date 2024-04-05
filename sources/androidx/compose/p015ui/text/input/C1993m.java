package androidx.compose.p015ui.text.input;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.animation.core.C0432j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.OffsetPxModifier;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1691k;
import androidx.compose.p015ui.layout.C1693l;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C1936e;
import androidx.compose.p015ui.text.C2012n;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.runtime.C1302d;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.p044ui.actions.brazeactions.steps.C5628b;
import com.braze.p044ui.actions.brazeactions.steps.StepData;
import com.etsy.android.R;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.dialog.SingleListingCheckoutStandalonePayPalSADialog;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.user.inappnotifications.C11540a;
import com.etsy.android.share.SocialShareBroadcastReceiver;
import com.google.android.gms.internal.icing.C14536p1;
import com.google.android.gms.internal.icing.C14540q1;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.play.core.assetpacks.C15579a0;
import com.google.android.play.core.assetpacks.C15675y0;
import com.google.android.play.core.internal.C15689e;
import com.google.android.play.core.internal.C15704p;
import com.google.android.play.core.internal.zzo;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.zhuinden.simplestack.C17530g;
import dagger.android.C17550a;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlin.sequences.C19432h;
import kotlin.sequences.C19434j;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import kotlinx.coroutines.C19527d2;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19754l0;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.internal.C19722g;
import kotlinx.coroutines.internal.ThreadContextKt;
import okhttp3.C19989m;
import p003a2.C0023f;
import p174m0.C7294l;
import p287xp.C8337e;
import p287xp.C8339g;
import p289y0.C8351c;
import p306z8.C8474a;
import p309ad.C8509e;
import p343ee.C12693a;
import p507al.C14024b;
import p568fn.C17782b;
import p634np.C18290b;
import p649pm.C18400e;
import p649pm.C18415r;
import p743fr.C19056s;
import p753kq.C19857l;
import p756lr.C19893f;
import p762or.C20024c;

/* renamed from: androidx.compose.ui.text.input.m */
public class C1993m implements C8509e, C18400e, C18290b, C17550a, C5628b, C19989m.C19991b, C14941c2, C15689e, C15579a0, C15704p, C17530g, C12693a, C19056s {

    /* renamed from: A */
    public static final int[] f4486A = {R.attr.com_facebook_auxiliary_view_position, R.attr.com_facebook_foreground_color, R.attr.com_facebook_horizontal_alignment, R.attr.com_facebook_object_id, R.attr.com_facebook_object_type, R.attr.com_facebook_style};

    /* renamed from: b */
    public static final /* synthetic */ C1993m f4487b = new C1993m();

    /* renamed from: c */
    public static final C1993m f4488c = new C1993m();

    /* renamed from: d */
    public static final int[] f4489d = {R.attr.isExpanded};

    /* renamed from: e */
    public static final int[] f4490e = {R.attr.horizontalSpacing, R.attr.itemSpacing, R.attr.lineSpacing, R.attr.verticalSpacing, R.attr.verticallyCenterRow};

    /* renamed from: f */
    public static final int[] f4491f = {R.attr.layout_breakLine};

    /* renamed from: g */
    public static final int[] f4492g = {R.attr.foreground};

    /* renamed from: h */
    public static final int[] f4493h = {R.attr.imageAspect};

    /* renamed from: i */
    public static final int[] f4494i = {R.attr.doMaintainAspect, R.attr.heightRatio};

    /* renamed from: j */
    public static final int[] f4495j = {R.attr.img};

    /* renamed from: k */
    public static final int[] f4496k = {16842927, R.attr.disclaimerText, R.attr.textColor, R.attr.textSize};

    /* renamed from: l */
    public static final int[] f4497l = {R.attr.maxWidth};

    /* renamed from: m */
    public static final int[] f4498m = {R.attr.isEditable, R.attr.rating_int, R.attr.starSize, R.attr.starSpacing, R.attr.useNoPaddingStar};

    /* renamed from: n */
    public static final int[] f4499n = {R.attr.stepCount, R.attr.stepRadius, R.attr.trackHeight, R.attr.traversedStepColor, R.attr.untraversedStepColor};

    /* renamed from: o */
    public static final C1993m f4500o = new C1993m();

    /* renamed from: p */
    public static WeakReference f4501p;

    /* renamed from: q */
    public static volatile C8339g f4502q;

    /* renamed from: r */
    public static volatile C8339g f4503r;

    /* renamed from: s */
    public static final C14536p1 f4504s = new C14536p1();

    /* renamed from: t */
    public static final C14540q1 f4505t = new C14540q1();

    /* renamed from: u */
    public static final /* synthetic */ C1993m f4506u = new C1993m();

    /* renamed from: v */
    public static final /* synthetic */ C1993m f4507v = new C1993m();

    /* renamed from: w */
    public static final /* synthetic */ C1993m f4508w = new C1993m();

    /* renamed from: x */
    public static final C15675y0 f4509x = new C15675y0();

    /* renamed from: y */
    public static final C17782b f4510y = new C17782b();

    /* renamed from: z */
    public static final boolean[][] f4511z = {new boolean[]{true, true, false, false, false, false, false, false, false, false}, new boolean[]{true, true, true, false, false, false, false, false, false, false}, new boolean[]{true, true, true, true, false, false, false, false, false, false}, new boolean[]{true, true, true, false, true, false, true, false, false, false}, new boolean[]{false, true, false, true, true, true, true, true, true, false}, new boolean[]{true, true, true, true, true, true, true, true, true, false}, new boolean[]{false, false, false, false, false, false, false, false, false, true}, new boolean[]{false, true, false, false, false, false, true, true, true, false}, new boolean[]{false, true, false, false, false, false, false, true, true, true}, new boolean[]{true, true, true, false, true, false, true, true, false, false}};

    /* renamed from: A */
    public static final int m4340A(int i, ArrayList arrayList) {
        C19383o.m32797g(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C1936e eVar = (C1936e) arrayList.get(i3);
            char c = eVar.f4369b > i ? 1 : eVar.f4370c <= i ? (char) 65535 : 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: B */
    public static final int m4341B(int i, ArrayList arrayList) {
        C19383o.m32797g(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C1936e eVar = (C1936e) arrayList.get(i3);
            char c = eVar.f4371d > i ? 1 : eVar.f4372e <= i ? (char) 65535 : 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: C */
    public static final int m4342C(ArrayList arrayList, float f) {
        C19383o.m32797g(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C1936e eVar = (C1936e) arrayList.get(i2);
            char c = eVar.f4373f > f ? 1 : eVar.f4374g <= f ? (char) 65535 : 0;
            if (c < 0) {
                i = i2 + 1;
            } else if (c <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: D */
    public static int m4343D(int i, Context context, int i2) {
        TypedValue a = C14024b.m21580a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: E */
    public static int m4344E(int i, View view) {
        return C14024b.m21581b(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: F */
    public static final C19699g1 m4345F(CoroutineContext coroutineContext) {
        int i = C19699g1.f43634d1;
        C19699g1 g1Var = (C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b);
        if (g1Var != null) {
            return g1Var;
        }
        throw new IllegalStateException(C19383o.m32802l(coroutineContext, "Current context doesn't contain Job in it: ").toString());
    }

    /* renamed from: G */
    public static final Object m4346G(C1710u uVar) {
        C19383o.m32797g(uVar, "<this>");
        Object f = uVar.mo6666f();
        C1693l lVar = f instanceof C1693l ? (C1693l) f : null;
        if (lVar != null) {
            return lVar.mo6691a();
        }
        return null;
    }

    /* renamed from: H */
    public static final int m4347H(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            int i7 = -i3;
            int i8 = i % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i2 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i10 = (i8 - i9) % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            return i2 + i10;
        }
    }

    /* renamed from: I */
    public static final long m4348I(long j, long j2, long j3) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (j >= j2) {
                return j2;
            }
            long j4 = j2 % j3;
            if (j4 < 0) {
                j4 += j3;
            }
            long j5 = j % j3;
            if (j5 < 0) {
                j5 += j3;
            }
            long j6 = (j4 - j5) % j3;
            if (j6 < 0) {
                j6 += j3;
            }
            return j2 - j6;
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (j <= j2) {
            return j2;
        } else {
            long j7 = -j3;
            long j8 = j % j7;
            if (j8 < 0) {
                j8 += j7;
            }
            long j9 = j2 % j7;
            if (j9 < 0) {
                j9 += j7;
            }
            long j10 = (j8 - j9) % j7;
            if (j10 < 0) {
                j10 += j7;
            }
            return j2 + j10;
        }
    }

    /* renamed from: J */
    public static final C1913a m4349J(TextFieldValue textFieldValue) {
        C19383o.m32797g(textFieldValue, "<this>");
        C1913a aVar = textFieldValue.f4448a;
        long j = textFieldValue.f4449b;
        aVar.getClass();
        return aVar.subSequence(C2022r.m4466e(j), C2022r.m4465d(j));
    }

    /* renamed from: K */
    public static final String m4350K(int i, C1302d dVar) {
        String str;
        dVar.mo5465u(-726638443);
        dVar.mo5410J(AndroidCompositionLocals_androidKt.f3986a);
        Resources resources = ((Context) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3987b)).getResources();
        boolean z = false;
        if (i == 0) {
            str = resources.getString(R.string.navigation_menu);
            C19383o.m32796f(str, "resources.getString(R.string.navigation_menu)");
        } else {
            if (i == 1) {
                str = resources.getString(R.string.close_drawer);
                C19383o.m32796f(str, "resources.getString(R.string.close_drawer)");
            } else {
                if (i == 2) {
                    str = resources.getString(R.string.close_sheet);
                    C19383o.m32796f(str, "resources.getString(R.string.close_sheet)");
                } else {
                    if (i == 3) {
                        str = resources.getString(R.string.default_error_message);
                        C19383o.m32796f(str, "resources.getString(R.st…ng.default_error_message)");
                    } else {
                        if (i == 4) {
                            str = resources.getString(R.string.dropdown_menu);
                            C19383o.m32796f(str, "resources.getString(R.string.dropdown_menu)");
                        } else {
                            if (i == 5) {
                                str = resources.getString(R.string.range_start);
                                C19383o.m32796f(str, "resources.getString(R.string.range_start)");
                            } else {
                                if (i == 6) {
                                    z = true;
                                }
                                if (z) {
                                    str = resources.getString(R.string.range_end);
                                    C19383o.m32796f(str, "resources.getString(R.string.range_end)");
                                } else {
                                    str = "";
                                }
                            }
                        }
                    }
                }
            }
        }
        dVar.mo5406H();
        return str;
    }

    /* renamed from: L */
    public static final String m4351L(C1302d dVar) {
        dVar.mo5465u(363904894);
        Resources.Theme theme = ((Context) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3987b)).getTheme();
        C19383o.m32796f(theme, "LocalContext.current.theme");
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{R.attr.clg_dismiss_content_description});
        C19383o.m32796f(obtainStyledAttributes, "obtainStyledAttributes(intArrayOf(attr))");
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        dVar.mo5406H();
        return string;
    }

    /* renamed from: M */
    public static final C1913a m4352M(TextFieldValue textFieldValue, int i) {
        C19383o.m32797g(textFieldValue, "<this>");
        return textFieldValue.f4448a.subSequence(C2022r.m4465d(textFieldValue.f4449b), Math.min(C2022r.m4465d(textFieldValue.f4449b) + i, textFieldValue.f4448a.f4296b.length()));
    }

    /* renamed from: N */
    public static final C1913a m4353N(TextFieldValue textFieldValue, int i) {
        C19383o.m32797g(textFieldValue, "<this>");
        return textFieldValue.f4448a.subSequence(Math.max(0, C2022r.m4466e(textFieldValue.f4449b) - i), C2022r.m4466e(textFieldValue.f4449b));
    }

    /* renamed from: O */
    public static final boolean m4354O(C2012n nVar) {
        C19383o.m32797g(nVar, "<this>");
        return (nVar.f4541f == null && nVar.f4539d == null && nVar.f4538c == null) ? false : true;
    }

    /* renamed from: P */
    public static final boolean m4355P(CoroutineContext coroutineContext) {
        int i = C19699g1.f43634d1;
        C19699g1 g1Var = (C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b);
        return g1Var != null && g1Var.isActive();
    }

    /* renamed from: Q */
    public static final boolean m4356Q(C19893f fVar) {
        C19383o.m32797g(fVar, "$this$isProbablyUtf8");
        try {
            C19893f fVar2 = new C19893f();
            long j = fVar.f43876c;
            fVar.mo72735f(fVar2, 0, j > 64 ? 64 : j);
            for (int i = 0; i < 16; i++) {
                if (fVar2.mo72733e0()) {
                    return true;
                }
                int Q = fVar2.mo72721Q();
                if (Character.isISOControl(Q) && !Character.isWhitespace(Q)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: R */
    public static int m4357R(float f, int i, int i2) {
        return C8351c.m16664f(C8351c.m16666h(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    /* renamed from: S */
    public static final C1436d m4358S(C1436d dVar, String str) {
        C19383o.m32797g(dVar, "<this>");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C1691k(str));
    }

    /* renamed from: T */
    public static void m4359T(C8672b bVar, C11540a aVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(aVar, "dependencies");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PredefinedAnalyticsProperty.NOTIFICATION_FEED_INDEX, aVar.f25530b);
        linkedHashMap.put(PredefinedAnalyticsProperty.NOTIFICATION_FEED_ID, aVar.f25531c);
        Long l = aVar.f25532d;
        if (l != null) {
            linkedHashMap.put(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(l.longValue()));
        }
        Long l2 = aVar.f25533e;
        if (l2 != null) {
            linkedHashMap.put(PredefinedAnalyticsProperty.SHOP_ID, Long.valueOf(l2.longValue()));
        }
        String str = aVar.f25536h;
        if (str != null) {
            linkedHashMap.put(PredefinedAnalyticsProperty.LANDING_SCREEN, str);
        }
        Boolean bool = aVar.f25534f;
        if (bool != null) {
            linkedHashMap.put(PredefinedAnalyticsProperty.SHOP_RECS_HIGHLIGHTED_STATE, Boolean.valueOf(bool.booleanValue()));
        }
        String str2 = aVar.f25535g;
        if (str2 != null) {
            linkedHashMap.put(PredefinedAnalyticsProperty.TYPE, str2);
        }
        bVar.mo21333d(aVar.f25529a, linkedHashMap);
    }

    /* renamed from: U */
    public static final C1436d m4360U(C1436d dVar, C19857l lVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(lVar, "offset");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new OffsetPxModifier(lVar));
    }

    /* renamed from: V */
    public static final boolean m4361V(String str) {
        C19383o.m32797g(str, ResponseConstants.METHOD);
        return !C19383o.m32792b(str, "GET") && !C19383o.m32792b(str, "HEAD");
    }

    /* renamed from: W */
    public static boolean m4362W(long j, C20024c cVar, ArrayDeque arrayDeque, AtomicLong atomicLong, C8337e eVar) {
        boolean z;
        boolean z2;
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                try {
                    z2 = eVar.getAsBoolean();
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
                Object poll = arrayDeque.poll();
                if (poll == null) {
                    cVar.onComplete();
                    return true;
                }
                cVar.onNext(poll);
                j2++;
            } else {
                try {
                    z = eVar.getAsBoolean();
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    z = true;
                }
                if (z) {
                    return true;
                }
                if (arrayDeque.isEmpty()) {
                    cVar.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long addAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j = addAndGet;
                    j2 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: X */
    public static String m4363X(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: Y */
    public static final void m4364Y(C19754l0 l0Var, C19340c cVar, boolean z) {
        Object g = l0Var.mo72454g();
        Throwable c = l0Var.mo72543c(g);
        Object r3 = Result.m35480constructorimpl(c != null ? C0761x.m1673J(c) : l0Var.mo72544d(g));
        if (z) {
            C19722g gVar = (C19722g) cVar;
            C19340c<T> cVar2 = gVar.f43664f;
            Object obj = gVar.f43666h;
            CoroutineContext context = cVar2.getContext();
            Object c2 = ThreadContextKt.m33530c(context, obj);
            C19527d2<?> d = c2 != ThreadContextKt.f43649a ? CoroutineContextKt.m33063d(cVar2, context, c2) : null;
            try {
                gVar.f43664f.resumeWith(r3);
                C19394m mVar = C19394m.f43287a;
            } finally {
                if (d == null || d.mo72221E0()) {
                    ThreadContextKt.m33528a(context, c2);
                }
            }
        } else {
            cVar.resumeWith(r3);
        }
    }

    /* renamed from: Z */
    public static final void m4365Z(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "url");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.social_share_modal_title), PendingIntent.getBroadcast(context, 0, new Intent(context, SocialShareBroadcastReceiver.class), 201326592).getIntentSender()));
    }

    /* renamed from: a0 */
    public static String m4366a0(int i) {
        boolean z = false;
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        if (i == 9) {
            z = true;
        }
        return z ? "Decimal" : "Invalid";
    }

    /* renamed from: j */
    public static float m4367j(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: l */
    public static C19707i1 m4368l() {
        return new C19707i1((C19699g1) null);
    }

    /* renamed from: n */
    public static float m4369n(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: p */
    public static final long m4370p(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & UnsignedInteger.INT_MASK) | (floatToIntBits << 32);
        int i = C7294l.f16177c;
        return floatToIntBits2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b6  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p208p5.C7673a m4371q(javax.crypto.spec.SecretKeySpec r19, boolean r20, byte[] r21, byte[] r22) {
        /*
            r0 = r20
            o5.a r1 = new o5.a
            r1.<init>()
            r5.p r2 = new r5.p
            byte[] r3 = r19.getEncoded()
            r2.<init>(r3)
            r1.mo20033a(r0, r2)
            p5.a r2 = new p5.a
            r2.<init>(r1)
            r5.p r1 = new r5.p
            byte[] r3 = r19.getEncoded()
            r1.<init>(r3)
            byte[] r3 = p267v7.C8212a.m16504k(r21)
            byte[] r4 = p267v7.C8212a.m16504k(r22)
            r2.f16997d = r0
            r5 = 0
            r2.f17006m = r5
            r6 = 1
            r2.f16998e = r6
            byte[] r3 = p267v7.C8212a.m16504k(r3)
            byte[] r4 = p267v7.C8212a.m16504k(r4)
            r2.f17002i = r4
            r4 = 16
            r2.f16999f = r4
            r7 = 32
            if (r0 == 0) goto L_0x0045
            r8 = r4
            goto L_0x0046
        L_0x0045:
            r8 = r7
        L_0x0046:
            byte[] r8 = new byte[r8]
            r2.f17005l = r8
            if (r3 == 0) goto L_0x01bb
            int r8 = r3.length
            if (r8 < r6) goto L_0x01bb
            if (r0 == 0) goto L_0x0070
            byte[] r0 = r2.f17001h
            if (r0 == 0) goto L_0x0070
            boolean r0 = p267v7.C8212a.m16500g(r0, r3)
            if (r0 == 0) goto L_0x0070
            byte[] r0 = r2.f17000g
            if (r0 == 0) goto L_0x0070
            byte[] r8 = r1.f17200a
            boolean r0 = p267v7.C8212a.m16500g(r0, r8)
            if (r0 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot reuse nonce for GCM encryption"
            r0.<init>(r1)
            throw r0
        L_0x0070:
            r2.f17001h = r3
            byte[] r0 = r1.f17200a
            r2.f17000g = r0
            l5.b r0 = r2.f16994a
            o5.a r0 = (p198o5.C7619a) r0
            r0.mo20033a(r6, r1)
            byte[] r0 = new byte[r4]
            r2.f17003j = r0
            l5.b r1 = r2.f16994a
            o5.a r1 = (p198o5.C7619a) r1
            r1.mo20035c(r0, r0)
            androidx.compose.ui.input.pointer.f r0 = r2.f16995b
            byte[] r1 = r2.f17003j
            java.lang.Object r3 = r0.f3631d
            long[][] r3 = (long[][]) r3
            r8 = 8
            r9 = 2
            r10 = 0
            if (r3 != 0) goto L_0x00a6
            int[] r3 = new int[r9]
            r3 = {256, 2} // fill-array
            java.lang.Class r11 = java.lang.Long.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r11, r3)
            long[][] r3 = (long[][]) r3
            r0.f3631d = r3
            goto L_0x00b3
        L_0x00a6:
            java.lang.Object r3 = r0.f3630c
            byte[] r3 = (byte[]) r3
            boolean r3 = p267v7.C8212a.m16500g(r3, r1)
            if (r3 == 0) goto L_0x00b3
            r0 = r5
            goto L_0x0142
        L_0x00b3:
            byte[] r1 = p267v7.C8212a.m16504k(r1)
            r0.f3630c = r1
            java.lang.Object r3 = r0.f3631d
            long[][] r3 = (long[][]) r3
            r3 = r3[r6]
            r11 = r10
            r12 = r11
        L_0x00c1:
            int r13 = r3.length
            if (r11 >= r13) goto L_0x00e2
            int r13 = androidx.work.C3436p.m8240b(r12, r1)
            int r14 = r12 + 4
            int r14 = androidx.work.C3436p.m8240b(r14, r1)
            long r4 = (long) r13
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r15
            long r4 = r4 << r7
            long r13 = (long) r14
            long r13 = r13 & r15
            long r4 = r4 | r13
            r3[r11] = r4
            int r12 = r12 + r8
            int r11 = r11 + 1
            r4 = 16
            r5 = 0
            goto L_0x00c1
        L_0x00e2:
            java.lang.Object r1 = r0.f3631d
            long[][] r1 = (long[][]) r1
            r1 = r1[r6]
            r3 = r1[r10]
            r11 = r1[r6]
            r5 = 57
            long r13 = r11 << r5
            r7 = 7
            long r15 = r3 >>> r7
            long r15 = r15 ^ r13
            long r17 = r13 >>> r6
            long r15 = r15 ^ r17
            long r17 = r13 >>> r9
            long r15 = r15 ^ r17
            long r13 = r13 >>> r7
            long r13 = r13 ^ r15
            r1[r10] = r13
            long r11 = r11 >>> r7
            long r3 = r3 << r5
            long r3 = r3 | r11
            r1[r6] = r3
        L_0x0105:
            r1 = 256(0x100, float:3.59E-43)
            if (r9 >= r1) goto L_0x0141
            java.lang.Object r1 = r0.f3631d
            long[][] r1 = (long[][]) r1
            int r3 = r9 >> 1
            r3 = r1[r3]
            r4 = r1[r9]
            r11 = r3[r10]
            r13 = r3[r6]
            r3 = 63
            r5 = r9
            long r8 = r11 >> r3
            r15 = -2233785415175766016(0xe100000000000000, double:-1.757388200993436E159)
            long r15 = r15 & r8
            long r11 = r11 ^ r15
            long r11 = r11 << r6
            long r15 = r13 >>> r3
            long r11 = r11 | r15
            r4[r10] = r11
            long r13 = r13 << r6
            long r7 = -r8
            long r7 = r7 | r13
            r4[r6] = r7
            r3 = r1[r6]
            int r9 = r5 + 1
            r1 = r1[r9]
            r13 = r3[r10]
            long r11 = r11 ^ r13
            r1[r10] = r11
            r11 = r3[r6]
            long r3 = r7 ^ r11
            r1[r6] = r3
            int r9 = r5 + 2
            r8 = 8
            goto L_0x0105
        L_0x0141:
            r0 = 0
        L_0x0142:
            r2.f16996c = r0
            r0 = 16
            byte[] r1 = new byte[r0]
            r2.f17004k = r1
            byte[] r0 = r2.f17001h
            int r3 = r0.length
            r4 = 12
            if (r3 != r4) goto L_0x015e
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r10, r1, r10, r3)
            byte[] r0 = r2.f17004k
            r1 = 15
            r0[r1] = r6
        L_0x015b:
            r0 = 16
            goto L_0x018b
        L_0x015e:
            int r3 = r0.length
            r4 = r10
        L_0x0160:
            if (r4 >= r3) goto L_0x0170
            int r5 = r3 - r4
            r6 = 16
            int r5 = java.lang.Math.min(r5, r6)
            r2.mo20069f(r1, r0, r4, r5)
            int r4 = r4 + 16
            goto L_0x0160
        L_0x0170:
            r6 = 16
            byte[] r0 = new byte[r6]
            byte[] r1 = r2.f17001h
            int r1 = r1.length
            long r3 = (long) r1
            r5 = 8
            long r3 = r3 * r5
            r1 = 8
            androidx.work.C3436p.m8246h(r3, r0, r1)
            byte[] r1 = r2.f17004k
            androidx.work.C3436p.m8252o(r1, r0)
            androidx.compose.ui.input.pointer.f r0 = r2.f16995b
            r0.mo6595e(r1)
            goto L_0x015b
        L_0x018b:
            byte[] r1 = new byte[r0]
            r2.f17007n = r1
            byte[] r1 = new byte[r0]
            r2.f17008o = r1
            byte[] r1 = new byte[r0]
            r2.f17009p = r1
            byte[] r0 = new byte[r0]
            r2.f17014u = r0
            r2.f17015v = r10
            r0 = 0
            r2.f17016w = r0
            r2.f17017x = r0
            byte[] r3 = r2.f17004k
            byte[] r3 = p267v7.C8212a.m16504k(r3)
            r2.f17010q = r3
            r3 = -2
            r2.f17011r = r3
            r2.f17012s = r10
            r2.f17013t = r0
            byte[] r0 = r2.f17002i
            if (r0 == 0) goto L_0x01ba
            int r1 = r0.length
            r2.mo20067d(r0, r1)
        L_0x01ba:
            return r2
        L_0x01bb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "IV must be at least 1 byte"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.input.C1993m.m4371q(javax.crypto.spec.SecretKeySpec, boolean, byte[], byte[]):p5.a");
    }

    /* renamed from: r */
    public static final void m4372r(CoroutineContext coroutineContext, CancellationException cancellationException) {
        int i = C19699g1.f43634d1;
        C19699g1 g1Var = (C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b);
        if (g1Var != null) {
            g1Var.mo72134a(cancellationException);
        }
    }

    /* renamed from: s */
    public static final Object m4373s(C19699g1 g1Var, C19340c cVar) {
        g1Var.mo72134a((CancellationException) null);
        Object c0 = g1Var.mo72394c0(cVar);
        return c0 == CoroutineSingletons.COROUTINE_SUSPENDED ? c0 : C19394m.f43287a;
    }

    /* renamed from: t */
    public static void m4374t(CoroutineContext coroutineContext) {
        C19434j g;
        C19699g1 g1Var = (C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b);
        if (g1Var != null && (g = g1Var.mo72397g()) != null) {
            Iterator<Object> it = g.iterator();
            while (true) {
                C19432h hVar = (C19432h) it;
                if (hVar.hasNext()) {
                    ((C19699g1) hVar.next()).mo72134a((CancellationException) null);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    public static int m4375u(int i, int i2) {
        return C8351c.m16666h(i, (Color.alpha(i) * i2) / 255);
    }

    /* renamed from: v */
    public static final Pair m4376v(C8474a aVar) {
        String str = aVar.f18498f;
        String E1 = C19459m.m33032E1(str, "=", str);
        String str2 = aVar.f18498f;
        return new Pair(E1, C19459m.m33030C1(str2, "=", str2));
    }

    /* renamed from: w */
    public static final C0432j m4377w(C0432j jVar) {
        C19383o.m32797g(jVar, "<this>");
        C0432j c = jVar.mo3490c();
        int b = c.mo3489b();
        for (int i = 0; i < b; i++) {
            c.mo3492e(jVar.mo3488a(i), i);
        }
        return c;
    }

    /* renamed from: x */
    public static final boolean m4378x(C8474a aVar) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
        long j = (long) 60;
        long j2 = ((long) 24) * ((long) 1000) * j * j;
        long j3 = aVar.f18497e;
        return (Calendar.getInstance().getTimeInMillis() - j2) / 1000 <= j3 && j3 < timeInMillis;
    }

    /* renamed from: y */
    public static final void m4379y(CoroutineContext coroutineContext) {
        C19699g1 g1Var = (C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.mo72398h();
        }
    }

    /* renamed from: z */
    public static int m4380z(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float j = m4367j(((float) ((i >> 16) & 255)) / 255.0f);
        float j2 = m4367j(((float) ((i >> 8) & 255)) / 255.0f);
        float j3 = m4367j(((float) (i & 255)) / 255.0f);
        float j4 = m4367j(((float) ((i2 >> 16) & 255)) / 255.0f);
        float j5 = m4367j(((float) ((i2 >> 8) & 255)) / 255.0f);
        float j6 = m4367j(((float) (i2 & 255)) / 255.0f);
        float b = C0023f.m103b(((float) ((i2 >> 24) & 255)) / 255.0f, f2, f, f2);
        float b2 = C0023f.m103b(j4, j, f, j);
        float b3 = C0023f.m103b(j5, j2, f, j2);
        float b4 = C0023f.m103b(j6, j3, f, j3);
        int round = Math.round(m4369n(b2) * 255.0f) << 16;
        return Math.round(m4369n(b4) * 255.0f) | round | (Math.round(b * 255.0f) << 24) | (Math.round(m4369n(b3) * 255.0f) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = (com.etsy.android.lib.logger.perf.C8709f) r3.get();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.C19989m mo7678a(okhttp3.C19944e r3) {
        /*
            r2 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.ref.WeakReference r3 = f4501p
            if (r3 == 0) goto L_0x001e
            java.lang.Object r3 = r3.get()
            com.etsy.android.lib.logger.perf.f r3 = (com.etsy.android.lib.logger.perf.C8709f) r3
            if (r3 != 0) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            com.etsy.android.lib.logger.perf.c r0 = new com.etsy.android.lib.logger.perf.c
            com.etsy.android.lib.logger.perf.TimedMetric r1 = com.etsy.android.lib.logger.perf.TimedMetric.NONBLOCKING_NETWORK
            com.etsy.android.lib.logger.perf.d r3 = r3.mo21328a(r1)
            r0.<init>(r3)
            return r0
        L_0x001e:
            okhttp3.m$a r3 = okhttp3.C19989m.f44227a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.input.C1993m.mo7678a(okhttp3.e):okhttp3.m");
    }

    /* renamed from: b */
    public boolean mo7679b(StepData stepData) {
        return false;
    }

    /* renamed from: c */
    public boolean mo14c(String str) {
        if (str == null) {
            return false;
        }
        return new Regex("^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$").matches(str);
    }

    /* renamed from: d */
    public Object mo15d(IBinder iBinder) {
        return zzo.zzb(iBinder);
    }

    /* renamed from: e */
    public int mo16e() {
        return 7;
    }

    /* renamed from: f */
    public Object mo56f(C18415r rVar) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(rVar);
    }

    /* renamed from: g */
    public boolean mo7680g(Object obj, File file, File file2) {
        return true;
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo1133h(Object obj) {
        SingleListingCheckoutStandalonePayPalSADialog singleListingCheckoutStandalonePayPalSADialog = (SingleListingCheckoutStandalonePayPalSADialog) obj;
    }

    /* renamed from: i */
    public void mo7681i(Context context, StepData stepData) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* renamed from: k */
    public ArrayList mo19k(FragmentNavigationKey fragmentNavigationKey, boolean z) {
        C19383o.m32797g(fragmentNavigationKey, "key");
        if (fragmentNavigationKey instanceof HomePagerKey) {
            return C17782b.m29888u(fragmentNavigationKey);
        }
        throw new UnsupportedNavigationException("Invalid key " + fragmentNavigationKey + " provided to " + this);
    }

    /* renamed from: m */
    public int mo7682m(int i, String str) {
        return i;
    }

    /* renamed from: o */
    public int mo21o() {
        return R.id.menu_bottom_nav_home;
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().zzs());
    }
}
