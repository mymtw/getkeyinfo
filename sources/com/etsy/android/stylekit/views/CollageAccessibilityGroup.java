package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p013v4.media.C0069a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2364y;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;
import p396mb.C13035a;
import p404nb.C13100a;
import p568fn.C17782b;
import p753kq.C19857l;

public final class CollageAccessibilityGroup extends ConstraintHelper {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private Companion.AsAccessibilityHeading asAccessibilityHeading;
    private Companion.AsButton asButton;
    private final List<View> decorChildren;
    private Companion.DelegateOnClick delegateOnClick;
    private boolean isFirstLaunch;
    private int overrideOnClickWithId;
    private Boolean wasVisibleBeforeDisablingAccessibilityService;

    public static final class Companion {

        public enum AsAccessibilityHeading {
            AS_ACCESSIBILITY_HEADING_AUTO(2),
            AS_ACCESSIBILITY_HEADING_YES(1),
            AS_ACCESSIBILITY_HEADING_NO(0);
            
            public static final C9018a Companion = null;
            private final int xmlEnumValue;

            /* renamed from: com.etsy.android.stylekit.views.CollageAccessibilityGroup$Companion$AsAccessibilityHeading$a */
            public static final class C9018a {
            }

            /* access modifiers changed from: public */
            static {
                Companion = new C9018a();
            }

            private AsAccessibilityHeading(int i) {
                this.xmlEnumValue = i;
            }

            public final int getXmlEnumValue() {
                return this.xmlEnumValue;
            }
        }

        public enum AsButton {
            AS_BUTTON_AUTO(2),
            AS_BUTTON_YES(1),
            AS_BUTTON_NO(0);
            
            public static final C9019a Companion = null;
            private final int xmlEnumValue;

            /* renamed from: com.etsy.android.stylekit.views.CollageAccessibilityGroup$Companion$AsButton$a */
            public static final class C9019a {
            }

            /* access modifiers changed from: public */
            static {
                Companion = new C9019a();
            }

            private AsButton(int i) {
                this.xmlEnumValue = i;
            }

            public final int getXmlEnumValue() {
                return this.xmlEnumValue;
            }
        }

        public enum DelegateOnClick {
            DELEGATE_ON_CLICK_YES_FROM_PARENT(2),
            DELEGATE_ON_CLICK_YES(1),
            DELEGATE_ON_CLICK_NO(0);
            
            public static final C9020a Companion = null;
            private final int xmlEnumValue;

            /* renamed from: com.etsy.android.stylekit.views.CollageAccessibilityGroup$Companion$DelegateOnClick$a */
            public static final class C9020a {
            }

            /* access modifiers changed from: public */
            static {
                Companion = new C9020a();
            }

            private DelegateOnClick(int i) {
                this.xmlEnumValue = i;
            }

            public final int getXmlEnumValue() {
                return this.xmlEnumValue;
            }
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageAccessibilityGroup$a */
    public /* synthetic */ class C9021a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19890a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19891b;

        static {
            int[] iArr = new int[Companion.AsAccessibilityHeading.values().length];
            iArr[Companion.AsAccessibilityHeading.AS_ACCESSIBILITY_HEADING_YES.ordinal()] = 1;
            iArr[Companion.AsAccessibilityHeading.AS_ACCESSIBILITY_HEADING_NO.ordinal()] = 2;
            iArr[Companion.AsAccessibilityHeading.AS_ACCESSIBILITY_HEADING_AUTO.ordinal()] = 3;
            f19890a = iArr;
            int[] iArr2 = new int[Companion.AsButton.values().length];
            iArr2[Companion.AsButton.AS_BUTTON_YES.ordinal()] = 1;
            iArr2[Companion.AsButton.AS_BUTTON_NO.ordinal()] = 2;
            iArr2[Companion.AsButton.AS_BUTTON_AUTO.ordinal()] = 3;
            f19891b = iArr2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageAccessibilityGroup(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageAccessibilityGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageAccessibilityGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final View getChildrenById(int i) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            return viewGroup.findViewById(i);
        }
        return null;
    }

    private final CharSequence getContentDescriptionFromLive() {
        List<View> viewsToGroup = getViewsToGroup();
        ArrayList arrayList = new ArrayList();
        for (T next : viewsToGroup) {
            if (((View) next).getVisibility() == 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription == null) {
                TextView textView = view instanceof TextView ? (TextView) view : null;
                contentDescription = textView != null ? textView.getText() : null;
            }
            if (contentDescription != null) {
                arrayList2.add(contentDescription);
            }
        }
        return C19327t.m32644Z0(arrayList2, ", ", (String) null, (String) null, (C19857l) null, 62);
    }

