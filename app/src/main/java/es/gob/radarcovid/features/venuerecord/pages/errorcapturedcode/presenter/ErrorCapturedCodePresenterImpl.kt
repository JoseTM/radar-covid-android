/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.presenter

import es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.protocols.ErrorCapturedCodePresenter
import es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.protocols.ErrorCapturedCodeView
import javax.inject.Inject

class ErrorCapturedCodePresenterImpl @Inject constructor(
    private val view: ErrorCapturedCodeView
) : ErrorCapturedCodePresenter {

    override fun onContinueButtonClick() {
        view.performContinueButtonClick()
    }

    override fun onCancelButtonClick() {
        view.performCancelButtonClick()
    }
}