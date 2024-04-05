package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;
import com.facebook.appevents.codeless.RCTCodelessLoggingEventListener;
import com.facebook.appevents.codeless.internal.C12225d;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p312ag.C8527d;
import p365hg.C12869i0;
import p401mg.C13080a;

public final class CodelessMatcher {

    /* renamed from: f */
    public static CodelessMatcher f27257f;

    /* renamed from: g */
    public static final C12217a f27258g = new C12217a();

    /* renamed from: a */
    public final Handler f27259a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Set<Activity> f27260b;

    /* renamed from: c */
    public final LinkedHashSet f27261c;

    /* renamed from: d */
    public HashSet<String> f27262d;

    /* renamed from: e */
    public final HashMap<Integer, HashSet<String>> f27263e;

    public static final class ViewMatcher implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final C12216a Companion = new C12216a();
        private final String activityName;
        private List<EventBinding> eventBindings;
        private final Handler handler;
        private final HashSet<String> listenerSet;
        private final WeakReference<View> rootView;

        /* renamed from: com.facebook.appevents.codeless.CodelessMatcher$ViewMatcher$a */
        public static final class C12216a {
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d5, code lost:
                if ((!kotlin.jvm.internal.C19383o.m32792b(r7.getClass().getSimpleName(), (java.lang.String) r10.get(r10.size() - 1))) != false) goto L_0x01a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0115, code lost:
                if ((!kotlin.jvm.internal.C19383o.m32792b(r10, r6)) != false) goto L_0x01a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x014a, code lost:
                if ((!kotlin.jvm.internal.C19383o.m32792b(r10, r6)) != false) goto L_0x01a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x0172, code lost:
                if ((!kotlin.jvm.internal.C19383o.m32792b(r10, r6)) != false) goto L_0x01a8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a6, code lost:
                if ((!kotlin.jvm.internal.C19383o.m32792b(r10, r4)) != false) goto L_0x01a8;
             */
            /* JADX WARNING: Removed duplicated region for block: B:68:0x01ad A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x01ae  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static java.util.ArrayList m20044a(android.view.View r7, java.util.List r8, int r9, int r10, java.lang.String r11) {
                /*
                    java.lang.String r0 = "path"
                    kotlin.jvm.internal.C19383o.m32797g(r8, r0)
                    java.lang.String r0 = "mapKey"
                    kotlin.jvm.internal.C19383o.m32797g(r11, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r11)
                    r11 = 46
                    r0.append(r11)
                    r0.append(r10)
                    java.lang.String r11 = r0.toString()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    if (r7 != 0) goto L_0x0026
                    return r0
                L_0x0026:
                    int r1 = r8.size()
                    r2 = 0
                    r3 = 1
                    if (r9 < r1) goto L_0x0038
                    com.facebook.appevents.codeless.CodelessMatcher$b r10 = new com.facebook.appevents.codeless.CodelessMatcher$b
                    r10.<init>(r7, r11)
                    r0.add(r10)
                    goto L_0x01bd
                L_0x0038:
                    java.lang.Object r1 = r8.get(r9)
                    com.facebook.appevents.codeless.internal.PathComponent r1 = (com.facebook.appevents.codeless.internal.PathComponent) r1
                    java.lang.String r4 = r1.f27272a
                    java.lang.String r5 = ".."
                    boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
                    if (r4 == 0) goto L_0x006f
                    android.view.ViewParent r7 = r7.getParent()
                    boolean r10 = r7 instanceof android.view.ViewGroup
                    if (r10 == 0) goto L_0x006e
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    java.util.ArrayList r7 = m20045b(r7)
                    int r10 = r7.size()
                L_0x005a:
                    if (r2 >= r10) goto L_0x006e
                    java.lang.Object r1 = r7.get(r2)
                    android.view.View r1 = (android.view.View) r1
                    int r4 = r9 + 1
                    java.util.ArrayList r1 = m20044a(r1, r8, r4, r2, r11)
                    r0.addAll(r1)
                    int r2 = r2 + 1
                    goto L_0x005a
                L_0x006e:
                    return r0
                L_0x006f:
                    java.lang.String r4 = r1.f27272a
                    java.lang.String r5 = "."
                    boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
                    if (r4 == 0) goto L_0x0082
                    com.facebook.appevents.codeless.CodelessMatcher$b r8 = new com.facebook.appevents.codeless.CodelessMatcher$b
                    r8.<init>(r7, r11)
                    r0.add(r8)
                    return r0
                L_0x0082:
                    int r4 = r1.f27273b
                    r6 = -1
                    if (r4 == r6) goto L_0x008b
                    if (r10 == r4) goto L_0x008b
                    goto L_0x01a8
                L_0x008b:
                    java.lang.Class r10 = r7.getClass()
                    java.lang.String r10 = r10.getCanonicalName()
                    java.lang.String r4 = r1.f27272a
                    boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r4)
                    r10 = r10 ^ r3
                    if (r10 == 0) goto L_0x00d9
                    java.lang.String r10 = r1.f27272a
                    kotlin.text.Regex r4 = new kotlin.text.Regex
                    java.lang.String r6 = ".*android\\..*"
                    r4.<init>((java.lang.String) r6)
                    boolean r10 = r4.matches(r10)
                    if (r10 == 0) goto L_0x01a8
                    java.lang.String r10 = r1.f27272a
                    java.lang.String[] r4 = new java.lang.String[]{r5}
                    r5 = 6
                    java.util.List r10 = kotlin.text.C19459m.m33056y1(r10, r4, r2, r5)
                    boolean r4 = r10.isEmpty()
                    r4 = r4 ^ r3
                    if (r4 == 0) goto L_0x01a8
                    int r4 = r10.size()
                    int r4 = r4 - r3
                    java.lang.Object r10 = r10.get(r4)
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.Class r4 = r7.getClass()
                    java.lang.String r4 = r4.getSimpleName()
                    boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r4, r10)
                    r10 = r10 ^ r3
                    if (r10 == 0) goto L_0x00d9
                    goto L_0x01a8
                L_0x00d9:
                    int r10 = r1.f27279h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r4 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID
                    int r4 = r4.getValue()
                    r10 = r10 & r4
                    if (r10 <= 0) goto L_0x00ee
                    int r10 = r1.f27274c
                    int r4 = r7.getId()
                    if (r10 == r4) goto L_0x00ee
                    goto L_0x01a8
                L_0x00ee:
                    int r10 = r1.f27279h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r4 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT
                    int r4 = r4.getValue()
                    r10 = r10 & r4
                    java.lang.String r4 = ""
                    if (r10 <= 0) goto L_0x0119
                    java.lang.String r10 = r1.f27275d
                    java.lang.String r5 = com.facebook.appevents.codeless.internal.C12225d.m20061j(r7)
                    java.lang.String r6 = p365hg.C12869i0.m20560P(r5)
                    java.lang.String r6 = p365hg.C12869i0.m20567f(r6, r4)
                    boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r10, r5)
                    r5 = r5 ^ r3
                    if (r5 == 0) goto L_0x0119
                    boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r6)
                    r10 = r10 ^ r3
                    if (r10 == 0) goto L_0x0119
                    goto L_0x01a8
                L_0x0119:
                    int r10 = r1.f27279h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r5 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION
                    int r5 = r5.getValue()
                    r10 = r10 & r5
                    if (r10 <= 0) goto L_0x014d
                    java.lang.String r10 = r1.f27277f
                    java.lang.CharSequence r5 = r7.getContentDescription()
                    if (r5 != 0) goto L_0x012e
                    r5 = r4
                    goto L_0x0136
                L_0x012e:
                    java.lang.CharSequence r5 = r7.getContentDescription()
                    java.lang.String r5 = r5.toString()
                L_0x0136:
                    java.lang.String r6 = p365hg.C12869i0.m20560P(r5)
                    java.lang.String r6 = p365hg.C12869i0.m20567f(r6, r4)
                    boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r10, r5)
                    r5 = r5 ^ r3
                    if (r5 == 0) goto L_0x014d
                    boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r6)
                    r10 = r10 ^ r3
                    if (r10 == 0) goto L_0x014d
                    goto L_0x01a8
                L_0x014d:
                    int r10 = r1.f27279h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r5 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT
                    int r5 = r5.getValue()
                    r10 = r10 & r5
                    if (r10 <= 0) goto L_0x0175
                    java.lang.String r10 = r1.f27278g
                    java.lang.String r5 = com.facebook.appevents.codeless.internal.C12225d.m20059h(r7)
                    java.lang.String r6 = p365hg.C12869i0.m20560P(r5)
                    java.lang.String r6 = p365hg.C12869i0.m20567f(r6, r4)
                    boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r10, r5)
                    r5 = r5 ^ r3
                    if (r5 == 0) goto L_0x0175
                    boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r6)
                    r10 = r10 ^ r3
                    if (r10 == 0) goto L_0x0175
                    goto L_0x01a8
                L_0x0175:
                    int r10 = r1.f27279h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r5 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG
                    int r5 = r5.getValue()
                    r10 = r10 & r5
                    if (r10 <= 0) goto L_0x01aa
                    java.lang.String r10 = r1.f27276e
                    java.lang.Object r1 = r7.getTag()
                    if (r1 != 0) goto L_0x018a
                    r1 = r4
                    goto L_0x0192
                L_0x018a:
                    java.lang.Object r1 = r7.getTag()
                    java.lang.String r1 = r1.toString()
                L_0x0192:
                    java.lang.String r5 = p365hg.C12869i0.m20560P(r1)
                    java.lang.String r4 = p365hg.C12869i0.m20567f(r5, r4)
                    boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r10, r1)
                    r1 = r1 ^ r3
                    if (r1 == 0) goto L_0x01aa
                    boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r4)
                    r10 = r10 ^ r3
                    if (r10 == 0) goto L_0x01aa
                L_0x01a8:
                    r10 = r2
                    goto L_0x01ab
                L_0x01aa:
                    r10 = r3
                L_0x01ab:
                    if (r10 != 0) goto L_0x01ae
                    return r0
                L_0x01ae:
                    int r10 = r8.size()
                    int r10 = r10 - r3
                    if (r9 != r10) goto L_0x01bd
                    com.facebook.appevents.codeless.CodelessMatcher$b r10 = new com.facebook.appevents.codeless.CodelessMatcher$b
                    r10.<init>(r7, r11)
                    r0.add(r10)
                L_0x01bd:
                    boolean r10 = r7 instanceof android.view.ViewGroup
                    if (r10 == 0) goto L_0x01df
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    java.util.ArrayList r7 = m20045b(r7)
                    int r10 = r7.size()
                L_0x01cb:
                    if (r2 >= r10) goto L_0x01df
                    java.lang.Object r1 = r7.get(r2)
                    android.view.View r1 = (android.view.View) r1
                    int r4 = r9 + 1
                    java.util.ArrayList r1 = m20044a(r1, r8, r4, r2, r11)
                    r0.addAll(r1)
                    int r2 = r2 + 1
                    goto L_0x01cb
                L_0x01df:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.C12216a.m20044a(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
            }

            /* renamed from: b */
            public static ArrayList m20045b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C19383o.m32796f(childAt, "child");
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }
        }

        public ViewMatcher(View view, Handler handler2, HashSet<String> hashSet, String str) {
            C19383o.m32797g(handler2, "handler");
            C19383o.m32797g(hashSet, "listenerSet");
            C19383o.m32797g(str, "activityName");
            this.rootView = new WeakReference<>(view);
            this.handler = handler2;
            this.listenerSet = hashSet;
            this.activityName = str;
            handler2.postDelayed(this, 200);
        }

        private final void attachListener(C12218b bVar, View view, EventBinding eventBinding) {
            if (eventBinding != null) {
                try {
                    View a = bVar.mo39308a();
                    if (a != null) {
                        View a2 = C12225d.m20053a(a);
                        if (a2 != null && C12225d.f27290d.mo39323m(a, a2)) {
                            attachRCTListener(bVar, view, eventBinding);
                        } else if (!C19457k.m33025c1(a.getClass().getName(), "com.facebook.react", false)) {
                            if (!(a instanceof AdapterView)) {
                                attachOnClickListener(bVar, view, eventBinding);
                            } else if (a instanceof ListView) {
                                attachOnItemClickListener(bVar, view, eventBinding);
                            }
                        }
                    }
                } catch (Exception e) {
                    CodelessMatcher codelessMatcher = CodelessMatcher.f27257f;
                    String str = null;
                    if (!C13080a.m20762b(CodelessMatcher.class)) {
                        str = "com.facebook.appevents.codeless.CodelessMatcher";
                    }
                    C12869i0.m20550F(str, e);
                }
            }
        }

        private final void attachOnClickListener(C12218b bVar, View view, EventBinding eventBinding) {
            boolean z;
            View a = bVar.mo39308a();
            if (a != null) {
                String str = bVar.f27265b;
                View.OnClickListener f = C12225d.m20057f(a);
                if (f instanceof CodelessLoggingEventListener.AutoLoggingOnClickListener) {
                    if (f == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    } else if (((CodelessLoggingEventListener.AutoLoggingOnClickListener) f).getSupportCodelessLogging()) {
                        z = true;
                        if (!this.listenerSet.contains(str) && !z) {
                            CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.f27254a;
                            Class<CodelessLoggingEventListener> cls = CodelessLoggingEventListener.class;
                            CodelessLoggingEventListener.AutoLoggingOnClickListener autoLoggingOnClickListener = null;
                            if (!C13080a.m20762b(cls)) {
                                try {
                                    C19383o.m32797g(eventBinding, "mapping");
                                    C19383o.m32797g(view, "rootView");
                                    autoLoggingOnClickListener = new CodelessLoggingEventListener.AutoLoggingOnClickListener(eventBinding, view, a);
                                } catch (Throwable th) {
                                    C13080a.m20761a(cls, th);
                                }
                            }
                            a.setOnClickListener(autoLoggingOnClickListener);
                            this.listenerSet.add(str);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.listenerSet.contains(str)) {
                }
            }
        }

        private final void attachOnItemClickListener(C12218b bVar, View view, EventBinding eventBinding) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.mo39308a();
            if (adapterView != null) {
                String str = bVar.f27265b;
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnItemClickListener) {
                    if (onItemClickListener == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    } else if (((CodelessLoggingEventListener.AutoLoggingOnItemClickListener) onItemClickListener).getSupportCodelessLogging()) {
                        z = true;
                        if (!this.listenerSet.contains(str) && !z) {
                            CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.f27254a;
                            Class<CodelessLoggingEventListener> cls = CodelessLoggingEventListener.class;
                            CodelessLoggingEventListener.AutoLoggingOnItemClickListener autoLoggingOnItemClickListener = null;
                            if (!C13080a.m20762b(cls)) {
                                try {
                                    C19383o.m32797g(eventBinding, "mapping");
                                    C19383o.m32797g(view, "rootView");
                                    autoLoggingOnItemClickListener = new CodelessLoggingEventListener.AutoLoggingOnItemClickListener(eventBinding, view, adapterView);
                                } catch (Throwable th) {
                                    C13080a.m20761a(cls, th);
                                }
                            }
                            adapterView.setOnItemClickListener(autoLoggingOnItemClickListener);
                            this.listenerSet.add(str);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.listenerSet.contains(str)) {
                }
            }
        }

        private final void attachRCTListener(C12218b bVar, View view, EventBinding eventBinding) {
            boolean z;
            View a = bVar.mo39308a();
            if (a != null) {
                String str = bVar.f27265b;
                View.OnTouchListener g = C12225d.m20058g(a);
                if (g instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) {
                    if (g == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    } else if (((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) g).getSupportCodelessLogging()) {
                        z = true;
                        if (!this.listenerSet.contains(str) && !z) {
                            int i = RCTCodelessLoggingEventListener.f27266a;
                            Class<RCTCodelessLoggingEventListener> cls = RCTCodelessLoggingEventListener.class;
                            RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener autoLoggingOnTouchListener = null;
                            if (!C13080a.m20762b(cls)) {
                                try {
                                    C19383o.m32797g(eventBinding, "mapping");
                                    C19383o.m32797g(view, "rootView");
                                    autoLoggingOnTouchListener = new RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener(eventBinding, view, a);
                                } catch (Throwable th) {
                                    C13080a.m20761a(cls, th);
                                }
                            }
                            a.setOnTouchListener(autoLoggingOnTouchListener);
                            this.listenerSet.add(str);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.listenerSet.contains(str)) {
                }
            }
        }

        private final void findView(EventBinding eventBinding, View view) {
            if (eventBinding != null && view != null) {
                String str = eventBinding.f27271d;
                if ((str == null || str.length() == 0) || !(!C19383o.m32792b(eventBinding.f27271d, this.activityName))) {
                    List<T> unmodifiableList = Collections.unmodifiableList(eventBinding.f27269b);
                    C19383o.m32796f(unmodifiableList, "Collections.unmodifiableList(path)");
                    if (unmodifiableList.size() <= 25) {
                        C12216a aVar = Companion;
                        String str2 = this.activityName;
                        aVar.getClass();
                        Iterator it = C12216a.m20044a(view, unmodifiableList, 0, -1, str2).iterator();
                        while (it.hasNext()) {
                            attachListener((C12218b) it.next(), view, eventBinding);
                        }
                    }
                }
            }
        }

        public static final List<C12218b> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
            Companion.getClass();
            return C12216a.m20044a(view, list, i, i2, str);
        }

        private final void startMatch() {
            List<EventBinding> list = this.eventBindings;
            if (list != null && this.rootView.get() != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    findView(list.get(i), this.rootView.get());
                }
            }
        }

        public void onGlobalLayout() {
            startMatch();
        }

        public void onScrollChanged() {
            startMatch();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:9|(4:11|12|13|(2:15|16))|17|18|(4:20|(1:22)|23|27)(1:30)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004a A[Catch:{ all -> 0x0063 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                boolean r0 = p401mg.C13080a.m20762b(r6)
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                java.lang.String r0 = p453tf.C13418j.m21107c()     // Catch:{ all -> 0x0063 }
                hg.n r0 = com.facebook.internal.FetchedAppSettingsManager.m20104b(r0)     // Catch:{ all -> 0x0063 }
                if (r0 == 0) goto L_0x0062
                boolean r1 = r0.f28406j     // Catch:{ all -> 0x0063 }
                if (r1 != 0) goto L_0x0016
                goto L_0x0062
            L_0x0016:
                com.facebook.appevents.codeless.internal.EventBinding$a r1 = com.facebook.appevents.codeless.internal.EventBinding.f27267e     // Catch:{ all -> 0x0063 }
                org.json.JSONArray r0 = r0.f28407k     // Catch:{ all -> 0x0063 }
                r1.getClass()     // Catch:{ all -> 0x0063 }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0063 }
                r1.<init>()     // Catch:{ all -> 0x0063 }
                if (r0 == 0) goto L_0x003e
                r2 = 0
                int r3 = r0.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x003e }
            L_0x0029:
                if (r2 >= r3) goto L_0x003e
                org.json.JSONObject r4 = r0.getJSONObject(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x003e }
                java.lang.String r5 = "array.getJSONObject(i)"
                kotlin.jvm.internal.C19383o.m32796f(r4, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x003e }
                com.facebook.appevents.codeless.internal.EventBinding r4 = com.facebook.appevents.codeless.internal.EventBinding.C12221a.m20050a(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x003e }
                r1.add(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x003e }
                int r2 = r2 + 1
                goto L_0x0029
            L_0x003e:
                r6.eventBindings = r1     // Catch:{ all -> 0x0063 }
                java.lang.ref.WeakReference<android.view.View> r0 = r6.rootView     // Catch:{ all -> 0x0063 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0063 }
                android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0063 }
                if (r0 == 0) goto L_0x0062
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = "observer"
                kotlin.jvm.internal.C19383o.m32796f(r0, r1)     // Catch:{ all -> 0x0063 }
                boolean r1 = r0.isAlive()     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x005f
                r0.addOnGlobalLayoutListener(r6)     // Catch:{ all -> 0x0063 }
                r0.addOnScrollChangedListener(r6)     // Catch:{ all -> 0x0063 }
            L_0x005f:
                r6.startMatch()     // Catch:{ all -> 0x0063 }
            L_0x0062:
                return
            L_0x0063:
                r0 = move-exception
                p401mg.C13080a.m20761a(r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.run():void");
        }
    }

    /* renamed from: com.facebook.appevents.codeless.CodelessMatcher$a */
    public static final class C12217a {
        /* renamed from: b */
        public static Bundle m20046b(EventBinding eventBinding, View view, View view2) {
            ArrayList arrayList;
            Bundle bundle = new Bundle();
            if (eventBinding == null) {
                return bundle;
            }
            List<T> unmodifiableList = Collections.unmodifiableList(eventBinding.f27270c);
            C19383o.m32796f(unmodifiableList, "Collections.unmodifiableList(parameters)");
            for (T t : unmodifiableList) {
                String str = t.f27282b;
                if (str != null) {
                    if (str.length() > 0) {
                        bundle.putString(t.f27281a, t.f27282b);
                    }
                }
                if (t.f27283c.size() > 0) {
                    if (C19383o.m32792b(t.f27284d, "relative")) {
                        ViewMatcher.C12216a aVar = ViewMatcher.Companion;
                        ArrayList arrayList2 = t.f27283c;
                        String simpleName = view2.getClass().getSimpleName();
                        aVar.getClass();
                        arrayList = ViewMatcher.C12216a.m20044a(view2, arrayList2, 0, -1, simpleName);
                    } else {
                        ViewMatcher.C12216a aVar2 = ViewMatcher.Companion;
                        ArrayList arrayList3 = t.f27283c;
                        String simpleName2 = view.getClass().getSimpleName();
                        aVar2.getClass();
                        arrayList = ViewMatcher.C12216a.m20044a(view, arrayList3, 0, -1, simpleName2);
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C12218b bVar = (C12218b) it.next();
                        if (bVar.mo39308a() != null) {
                            String j = C12225d.m20061j(bVar.mo39308a());
                            if (j.length() > 0) {
                                bundle.putString(t.f27281a, j);
                                break;
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0016 A[Catch:{ all -> 0x000f, all -> 0x002a }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[SYNTHETIC, Splitter:B:24:0x0033] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x003c A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x003e A[SYNTHETIC, Splitter:B:32:0x003e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized com.facebook.appevents.codeless.CodelessMatcher mo39307a() {
            /*
                r4 = this;
                java.lang.Class<com.facebook.appevents.codeless.CodelessMatcher> r0 = com.facebook.appevents.codeless.CodelessMatcher.class
                monitor-enter(r4)
                boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x002a }
                r2 = 0
                if (r1 == 0) goto L_0x000c
            L_0x000a:
                r1 = r2
                goto L_0x0014
            L_0x000c:
                com.facebook.appevents.codeless.CodelessMatcher r1 = com.facebook.appevents.codeless.CodelessMatcher.f27257f     // Catch:{ all -> 0x000f }
                goto L_0x0014
            L_0x000f:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x002a }
                goto L_0x000a
            L_0x0014:
                if (r1 != 0) goto L_0x002c
                com.facebook.appevents.codeless.CodelessMatcher r1 = new com.facebook.appevents.codeless.CodelessMatcher     // Catch:{ all -> 0x002a }
                r1.<init>()     // Catch:{ all -> 0x002a }
                boolean r3 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x002a }
                if (r3 == 0) goto L_0x0022
                goto L_0x002c
            L_0x0022:
                com.facebook.appevents.codeless.CodelessMatcher.f27257f = r1     // Catch:{ all -> 0x0025 }
                goto L_0x002c
            L_0x0025:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x002a }
                goto L_0x002c
            L_0x002a:
                r0 = move-exception
                goto L_0x0046
            L_0x002c:
                boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x002a }
                if (r1 == 0) goto L_0x0033
                goto L_0x003a
            L_0x0033:
                com.facebook.appevents.codeless.CodelessMatcher r2 = com.facebook.appevents.codeless.CodelessMatcher.f27257f     // Catch:{ all -> 0x0036 }
                goto L_0x003a
            L_0x0036:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x002a }
            L_0x003a:
                if (r2 == 0) goto L_0x003e
                monitor-exit(r4)
                return r2
            L_0x003e:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x002a }
                java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher"
                r0.<init>(r1)     // Catch:{ all -> 0x002a }
                throw r0     // Catch:{ all -> 0x002a }
            L_0x0046:
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.CodelessMatcher.C12217a.mo39307a():com.facebook.appevents.codeless.CodelessMatcher");
        }
    }

    /* renamed from: com.facebook.appevents.codeless.CodelessMatcher$b */
    public static final class C12218b {

        /* renamed from: a */
        public final WeakReference<View> f27264a;

        /* renamed from: b */
        public final String f27265b;

        public C12218b(View view, String str) {
            C19383o.m32797g(view, "view");
            C19383o.m32797g(str, "viewMapKey");
            this.f27264a = new WeakReference<>(view);
            this.f27265b = str;
        }

        /* renamed from: a */
        public final View mo39308a() {
            WeakReference<View> weakReference = this.f27264a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    public CodelessMatcher() {
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C19383o.m32796f(newSetFromMap, "Collections.newSetFromMap(WeakHashMap())");
        this.f27260b = newSetFromMap;
        this.f27261c = new LinkedHashSet();
        this.f27262d = new HashSet<>();
        this.f27263e = new HashMap<>();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39301a(android.app.Activity r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Looper.getMainLooper()"
            boolean r1 = p401mg.C13080a.m20762b(r3)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.C19383o.m32797g(r4, r1)     // Catch:{ all -> 0x0071 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0071 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0071 }
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)     // Catch:{ all -> 0x0071 }
            java.lang.Thread r2 = r2.getThread()     // Catch:{ all -> 0x0071 }
            if (r1 != r2) goto L_0x0069
            java.util.Set<android.app.Activity> r1 = r3.f27260b     // Catch:{ all -> 0x0071 }
            r1.add(r4)     // Catch:{ all -> 0x0071 }
            java.util.HashSet<java.lang.String> r1 = r3.f27262d     // Catch:{ all -> 0x0071 }
            r1.clear()     // Catch:{ all -> 0x0071 }
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.String>> r1 = r3.f27263e     // Catch:{ all -> 0x0071 }
            int r4 = r4.hashCode()     // Catch:{ all -> 0x0071 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0071 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0071 }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x003d
            r3.f27262d = r4     // Catch:{ all -> 0x0071 }
        L_0x003d:
            boolean r4 = p401mg.C13080a.m20762b(r3)     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0064 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0064 }
            kotlin.jvm.internal.C19383o.m32796f(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.Thread r0 = r1.getThread()     // Catch:{ all -> 0x0064 }
            if (r4 != r0) goto L_0x0059
            r3.mo39302b()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0059:
            android.os.Handler r4 = r3.f27259a     // Catch:{ all -> 0x0064 }
            wf.d r0 = new wf.d     // Catch:{ all -> 0x0064 }
            r0.<init>(r3)     // Catch:{ all -> 0x0064 }
            r4.post(r0)     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r4 = move-exception
            p401mg.C13080a.m20761a(r3, r4)     // Catch:{ all -> 0x0071 }
        L_0x0068:
            return
        L_0x0069:
            com.facebook.FacebookException r4 = new com.facebook.FacebookException     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "Can't add activity to CodelessMatcher on non-UI thread"
            r4.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            p401mg.C13080a.m20761a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.CodelessMatcher.mo39301a(android.app.Activity):void");
    }

    /* renamed from: b */
    public final void mo39302b() {
        if (!C13080a.m20762b(this)) {
            try {
                for (Activity next : this.f27260b) {
                    if (next != null) {
                        this.f27261c.add(new ViewMatcher(C8527d.m16931b(next), this.f27259a, this.f27262d, next.getClass().getSimpleName()));
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final void mo39303c(Activity activity) {
        if (!C13080a.m20762b(this)) {
            try {
                C19383o.m32797g(activity, "activity");
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                C19383o.m32796f(mainLooper, "Looper.getMainLooper()");
                if (currentThread == mainLooper.getThread()) {
                    this.f27260b.remove(activity);
                    this.f27261c.clear();
                    HashMap<Integer, HashSet<String>> hashMap = this.f27263e;
                    Integer valueOf = Integer.valueOf(activity.hashCode());
                    Object clone = this.f27262d.clone();
                    if (clone != null) {
                        hashMap.put(valueOf, (HashSet) clone);
                        this.f27262d.clear();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashSet<kotlin.String> /* = java.util.HashSet<kotlin.String> */");
                }
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
