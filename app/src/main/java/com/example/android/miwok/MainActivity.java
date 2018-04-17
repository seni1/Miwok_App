/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.numbers);

        //Set the click listener on the "numbers" View
        numbers.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick (View view) {

                //Create a new intent to open the {@link NumbersActivity
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);

                //Start the new activity
                startActivity(numbersIntent);

            }
        });

        //Find the View that shows the Family category
        TextView family = findViewById(R.id.family);

        //Set the click listener on the "family" View
        family.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link FamilyMebersActivity
                Intent familyIntent = new Intent(MainActivity.this,FamilyMebersActivity.class);

                //Start the new activity
                startActivity(familyIntent);
            }
        });

        //Find the View that shows Colors category
        TextView colors = findViewById(R.id.colors);

        //Set the click listener on the "color" View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link ColorsActivity
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);

                //Start the new activity
                startActivity(colorsIntent);
            }
        });

        //Find the View that shows Phrases category
        TextView phrases = findViewById(R.id.phrases);

        //Set the click listener on the "phrases" View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link PhrasesActivity
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }



    }
















