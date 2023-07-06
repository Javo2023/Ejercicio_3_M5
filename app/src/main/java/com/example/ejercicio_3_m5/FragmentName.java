package com.example.ejercicio_3_m5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicio_3_m5.databinding.FragmentNameBinding;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentName#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentName extends Fragment {
    private FragmentNameBinding binding;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentName() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentName.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentName newInstance(String param1, String param2) {
        FragmentName fragment = new FragmentName();
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

    binding = FragmentNameBinding.inflate(getLayoutInflater(),container,false);

    binding.btnComenzar.setOnClickListener(view -> {
        String nombre = binding.editTextName.getText().toString();
        Bundle bundle =new Bundle();
        bundle.putString("nombre",nombre);
        Navigation.findNavController(getView()).navigate(R.id.action_fragmentName_to_fragmentTrivia,bundle);


    });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}