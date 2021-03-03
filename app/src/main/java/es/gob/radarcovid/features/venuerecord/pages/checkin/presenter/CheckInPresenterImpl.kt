/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.pages.checkin.presenter

import es.gob.radarcovid.datamanager.usecase.VenueRecordUseCase
import es.gob.radarcovid.features.venuerecord.pages.checkin.protocols.CheckInPresenter
import es.gob.radarcovid.features.venuerecord.pages.checkin.protocols.CheckInView
import es.gob.radarcovid.models.domain.VenueRecord
import java.util.*
import javax.inject.Inject

class CheckInPresenterImpl  @Inject constructor(
    private val view: CheckInView,
    private val venueRecordUseCase: VenueRecordUseCase
) : CheckInPresenter {

    private var currentVenue: VenueRecord? = null

    override fun viewReady() {
        currentVenue = venueRecordUseCase.getCurrentVenue()
        view.setVenueData(currentVenue)
    }

    override fun getDateIn(): Date {

        return currentVenue?.dateIn ?: Date()
    }

    override fun onContinueButtonClick() {
        view.performContinueButtonClick()
    }

    override fun onCancelButtonClick() {
        view.performCancelButtonClick()
    }

    override fun onExitButtonClick() {
        view.performExitButtonClick()
    }
}