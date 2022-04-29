package com.jaynesh.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.jaynesh.implicitintent.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

         private FragmentFirstBinding binding;
     EditText url;
     Button button;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        button = view.findViewById(R.id.button);
        url = view.findViewById(R.id.URL);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  String urltext = url.getText().toString();
            // for Opeining broser :
//                Toast.makeText(getActivity(), urltext, Toast.LENGTH_SHORT).show();
//                Uri webpage = Uri.parse(urltext);
//                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//                if (intent.resolveActivity( getActivity().getPackageManager()) != null) {
//                    startActivity(intent);
//                }

            // For sending Email
                String addresses [] = {"jayneshmehta1@gmail.com","190303105245@paruluniversity.ac.in" };
                String subject = "Hello Brother";
                Toast.makeText(getActivity(), addresses[0]+" "+ addresses[1], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT,urltext);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }else{
                    Toast.makeText(getActivity(), "Activity is having Problem.. ", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}