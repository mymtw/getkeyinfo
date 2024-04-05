package p114g4;

import android.app.Activity;
import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5485c;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.p044ui.inappmessage.listeners.C5672b;
import com.braze.p044ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.p044ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.p044ui.inappmessage.views.C5696b;
import com.braze.p044ui.inappmessage.views.C5697c;
import com.braze.p044ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: g4.i */
public final class C6869i implements C6877o {

    /* renamed from: o */
    public static final String f15195o = BrazeLogger.m11287i(C6869i.class);

    /* renamed from: a */
    public final View f15196a;

    /* renamed from: b */
    public final C5483a f15197b;

    /* renamed from: c */
    public final C5672b f15198c;

    /* renamed from: d */
    public final Animation f15199d;

    /* renamed from: e */
    public final Animation f15200e;

    /* renamed from: f */
    public final BrazeConfigurationProvider f15201f;

    /* renamed from: g */
    public final C6878p f15202g;

    /* renamed from: h */
    public boolean f15203h;

    /* renamed from: i */
    public C6866f f15204i;

    /* renamed from: j */
    public final View f15205j;

    /* renamed from: k */
    public List<View> f15206k;

    /* renamed from: l */
    public View f15207l;

    /* renamed from: m */
    public HashMap f15208m;

    /* renamed from: n */
    public ViewGroup f15209n;

    /* renamed from: g4.i$a */
    public class C6870a implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f15210b;

