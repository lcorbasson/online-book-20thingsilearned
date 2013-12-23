package com.fi.twentythings;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;

/**
 * Copyright 2011 Google Inc. This program is free software; you can
 * redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 * 
 * @author jonathan.gray This java class is used to store Locale specific
 *         information - It is the top-level object in the object hierarchy: -
 *         Locale - Article -Page The Locale info may be edited in the CMS (see:
 *         cmseditlocale.php).
 */
@Entity
public class Locale {

	@Id	String id;
	@Ignore	String doNotPersist;
	String LOCALE_DISPLAY_NAME;
	String LOCALE_META_DESCRIPTION;
	String LOCALE_META_KEYWORDS;

	String LOCALE_META_AUTHOR;
	String LOCALE_FACEBOOK_MESSAGE;
	String LOCALE_FACEBOOK_MESSAGE_SINGLE;
	String LOCALE_TWITTER_MESSAGE;
	String LOCALE_TWITTER_MESSAGE_SINGLE;
	String LOCALE_BUZZ_MESSAGE;
	String LOCALE_BUZZ_MESSAGE_SINGLE;
	String LOCALE_SHARING_IMAGE;
	String LOCALE_TITLE;
	String LOCALE_NOT_SUPPORTED;
	String LOCALE_NOT_SUPPORTED_IE;
	String LOCALE_MENU_TOT;
	String LOCALE_MENU_FORWARD;
	String LOCALE_MENU_CREDITS;
	String LOCALE_SEARCH_PLACEHOLDER;
	String LOCALE_SEARCH_INVALID;
	String LOCALE_SEARCH_RESULTS_CHAPTERS;
	String LOCALE_SEARCH_RESULTS_PAGES;
	String LOCALE_FRONT_COVER_INTRO;
	String LOCALE_FRONT_COVER_CTA;
	String LOCALE_SHARER_LABEL1;
	String LOCALE_SHARER_LABEL2;
	String LOCALE_TOC_TITLE;
	String LOCALE_TOC_BACK;
	String LOCALE_OVERLAY_CLOSE;
	String LOCALE_OVERLAY_PRINT_TITLE;
	String LOCALE_OVERLAY_PRINT_DESCRIPTION;
	String LOCALE_OVERLAY_PDF_TITLE;
	String LOCALE_OVERLAY_PDF_DESCRIPTION;

	String LOCALE_OVERLAY_RESUME_TITLE;
	String LOCALE_OVERLAY_RESUME_DESCRIPTION;
	String LOCALE_OVERLAY_RESUME_YES;
	String LOCALE_OVERLAY_RESUME_NO;

	String LOCALE_FOOTER_CURATOR;
	String LOCALE_FOOTER_PRINT;
	String LOCALE_FOOTER_SHARE;
	String LOCALE_FOOTER_LIGHTS;
	String LOCALE_FOOTER_FULLSCREEN;

	String LOCALE_PREVIOUS_PAGE;
	String LOCALE_NEXT_PAGE;
	String LOCALE_SELECT_LANGUAGE;

	String LOCALE_TWENTY_THINGS_LABEL;
	String LOCALE_ILLUSTRATION_LABEL;
	String LOCALE_WRITERS_EDITORS_LABEL;
	String LOCALE_PROJECT_CURATOR_LABEL;
	String LOCALE_DESIGN_LABEL;
	String LOCALE_DEVELOPMENT_LABEL;
	String LOCALE_SPECIAL_THANKS_LABEL;
	String LOCALE_BUILT_IN_HTML5_LABEL;
	String LOCALE_SHARE_THIS_BOOK_LABEL;
	String LOCALE_SHARE_ON_LABEL;
	String LOCALE_PRINT_THING_LABEL;
	String LOCALE_PAGE_LABEL;
	String LOCALE_PAGES_LABEL;
	String LOCALE_ORDER;

