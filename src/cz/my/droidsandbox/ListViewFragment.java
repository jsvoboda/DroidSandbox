package cz.my.droidsandbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewFragment extends Fragment{
	
	String[] mockupData = {"snooze", "inkling", "notch", "albion", "clench"}; 
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
		
		
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_view, container, false);
    }
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), 
				R.layout.listview_item, mockupData);
		
		ListView listView = (ListView) getView().findViewById(R.id.listview);
		listView.setAdapter(adapter);
		
		
		listView.setOnItemClickListener(new OnItemClickListener() {
			  @Override
			  public void onItemClick(AdapterView<?> parent, View view,
			    int position, long id) {
			    Toast.makeText(
			      getActivity().getApplicationContext(), "Click ListItem Number " + position, Toast.LENGTH_LONG)
			      .show();
			  }
			}); 
	}
	
//	public void displayMessageClick(View view){
//		((DisplayMessageActivity) getActivity()).switchFragments();
//	}
}
