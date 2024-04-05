package com.zhuinden.simplestack.navigator;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.zhuinden.simplestack.C17518a;
import com.zhuinden.simplestack.C17523b;
import com.zhuinden.simplestack.C17525d;
import com.zhuinden.simplestack.C17529f;
import com.zhuinden.simplestack.C17530g;
import com.zhuinden.simplestack.C17532i;
import com.zhuinden.simplestack.C17533j;
import com.zhuinden.simplestack.C17541n;
import com.zhuinden.simplestack.C17546p;
import com.zhuinden.simplestack.KeyContextWrapper;
import com.zhuinden.statebundle.StateBundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p626mp.C18259a;

@TargetApi(11)
public final class BackstackHost extends Fragment {
    public C17518a backstack;
    public ViewGroup container;
    public C17525d.C17526a globalServiceFactory;
    public C17525d globalServices;
    public List<?> initialKeys = Collections.emptyList();
    public C17529f keyFilter;
    public C17530g keyParceler;
    public Bundle savedInstanceState;
    public C17541n scopedServices;
    public boolean shouldPersistContainerChild;
    public List<C17518a.C17521c> stateChangeCompletionListeners;
    public C17546p stateChanger;
    public C17518a.C17522d stateClearStrategy;

    public BackstackHost() {
        setRetainInstance(true);
    }

    public C17518a getBackstack() {
        return this.backstack;
    }

    public C17518a initialize(boolean z) {
        if (this.backstack == null) {
            C17518a aVar = new C17518a();
            this.backstack = aVar;
            C17529f fVar = this.keyFilter;
            C17532i iVar = aVar.f38326h;
            if (iVar != null) {
                throw new IllegalStateException("Custom key filter should be set before calling `setup()`");
            } else if (fVar != null) {
                aVar.f38323e = fVar;
                C17530g gVar = this.keyParceler;
                if (iVar != null) {
                    throw new IllegalStateException("Custom key parceler should be set before calling `setup()`");
                } else if (gVar != null) {
                    aVar.f38324f = gVar;
                    C17518a.C17522d dVar = this.stateClearStrategy;
                    if (iVar != null) {
                        throw new IllegalStateException("Custom state clear strategy should be set before calling `setup()`");
                    } else if (dVar != null) {
                        aVar.f38325g = dVar;
                        C17541n nVar = this.scopedServices;
                        if (nVar != null) {
                            if (!aVar.f38331m) {
                                aVar.f38328j.f38364j = nVar;
                            } else {
                                throw new IllegalStateException("Scope provider should be set before the initial state change!");
                            }
                        }
                        C17525d dVar2 = this.globalServices;
                        if (dVar2 != null) {
                            if (!aVar.f38331m) {
                                aVar.f38328j.f38363i = dVar2;
                            } else {
                                throw new IllegalStateException("Scope provider should be set before the initial state change!");
                            }
                        }
                        if (this.globalServiceFactory != null) {
                            if (!aVar.f38331m) {
                                aVar.f38328j.getClass();
                            } else {
                                throw new IllegalStateException("Scope provider should be set before the initial state change!");
                            }
                        }
                        C17532i iVar2 = new C17532i(this.initialKeys);
                        aVar.f38326h = iVar2;
                        C17518a.C17520b bVar = aVar.f38322d;
                        if (bVar != null) {
                            iVar2.mo68747a();
                            iVar2.f38349h.add(bVar);
                            for (C17518a.C17521c next : this.stateChangeCompletionListeners) {
                                C17518a aVar2 = this.backstack;
                                aVar2.mo68699d("A backstack must be set up before a state change completion listener is added to it.");
                                if (next != null) {
                                    C17532i iVar3 = aVar2.f38326h;
                                    iVar3.mo68747a();
                                    iVar3.f38349h.add(next);
                                } else {
                                    throw new IllegalArgumentException("StateChangeCompletionListener cannot be null!");
                                }
                            }
                            Bundle bundle = this.savedInstanceState;
                            if (bundle != null) {
                                this.backstack.mo37056b((StateBundle) bundle.getParcelable("NAVIGATOR_STATE_BUNDLE"));
                            }
                        } else {
                            throw new IllegalArgumentException("Null completion listener cannot be added!");
                        }
                    } else {
                        throw new IllegalArgumentException("The state clear strategy cannot be null!");
                    }
                } else {
                    throw new IllegalArgumentException("The key parceler cannot be null!");
                }
            } else {
                throw new IllegalArgumentException("The key filter cannot be null!");
            }
        }
        if (!z) {
            this.backstack.mo68705j(this.stateChanger);
        }
        return this.backstack;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.savedInstanceState = bundle;
    }

    public void onDestroy() {
        super.onDestroy();
        this.backstack.mo68702g();
    }

    public void onDestroyView() {
        this.backstack.mo68701f();
        this.stateChanger = null;
        this.container = null;
        super.onDestroyView();
    }

    public void onPause() {
        this.backstack.mo68700e();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C17518a aVar = this.backstack;
        aVar.mo68699d("You must call `setup()` before calling `reattachStateChanger()`.");
        C17532i iVar = aVar.f38326h;
        iVar.mo68747a();
        if (!(iVar.f38347f != null)) {
            aVar.f38330l = true;
            aVar.f38326h.mo68752f(aVar.f38321c, 1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        View childAt;
        super.onSaveInstanceState(bundle);
        if (this.shouldPersistContainerChild && (childAt = this.container.getChildAt(0)) != null) {
            C17518a backstack2 = ((BackstackHost) C18259a.m30804a(childAt.getContext()).getFragmentManager().findFragmentByTag("NAVIGATOR_BACKSTACK_HOST")).getBackstack();
            backstack2.mo68698c();
            Object key = KeyContextWrapper.getKey(childAt.getContext());
            if (key != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                childAt.saveHierarchyState(sparseArray);
                StateBundle a = childAt instanceof C17523b ? ((C17523b) childAt).mo37055a() : null;
                if (!backstack2.f38327i.containsKey(key)) {
                    HashMap hashMap = backstack2.f38327i;
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    StateBundle stateBundle = new StateBundle();
                    C17533j jVar = new C17533j();
                    jVar.f38350a = key;
                    jVar.f38351b = sparseArray2;
                    jVar.f38352c = stateBundle;
                    jVar.f38353d = null;
                    hashMap.put(key, jVar);
                }
                C17533j jVar2 = (C17533j) backstack2.f38327i.get(key);
                jVar2.f38351b = sparseArray;
                jVar2.f38353d = a;
            } else {
                throw new IllegalArgumentException("The view [" + childAt + "] contained no key in its context hierarchy. The view or its parent hierarchy should be inflated by a layout inflater from `stateChange.createContext(baseContext, key)`, or a KeyContextWrapper.");
            }
        }
        bundle.putParcelable("NAVIGATOR_STATE_BUNDLE", this.backstack.mo37055a());
    }
}