	public Locale(String id, String LOCALE_DISPLAY_NAME,
			String LOCALE_META_DESCRIPTION, String LOCALE_META_KEYWORDS,
			String LOCALE_META_AUTHOR, String LOCALE_FACEBOOK_MESSAGE,
			String LOCALE_FACEBOOK_MESSAGE_SINGLE,
			String LOCALE_TWITTER_MESSAGE,
			String LOCALE_TWITTER_MESSAGE_SINGLE, String LOCALE_BUZZ_MESSAGE,
			String LOCALE_BUZZ_MESSAGE_SINGLE, String LOCALE_SHARING_IMAGE,
			String LOCALE_TITLE, String LOCALE_NOT_SUPPORTED,
			String LOCALE_NOT_SUPPORTED_IE, String LOCALE_MENU_TOT,
			String LOCALE_MENU_FORWARD, String LOCALE_MENU_CREDITS,
			String LOCALE_SEARCH_PLACEHOLDER, String LOCALE_SEARCH_INVALID,
			String LOCALE_SEARCH_RESULTS_CHAPTERS,
			String LOCALE_SEARCH_RESULTS_PAGES,
			String LOCALE_FRONT_COVER_INTRO, String LOCALE_FRONT_COVER_CTA,
			String LOCALE_SHARER_LABEL1, String LOCALE_SHARER_LABEL2,
			String LOCALE_TOC_TITLE, String LOCALE_TOC_BACK,
			String LOCALE_OVERLAY_CLOSE, String LOCALE_OVERLAY_PRINT_TITLE,
			String LOCALE_OVERLAY_PRINT_DESCRIPTION,
			String LOCALE_OVERLAY_PDF_TITLE,
			String LOCALE_OVERLAY_PDF_DESCRIPTION,
			String LOCALE_OVERLAY_RESUME_TITLE,
			String LOCALE_OVERLAY_RESUME_DESCRIPTION,
			String LOCALE_OVERLAY_RESUME_YES, String LOCALE_OVERLAY_RESUME_NO,
			String LOCALE_FOOTER_CURATOR, String LOCALE_FOOTER_PRINT,
			String LOCALE_FOOTER_SHARE, String LOCALE_FOOTER_LIGHTS,
			String LOCALE_FOOTER_FULLSCREEN, String LOCALE_PREVIOUS_PAGE,
			String LOCALE_NEXT_PAGE, String LOCALE_SELECT_LANGUAGE,
			String LOCALE_TWENTY_THINGS_LABEL,
			String LOCALE_ILLUSTRATION_LABEL,
			String LOCALE_WRITERS_EDITORS_LABEL,
			String LOCALE_PROJECT_CURATOR_LABEL, String LOCALE_DESIGN_LABEL,
			String LOCALE_DEVELOPMENT_LABEL,
			String LOCALE_SPECIAL_THANKS_LABEL,
			String LOCALE_BUILT_IN_HTML5_LABEL,
			String LOCALE_SHARE_THIS_BOOK_LABEL, String LOCALE_SHARE_ON_LABEL,
			String LOCALE_PRINT_THING_LABEL, String LOCALE_PAGE_LABEL,
			String LOCALE_PAGES_LABEL, String LOCALE_ORDER, String doNotPersist) {
		super();
		this.id = id;
		this.LOCALE_DISPLAY_NAME = LOCALE_DISPLAY_NAME;
		this.LOCALE_META_DESCRIPTION = LOCALE_META_DESCRIPTION;
		this.LOCALE_META_KEYWORDS = LOCALE_META_KEYWORDS;
		this.LOCALE_META_AUTHOR = LOCALE_META_AUTHOR;
		this.LOCALE_FACEBOOK_MESSAGE = LOCALE_FACEBOOK_MESSAGE;
		this.LOCALE_FACEBOOK_MESSAGE_SINGLE = LOCALE_FACEBOOK_MESSAGE_SINGLE;
		this.LOCALE_TWITTER_MESSAGE = LOCALE_TWITTER_MESSAGE;
		this.LOCALE_TWITTER_MESSAGE_SINGLE = LOCALE_TWITTER_MESSAGE_SINGLE;
		this.LOCALE_BUZZ_MESSAGE = LOCALE_BUZZ_MESSAGE;
		this.LOCALE_BUZZ_MESSAGE_SINGLE = LOCALE_BUZZ_MESSAGE_SINGLE;
		this.LOCALE_SHARING_IMAGE = LOCALE_SHARING_IMAGE;
		this.LOCALE_TITLE = LOCALE_TITLE;
		this.LOCALE_NOT_SUPPORTED = LOCALE_NOT_SUPPORTED;
		this.LOCALE_NOT_SUPPORTED_IE = LOCALE_NOT_SUPPORTED_IE;
		this.LOCALE_MENU_TOT = LOCALE_MENU_TOT;
		this.LOCALE_MENU_FORWARD = LOCALE_MENU_FORWARD;
		this.LOCALE_MENU_CREDITS = LOCALE_MENU_CREDITS;
		this.LOCALE_SEARCH_PLACEHOLDER = LOCALE_SEARCH_PLACEHOLDER;
		this.LOCALE_SEARCH_INVALID = LOCALE_SEARCH_INVALID;
		this.LOCALE_SEARCH_RESULTS_CHAPTERS = LOCALE_SEARCH_RESULTS_CHAPTERS;
		this.LOCALE_SEARCH_RESULTS_PAGES = LOCALE_SEARCH_RESULTS_PAGES;
		this.LOCALE_FRONT_COVER_INTRO = LOCALE_FRONT_COVER_INTRO;
		this.LOCALE_FRONT_COVER_CTA = LOCALE_FRONT_COVER_CTA;
		this.LOCALE_SHARER_LABEL1 = LOCALE_SHARER_LABEL1;
		this.LOCALE_SHARER_LABEL2 = LOCALE_SHARER_LABEL2;
		this.LOCALE_TOC_TITLE = LOCALE_TOC_TITLE;
		this.LOCALE_TOC_BACK = LOCALE_TOC_BACK;
		this.LOCALE_OVERLAY_CLOSE = LOCALE_OVERLAY_CLOSE;
		this.LOCALE_OVERLAY_PRINT_TITLE = LOCALE_OVERLAY_PRINT_TITLE;
		this.LOCALE_OVERLAY_PRINT_DESCRIPTION = LOCALE_OVERLAY_PRINT_DESCRIPTION;
		this.LOCALE_OVERLAY_PDF_TITLE = LOCALE_OVERLAY_PDF_TITLE;
		this.LOCALE_OVERLAY_PDF_DESCRIPTION = LOCALE_OVERLAY_PDF_DESCRIPTION;
		this.LOCALE_OVERLAY_RESUME_TITLE = LOCALE_OVERLAY_RESUME_TITLE;
		this.LOCALE_OVERLAY_RESUME_DESCRIPTION = LOCALE_OVERLAY_RESUME_DESCRIPTION;
		this.LOCALE_OVERLAY_RESUME_YES = LOCALE_OVERLAY_RESUME_YES;
		this.LOCALE_OVERLAY_RESUME_NO = LOCALE_OVERLAY_RESUME_NO;
		this.LOCALE_FOOTER_CURATOR = LOCALE_FOOTER_CURATOR;
		this.LOCALE_FOOTER_PRINT = LOCALE_FOOTER_PRINT;
		this.LOCALE_FOOTER_SHARE = LOCALE_FOOTER_SHARE;
		this.LOCALE_FOOTER_LIGHTS = LOCALE_FOOTER_LIGHTS;
		this.LOCALE_FOOTER_FULLSCREEN = LOCALE_FOOTER_FULLSCREEN;
		this.LOCALE_PREVIOUS_PAGE = LOCALE_PREVIOUS_PAGE;
		this.LOCALE_NEXT_PAGE = LOCALE_NEXT_PAGE;
		this.LOCALE_SELECT_LANGUAGE = LOCALE_SELECT_LANGUAGE;

		this.LOCALE_TWENTY_THINGS_LABEL = LOCALE_TWENTY_THINGS_LABEL;
		this.LOCALE_ILLUSTRATION_LABEL = LOCALE_ILLUSTRATION_LABEL;
		this.LOCALE_WRITERS_EDITORS_LABEL = LOCALE_WRITERS_EDITORS_LABEL;
		this.LOCALE_PROJECT_CURATOR_LABEL = LOCALE_PROJECT_CURATOR_LABEL;
		this.LOCALE_DESIGN_LABEL = LOCALE_DESIGN_LABEL;
		this.LOCALE_DEVELOPMENT_LABEL = LOCALE_DEVELOPMENT_LABEL;
		this.LOCALE_SPECIAL_THANKS_LABEL = LOCALE_SPECIAL_THANKS_LABEL;
		this.LOCALE_BUILT_IN_HTML5_LABEL = LOCALE_BUILT_IN_HTML5_LABEL;
		this.LOCALE_SHARE_THIS_BOOK_LABEL = LOCALE_SHARE_THIS_BOOK_LABEL;
		this.LOCALE_SHARE_ON_LABEL = LOCALE_SHARE_ON_LABEL;
		this.LOCALE_PRINT_THING_LABEL = LOCALE_PRINT_THING_LABEL;
		this.LOCALE_PAGE_LABEL = LOCALE_PAGE_LABEL;
		this.LOCALE_PAGES_LABEL = LOCALE_PAGES_LABEL;
		this.LOCALE_ORDER = LOCALE_ORDER;

		this.doNotPersist = doNotPersist;
	}

