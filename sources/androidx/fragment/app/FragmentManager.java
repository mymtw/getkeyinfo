package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0112f;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0118a;
import androidx.activity.result.C0122e;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.C2751c0;
import androidx.fragment.app.C2794u;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p010a9.C0048b;
import p019b.C3443a;

public abstract class FragmentManager {

    /* renamed from: A */
    public ArrayDeque<LaunchedFragmentInfo> f6120A = new ArrayDeque<>();

    /* renamed from: B */
    public boolean f6121B;

    /* renamed from: C */
    public boolean f6122C;

    /* renamed from: D */
    public boolean f6123D;

    /* renamed from: E */
    public boolean f6124E;

    /* renamed from: F */
    public boolean f6125F;

    /* renamed from: G */
    public ArrayList<C2740a> f6126G;

    /* renamed from: H */
    public ArrayList<Boolean> f6127H;

    /* renamed from: I */
    public ArrayList<Fragment> f6128I;

    /* renamed from: J */
    public C2797w f6129J;

    /* renamed from: K */
    public C2716d f6130K = new C2716d();

    /* renamed from: a */
    public final ArrayList<C2726n> f6131a = new ArrayList<>();

    /* renamed from: b */
    public boolean f6132b;

    /* renamed from: c */
    public final C2749b0 f6133c = new C2749b0();

    /* renamed from: d */
    public ArrayList<C2740a> f6134d;

    /* renamed from: e */
    public ArrayList<Fragment> f6135e;

    /* renamed from: f */
    public final C2786t f6136f = new C2786t(this);

    /* renamed from: g */
    public OnBackPressedDispatcher f6137g;

    /* renamed from: h */
    public final C2713a f6138h = new C2713a();

    /* renamed from: i */
    public final AtomicInteger f6139i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, BackStackState> f6140j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f6141k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, C2724l> f6142l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public ArrayList<C2725m> f6143m;

