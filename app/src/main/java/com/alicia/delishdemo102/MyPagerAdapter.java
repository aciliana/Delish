package com.alicia.delishdemo102;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class MyPagerAdapter extends FragmentPagerAdapter implements
		ViewPager.OnPageChangeListener {

	private MyLinearLayout cur = null;
	private MyLinearLayout next = null;
	private Welcome context;
	private FragmentManager fm;
	private float scale;

	public MyPagerAdapter(Welcome context, FragmentManager fm) {
		super(fm);
		this.fm = fm;
		this.context = context;
	}

	@Override
	public Fragment getItem(int position) 
	{
        // make the first pager bigger than others
        if (position == Welcome.FIRST_PAGE)
        	scale = Welcome.BIG_SCALE;
        else
        	scale = Welcome.SMALL_SCALE;
        
        position = position % Welcome.PAGES;
        return MyFragment.newInstance(context, position, scale);
	}

	@Override
	public int getCount()
	{		
		return Welcome.PAGES * Welcome.LOOPS;
	}

	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) 
	{	
		if (positionOffset >= 0f && positionOffset <= 1f)
		{
		        cur = getRootView(position);
        		cur.setScaleBoth(Welcome.BIG_SCALE - Welcome.DIFF_SCALE * positionOffset);

        		if (position < Welcome.PAGES-1) {
        			next = getRootView(position +1);
        			next.setScaleBoth(Welcome.SMALL_SCALE + Welcome.DIFF_SCALE * positionOffset);
        		}
		}
	}

	@Override
	public void onPageSelected(int position) {}
	
	@Override
	public void onPageScrollStateChanged(int state) {}
	
	private MyLinearLayout getRootView(int position)
	{
		return (MyLinearLayout) 
				fm.findFragmentByTag(this.getFragmentTag(position))
				.getView().findViewById(R.id.root);
	}
	
	private String getFragmentTag(int position)
	{
	    return "android:switcher:" + context.pager.getId() + ":" + position;
	}
}
