package pace.cs3892018team5.dev.chinesefortuneaide;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";




    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Tab3()  {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab3.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab3 newInstance(String param1, String param2)  {
        Tab3 fragment = new Tab3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab3, container, false);


        ListView wordList = view.findViewById(R.id.list_word);

        ArrayList<word> wordArrayList = new ArrayList<>();


        wordArrayList.add(new word("CHS:走",
                " ENG:walk"));
        wordArrayList.add(new word("CHS:跑" ,
                " ENG:run"));
        wordArrayList.add(new word("CHS:跳" ,
                " ENG:jump"));
        wordArrayList.add(new word("CHS:看" ,
                " ENG:look"));
        wordArrayList.add(new word("CHS:读" ,
                " ENG:read"));
        wordArrayList.add(new word("CHS:想" ,
                " ENG:think"));
        wordArrayList.add(new word("CHS:打" ,
                " ENG:hit"));
        wordArrayList.add(new word("CHS:笑" ,
                " ENG:laugh"));
        wordArrayList.add(new word("CHS:我" ,
                " ENG:I"));
        wordArrayList.add(new word("CHS:你" ,
                " ENG:you"));
        wordArrayList.add(new word("CHS:他" ,
                " ENG:he"));
        wordArrayList.add(new word("CHS:她" ,
                " ENG:she"));
        wordArrayList.add(new word("CHS:我的" ,
                " ENG:my"));
        wordArrayList.add(new word("CHS:你的" ,
                " ENG:your"));
        wordArrayList.add(new word("CHS:他的" ,
                " ENG:his"));
        wordArrayList.add(new word("CHS:她的" ,
                " ENG:her"));
        wordArrayList.add(new word("CHS:我们" ,
                " ENG:we"));
        wordArrayList.add(new word("CHS:你们" ,
                " ENG:you"));
        wordArrayList.add(new word("CHS:他们" ,
                " ENG:they"));
        wordArrayList.add(new word("CHS:它" ,
                " ENG:it"));
        wordArrayList.add(new word("CHS:它的" ,
                " ENG:its"));
        wordArrayList.add(new word("CHS:说" ,
                " ENG:say"));
        wordArrayList.add(new word("CHS:谁" ,
                " ENG:who"));
        wordArrayList.add(new word("CHS:什么" ,
                " ENG:what"));
        wordArrayList.add(new word("CHS:做" ,
                " ENG:make"));
        wordArrayList.add(new word("CHS:什么时候" ,
                " ENG:when"));
        wordArrayList.add(new word("CHS:能/可以" ,
                " ENG:can"));
        wordArrayList.add(new word("CHS:如果" ,
                " ENG:if"));
        wordArrayList.add(new word("CHS:其他" ,
                " ENG:other"));
        wordArrayList.add(new word("CHS:男人" ,
                " ENG:man"));
        wordArrayList.add(new word("CHS:女人" ,
                " ENG:woman"));
        wordArrayList.add(new word("CHS:去" ,
                " ENG:go"));
        wordArrayList.add(new word("CHS:年" ,
                " ENG:year"));
        wordArrayList.add(new word("CHS:知道" ,
                " ENG:know"));
        wordArrayList.add(new word("CHS:请" ,
                " ENG:please"));
        wordArrayList.add(new word("CHS:收到" ,
                " ENG:get"));
        wordArrayList.add(new word("CHS:工作" ,
                " ENG:work"));
        wordArrayList.add(new word("CHS:使用" ,
                " ENG:use"));
        wordArrayList.add(new word("CHS:喜欢" ,
                " ENG:like"));
        wordArrayList.add(new word("CHS:肉" ,
                " ENG:meat"));



        WordListAdapter  adapter = new WordListAdapter(getActivity().getApplicationContext(),R.layout.adapter_word, wordArrayList);
        wordList.setAdapter(adapter);


        // Inflate the layout for this fragment
        return view;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
