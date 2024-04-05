package com.etsy.android.uikit.view.draggable;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.view.DoubleTapEventHandler;
import com.etsy.android.uikit.view.draggable.C11943b;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p462ug.C13532h;
import p504ai.C13983i;
import p753kq.C19846a;

public final class DraggablePhotoView extends PhotoView implements View.OnTouchListener, C13532h {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final C19285c doubleTapEventHandler$delegate;
    /* access modifiers changed from: private */
    public C11948c doubleTapListener;
    private final C19285c eventHandler$delegate;
    private C19846a<C19394m> onDragEndListener;
    private C19846a<C19394m> onDragStartListener;
    /* access modifiers changed from: private */
    public C11949d swipeListener;

    /* renamed from: com.etsy.android.uikit.view.draggable.DraggablePhotoView$a */
    public static final class C11932a implements C11948c {

        /* renamed from: a */
        public final /* synthetic */ C19846a<C19394m> f26535a;

        public C11932a(C19846a<C19394m> aVar) {
            this.f26535a = aVar;
        }

        public final void onDoubleTap() {
            this.f26535a.invoke();
        }
    }

    /* renamed from: com.etsy.android.uikit.view.draggable.DraggablePhotoView$b */
    public static final class C11933b implements C11949d {

        /* renamed from: a */
        public final /* synthetic */ C19846a<C19394m> f26536a;

        public C11933b(C19846a<C19394m> aVar) {
            this.f26536a = aVar;
        }

        /* renamed from: a */
        public final void mo38680a() {
            this.f26536a.invoke();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DraggablePhotoView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DraggablePhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggablePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.eventHandler$delegate = C19350d.m32677b(new DraggablePhotoView$eventHandler$2(context, this));
        this.doubleTapEventHandler$delegate = C19350d.m32677b(new DraggablePhotoView$doubleTapEventHandler$2(context, this));
        checkContext(context);
        setOnTouchListener(this);
        setOnViewDragListener(this);
    }

    private final void checkContext(Context context) {
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("DraggablePhotoView must be used within Activity context");
        }
    }

    private final DoubleTapEventHandler getDoubleTapEventHandler() {
        return (DoubleTapEventHandler) this.doubleTapEventHandler$delegate.getValue();
    }

    private final DragEventHandler getEventHandler() {
        return (DragEventHandler) this.eventHandler$delegate.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void cleanup() {
        DragEventHandler eventHandler = getEventHandler();
        ImageView imageView = eventHandler.f26510g;
        if (imageView != null) {
            eventHandler.f26504a.removeView(imageView);
        }
    }

    public final C19846a<C19394m> getOnDragEndListener() {
        return this.onDragEndListener;
    }

    public final C19846a<C19394m> getOnDragStartListener() {
        return this.onDragStartListener;
    }

    public void onDrag(float f, float f2) {
        C19846a<C19394m> aVar;
        C11943b bVar = getEventHandler().f26508e;
        if (getAttacher().getScale() == 1.0f) {
            getEventHandler().mo38662a(f, f2);
        }
        C11943b bVar2 = getEventHandler().f26508e;
        if ((bVar2 instanceof C11943b.C11946c) && !C19383o.m32792b(bVar2, bVar) && (aVar = this.onDragStartListener) != null) {
            aVar.invoke();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C19846a<C19394m> aVar;
        C19383o.m32797g(view, "v");
        C19383o.m32797g(motionEvent, "event");
        C11943b bVar = getEventHandler().f26508e;
        DragEventHandler eventHandler = getEventHandler();
        eventHandler.getClass();
        boolean z = true;
        if (motionEvent.getPointerCount() > 1) {
            z = C19383o.m32792b(eventHandler.f26508e, C11943b.C11946c.f26548a);
        }
        if (z) {
            getEventHandler().mo38663b(motionEvent);
        }
        C11943b bVar2 = getEventHandler().f26508e;
        if ((bVar instanceof C11943b.C11946c) && !C19383o.m32792b(bVar2, bVar) && (aVar = this.onDragEndListener) != null) {
            aVar.invoke();
        }
        getDoubleTapEventHandler().updateWith(motionEvent);
        return getAttacher().onTouch(view, motionEvent);
    }

    public final void setImageDoubleTapListener(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.doubleTapListener = new C11932a(aVar);
    }

    public final void setImageSwipeDownListener(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.swipeListener = new C11933b(aVar);
    }

    public final void setOnDragEndListener(C19846a<C19394m> aVar) {
        this.onDragEndListener = aVar;
    }

    public final void setOnDragStartListener(C19846a<C19394m> aVar) {
        this.onDragStartListener = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraggablePhotoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
