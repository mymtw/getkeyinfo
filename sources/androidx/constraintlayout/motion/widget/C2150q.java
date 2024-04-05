package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.reflect.C19421p;
import p184n0.C7363c;
import p212q0.C7714d;

/* renamed from: androidx.constraintlayout.motion.widget.q */
public final class C2150q {

    /* renamed from: a */
    public final MotionLayout f4962a;

    /* renamed from: b */
    public C7714d f4963b = null;

    /* renamed from: c */
    public C2152b f4964c = null;

    /* renamed from: d */
    public boolean f4965d = false;

    /* renamed from: e */
    public ArrayList<C2152b> f4966e = new ArrayList<>();

    /* renamed from: f */
    public C2152b f4967f = null;

    /* renamed from: g */
    public ArrayList<C2152b> f4968g = new ArrayList<>();

    /* renamed from: h */
    public SparseArray<C2236a> f4969h = new SparseArray<>();

    /* renamed from: i */
    public HashMap<String, Integer> f4970i = new HashMap<>();

    /* renamed from: j */
    public SparseIntArray f4971j = new SparseIntArray();

    /* renamed from: k */
    public int f4972k = LogSeverity.WARNING_VALUE;

    /* renamed from: l */
    public int f4973l = 0;

    /* renamed from: m */
    public MotionEvent f4974m;

    /* renamed from: n */
    public boolean f4975n = false;

    /* renamed from: o */
    public boolean f4976o = false;

    /* renamed from: p */
    public MotionLayout.C2110f f4977p;

    /* renamed from: q */
    public boolean f4978q;

    /* renamed from: r */
    public float f4979r;

    /* renamed from: s */
    public float f4980s;

    /* renamed from: androidx.constraintlayout.motion.widget.q$a */
    public class C2151a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C7363c f4981a;

        public C2151a(C7363c cVar) {
            this.f4981a = cVar;
        }