	public Locale() {
	}

	public String getLOCALE_DISPLAY_NAME() {
		return LOCALE_DISPLAY_NAME;
	}

	public void setLOCALE_DISPLAY_NAME(String LOCALE_DISPLAY_NAME) {
		this.LOCALE_DISPLAY_NAME = LOCALE_DISPLAY_NAME;
	}

	public String getLOCALE_META_DESCRIPTION() {
		return LOCALE_META_DESCRIPTION;
	}

	public void setLOCALE_META_DESCRIPTION(String LOCALE_META_DESCRIPTION) {
		this.LOCALE_META_DESCRIPTION = LOCALE_META_DESCRIPTION;
	}

	public String getLOCALE_META_KEYWORDS() {
		return LOCALE_META_KEYWORDS;
	}

	public void setLOCALE_META_KEYWORDS(String LOCALE_META_KEYWORDS) {
		this.LOCALE_META_KEYWORDS = LOCALE_META_KEYWORDS;
	}

	public String getLOCALE_META_AUTHOR() {
		return LOCALE_META_AUTHOR;
	}

	public void setLOCALE_META_AUTHOR(String LOCALE_META_AUTHOR) {
		this.LOCALE_META_AUTHOR = LOCALE_META_AUTHOR;
	}

	public String getLOCALE_FACEBOOK_MESSAGE() {
		return LOCALE_FACEBOOK_MESSAGE;
	}

