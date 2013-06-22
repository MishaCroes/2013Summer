package me.xiangchen.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;

public class xacMapView extends SupportMapFragment {
	
	private LatLng coord;
	
	public static xacMapView newInstance(LatLng coord){
		xacMapView mapView = new xacMapView();
		mapView.coord = coord;
	    return mapView;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
	    View v = super.onCreateView(inflater, viewGroup, bundle);
	    initMap();
	    return v;
	}
	
	private void initMap(){
	    UiSettings settings = getMap().getUiSettings();
	    settings.setAllGesturesEnabled(false);
	    settings.setMyLocationButtonEnabled(false);

	    getMap().moveCamera(CameraUpdateFactory.newLatLngZoom(coord,16));
//	    getMap().addMarker(new MarkerOptions().position(mPosFija).icon(BitmapDescriptorFactory.fromResource(R.drawable.marker)));
	}
}
