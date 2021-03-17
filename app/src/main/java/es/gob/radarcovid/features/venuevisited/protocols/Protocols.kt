/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuevisited.protocols

import es.gob.radarcovid.models.domain.VenueRecord
import es.gob.radarcovid.models.domain.VenueVisitedRecyclerItem

interface VenueVisitedView {
    fun setVenueList(venueItemList: List<VenueVisitedRecyclerItem>, numberHidden: Int, locale: String)
}

interface VenueVisitedPresenter {
    fun viewReady()

    fun getVenueList(showHidden: Boolean)

    fun changeVisibility(venue: VenueRecord, showHidden: Boolean)
}