        public final float getInterpolation(float f) {
            return (float) this.f4981a.mo19654a((double) f);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2150q(android.content.Context r8, androidx.constraintlayout.motion.widget.MotionLayout r9, int r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.f4963b = r0
            r7.f4964c = r0
            r1 = 0
            r7.f4965d = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.f4966e = r2
            r7.f4967f = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.f4968g = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r7.f4969h = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r7.f4970i = r2
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            r7.f4971j = r2
            r2 = 400(0x190, float:5.6E-43)
            r7.f4972k = r2
            r7.f4973l = r1
            r7.f4975n = r1
            r7.f4976o = r1
            r7.f4962a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r2 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x0048:
            r3 = 1
            if (r2 == r3) goto L_0x012d
            if (r2 == 0) goto L_0x011b
            r4 = 2
            if (r2 == r4) goto L_0x0052
            goto L_0x011e
        L_0x0052:
            java.lang.String r2 = r9.getName()     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r6 = -1
            switch(r5) {
                case -1349929691: goto L_0x009a;
                case -1239391468: goto L_0x0090;
                case 269306229: goto L_0x0087;
                case 312750793: goto L_0x007d;
                case 327855227: goto L_0x0073;
                case 793277014: goto L_0x0069;
                case 1382829617: goto L_0x005f;
                default: goto L_0x005e;
            }     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x005e:
            goto L_0x00a4
        L_0x005f:
            java.lang.String r3 = "StateSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r2 == 0) goto L_0x00a4
            r3 = 4
            goto L_0x00a5
        L_0x0069:
            java.lang.String r3 = "MotionScene"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r2 == 0) goto L_0x00a4
            r3 = r1
            goto L_0x00a5
        L_0x0073:
            java.lang.String r3 = "OnSwipe"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r2 == 0) goto L_0x00a4
            r3 = r4
            goto L_0x00a5
        L_0x007d:
            java.lang.String r3 = "OnClick"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r2 == 0) goto L_0x00a4
            r3 = 3
            goto L_0x00a5
        L_0x0087:
            java.lang.String r4 = "Transition"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r2 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x0090:
            java.lang.String r3 = "KeyFrameSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r2 == 0) goto L_0x00a4
            r3 = 6
            goto L_0x00a5
        L_0x009a:
            java.lang.String r3 = "ConstraintSet"
            boolean r2 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r2 == 0) goto L_0x00a4
            r3 = 5
            goto L_0x00a5
        L_0x00a4:
            r3 = r6
        L_0x00a5:
            switch(r3) {
                case 0: goto L_0x0117;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00b6;
                case 6: goto L_0x00aa;
                default: goto L_0x00a8;
            }     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x00a8:
            goto L_0x011e
        L_0x00aa:
            androidx.constraintlayout.motion.widget.i r2 = new androidx.constraintlayout.motion.widget.i     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r2.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.i> r3 = r0.f4992k     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x011e
        L_0x00b6:
            r7.mo8169i(r8, r9)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x011e
        L_0x00ba:
            q0.d r2 = new q0.d     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r2.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r7.f4963b = r2     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x011e
        L_0x00c2:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b$a> r2 = r0.f4994m     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            androidx.constraintlayout.motion.widget.q$b$a r3 = new androidx.constraintlayout.motion.widget.q$b$a     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r3.<init>(r8, r0, r9)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x011e
        L_0x00cd:
            if (r0 != 0) goto L_0x00d9
            android.content.res.Resources r2 = r8.getResources()     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r2.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r9.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x00d9:
            androidx.constraintlayout.motion.widget.v r2 = new androidx.constraintlayout.motion.widget.v     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r7.f4962a     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r2.<init>(r8, r3, r9)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r0.f4993l = r2     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x011e
        L_0x00e3:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r0 = r7.f4966e     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            androidx.constraintlayout.motion.widget.q$b r2 = new androidx.constraintlayout.motion.widget.q$b     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r2.<init>(r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r0.add(r2)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            androidx.constraintlayout.motion.widget.q$b r0 = r7.f4964c     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r0 != 0) goto L_0x0100
            boolean r0 = r2.f4983b     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r0 != 0) goto L_0x0100
            r7.f4964c = r2     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            androidx.constraintlayout.motion.widget.v r0 = r2.f4993l     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r0 == 0) goto L_0x0100
            boolean r3 = r7.f4978q     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r0.mo8192b(r3)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x0100:
            boolean r0 = r2.f4983b     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r0 == 0) goto L_0x0115
            int r0 = r2.f4984c     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            if (r0 != r6) goto L_0x010b
            r7.f4967f = r2     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x0110
        L_0x010b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r0 = r7.f4968g     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r0.add(r2)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x0110:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r0 = r7.f4966e     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            r0.remove(r2)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x0115:
            r0 = r2
            goto L_0x011e
        L_0x0117:
            r7.mo8170j(r8, r9)     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x011e
        L_0x011b:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
        L_0x011e:
            int r2 = r9.next()     // Catch:{ XmlPullParserException -> 0x0129, IOException -> 0x0124 }
            goto L_0x0048
        L_0x0124:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x012d
        L_0x0129:
            r8 = move-exception
            r8.printStackTrace()
        L_0x012d:
            android.util.SparseArray<androidx.constraintlayout.widget.a> r8 = r7.f4969h
            androidx.constraintlayout.widget.a r9 = new androidx.constraintlayout.widget.a
            r9.<init>()
            r10 = 2131429018(0x7f0b069a, float:1.8479697E38)
            r8.put(r10, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r7.f4970i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "motion_base"
            r8.put(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C2150q.<init>(android.content.Context, androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    /* renamed from: a */
    public final boolean mo8161a(MotionLayout motionLayout, int i) {
        if ((this.f4977p != null) || this.f4965d) {
            return false;
        }
        Iterator<C2152b> it = this.f4966e.iterator();
        while (it.hasNext()) {
            C2152b next = it.next();
            int i2 = next.f4995n;
            if (!(i2 == 0 || this.f4964c == next)) {
                if (i == next.f4985d && (i2 == 4 || i2 == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.f4995n == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                } else if (i == next.f4984c && (i2 == 3 || i2 == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.f4995n == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C2236a mo8162b(int i) {
        int a;
        C7714d dVar = this.f4963b;
        if (!(dVar == null || (a = dVar.mo20181a(i)) == -1)) {
            i = a;
        }
        if (this.f4969h.get(i) != null) {
            return this.f4969h.get(i);
        }
        StringBuilder h = C0072d.m201h("Warning could not find ConstraintSet id/");
        h.append(C2114a.m4566b(this.f4962a.getContext(), i));
        h.append(" In MotionScene");
        Log.e("MotionScene", h.toString());
        SparseArray<C2236a> sparseArray = this.f4969h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: c */
    public final int mo8163c(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    /* renamed from: d */
    public final Interpolator mo8164d() {
        C2152b bVar = this.f4964c;
        int i = bVar.f4986e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f4962a.getContext(), this.f4964c.f4988g);
        }
        if (i == -1) {
            return new C2151a(C7363c.m14180c(bVar.f4987f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* renamed from: e */
    public final void mo8165e(C2148o oVar) {
        C2152b bVar = this.f4964c;
        if (bVar == null) {
            C2152b bVar2 = this.f4967f;
            if (bVar2 != null) {
                Iterator<C2139i> it = bVar2.f4992k.iterator();
                while (it.hasNext()) {
                    it.next().mo8147a(oVar);
                }
                return;
            }
            return;
        }
        Iterator<C2139i> it2 = bVar.f4992k.iterator();
        while (it2.hasNext()) {
            it2.next().mo8147a(oVar);
        }
    }

    /* renamed from: f */
    public final float mo8166f() {
        C2186v vVar;
        C2152b bVar = this.f4964c;
        if (bVar == null || (vVar = bVar.f4993l) == null) {
            return 0.0f;
        }
        return vVar.f5045q;
    }

    /* renamed from: g */
    public final int mo8167g() {
        C2152b bVar = this.f4964c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f4985d;
    }

    /* renamed from: h */
    public final ArrayList mo8168h(int i) {
        int a;
        C7714d dVar = this.f4963b;
        if (!(dVar == null || (a = dVar.mo20181a(i)) == -1)) {
            i = a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C2152b> it = this.f4966e.iterator();
        while (it.hasNext()) {
            C2152b next = it.next();
            if (next.f4985d == i || next.f4984c == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void mo8169i(Context context, XmlResourceParser xmlResourceParser) {
        C2236a aVar = new C2236a();
        aVar.f5374b = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i2 = mo8163c(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i = mo8163c(context, attributeValue);
                HashMap<String, Integer> hashMap = this.f4970i;
                int indexOf = attributeValue.indexOf(47);
                if (indexOf >= 0) {
                    attributeValue = attributeValue.substring(indexOf + 1);
                }
                hashMap.put(attributeValue, Integer.valueOf(i));
            }
        }
        if (i != -1) {
            int i4 = this.f4962a.mDebugPath;
            aVar.mo8492l(context, xmlResourceParser);
            if (i2 != -1) {
                this.f4971j.put(i, i2);
            }
            this.f4969h.put(i, aVar);
        }
    }

    /* renamed from: j */
    public final void mo8170j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43302D);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f4972k = obtainStyledAttributes.getInt(index, this.f4972k);
            } else if (index == 1) {
                this.f4973l = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    public final void mo8171k(int i) {
        int i2 = this.f4971j.get(i);
        if (i2 > 0) {
            mo8171k(this.f4971j.get(i));
            C2236a aVar = this.f4969h.get(i);
            C2236a aVar2 = this.f4969h.get(i2);
            if (aVar2 == null) {
                StringBuilder h = C0072d.m201h("ERROR! invalid deriveConstraintsFrom: @id/");
                h.append(C2114a.m4566b(this.f4962a.getContext(), i2));
                Log.e("MotionScene", h.toString());
                return;
            }
            aVar.getClass();
            for (Integer next : aVar2.f5375c.keySet()) {
                int intValue = next.intValue();
                C2236a.C2237a aVar3 = aVar2.f5375c.get(next);
                if (!aVar.f5375c.containsKey(Integer.valueOf(intValue))) {
                    aVar.f5375c.put(Integer.valueOf(intValue), new C2236a.C2237a());
                }
                C2236a.C2237a aVar4 = aVar.f5375c.get(Integer.valueOf(intValue));
                C2236a.C2238b bVar = aVar4.f5379d;
                if (!bVar.f5411b) {
                    bVar.mo8499a(aVar3.f5379d);
                }
                C2236a.C2240d dVar = aVar4.f5377b;
                if (!dVar.f5453a) {
                    C2236a.C2240d dVar2 = aVar3.f5377b;
                    dVar.f5453a = dVar2.f5453a;
                    dVar.f5454b = dVar2.f5454b;
                    dVar.f5456d = dVar2.f5456d;
                    dVar.f5457e = dVar2.f5457e;
                    dVar.f5455c = dVar2.f5455c;
                }
                C2236a.C2241e eVar = aVar4.f5380e;
                if (!eVar.f5459a) {
                    eVar.mo8504a(aVar3.f5380e);
                }
                C2236a.C2239c cVar = aVar4.f5378c;
                if (!cVar.f5446a) {
                    cVar.mo8501a(aVar3.f5378c);
                }
                for (String next2 : aVar3.f5381f.keySet()) {
                    if (!aVar4.f5381f.containsKey(next2)) {
                        aVar4.f5381f.put(next2, aVar3.f5381f.get(next2));
                    }
                }
            }
            this.f4971j.put(i, -1);
        }
    }

    /* renamed from: l */
    public final void mo8172l(MotionLayout motionLayout) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.f4969h.size()) {
                int keyAt = this.f4969h.keyAt(i);
                int i2 = this.f4971j.get(keyAt);
                int size = this.f4971j.size();
                while (true) {
                    if (i2 <= 0) {
                        z = false;
                        break;
                    } else if (i2 == keyAt) {
                        break;
                    } else {
                        int i3 = size - 1;
                        if (size < 0) {
                            break;
                        }
                        i2 = this.f4971j.get(i2);
                        size = i3;
                    }
                }
                if (z) {
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    return;
                } else {
                    mo8171k(keyAt);
                    i++;
                }
            } else {
                for (int i4 = 0; i4 < this.f4969h.size(); i4++) {
                    C2236a valueAt = this.f4969h.valueAt(i4);
                    valueAt.getClass();
                    int childCount = motionLayout.getChildCount();
                    int i5 = 0;
                    while (i5 < childCount) {
                        View childAt = motionLayout.getChildAt(i5);
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        int id = childAt.getId();
                        if (!valueAt.f5374b || id != -1) {
                            if (!valueAt.f5375c.containsKey(Integer.valueOf(id))) {
                                valueAt.f5375c.put(Integer.valueOf(id), new C2236a.C2237a());
                            }
                            C2236a.C2237a aVar = valueAt.f5375c.get(Integer.valueOf(id));
                            if (!aVar.f5379d.f5411b) {
                                aVar.mo8496b(id, layoutParams);
                                if (childAt instanceof ConstraintHelper) {
                                    aVar.f5379d.f5418e0 = ((ConstraintHelper) childAt).getReferencedIds();
                                    if (childAt instanceof Barrier) {
                                        Barrier barrier = (Barrier) childAt;
                                        aVar.f5379d.f5428j0 = barrier.allowsGoneWidget();
                                        aVar.f5379d.f5412b0 = barrier.getType();
                                        aVar.f5379d.f5414c0 = barrier.getMargin();
                                    }
                                }
                                aVar.f5379d.f5411b = true;
                            }
                            C2236a.C2240d dVar = aVar.f5377b;
                            if (!dVar.f5453a) {
                                dVar.f5454b = childAt.getVisibility();
                                aVar.f5377b.f5456d = childAt.getAlpha();
                                aVar.f5377b.f5453a = true;
                            }
                            C2236a.C2241e eVar = aVar.f5380e;
                            if (!eVar.f5459a) {
                                eVar.f5459a = true;
                                eVar.f5460b = childAt.getRotation();
                                aVar.f5380e.f5461c = childAt.getRotationX();
                                aVar.f5380e.f5462d = childAt.getRotationY();
                                aVar.f5380e.f5463e = childAt.getScaleX();
                                aVar.f5380e.f5464f = childAt.getScaleY();
                                float pivotX = childAt.getPivotX();
                                float pivotY = childAt.getPivotY();
                                if (!(((double) pivotX) == ShadowDrawableWrapper.COS_45 && ((double) pivotY) == ShadowDrawableWrapper.COS_45)) {
                                    C2236a.C2241e eVar2 = aVar.f5380e;
                                    eVar2.f5465g = pivotX;
                                    eVar2.f5466h = pivotY;
                                }
                                aVar.f5380e.f5467i = childAt.getTranslationX();
                                aVar.f5380e.f5468j = childAt.getTranslationY();
                                aVar.f5380e.f5469k = childAt.getTranslationZ();
                                C2236a.C2241e eVar3 = aVar.f5380e;
                                if (eVar3.f5470l) {
                                    eVar3.f5471m = childAt.getElevation();
                                }
                            }
                            i5++;
                        } else {
                            throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                        }
                    }
                }
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8173m(int r8, int r9) {
        /*
            r7 = this;
            q0.d r0 = r7.f4963b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.mo20181a(r8)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r8
        L_0x000d:
            q0.d r2 = r7.f4963b
            int r2 = r2.mo20181a(r9)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r8
        L_0x0017:
            r2 = r9
        L_0x0018:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r7.f4966e
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C2150q.C2152b) r4
            int r5 = r4.f4984c
            if (r5 != r2) goto L_0x0032
            int r6 = r4.f4985d
            if (r6 == r0) goto L_0x0038
        L_0x0032:
            if (r5 != r9) goto L_0x001e
            int r5 = r4.f4985d
            if (r5 != r8) goto L_0x001e
        L_0x0038:
            r7.f4964c = r4
            androidx.constraintlayout.motion.widget.v r8 = r4.f4993l
            if (r8 == 0) goto L_0x0043
            boolean r9 = r7.f4978q
            r8.mo8192b(r9)
        L_0x0043:
            return
        L_0x0044:
            androidx.constraintlayout.motion.widget.q$b r8 = r7.f4967f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r3 = r7.f4968g
            java.util.Iterator r3 = r3.iterator()
        L_0x004c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.q$b r4 = (androidx.constraintlayout.motion.widget.C2150q.C2152b) r4
            int r5 = r4.f4984c
            if (r5 != r9) goto L_0x004c
            r8 = r4
            goto L_0x004c
        L_0x005e:
            androidx.constraintlayout.motion.widget.q$b r9 = new androidx.constraintlayout.motion.widget.q$b
            r9.<init>(r7, r8)
            r9.f4985d = r0
            r9.f4984c = r2
            if (r0 == r1) goto L_0x006e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r8 = r7.f4966e
            r8.add(r9)
        L_0x006e:
            r7.f4964c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C2150q.mo8173m(int, int):void");
    }

    /* renamed from: n */
    public final boolean mo8174n() {
        Iterator<C2152b> it = this.f4966e.iterator();
        while (it.hasNext()) {
            if (it.next().f4993l != null) {
                return true;
            }
        }
        C2152b bVar = this.f4964c;
        return (bVar == null || bVar.f4993l == null) ? false : true;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.q$b */
    public static class C2152b {

        /* renamed from: a */
        public int f4982a = -1;

        /* renamed from: b */
        public boolean f4983b = false;

        /* renamed from: c */
        public int f4984c = -1;

        /* renamed from: d */
        public int f4985d = -1;

        /* renamed from: e */
        public int f4986e = 0;

        /* renamed from: f */
        public String f4987f = null;

        /* renamed from: g */
        public int f4988g = -1;

        /* renamed from: h */
        public int f4989h = LogSeverity.WARNING_VALUE;

        /* renamed from: i */
        public float f4990i = 0.0f;

        /* renamed from: j */
        public final C2150q f4991j;

        /* renamed from: k */
        public ArrayList<C2139i> f4992k = new ArrayList<>();

        /* renamed from: l */
        public C2186v f4993l = null;

        /* renamed from: m */
        public ArrayList<C2153a> f4994m = new ArrayList<>();

        /* renamed from: n */
        public int f4995n = 0;

        /* renamed from: o */
        public boolean f4996o = false;

        /* renamed from: p */
        public int f4997p = -1;

        /* renamed from: q */
        public int f4998q = 0;

        /* renamed from: r */
        public int f4999r = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.q$b$a */
        public static class C2153a implements View.OnClickListener {

            /* renamed from: b */
            public final C2152b f5000b;

            /* renamed from: c */
            public int f5001c = -1;

            /* renamed from: d */
            public int f5002d = 17;

            public C2153a(Context context, C2152b bVar, XmlResourceParser xmlResourceParser) {
                this.f5000b = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43304F);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.f5001c = obtainStyledAttributes.getResourceId(index, this.f5001c);
                    } else if (index == 0) {
                        this.f5002d = obtainStyledAttributes.getInt(index, this.f5002d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public final void mo8176a(MotionLayout motionLayout, int i, C2152b bVar) {
                int i2 = this.f5001c;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    StringBuilder h = C0072d.m201h("OnClick could not find id ");
                    h.append(this.f5001c);
                    Log.e("MotionScene", h.toString());
                    return;
                }
                int i3 = bVar.f4985d;
                int i4 = bVar.f4984c;
                if (i3 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.f5002d;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    view.setOnClickListener(this);
                }
            }

            /* renamed from: b */
            public final void mo8177b(MotionLayout motionLayout) {
                int i = this.f5001c;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        StringBuilder h = C0072d.m201h(" (*)  could not find id ");
                        h.append(this.f5001c);
                        Log.e("MotionScene", h.toString());
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            public final void onClick(View view) {
                MotionLayout motionLayout = this.f5000b.f4991j.f4962a;
                if (motionLayout.isInteractionEnabled()) {
                    C2152b bVar = this.f5000b;
                    if (bVar.f4985d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.transitionToState(this.f5000b.f4984c);
                            return;
                        }
                        C2152b bVar2 = this.f5000b;
                        C2152b bVar3 = new C2152b(bVar2.f4991j, bVar2);
                        bVar3.f4985d = currentState;
                        bVar3.f4984c = this.f5000b.f4984c;
                        motionLayout.setTransition(bVar3);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    C2152b bVar4 = bVar.f4991j.f4964c;
                    int i = this.f5002d;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) ? false : true;
                    if (z2 && z3) {
                        if (bVar4 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z2 = false;
                        } else {
                            z3 = false;
                        }
                    }
                    C2152b bVar5 = this.f5000b;
                    if (bVar5 != bVar4) {
                        int i2 = bVar5.f4984c;
                        int i3 = bVar5.f4985d;
                        if (i3 != -1) {
                        }
                    }
                    z = true;
                    if (!z) {
                        return;
                    }
                    if (z2 && (this.f5002d & 1) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.transitionToEnd();
                    } else if (z3 && (this.f5002d & 16) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.transitionToStart();
                    } else if (z2 && (this.f5002d & 256) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(1.0f);
                    } else if (z3 && (this.f5002d & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public C2152b(C2150q qVar, C2152b bVar) {
            this.f4991j = qVar;
            if (bVar != null) {
                this.f4997p = bVar.f4997p;
                this.f4986e = bVar.f4986e;
                this.f4987f = bVar.f4987f;
                this.f4988g = bVar.f4988g;
                this.f4989h = bVar.f4989h;
                this.f4992k = bVar.f4992k;
                this.f4990i = bVar.f4990i;
                this.f4998q = bVar.f4998q;
            }
        }

        public C2152b(C2150q qVar, Context context, XmlResourceParser xmlResourceParser) {
            this.f4989h = qVar.f4972k;
            this.f4998q = qVar.f4973l;
            this.f4991j = qVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C19421p.f43310L);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.f4984c = obtainStyledAttributes.getResourceId(index, this.f4984c);
                    if (ResponseConstants.LAYOUT.equals(context.getResources().getResourceTypeName(this.f4984c))) {
                        C2236a aVar = new C2236a();
                        aVar.mo8491k(context, this.f4984c);
                        qVar.f4969h.append(this.f4984c, aVar);
                    }
                } else if (index == 3) {
                    this.f4985d = obtainStyledAttributes.getResourceId(index, this.f4985d);
                    if (ResponseConstants.LAYOUT.equals(context.getResources().getResourceTypeName(this.f4985d))) {
                        C2236a aVar2 = new C2236a();
                        aVar2.mo8491k(context, this.f4985d);
                        qVar.f4969h.append(this.f4985d, aVar2);
                    }
                } else if (index == 6) {
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f4988g = resourceId;
                        if (resourceId != -1) {
                            this.f4986e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f4987f = string;
                        if (string.indexOf("/") > 0) {
                            this.f4988g = obtainStyledAttributes.getResourceId(index, -1);
                            this.f4986e = -2;
                        } else {
                            this.f4986e = -1;
                        }
                    } else {
                        this.f4986e = obtainStyledAttributes.getInteger(index, this.f4986e);
                    }
                } else if (index == 4) {
                    this.f4989h = obtainStyledAttributes.getInt(index, this.f4989h);
                } else if (index == 8) {
                    this.f4990i = obtainStyledAttributes.getFloat(index, this.f4990i);
                } else if (index == 1) {
                    this.f4995n = obtainStyledAttributes.getInteger(index, this.f4995n);
                } else if (index == 0) {
                    this.f4982a = obtainStyledAttributes.getResourceId(index, this.f4982a);
                } else if (index == 9) {
                    this.f4996o = obtainStyledAttributes.getBoolean(index, this.f4996o);
                } else if (index == 7) {
                    this.f4997p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f4998q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f4999r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f4985d == -1) {
                this.f4983b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