    private final CharSequence getGroupContentDescription() {
        CharSequence contentDescription = getContentDescription();
        return contentDescription == null ? getContentDescriptionFromLive() : contentDescription;
    }

    private final ViewGroup getParentById(int i) {
        ViewParent parent = getParent();
        C19383o.m32795e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        ViewGroup viewGroup2 = null;
        while (viewGroup2 == null) {
            if (viewGroup.getId() == i) {
                viewGroup2 = viewGroup;
            } else {
                ViewParent parent2 = viewGroup.getParent();
                viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup == null) {
                    break;
                }
            }
        }
        return viewGroup2;
    }

    private final List<View> getViewsToGroup() {
        Iterable<Number> iterable;
        int[] referencedIds = getReferencedIds();
        C19383o.m32796f(referencedIds, "referencedIds");
        int length = referencedIds.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(referencedIds.length);
                for (int valueOf : referencedIds) {
                    arrayList.add(Integer.valueOf(valueOf));
                }
                iterable = arrayList;
            } else {
                iterable = C17782b.m29864d0(Integer.valueOf(referencedIds[0]));
            }
        } else {
            iterable = EmptyList.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue : iterable) {
            View childrenById = getChildrenById(intValue.intValue());
            if (childrenById != null) {
                arrayList2.add(childrenById);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!this.decorChildren.contains((View) next)) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    private final boolean hasAccessibilityHeading() {
        int i = C9021a.f19890a[this.asAccessibilityHeading.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i == 3) {
                List<View> viewsToGroup = getViewsToGroup();
                ArrayList arrayList = new ArrayList();
                for (T next : viewsToGroup) {
                    View view = (View) next;
                    if (view.getVisibility() == 0 && C2364y.m5194i(view)) {
                        arrayList.add(next);
                    }
                }
                if (!(arrayList.size() > 0)) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    private final boolean hasButton() {
        int i = C9021a.f19891b[this.asButton.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i == 3) {
                List<View> viewsToGroup = getViewsToGroup();
                ArrayList arrayList = new ArrayList();
                for (T next : viewsToGroup) {
                    View view = (View) next;
                    if (view.getVisibility() == 0 && ((view instanceof Button) || (view instanceof ImageButton) || TextUtils.equals(view.createAccessibilityNodeInfo().getClassName(), AccessibilityClassNames.BUTTON.getAccessibilityClassName()))) {
                        arrayList.add(next);
                    }
                }
                if (!(arrayList.size() > 0)) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    private final void setAccessibilityHeadingFromLive() {
        if (!Boolean.valueOf(C2364y.m5194i(this)).equals(Boolean.valueOf(hasAccessibilityHeading()))) {
            ViewsExtensionsKt.m17424c(this, hasAccessibilityHeading());
        }
    }

    private final void setDelegateClickAndAccessibilityActions() {
        View viewToDelegateOnClick = getViewToDelegateOnClick();
        if (viewToDelegateOnClick != null) {
            setClickable(viewToDelegateOnClick.isClickable());
            if (viewToDelegateOnClick.isClickable()) {
                setOnClickListener(new C9050a(viewToDelegateOnClick, 0));
            }
            setLongClickable(viewToDelegateOnClick.isLongClickable());
            if (viewToDelegateOnClick.isLongClickable()) {
                setOnLongClickListener(new C9051b(viewToDelegateOnClick));
            }
            Iterator it = C13100a.m20771b(this).iterator();
            while (it.hasNext()) {
                C13100a.m20772c(this, (C13035a) it.next());
            }
            Iterator it2 = C13100a.m20771b(viewToDelegateOnClick).iterator();
            while (it2.hasNext()) {
                C13100a.m20770a(this, (C13035a) it2.next());
            }
            return;
        }
        setClickable(false);
        setLongClickable(false);
        Iterator it3 = C13100a.m20771b(this).iterator();
        while (it3.hasNext()) {
            C13100a.m20772c(this, (C13035a) it3.next());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setDelegateClickAndAccessibilityActions$lambda-15$lambda-11  reason: not valid java name */
    public static final void m34879setDelegateClickAndAccessibilityActions$lambda15$lambda11(View view, View view2) {
        C19383o.m32797g(view, "$delegateView");
        view.callOnClick();
    }

    /* access modifiers changed from: private */
    /* renamed from: setDelegateClickAndAccessibilityActions$lambda-15$lambda-12  reason: not valid java name */
    public static final boolean m34880setDelegateClickAndAccessibilityActions$lambda15$lambda12(View view, View view2) {
        C19383o.m32797g(view, "$delegateView");
        return view.performLongClick();
    }

    public final Companion.AsAccessibilityHeading getAsAccessibilityHeading() {
        return this.asAccessibilityHeading;
    }

    public final Companion.AsButton getAsButton() {
        return this.asButton;
    }

    public final Companion.DelegateOnClick getDelegateOnClick() {
        return this.delegateOnClick;
    }

    public final View getOverrideOnClickWith() {
        return getChildrenById(this.overrideOnClickWithId);
    }

    public final View getViewToDelegateOnClick() {
        boolean z;
        if (this.delegateOnClick.equals(Companion.DelegateOnClick.DELEGATE_ON_CLICK_NO)) {
            return null;
        }
        View overrideOnClickWith = getOverrideOnClickWith();
        if (overrideOnClickWith == null) {
            List<View> viewsToGroup = getViewsToGroup();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = viewsToGroup.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                View view = (View) next;
                if (view.getVisibility() != 0 || !view.hasOnClickListeners()) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() <= 0) {
                z = false;
            }
            if (!z) {
                arrayList = null;
            }
            overrideOnClickWith = arrayList != null ? (View) C19327t.m32645a1(arrayList) : null;
            if (overrideOnClickWith == null) {
                if (!this.delegateOnClick.equals(Companion.DelegateOnClick.DELEGATE_ON_CLICK_YES_FROM_PARENT)) {
                    return null;
                }
                ViewParent parent = getParent();
                C19383o.m32795e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                ViewGroup viewGroup2 = null;
                while (viewGroup2 == null) {
                    if (viewGroup.hasOnClickListeners()) {
                        viewGroup2 = viewGroup;
                    } else {
                        ViewParent parent2 = viewGroup.getParent();
                        viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                        if (viewGroup == null) {
                            break;
                        }
                    }
                }
                return viewGroup2;
            }
        }
        return overrideOnClickWith;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C19383o.m32797g(accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(getGroupContentDescription());
        setAccessibilityHeadingFromLive();
        if (hasButton()) {
            accessibilityNodeInfo.setClassName(AccessibilityClassNames.BUTTON.getAccessibilityClassName());
        } else {
            accessibilityNodeInfo.setClassName(AccessibilityClassNames.TEXT_VIEW.getAccessibilityClassName());
        }
    }

    public final void setAsAccessibilityHeading(Companion.AsAccessibilityHeading asAccessibilityHeading2) {
        C19383o.m32797g(asAccessibilityHeading2, "<set-?>");
        this.asAccessibilityHeading = asAccessibilityHeading2;
    }

    public final void setAsButton(Companion.AsButton asButton2) {
        C19383o.m32797g(asButton2, "<set-?>");
        this.asButton = asButton2;
    }

    public final void setDelegateOnClick(Companion.DelegateOnClick delegateOnClick2) {
        C19383o.m32797g(delegateOnClick2, "value");
        this.delegateOnClick = delegateOnClick2;
        if (isAttachedToWindow()) {
            setDelegateClickAndAccessibilityActions();
        }
    }

    public final void setOverrideOnClickWith(View view) {
        this.overrideOnClickWithId = view != null ? view.getId() : -1;
        if (isAttachedToWindow()) {
            setDelegateClickAndAccessibilityActions();
        }
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
        super.updatePostLayout(constraintLayout);
        List<String> list = AccessibilityCapabilities.f19885a;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        int i = 8;
        if (AccessibilityCapabilities.Companion.m17419b(context, AccessibilityCapabilities.Companion.AssistiveTools.TALKBACK, AccessibilityCapabilities.Companion.AssistiveTools.SWITCH_ACCESS, AccessibilityCapabilities.Companion.AssistiveTools.GENERIC_BRAILLE)) {
            for (View view : getViewsToGroup()) {
                if (this.isFirstLaunch && view.getImportantForAccessibility() == 2) {
                    this.decorChildren.add(view);
                }
                view.setImportantForAccessibility(2);
            }
            setDelegateClickAndAccessibilityActions();
            Boolean bool = this.wasVisibleBeforeDisablingAccessibilityService;
            if (bool != null) {
                if (bool.booleanValue()) {
                    i = 0;
                }
                setVisibility(i);
            }
            this.isFirstLaunch = false;
            return;
        }
        if (!this.isFirstLaunch && this.decorChildren.size() > 0) {
            for (View view2 : getViewsToGroup()) {
                if (this.decorChildren.contains(view2)) {
                    view2.setImportantForAccessibility(2);
                } else {
                    view2.setImportantForAccessibility(1);
                }
            }
            this.decorChildren.clear();
            this.isFirstLaunch = true;
        }
        this.wasVisibleBeforeDisablingAccessibilityService = Boolean.valueOf(Integer.valueOf(getVisibility()).equals(0));
        setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageAccessibilityGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Companion.DelegateOnClick delegateOnClick2;
        Companion.AsAccessibilityHeading asAccessibilityHeading2;
        Companion.AsButton asButton2;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        boolean z = true;
        this.isFirstLaunch = true;
        this.decorChildren = new ArrayList();
        Companion.DelegateOnClick delegateOnClick3 = Companion.DelegateOnClick.DELEGATE_ON_CLICK_YES;
        this.delegateOnClick = delegateOnClick3;
        this.overrideOnClickWithId = -1;
        this.asAccessibilityHeading = Companion.AsAccessibilityHeading.AS_ACCESSIBILITY_HEADING_AUTO;
        this.asButton = Companion.AsButton.AS_BUTTON_AUTO;
        if (isInEditMode()) {
            setVisibility(8);
            return;
        }
        ViewsExtensionsKt.m17423b(this, AccessibilityClassNames.TEXT_VIEW);
        setFocusable(true);
        setImportantForAccessibility(1);
        int[] referencedIds = getReferencedIds();
        C19383o.m32796f(referencedIds, "referencedIds");
        if (referencedIds.length == 0) {
            throw new IllegalArgumentException("CollageAccessibilityGroup requires at least 1 elements to group, use app:constraint_referenced_ids to set elements to group. See more info at go/android-collage and search for Accessibility Groups.");
        } else if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28636c);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…ollageAccessibilityGroup)");
            Companion.DelegateOnClick.C9020a aVar = Companion.DelegateOnClick.Companion;
            int i2 = obtainStyledAttributes.getInt(2, delegateOnClick3.getXmlEnumValue());
            aVar.getClass();
            Companion.DelegateOnClick[] values = Companion.DelegateOnClick.values();
            ArrayList arrayList = new ArrayList();
            for (Companion.DelegateOnClick delegateOnClick4 : values) {
                if (delegateOnClick4.getXmlEnumValue() == i2) {
                    arrayList.add(delegateOnClick4);
                }
            }
            ArrayList arrayList2 = null;
            arrayList = !(arrayList.size() > 0) ? null : arrayList;
            if (arrayList == null || (delegateOnClick2 = (Companion.DelegateOnClick) C19327t.m32638T0(arrayList)) == null) {
                throw new IllegalArgumentException(C0069a.m175f("The value ", i2, " is not a valid enum value for delegateOnClick attribute. See more at go/android-collage and search for Accessibility Groups."));
            }
            setDelegateOnClick(delegateOnClick2);
            this.overrideOnClickWithId = obtainStyledAttributes.getResourceId(3, -1);
            Companion.AsAccessibilityHeading.C9018a aVar2 = Companion.AsAccessibilityHeading.Companion;
            int i3 = obtainStyledAttributes.getInt(0, Companion.AsAccessibilityHeading.AS_ACCESSIBILITY_HEADING_AUTO.getXmlEnumValue());
            aVar2.getClass();
            Companion.AsAccessibilityHeading[] values2 = Companion.AsAccessibilityHeading.values();
            ArrayList arrayList3 = new ArrayList();
            for (Companion.AsAccessibilityHeading asAccessibilityHeading3 : values2) {
                if (asAccessibilityHeading3.getXmlEnumValue() == i3) {
                    arrayList3.add(asAccessibilityHeading3);
                }
            }
            arrayList3 = !(arrayList3.size() > 0) ? null : arrayList3;
            if (arrayList3 == null || (asAccessibilityHeading2 = (Companion.AsAccessibilityHeading) C19327t.m32638T0(arrayList3)) == null) {
                throw new IllegalArgumentException(C0069a.m175f("The value ", i3, " is not a valid enum value for asAccessibilityHeading attribute. See more at go/android-collage and search for Accessibility Groups."));
            }
            this.asAccessibilityHeading = asAccessibilityHeading2;
            Companion.AsButton.C9019a aVar3 = Companion.AsButton.Companion;
            int i4 = obtainStyledAttributes.getInt(1, Companion.AsButton.AS_BUTTON_AUTO.getXmlEnumValue());
            aVar3.getClass();
            Companion.AsButton[] values3 = Companion.AsButton.values();
            ArrayList arrayList4 = new ArrayList();
            for (Companion.AsButton asButton3 : values3) {
                if (asButton3.getXmlEnumValue() == i4) {
                    arrayList4.add(asButton3);
                }
            }
            arrayList2 = arrayList4.size() <= 0 ? false : z ? arrayList4 : arrayList2;
            if (arrayList2 == null || (asButton2 = (Companion.AsButton) C19327t.m32638T0(arrayList2)) == null) {
                throw new IllegalArgumentException(C0069a.m175f("The value ", i4, " is not a valid enum value for asButton attribute. See more at go/android-collage and search for Accessibility Groups."));
            }
            this.asButton = asButton2;
            obtainStyledAttributes.recycle();
        }
    }
}