	public void setLOCALE_FACEBOOK_MESSAGE(String LOCALE_FACEBOOK_MESSAGE) {
		this.LOCALE_FACEBOOK_MESSAGE = LOCALE_FACEBOOK_MESSAGE;
	}

	public String getLOCALE_FACEBOOK_MESSAGE_SINGLE() {
		return LOCALE_FACEBOOK_MESSAGE_SINGLE;
	}

	public void setLOCALE_FACEBOOK_MESSAGE_SINGLE(
			String LOCALE_FACEBOOK_MESSAGE_SINGLE) {
		this.LOCALE_FACEBOOK_MESSAGE_SINGLE = LOCALE_FACEBOOK_MESSAGE_SINGLE;
	}

	public String getLOCALE_TWITTER_MESSAGE() {
		return LOCALE_TWITTER_MESSAGE;
	}

	public void setLOCALE_TWITTER_MESSAGE(String LOCALE_TWITTER_MESSAGE) {
		this.LOCALE_TWITTER_MESSAGE = LOCALE_TWITTER_MESSAGE;
	}

	public String getLOCALE_TWITTER_MESSAGE_SINGLE() {
		return LOCALE_TWITTER_MESSAGE_SINGLE;
	}

	public void setLOCALE_TWITTER_MESSAGE_SINGLE(
			String LOCALE_TWITTER_MESSAGE_SINGLE) {
		this.LOCALE_TWITTER_MESSAGE_SINGLE = LOCALE_TWITTER_MESSAGE_SINGLE;
	}

	public String getLOCALE_BUZZ_MESSAGE() {
		return LOCALE_BUZZ_MESSAGE;
	}

	public void setLOCALE_BUZZ_MESSAGE(String LOCALE_BUZZ_MESSAGE) {
		this.LOCALE_BUZZ_MESSAGE = LOCALE_BUZZ_MESSAGE;
	}

	public String getLOCALE_BUZZ_MESSAGE_SINGLE() {
		return LOCALE_BUZZ_MESSAGE_SINGLE;
	}

	public void setLOCALE_BUZZ_MESSAGE_SINGLE(String LOCALE_BUZZ_MESSAGE_SINGLE) {
		this.LOCALE_BUZZ_MESSAGE_SINGLE = LOCALE_BUZZ_MESSAGE_SINGLE;
	}

	public String getLOCALE_SHARING_IMAGE() {
		return LOCALE_SHARING_IMAGE;
	}

