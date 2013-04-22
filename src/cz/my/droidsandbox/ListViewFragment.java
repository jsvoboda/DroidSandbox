package cz.my.droidsandbox;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<SelectableItemModel> items = getModel();
	
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
		
		ArrayAdapter<SelectableItemModel> adapter = new InteractiveArrayAdapter(
				this.getActivity(),
				items);
		ListView listView = (ListView) getView().findViewById(R.id.listview);
		listView.setAdapter(adapter);
		
		
		
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), 
//				R.layout.listview_item, R.id.label, mockupData);
//		
//		ListView listView = (ListView) getView().findViewById(R.id.listview);
//		listView.setAdapter(adapter);
//		listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		
//		listView.setOnItemClickListener(new OnItemClickListener() {
//			  @Override
//			  public void onItemClick(AdapterView<?> parent, View view,
//			    int position, long id) {
//			    Toast.makeText(
//			      getActivity().getApplicationContext(), "Clicked ListItem Number " + position, Toast.LENGTH_LONG)
//			      .show();
//			  }
//			}); 
	}
	
	
	
	
	
	private List<SelectableItemModel> getModel() {
	    List<SelectableItemModel> list = new ArrayList<SelectableItemModel>();
	    list.add(get("Linux"));
	    list.add(get("Windows7"));
	    list.add(get("Suse"));
	    list.add(get("Eclipse"));
	    list.add(get("Ubuntu"));
	    list.add(get("Solaris"));
	    list.add(get("Android"));
	    list.add(get("iPhone"));
	    // Initially select one of the items
	    list.get(1).setSelected(true);
	    return list;
	  }

	  private SelectableItemModel get(String s) {
	    return new SelectableItemModel(s);
	  }
	
	  
//	public void displayMessageClick(View view){
//		((DisplayMessageActivity) getActivity()).switchFragments();
//	}
}
