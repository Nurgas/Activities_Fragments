package kg.nurga.activities_fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class MainFragment extends Fragment {

    TextView textView;
    Button addButton;

    public MainFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        textView = view.findViewById(R.id.text_view);
        addButton = view.findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity =(MainActivity)getActivity();
                mainActivity.onOpenActivity();
            }
        });
        return view;
    }

    void setText(String text){
        textView.setText(text);
    }

}
