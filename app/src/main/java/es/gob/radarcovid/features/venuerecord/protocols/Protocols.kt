/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.protocols

interface VenueRecordView {

    fun startQRScan()

    fun showFragment(position: Int)

    fun onBackButtonClick()

    fun exit()

}

interface VenueRecordPresenter {

    fun viewReady()

    fun onContinueButtonClick(pageIndex: Int)

    fun onOkScan(data: String)

    fun onErrorScan()

    fun cancelRecord()

    fun onBackPressed(pageIndex: Int)
}

interface VenueRecordRouter {

    //fun openQRCodeScan()
}