	public void setLOCALE_SHARING_IMAGE(String LOCALE_SHARING_IMAGE) {
		this.LOCALE_SHARING_IMAGE = LOCALE_SHARING_IMAGE;
	}

	public String getLOCALE_TITLE() {
		return LOCALE_TITLE;
	}

	public void setLOCALE_TITLE(String LOCALE_TITLE) {
		this.LOCALE_TITLE = LOCALE_TITLE;
	}

	public String getLOCALE_NOT_SUPPORTED() {
		return LOCALE_NOT_SUPPORTED;
	}

	public void setLOCALE_NOT_SUPPORTED(String LOCALE_NOT_SUPPORTED) {
		this.LOCALE_NOT_SUPPORTED = LOCALE_NOT_SUPPORTED;
	}

	public String getLOCALE_NOT_SUPPORTED_IE() {
		return LOCALE_NOT_SUPPORTED_IE;
	}

	public void setLOCALE_NOT_SUPPORTED_IE(String LOCALE_NOT_SUPPORTED_IE) {
		this.LOCALE_NOT_SUPPORTED_IE = LOCALE_NOT_SUPPORTED_IE;
	}

	public String getLOCALE_MENU_TOT() {
		return LOCALE_MENU_TOT;
	}

	public void setLOCALE_MENU_TOT(String LOCALE_MENU_TOT) {
		this.LOCALE_MENU_TOT = LOCALE_MENU_TOT;
	}

	public String getLOCALE_MENU_FORWARD() {
		return LOCALE_MENU_FORWARD;
	}

	public void setLOCALE_MENU_FORWARD(String LOCALE_MENU_FORWARD) {
		this.LOCALE_MENU_FORWARD = LOCALE_MENU_FORWARD;
	}

	public String getLOCALE_MENU_CREDITS() {
		return LOCALE_MENU_CREDITS;
	}

	public void setLOCALE_MENU_CREDITS(String LOCALE_MENU_CREDITS) {
		this.LOCALE_MENU_CREDITS = LOCALE_MENU_CREDITS;
	}

	public String getLOCALE_SEARCH_PLACEHOLDER() {
		return LOCALE_SEARCH_PLACEHOLDER;
	}

	public void setLOCALE_SEARCH_PLACEHOLDER(String LOCALE_SEARCH_PLACEHOLDER) {
		this.LOCALE_SEARCH_PLACEHOLDER = LOCALE_SEARCH_PLACEHOLDER;
	}

	public String getLOCALE_SEARCH_INVALID() {
		return LOCALE_SEARCH_INVALID;
	}

	public void setLOCALE_SEARCH_INVALID(String LOCALE_SEARCH_INVALID) {
		this.LOCALE_SEARCH_INVALID = LOCALE_SEARCH_INVALID;
	}

	public String getLOCALE_SEARCH_RESULTS_CHAPTERS() {
		return LOCALE_SEARCH_RESULTS_CHAPTERS;
	}

	public void setLOCALE_SEARCH_RESULTS_CHAPTERS(
			String LOCALE_SEARCH_RESULTS_CHAPTERS) {
		this.LOCALE_SEARCH_RESULTS_CHAPTERS = LOCALE_SEARCH_RESULTS_CHAPTERS;
	}

	public String getLOCALE_SEARCH_RESULTS_PAGES() {
		return LOCALE_SEARCH_RESULTS_PAGES;
	}

	public void setLOCALE_SEARCH_RESULTS_PAGES(
			String LOCALE_SEARCH_RESULTS_PAGES) {
		this.LOCALE_SEARCH_RESULTS_PAGES = LOCALE_SEARCH_RESULTS_PAGES;
	}

	public String getLOCALE_FRONT_COVER_INTRO() {
		return LOCALE_FRONT_COVER_INTRO;
	}

	public void setLOCALE_FRONT_COVER_INTRO(String LOCALE_FRONT_COVER_INTRO) {
		this.LOCALE_FRONT_COVER_INTRO = LOCALE_FRONT_COVER_INTRO;
	}

	public String getLOCALE_FRONT_COVER_CTA() {
		return LOCALE_FRONT_COVER_CTA;
	}

	public void setLOCALE_FRONT_COVER_CTA(String LOCALE_FRONT_COVER_CTA) {
		this.LOCALE_FRONT_COVER_CTA = LOCALE_FRONT_COVER_CTA;
	}