        public C6870a(ViewGroup viewGroup) {
            this.f15210b = viewGroup;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f15210b.removeOnLayoutChangeListener(this);
            String str = C6869i.f15195o;
            StringBuilder h = C0072d.m201h("Detected (bottom - top) of ");
            h.append(i4 - i2);
            h.append(" in OnLayoutChangeListener");
            BrazeLogger.m11285g(str, h.toString());
            this.f15210b.removeView(C6869i.this.f15196a);
            ViewGroup viewGroup = this.f15210b;
            viewGroup.post(new C6868h(0, this, viewGroup));
        }
    }

    /* renamed from: g4.i$b */
    public static /* synthetic */ class C6871b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15212a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.braze.enums.inappmessage.MessageType[] r0 = com.braze.enums.inappmessage.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15212a = r0
                com.braze.enums.inappmessage.MessageType r1 = com.braze.enums.inappmessage.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15212a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.braze.enums.inappmessage.MessageType r1 = com.braze.enums.inappmessage.MessageType.FULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p114g4.C6869i.C6871b.<clinit>():void");
        }
    }

    public C6869i() {
        throw null;
    }

    public C6869i(View view, C5483a aVar, DefaultInAppMessageViewLifecycleListener defaultInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2) {
        this.f15207l = null;
        this.f15208m = new HashMap();
        this.f15196a = view;
        this.f15197b = aVar;
        this.f15198c = defaultInAppMessageViewLifecycleListener;
        this.f15201f = brazeConfigurationProvider;
        this.f15199d = animation;
        this.f15200e = animation2;
        this.f15203h = false;
        if (view2 != null) {
            this.f15205j = view2;
        } else {
            this.f15205j = view;
        }
        if (aVar instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(view, new C6872j(this));
            touchAwareSwipeDismissTouchListener.setTouchListener(new C6873k(this));
            this.f15205j.setOnTouchListener(touchAwareSwipeDismissTouchListener);
        }
        this.f15205j.setOnClickListener(new C6867g(this, 0));
        this.f15202g = new C6878p(this);
    }

    /* renamed from: a */
    public final void mo18995a() {
        if (this.f15204i == null) {
            C6866f fVar = new C6866f();
            this.f15204i = fVar;
            this.f15196a.postDelayed(fVar, (long) this.f15197b.mo15957L());
        }
    }

    /* renamed from: b */
    public final void mo18996b(ViewGroup viewGroup, C5483a aVar, View view, C5672b bVar) {
        DefaultInAppMessageViewLifecycleListener defaultInAppMessageViewLifecycleListener = (DefaultInAppMessageViewLifecycleListener) bVar;
        defaultInAppMessageViewLifecycleListener.mo16321d(view, aVar);
        String str = f15195o;
        BrazeLogger.m11285g(str, "Adding In-app message view to parent view group.");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (aVar instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) aVar).f11824D == SlideFrom.TOP ? 48 : 80;
        }
        viewGroup.addView(view, layoutParams);
        if (view instanceof C5697c) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2372h.m5253c(viewGroup);
            C2364y.C2373i.m5274u(viewGroup, new C6863c(view));
        }
        if (aVar.mo15956K()) {
            BrazeLogger.m11285g(str, "In-app message view will animate into the visible area.");
            mo18999e(true);
            return;
        }
        BrazeLogger.m11285g(str, "In-app message view will be placed instantly into the visible area.");
        if (aVar.mo15952E() == DismissType.AUTO_DISMISS) {
            mo18995a();
        }
        mo18998d(aVar, view, defaultInAppMessageViewLifecycleListener);
    }

    /* renamed from: c */
    public final void mo18997c() {
        String str = f15195o;
        BrazeLogger.m11285g(str, "Closing in-app message view");
        ViewUtils.m11483i(this.f15196a);
        View view = this.f15196a;
        if (view instanceof InAppMessageHtmlBaseView) {
            ((InAppMessageHtmlBaseView) view).finishWebViewDisplay();
        }
        if (this.f15207l != null) {
            StringBuilder h = C0072d.m201h("Returning focus to view after closing message. View: ");
            h.append(this.f15207l);
            BrazeLogger.m11285g(str, h.toString());
            this.f15207l.requestFocus();
        }
        ((DefaultInAppMessageViewLifecycleListener) this.f15198c).mo16318a(this.f15197b);
    }

    public final void close() {
        if (this.f15201f.isInAppMessageAccessibilityExclusiveModeEnabled()) {
            ViewGroup viewGroup = this.f15209n;
            HashMap hashMap = this.f15208m;
            if (viewGroup == null) {
                BrazeLogger.m11292n(f15195o, "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.");
            } else {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        int id = childAt.getId();
                        if (hashMap.containsKey(Integer.valueOf(id))) {
                            int intValue = ((Integer) hashMap.get(Integer.valueOf(id))).intValue();
                            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                            C2364y.C2368d.m5229s(childAt, intValue);
                        } else {
                            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                            C2364y.C2368d.m5229s(childAt, 0);
                        }
                    }
                }
            }
        }
        this.f15196a.removeCallbacks(this.f15204i);
        ((DefaultInAppMessageViewLifecycleListener) this.f15198c).mo16320c(this.f15196a, this.f15197b);
        if (this.f15197b.mo15965U()) {
            this.f15203h = true;
            mo18999e(false);
            return;
        }
        mo18997c();
    }

    /* renamed from: d */
    public final void mo18998d(C5483a aVar, View view, C5672b bVar) {
        String str = ViewUtils.f12100a;
        C19383o.m32797g(view, "view");
        if (!view.isInTouchMode()) {
            int i = C6871b.f15212a[aVar.mo16002R().ordinal()];
            if (!(i == 1 || i == 2)) {
                ViewUtils.m11485k(view);
            }
        } else {
            ViewUtils.m11485k(view);
        }
        View view2 = this.f15196a;
        if (view2 instanceof C5696b) {
            String message = this.f15197b.getMessage();
            C5483a aVar2 = this.f15197b;
            if (aVar2 instanceof C5485c) {
                String header = ((C5485c) aVar2).getHeader();
                View view3 = this.f15196a;
                view3.announceForAccessibility(header + " . " + message);
            } else {
                this.f15196a.announceForAccessibility(message);
            }
        } else if (view2 instanceof InAppMessageHtmlBaseView) {
            view2.announceForAccessibility("In app message displayed.");
        }
        ((DefaultInAppMessageViewLifecycleListener) bVar).mo16319b(view, aVar);
    }

    /* renamed from: e */
    public final void mo18999e(boolean z) {
        Animation animation = z ? this.f15199d : this.f15200e;
        animation.setAnimationListener(z ? new C6874l(this) : new C6875m(this));
        this.f15196a.clearAnimation();
        this.f15196a.setAnimation(animation);
        animation.startNow();
        this.f15196a.invalidate();
    }

    public final C5483a getInAppMessage() {
        return this.f15197b;
    }

    public final View getInAppMessageView() {
        return this.f15196a;
    }

    public final boolean getIsAnimatingClose() {
        return this.f15203h;
    }

    public final void open(Activity activity) {
        String str = f15195o;
        BrazeLogger.m11291m(str, "Opening in-app message view wrapper");
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290);
        int height = viewGroup.getHeight();
        if (this.f15201f.isInAppMessageAccessibilityExclusiveModeEnabled()) {
            this.f15209n = viewGroup;
            this.f15208m.clear();
            ViewGroup viewGroup2 = this.f15209n;
            HashMap hashMap = this.f15208m;
            if (viewGroup2 == null) {
                BrazeLogger.m11292n(str, "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.");
            } else {
                for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt != null) {
                        hashMap.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                        C2364y.C2368d.m5229s(childAt, 4);
                    }
                }
            }
        }
        this.f15207l = activity.getCurrentFocus();
        if (height == 0) {
            viewGroup.addOnLayoutChangeListener(new C6870a(viewGroup));
            return;
        }
        String str2 = f15195o;
        BrazeLogger.m11285g(str2, "Detected root view height of " + height);
        mo18996b(viewGroup, this.f15197b, this.f15196a, this.f15198c);
    }
}
