package cz.my.droidsandbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DisplayMessageFragment extends Fragment{
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.display_message_view, container, false);
    }
	
//	public void displayMessageClick(View view){
//		((DisplayMessageActivity) getActivity()).switchFragments();
//	}
}
