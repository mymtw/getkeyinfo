package p114g4;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.animation.Animation;
import com.braze.Braze;
import com.braze.C5381b;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5486d;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.p044ui.actions.brazeactions.BrazeActionParser;
import com.braze.p044ui.actions.brazeactions.C5625a;
import com.braze.p044ui.inappmessage.InAppMessageOperation;
import com.braze.p044ui.inappmessage.listeners.C5674d;
import com.braze.p044ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.p044ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.p044ui.inappmessage.views.C5696b;
import com.braze.p044ui.inappmessage.views.C5697c;
import com.braze.p044ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.rx2.C19789b;
import org.json.JSONObject;
import p030bo.app.C3629d7;
import p030bo.app.C3653e7;
import p301z3.C8436f;
import p301z3.C8437g;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: g4.b */
public final class C6861b extends C6879q {

    /* renamed from: y */
    public static final String f15173y = BrazeLogger.m11287i(C6861b.class);

    /* renamed from: z */
    public static volatile C6861b f15174z = null;

    /* renamed from: n */
    public final DefaultInAppMessageViewLifecycleListener f15175n = new DefaultInAppMessageViewLifecycleListener();

    /* renamed from: o */
    public final AtomicBoolean f15176o = new AtomicBoolean(false);

    /* renamed from: p */
    public final Stack<C5483a> f15177p = new Stack<>();

    /* renamed from: q */
    public final HashMap f15178q = new HashMap();

    /* renamed from: r */
    public C6860a f15179r;

    /* renamed from: s */
    public C3629d7 f15180s;

    /* renamed from: t */
    public Integer f15181t;

    /* renamed from: u */
    public BrazeConfigurationProvider f15182u;

    /* renamed from: v */
    public C6877o f15183v;

    /* renamed from: w */
    public C5483a f15184w;

    /* renamed from: x */
    public C5483a f15185x;

