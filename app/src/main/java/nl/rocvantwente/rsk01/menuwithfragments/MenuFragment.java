package nl.rocvantwente.rsk01.menuwithfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    private View.OnClickListener ButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Button b = (Button)view;
            FragmentManager fm = getFragmentManager();
            if(b.getId() == R.id.redButton){
                fm.beginTransaction().replace(R.id.fragmentContent , new RedFragment()).commit();
            }
            if(b.getId() == R.id.blueButton){
                fm.beginTransaction().replace(R.id.fragmentContent , new BlueFragment()).commit();
            }
            if(b.getId() == R.id.purpleButton){
                fm.beginTransaction().replace(R.id.fragmentContent , new PurpleFragment()).commit();
            }
        }
    };

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu, container, false);
        Button bRed = (Button)v.findViewById(R.id.redButton);
        Button bBlue = (Button)v.findViewById(R.id.blueButton);
        Button bPurple = (Button)v.findViewById(R.id.purpleButton);
        bRed.setOnClickListener(ButtonClickListener);
        bBlue.setOnClickListener(ButtonClickListener);
        bPurple.setOnClickListener(ButtonClickListener);
        return v;
    }

}
