package com.example.android.politicalpreparedness.databinding;
import com.example.android.politicalpreparedness.R;
import com.example.android.politicalpreparedness.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRepresentativeBindingImpl extends FragmentRepresentativeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_title, 1);
        sViewsWithIds.put(R.id.address_line_1, 2);
        sViewsWithIds.put(R.id.address_line_2, 3);
        sViewsWithIds.put(R.id.city, 4);
        sViewsWithIds.put(R.id.state, 5);
        sViewsWithIds.put(R.id.zip, 6);
        sViewsWithIds.put(R.id.button_search, 7);
        sViewsWithIds.put(R.id.button_location, 8);
        sViewsWithIds.put(R.id.representative_title, 9);
        sViewsWithIds.put(R.id.list_placeholder, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.motion.widget.MotionLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRepresentativeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentRepresentativeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Spinner) bindings[5]
            , (android.widget.EditText) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}