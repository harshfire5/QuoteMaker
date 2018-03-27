package com.example.harsh.quotemaker;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.text.TextWatcher;

public class input extends Fragment{

    static EditText edit1;

    texti ctext;
    public interface texti{
        void changetext(String e1);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof texti)
            ctext = (texti)context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.quote_input, container, false);
        edit1 = (EditText) v.findViewById(R.id.editText);

        edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                meow(edit1);
            }
        });

        return v;
    }

    public void meow(EditText e1){
        ctext.changetext(e1.getText().toString());
    }
}