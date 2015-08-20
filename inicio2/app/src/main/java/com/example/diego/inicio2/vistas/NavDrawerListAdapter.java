package com.example.diego.inicio2.vistas;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diego.inicio2.R;

import java.util.ArrayList;

public class NavDrawerListAdapter extends BaseAdapter {
	
	private Context context;
	private ArrayList<NavDrawerItem> navDrawerItems;
	
	public NavDrawerListAdapter(Context context, ArrayList<NavDrawerItem> navDrawerItems){
		this.context = context;
		this.navDrawerItems = navDrawerItems;
	}

	@Override
	public int getCount() {
		return navDrawerItems.size();
	}

	@Override
	public Object getItem(int position) {		
		return navDrawerItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Log.i("diegoooooooooo", "position: " + position);
		if(position == 0){
			//menu del perfil
			if (convertView == null && position == 0) {
				LayoutInflater mInflater = (LayoutInflater)
						context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
				convertView = mInflater.inflate(R.layout.drawer_list_perfil, null);
			}
			Log.i("diegoooooooooo perfil", "position: " + position);
			ImageView imgIcon2 = (ImageView) convertView.findViewById(R.id.icon);
			TextView txtTitle2 = (TextView) convertView.findViewById(R.id.nombre);
			TextView txtCount2 = (TextView) convertView.findViewById(R.id.mail);

			imgIcon2.setImageResource(navDrawerItems.get(position).getIcon());
			txtTitle2.setText("Diego Vilette");
			txtCount2.setText("diegov.0417@gmail.com");
			// displaying count
			// check whether it set visible or not

		}else{
			if (convertView == null) {
				LayoutInflater mInflater = (LayoutInflater)
						context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
				convertView = mInflater.inflate(R.layout.drawer_list_item, null);
			}
			Log.i("diegoooooooooo icons", "position: " + position);
			ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
			TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
			TextView txtCount = (TextView) convertView.findViewById(R.id.counter);

			imgIcon.setImageResource(navDrawerItems.get(position).getIcon());
			txtTitle.setText(navDrawerItems.get(position).getTitle());

			// displaying count
			// check whether it set visible or not
			if(navDrawerItems.get(position).getCounterVisibility()){
				txtCount.setText(navDrawerItems.get(position).getCount());
			}else{
				// hide the counter view
				txtCount.setVisibility(View.GONE);
			}
		}



        
        return convertView;
	}

}
