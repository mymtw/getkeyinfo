package com.google.android.exoplayer2.p526ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.etsy.android.R;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C14389c;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p513bj.C14049b0;
import p726zi.C18908c;
import p726zi.C18929o;
import p726zi.C18930p;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final C14412a componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    private C14414c listener;
    private C14389c.C14390a mappedTrackInfo;
    private final SparseArray<DefaultTrackSelector.SelectionOverride> overrides;
    private int rendererIndex;
    private final int selectableItemBackgroundResourceId;
    private TrackGroupArray trackGroups;
    private Comparator<C14413b> trackInfoComparator;
    private C18929o trackNameProvider;
    private CheckedTextView[][] trackViews;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    public class C14412a implements View.OnClickListener {
        public C14412a() {
        }

        public final void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    public static final class C14413b {

        /* renamed from: a */
        public final int f32445a;

        /* renamed from: b */
        public final int f32446b;

        /* renamed from: c */
        public final Format f32447c;

        public C14413b(int i, int i2, Format format) {
            this.f32445a = i;
            this.f32446b = i2;
            this.f32447c = format;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    public interface C14414c {
        /* renamed from: a */
        void mo48158a();
    }

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    private static int[] getTracksAdding(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    private static int[] getTracksRemoving(int[] iArr, int i) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    /* access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
        C14414c cVar = this.listener;
        if (cVar != null) {
            getIsDisabled();
            getOverrides();
            cVar.mo48158a();
        }
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onTrackViewClicked(View view) {
        this.isDisabled = false;
        Object tag = view.getTag();
        tag.getClass();
        C14413b bVar = (C14413b) tag;
        int i = bVar.f32445a;
        int i2 = bVar.f32446b;
        DefaultTrackSelector.SelectionOverride selectionOverride = this.overrides.get(i);
        this.mappedTrackInfo.getClass();
        if (selectionOverride == null) {
            if (!this.allowMultipleOverrides && this.overrides.size() > 0) {
                this.overrides.clear();
            }
            this.overrides.put(i, new DefaultTrackSelector.SelectionOverride(i, i2));
            return;
        }
        int i3 = selectionOverride.length;
        int[] iArr = selectionOverride.tracks;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(i);
        boolean z = shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (!isChecked || !z) {
            if (isChecked) {
                return;
            }
            if (shouldEnableAdaptiveSelection) {
                this.overrides.put(i, new DefaultTrackSelector.SelectionOverride(i, getTracksAdding(iArr, i2)));
            } else {
                this.overrides.put(i, new DefaultTrackSelector.SelectionOverride(i, i2));
            }
        } else if (i3 == 1) {
            this.overrides.remove(i);
        } else {
            this.overrides.put(i, new DefaultTrackSelector.SelectionOverride(i, getTracksRemoving(iArr, i2)));
        }
    }

    @RequiresNonNull({"mappedTrackInfo"})
    private boolean shouldEnableAdaptiveSelection(int i) {
        if (this.allowAdaptiveSelections && this.trackGroups.get(i).length > 1) {
            C14389c.C14390a aVar = this.mappedTrackInfo;
            int i2 = this.rendererIndex;
            int i3 = aVar.f32406c[i2].get(i).length;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                if ((aVar.f32408e[i2][i][i5] & 7) == 4) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            int i6 = 16;
            String str = null;
            int i7 = 0;
            boolean z = false;
            int i8 = 0;
            while (i7 < copyOf.length) {
                String str2 = aVar.f32406c[i2].get(i).getFormat(copyOf[i7]).sampleMimeType;
                int i9 = i8 + 1;
                if (i8 == 0) {
                    str = str2;
                } else {
                    z |= !C14049b0.m21628a(str, str2);
                }
                i6 = Math.min(i6, aVar.f32408e[i2][i][i7] & 24);
                i7++;
                i8 = i9;
            }
            if (z) {
                i6 = Math.min(i6, aVar.f32407d[i2]);
            }
            if (i6 != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.length > 1;
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.size() == 0);
        for (int i = 0; i < this.trackViews.length; i++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.overrides.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.trackViews[i];
                if (i2 >= checkedTextViewArr.length) {
                    break;
                }
                if (selectionOverride != null) {
                    Object tag = checkedTextViewArr[i2].getTag();
                    tag.getClass();
                    this.trackViews[i][i2].setChecked(selectionOverride.containsTrack(((C14413b) tag).f32446b));
                } else {
                    checkedTextViewArr[i2].setChecked(false);
                }
                i2++;
            }
        }
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.mappedTrackInfo == null) {
            this.disableView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        this.disableView.setEnabled(true);
        this.defaultView.setEnabled(true);
        TrackGroupArray trackGroupArray = this.mappedTrackInfo.f32406c[this.rendererIndex];
        this.trackGroups = trackGroupArray;
        this.trackViews = new CheckedTextView[trackGroupArray.length][];
        boolean shouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        int i = 0;
        while (true) {
            TrackGroupArray trackGroupArray2 = this.trackGroups;
            if (i < trackGroupArray2.length) {
                TrackGroup trackGroup = trackGroupArray2.get(i);
                boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(i);
                CheckedTextView[][] checkedTextViewArr = this.trackViews;
                int i2 = trackGroup.length;
                checkedTextViewArr[i] = new CheckedTextView[i2];
                C14413b[] bVarArr = new C14413b[i2];
                for (int i3 = 0; i3 < trackGroup.length; i3++) {
                    bVarArr[i3] = new C14413b(i, i3, trackGroup.getFormat(i3));
                }
                Comparator<C14413b> comparator = this.trackInfoComparator;
                if (comparator != null) {
                    Arrays.sort(bVarArr, comparator);
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    if (i4 == 0) {
                        addView(this.inflater.inflate(R.layout.exo_list_divider, this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.inflater.inflate((shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection) ? 17367056 : 17367055, this, false);
                    checkedTextView.setBackgroundResource(this.selectableItemBackgroundResourceId);
                    checkedTextView.setText(this.trackNameProvider.mo70334a(bVarArr[i4].f32447c));
                    checkedTextView.setTag(bVarArr[i4]);
                    if ((this.mappedTrackInfo.f32408e[this.rendererIndex][i][i4] & 7) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.componentListener);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.trackViews[i][i4] = checkedTextView;
                    addView(checkedTextView);
                }
                i++;
            } else {
                updateViewStates();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.overrides.size());
        for (int i = 0; i < this.overrides.size(); i++) {
            arrayList.add(this.overrides.valueAt(i));
        }
        return arrayList;
    }

    public void init(C14389c.C14390a aVar, int i, boolean z, List<DefaultTrackSelector.SelectionOverride> list, Comparator<Format> comparator, C14414c cVar) {
        this.mappedTrackInfo = aVar;
        this.rendererIndex = i;
        this.isDisabled = z;
        this.trackInfoComparator = comparator == null ? null : new C18930p(comparator);
        this.listener = cVar;
        int size = this.allowMultipleOverrides ? list.size() : Math.min(list.size(), 1);
        for (int i2 = 0; i2 < size; i2++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = list.get(i2);
            this.overrides.put(selectionOverride.groupIndex, selectionOverride);
        }
        updateViews();
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.allowAdaptiveSelections != z) {
            this.allowAdaptiveSelections = z;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.allowMultipleOverrides != z) {
            this.allowMultipleOverrides = z;
            if (!z && this.overrides.size() > 1) {
                for (int size = this.overrides.size() - 1; size > 0; size--) {
                    this.overrides.remove(size);
                }
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.disableView.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(C18929o oVar) {
        oVar.getClass();
        this.trackNameProvider = oVar;
        updateViews();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.overrides = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.inflater = from;
        C14412a aVar = new C14412a();
        this.componentListener = aVar;
        this.trackNameProvider = new C18908c(getResources());
        this.trackGroups = TrackGroupArray.EMPTY;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }
}
