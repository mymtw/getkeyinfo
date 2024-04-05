package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C2364y;
import androidx.core.view.accessibility.AccessibilityClickableSpanCompat;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p088e1.C6693c;
import p088e1.C6697d;

/* renamed from: androidx.core.view.a */
public class C2273a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: androidx.core.view.a$a */
    public static final class C2274a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C2273a f5534a;

        public C2274a(C2273a aVar) {
            this.f5534a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5534a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C6693c accessibilityNodeProvider = this.f5534a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f14784a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5534a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Object obj2;
            C6689b bVar = new C6689b(accessibilityNodeInfo);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            Class<Boolean> cls = Boolean.class;
            boolean z = true;
            Object obj3 = null;
            if (Build.VERSION.SDK_INT >= 28) {
                obj = Boolean.valueOf(C2364y.C2378m.m5308d(view));
            } else {
                Object tag = view.getTag(R.id.tag_screen_reader_focusable);
                obj = cls.isInstance(tag) ? tag : null;
            }
            Boolean bool = (Boolean) obj;
            boolean z2 = bool != null && bool.booleanValue();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z2);
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & true) ? 1 : 0);
                }
            }
            boolean i2 = C2364y.m5194i(view);
            if (i >= 28) {
                accessibilityNodeInfo.setHeading(i2);
            } else {
                int i3 = 2;
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    int i4 = extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & -3;
                    if (!i2) {
                        i3 = 0;
                    }
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i3 | i4);
                }
            }
            Class<CharSequence> cls2 = CharSequence.class;
            if (i >= 28) {
                obj2 = C2364y.C2378m.m5306b(view);
            } else {
                Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                obj2 = cls2.isInstance(tag2) ? tag2 : null;
            }
            CharSequence charSequence = (CharSequence) obj2;
            if (i >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            Class<CharSequence> cls3 = CharSequence.class;
            if (Build.VERSION.SDK_INT < 30) {
                z = false;
            }
            if (z) {
                obj3 = C2364y.C2380o.m5318a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_state_description);
                if (cls3.isInstance(tag3)) {
                    obj3 = tag3;
                }
            }
            bVar.mo18873v((CharSequence) obj3);
            this.f5534a.onInitializeAccessibilityNodeInfo(view, bVar);
            accessibilityNodeInfo.getText();
            List<C6689b.C6690a> actionList = C2273a.getActionList(view);
            for (int i5 = 0; i5 < actionList.size(); i5++) {
                bVar.mo18851b(actionList.get(i5));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5534a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5534a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f5534a.performAccessibilityAction(view, i, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.f5534a.sendAccessibilityEvent(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5534a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public C2273a() {
        this(DEFAULT_DELEGATE);
    }

    public static List<C6689b.C6690a> getActionList(View view) {
        List<C6689b.C6690a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i = 0;
            while (clickableSpanArr != null && i < clickableSpanArr.length) {
                if (clickableSpan.equals(clickableSpanArr[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C6693c getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C6693c(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, bVar.f14759a);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<C6689b.C6690a> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C6689b.C6690a aVar = actionList.get(i2);
            if (aVar.mo18875a() != i) {
                i2++;
            } else if (aVar.f14781d != null) {
                Class<? extends C6697d.C6698a> cls = aVar.f14780c;
                if (cls != null) {
                    try {
                        ((C6697d.C6698a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                    } catch (Exception e) {
                        Class<? extends C6697d.C6698a> cls2 = aVar.f14780c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                }
                z = aVar.f14781d.mo10006a(view);
            }
        }
        if (!z) {
            z = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != R.id.accessibility_action_clickable_span) ? z : performClickableSpanAction(bundle.getInt(AccessibilityClickableSpanCompat.SPAN_ID, -1), view);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2273a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C2274a(this);
    }
}
