/*
 * Copyright 2024-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cloud.ai.toolcalling.crawler;

import com.alibaba.cloud.ai.toolcalling.common.CommonToolCallProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Arrays;

/**
 * @author yuluo
 */
@EnableConfigurationProperties
@ConfigurationProperties(prefix = CrawlerFirecrawlProperties.FIRECRAWL_PROPERTIES_PREFIX)
public class CrawlerFirecrawlProperties extends CommonToolCallProperties {

	public static final String FIRECRAWL_PROPERTIES_PREFIX = CrawlerConstants.CONFIG_PREFIX + "firecrawl";

	private String mode = CrawlerConstants.FirecrawlMode.SCRAPE;

	private String[] formats = new String[] { CrawlerConstants.FirecrawlFormats.MARKDOWN };

	private Boolean removeBase64Images;

	private Boolean skipTlsVerification;

	private Boolean mobile;

	private Integer waitFor;

	private Boolean onlyMainContent;

	private String[] includeTags;

	private String[] excludeTags;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String[] getFormats() {
		return formats;
	}

	public void setFormats(String[] formats) {
		this.formats = formats;
	}

	public Boolean getRemoveBase64Images() {
		return removeBase64Images;
	}

	public void setRemoveBase64Images(Boolean removeBase64Images) {
		this.removeBase64Images = removeBase64Images;
	}

	public Boolean getSkipTlsVerification() {
		return skipTlsVerification;
	}

	public void setSkipTlsVerification(Boolean skipTlsVerification) {
		this.skipTlsVerification = skipTlsVerification;
	}

	public Boolean getMobile() {
		return mobile;
	}

	public void setMobile(Boolean mobile) {
		this.mobile = mobile;
	}

	public Integer getWaitFor() {
		return waitFor;
	}

	public void setWaitFor(Integer waitFor) {
		this.waitFor = waitFor;
	}

	public Boolean getOnlyMainContent() {
		return onlyMainContent;
	}

	public void setOnlyMainContent(Boolean onlyMainContent) {
		this.onlyMainContent = onlyMainContent;
	}

	public String[] getIncludeTags() {
		return includeTags;
	}

	public void setIncludeTags(String[] includeTags) {
		this.includeTags = includeTags;
	}

	public String[] getExcludeTags() {
		return excludeTags;
	}

	public void setExcludeTags(String[] excludeTags) {
		this.excludeTags = excludeTags;
	}

	@Override
	public String toString() {

		return "CrawlerFirecrawlProperties{" + "token='" + super.getToken() + '\'' + ", enabled=" + super.isEnabled()
				+ ", removeBase64Images=" + removeBase64Images + ", skipTlsVerification=" + skipTlsVerification
				+ ", mobile=" + mobile + ", waitFor=" + waitFor + ", formats=" + formats + ", onlyMainContent="
				+ onlyMainContent + ", includeTags=" + Arrays.toString(includeTags) + ", excludeTags="
				+ Arrays.toString(excludeTags) + '}';
	}

}
