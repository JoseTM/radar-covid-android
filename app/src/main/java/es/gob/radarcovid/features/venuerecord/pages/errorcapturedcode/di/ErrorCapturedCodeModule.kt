/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.di

import dagger.Module
import dagger.Provides
import es.gob.radarcovid.common.di.scope.PerFragment
import es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.presenter.ErrorCapturedCodePresenterImpl
import es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.protocols.ErrorCapturedCodePresenter
import es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.protocols.ErrorCapturedCodeView
import es.gob.radarcovid.features.venuerecord.pages.errorcapturedcode.view.ErrorCapturedCodeFragment

@Module
class ErrorCapturedCodeModule {

    @Provides
    fun providesView(fragment: ErrorCapturedCodeFragment): ErrorCapturedCodeView = fragment

    @Provides
    @PerFragment
    fun providesPresenter(presenter: ErrorCapturedCodePresenterImpl): ErrorCapturedCodePresenter = presenter
}