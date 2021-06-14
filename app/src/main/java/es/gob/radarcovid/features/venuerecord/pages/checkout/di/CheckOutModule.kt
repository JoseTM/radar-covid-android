/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.pages.checkout.di

import dagger.Module
import dagger.Provides
import es.gob.radarcovid.common.di.scope.PerFragment
import es.gob.radarcovid.features.venuerecord.pages.checkout.presenter.CheckOutPresenterImpl
import es.gob.radarcovid.features.venuerecord.pages.checkout.protocols.CheckOutPresenter
import es.gob.radarcovid.features.venuerecord.pages.checkout.protocols.CheckOutView
import es.gob.radarcovid.features.venuerecord.pages.checkout.view.CheckOutFragment

@Module
class CheckOutModule {

    @Provides
    fun providesView(fragment: CheckOutFragment): CheckOutView = fragment

    @Provides
    @PerFragment
    fun providesPresenter(presenter: CheckOutPresenterImpl): CheckOutPresenter = presenter
}