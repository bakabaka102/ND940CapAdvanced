package com.example.android.politicalpreparedness;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.android.politicalpreparedness.databinding.FragmentElectionBindingImpl;
import com.example.android.politicalpreparedness.databinding.FragmentLaunchBindingImpl;
import com.example.android.politicalpreparedness.databinding.FragmentRepresentativeBindingImpl;
import com.example.android.politicalpreparedness.databinding.FragmentVoterInfoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTELECTION = 1;

  private static final int LAYOUT_FRAGMENTLAUNCH = 2;

  private static final int LAYOUT_FRAGMENTREPRESENTATIVE = 3;

  private static final int LAYOUT_FRAGMENTVOTERINFO = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.politicalpreparedness.R.layout.fragment_election, LAYOUT_FRAGMENTELECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.politicalpreparedness.R.layout.fragment_launch, LAYOUT_FRAGMENTLAUNCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.politicalpreparedness.R.layout.fragment_representative, LAYOUT_FRAGMENTREPRESENTATIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.politicalpreparedness.R.layout.fragment_voter_info, LAYOUT_FRAGMENTVOTERINFO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTELECTION: {
          if ("layout/fragment_election_0".equals(tag)) {
            return new FragmentElectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_election is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLAUNCH: {
          if ("layout/fragment_launch_0".equals(tag)) {
            return new FragmentLaunchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_launch is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREPRESENTATIVE: {
          if ("layout/fragment_representative_0".equals(tag)) {
            return new FragmentRepresentativeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_representative is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVOTERINFO: {
          if ("layout/fragment_voter_info_0".equals(tag)) {
            return new FragmentVoterInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_voter_info is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_election_0", com.example.android.politicalpreparedness.R.layout.fragment_election);
      sKeys.put("layout/fragment_launch_0", com.example.android.politicalpreparedness.R.layout.fragment_launch);
      sKeys.put("layout/fragment_representative_0", com.example.android.politicalpreparedness.R.layout.fragment_representative);
      sKeys.put("layout/fragment_voter_info_0", com.example.android.politicalpreparedness.R.layout.fragment_voter_info);
    }
  }
}
