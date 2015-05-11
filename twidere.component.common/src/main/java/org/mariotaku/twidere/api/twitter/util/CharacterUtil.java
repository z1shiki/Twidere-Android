/*
 *                 Twidere - Twitter client for Android
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

package org.mariotaku.twidere.api.twitter.util;

/**
 * @author Yusuke Yamamoto - yusuke at mac.com
 * @since Twitter4J 2.1.2
 */
public final class CharacterUtil {
	private CharacterUtil() {
		throw new AssertionError();
	}

	/**
	 * Counts the length of the tweet
	 * 
	 * @param text tweet to be counted
	 * @return the length of the tweet
	 */
	public static int count(final String text) {
		return text.length();
	}

	/**
	 * Returns true if the length of the string is exceeding length limitation
	 * 
	 * @param text String to be examined
	 * @return if the length of the string is exceeding length limitation
	 */
	public static boolean isExceedingLengthLimitation(final String text) {
		return count(text) > 140;
	}
}