	public String getLOCALE_SHARER_LABEL1() {
		return LOCALE_SHARER_LABEL1;
	}

	public void setLOCALE_SHARER_LABEL1(String LOCALE_SHARER_LABEL1) {
		this.LOCALE_SHARER_LABEL1 = LOCALE_SHARER_LABEL1;
	}

	public String getLOCALE_SHARER_LABEL2() {
		return LOCALE_SHARER_LABEL2;
	}

	public void setLOCALE_SHARER_LABEL2(String LOCALE_SHARER_LABEL2) {
		this.LOCALE_SHARER_LABEL2 = LOCALE_SHARER_LABEL2;
	}

	public String getLOCALE_TOC_TITLE() {
		return LOCALE_TOC_TITLE;
	}

	public void setLOCALE_TOC_TITLE(String LOCALE_TOC_TITLE) {
		this.LOCALE_TOC_TITLE = LOCALE_TOC_TITLE;
	}

	public String getLOCALE_TOC_BACK() {
		return LOCALE_TOC_BACK;
	}

	public void setLOCALE_TOC_BACK(String LOCALE_TOC_BACK) {
		this.LOCALE_TOC_BACK = LOCALE_TOC_BACK;
	}

	public String getLOCALE_OVERLAY_CLOSE() {
		return LOCALE_OVERLAY_CLOSE;
	}

	public void setLOCALE_OVERLAY_CLOSE(String LOCALE_OVERLAY_CLOSE) {
		this.LOCALE_OVERLAY_CLOSE = LOCALE_OVERLAY_CLOSE;
	}

	public String getLOCALE_OVERLAY_PRINT_TITLE() {
		return LOCALE_OVERLAY_PRINT_TITLE;
	}

	public void setLOCALE_OVERLAY_PRINT_TITLE(String LOCALE_OVERLAY_PRINT_TITLE) {
		this.LOCALE_OVERLAY_PRINT_TITLE = LOCALE_OVERLAY_PRINT_TITLE;
	}

	public String getLOCALE_OVERLAY_PRINT_DESCRIPTION() {
		return LOCALE_OVERLAY_PRINT_DESCRIPTION;
	}

	public void setLOCALE_OVERLAY_PRINT_DESCRIPTION(
			String LOCALE_OVERLAY_PRINT_DESCRIPTION) {
		this.LOCALE_OVERLAY_PRINT_DESCRIPTION = LOCALE_OVERLAY_PRINT_DESCRIPTION;
	}

	public String getLOCALE_OVERLAY_PDF_TITLE() {
		return LOCALE_OVERLAY_PDF_TITLE;
	}

	public void setLOCALE_OVERLAY_PDF_TITLE(String LOCALE_OVERLAY_PDF_TITLE) {
		this.LOCALE_OVERLAY_PDF_TITLE = LOCALE_OVERLAY_PDF_TITLE;
	}

	public String getLOCALE_OVERLAY_PDF_DESCRIPTION() {
		return LOCALE_OVERLAY_PDF_DESCRIPTION;
	}

	public void setLOCALE_OVERLAY_PDF_DESCRIPTION(
			String LOCALE_OVERLAY_PDF_DESCRIPTION) {
		this.LOCALE_OVERLAY_PDF_DESCRIPTION = LOCALE_OVERLAY_PDF_DESCRIPTION;
	}

	public String getLOCALE_OVERLAY_RESUME_TITLE() {
		return LOCALE_OVERLAY_RESUME_TITLE;
	}

	public void setLOCALE_OVERLAY_RESUME_TITLE(
			String LOCALE_OVERLAY_RESUME_TITLE) {
		this.LOCALE_OVERLAY_RESUME_TITLE = LOCALE_OVERLAY_RESUME_TITLE;
	}

	public String getLOCALE_OVERLAY_RESUME_DESCRIPTION() {
		return LOCALE_OVERLAY_RESUME_DESCRIPTION;
	}

	public void setLOCALE_OVERLAY_RESUME_DESCRIPTION(
			String LOCALE_OVERLAY_RESUME_DESCRIPTION) {
		this.LOCALE_OVERLAY_RESUME_DESCRIPTION = LOCALE_OVERLAY_RESUME_DESCRIPTION;
	}

