/*
 * Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.adapter.iface

import android.content.Context
import android.support.v4.text.BidiFormatter

import org.mariotaku.twidere.util.AsyncTwitterWrapper
import org.mariotaku.twidere.util.MediaLoaderWrapper
import org.mariotaku.twidere.util.UserColorNameManager
import org.mariotaku.twidere.view.ShapedImageView.ShapeStyle

/**
 * Created by mariotaku on 15/1/3.
 */
interface IContentCardAdapter : ILoadMoreSupportAdapter {

    val context: Context

    val userColorNameManager: UserColorNameManager

    fun getItemCount(): Int

    @ShapeStyle
    val profileImageStyle: Int

    val profileImageEnabled: Boolean

    val textSize: Float

    val twitterWrapper: AsyncTwitterWrapper

    val mediaLoader: MediaLoaderWrapper

    val bidiFormatter: BidiFormatter

    val isShowAbsoluteTime: Boolean
}
