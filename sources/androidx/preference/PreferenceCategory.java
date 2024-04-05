package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.etsy.android.R;
import p088e1.C6689b;
import p280x0.C8299j;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory() {
        throw null;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C8299j.m16588a(R.attr.preferenceCategoryStyle, context, 16842892));
    }

    /* renamed from: I */
    public final boolean mo11008I() {
        return !super.mo11057i();
    }

    /* renamed from: i */
    public final boolean mo11057i() {
        return false;
    }

    /* renamed from: n */
    public final void mo11000n(C3051h hVar) {
        super.mo11000n(hVar);
        if (Build.VERSION.SDK_INT >= 28) {
            hVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Deprecated
    /* renamed from: r */
    public final void mo11062r(C6689b bVar) {
        if (Build.VERSION.SDK_INT < 28) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = bVar.f14759a.getCollectionItemInfo();
            C6689b.C6692c cVar = collectionItemInfo != null ? new C6689b.C6692c(collectionItemInfo) : null;
            if (cVar != null) {
                bVar.mo18869s(C6689b.C6692c.m13082a(((AccessibilityNodeInfo.CollectionItemInfo) cVar.f14783a).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f14783a).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f14783a).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f14783a).getColumnSpan(), true, ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f14783a).isSelected()));
            }
        }
    }
}