    /* renamed from: g4.b$a */
    public static /* synthetic */ class C6862a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15186a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.braze.ui.inappmessage.InAppMessageOperation[] r0 = com.braze.p044ui.inappmessage.InAppMessageOperation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15186a = r0
                com.braze.ui.inappmessage.InAppMessageOperation r1 = com.braze.p044ui.inappmessage.InAppMessageOperation.DISPLAY_NOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15186a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.braze.ui.inappmessage.InAppMessageOperation r1 = com.braze.p044ui.inappmessage.InAppMessageOperation.DISPLAY_LATER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15186a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.braze.ui.inappmessage.InAppMessageOperation r1 = com.braze.p044ui.inappmessage.InAppMessageOperation.DISCARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p114g4.C6861b.C6862a.<clinit>():void");
        }
    }

    /* renamed from: e */
    public static C6861b m13319e() {
        if (f15174z == null) {
            synchronized (C6861b.class) {
                if (f15174z == null) {
                    f15174z = new C6861b();
                }
            }
        }
        return f15174z;
    }

    /* renamed from: b */
    public final void mo18982b(C5483a aVar) {
        InAppMessageOperation inAppMessageOperation;
        this.f15177p.push(aVar);
        try {
            if (this.f15220b == null) {
                if (!this.f15177p.empty()) {
                    BrazeLogger.m11292n(f15173y, "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
                    this.f15185x = this.f15177p.pop();
                    return;
                }
                BrazeLogger.m11285g(f15173y, "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.");
            } else if (this.f15176o.get()) {
                BrazeLogger.m11285g(f15173y, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
            } else if (this.f15177p.isEmpty()) {
                BrazeLogger.m11285g(f15173y, "The in-app message stack is empty. No in-app message will be displayed.");
            } else {
                C5483a pop = this.f15177p.pop();
                if (!pop.isControl()) {
                    this.f15229k.getClass();
                    if ((pop instanceof C5486d) && ViewUtils.m11481g(m13319e().f15221c)) {
                        ((C5486d) pop).mo15972e();
                    }
                    inAppMessageOperation = InAppMessageOperation.DISPLAY_NOW;
                } else {
                    BrazeLogger.m11285g(f15173y, "Using the control in-app message manager listener.");
                    this.f15229k.getClass();
                    if ((pop instanceof C5486d) && ViewUtils.m11481g(m13319e().f15221c)) {
                        ((C5486d) pop).mo15972e();
                    }
                    inAppMessageOperation = InAppMessageOperation.DISPLAY_NOW;
                }
                int i = C6862a.f15186a[inAppMessageOperation.ordinal()];
                if (i == 1) {
                    BrazeLogger.m11285g(f15173y, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
                    BackgroundInAppMessagePreparer.m11460b(pop);
                } else if (i == 2) {
                    BrazeLogger.m11285g(f15173y, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
                    this.f15177p.push(pop);
                } else if (i != 3) {
                    BrazeLogger.m11292n(f15173y, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
                } else {
                    BrazeLogger.m11285g(f15173y, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
                }
            }
        } catch (Exception e) {
            BrazeLogger.m11286h(f15173y, "Error running requestDisplayInAppMessage", e);
        }
    }

    /* renamed from: c */
    public final void mo18983c(C5483a aVar, boolean z) {
        C5483a aVar2 = aVar;
        String str = f15173y;
        StringBuilder h = C0072d.m201h("Attempting to display in-app message with payload: ");
        h.append(JsonUtils.m11315f((JSONObject) aVar.forJsonPut()));
        BrazeLogger.m11291m(str, h.toString());
        if (!this.f15176o.compareAndSet(false, true)) {
            BrazeLogger.m11285g(str, "A in-app message is currently being displayed. Adding in-app message back on the stack.");
            this.f15177p.push(aVar2);
            return;
        }
        try {
            if (this.f15220b != null) {
                if (!z) {
                    long W = aVar.mo15966W();
                    if (W > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis > W) {
                            throw new Exception("In-app message is expired. Doing nothing. Expiration: $" + W + ". Current time: " + currentTimeMillis);
                        }
                    } else {
                        BrazeLogger.m11285g(str, "Expiration timestamp not defined. Continuing.");
                    }
                } else {
                    BrazeLogger.m11285g(str, "Not checking expiration status for carry-over in-app message.");
                }
                if (!mo18989j(aVar)) {
                    throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                } else if (aVar.isControl()) {
                    BrazeLogger.m11285g(str, "Not displaying control in-app message. Logging impression and ending display execution.");
                    aVar.logImpression();
                    mo18987h();
                } else if (C5625a.m11393a(BrazeActionParser.ActionType.INVALID, C5625a.m11395c(aVar))) {
                    C8436f fVar = (C8436f) this.f15178q.get(aVar2);
                    BrazeLogger.m11288j(str, "Cannot show message containing an invalid Braze Action.");
                    if (fVar != null) {
                        BrazeLogger.m11288j(str, "Attempting to perform any fallback actions.");
                        C5381b.m10968h(this.f15220b.getApplicationContext(), fVar);
                    }
                    mo18987h();
                } else if (!C5625a.m11393a(BrazeActionParser.ActionType.REQUEST_PUSH_PERMISSION, C5625a.m11395c(aVar)) || PermissionUtils.m11333c(this.f15220b)) {
                    C6876n a = mo19008a(aVar);
                    if (a != null) {
                        View a2 = a.mo1126a(this.f15220b, aVar2);
                        if (a2 == null) {
                            aVar2.mo15953F(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                        } else if (a2.getParent() == null) {
                            Animation b = this.f15228j.mo16267b(aVar2);
                            Animation a3 = this.f15228j.mo16266a(aVar2);
                            C19789b bVar = this.f15230l;
                            if (a2 instanceof C5696b) {
                                BrazeLogger.m11285g(str, "Creating view wrapper for immersive in-app message.");
                                C5696b bVar2 = (C5696b) a2;
                                int size = ((InAppMessageImmersiveBase) aVar2).f11812G.size();
                                this.f15183v = bVar.mo72606a(a2, aVar, this.f15175n, this.f15182u, b, a3, bVar2.getMessageClickableView(), bVar2.getMessageButtonViews(size), bVar2.getMessageCloseButtonView());
                            } else if (a2 instanceof C5697c) {
                                BrazeLogger.m11285g(str, "Creating view wrapper for base in-app message.");
                                DefaultInAppMessageViewLifecycleListener defaultInAppMessageViewLifecycleListener = this.f15175n;
                                BrazeConfigurationProvider brazeConfigurationProvider = this.f15182u;
                                View messageClickableView = ((C5697c) a2).getMessageClickableView();
                                bVar.getClass();
                                this.f15183v = new C6869i(a2, aVar, defaultInAppMessageViewLifecycleListener, brazeConfigurationProvider, b, a3, messageClickableView);
                            } else {
                                BrazeLogger.m11285g(str, "Creating view wrapper for in-app message.");
                                DefaultInAppMessageViewLifecycleListener defaultInAppMessageViewLifecycleListener2 = this.f15175n;
                                BrazeConfigurationProvider brazeConfigurationProvider2 = this.f15182u;
                                bVar.getClass();
                                this.f15183v = new C6869i(a2, aVar, defaultInAppMessageViewLifecycleListener2, brazeConfigurationProvider2, b, a3, a2);
                            }
                            if (a2 instanceof InAppMessageHtmlBaseView) {
                                BrazeLogger.m11285g(str, "In-app message view includes HTML. Delaying display until the content has finished loading.");
                                ((InAppMessageHtmlBaseView) a2).setHtmlPageFinishedListener(new C3653e7(this, 1));
                                return;
                            }
                            this.f15183v.open(this.f15220b);
                        } else {
                            aVar2.mo15953F(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                        }
                    } else {
                        aVar2.mo15953F(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
                        throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                    }
                } else {
                    C8436f fVar2 = (C8436f) this.f15178q.get(aVar2);
                    BrazeLogger.m11288j(str, "Cannot show message containing a Braze Actions Push Prompt due to existing push prompt status.");
                    if (fVar2 != null) {
                        BrazeLogger.m11288j(str, "Attempting to perform any fallback actions.");
                        C5381b.m10968h(this.f15220b.getApplicationContext(), fVar2);
                    }
                    mo18987h();
                }
            } else {
                this.f15184w = aVar2;
                throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
            }
        } catch (Throwable th) {
            String str2 = f15173y;
            StringBuilder h2 = C0072d.m201h("Could not display in-app message with payload: ");
            h2.append(JsonUtils.m11315f((JSONObject) aVar.forJsonPut()));
            BrazeLogger.m11286h(str2, h2.toString(), th);
            mo18987h();
        }
    }

    /* renamed from: d */
    public final void mo18984d(Context context) {
        Class<C8437g> cls = C8437g.class;
        if (this.f15179r != null) {
            BrazeLogger.m11285g(f15173y, "Removing existing in-app message event subscriber before subscribing a new one.");
            Braze.f11170m.mo15515f(context).mo15491d(this.f15179r, C8436f.class);
        }
        String str = f15173y;
        BrazeLogger.m11285g(str, "Subscribing in-app message event subscriber");
        this.f15179r = new C6860a(this);
        Braze.Companion companion = Braze.f11170m;
        companion.mo15515f(context).mo15487D(this.f15179r);
        if (this.f15180s != null) {
            BrazeLogger.m11291m(str, "Removing existing sdk data wipe event subscriber before subscribing a new one.");
            companion.mo15515f(context).mo15491d(this.f15180s, cls);
        }
        BrazeLogger.m11291m(str, "Subscribing sdk data wipe subscriber");
        this.f15180s = new C3629d7(this, 2);
        companion.mo15515f(context).mo15494i(this.f15180s);
    }

    /* renamed from: f */
    public final void mo18985f(boolean z) {
        C6877o oVar = this.f15183v;
        if (oVar != null) {
            if (z) {
                this.f15175n.mo16324h(oVar.getInAppMessageView(), oVar.getInAppMessage());
            }
            oVar.close();
        }
    }

    /* renamed from: g */
    public final void mo18986g(Activity activity) {
        if (activity == null) {
            BrazeLogger.m11292n(f15173y, "Null Activity passed to registerInAppMessageManager. Doing nothing");
            return;
        }
        String str = f15173y;
        StringBuilder h = C0072d.m201h("Registering InAppMessageManager with activity: ");
        h.append(activity.getLocalClassName());
        BrazeLogger.m11291m(str, h.toString());
        this.f15220b = activity;
        if (this.f15221c == null) {
            this.f15221c = activity.getApplicationContext();
        }
        if (this.f15182u == null) {
            this.f15182u = new BrazeConfigurationProvider(this.f15221c);
        }
        if (this.f15184w != null) {
            BrazeLogger.m11285g(str, "Requesting display of carryover in-app message.");
            this.f15184w.mo15959N();
            mo18983c(this.f15184w, true);
            this.f15184w = null;
        } else if (this.f15185x != null) {
            BrazeLogger.m11285g(str, "Adding previously unregistered in-app message.");
            mo18982b(this.f15185x);
            this.f15185x = null;
        }
        mo18984d(this.f15221c);
    }

    /* renamed from: h */
    public final void mo18987h() {
        String str = f15173y;
        BrazeLogger.m11291m(str, "Resetting after in-app message close.");
        this.f15183v = null;
        this.f15176o.set(false);
        if (this.f15220b != null && this.f15181t != null) {
            StringBuilder h = C0072d.m201h("Setting requested orientation to original orientation ");
            h.append(this.f15181t);
            BrazeLogger.m11285g(str, h.toString());
            ViewUtils.m11484j(this.f15220b, this.f15181t.intValue());
            this.f15181t = null;
        }
    }

    /* renamed from: i */
    public final void mo18988i(Activity activity) {
        if (activity == null) {
            BrazeLogger.m11292n(f15173y, "Null Activity passed to unregisterInAppMessageManager.");
        } else {
            String str = f15173y;
            StringBuilder h = C0072d.m201h("Unregistering InAppMessageManager from activity: ");
            h.append(activity.getLocalClassName());
            BrazeLogger.m11291m(str, h.toString());
        }
        C6877o oVar = this.f15183v;
        if (oVar != null) {
            View inAppMessageView = oVar.getInAppMessageView();
            if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                BrazeLogger.m11285g(f15173y, "In-app message view includes HTML. Removing the page finished listener.");
                ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener((C5674d) null);
            }
            ViewUtils.m11483i(inAppMessageView);
            if (this.f15183v.getIsAnimatingClose()) {
                this.f15175n.mo16318a(this.f15183v.getInAppMessage());
                this.f15184w = null;
            } else {
                this.f15184w = this.f15183v.getInAppMessage();
            }
            this.f15183v = null;
        } else {
            this.f15184w = null;
        }
        this.f15220b = null;
        this.f15176o.set(false);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: j */
    public final boolean mo18989j(C5483a aVar) {
        Activity activity = this.f15220b;
        if (activity == null) {
            BrazeLogger.m11292n(f15173y, "Cannot verify orientation status with null Activity.");
            return true;
        } else if (ViewUtils.m11482h(activity)) {
            BrazeLogger.m11285g(f15173y, "Running on tablet. In-app message can be displayed in any orientation.");
            return true;
        } else {
            Orientation I = aVar.mo15955I();
            if (I == null) {
                BrazeLogger.m11285g(f15173y, "No orientation specified. In-app message can be displayed in any orientation.");
                return true;
            } else if (I == Orientation.ANY) {
                BrazeLogger.m11285g(f15173y, "Any orientation specified. In-app message can be displayed in any orientation.");
                return true;
            } else if (!ViewUtils.m11480f(this.f15220b.getResources().getConfiguration().orientation, I)) {
                return false;
            } else {
                if (this.f15181t == null) {
                    BrazeLogger.m11285g(f15173y, "Requesting orientation lock.");
                    this.f15181t = Integer.valueOf(this.f15220b.getRequestedOrientation());
                    ViewUtils.m11484j(this.f15220b, 14);
                }
                return true;
            }
        }
    }
}
