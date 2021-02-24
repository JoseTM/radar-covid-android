/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.pages.checkout.presenter

import es.gob.radarcovid.features.venuerecord.pages.checkout.protocols.CheckOutPresenter
import es.gob.radarcovid.features.venuerecord.pages.checkout.protocols.CheckOutView
import javax.inject.Inject

class CheckOutPresenterImpl  @Inject constructor(
    private val view: CheckOutView
) : CheckOutPresenter {

    override fun onContinueButtonClick() {
        view.performContinueButtonClick()
    }

    override fun onCancelButtonClick() {
        view.performCancelButtonClick()
    }
}