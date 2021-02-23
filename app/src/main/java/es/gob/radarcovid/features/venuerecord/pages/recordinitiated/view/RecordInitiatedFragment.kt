/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.pages.recordinitiated.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.gob.radarcovid.R
import es.gob.radarcovid.common.base.BaseFragment
import es.gob.radarcovid.features.venuerecord.pages.recordinitiated.protocols.RecordInitiatedPresenter
import es.gob.radarcovid.features.venuerecord.pages.recordinitiated.protocols.RecordInitiatedView
import es.gob.radarcovid.features.venuerecord.view.VenueRecordPageCallback
import javax.inject.Inject

class RecordInitiatedFragment : BaseFragment(), RecordInitiatedView {

    companion object {

        fun newInstance() = RecordInitiatedFragment()

    }

    @Inject
    lateinit var presenter: RecordInitiatedPresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_record_initiated, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        //buttonContinue.setOnClickListener { presenter.onContinueButtonClick() }
    }

    override fun performContinueButtonClick() {
        (activity as? VenueRecordPageCallback)?.onContinueButtonClick(0)
    }

    override fun finish() {
        activity?.finish()
    }
}