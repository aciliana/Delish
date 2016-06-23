
package com.alicia.delishdemo102;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyFragment extends Fragment {
	
	public static Fragment newInstance(Welcome context, int pos,
			float scale)
	{
		Bundle b = new Bundle();
		b.putInt("pos", pos);
		b.putFloat("scale", scale);
		return Fragment.instantiate(context, MyFragment.class.getName(), b);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (container == null) {
			return null;
		}
		
		LinearLayout l = (LinearLayout) 
				inflater.inflate(R.layout.mf, container, false);
		Button cont = (Button) l.findViewById(R.id.content);
		int pos = this.getArguments().getInt("pos");
		TextView tv = (TextView) l.findViewById(R.id.text);
		if (pos == 0){
			tv.setText("Lunch Time Bistro");
			cont.setBackgroundResource(R.drawable.rest1);
		}else if(pos ==1){
			tv.setText("Quick China");
			cont.setBackgroundResource(R.drawable.rest2);
		}else if(pos==2){
			tv.setText("Fork, Knife and Glass Dinner Club");
			cont.setBackgroundResource(R.drawable.rest3);
		}else if(pos==3){
			tv.setText("Gondola Restaurant");
			cont.setBackgroundResource(R.drawable.rest4);
		}else{
			tv.setText("The dining room");
			cont.setBackgroundResource(R.drawable.rest5);
		}
		MyLinearLayout root = (MyLinearLayout) l.findViewById(R.id.root);
		float scale = this.getArguments().getFloat("scale");
		root.setScaleBoth(scale);
		
		return l;
	}
}
