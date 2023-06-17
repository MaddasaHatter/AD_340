/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.affirmations

/**
 * [Datasource] generates a list of [affirmation]
 */
class Datasource {
    fun loadAffirmations(): List<affirmations> {
        return listOf<affirmations>(
            affirmations(R.string.affirmation1, R.drawable.ahhh_cat),
            affirmations(R.string.affirmation2, R.drawable.all_cats),
            affirmations(R.string.affirmation3, R.drawable.baby_cat),
            affirmations(R.string.affirmation4, R.drawable.boba_cat),
            affirmations(R.string.affirmation5, R.drawable.cat_warhol),
            affirmations(R.string.affirmation6, R.drawable.cute_cat),
            affirmations(R.string.affirmation7, R.drawable.cute_pair),
            affirmations(R.string.affirmation8, R.drawable.nom_cat),
        )
    }
}