package com.etsy.android.uikit.view.draggable;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.view.draggable.C11943b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p462ug.C13532h;
import p753kq.C19846a;

public final class DraggableViewDelegate implements View.OnTouchListener, C13532h {
    public static final int $stable = 8;
    private final DraggableViewAttacher attacher;
    /* access modifiers changed from: private */
    public final Context context;
    private final C19285c eventHandler$delegate = C19350d.m32677b(new DraggableViewDelegate$eventHandler$2(this));
    private C19846a<C19394m> onDragEndListener;
    private C19846a<C19394m> onDragStartListener;
    /* access modifiers changed from: private */
    public C11949d swipeListener;
    /* access modifiers changed from: private */
    public final View target;

    /* renamed from: com.etsy.android.uikit.view.draggable.DraggableViewDelegate$a */
    public static final class C11940a implements C11949d {

        /* renamed from: a */
        public final /* synthetic */ C19846a<C19394m> f26542a;

        public C11940a(C19846a<C19394m> aVar) {
            this.f26542a = aVar;
        }

        /* renamed from: a */
        public final void mo38680a() {
            this.f26542a.invoke();
        }
    }

    public DraggableViewDelegate(View view) {
        C19383o.m32797g(view, "target");
        this.target = view;
        Context context2 = view.getContext();
        this.context = context2;
        DraggableViewAttacher draggableViewAttacher = new DraggableViewAttacher(view);
        this.attacher = draggableViewAttacher;
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        checkContext(context2);
        view.setOnTouchListener(this);
        draggableViewAttacher.setOnViewDragListener(this);
    }

    private final void checkContext(Context context2) {
        if (!(context2 instanceof Activity)) {
            throw new IllegalArgumentException("DraggablePhotoView must be used within Activity context");
        }
    }

    private final DragEventHandler getEventHandler() {
        return (DragEventHandler) this.eventHandler$delegate.getValue();
    }

    public final void cleanup() {
        DragEventHandler eventHandler = getEventHandler();
        ImageView imageView = eventHandler.f26510g;
        if (imageView != null) {
            eventHandler.f26504a.removeView(imageView);
        }
    }

    public final DraggableViewAttacher getAttacher() {
        return this.attacher;
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
        getEventHandler().mo38662a(f, f2);
        C11943b bVar2 = getEventHandler().f26508e;
        if ((bVar2 instanceof C11943b.C11946c) && !C19383o.m32792b(bVar2, bVar) && (aVar = this.onDragStartListener) != null) {
            aVar.invoke();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
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
        return this.attacher.onTouch(view, motionEvent);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        C19383o.m32797g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.attacher.setOnClickListener(onClickListener);
    }

    public final void setOnDragEndListener(C19846a<C19394m> aVar) {
        this.onDragEndListener = aVar;
    }

    public final void setOnDragStartListener(C19846a<C19394m> aVar) {
        this.onDragStartListener = aVar;
    }

    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C19383o.m32797g(onLongClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.attacher.setOnLongClickListener(onLongClickListener);
    }

    public final void setSwipeDownListener(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.swipeListener = new C11940a(aVar);
    }
}
