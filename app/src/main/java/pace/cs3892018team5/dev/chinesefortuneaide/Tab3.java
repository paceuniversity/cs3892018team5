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


        wordArrayList.add(new word("走",
                " walk"));
        wordArrayList.add(new word("跑" ,
                " run"));
        wordArrayList.add(new word("跳" ,
                " jump"));
        wordArrayList.add(new word("看" ,
                " look"));
        wordArrayList.add(new word("读" ,
                " read"));
        wordArrayList.add(new word("想" ,
                " think"));
        wordArrayList.add(new word("打" ,
                " hit"));
        wordArrayList.add(new word("笑" ,
                " laugh"));
        wordArrayList.add(new word("我" ,
                " I"));
        wordArrayList.add(new word("你" ,
                " you"));
        wordArrayList.add(new word("他" ,
                " he"));
        wordArrayList.add(new word("她" ,
                " she"));
        wordArrayList.add(new word("我的" ,
                " my"));
        wordArrayList.add(new word("你的" ,
                " your"));
        wordArrayList.add(new word("他的" ,
                " his"));
        wordArrayList.add(new word("她的" ,
                " her"));
        wordArrayList.add(new word("我们" ,
                " we"));
        wordArrayList.add(new word("你们" ,
                " you"));
        wordArrayList.add(new word("他们" ,
                " they"));
        wordArrayList.add(new word("它" ,
                " it"));
        wordArrayList.add(new word("它的" ,
                " its"));
        wordArrayList.add(new word("说" ,
                " say"));
        wordArrayList.add(new word("谁" ,
                " who"));
        wordArrayList.add(new word("什么" ,
                " what"));
        wordArrayList.add(new word("做" ,
                " make"));
        wordArrayList.add(new word("什么时候" ,
                " when"));
        wordArrayList.add(new word("能/可以" ,
                " can"));
        wordArrayList.add(new word("如果" ,
                " if"));
        wordArrayList.add(new word("其他" ,
                " other"));
        wordArrayList.add(new word("男人" ,
                " man"));
        wordArrayList.add(new word("女人" ,
                " woman"));
        wordArrayList.add(new word("去" ,
                " go"));
        wordArrayList.add(new word("年" ,
                " year"));
        wordArrayList.add(new word("知道" ,
                " know"));
        wordArrayList.add(new word("请" ,
                " please"));
        wordArrayList.add(new word("收到" ,
                " get"));
        wordArrayList.add(new word("工作" ,
                " work"));
        wordArrayList.add(new word("使用" ,
                " use"));
        wordArrayList.add(new word("喜欢" ,
                " like"));
        wordArrayList.add(new word("肉" ,
                " meat"));



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
