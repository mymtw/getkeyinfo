package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.C0185a;
import androidx.appcompat.widget.C0323i0;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086e.C6681c;
import p280x0.C8299j;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.graphics.drawable.b */
public class C0189b extends C0185a {
    private static final boolean DEBUG = false;
    private static final String TAG = "StateListDrawable";
    private boolean mMutated;
    private C0190a mStateListState;

    /* renamed from: androidx.appcompat.graphics.drawable.b$a */
    public static class C0190a extends C0185a.C0188c {

        /* renamed from: I */
        public int[][] f505I;

        public C0190a(C0190a aVar, C0189b bVar, Resources resources) {
            super(aVar, bVar, resources);
            if (aVar != null) {
                this.f505I = aVar.f505I;
            } else {
                this.f505I = new int[this.f485g.length][];
            }
        }

        /* renamed from: e */
        public void mo1489e() {
            int[][] iArr = this.f505I;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f505I[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f505I = iArr2;
        }

        /* renamed from: f */
        public final int mo1580f(int[] iArr) {
            int[][] iArr2 = this.f505I;
            int i = this.f486h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C0189b(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0189b(this, resources);
        }
    }

    public C0189b() {
        this((C0190a) null, (Resources) null);
    }

    private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        C0190a aVar = this.mStateListState;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C15588c1.f35087m);
                    Drawable drawable = null;
                    int resourceId = i.getResourceId(0, -1);
                    if (resourceId > 0) {
                        drawable = C0323i0.m848c().mo3065e(context, resourceId);
                    }
                    i.recycle();
                    int[] extractStateSet = extractStateSet(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next == 2) {
                            drawable = C6681c.m13047a(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                    }
                    aVar.f505I[aVar.mo1568a(drawable)] = extractStateSet;
                }
            } else {
                return;
            }
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        C0190a aVar = this.mStateListState;
        aVar.f482d |= C6681c.m13048b(typedArray);
        aVar.f487i = typedArray.getBoolean(2, aVar.f487i);
        aVar.f490l = typedArray.getBoolean(3, aVar.f490l);
        aVar.f504z = typedArray.getInt(4, aVar.f504z);
        aVar.f471A = typedArray.getInt(5, aVar.f471A);
        aVar.f502x = typedArray.getBoolean(0, aVar.f502x);
    }

    public void addState(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            C0190a aVar = this.mStateListState;
            aVar.f505I[aVar.mo1568a(drawable)] = iArr;
            onStateChange(getState());
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    public int[] extractStateSet(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public int getStateCount() {
        return this.mStateListState.f486h;
    }

    public Drawable getStateDrawable(int i) {
        return this.mStateListState.mo1572d(i);
    }

    public int getStateDrawableIndex(int[] iArr) {
        return this.mStateListState.mo1580f(iArr);
    }

    public C0190a getStateListState() {
        return this.mStateListState;
    }

    public int[] getStateSet(int i) {
        return this.mStateListState.f505I[i];
    }

    public void inflate(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray i = C8299j.m16596i(resources, theme, attributeSet, C15588c1.f35086l);
        setVisible(i.getBoolean(1, true), true);
        updateStateFromTypedArray(i);
        updateDensity(resources);
        i.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mStateListState.mo1489e();
            this.mMutated = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f = this.mStateListState.mo1580f(iArr);
        if (f < 0) {
            f = this.mStateListState.mo1580f(StateSet.WILD_CARD);
        }
        return selectDrawable(f) || onStateChange;
    }

    public void setConstantState(C0185a.C0188c cVar) {
        super.setConstantState(cVar);
        if (cVar instanceof C0190a) {
            this.mStateListState = (C0190a) cVar;
        }
    }

    public C0189b(C0190a aVar, Resources resources) {
        setConstantState(new C0190a(aVar, this, resources));
        onStateChange(getState());
    }

    public C0190a cloneConstantState() {
        return new C0190a(this.mStateListState, this, (Resources) null);
    }

    public C0189b(C0190a aVar) {
        if (aVar != null) {
            setConstantState(aVar);
        }
    }
}
