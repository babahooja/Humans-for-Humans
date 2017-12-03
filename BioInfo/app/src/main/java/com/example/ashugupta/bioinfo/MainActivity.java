package com.example.ashugupta.bioinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef, node1, node2;
    Button process;
    EditText text;
    private static final String TAG = "MainActivity";
    String str;
    String firstPart = "";
    String secondPart = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");
        node1 = database.getReference("Node 1");
        node2 = database.getReference("Node 2");
        process = (Button)findViewById(R.id.process);
        text = (EditText)findViewById(R.id.textView);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.d(TAG, "onDataChange: " + "data changed");
                str = dataSnapshot.getValue().toString();
                Log.d(TAG, "onDataChange: " + str);
                //text.setText(str);
                myRef.setValue(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        node1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if(str!=null)
                for (int j = 0; j < str.length(); j++) {
                    if ( j < str.length() /2) {
                        firstPart += str.charAt(j);
                    }else
                        secondPart += str.charAt(j);
                }

                Log.d(TAG, "onDataChange: " + "insies node 1");



                if(dataSnapshot.getValue()== "false"){
                    text.setText(firstPart);
                    node1.setValue("true");

                }
                else{
                    text.setText(secondPart);
                    node2.setValue("true");
                }


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                s = s.replace('0', '2').replace('1', '0').replace('2', '1');
                text.setText(s);
                myRef.setValue(s);
            }
        });

    }



}