	public String getLOCALE_OVERLAY_RESUME_YES() {
		return LOCALE_OVERLAY_RESUME_YES;
	}

	public void setLOCALE_OVERLAY_RESUME_YES(String LOCALE_OVERLAY_RESUME_YES) {
		this.LOCALE_OVERLAY_RESUME_YES = LOCALE_OVERLAY_RESUME_YES;
	}

	public String getLOCALE_OVERLAY_RESUME_NO() {
		return LOCALE_OVERLAY_RESUME_NO;
	}

	public void setLOCALE_OVERLAY_RESUME_NO(String LOCALE_OVERLAY_RESUME_NO) {
		this.LOCALE_OVERLAY_RESUME_NO = LOCALE_OVERLAY_RESUME_NO;
	}

	public String getLOCALE_FOOTER_CURATOR() {
		return LOCALE_FOOTER_CURATOR;
	}

	public void setLOCALE_FOOTER_CURATOR(String LOCALE_FOOTER_CURATOR) {
		this.LOCALE_FOOTER_CURATOR = LOCALE_FOOTER_CURATOR;
	}

	public String getLOCALE_FOOTER_PRINT() {
		return LOCALE_FOOTER_PRINT;
	}

	public void setLOCALE_FOOTER_PRINT(String LOCALE_FOOTER_PRINT) {
		this.LOCALE_FOOTER_PRINT = LOCALE_FOOTER_PRINT;
	}

	public String getLOCALE_FOOTER_SHARE() {
		return LOCALE_FOOTER_SHARE;
	}

	public void setLOCALE_FOOTER_SHARE(String LOCALE_FOOTER_SHARE) {
		this.LOCALE_FOOTER_SHARE = LOCALE_FOOTER_SHARE;
	}

	public String getLOCALE_FOOTER_LIGHTS() {
		return LOCALE_FOOTER_LIGHTS;
	}

	public void setLOCALE_FOOTER_LIGHTS(String LOCALE_FOOTER_LIGHTS) {
		this.LOCALE_FOOTER_LIGHTS = LOCALE_FOOTER_LIGHTS;
	}

	public String getLOCALE_FOOTER_FULLSCREEN() {
		return LOCALE_FOOTER_FULLSCREEN;
	}

	public void setLOCALE_FOOTER_FULLSCREEN(String LOCALE_FOOTER_FULLSCREEN) {
		this.LOCALE_FOOTER_FULLSCREEN = LOCALE_FOOTER_FULLSCREEN;
	}

	public String getLOCALE_PREVIOUS_PAGE() {
		return LOCALE_PREVIOUS_PAGE;
	}

	public void setLOCALE_PREVIOUS_PAGE(String LOCALE_PREVIOUS_PAGE) {
		this.LOCALE_PREVIOUS_PAGE = LOCALE_PREVIOUS_PAGE;
	}

	public String getLOCALE_NEXT_PAGE() {
		return LOCALE_NEXT_PAGE;
	}

	public void setLOCALE_NEXT_PAGE(String LOCALE_NEXT_PAGE) {
		this.LOCALE_NEXT_PAGE = LOCALE_NEXT_PAGE;
	}

	public String getLOCALE_SELECT_LANGUAGE() {
		return LOCALE_SELECT_LANGUAGE;
	}

