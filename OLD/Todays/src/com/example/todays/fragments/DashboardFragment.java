package com.example.todays.fragments;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.todays.ArticleActivity;
import com.example.todays.R;
import com.example.todays.adapter.DashboardAdapter;
import com.example.todays.adapter.News;

@SuppressLint("InflateParams")
public class DashboardFragment extends ListFragment {

	View headerView = null;

	public DashboardFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		headerView = inflater.inflate(R.layout.header_layout, null);
		return super.onCreateView(inflater, container, savedInstanceState);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	
		ArrayList<News> items = News.populateItems();
		DashboardAdapter adapter = new DashboardAdapter(getActivity(), items);
		if (headerView != null)
			this.getListView().addHeaderView(headerView);

		setListAdapter(adapter);
		super.onActivityCreated(savedInstanceState);
	}

	// @Override
	// public void onStart() {
	// // TODO Auto-generated method stub
	// super.onStart();
	// ArrayList<News> items = News.populateItems();
	// DashboardAdapter adapter = new DashboardAdapter(getActivity(), items);
	// if (DashboardFragment.counter == 0) {
	// this.getListView().addHeaderView(headerView);
	// }
	// setListAdapter(adapter);
	//
	// }

	// @Override
	// public void onListItemClick(ListView l, View v, int position, long id) {
	// // TODO Auto-generated method stub
	// super.onListItemClick(l, v, position, id);
	// Fragment fragment = new ArticleFragment();
	// FragmentTransaction transaction = getFragmentManager()
	// .beginTransaction();
	// // fragmentManager.popBackStack();
	// // fragmentManager.beginTransaction()
	// // .replace(R.id.frame_container, fragment).commit();
	// transaction.replace(R.id.frame_container, fragment);
	// transaction.addToBackStack(null);
	// transaction.commit();
	// }

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
//		
//		 Fragment fragment = new ArticleFragment();
//		 // FragmentManager fragmentManager = getFragmentManager();
//		 FragmentTransaction transaction = getFragmentManager()
//		 .beginTransaction();
//		 // fragmentManager.popBackStack();
//		 // fragmentManager.beginTransaction()
//		 // .replace(R.id.frame_container, fragment).commit();
//		 transaction.replace(R.id.frame_container, fragment);
//		 transaction.addToBackStack(null);
//		 transaction.commit();
		Intent articleintent = new Intent(getActivity(), ArticleActivity.class);
		startActivity(articleintent);
	}

}
