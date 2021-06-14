/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.datamanager.usecase

import es.gob.radarcovid.datamanager.repository.PreferencesRepository
import javax.inject.Inject

class GetReminderTimeUseCase @Inject constructor(private val preferencesRepository: PreferencesRepository) {

    fun getReminderTime(): Int = preferencesRepository.getNotificationReminder()

}
