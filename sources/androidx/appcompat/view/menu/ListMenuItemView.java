package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0220g;
import androidx.appcompat.widget.C0340p0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.WeakHashMap;
import p628nj.C18263b;

public class ListMenuItemView extends LinearLayout implements C0220g.C0221a, AbsListView.SelectionBoundsAdjuster {
    private static final String TAG = "ListMenuItemView";
    private Drawable mBackground;
    private CheckBox mCheckBox;
    private LinearLayout mContent;
    private boolean mForceShowIcon;
    private ImageView mGroupDivider;
    private boolean mHasListDivider;
    private ImageView mIconView;
    private LayoutInflater mInflater;
    private MenuItemImpl mItemData;
    private boolean mPreserveIconSpacing;
    private RadioButton mRadioButton;
    private TextView mShortcutView;
    private Drawable mSubMenuArrow;
    private ImageView mSubMenuArrowView;
    private int mTextAppearance;
    private Context mTextAppearanceContext;
    private TextView mTitleView;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private void addContentView(View view) {
        addContentView(view, -1);
    }

    private LayoutInflater getInflater() {
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getContext());
        }
        return this.mInflater;
    }

    private void insertCheckBox() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.mCheckBox = checkBox;
        addContentView(checkBox);
    }

    private void insertIconView() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
        this.mIconView = imageView;
        addContentView(imageView, 0);
    }

    private void insertRadioButton() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.mRadioButton = radioButton;
        addContentView(radioButton);
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.mSubMenuArrowView;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.mGroupDivider;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mGroupDivider.getLayoutParams();
            rect.top = this.mGroupDivider.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.mItemData = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.getTitleForItemView(this));
        setCheckable(menuItemImpl.isCheckable());
        setShortcut(menuItemImpl.shouldShowShortcut(), menuItemImpl.getShortcut());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.mBackground;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5227q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.mTitleView = textView;
        int i = this.mTextAppearance;
        if (i != -1) {
            textView.setTextAppearance(this.mTextAppearanceContext, i);
        }
        this.mShortcutView = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.mSubMenuArrowView = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.mSubMenuArrow);
        }
        this.mGroupDivider = (ImageView) findViewById(R.id.group_divider);
        this.mContent = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.mIconView != null && this.mPreserveIconSpacing) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mIconView.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.mRadioButton != null || this.mCheckBox != null) {
            if (this.mItemData.isExclusiveCheckable()) {
                if (this.mRadioButton == null) {
                    insertRadioButton();
                }
                compoundButton = this.mRadioButton;
                view = this.mCheckBox;
            } else {
                if (this.mCheckBox == null) {
                    insertCheckBox();
                }
                compoundButton = this.mCheckBox;
                view = this.mRadioButton;
            }
            if (z) {
                compoundButton.setChecked(this.mItemData.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.mCheckBox;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.mRadioButton;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.mItemData.isExclusiveCheckable()) {
            if (this.mRadioButton == null) {
                insertRadioButton();
            }
            compoundButton = this.mRadioButton;
        } else {
            if (this.mCheckBox == null) {
                insertCheckBox();
            }
            compoundButton = this.mCheckBox;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        this.mPreserveIconSpacing = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.mGroupDivider;
        if (imageView != null) {
            imageView.setVisibility((this.mHasListDivider || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.mItemData.shouldShowIcon() || this.mForceShowIcon;
        if (z || this.mPreserveIconSpacing) {
            ImageView imageView = this.mIconView;
            if (imageView != null || drawable != null || this.mPreserveIconSpacing) {
                if (imageView == null) {
                    insertIconView();
                }
                if (drawable != null || this.mPreserveIconSpacing) {
                    ImageView imageView2 = this.mIconView;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.mIconView.getVisibility() != 0) {
                        this.mIconView.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.mIconView.setVisibility(8);
            }
        }
    }

    public void setShortcut(boolean z, char c) {
        int i = (!z || !this.mItemData.shouldShowShortcut()) ? 8 : 0;
        if (i == 0) {
            this.mShortcutView.setText(this.mItemData.getShortcutLabel());
        }
        if (this.mShortcutView.getVisibility() != i) {
            this.mShortcutView.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.mTitleView.setText(charSequence);
            if (this.mTitleView.getVisibility() != 0) {
                this.mTitleView.setVisibility(0);
            }
        } else if (this.mTitleView.getVisibility() != 8) {
            this.mTitleView.setVisibility(8);
        }
    }

    public boolean showsIcon() {
        return this.mForceShowIcon;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0340p0 m = C0340p0.m891m(getContext(), attributeSet, C18263b.f40089z, i);
        this.mBackground = m.mo3101e(5);
        this.mTextAppearance = m.mo3105i(1, -1);
        this.mPreserveIconSpacing = m.mo3097a(7, false);
        this.mTextAppearanceContext = context;
        this.mSubMenuArrow = m.mo3101e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.mHasListDivider = obtainStyledAttributes.hasValue(0);
        m.mo3109n();
        obtainStyledAttributes.recycle();
    }

    private void addContentView(View view, int i) {
        LinearLayout linearLayout = this.mContent;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }
}
