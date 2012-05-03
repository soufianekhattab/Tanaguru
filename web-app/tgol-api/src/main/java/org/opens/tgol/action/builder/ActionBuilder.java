/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2012  Open-S Company
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tgol.action.builder;

import org.opens.tgol.action.Action;

/**
 *
 * @author jkowalczyk
 */
public interface ActionBuilder {
    
    /**
     * 
     * @return
     *      a set instance of action
     */
    Action build();
    
    /**
     *
     * @return
     *      the contract action code
     */
    String getActionCode();

    /**
     *
     * @param contractActionCode
     */
    void setActionCode(String contractActionCode);

    /**
     *
     * @return
     *      the contract I18n code
     */
    String getActionI81NCode();

    /**
     *
     * @param ationI81NCode
     */

    void setActionI81NCode(String actionI81NCode);
    /**
     *
     * @return
     *      the action title I18n code
     */
    String getActionAltI81NCode();

    /**
     *
     * @param contractActionI81NCode
     */
    void setActionAltI81NCode(String actionTitleI81NCode);

    /**
     *
     * @return
     *      the Url called when the action is selected
     */
    String getActionUrl();

    /**
     * 
     * @param contractActionUrl
     */
    void setActionUrl(String contractActionUrl);

    /**
     *
     * @return
     *      the Url called when the action is selected
     */
    String getEnabledActionImageUrl();

    /**
     *
     * @param contractActionUrl
     */
    void setEnabledActionImageUrl(String contractActionImageUrl);
    
    /**
     *
     * @return
     *      the Url called when the action is selected
     */
    String getDisabledActionImageUrl();

    /**
     *
     * @param contractActionUrl
     */
    void setDisabledActionImageUrl(String contractActionImageUrl);

    /**
     *
     * @return
     */
    String getCssSelector();

    /**
     * 
     * @param cssSelector
     */
    void setCssSelector(String cssSelector);
    
}