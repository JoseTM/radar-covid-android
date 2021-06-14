/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.view

import es.gob.radarcovid.features.venuerecord.pages.checkout.presenter.VenueTimeOut

interface VenueRecordPageCallback {

    fun onContinueButtonClick(pageIndex: Int)

    fun onCancelButtonClick()

    fun onBackButtonClick()

    fun setVenueTimeOut(venueTimeOut: VenueTimeOut)

}