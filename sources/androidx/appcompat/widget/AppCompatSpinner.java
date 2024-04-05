package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.WeakHashMap;
import p075d.C6614a;
import p109g.C6826c;

public class AppCompatSpinner extends Spinner {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {16843505};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final C0306d mBackgroundTintHelper;
    public int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    private C0259f mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    public final Rect mTempRect;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatSpinner appCompatSpinner, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatSpinner.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatSpinner.getBackgroundTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0250a();

        /* renamed from: b */
        public boolean f683b;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public class C0250a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f683b ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f683b = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0251a extends ForwardingListener {

        /* renamed from: b */
        public final /* synthetic */ C0255e f684b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0251a(View view, C0255e eVar) {
            super(view);
            this.f684b = eVar;
        }

        public final C6826c getPopup() {
            return this.f684b;
        }

        @SuppressLint({"SyntheticAccessor"})
        public final boolean onForwardingStarted() {
            if (AppCompatSpinner.this.getInternalPopup().mo2468b()) {
                return true;
            }
            AppCompatSpinner.this.showPopup();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class C0252b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0252b() {
        }

        public final void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo2468b()) {
                AppCompatSpinner.this.showPopup();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public class C0253c implements C0259f, DialogInterface.OnClickListener {

        /* renamed from: b */
        public AlertDialog f687b;

        /* renamed from: c */
        public ListAdapter f688c;

        /* renamed from: d */
        public CharSequence f689d;

        public C0253c() {
        }

        /* renamed from: b */
        public final boolean mo2468b() {
            AlertDialog alertDialog = this.f687b;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        /* renamed from: c */
        public final int mo2469c() {
            return 0;
        }

        public final void dismiss() {
            AlertDialog alertDialog = this.f687b;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f687b = null;
            }
        }

        /* renamed from: e */
        public final void mo2471e(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: f */
        public final CharSequence mo2472f() {
            return this.f689d;
        }

        /* renamed from: g */
        public final Drawable mo2473g() {
            return null;
        }

        /* renamed from: h */
        public final void mo2474h(CharSequence charSequence) {
            this.f689d = charSequence;
        }

        /* renamed from: i */
        public final void mo2475i(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: j */
        public final void mo2476j(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: k */
        public final void mo2477k(int i, int i2) {
            if (this.f688c != null) {
                AlertDialog.C0133a aVar = new AlertDialog.C0133a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f689d;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                ListAdapter listAdapter = this.f688c;
                int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
                AlertController.C0130b bVar = aVar.f286a;
                bVar.f276r = listAdapter;
                bVar.f277s = this;
                bVar.f283y = selectedItemPosition;
                bVar.f282x = true;
                AlertDialog create = aVar.create();
                this.f687b = create;
                ListView listView = create.getListView();
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                this.f687b.show();
            }
        }

        /* renamed from: l */
        public final int mo2478l() {
            return 0;
        }

        /* renamed from: m */
        public final void mo2479m(ListAdapter listAdapter) {
            this.f688c = listAdapter;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f688c.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: p */
        public final void mo2481p(Drawable drawable) {
            Log.e(AppCompatSpinner.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static class C0254d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f691b;

        /* renamed from: c */
        public ListAdapter f692c;

        public C0254d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f691b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f692c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                    themedSpinnerAdapter2.setDropDownViewTheme(theme);
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f692c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f691b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f691b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f691b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f691b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f691b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f692c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f691b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f691b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public class C0255e extends C0311f0 implements C0259f {

        /* renamed from: C */
        public CharSequence f693C;

        /* renamed from: D */
        public ListAdapter f694D;

        /* renamed from: E */
        public final Rect f695E = new Rect();

        /* renamed from: F */
        public int f696F;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        public class C0256a implements AdapterView.OnItemClickListener {
            public C0256a() {
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0255e eVar = C0255e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f694D.getItemId(i));
                }
                C0255e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        public class C0257b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0257b() {
            }

            public final void onGlobalLayout() {
                C0255e eVar = C0255e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                eVar.getClass();
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (!(C2364y.C2371g.m5245b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(eVar.f695E))) {
                    C0255e.this.dismiss();
                    return;
                }
                C0255e.this.mo2495s();
                C0255e.this.mo2003a();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        public class C0258c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f700b;

            public C0258c(C0257b bVar) {
                this.f700b = bVar;
            }

            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f700b);
                }
            }
        }

        public C0255e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f785p = AppCompatSpinner.this;
            this.f794y = true;
            this.f795z.setFocusable(true);
            this.f786q = new C0256a();
        }

        /* renamed from: f */
        public final CharSequence mo2472f() {
            return this.f693C;
        }

        /* renamed from: h */
        public final void mo2474h(CharSequence charSequence) {
            this.f693C = charSequence;
        }

        /* renamed from: j */
        public final void mo2476j(int i) {
            this.f696F = i;
        }

        /* renamed from: k */
        public final void mo2477k(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b = mo2004b();
            mo2495s();
            this.f795z.setInputMethodMode(2);
            mo2003a();
            C0299a0 a0Var = this.f773d;
            a0Var.setChoiceMode(1);
            a0Var.setTextDirection(i);
            a0Var.setTextAlignment(i2);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            C0299a0 a0Var2 = this.f773d;
            if (mo2004b() && a0Var2 != null) {
                a0Var2.setListSelectionHidden(false);
                a0Var2.setSelection(selectedItemPosition);
                if (a0Var2.getChoiceMode() != 0) {
                    a0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0257b bVar = new C0257b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f795z.setOnDismissListener(new C0258c(bVar));
            }
        }

        /* renamed from: m */
        public final void mo2479m(ListAdapter listAdapter) {
            super.mo2479m(listAdapter);
            this.f694D = listAdapter;
        }

        /* renamed from: s */
        public final void mo2495s() {
            Drawable g = mo3039g();
            int i = 0;
            if (g != null) {
                g.getPadding(AppCompatSpinner.this.mTempRect);
                i = C0353t0.m961a(AppCompatSpinner.this) ? AppCompatSpinner.this.mTempRect.right : -AppCompatSpinner.this.mTempRect.left;
            } else {
                Rect rect = AppCompatSpinner.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.mDropDownWidth;
            if (i2 == -2) {
                int compatMeasureContentWidth = appCompatSpinner.compatMeasureContentWidth((SpinnerAdapter) this.f694D, mo3039g());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.mTempRect;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (compatMeasureContentWidth > i4) {
                    compatMeasureContentWidth = i4;
                }
                mo3043r(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                mo3043r((width - paddingLeft) - paddingRight);
            } else {
                mo3043r(i2);
            }
            this.f776g = C0353t0.m961a(AppCompatSpinner.this) ? (((width - paddingRight) - this.f775f) - this.f696F) + i : paddingLeft + this.f696F + i;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public interface C0259f {
        /* renamed from: b */
        boolean mo2468b();

        /* renamed from: c */
        int mo2469c();

        void dismiss();

        /* renamed from: e */
        void mo2471e(int i);

        /* renamed from: f */
        CharSequence mo2472f();

        /* renamed from: g */
        Drawable mo2473g();

        /* renamed from: h */
        void mo2474h(CharSequence charSequence);

        /* renamed from: i */
        void mo2475i(int i);

        /* renamed from: j */
        void mo2476j(int i);

        /* renamed from: k */
        void mo2477k(int i, int i2);

        /* renamed from: l */
        int mo2478l();

        /* renamed from: m */
        void mo2479m(ListAdapter listAdapter);

        /* renamed from: p */
        void mo2481p(Drawable drawable);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return i2 + rect.left + rect.right;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3023a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0259f fVar = this.mPopup;
        return fVar != null ? fVar.mo2469c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0259f fVar = this.mPopup;
        return fVar != null ? fVar.mo2478l() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.mPopup != null ? this.mDropDownWidth : super.getDropDownWidth();
    }

    public final C0259f getInternalPopup() {
        return this.mPopup;
    }

    public Drawable getPopupBackground() {
        C0259f fVar = this.mPopup;
        return fVar != null ? fVar.mo2473g() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public CharSequence getPrompt() {
        C0259f fVar = this.mPopup;
        return fVar != null ? fVar.mo2472f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo3024b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo3025c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0259f fVar = this.mPopup;
        if (fVar != null && fVar.mo2468b()) {
            this.mPopup.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f683b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0252b());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0259f fVar = this.mPopup;
        savedState.f683b = fVar != null && fVar.mo2468b();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0259f fVar = this.mPopup;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo2468b()) {
            return true;
        }
        showPopup();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3027e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3028f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0259f fVar = this.mPopup;
        if (fVar != null) {
            fVar.mo2476j(i);
            this.mPopup.mo2471e(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0259f fVar = this.mPopup;
        if (fVar != null) {
            fVar.mo2475i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0259f fVar = this.mPopup;
        if (fVar != null) {
            fVar.mo2481p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C6614a.m12981a(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0259f fVar = this.mPopup;
        if (fVar != null) {
            fVar.mo2474h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3030h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3031i(mode);
        }
    }

    public void showPopup() {
        this.mPopup.mo2477k(getTextDirection(), getTextAlignment());
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, (AttributeSet) null, R.attr.spinnerStyle, i);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.mo2479m(new C0254d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r13 != null) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.mTempRect = r0
            android.content.Context r0 = r8.getContext()
            androidx.appcompat.widget.C0334m0.m882a(r8, r0)
            int[] r0 = p628nj.C18263b.f40040D
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r8)
            r8.mBackgroundTintHelper = r2
            if (r13 == 0) goto L_0x0029
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>((android.content.Context) r9, (android.content.res.Resources.Theme) r13)
            r8.mPopupContext = r2
            goto L_0x003a
        L_0x0029:
            r13 = 4
            int r13 = r0.getResourceId(r13, r1)
            if (r13 == 0) goto L_0x0038
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>((android.content.Context) r9, (int) r13)
            r8.mPopupContext = r2
            goto L_0x003a
        L_0x0038:
            r8.mPopupContext = r9
        L_0x003a:
            r13 = -1
            r2 = 0
            if (r12 != r13) goto L_0x006c
            int[] r13 = ATTRS_ANDROID_SPINNERMODE     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            android.content.res.TypedArray r13 = r9.obtainStyledAttributes(r10, r13, r11, r1)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            boolean r3 = r13.hasValue(r1)     // Catch:{ Exception -> 0x0052 }
            if (r3 == 0) goto L_0x0062
            int r12 = r13.getInt(r1, r1)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0062
        L_0x004f:
            r9 = move-exception
            r2 = r13
            goto L_0x0066
        L_0x0052:
            r3 = move-exception
            goto L_0x0059
        L_0x0054:
            r9 = move-exception
            goto L_0x0066
        L_0x0056:
            r13 = move-exception
            r3 = r13
            r13 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x004f }
            if (r13 == 0) goto L_0x006c
        L_0x0062:
            r13.recycle()
            goto L_0x006c
        L_0x0066:
            if (r2 == 0) goto L_0x006b
            r2.recycle()
        L_0x006b:
            throw r9
        L_0x006c:
            r13 = 2
            r3 = 1
            if (r12 == 0) goto L_0x00a6
            if (r12 == r3) goto L_0x0073
            goto L_0x00b3
        L_0x0073:
            androidx.appcompat.widget.AppCompatSpinner$e r12 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r4 = r8.mPopupContext
            r12.<init>(r4, r10, r11)
            android.content.Context r4 = r8.mPopupContext
            int[] r5 = p628nj.C18263b.f40040D
            androidx.appcompat.widget.p0 r4 = androidx.appcompat.widget.C0340p0.m891m(r4, r10, r5, r11)
            r5 = 3
            r6 = -2
            android.content.res.TypedArray r7 = r4.f876b
            int r5 = r7.getLayoutDimension(r5, r6)
            r8.mDropDownWidth = r5
            android.graphics.drawable.Drawable r5 = r4.mo3101e(r3)
            r12.mo3042p(r5)
            java.lang.String r13 = r0.getString(r13)
            r12.f693C = r13
            r4.mo3109n()
            r8.mPopup = r12
            androidx.appcompat.widget.AppCompatSpinner$a r13 = new androidx.appcompat.widget.AppCompatSpinner$a
            r13.<init>(r8, r12)
            r8.mForwardingListener = r13
            goto L_0x00b3
        L_0x00a6:
            androidx.appcompat.widget.AppCompatSpinner$c r12 = new androidx.appcompat.widget.AppCompatSpinner$c
            r12.<init>()
            r8.mPopup = r12
            java.lang.String r13 = r0.getString(r13)
            r12.f689d = r13
        L_0x00b3:
            java.lang.CharSequence[] r12 = r0.getTextArray(r1)
            if (r12 == 0) goto L_0x00ca
            android.widget.ArrayAdapter r13 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r13.<init>(r9, r1, r12)
            r9 = 2131624752(0x7f0e0330, float:1.8876693E38)
            r13.setDropDownViewResource(r9)
            r8.setAdapter((android.widget.SpinnerAdapter) r13)
        L_0x00ca:
            r0.recycle()
            r8.mPopupSet = r3
            android.widget.SpinnerAdapter r9 = r8.mTempAdapter
            if (r9 == 0) goto L_0x00d8
            r8.setAdapter((android.widget.SpinnerAdapter) r9)
            r8.mTempAdapter = r2
        L_0x00d8:
            androidx.appcompat.widget.d r9 = r8.mBackgroundTintHelper
            r9.mo3026d(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