	public void setLOCALE_SELECT_LANGUAGE(String LOCALE_SELECT_LANGUAGE) {
		this.LOCALE_SELECT_LANGUAGE = LOCALE_SELECT_LANGUAGE;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLOCALE_TWENTY_THINGS_LABEL() {
		return LOCALE_TWENTY_THINGS_LABEL;
	}

	public void setLOCALE_TWENTY_THINGS_LABEL(String LOCALE_TWENTY_THINGS_LABEL) {
		this.LOCALE_TWENTY_THINGS_LABEL = LOCALE_TWENTY_THINGS_LABEL;
	}

	public String getLOCALE_ILLUSTRATION_LABEL() {
		return LOCALE_ILLUSTRATION_LABEL;
	}

	public void setLOCALE_ILLUSTRATION_LABEL(String LOCALE_ILLUSTRATION_LABEL) {
		this.LOCALE_ILLUSTRATION_LABEL = LOCALE_ILLUSTRATION_LABEL;
	}

	public String getLOCALE_WRITERS_EDITORS_LABEL() {
		return LOCALE_WRITERS_EDITORS_LABEL;
	}

	public void setLOCALE_WRITERS_EDITORS_LABEL(
			String LOCALE_WRITERS_EDITORS_LABEL) {
		this.LOCALE_WRITERS_EDITORS_LABEL = LOCALE_WRITERS_EDITORS_LABEL;
	}

	public String getLOCALE_PROJECT_CURATOR_LABEL() {
		return LOCALE_PROJECT_CURATOR_LABEL;
	}

	public void setLOCALE_PROJECT_CURATOR_LABEL(
			String LOCALE_PROJECT_CURATOR_LABEL) {
		this.LOCALE_PROJECT_CURATOR_LABEL = LOCALE_PROJECT_CURATOR_LABEL;
	}

	public String getLOCALE_DESIGN_LABEL() {
		return LOCALE_DESIGN_LABEL;
	}

	public void setLOCALE_DESIGN_LABEL(String LOCALE_DESIGN_LABEL) {
		this.LOCALE_DESIGN_LABEL = LOCALE_DESIGN_LABEL;
	}

	public String getLOCALE_DEVELOPMENT_LABEL() {
		return LOCALE_DEVELOPMENT_LABEL;
	}

	public void setLOCALE_DEVELOPMENT_LABEL(String LOCALE_DEVELOPMENT_LABEL) {
		this.LOCALE_DEVELOPMENT_LABEL = LOCALE_DEVELOPMENT_LABEL;
	}

	public String getLOCALE_SPECIAL_THANKS_LABEL() {
		return LOCALE_SPECIAL_THANKS_LABEL;
	}

	public void setLOCALE_SPECIAL_THANKS_LABEL(
			String LOCALE_SPECIAL_THANKS_LABEL) {
		this.LOCALE_SPECIAL_THANKS_LABEL = LOCALE_SPECIAL_THANKS_LABEL;
	}

	public String getLOCALE_BUILT_IN_HTML5_LABEL() {
		return LOCALE_BUILT_IN_HTML5_LABEL;
	}

	public void setLOCALE_BUILT_IN_HTML5_LABEL(
			String LOCALE_BUILT_IN_HTML5_LABEL) {
		this.LOCALE_BUILT_IN_HTML5_LABEL = LOCALE_BUILT_IN_HTML5_LABEL;
	}

	public String getLOCALE_SHARE_THIS_BOOK_LABEL() {
		return LOCALE_SHARE_THIS_BOOK_LABEL;
	}

	public void setLOCALE_SHARE_THIS_BOOK_LABEL(
			String LOCALE_SHARE_THIS_BOOK_LABEL) {
		this.LOCALE_SHARE_THIS_BOOK_LABEL = LOCALE_SHARE_THIS_BOOK_LABEL;
	}

	public String getLOCALE_SHARE_ON_LABEL() {
		return LOCALE_SHARE_ON_LABEL;
	}

	public void setLOCALE_SHARE_ON_LABEL(String LOCALE_SHARE_ON_LABEL) {
		this.LOCALE_SHARE_ON_LABEL = LOCALE_SHARE_ON_LABEL;
	}

	public String getLOCALE_PRINT_THING_LABEL() {
		return LOCALE_PRINT_THING_LABEL;
	}

	public void setLOCALE_PRINT_THING_LABEL(String LOCALE_PRINT_THING_LABEL) {
		this.LOCALE_PRINT_THING_LABEL = LOCALE_PRINT_THING_LABEL;
	}

	public String getLOCALE_PAGE_LABEL() {
		return LOCALE_PAGE_LABEL;
	}

	public void setLOCALE_PAGE_LABEL(String LOCALE_PAGE_LABEL) {
		this.LOCALE_PAGE_LABEL = LOCALE_PAGE_LABEL;
	}

	public String getLOCALE_PAGES_LABEL() {
		return LOCALE_PAGES_LABEL;
	}

	public void setLOCALE_PAGES_LABEL(String LOCALE_PAGES_LABEL) {
		this.LOCALE_PAGES_LABEL = LOCALE_PAGES_LABEL;
	}

	public String getLOCALE_ORDER() {
		return LOCALE_ORDER;
	}

	public void setLOCALE_ORDER(String LOCALE_ORDER) {
		this.LOCALE_ORDER = LOCALE_ORDER;
	}
}
