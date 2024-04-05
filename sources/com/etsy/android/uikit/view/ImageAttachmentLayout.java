package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10592b;
import com.etsy.android.stylekit.views.CollageImageUpload;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import p455u9.C13452f;

public class ImageAttachmentLayout extends LinearLayout {
    private static final int MAX_IMAGE_ATTACHMENTS = 3;
    private static final String STATE_ATTACHMENTS = "attachments";
    private static final String STATE_SUPER = "super";
    private C11917a attachmentCallback;
    private Set<File> imageAttachments;
    private LinearLayout.LayoutParams imageLayoutParams;
    private int imageSize = 200;
    private int imageSpacing = 0;
    private List<C11918b> imageViews;
    private boolean imagesToAttach = false;

    /* renamed from: com.etsy.android.uikit.view.ImageAttachmentLayout$a */
    public interface C11917a {
        void onRemove();
    }

    /* renamed from: com.etsy.android.uikit.view.ImageAttachmentLayout$b */
    public static class C11918b {

        /* renamed from: a */
        public boolean f26481a;

        /* renamed from: b */
        public CollageImageUpload f26482b;

        /* renamed from: c */
        public File f26483c;

        /* renamed from: d */
        public boolean f26484d;
    }

    public ImageAttachmentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void addScaledBitmap(C11918b bVar, Bitmap bitmap, File file) {
        removeImage(file);
        bVar.f26482b.setImageBitmap(bitmap);
        bVar.f26483c = file;
        this.imageAttachments.add(file);
        bVar.f26484d = true;
        bVar.f26482b.setVisibility(0);
        bVar.f26481a = false;
        bVar.f26482b.setLoading(false);
    }

    private C11918b createuiModel(CollageImageUpload collageImageUpload) {
        C11918b bVar = new C11918b();
        bVar.f26482b = collageImageUpload;
        collageImageUpload.setRemoveButtonOnClick(new C10592b(1, this, bVar));
        return bVar;
    }

    private C11918b findUnattachedView() {
        for (int i = 0; i < this.imageViews.size(); i++) {
            C11918b bVar = this.imageViews.get(i);
            if (!bVar.f26484d) {
                return bVar;
            }
        }
        return null;
    }

    private void init(Context context) {
        this.imageAttachments = Collections.synchronizedSet(new HashSet(3));
        this.imageViews = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            this.imageViews.add(createuiModel(new CollageImageUpload(context)));
        }
        this.imageSpacing = getResources().getDimensionPixelOffset(R.dimen.clg_space_8);
        int i2 = this.imageSize;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        this.imageLayoutParams = layoutParams;
        layoutParams.setMarginEnd(this.imageSpacing);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createuiModel$0(C11918b bVar, View view) {
        removeImage(bVar);
        C11917a aVar = this.attachmentCallback;
        if (aVar != null) {
            aVar.onRemove();
        }
    }

    public void addBitmap(C11918b bVar, Bitmap bitmap, File file) {
        if (bVar != null && file.exists() && bitmap != null) {
            int i = this.imageSize;
            Bitmap f = C13452f.m21229f(bitmap, i, i);
            bitmap.recycle();
            addScaledBitmap(bVar, f, file);
        }
    }

    public void calcSizes(int i) {
        int size = View.MeasureSpec.getSize(i);
        if (size != 0) {
            this.imageSize = Math.round(((float) (size - (this.imageSpacing * 2))) / 3.0f);
        }
    }

    public void clear() {
        for (int i = 0; i < this.imageViews.size(); i++) {
            removeImage(this.imageViews.get(i));
        }
        this.imageAttachments.clear();
    }

    public void clearSaved() {
        for (int i = 0; i < this.imageViews.size(); i++) {
            if (!isLoading(this.imageViews.get(i))) {
                removeImage(this.imageViews.get(i));
            }
        }
        this.imageAttachments.clear();
    }

    public List<File> getImageFiles() {
        return new ArrayList(this.imageAttachments);
    }