    /* renamed from: n */
    public final C2794u f6144n = new C2794u(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<C2799x> f6145o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public int f6146p = -1;

    /* renamed from: q */
    public C2782r<?> f6147q;

    /* renamed from: r */
    public C2779o f6148r;

    /* renamed from: s */
    public Fragment f6149s;

    /* renamed from: t */
    public Fragment f6150t;

    /* renamed from: u */
    public C2781q f6151u = null;

    /* renamed from: v */
    public C2714b f6152v = new C2714b();

    /* renamed from: w */
    public C2715c f6153w = new C2715c();

    /* renamed from: x */
    public C0122e f6154x;

    /* renamed from: y */
    public C0122e f6155y;

    /* renamed from: z */
    public C0122e f6156z;

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public class C2713a extends C0112f {
        public C2713a() {
            super(false);
        }

        /* renamed from: a */
        public final void mo1121a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.mo10404x(true);
            if (fragmentManager.f6138h.f163a) {
                fragmentManager.mo10364Q();
            } else {
                fragmentManager.f6137g.mo1105b();
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public class C2714b extends C2781q {
        public C2714b() {
        }

        /* renamed from: a */
        public final Fragment mo10411a(ClassLoader classLoader, String str) {
            C2782r<?> rVar = FragmentManager.this.f6147q;
            Context context = rVar.f6334c;
            rVar.getClass();
            return Fragment.instantiate(context, str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public class C2715c implements C2775m0 {
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public class C2716d implements Runnable {
        public C2716d() {
        }

        public final void run() {
            FragmentManager.this.mo10404x(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C2717e implements C2799x {

        /* renamed from: b */
        public final /* synthetic */ Fragment f6166b;

        public C2717e(Fragment fragment) {
            this.f6166b = fragment;
        }

        /* renamed from: a */
        public final void mo10329a(Fragment fragment) {
            this.f6166b.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public class C2718f implements C0118a<ActivityResult> {
        public C2718f() {
        }

        /* renamed from: a */
        public final void mo413a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f6120A.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f6161b;
            int i = pollFirst.f6162c;
            Fragment c = FragmentManager.this.f6133c.mo10520c(str);
            if (c == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            c.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    public class C2719g implements C0118a<ActivityResult> {
        public C2719g() {
        }

        /* renamed from: a */
        public final void mo413a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f6120A.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f6161b;
            int i = pollFirst.f6162c;
            Fragment c = FragmentManager.this.f6133c.mo10520c(str);
            if (c == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            c.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    public class C2720h implements C0118a<Map<String, Boolean>> {
        public C2720h() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public final void mo413a(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.f6120A.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f6161b;
            int i2 = pollFirst.f6162c;
            Fragment c = FragmentManager.this.f6133c.mo10520c(str);
            if (c == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            c.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    public interface C2721i {
        String getName();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    public static class C2722j extends C3443a<IntentSenderRequest, ActivityResult> {
        /* renamed from: a */
        public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (!(fillInIntent == null || (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest(intentSenderRequest.getIntentSender(), (Intent) null, intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues());
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m6465J(2)) {
                intent.toString();
            }
            return intent;
        }

        /* renamed from: c */
        public final Object mo1147c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public static abstract class C2723k {
        @Deprecated
        /* renamed from: a */
        public void mo10414a(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: b */
        public void mo10415b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void mo10416c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo10417d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: e */
        public void mo10418e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo10419f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo10420g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void mo10421h(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: i */
        public void mo10422i(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: j */
        public void mo10423j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: l */
        public void mo10425l(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: m */
        public void mo10426m(FragmentManager fragmentManager, Fragment fragment, View view) {
        }

        /* renamed from: n */
        public void mo10427n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public static class C2724l implements C2801z {

        /* renamed from: b */
        public final Lifecycle f6170b;

        /* renamed from: c */
        public final C2801z f6171c;

        /* renamed from: d */
        public final C2885q f6172d;

        public C2724l(Lifecycle lifecycle, C2801z zVar, C2885q qVar) {
            this.f6170b = lifecycle;
            this.f6171c = zVar;
            this.f6172d = qVar;
        }

        /* renamed from: c */
        public final void mo10428c(Bundle bundle, String str) {
            this.f6171c.mo10428c(bundle, str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public interface C2725m {
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public interface C2726n {
        /* renamed from: a */
        boolean mo10430a(ArrayList<C2740a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    public class C2727o implements C2726n {

        /* renamed from: a */
        public final String f6173a;

        /* renamed from: b */
        public final int f6174b;

        /* renamed from: c */
        public final int f6175c;

        public C2727o(String str, int i, int i2) {
            this.f6173a = str;
            this.f6174b = i;
            this.f6175c = i2;
        }

        /* renamed from: a */
        public final boolean mo10430a(ArrayList<C2740a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f6150t;
            if (fragment != null && this.f6174b < 0 && this.f6173a == null && fragment.getChildFragmentManager().mo10364Q()) {
                return false;
            }
            return FragmentManager.this.mo10365R(arrayList, arrayList2, this.f6173a, this.f6174b, this.f6175c);
        }
    }

    /* renamed from: J */
    public static boolean m6465J(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: K */
    public static boolean m6466K(Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.f6133c.mo10522e().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z2 = m6466K(fragment2);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    /* renamed from: L */
    public static boolean m6467L(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f6150t) && m6467L(fragmentManager.f6149s);
    }

    /* renamed from: A */
    public final Fragment mo10351A(String str) {
        return this.f6133c.mo10519b(str);
    }

    /* renamed from: B */
    public final Fragment mo10352B(int i) {
        C2749b0 b0Var = this.f6133c;
        int size = b0Var.f6237a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = b0Var.f6237a.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (C2741a0 next : b0Var.f6238b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.f6223c;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: C */
    public final Fragment mo10353C(String str) {
        C2749b0 b0Var = this.f6133c;
        if (str != null) {
            int size = b0Var.f6237a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = b0Var.f6237a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C2741a0 next : b0Var.f6238b.values()) {
                if (next != null) {
                    Fragment fragment2 = next.f6223c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            b0Var.getClass();
        }
        return null;
    }

    /* renamed from: D */
    public final void mo10354D() {
        Iterator it = mo10382e().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f6202e) {
                m6465J(2);
                specialEffectsController.f6202e = false;
                specialEffectsController.mo10470c();
            }
        }
    }

    /* renamed from: E */
    public final int mo10355E() {
        ArrayList<C2740a> arrayList = this.f6134d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: F */
    public final ViewGroup mo10356F(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f6148r.mo10130c()) {
            View b = this.f6148r.mo10129b(fragment.mContainerId);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    /* renamed from: G */
    public final C2781q mo10357G() {
        C2781q qVar = this.f6151u;
        if (qVar != null) {
            return qVar;
        }
        Fragment fragment = this.f6149s;
        return fragment != null ? fragment.mFragmentManager.mo10357G() : this.f6152v;
    }

    /* renamed from: H */
    public final List<Fragment> mo10358H() {
        return this.f6133c.mo10523f();
    }

    /* renamed from: I */
    public final C2775m0 mo10359I() {
        Fragment fragment = this.f6149s;
        return fragment != null ? fragment.mFragmentManager.mo10359I() : this.f6153w;
    }

    /* renamed from: M */
    public final boolean mo10360M() {
        return this.f6122C || this.f6123D;
    }

    /* renamed from: N */
    public final void mo10361N(int i, boolean z) {
        C2782r<?> rVar;
        if (this.f6147q == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f6146p) {
            this.f6146p = i;
            C2749b0 b0Var = this.f6133c;
            Iterator<Fragment> it = b0Var.f6237a.iterator();
            while (it.hasNext()) {
                C2741a0 a0Var = b0Var.f6238b.get(it.next().mWho);
                if (a0Var != null) {
                    a0Var.mo10504k();
                }
            }
            Iterator<C2741a0> it2 = b0Var.f6238b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                C2741a0 next = it2.next();
                if (next != null) {
                    next.mo10504k();
                    Fragment fragment = next.f6223c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (fragment.mBeingSaved && !b0Var.f6239c.containsKey(fragment.mWho)) {
                            next.mo10508o();
                        }
                        b0Var.mo10525h(next);
                    }
                }
            }
            mo10383e0();
            if (this.f6121B && (rVar = this.f6147q) != null && this.f6146p == 7) {
                rVar.mo10333g();
                this.f6121B = false;
            }
        }
    }

    /* renamed from: O */
    public final void mo10362O() {
        if (this.f6147q != null) {
            this.f6122C = false;
            this.f6123D = false;
            this.f6129J.f6357g = false;
            for (Fragment next : this.f6133c.mo10523f()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* renamed from: P */
    public final void mo10363P() {
        mo10402v(new C2727o((String) null, -1, 0), false);
    }

    /* renamed from: Q */
    public final boolean mo10364Q() {
        mo10404x(false);
        mo10403w(true);
        Fragment fragment = this.f6150t;
        if (fragment != null && fragment.getChildFragmentManager().mo10364Q()) {
            return true;
        }
        boolean R = mo10365R(this.f6126G, this.f6127H, (String) null, -1, 0);
        if (R) {
            this.f6132b = true;
            try {
                mo10368U(this.f6126G, this.f6127H);
            } finally {
                mo10380d();
            }
        }
        mo10385f0();
        if (this.f6125F) {
            this.f6125F = false;
            mo10383e0();
        }
        this.f6133c.f6238b.values().removeAll(Collections.singleton((Object) null));
        return R;
    }

    /* renamed from: R */
    public final boolean mo10365R(ArrayList<C2740a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList<C2740a> arrayList3 = this.f6134d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str != null || i >= 0) {
                int size = this.f6134d.size() - 1;
                while (size >= 0) {
                    C2740a aVar = this.f6134d.get(size);
                    if ((str != null && str.equals(aVar.f6254k)) || (i >= 0 && i == aVar.f6220u)) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z) {
                        while (size > 0) {
                            int i4 = size - 1;
                            C2740a aVar2 = this.f6134d.get(i4);
                            if ((str == null || !str.equals(aVar2.f6254k)) && (i < 0 || i != aVar2.f6220u)) {
                                break;
                            }
                            size = i4;
                        }
                    } else if (size != this.f6134d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            } else {
                i3 = z ? 0 : -1 + this.f6134d.size();
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.f6134d.size() - 1; size2 >= i3; size2--) {
            arrayList.add(this.f6134d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: S */
    public final void mo10366S(C2723k kVar, boolean z) {
        this.f6144n.f6347a.add(new C2794u.C2795a(kVar, z));
    }

    /* renamed from: T */
    public final void mo10367T(Fragment fragment) {
        if (m6465J(2)) {
            Objects.toString(fragment);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            C2749b0 b0Var = this.f6133c;
            synchronized (b0Var.f6237a) {
                b0Var.f6237a.remove(fragment);
            }
            fragment.mAdded = false;
            if (m6466K(fragment)) {
                this.f6121B = true;
            }
            fragment.mRemoving = true;
            mo10381d0(fragment);
        }
    }

    /* renamed from: U */
    public final void mo10368U(ArrayList<C2740a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f6261r) {
                        if (i2 != i) {
                            mo10406z(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f6261r) {
                                i2++;
                            }
                        }
                        mo10406z(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    mo10406z(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: V */
    public final void mo10369V(Parcelable parcelable) {
        FragmentManagerState fragmentManagerState;
        ArrayList<FragmentState> arrayList;
        int i;
        C2741a0 a0Var;
        if (parcelable != null && (arrayList = fragmentManagerState.mSavedState) != null) {
            C2749b0 b0Var = this.f6133c;
            b0Var.f6239c.clear();
            Iterator<FragmentState> it = arrayList.iterator();
            while (it.hasNext()) {
                FragmentState next = it.next();
                b0Var.f6239c.put(next.f6178c, next);
            }
            this.f6133c.f6238b.clear();
            Iterator<String> it2 = (fragmentManagerState = (FragmentManagerState) parcelable).mActive.iterator();
            while (it2.hasNext()) {
                FragmentState i2 = this.f6133c.mo10526i(it2.next(), (FragmentState) null);
                if (i2 != null) {
                    Fragment fragment = this.f6129J.f6352b.get(i2.f6178c);
                    if (fragment != null) {
                        if (m6465J(2)) {
                            fragment.toString();
                        }
                        a0Var = new C2741a0(this.f6144n, this.f6133c, fragment, i2);
                    } else {
                        a0Var = new C2741a0(this.f6144n, this.f6133c, this.f6147q.f6334c.getClassLoader(), mo10357G(), i2);
                    }
                    Fragment fragment2 = a0Var.f6223c;
                    fragment2.mFragmentManager = this;
                    if (m6465J(2)) {
                        fragment2.toString();
                    }
                    a0Var.mo10506m(this.f6147q.f6334c.getClassLoader());
                    this.f6133c.mo10524g(a0Var);
                    a0Var.f6225e = this.f6146p;
                }
            }
            C2797w wVar = this.f6129J;
            wVar.getClass();
            Iterator it3 = new ArrayList(wVar.f6352b.values()).iterator();
            while (true) {
                i = 0;
                if (!it3.hasNext()) {
                    break;
                }
                Fragment fragment3 = (Fragment) it3.next();
                if (this.f6133c.f6238b.get(fragment3.mWho) != null) {
                    i = 1;
                }
                if (i == 0) {
                    if (m6465J(2)) {
                        fragment3.toString();
                        Objects.toString(fragmentManagerState.mActive);
                    }
                    this.f6129J.mo10619e(fragment3);
                    fragment3.mFragmentManager = this;
                    C2741a0 a0Var2 = new C2741a0(this.f6144n, this.f6133c, fragment3);
                    a0Var2.f6225e = 1;
                    a0Var2.mo10504k();
                    fragment3.mRemoving = true;
                    a0Var2.mo10504k();
                }
            }
            C2749b0 b0Var2 = this.f6133c;
            ArrayList<String> arrayList2 = fragmentManagerState.mAdded;
            b0Var2.f6237a.clear();
            if (arrayList2 != null) {
                for (String next2 : arrayList2) {
                    Fragment b = b0Var2.mo10519b(next2);
                    if (b != null) {
                        if (m6465J(2)) {
                            b.toString();
                        }
                        b0Var2.mo10518a(b);
                    } else {
                        throw new IllegalStateException(C0048b.m163a("No instantiated fragment for (", next2, ")"));
                    }
                }
            }
            if (fragmentManagerState.mBackStack != null) {
                this.f6134d = new ArrayList<>(fragmentManagerState.mBackStack.length);
                int i3 = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                    if (i3 >= backStackRecordStateArr.length) {
                        break;
                    }
                    BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                    backStackRecordState.getClass();
                    C2740a aVar = new C2740a(this);
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < backStackRecordState.f6064b.length) {
                        C2751c0.C2752a aVar2 = new C2751c0.C2752a();
                        int i6 = i4 + 1;
                        aVar2.f6262a = backStackRecordState.f6064b[i4];
                        if (m6465J(2)) {
                            Objects.toString(aVar);
                            int i7 = backStackRecordState.f6064b[i6];
                        }
                        aVar2.f6269h = Lifecycle.State.values()[backStackRecordState.f6066d[i5]];
                        aVar2.f6270i = Lifecycle.State.values()[backStackRecordState.f6067e[i5]];
                        int[] iArr = backStackRecordState.f6064b;
                        int i8 = i6 + 1;
                        aVar2.f6264c = iArr[i6] != 0;
                        int i9 = i8 + 1;
                        int i10 = iArr[i8];
                        aVar2.f6265d = i10;
                        int i11 = i9 + 1;
                        int i12 = iArr[i9];
                        aVar2.f6266e = i12;
                        int i13 = i11 + 1;
                        int i14 = iArr[i11];
                        aVar2.f6267f = i14;
                        int i15 = iArr[i13];
                        aVar2.f6268g = i15;
                        aVar.f6247d = i10;
                        aVar.f6248e = i12;
                        aVar.f6249f = i14;
                        aVar.f6250g = i15;
                        aVar.mo10528b(aVar2);
                        i5++;
                        i4 = i13 + 1;
                    }
                    aVar.f6251h = backStackRecordState.f6068f;
                    aVar.f6254k = backStackRecordState.f6069g;
                    aVar.f6252i = true;
                    aVar.f6255l = backStackRecordState.f6071i;
                    aVar.f6256m = backStackRecordState.f6072j;
                    aVar.f6257n = backStackRecordState.f6073k;
                    aVar.f6258o = backStackRecordState.f6074l;
                    aVar.f6259p = backStackRecordState.f6075m;
                    aVar.f6260q = backStackRecordState.f6076n;
                    aVar.f6261r = backStackRecordState.f6077o;
                    aVar.f6220u = backStackRecordState.f6070h;
                    for (int i16 = 0; i16 < backStackRecordState.f6065c.size(); i16++) {
                        String str = backStackRecordState.f6065c.get(i16);
                        if (str != null) {
                            aVar.f6246c.get(i16).f6263b = mo10351A(str);
                        }
                    }
                    aVar.mo10486j(1);
                    if (m6465J(2)) {
                        aVar.toString();
                        PrintWriter printWriter = new PrintWriter(new C2773l0());
                        aVar.mo10489m("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f6134d.add(aVar);
                    i3++;
                }
            } else {
                this.f6134d = null;
            }
            this.f6139i.set(fragmentManagerState.mBackStackIndex);
            String str2 = fragmentManagerState.mPrimaryNavActiveWho;
            if (str2 != null) {
                Fragment A = mo10351A(str2);
                this.f6150t = A;
                mo10396q(A);
            }
            ArrayList<String> arrayList3 = fragmentManagerState.mBackStackStateKeys;
            if (arrayList3 != null) {
                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                    this.f6140j.put(arrayList3.get(i17), fragmentManagerState.mBackStackStates.get(i17));
                }
            }
            ArrayList<String> arrayList4 = fragmentManagerState.mResultKeys;
            if (arrayList4 != null) {
                while (i < arrayList4.size()) {
                    Bundle bundle = fragmentManagerState.mResults.get(i);
                    bundle.setClassLoader(this.f6147q.f6334c.getClassLoader());
                    this.f6141k.put(arrayList4.get(i), bundle);
                    i++;
                }
            }
            this.f6120A = new ArrayDeque<>(fragmentManagerState.mLaunchedFragments);
        }
    }

    /* renamed from: W */
    public final Parcelable mo10370W() {
        ArrayList<String> arrayList;
        int size;
        mo10354D();
        Iterator it = mo10382e().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).mo10472e();
        }
        mo10404x(true);
        this.f6122C = true;
        this.f6129J.f6357g = true;
        C2749b0 b0Var = this.f6133c;
        b0Var.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(b0Var.f6238b.size());
        for (C2741a0 next : b0Var.f6238b.values()) {
            if (next != null) {
                Fragment fragment = next.f6223c;
                next.mo10508o();
                arrayList2.add(fragment.mWho);
                if (m6465J(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        C2749b0 b0Var2 = this.f6133c;
        b0Var2.getClass();
        ArrayList<FragmentState> arrayList3 = new ArrayList<>(b0Var2.f6239c.values());
        BackStackRecordState[] backStackRecordStateArr = null;
        if (arrayList3.isEmpty()) {
            m6465J(2);
            return null;
        }
        C2749b0 b0Var3 = this.f6133c;
        synchronized (b0Var3.f6237a) {
            if (b0Var3.f6237a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(b0Var3.f6237a.size());
                Iterator<Fragment> it2 = b0Var3.f6237a.iterator();
                while (it2.hasNext()) {
                    Fragment next2 = it2.next();
                    arrayList.add(next2.mWho);
                    if (m6465J(2)) {
                        next2.toString();
                    }
                }
            }
        }
        ArrayList<C2740a> arrayList4 = this.f6134d;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i = 0; i < size; i++) {
                backStackRecordStateArr[i] = new BackStackRecordState(this.f6134d.get(i));
                if (m6465J(2)) {
                    Objects.toString(this.f6134d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.mSavedState = arrayList3;
        fragmentManagerState.mActive = arrayList2;
        fragmentManagerState.mAdded = arrayList;
        fragmentManagerState.mBackStack = backStackRecordStateArr;
        fragmentManagerState.mBackStackIndex = this.f6139i.get();
        Fragment fragment2 = this.f6150t;
        if (fragment2 != null) {
            fragmentManagerState.mPrimaryNavActiveWho = fragment2.mWho;
        }
        fragmentManagerState.mBackStackStateKeys.addAll(this.f6140j.keySet());
        fragmentManagerState.mBackStackStates.addAll(this.f6140j.values());
        fragmentManagerState.mResultKeys.addAll(this.f6141k.keySet());
        fragmentManagerState.mResults.addAll(this.f6141k.values());
        fragmentManagerState.mLaunchedFragments = new ArrayList<>(this.f6120A);
        return fragmentManagerState;
    }

    /* renamed from: X */
    public final void mo10371X() {
        synchronized (this.f6131a) {
            boolean z = true;
            if (this.f6131a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f6147q.f6335d.removeCallbacks(this.f6130K);
                this.f6147q.f6335d.post(this.f6130K);
                mo10385f0();
            }
        }
    }

    /* renamed from: Y */
    public final void mo10372Y(Fragment fragment, boolean z) {
        ViewGroup F = mo10356F(fragment);
        if (F != null && (F instanceof FragmentContainerView)) {
            ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10373Z(android.os.Bundle r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$l> r0 = r3.f6142l
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.FragmentManager$l r0 = (androidx.fragment.app.FragmentManager.C2724l) r0
            if (r0 == 0) goto L_0x001c
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            androidx.lifecycle.Lifecycle r2 = r0.f6170b
            androidx.lifecycle.Lifecycle$State r2 = r2.mo10734b()
            boolean r1 = r2.isAtLeast(r1)
            if (r1 == 0) goto L_0x001c
            r0.mo10428c(r4, r5)
            goto L_0x0021
        L_0x001c:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r3.f6141k
            r0.put(r5, r4)
        L_0x0021:
            r5 = 2
            boolean r5 = m6465J(r5)
            if (r5 == 0) goto L_0x002b
            java.util.Objects.toString(r4)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo10373Z(android.os.Bundle, java.lang.String):void");
    }

    /* renamed from: a */
    public final C2741a0 mo10374a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.m6675d(fragment, str);
        }
        if (m6465J(2)) {
            fragment.toString();
        }
        C2741a0 f = mo10384f(fragment);
        fragment.mFragmentManager = this;
        this.f6133c.mo10524g(f);
        if (!fragment.mDetached) {
            this.f6133c.mo10518a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m6466K(fragment)) {
                this.f6121B = true;
            }
        }
        return f;
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: a0 */
    public final void mo10375a0(final String str, C2887s sVar, final C2801z zVar) {
        final Lifecycle lifecycle = sVar.getLifecycle();
        if (lifecycle.mo10734b() != Lifecycle.State.DESTROYED) {
            C27115 r0 = new C2885q() {
                public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
                    Bundle bundle;
                    if (event == Lifecycle.Event.ON_START && (bundle = FragmentManager.this.f6141k.get(str)) != null) {
                        zVar.mo10428c(bundle, str);
                        FragmentManager fragmentManager = FragmentManager.this;
                        fragmentManager.f6141k.remove(str);
                        FragmentManager.m6465J(2);
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.mo10735c(this);
                        FragmentManager.this.f6142l.remove(str);
                    }
                }
            };
            lifecycle.mo10733a(r0);
            C2724l put = this.f6142l.put(str, new C2724l(lifecycle, zVar, r0));
            if (put != null) {
                put.f6170b.mo10735c(put.f6172d);
            }
            if (m6465J(2)) {
                lifecycle.toString();
                Objects.toString(zVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.activity.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10376b(androidx.fragment.app.C2782r<?> r3, androidx.fragment.app.C2779o r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.r<?> r0 = r2.f6147q
            if (r0 != 0) goto L_0x0121
            r2.f6147q = r3
            r2.f6148r = r4
            r2.f6149s = r5
            if (r5 == 0) goto L_0x0017
            androidx.fragment.app.FragmentManager$e r4 = new androidx.fragment.app.FragmentManager$e
            r4.<init>(r5)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.x> r0 = r2.f6145o
            r0.add(r4)
            goto L_0x0023
        L_0x0017:
            boolean r4 = r3 instanceof androidx.fragment.app.C2799x
            if (r4 == 0) goto L_0x0023
            r4 = r3
            androidx.fragment.app.x r4 = (androidx.fragment.app.C2799x) r4
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.x> r0 = r2.f6145o
            r0.add(r4)
        L_0x0023:
            androidx.fragment.app.Fragment r4 = r2.f6149s
            if (r4 == 0) goto L_0x002a
            r2.mo10385f0()
        L_0x002a:
            boolean r4 = r3 instanceof androidx.activity.C0113g
            if (r4 == 0) goto L_0x003f
            r4 = r3
            androidx.activity.g r4 = (androidx.activity.C0113g) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f6137g = r0
            if (r5 == 0) goto L_0x003a
            r4 = r5
        L_0x003a:
            androidx.fragment.app.FragmentManager$a r1 = r2.f6138h
            r0.mo1104a(r4, r1)
        L_0x003f:
            if (r5 == 0) goto L_0x0062
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.w r3 = r3.f6129J
            java.util.HashMap<java.lang.String, androidx.fragment.app.w> r4 = r3.f6353c
            java.lang.String r0 = r5.mWho
            java.lang.Object r4 = r4.get(r0)
            androidx.fragment.app.w r4 = (androidx.fragment.app.C2797w) r4
            if (r4 != 0) goto L_0x005f
            androidx.fragment.app.w r4 = new androidx.fragment.app.w
            boolean r0 = r3.f6355e
            r4.<init>(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.w> r3 = r3.f6353c
            java.lang.String r0 = r5.mWho
            r3.put(r0, r4)
        L_0x005f:
            r2.f6129J = r4
            goto L_0x0086
        L_0x0062:
            boolean r4 = r3 instanceof androidx.lifecycle.C2880m0
            if (r4 == 0) goto L_0x007e
            androidx.lifecycle.m0 r3 = (androidx.lifecycle.C2880m0) r3
            androidx.lifecycle.l0 r3 = r3.getViewModelStore()
            androidx.lifecycle.k0 r4 = new androidx.lifecycle.k0
            androidx.fragment.app.w$a r0 = androidx.fragment.app.C2797w.f6351h
            r4.<init>((androidx.lifecycle.C2878l0) r3, (androidx.lifecycle.C2870k0.C2872b) r0)
            java.lang.Class<androidx.fragment.app.w> r3 = androidx.fragment.app.C2797w.class
            androidx.lifecycle.i0 r3 = r4.mo10829a(r3)
            androidx.fragment.app.w r3 = (androidx.fragment.app.C2797w) r3
            r2.f6129J = r3
            goto L_0x0086
        L_0x007e:
            androidx.fragment.app.w r3 = new androidx.fragment.app.w
            r4 = 0
            r3.<init>(r4)
            r2.f6129J = r3
        L_0x0086:
            androidx.fragment.app.w r3 = r2.f6129J
            boolean r4 = r2.mo10360M()
            r3.f6357g = r4
            androidx.fragment.app.b0 r3 = r2.f6133c
            androidx.fragment.app.w r4 = r2.f6129J
            r3.f6240d = r4
            androidx.fragment.app.r<?> r3 = r2.f6147q
            boolean r4 = r3 instanceof androidx.savedstate.C3269d
            if (r4 == 0) goto L_0x00ba
            if (r5 != 0) goto L_0x00ba
            androidx.savedstate.d r3 = (androidx.savedstate.C3269d) r3
            androidx.savedstate.b r3 = r3.getSavedStateRegistry()
            androidx.activity.b r4 = new androidx.activity.b
            r0 = 1
            r4.<init>(r2, r0)
            java.lang.String r0 = "android:support:fragments"
            r3.mo12061b(r0, r4)
            android.os.Bundle r3 = r3.mo12060a(r0)
            if (r3 == 0) goto L_0x00ba
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r2.mo10369V(r3)
        L_0x00ba:
            androidx.fragment.app.r<?> r3 = r2.f6147q
            boolean r4 = r3 instanceof androidx.activity.result.C0126g
            if (r4 == 0) goto L_0x0120
            androidx.activity.result.g r3 = (androidx.activity.result.C0126g) r3
            androidx.activity.result.f r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x00d6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            java.lang.String r0 = ":"
            java.lang.String r4 = p003a2.C0023f.m110k(r4, r5, r0)
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r4 = ""
        L_0x00d8:
            java.lang.String r5 = "FragmentManager:"
            java.lang.String r4 = androidx.appcompat.widget.C0326j.m864i(r5, r4)
            java.lang.String r5 = "StartActivityForResult"
            java.lang.String r5 = androidx.appcompat.widget.C0326j.m864i(r4, r5)
            b.e r0 = new b.e
            r0.<init>()
            androidx.fragment.app.FragmentManager$f r1 = new androidx.fragment.app.FragmentManager$f
            r1.<init>()
            androidx.activity.result.e r5 = r3.mo1161d(r5, r0, r1)
            r2.f6154x = r5
            java.lang.String r5 = "StartIntentSenderForResult"
            java.lang.String r5 = androidx.appcompat.widget.C0326j.m864i(r4, r5)
            androidx.fragment.app.FragmentManager$j r0 = new androidx.fragment.app.FragmentManager$j
            r0.<init>()
            androidx.fragment.app.FragmentManager$g r1 = new androidx.fragment.app.FragmentManager$g
            r1.<init>()
            androidx.activity.result.e r5 = r3.mo1161d(r5, r0, r1)
            r2.f6155y = r5
            java.lang.String r5 = "RequestPermissions"
            java.lang.String r4 = androidx.appcompat.widget.C0326j.m864i(r4, r5)
            b.c r5 = new b.c
            r5.<init>()
            androidx.fragment.app.FragmentManager$h r0 = new androidx.fragment.app.FragmentManager$h
            r0.<init>()
            androidx.activity.result.e r3 = r3.mo1161d(r4, r5, r0)
            r2.f6156z = r3
        L_0x0120:
            return
        L_0x0121:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo10376b(androidx.fragment.app.r, androidx.fragment.app.o, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: b0 */
    public final void mo10377b0(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(mo10351A(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    /* renamed from: c */
    public final void mo10378c(Fragment fragment) {
        if (m6465J(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f6133c.mo10518a(fragment);
                if (m6465J(2)) {
                    fragment.toString();
                }
                if (m6466K(fragment)) {
                    this.f6121B = true;
                }
            }
        }
    }

    /* renamed from: c0 */
    public final void mo10379c0(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo10351A(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f6150t;
            this.f6150t = fragment;
            mo10396q(fragment2);
            mo10396q(this.f6150t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: d */
    public final void mo10380d() {
        this.f6132b = false;
        this.f6127H.clear();
        this.f6126G.clear();
    }

    /* renamed from: d0 */
    public final void mo10381d0(Fragment fragment) {
        ViewGroup F = mo10356F(fragment);
        if (F != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) F.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    /* renamed from: e */
    public final HashSet mo10382e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f6133c.mo10521d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2741a0) it.next()).f6223c.mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m6549g(viewGroup, mo10359I()));
            }
        }
        return hashSet;
    }

    /* renamed from: e0 */
    public final void mo10383e0() {
        Iterator it = this.f6133c.mo10521d().iterator();
        while (it.hasNext()) {
            C2741a0 a0Var = (C2741a0) it.next();
            Fragment fragment = a0Var.f6223c;
            if (fragment.mDeferStart) {
                if (this.f6132b) {
                    this.f6125F = true;
                } else {
                    fragment.mDeferStart = false;
                    a0Var.mo10504k();
                }
            }
        }
    }

    /* renamed from: f */
    public final C2741a0 mo10384f(Fragment fragment) {
        C2749b0 b0Var = this.f6133c;
        C2741a0 a0Var = b0Var.f6238b.get(fragment.mWho);
        if (a0Var != null) {
            return a0Var;
        }
        C2741a0 a0Var2 = new C2741a0(this.f6144n, this.f6133c, fragment);
        a0Var2.mo10506m(this.f6147q.f6334c.getClassLoader());
        a0Var2.f6225e = this.f6146p;
        return a0Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (mo10355E() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (m6467L(r3.f6149s) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r0.f163a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r3.f6138h;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10385f0() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$n> r0 = r3.f6131a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$n> r1 = r3.f6131a     // Catch:{ all -> 0x0028 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            androidx.fragment.app.FragmentManager$a r1 = r3.f6138h     // Catch:{ all -> 0x0028 }
            r1.f163a = r2     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            androidx.fragment.app.FragmentManager$a r0 = r3.f6138h
            int r1 = r3.mo10355E()
            if (r1 <= 0) goto L_0x0024
            androidx.fragment.app.Fragment r1 = r3.f6149s
            boolean r1 = m6467L(r1)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r0.f163a = r2
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo10385f0():void");
    }

    /* renamed from: g */
    public final void mo10386g(Fragment fragment) {
        if (m6465J(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m6465J(2)) {
                    fragment.toString();
                }
                C2749b0 b0Var = this.f6133c;
                synchronized (b0Var.f6237a) {
                    b0Var.f6237a.remove(fragment);
                }
                fragment.mAdded = false;
                if (m6466K(fragment)) {
                    this.f6121B = true;
                }
                mo10381d0(fragment);
            }
        }
    }

    /* renamed from: h */
    public final void mo10387h(Configuration configuration) {
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo10388i(MenuItem menuItem) {
        if (this.f6146p < 1) {
            return false;
        }
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo10389j(Menu menu, MenuInflater menuInflater) {
        if (this.f6146p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null && next.isMenuVisible() && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f6135e != null) {
            for (int i = 0; i < this.f6135e.size(); i++) {
                Fragment fragment = this.f6135e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f6135e = arrayList;
        return z;
    }

    /* renamed from: k */
    public final void mo10390k() {
        boolean z = true;
        this.f6124E = true;
        mo10404x(true);
        Iterator it = mo10382e().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).mo10472e();
        }
        C2782r<?> rVar = this.f6147q;
        if (rVar instanceof C2880m0) {
            z = this.f6133c.f6240d.f6356f;
        } else {
            Context context = rVar.f6334c;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (BackStackState backStackState : this.f6140j.values()) {
                for (String str : backStackState.f6078b) {
                    C2797w wVar = this.f6133c.f6240d;
                    wVar.getClass();
                    if (m6465J(3)) {
                        C0070b.m187j("Clearing non-config state for saved state of Fragment ", str, "FragmentManager");
                    }
                    wVar.mo10618d(str);
                }
            }
        }
        mo10399t(-1);
        this.f6147q = null;
        this.f6148r = null;
        this.f6149s = null;
        if (this.f6137g != null) {
            this.f6138h.mo1125b();
            this.f6137g = null;
        }
        C0122e eVar = this.f6154x;
        if (eVar != null) {
            eVar.mo1158c();
            this.f6155y.mo1158c();
            this.f6156z.mo1158c();
        }
    }

    /* renamed from: l */
    public final void mo10391l() {
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    /* renamed from: m */
    public final void mo10392m(boolean z) {
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: n */
    public final void mo10393n() {
        Iterator it = this.f6133c.mo10522e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.mo10393n();
            }
        }
    }

    /* renamed from: o */
    public final boolean mo10394o(MenuItem menuItem) {
        if (this.f6146p < 1) {
            return false;
        }
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void mo10395p(Menu menu) {
        if (this.f6146p >= 1) {
            for (Fragment next : this.f6133c.mo10523f()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo10396q(Fragment fragment) {
        if (fragment != null && fragment.equals(mo10351A(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: r */
    public final void mo10397r(boolean z) {
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: s */
    public final boolean mo10398s(Menu menu) {
        boolean z = false;
        if (this.f6146p < 1) {
            return false;
        }
        for (Fragment next : this.f6133c.mo10523f()) {
            if (next != null && next.isMenuVisible() && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    public final void mo10399t(int i) {
        try {
            this.f6132b = true;
            for (C2741a0 next : this.f6133c.f6238b.values()) {
                if (next != null) {
                    next.f6225e = i;
                }
            }
            mo10361N(i, false);
            Iterator it = mo10382e().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).mo10472e();
            }
            this.f6132b = false;
            mo10404x(true);
        } catch (Throwable th) {
            this.f6132b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder g = C0069a.m176g(128, "FragmentManager{");
        g.append(Integer.toHexString(System.identityHashCode(this)));
        g.append(" in ");
        Fragment fragment = this.f6149s;
        if (fragment != null) {
            g.append(fragment.getClass().getSimpleName());
            g.append("{");
            g.append(Integer.toHexString(System.identityHashCode(this.f6149s)));
            g.append("}");
        } else {
            C2782r<?> rVar = this.f6147q;
            if (rVar != null) {
                g.append(rVar.getClass().getSimpleName());
                g.append("{");
                g.append(Integer.toHexString(System.identityHashCode(this.f6147q)));
                g.append("}");
            } else {
                g.append("null");
            }
        }
        g.append("}}");
        return g.toString();
    }

    /* renamed from: u */
    public final void mo10401u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String i = C0326j.m864i(str, "    ");
        C2749b0 b0Var = this.f6133c;
        b0Var.getClass();
        String str2 = str + "    ";
        if (!b0Var.f6238b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2741a0 next : b0Var.f6238b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment fragment = next.f6223c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = b0Var.f6237a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(b0Var.f6237a.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f6135e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f6135e.get(i3).toString());
            }
        }
        ArrayList<C2740a> arrayList2 = this.f6134d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C2740a aVar = this.f6134d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo10489m(i, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6139i.get());
        synchronized (this.f6131a) {
            int size4 = this.f6131a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f6131a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f6147q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6148r);
        if (this.f6149s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6149s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6146p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f6122C);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6123D);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f6124E);
        if (this.f6121B) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f6121B);
        }
    }

    /* renamed from: v */
    public final void mo10402v(C2726n nVar, boolean z) {
        if (!z) {
            if (this.f6147q == null) {
                if (this.f6124E) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (mo10360M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f6131a) {
            if (this.f6147q != null) {
                this.f6131a.add(nVar);
                mo10371X();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: w */
    public final void mo10403w(boolean z) {
        if (this.f6132b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f6147q == null) {
            if (this.f6124E) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f6147q.f6335d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z && mo10360M()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f6126G == null) {
            this.f6126G = new ArrayList<>();
            this.f6127H = new ArrayList<>();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: x */
    public final boolean mo10404x(boolean z) {
        boolean z2;
        mo10403w(z);
        boolean z3 = false;
        while (true) {
            ArrayList<C2740a> arrayList = this.f6126G;
            ArrayList<Boolean> arrayList2 = this.f6127H;
            synchronized (this.f6131a) {
                if (this.f6131a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f6131a.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= this.f6131a.get(i).mo10430a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f6131a.clear();
                        this.f6147q.f6335d.removeCallbacks(this.f6130K);
                    }
                }
            }
            if (z2) {
                this.f6132b = true;
                try {
                    mo10368U(this.f6126G, this.f6127H);
                    mo10380d();
                    z3 = true;
                } catch (Throwable th) {
                    mo10380d();
                    throw th;
                }
            } else {
                mo10385f0();
                if (this.f6125F) {
                    this.f6125F = false;
                    mo10383e0();
                }
                this.f6133c.f6238b.values().removeAll(Collections.singleton((Object) null));
                return z3;
            }
        }
    }

    /* renamed from: y */
    public final void mo10405y(C2726n nVar, boolean z) {
        if (!z || (this.f6147q != null && !this.f6124E)) {
            mo10403w(z);
            if (nVar.mo10430a(this.f6126G, this.f6127H)) {
                this.f6132b = true;
                try {
                    mo10368U(this.f6126G, this.f6127H);
                } finally {
                    mo10380d();
                }
            }
            mo10385f0();
            if (this.f6125F) {
                this.f6125F = false;
                mo10383e0();
            }
            this.f6133c.f6238b.values().removeAll(Collections.singleton((Object) null));
        }
    }

    /* renamed from: z */
    public final void mo10406z(ArrayList<C2740a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        int i3;
        int i4;
        ArrayList<C2740a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = arrayList3.get(i5).f6261r;
        ArrayList<Fragment> arrayList5 = this.f6128I;
        if (arrayList5 == null) {
            this.f6128I = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f6128I.addAll(this.f6133c.mo10523f());
        Fragment fragment = this.f6150t;
        boolean z2 = false;
        int i7 = i5;
        while (true) {
            int i8 = 2;
            int i9 = 1;
            if (i7 < i6) {
                C2740a aVar = arrayList3.get(i7);
                if (!arrayList4.get(i7).booleanValue()) {
                    ArrayList<Fragment> arrayList6 = this.f6128I;
                    int i10 = 0;
                    while (i10 < aVar.f6246c.size()) {
                        C2751c0.C2752a aVar2 = aVar.f6246c.get(i10);
                        int i11 = aVar2.f6262a;
                        if (i11 != i9) {
                            if (i11 == i8) {
                                Fragment fragment2 = aVar2.f6263b;
                                int i12 = fragment2.mContainerId;
                                int size = arrayList6.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList6.get(size);
                                    if (fragment3.mContainerId == i12) {
                                        if (fragment3 == fragment2) {
                                            z3 = true;
                                        } else {
                                            if (fragment3 == fragment) {
                                                i4 = i12;
                                                aVar.f6246c.add(i10, new C2751c0.C2752a(9, fragment3));
                                                i10++;
                                                fragment = null;
                                            } else {
                                                i4 = i12;
                                            }
                                            C2751c0.C2752a aVar3 = new C2751c0.C2752a(3, fragment3);
                                            aVar3.f6265d = aVar2.f6265d;
                                            aVar3.f6267f = aVar2.f6267f;
                                            aVar3.f6266e = aVar2.f6266e;
                                            aVar3.f6268g = aVar2.f6268g;
                                            aVar.f6246c.add(i10, aVar3);
                                            arrayList6.remove(fragment3);
                                            i10++;
                                            size--;
                                            ArrayList<Boolean> arrayList7 = arrayList2;
                                            int i13 = i;
                                            i12 = i4;
                                        }
                                    }
                                    i4 = i12;
                                    size--;
                                    ArrayList<Boolean> arrayList72 = arrayList2;
                                    int i132 = i;
                                    i12 = i4;
                                }
                                if (z3) {
                                    aVar.f6246c.remove(i10);
                                    i10--;
                                } else {
                                    i3 = 1;
                                    aVar2.f6262a = 1;
                                    aVar2.f6264c = true;
                                    arrayList6.add(fragment2);
                                    i9 = i3;
                                    i10 += i9;
                                    i8 = 2;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                    int i14 = i;
                                }
                            } else if (i11 == 3 || i11 == 6) {
                                arrayList6.remove(aVar2.f6263b);
                                Fragment fragment4 = aVar2.f6263b;
                                if (fragment4 == fragment) {
                                    aVar.f6246c.add(i10, new C2751c0.C2752a(fragment4, 9));
                                    i10++;
                                    i9 = 1;
                                    fragment = null;
                                    i10 += i9;
                                    i8 = 2;
                                    ArrayList<Boolean> arrayList82 = arrayList2;
                                    int i142 = i;
                                }
                            } else if (i11 == 7) {
                                i9 = 1;
                            } else if (i11 == 8) {
                                aVar.f6246c.add(i10, new C2751c0.C2752a(9, fragment));
                                aVar2.f6264c = true;
                                i10++;
                                fragment = aVar2.f6263b;
                            }
                            i3 = 1;
                            i9 = i3;
                            i10 += i9;
                            i8 = 2;
                            ArrayList<Boolean> arrayList822 = arrayList2;
                            int i1422 = i;
                        }
                        arrayList6.add(aVar2.f6263b);
                        i10 += i9;
                        i8 = 2;
                        ArrayList<Boolean> arrayList8222 = arrayList2;
                        int i14222 = i;
                    }
                } else {
                    ArrayList<Fragment> arrayList9 = this.f6128I;
                    int size2 = aVar.f6246c.size() - 1;
                    while (size2 >= 0) {
                        C2751c0.C2752a aVar4 = aVar.f6246c.get(size2);
                        int i15 = aVar4.f6262a;
                        if (i15 != i9) {
                            if (i15 != 3) {
                                switch (i15) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.f6263b;
                                        break;
                                    case 10:
                                        aVar4.f6270i = aVar4.f6269h;
                                        break;
                                }
                            }
                            arrayList9.add(aVar4.f6263b);
                            size2--;
                            i9 = 1;
                        }
                        arrayList9.remove(aVar4.f6263b);
                        size2--;
                        i9 = 1;
                    }
                }
                z2 = z2 || aVar.f6252i;
                i7++;
                arrayList4 = arrayList2;
                int i16 = i;
            } else {
                this.f6128I.clear();
                if (!z && this.f6146p >= 1) {
                    for (int i17 = i; i17 < i6; i17++) {
                        Iterator<C2751c0.C2752a> it = arrayList3.get(i17).f6246c.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().f6263b;
                            if (!(fragment5 == null || fragment5.mFragmentManager == null)) {
                                this.f6133c.mo10524g(mo10384f(fragment5));
                            }
                        }
                    }
                }
                for (int i18 = i; i18 < i6; i18++) {
                    C2740a aVar5 = arrayList3.get(i18);
                    if (arrayList2.get(i18).booleanValue()) {
                        aVar5.mo10486j(-1);
                        boolean z4 = true;
                        int size3 = aVar5.f6246c.size() - 1;
                        while (size3 >= 0) {
                            C2751c0.C2752a aVar6 = aVar5.f6246c.get(size3);
                            Fragment fragment6 = aVar6.f6263b;
                            if (fragment6 != null) {
                                fragment6.mBeingSaved = false;
                                fragment6.setPopDirection(z4);
                                int i19 = aVar5.f6251h;
                                int i20 = 8197;
                                int i21 = 8194;
                                if (i19 != 4097) {
                                    if (i19 == 8194) {
                                        i20 = 4097;
                                    } else if (i19 != 8197) {
                                        i21 = 4099;
                                        if (i19 != 4099) {
                                            if (i19 != 4100) {
                                                i20 = 0;
                                            }
                                        }
                                    } else {
                                        i20 = 4100;
                                    }
                                    fragment6.setNextTransition(i20);
                                    fragment6.setSharedElementNames(aVar5.f6260q, aVar5.f6259p);
                                }
                                i20 = i21;
                                fragment6.setNextTransition(i20);
                                fragment6.setSharedElementNames(aVar5.f6260q, aVar5.f6259p);
                            }
                            switch (aVar6.f6262a) {
                                case 1:
                                    fragment6.setAnimations(aVar6.f6265d, aVar6.f6266e, aVar6.f6267f, aVar6.f6268g);
                                    aVar5.f6218s.mo10372Y(fragment6, true);
                                    aVar5.f6218s.mo10367T(fragment6);
                                    break;
                                case 3:
                                    fragment6.setAnimations(aVar6.f6265d, aVar6.f6266e, aVar6.f6267f, aVar6.f6268g);
                                    aVar5.f6218s.mo10374a(fragment6);
                                    break;
                                case 4:
                                    fragment6.setAnimations(aVar6.f6265d, aVar6.f6266e, aVar6.f6267f, aVar6.f6268g);
                                    aVar5.f6218s.getClass();
                                    if (m6465J(2)) {
                                        Objects.toString(fragment6);
                                    }
                                    if (!fragment6.mHidden) {
                                        break;
                                    } else {
                                        fragment6.mHidden = false;
                                        fragment6.mHiddenChanged = !fragment6.mHiddenChanged;
                                        break;
                                    }
                                case 5:
                                    fragment6.setAnimations(aVar6.f6265d, aVar6.f6266e, aVar6.f6267f, aVar6.f6268g);
                                    aVar5.f6218s.mo10372Y(fragment6, true);
                                    FragmentManager fragmentManager = aVar5.f6218s;
                                    fragmentManager.getClass();
                                    if (m6465J(2)) {
                                        Objects.toString(fragment6);
                                    }
                                    if (fragment6.mHidden) {
                                        break;
                                    } else {
                                        fragment6.mHidden = true;
                                        fragment6.mHiddenChanged = true ^ fragment6.mHiddenChanged;
                                        fragmentManager.mo10381d0(fragment6);
                                        break;
                                    }
                                case 6:
                                    fragment6.setAnimations(aVar6.f6265d, aVar6.f6266e, aVar6.f6267f, aVar6.f6268g);
                                    aVar5.f6218s.mo10378c(fragment6);
                                    break;
                                case 7:
                                    fragment6.setAnimations(aVar6.f6265d, aVar6.f6266e, aVar6.f6267f, aVar6.f6268g);
                                    aVar5.f6218s.mo10372Y(fragment6, true);
                                    aVar5.f6218s.mo10386g(fragment6);
                                    break;
                                case 8:
                                    aVar5.f6218s.mo10379c0((Fragment) null);
                                    break;
                                case 9:
                                    aVar5.f6218s.mo10379c0(fragment6);
                                    break;
                                case 10:
                                    aVar5.f6218s.mo10377b0(fragment6, aVar6.f6269h);
                                    break;
                                default:
                                    StringBuilder h = C0072d.m201h("Unknown cmd: ");
                                    h.append(aVar6.f6262a);
                                    throw new IllegalArgumentException(h.toString());
                            }
                            size3--;
                            z4 = true;
                        }
                        continue;
                    } else {
                        aVar5.mo10486j(1);
                        int size4 = aVar5.f6246c.size();
                        for (int i22 = 0; i22 < size4; i22++) {
                            C2751c0.C2752a aVar7 = aVar5.f6246c.get(i22);
                            Fragment fragment7 = aVar7.f6263b;
                            if (fragment7 != null) {
                                fragment7.mBeingSaved = false;
                                fragment7.setPopDirection(false);
                                fragment7.setNextTransition(aVar5.f6251h);
                                fragment7.setSharedElementNames(aVar5.f6259p, aVar5.f6260q);
                            }
                            switch (aVar7.f6262a) {
                                case 1:
                                    fragment7.setAnimations(aVar7.f6265d, aVar7.f6266e, aVar7.f6267f, aVar7.f6268g);
                                    aVar5.f6218s.mo10372Y(fragment7, false);
                                    aVar5.f6218s.mo10374a(fragment7);
                                    break;
                                case 3:
                                    fragment7.setAnimations(aVar7.f6265d, aVar7.f6266e, aVar7.f6267f, aVar7.f6268g);
                                    aVar5.f6218s.mo10367T(fragment7);
                                    break;
                                case 4:
                                    fragment7.setAnimations(aVar7.f6265d, aVar7.f6266e, aVar7.f6267f, aVar7.f6268g);
                                    FragmentManager fragmentManager2 = aVar5.f6218s;
                                    fragmentManager2.getClass();
                                    if (m6465J(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (fragment7.mHidden) {
                                        break;
                                    } else {
                                        fragment7.mHidden = true;
                                        fragment7.mHiddenChanged = true ^ fragment7.mHiddenChanged;
                                        fragmentManager2.mo10381d0(fragment7);
                                        break;
                                    }
                                case 5:
                                    fragment7.setAnimations(aVar7.f6265d, aVar7.f6266e, aVar7.f6267f, aVar7.f6268g);
                                    aVar5.f6218s.mo10372Y(fragment7, false);
                                    aVar5.f6218s.getClass();
                                    if (m6465J(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (!fragment7.mHidden) {
                                        break;
                                    } else {
                                        fragment7.mHidden = false;
                                        fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                        break;
                                    }
                                case 6:
                                    fragment7.setAnimations(aVar7.f6265d, aVar7.f6266e, aVar7.f6267f, aVar7.f6268g);
                                    aVar5.f6218s.mo10386g(fragment7);
                                    break;
                                case 7:
                                    fragment7.setAnimations(aVar7.f6265d, aVar7.f6266e, aVar7.f6267f, aVar7.f6268g);
                                    aVar5.f6218s.mo10372Y(fragment7, false);
                                    aVar5.f6218s.mo10378c(fragment7);
                                    break;
                                case 8:
                                    aVar5.f6218s.mo10379c0(fragment7);
                                    break;
                                case 9:
                                    aVar5.f6218s.mo10379c0((Fragment) null);
                                    break;
                                case 10:
                                    aVar5.f6218s.mo10377b0(fragment7, aVar7.f6270i);
                                    break;
                                default:
                                    StringBuilder h2 = C0072d.m201h("Unknown cmd: ");
                                    h2.append(aVar7.f6262a);
                                    throw new IllegalArgumentException(h2.toString());
                            }
                        }
                        continue;
                    }
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                boolean booleanValue = arrayList10.get(i6 - 1).booleanValue();
                for (int i23 = i; i23 < i6; i23++) {
                    C2740a aVar8 = arrayList3.get(i23);
                    if (booleanValue) {
                        for (int size5 = aVar8.f6246c.size() - 1; size5 >= 0; size5--) {
                            Fragment fragment8 = aVar8.f6246c.get(size5).f6263b;
                            if (fragment8 != null) {
                                mo10384f(fragment8).mo10504k();
                            }
                        }
                    } else {
                        Iterator<C2751c0.C2752a> it2 = aVar8.f6246c.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment9 = it2.next().f6263b;
                            if (fragment9 != null) {
                                mo10384f(fragment9).mo10504k();
                            }
                        }
                    }
                }
                mo10361N(this.f6146p, true);
                HashSet hashSet = new HashSet();
                for (int i24 = i; i24 < i6; i24++) {
                    Iterator<C2751c0.C2752a> it3 = arrayList3.get(i24).f6246c.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment10 = it3.next().f6263b;
                        if (!(fragment10 == null || (viewGroup = fragment10.mContainer) == null)) {
                            hashSet.add(SpecialEffectsController.m6549g(viewGroup, mo10359I()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                    specialEffectsController.f6201d = booleanValue;
                    specialEffectsController.mo10473h();
                    specialEffectsController.mo10470c();
                }
                for (int i25 = i; i25 < i6; i25++) {
                    C2740a aVar9 = arrayList3.get(i25);
                    if (arrayList10.get(i25).booleanValue() && aVar9.f6220u >= 0) {
                        aVar9.f6220u = -1;
                    }
                    aVar9.getClass();
                }
                if (z2 && this.f6143m != null) {
                    for (int i26 = 0; i26 < this.f6143m.size(); i26++) {
                        this.f6143m.get(i26).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C2712a();

        /* renamed from: b */
        public String f6161b;

        /* renamed from: c */
        public int f6162c;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C2712a implements Parcelable.Creator<LaunchedFragmentInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            public final Object[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f6161b = str;
            this.f6162c = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f6161b);
            parcel.writeInt(this.f6162c);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f6161b = parcel.readString();
            this.f6162c = parcel.readInt();
        }
    }
}