    public boolean hasSpaceAvailable() {
        if (!this.imagesToAttach) {
            for (int i = 0; i < this.imageViews.size(); i++) {
                if (!this.imageViews.get(i).f26484d) {
                    return true;
                }
            }
        } else if (this.imageAttachments.size() < 3) {
            return true;
        } else {
            for (File file : this.imageAttachments) {
                if (file == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized boolean isLoading(C11918b bVar) {
        return bVar.f26481a;
    }

    public void onAbort(C11918b bVar, File file) {
        if (bVar != null) {
            super.removeView(bVar.f26482b);
            bVar.f26482b.setImageBitmap((Bitmap) null);
            bVar.f26484d = false;
        }
        if (file != null) {
            file.delete();
        }
    }

    public void onMeasure(int i, int i2) {
        C11918b findUnattachedView;
        calcSizes(i);
        LinearLayout.LayoutParams layoutParams = this.imageLayoutParams;
        int i3 = this.imageSize;
        layoutParams.width = i3;
        layoutParams.height = i3;
        for (int i4 = 0; i4 < this.imageViews.size(); i4++) {
            this.imageViews.get(i4).f26482b.setLayoutParams(this.imageLayoutParams);
        }
        Set<File> set = this.imageAttachments;
        if (set != null && this.imagesToAttach) {
            this.imagesToAttach = false;
            for (File next : set) {
                if (!(next == null || !next.exists() || (findUnattachedView = findUnattachedView()) == null)) {
                    String absolutePath = next.getAbsolutePath();
                    int i5 = this.imageSize;
                    addScaledBitmap(findUnattachedView, C13452f.m21230g(i5, i5, absolutePath), next);
                    super.addView(findUnattachedView.f26482b);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
        clear();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(STATE_ATTACHMENTS);
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C11918b startLoading = startLoading();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(next, options);
                Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                addBitmap(startLoading, C13452f.m21230g(((Integer) pair.getFirst()).intValue(), ((Integer) pair.getSecond()).intValue(), next), new File(next));
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(STATE_SUPER, super.onSaveInstanceState());
        ArrayList arrayList = new ArrayList();
        for (File absolutePath : this.imageAttachments) {
            arrayList.add(absolutePath.getAbsolutePath());
        }
        bundle.putStringArrayList(STATE_ATTACHMENTS, arrayList);
        return bundle;
    }

    public void removeImage(C11918b bVar) {
        removeImage(bVar, true);
    }

    public void setAttachmentCallback(C11917a aVar) {
        this.attachmentCallback = aVar;
    }

    public void setImages(List<File> list) {
        clearSaved();
        if (list != null) {
            for (File next : list) {
                if (next != null && next.exists() && !this.imageAttachments.contains(next)) {
                    this.imageAttachments.add(next);
                    this.imagesToAttach = true;
                }
            }
        }
        invalidate();
    }

    public synchronized C11918b startLoading() {
        C11918b findUnattachedView = findUnattachedView();
        if (findUnattachedView == null) {
            return null;
        }
        findUnattachedView.f26482b.setLoading(true);
        findUnattachedView.f26482b.setVisibility(0);
        super.addView(findUnattachedView.f26482b);
        findUnattachedView.f26484d = true;
        return findUnattachedView;
    }

    private void removeImage(C11918b bVar, boolean z) {
        if (bVar != null) {
            bVar.f26482b.setImageBitmap((Bitmap) null);
            File file = bVar.f26483c;
            if (file != null && z) {
                this.imageAttachments.remove(file);
            }
            bVar.f26484d = false;
            super.removeView(bVar.f26482b);
        }
    }

    public ImageAttachmentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public void removeImage(File file) {
        File file2;
        for (int i = 0; i < this.imageViews.size(); i++) {
            C11918b bVar = this.imageViews.get(i);
            if (!(bVar == null || (file2 = bVar.f26483c) == null || !file2.equals(file))) {
                C8694h hVar = C8694h.f19097a;
                StringBuilder h = C0072d.m201h("Removing existing file image: ");
                h.append(file.getAbsolutePath());
                hVar.mo21310e(h.toString());
                removeImage(bVar, false);
            }
        }
    }
}
